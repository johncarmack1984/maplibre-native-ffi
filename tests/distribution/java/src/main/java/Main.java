import org.maplibre.nativeffi.*;

public final class Main {
  public static void main(String[] args) throws Exception {
    NativeLibrary.load();
    try (var runtime = RuntimeHandle.create(new RuntimeOptions())) {
      var created = runtime.createMap(new MapOptions(new LogicalExtent(64, 64, 1)));
      try (var map = created.handle()) {
        created.ready().get();
        map.setStyleJson("{\"version\":8,\"sources\":{},\"layers\":[]}").get();
        System.out.println(map.getCamera().get());
        map.release().get();
      }
      runtime.release().get();
    }
  }
}
