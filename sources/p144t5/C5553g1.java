package p144t5;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: t5.g1 */
/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
public final class C5553g1 {

    /* renamed from: a */
    public static final Handler f28092a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    public static final Executor f28093b = new C5549f1("Google consent worker");

    /* renamed from: a */
    public static void m33607a() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Method must be call on main thread.");
        }
    }
}
