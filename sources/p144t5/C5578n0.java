package p144t5;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: t5.n0 */
/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
public final /* synthetic */ class C5578n0 implements Executor {

    /* renamed from: a */
    public final /* synthetic */ Handler f28167a;

    public /* synthetic */ C5578n0(Handler handler) {
        this.f28167a = handler;
    }

    public final void execute(Runnable runnable) {
        this.f28167a.post(runnable);
    }
}
