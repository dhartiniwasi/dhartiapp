package p312o8;

import com.google.firebase.installations.C8008i;
import java.util.concurrent.TimeUnit;

/* renamed from: o8.e */
/* compiled from: RequestLimiter */
class C12040e {

    /* renamed from: d */
    private static final long f45034d = TimeUnit.HOURS.toMillis(24);

    /* renamed from: e */
    private static final long f45035e = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a */
    private final C8008i f45036a = C8008i.m44078c();

    /* renamed from: b */
    private long f45037b;

    /* renamed from: c */
    private int f45038c;

    C12040e() {
    }

    /* renamed from: a */
    private synchronized long m57978a(int i) {
        if (!m57979c(i)) {
            return f45034d;
        }
        return (long) Math.min(Math.pow(2.0d, (double) this.f45038c) + ((double) this.f45036a.mo26572e()), (double) f45035e);
    }

    /* renamed from: c */
    private static boolean m57979c(int i) {
        return i == 429 || (i >= 500 && i < 600);
    }

    /* renamed from: d */
    private static boolean m57980d(int i) {
        return (i >= 200 && i < 300) || i == 401 || i == 404;
    }

    /* renamed from: e */
    private synchronized void m57981e() {
        this.f45038c = 0;
    }

    /* renamed from: b */
    public synchronized boolean mo36414b() {
        return this.f45038c == 0 || this.f45036a.mo26570a() > this.f45037b;
    }

    /* renamed from: f */
    public synchronized void mo36415f(int i) {
        if (m57980d(i)) {
            m57981e();
            return;
        }
        this.f45038c++;
        this.f45037b = this.f45036a.mo26570a() + m57978a(i);
    }
}
