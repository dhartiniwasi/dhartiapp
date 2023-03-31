package p017b5;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: b5.q */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final /* synthetic */ class C1817q implements Executor {

    /* renamed from: a */
    public final /* synthetic */ Handler f5360a;

    public /* synthetic */ C1817q(Handler handler) {
        this.f5360a = handler;
    }

    public final void execute(Runnable runnable) {
        this.f5360a.post(runnable);
    }
}
