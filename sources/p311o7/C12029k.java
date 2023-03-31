package p311o7;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: o7.k */
/* compiled from: UiExecutor */
public enum C12029k implements Executor {
    INSTANCE;
    

    /* renamed from: b */
    private static final Handler f45008b = null;

    static {
        f45008b = new Handler(Looper.getMainLooper());
    }

    public void execute(Runnable runnable) {
        f45008b.post(runnable);
    }
}
