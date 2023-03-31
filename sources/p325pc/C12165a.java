package p325pc;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;

/* renamed from: pc.a */
/* compiled from: HandlerCompat */
public final class C12165a {
    /* renamed from: a */
    public static Handler m58436a(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Handler.createAsync(looper);
        }
        return new Handler(looper);
    }
}
