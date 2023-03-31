package p177z1;

import android.os.SystemClock;
import p161w3.C5917a;
import p161w3.C5953m0;
import p177z1.C6300z1;
import p219e7.C10001f;

/* renamed from: z1.j */
/* compiled from: DefaultLivePlaybackSpeedControl */
public final class C6230j implements C6292w1 {

    /* renamed from: a */
    private final float f29985a;

    /* renamed from: b */
    private final float f29986b;

    /* renamed from: c */
    private final long f29987c;

    /* renamed from: d */
    private final float f29988d;

    /* renamed from: e */
    private final long f29989e;

    /* renamed from: f */
    private final long f29990f;

    /* renamed from: g */
    private final float f29991g;

    /* renamed from: h */
    private long f29992h;

    /* renamed from: i */
    private long f29993i;

    /* renamed from: j */
    private long f29994j;

    /* renamed from: k */
    private long f29995k;

    /* renamed from: l */
    private long f29996l;

    /* renamed from: m */
    private long f29997m;

    /* renamed from: n */
    private float f29998n;

    /* renamed from: o */
    private float f29999o;

    /* renamed from: p */
    private float f30000p;

    /* renamed from: q */
    private long f30001q;

    /* renamed from: r */
    private long f30002r;

    /* renamed from: s */
    private long f30003s;

    /* renamed from: z1.j$b */
    /* compiled from: DefaultLivePlaybackSpeedControl */
    public static final class C6232b {

        /* renamed from: a */
        private float f30004a = 0.97f;

        /* renamed from: b */
        private float f30005b = 1.03f;

        /* renamed from: c */
        private long f30006c = 1000;

        /* renamed from: d */
        private float f30007d = 1.0E-7f;

        /* renamed from: e */
        private long f30008e = C5953m0.m35071B0(20);

        /* renamed from: f */
        private long f30009f = C5953m0.m35071B0(500);

        /* renamed from: g */
        private float f30010g = 0.999f;

        /* renamed from: a */
        public C6230j mo21350a() {
            return new C6230j(this.f30004a, this.f30005b, this.f30006c, this.f30007d, this.f30008e, this.f30009f, this.f30010g);
        }

        /* renamed from: b */
        public C6232b mo21351b(float f) {
            C5917a.m34868a(f >= 1.0f);
            this.f30005b = f;
            return this;
        }

        /* renamed from: c */
        public C6232b mo21352c(float f) {
            C5917a.m34868a(0.0f < f && f <= 1.0f);
            this.f30004a = f;
            return this;
        }

        /* renamed from: d */
        public C6232b mo21353d(long j) {
            C5917a.m34868a(j > 0);
            this.f30008e = C5953m0.m35071B0(j);
            return this;
        }

        /* renamed from: e */
        public C6232b mo21354e(float f) {
            C5917a.m34868a(f >= 0.0f && f < 1.0f);
            this.f30010g = f;
            return this;
        }

        /* renamed from: f */
        public C6232b mo21355f(long j) {
            C5917a.m34868a(j > 0);
            this.f30006c = j;
            return this;
        }

        /* renamed from: g */
        public C6232b mo21356g(float f) {
            C5917a.m34868a(f > 0.0f);
            this.f30007d = f / 1000000.0f;
            return this;
        }

        /* renamed from: h */
        public C6232b mo21357h(long j) {
            C5917a.m34868a(j >= 0);
            this.f30009f = C5953m0.m35071B0(j);
            return this;
        }
    }

    /* renamed from: f */
    private void m36538f(long j) {
        long j2 = this.f30002r + (this.f30003s * 3);
        if (this.f29997m > j2) {
            float B0 = (float) C5953m0.m35071B0(this.f29987c);
            this.f29997m = C10001f.m51082c(j2, this.f29994j, this.f29997m - (((long) ((this.f30000p - 1.0f) * B0)) + ((long) ((this.f29998n - 1.0f) * B0))));
            return;
        }
        long r = C5953m0.m35154r(j - ((long) (Math.max(0.0f, this.f30000p - 1.0f) / this.f29988d)), this.f29997m, j2);
        this.f29997m = r;
        long j3 = this.f29996l;
        if (j3 != -9223372036854775807L && r > j3) {
            this.f29997m = j3;
        }
    }

    /* renamed from: g */
    private void m36539g() {
        long j = this.f29992h;
        if (j != -9223372036854775807L) {
            long j2 = this.f29993i;
            if (j2 != -9223372036854775807L) {
                j = j2;
            }
            long j3 = this.f29995k;
            if (j3 != -9223372036854775807L && j < j3) {
                j = j3;
            }
            long j4 = this.f29996l;
            if (j4 != -9223372036854775807L && j > j4) {
                j = j4;
            }
        } else {
            j = -9223372036854775807L;
        }
        if (this.f29994j != j) {
            this.f29994j = j;
            this.f29997m = j;
            this.f30002r = -9223372036854775807L;
            this.f30003s = -9223372036854775807L;
            this.f30001q = -9223372036854775807L;
        }
    }

    /* renamed from: h */
    private static long m36540h(long j, long j2, float f) {
        return (long) ((((float) j) * f) + ((1.0f - f) * ((float) j2)));
    }

    /* renamed from: i */
    private void m36541i(long j, long j2) {
        long j3 = j - j2;
        long j4 = this.f30002r;
        if (j4 == -9223372036854775807L) {
            this.f30002r = j3;
            this.f30003s = 0;
            return;
        }
        long max = Math.max(j3, m36540h(j4, j3, this.f29991g));
        this.f30002r = max;
        this.f30003s = m36540h(this.f30003s, Math.abs(j3 - max), this.f29991g);
    }

    /* renamed from: a */
    public float mo21345a(long j, long j2) {
        if (this.f29992h == -9223372036854775807L) {
            return 1.0f;
        }
        m36541i(j, j2);
        if (this.f30001q != -9223372036854775807L && SystemClock.elapsedRealtime() - this.f30001q < this.f29987c) {
            return this.f30000p;
        }
        this.f30001q = SystemClock.elapsedRealtime();
        m36538f(j);
        long j3 = j - this.f29997m;
        if (Math.abs(j3) < this.f29989e) {
            this.f30000p = 1.0f;
        } else {
            this.f30000p = C5953m0.m35150p((this.f29988d * ((float) j3)) + 1.0f, this.f29999o, this.f29998n);
        }
        return this.f30000p;
    }

    /* renamed from: b */
    public long mo21346b() {
        return this.f29997m;
    }

    /* renamed from: c */
    public void mo21347c() {
        long j = this.f29997m;
        if (j != -9223372036854775807L) {
            long j2 = j + this.f29990f;
            this.f29997m = j2;
            long j3 = this.f29996l;
            if (j3 != -9223372036854775807L && j2 > j3) {
                this.f29997m = j3;
            }
            this.f30001q = -9223372036854775807L;
        }
    }

    /* renamed from: d */
    public void mo21348d(C6300z1.C6309g gVar) {
        this.f29992h = C5953m0.m35071B0(gVar.f30445a);
        this.f29995k = C5953m0.m35071B0(gVar.f30446b);
        this.f29996l = C5953m0.m35071B0(gVar.f30447c);
        float f = gVar.f30448d;
        if (f == -3.4028235E38f) {
            f = this.f29985a;
        }
        this.f29999o = f;
        float f2 = gVar.f30449e;
        if (f2 == -3.4028235E38f) {
            f2 = this.f29986b;
        }
        this.f29998n = f2;
        if (f == 1.0f && f2 == 1.0f) {
            this.f29992h = -9223372036854775807L;
        }
        m36539g();
    }

    /* renamed from: e */
    public void mo21349e(long j) {
        this.f29993i = j;
        m36539g();
    }

    private C6230j(float f, float f2, long j, float f3, long j2, long j3, float f4) {
        this.f29985a = f;
        this.f29986b = f2;
        this.f29987c = j;
        this.f29988d = f3;
        this.f29989e = j2;
        this.f29990f = j3;
        this.f29991g = f4;
        this.f29992h = -9223372036854775807L;
        this.f29993i = -9223372036854775807L;
        this.f29995k = -9223372036854775807L;
        this.f29996l = -9223372036854775807L;
        this.f29999o = f;
        this.f29998n = f2;
        this.f30000p = 1.0f;
        this.f30001q = -9223372036854775807L;
        this.f29994j = -9223372036854775807L;
        this.f29997m = -9223372036854775807L;
        this.f30002r = -9223372036854775807L;
        this.f30003s = -9223372036854775807L;
    }
}
