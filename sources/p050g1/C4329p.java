package p050g1;

import androidx.work.C1536b;
import java.util.List;
import p089m.C4960a;
import p170y0.C6082a;
import p170y0.C6083b;
import p170y0.C6094j;
import p170y0.C6105n;
import p170y0.C6110s;

/* renamed from: g1.p */
/* compiled from: WorkSpec */
public final class C4329p {

    /* renamed from: s */
    private static final String f24213s = C6094j.m35719f("WorkSpec");

    /* renamed from: t */
    public static final C4960a<List<Object>, List<Object>> f24214t = new C4330a();

    /* renamed from: a */
    public String f24215a;

    /* renamed from: b */
    public C6110s f24216b = C6110s.ENQUEUED;

    /* renamed from: c */
    public String f24217c;

    /* renamed from: d */
    public String f24218d;

    /* renamed from: e */
    public C1536b f24219e;

    /* renamed from: f */
    public C1536b f24220f;

    /* renamed from: g */
    public long f24221g;

    /* renamed from: h */
    public long f24222h;

    /* renamed from: i */
    public long f24223i;

    /* renamed from: j */
    public C6083b f24224j;

    /* renamed from: k */
    public int f24225k;

    /* renamed from: l */
    public C6082a f24226l;

    /* renamed from: m */
    public long f24227m;

    /* renamed from: n */
    public long f24228n;

    /* renamed from: o */
    public long f24229o;

    /* renamed from: p */
    public long f24230p;

    /* renamed from: q */
    public boolean f24231q;

    /* renamed from: r */
    public C6105n f24232r;

    /* renamed from: g1.p$a */
    /* compiled from: WorkSpec */
    class C4330a implements C4960a<List<Object>, List<Object>> {
        C4330a() {
        }
    }

    /* renamed from: g1.p$b */
    /* compiled from: WorkSpec */
    public static class C4331b {

        /* renamed from: a */
        public String f24233a;

        /* renamed from: b */
        public C6110s f24234b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C4331b)) {
                return false;
            }
            C4331b bVar = (C4331b) obj;
            if (this.f24234b != bVar.f24234b) {
                return false;
            }
            return this.f24233a.equals(bVar.f24233a);
        }

        public int hashCode() {
            return (this.f24233a.hashCode() * 31) + this.f24234b.hashCode();
        }
    }

    public C4329p(String str, String str2) {
        C1536b bVar = C1536b.f4423c;
        this.f24219e = bVar;
        this.f24220f = bVar;
        this.f24224j = C6083b.f29454i;
        this.f24226l = C6082a.EXPONENTIAL;
        this.f24227m = 30000;
        this.f24230p = -1;
        this.f24232r = C6105n.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.f24215a = str;
        this.f24217c = str2;
    }

    /* renamed from: a */
    public long mo17743a() {
        long j;
        boolean z = false;
        if (mo17745c()) {
            if (this.f24226l == C6082a.LINEAR) {
                z = true;
            }
            if (z) {
                j = this.f24227m * ((long) this.f24225k);
            } else {
                j = (long) Math.scalb((float) this.f24227m, this.f24225k - 1);
            }
            return this.f24228n + Math.min(18000000, j);
        }
        long j2 = 0;
        if (mo17746d()) {
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = this.f24228n;
            long j4 = j3 == 0 ? currentTimeMillis + this.f24221g : j3;
            long j5 = this.f24223i;
            long j6 = this.f24222h;
            if (j5 != j6) {
                z = true;
            }
            if (z) {
                if (j3 == 0) {
                    j2 = j5 * -1;
                }
                return j4 + j6 + j2;
            }
            if (j3 != 0) {
                j2 = j6;
            }
            return j4 + j2;
        }
        long j7 = this.f24228n;
        if (j7 == 0) {
            j7 = System.currentTimeMillis();
        }
        return j7 + this.f24221g;
    }

    /* renamed from: b */
    public boolean mo17744b() {
        return !C6083b.f29454i.equals(this.f24224j);
    }

    /* renamed from: c */
    public boolean mo17745c() {
        return this.f24216b == C6110s.ENQUEUED && this.f24225k > 0;
    }

    /* renamed from: d */
    public boolean mo17746d() {
        return this.f24222h != 0;
    }

    /* renamed from: e */
    public void mo17747e(long j) {
        if (j > 18000000) {
            C6094j.m35717c().mo20925h(f24213s, "Backoff delay duration exceeds maximum value", new Throwable[0]);
            j = 18000000;
        }
        if (j < 10000) {
            C6094j.m35717c().mo20925h(f24213s, "Backoff delay duration less than minimum value", new Throwable[0]);
            j = 10000;
        }
        this.f24227m = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4329p.class != obj.getClass()) {
            return false;
        }
        C4329p pVar = (C4329p) obj;
        if (this.f24221g != pVar.f24221g || this.f24222h != pVar.f24222h || this.f24223i != pVar.f24223i || this.f24225k != pVar.f24225k || this.f24227m != pVar.f24227m || this.f24228n != pVar.f24228n || this.f24229o != pVar.f24229o || this.f24230p != pVar.f24230p || this.f24231q != pVar.f24231q || !this.f24215a.equals(pVar.f24215a) || this.f24216b != pVar.f24216b || !this.f24217c.equals(pVar.f24217c)) {
            return false;
        }
        String str = this.f24218d;
        if (str == null ? pVar.f24218d != null : !str.equals(pVar.f24218d)) {
            return false;
        }
        if (this.f24219e.equals(pVar.f24219e) && this.f24220f.equals(pVar.f24220f) && this.f24224j.equals(pVar.f24224j) && this.f24226l == pVar.f24226l && this.f24232r == pVar.f24232r) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((((this.f24215a.hashCode() * 31) + this.f24216b.hashCode()) * 31) + this.f24217c.hashCode()) * 31;
        String str = this.f24218d;
        int hashCode2 = str != null ? str.hashCode() : 0;
        long j = this.f24221g;
        long j2 = this.f24222h;
        long j3 = this.f24223i;
        long j4 = this.f24227m;
        long j5 = this.f24228n;
        long j6 = this.f24229o;
        long j7 = this.f24230p;
        return ((((((((((((((((((((((((((((hashCode + hashCode2) * 31) + this.f24219e.hashCode()) * 31) + this.f24220f.hashCode()) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + this.f24224j.hashCode()) * 31) + this.f24225k) * 31) + this.f24226l.hashCode()) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 31) + (this.f24231q ? 1 : 0)) * 31) + this.f24232r.hashCode();
    }

    public String toString() {
        return "{WorkSpec: " + this.f24215a + "}";
    }

    public C4329p(C4329p pVar) {
        C1536b bVar = C1536b.f4423c;
        this.f24219e = bVar;
        this.f24220f = bVar;
        this.f24224j = C6083b.f29454i;
        this.f24226l = C6082a.EXPONENTIAL;
        this.f24227m = 30000;
        this.f24230p = -1;
        this.f24232r = C6105n.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.f24215a = pVar.f24215a;
        this.f24217c = pVar.f24217c;
        this.f24216b = pVar.f24216b;
        this.f24218d = pVar.f24218d;
        this.f24219e = new C1536b(pVar.f24219e);
        this.f24220f = new C1536b(pVar.f24220f);
        this.f24221g = pVar.f24221g;
        this.f24222h = pVar.f24222h;
        this.f24223i = pVar.f24223i;
        this.f24224j = new C6083b(pVar.f24224j);
        this.f24225k = pVar.f24225k;
        this.f24226l = pVar.f24226l;
        this.f24227m = pVar.f24227m;
        this.f24228n = pVar.f24228n;
        this.f24229o = pVar.f24229o;
        this.f24230p = pVar.f24230p;
        this.f24231q = pVar.f24231q;
        this.f24232r = pVar.f24232r;
    }
}
