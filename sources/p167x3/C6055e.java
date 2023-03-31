package p167x3;

import java.util.Arrays;

/* renamed from: x3.e */
/* compiled from: FixedFrameRateEstimator */
final class C6055e {

    /* renamed from: a */
    private C6056a f29340a = new C6056a();

    /* renamed from: b */
    private C6056a f29341b = new C6056a();

    /* renamed from: c */
    private boolean f29342c;

    /* renamed from: d */
    private boolean f29343d;

    /* renamed from: e */
    private long f29344e = -9223372036854775807L;

    /* renamed from: f */
    private int f29345f;

    /* renamed from: x3.e$a */
    /* compiled from: FixedFrameRateEstimator */
    private static final class C6056a {

        /* renamed from: a */
        private long f29346a;

        /* renamed from: b */
        private long f29347b;

        /* renamed from: c */
        private long f29348c;

        /* renamed from: d */
        private long f29349d;

        /* renamed from: e */
        private long f29350e;

        /* renamed from: f */
        private long f29351f;

        /* renamed from: g */
        private final boolean[] f29352g = new boolean[15];

        /* renamed from: h */
        private int f29353h;

        /* renamed from: c */
        private static int m35510c(long j) {
            return (int) (j % 15);
        }

        /* renamed from: a */
        public long mo20803a() {
            long j = this.f29350e;
            if (j == 0) {
                return 0;
            }
            return this.f29351f / j;
        }

        /* renamed from: b */
        public long mo20804b() {
            return this.f29351f;
        }

        /* renamed from: d */
        public boolean mo20805d() {
            long j = this.f29349d;
            if (j == 0) {
                return false;
            }
            return this.f29352g[m35510c(j - 1)];
        }

        /* renamed from: e */
        public boolean mo20806e() {
            return this.f29349d > 15 && this.f29353h == 0;
        }

        /* renamed from: f */
        public void mo20807f(long j) {
            long j2 = this.f29349d;
            if (j2 == 0) {
                this.f29346a = j;
            } else if (j2 == 1) {
                long j3 = j - this.f29346a;
                this.f29347b = j3;
                this.f29351f = j3;
                this.f29350e = 1;
            } else {
                long j4 = j - this.f29348c;
                int c = m35510c(j2);
                if (Math.abs(j4 - this.f29347b) <= 1000000) {
                    this.f29350e++;
                    this.f29351f += j4;
                    boolean[] zArr = this.f29352g;
                    if (zArr[c]) {
                        zArr[c] = false;
                        this.f29353h--;
                    }
                } else {
                    boolean[] zArr2 = this.f29352g;
                    if (!zArr2[c]) {
                        zArr2[c] = true;
                        this.f29353h++;
                    }
                }
            }
            this.f29349d++;
            this.f29348c = j;
        }

        /* renamed from: g */
        public void mo20808g() {
            this.f29349d = 0;
            this.f29350e = 0;
            this.f29351f = 0;
            this.f29353h = 0;
            Arrays.fill(this.f29352g, false);
        }
    }

    /* renamed from: a */
    public long mo20796a() {
        if (mo20800e()) {
            return this.f29340a.mo20803a();
        }
        return -9223372036854775807L;
    }

    /* renamed from: b */
    public float mo20797b() {
        if (mo20800e()) {
            return (float) (1.0E9d / ((double) this.f29340a.mo20803a()));
        }
        return -1.0f;
    }

    /* renamed from: c */
    public int mo20798c() {
        return this.f29345f;
    }

    /* renamed from: d */
    public long mo20799d() {
        if (mo20800e()) {
            return this.f29340a.mo20804b();
        }
        return -9223372036854775807L;
    }

    /* renamed from: e */
    public boolean mo20800e() {
        return this.f29340a.mo20806e();
    }

    /* renamed from: f */
    public void mo20801f(long j) {
        this.f29340a.mo20807f(j);
        int i = 0;
        if (this.f29340a.mo20806e() && !this.f29343d) {
            this.f29342c = false;
        } else if (this.f29344e != -9223372036854775807L) {
            if (!this.f29342c || this.f29341b.mo20805d()) {
                this.f29341b.mo20808g();
                this.f29341b.mo20807f(this.f29344e);
            }
            this.f29342c = true;
            this.f29341b.mo20807f(j);
        }
        if (this.f29342c && this.f29341b.mo20806e()) {
            C6056a aVar = this.f29340a;
            this.f29340a = this.f29341b;
            this.f29341b = aVar;
            this.f29342c = false;
            this.f29343d = false;
        }
        this.f29344e = j;
        if (!this.f29340a.mo20806e()) {
            i = this.f29345f + 1;
        }
        this.f29345f = i;
    }

    /* renamed from: g */
    public void mo20802g() {
        this.f29340a.mo20808g();
        this.f29341b.mo20808g();
        this.f29342c = false;
        this.f29344e = -9223372036854775807L;
        this.f29345f = 0;
    }
}
