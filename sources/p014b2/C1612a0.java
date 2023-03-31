package p014b2;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: b2.a0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1612a0 implements Executor {

    /* renamed from: a */
    public final /* synthetic */ Handler f4617a;

    public /* synthetic */ C1612a0(Handler handler) {
        this.f4617a = handler;
    }

    public final void execute(Runnable runnable) {
        this.f4617a.post(runnable);
    }
}
