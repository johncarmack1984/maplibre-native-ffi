// The glyphs that the renderers of one runtime parse. Nothing public shows
// whether two maps share a parsed glyph, so the case reads the runtime's cache.

#include <cstdint>
#include <string>

#include <mln/text/glyph_cache.hpp>

#include "maplibre_native_c.h"
#include "runtime/runtime.hpp"
#include "support/map.h"
#include "support/resources.h"
#include "support/test_support.h"

namespace {

// Appends a length-delimited field. Every length here is under 128, so it
// takes one varint byte.
void append_field(std::string& out, char tag, const std::string& bytes) {
  out += tag;
  out += static_cast<char>(bytes.size());
  out += bytes;
}

// A glyph range with one 1x1 glyph for "A", whose bitmap carries the 3-pixel
// border on each side.
auto glyph_range_pbf() -> std::string {
  std::string glyph = {0x08, 'A'};
  append_field(glyph, 0x12, std::string(7 * 7, '\x7f'));
  glyph += {0x18, 1, 0x20, 1, 0x28, 0, 0x30, 0, 0x38, 1};
  std::string fontstack;
  append_field(fontstack, 0x0a, "Font");
  append_field(fontstack, 0x12, "0-255");
  append_field(fontstack, 0x1a, glyph);
  std::string pbf;
  append_field(pbf, 0x0a, fontstack);
  return pbf;
}

auto symbol_style(const char* font) -> std::string {
  return std::string(
           "{\"version\":8,"
           "\"glyphs\":\"test://fonts/{fontstack}/{range}.pbf\","
           "\"sources\":{\"points\":{\"type\":\"geojson\",\"data\":"
           "{\"type\":\"Feature\",\"geometry\":{\"type\":\"Point\","
           "\"coordinates\":[0,0]},\"properties\":{}}}},"
           "\"layers\":[{\"id\":\"label\",\"type\":\"symbol\","
           "\"source\":\"points\",\"layout\":{\"text-field\":\"A\","
           "\"text-font\":[\""
         ) +
         font + "\"]}}]}";
}

struct StaticMap {
  mln_map map = MLN_HANDLE_NULL;
  mln_test_render_fixture fixture{};
};

void render_static_map(
  mln_runtime runtime, const std::string& style, StaticMap& out
) {
  auto options = mln_test_map_options();
  options.initial_extent =
    mln_logical_extent{.width = 64, .height = 64, .scale_factor = 1.0};
  options.map_mode = MLN_MAP_MODE_STATIC;
  out.map = mln_test_create_map_with_options(runtime, &options);
  mln_test_load_style_and_wait(
    out.map, mln_buffer_view{style.data(), style.size()}
  );
  TEST_ASSERT_TRUE(mln_test_render_fixture_create(out.map, &out.fixture));
  MLN_TEST_OK(mln_test_render_still_image(&out.fixture, out.map));
}

// Two maps whose font stacks serve the same glyph keep it once. It outlives
// the map that parsed it first, because the other map's renderer holds it.
void maps_of_a_runtime_share_parsed_glyphs() {
  // Static, because a failing case leaves the provider running.
  static const std::string pbf = glyph_range_pbf();
  static const auto response = mln_resource_response{
    .status = MLN_RESOURCE_RESPONSE_STATUS_OK,
    .bytes = reinterpret_cast<const std::uint8_t*>(pbf.data()),
    .byte_count = pbf.size(),
  };
  static const mln_test_provided_resource resources[] = {
    {.url = "test://fonts/First/0-255.pbf", .response = response},
    {.url = "test://fonts/Second/0-255.pbf", .response = response},
  };
  const auto runtime = mln_test_create_runtime();
  auto* provider = mln_test_provider_create(resources, 2);
  mln_test_provider_install(runtime, provider);
  auto& cache = *mln::core::lease_runtime(runtime)->glyph_cache;

  auto first = StaticMap{};
  render_static_map(runtime, symbol_style("First"), first);
  TEST_ASSERT_EQUAL_size_t(1, cache.size());
  auto second = StaticMap{};
  render_static_map(runtime, symbol_style("Second"), second);
  TEST_ASSERT_EQUAL_size_t(1, cache.size());
  mln_test_render_fixture_destroy(&first.fixture);
  mln_test_destroy_map(first.map);
  TEST_ASSERT_EQUAL_size_t(1, cache.size());

  mln_test_render_fixture_destroy(&second.fixture);
  mln_test_destroy_map(second.map);
  mln_test_destroy_runtime(runtime);
  mln_test_provider_destroy(provider);
}

}  // namespace

MLN_TEST_GROUP { RUN_TEST(maps_of_a_runtime_share_parsed_glyphs); }
