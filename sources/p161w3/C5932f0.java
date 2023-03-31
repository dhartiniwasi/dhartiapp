package p161w3;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* renamed from: w3.f0 */
/* compiled from: SystemClock */
public class C5932f0 implements C5923d {
    protected C5932f0() {
    }

    /* renamed from: a */
    public long mo20585a() {
        return SystemClock.uptimeMillis();
    }

    /* renamed from: b */
    public long mo20586b() {
        return SystemClock.elapsedRealtime();
    }

    /* renamed from: c */
    public C5954n mo20587c(Looper looper, Handler.Callback callback) {
        return new C5934g0(new Handler(looper, callback));
    }

    /* renamed from: d */
    public void mo20588d() {
    }
}
