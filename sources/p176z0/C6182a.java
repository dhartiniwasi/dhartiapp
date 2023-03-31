package p176z0;

import android.os.Handler;
import android.os.Looper;
import androidx.core.p010os.C0770h;
import p170y0.C6108q;

/* renamed from: z0.a */
/* compiled from: DefaultRunnableScheduler */
public class C6182a implements C6108q {

    /* renamed from: a */
    private final Handler f29673a = C0770h.m3522a(Looper.getMainLooper());

    /* renamed from: a */
    public void mo20934a(long j, Runnable runnable) {
        this.f29673a.postDelayed(runnable, j);
    }

    /* renamed from: b */
    public void mo20935b(Runnable runnable) {
        this.f29673a.removeCallbacks(runnable);
    }
}
