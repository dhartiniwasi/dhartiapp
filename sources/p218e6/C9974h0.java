package p218e6;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import p384w5.C12907a;

/* renamed from: e6.h0 */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
final class C9974h0 implements Executor {

    /* renamed from: a */
    private final Handler f39907a = new C12907a(Looper.getMainLooper());

    public final void execute(Runnable runnable) {
        this.f39907a.post(runnable);
    }
}
