package org.maplibre.nativeffi.consumer;

import java.util.concurrent.TimeUnit;
import org.maplibre.nativeffi.*;

/** Runs only in a child JVM so live graphics survive until JVM shutdown. */
public final class ExitProbe {
  private static Object[] live;

  public static void main(String[] args) throws Exception {
    var runtime = RuntimeHandle.create(new RuntimeOptions());
    runtime.setEventHandler(new RuntimeEventHandler(events -> {})).get(10, TimeUnit.SECONDS);
    var created = runtime.createMap(new MapOptions(new LogicalExtent(16, 16, 1)));
    created.ready().get(10, TimeUnit.SECONDS);
    var graphics = new TestGraphics();
    var attached =
        graphics.attach(
            created.handle(),
            new LogicalExtent(16, 16, 1),
            new RenderSessionAttachOptions(RenderDriverKind.CORE_WORKER)
                .withFrameWake(new Wake(() -> {})));
    attached.ready().get(10, TimeUnit.SECONDS);
    live = new Object[] {runtime, created.handle(), graphics, attached.handle()};
    System.out.println("live graphics ready");
  }
}
