package p343rc;

import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: rc.t */
/* compiled from: Deadline */
public final class C12392t implements Comparable<C12392t> {

    /* renamed from: d */
    private static final C12394b f45732d = new C12394b();

    /* renamed from: e */
    private static final long f45733e;

    /* renamed from: f */
    private static final long f45734f;

    /* renamed from: g */
    private static final long f45735g = TimeUnit.SECONDS.toNanos(1);

    /* renamed from: a */
    private final C12395c f45736a;

    /* renamed from: b */
    private final long f45737b;

    /* renamed from: c */
    private volatile boolean f45738c;

    /* renamed from: rc.t$b */
    /* compiled from: Deadline */
    private static class C12394b extends C12395c {
        private C12394b() {
        }

        /* renamed from: a */
        public long mo37135a() {
            return System.nanoTime();
        }
    }

    /* renamed from: rc.t$c */
    /* compiled from: Deadline */
    public static abstract class C12395c {
        /* renamed from: a */
        public abstract long mo37135a();
    }

    static {
        long nanos = TimeUnit.DAYS.toNanos(36500);
        f45733e = nanos;
        f45734f = -nanos;
    }

    private C12392t(C12395c cVar, long j, boolean z) {
        this(cVar, cVar.mo37135a(), j, z);
    }

    /* renamed from: a */
    public static C12392t m59265a(long j, TimeUnit timeUnit) {
        return m59266b(j, timeUnit, f45732d);
    }

    /* renamed from: b */
    public static C12392t m59266b(long j, TimeUnit timeUnit, C12395c cVar) {
        m59267c(timeUnit, "units");
        return new C12392t(cVar, timeUnit.toNanos(j), true);
    }

    /* renamed from: c */
    private static <T> T m59267c(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: j */
    private void m59268j(C12392t tVar) {
        if (this.f45736a != tVar.f45736a) {
            throw new AssertionError("Tickers (" + this.f45736a + " and " + tVar.f45736a + ") don't match. Custom Ticker should only be used in tests!");
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C12392t)) {
            return false;
        }
        C12392t tVar = (C12392t) obj;
        C12395c cVar = this.f45736a;
        if (cVar != null ? cVar == tVar.f45736a : tVar.f45736a == null) {
            return this.f45737b == tVar.f45737b;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.asList(new Object[]{this.f45736a, Long.valueOf(this.f45737b)}).hashCode();
    }

    /* renamed from: k */
    public int compareTo(C12392t tVar) {
        m59268j(tVar);
        int i = ((this.f45737b - tVar.f45737b) > 0 ? 1 : ((this.f45737b - tVar.f45737b) == 0 ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        return i > 0 ? 1 : 0;
    }

    /* renamed from: n */
    public boolean mo37130n(C12392t tVar) {
        m59268j(tVar);
        return this.f45737b - tVar.f45737b < 0;
    }

    /* renamed from: o */
    public boolean mo37131o() {
        if (!this.f45738c) {
            if (this.f45737b - this.f45736a.mo37135a() > 0) {
                return false;
            }
            this.f45738c = true;
        }
        return true;
    }

    /* renamed from: p */
    public C12392t mo37132p(C12392t tVar) {
        m59268j(tVar);
        return mo37130n(tVar) ? this : tVar;
    }

    /* renamed from: q */
    public long mo37133q(TimeUnit timeUnit) {
        long a = this.f45736a.mo37135a();
        if (!this.f45738c && this.f45737b - a <= 0) {
            this.f45738c = true;
        }
        return timeUnit.convert(this.f45737b - a, TimeUnit.NANOSECONDS);
    }

    public String toString() {
        long q = mo37133q(TimeUnit.NANOSECONDS);
        long abs = Math.abs(q);
        long j = f45735g;
        long j2 = abs / j;
        long abs2 = Math.abs(q) % j;
        StringBuilder sb = new StringBuilder();
        if (q < 0) {
            sb.append('-');
        }
        sb.append(j2);
        if (abs2 > 0) {
            sb.append(String.format(Locale.US, ".%09d", new Object[]{Long.valueOf(abs2)}));
        }
        sb.append("s from now");
        if (this.f45736a != f45732d) {
            sb.append(" (ticker=" + this.f45736a + ")");
        }
        return sb.toString();
    }

    private C12392t(C12395c cVar, long j, long j2, boolean z) {
        this.f45736a = cVar;
        long min = Math.min(f45733e, Math.max(f45734f, j2));
        this.f45737b = j + min;
        this.f45738c = z && min <= 0;
    }
}
