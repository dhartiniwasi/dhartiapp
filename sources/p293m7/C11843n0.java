package p293m7;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.p026firebaseauthapi.C3434jb;
import java.util.concurrent.Executor;

/* renamed from: m7.n0 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C11843n0 implements Executor {

    /* renamed from: b */
    private static final C11843n0 f44551b = new C11843n0();

    /* renamed from: a */
    private final Handler f44552a = new C3434jb(Looper.getMainLooper());

    private C11843n0() {
    }

    /* renamed from: b */
    public static C11843n0 m57305b() {
        return f44551b;
    }

    public final void execute(Runnable runnable) {
        this.f44552a.post(runnable);
    }
}
