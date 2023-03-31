package androidx.core.p010os;

import android.os.Handler;
import androidx.core.util.C0831h;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: androidx.core.os.g */
/* compiled from: ExecutorCompat */
public final class C0768g {

    /* renamed from: androidx.core.os.g$a */
    /* compiled from: ExecutorCompat */
    private static class C0769a implements Executor {

        /* renamed from: a */
        private final Handler f2330a;

        C0769a(Handler handler) {
            this.f2330a = (Handler) C0831h.m3662f(handler);
        }

        public void execute(Runnable runnable) {
            if (!this.f2330a.post((Runnable) C0831h.m3662f(runnable))) {
                throw new RejectedExecutionException(this.f2330a + " is shutting down");
            }
        }
    }

    /* renamed from: a */
    public static Executor m3521a(Handler handler) {
        return new C0769a(handler);
    }
}
