package p073j4;

import android.graphics.Bitmap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: j4.y0 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C4826y0 {

    /* renamed from: a */
    final Map f25565a = new ConcurrentHashMap();

    /* renamed from: b */
    private final AtomicInteger f25566b = new AtomicInteger(0);

    /* renamed from: a */
    public final Bitmap mo18570a(Integer num) {
        return (Bitmap) this.f25565a.get(num);
    }
}
