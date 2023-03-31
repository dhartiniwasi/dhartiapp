package p037e2;

import java.io.IOException;
import p037e2.C4192b0;
import p161w3.C5917a;
import p161w3.C5953m0;

/* renamed from: e2.a */
/* compiled from: BinarySearchSeeker */
public abstract class C4183a {

    /* renamed from: a */
    protected final C4184a f23456a;

    /* renamed from: b */
    protected final C4189f f23457b;

    /* renamed from: c */
    protected C4186c f23458c;

    /* renamed from: d */
    private final int f23459d;

    /* renamed from: e2.a$a */
    /* compiled from: BinarySearchSeeker */
    public static class C4184a implements C4192b0 {

        /* renamed from: a */
        private final C4187d f23460a;

        /* renamed from: b */
        private final long f23461b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final long f23462c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final long f23463d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final long f23464e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public final long f23465f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public final long f23466g;

        public C4184a(C4187d dVar, long j, long j2, long j3, long j4, long j5, long j6) {
            this.f23460a = dVar;
            this.f23461b = j;
            this.f23462c = j2;
            this.f23463d = j3;
            this.f23464e = j4;
            this.f23465f = j5;
            this.f23466g = j6;
        }

        /* renamed from: g */
        public boolean mo17534g() {
            return true;
        }

        /* renamed from: i */
        public C4192b0.C4193a mo17535i(long j) {
            return new C4192b0.C4193a(new C4196c0(j, C4186c.m28350h(this.f23460a.mo17538a(j), this.f23462c, this.f23463d, this.f23464e, this.f23465f, this.f23466g)));
        }

        /* renamed from: j */
        public long mo17536j() {
            return this.f23461b;
        }

        /* renamed from: k */
        public long mo17537k(long j) {
            return this.f23460a.mo17538a(j);
        }
    }

    /* renamed from: e2.a$b */
    /* compiled from: BinarySearchSeeker */
    public static final class C4185b implements C4187d {
        /* renamed from: a */
        public long mo17538a(long j) {
            return j;
        }
    }

    /* renamed from: e2.a$c */
    /* compiled from: BinarySearchSeeker */
    protected static class C4186c {

        /* renamed from: a */
        private final long f23467a;

        /* renamed from: b */
        private final long f23468b;

        /* renamed from: c */
        private final long f23469c;

        /* renamed from: d */
        private long f23470d;

        /* renamed from: e */
        private long f23471e;

        /* renamed from: f */
        private long f23472f;

        /* renamed from: g */
        private long f23473g;

        /* renamed from: h */
        private long f23474h;

        protected C4186c(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
            this.f23467a = j;
            this.f23468b = j2;
            this.f23470d = j3;
            this.f23471e = j4;
            this.f23472f = j5;
            this.f23473g = j6;
            this.f23469c = j7;
            this.f23474h = m28350h(j2, j3, j4, j5, j6, j7);
        }

        /* renamed from: h */
        protected static long m28350h(long j, long j2, long j3, long j4, long j5, long j6) {
            if (j4 + 1 >= j5 || j2 + 1 >= j3) {
                return j4;
            }
            long j7 = (long) (((float) (j - j2)) * (((float) (j5 - j4)) / ((float) (j3 - j2))));
            return C5953m0.m35154r(((j7 + j4) - j6) - (j7 / 20), j4, j5 - 1);
        }

        /* access modifiers changed from: private */
        /* renamed from: i */
        public long m28351i() {
            return this.f23473g;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public long m28352j() {
            return this.f23472f;
        }

        /* access modifiers changed from: private */
        /* renamed from: k */
        public long m28353k() {
            return this.f23474h;
        }

        /* access modifiers changed from: private */
        /* renamed from: l */
        public long m28354l() {
            return this.f23467a;
        }

        /* access modifiers changed from: private */
        /* renamed from: m */
        public long m28355m() {
            return this.f23468b;
        }

        /* renamed from: n */
        private void m28356n() {
            this.f23474h = m28350h(this.f23468b, this.f23470d, this.f23471e, this.f23472f, this.f23473g, this.f23469c);
        }

        /* access modifiers changed from: private */
        /* renamed from: o */
        public void m28357o(long j, long j2) {
            this.f23471e = j;
            this.f23473g = j2;
            m28356n();
        }

        /* access modifiers changed from: private */
        /* renamed from: p */
        public void m28358p(long j, long j2) {
            this.f23470d = j;
            this.f23472f = j2;
            m28356n();
        }
    }

    /* renamed from: e2.a$d */
    /* compiled from: BinarySearchSeeker */
    protected interface C4187d {
        /* renamed from: a */
        long mo17538a(long j);
    }

    /* renamed from: e2.a$e */
    /* compiled from: BinarySearchSeeker */
    public static final class C4188e {

        /* renamed from: d */
        public static final C4188e f23475d = new C4188e(-3, -9223372036854775807L, -1);
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final int f23476a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final long f23477b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final long f23478c;

        private C4188e(int i, long j, long j2) {
            this.f23476a = i;
            this.f23477b = j;
            this.f23478c = j2;
        }

        /* renamed from: d */
        public static C4188e m28363d(long j, long j2) {
            return new C4188e(-1, j, j2);
        }

        /* renamed from: e */
        public static C4188e m28364e(long j) {
            return new C4188e(0, -9223372036854775807L, j);
        }

        /* renamed from: f */
        public static C4188e m28365f(long j, long j2) {
            return new C4188e(-2, j, j2);
        }
    }

    /* renamed from: e2.a$f */
    /* compiled from: BinarySearchSeeker */
    protected interface C4189f {
        /* renamed from: a */
        C4188e mo17539a(C4216m mVar, long j) throws IOException;

        /* renamed from: b */
        void mo17540b();
    }

    protected C4183a(C4187d dVar, C4189f fVar, long j, long j2, long j3, long j4, long j5, long j6, int i) {
        this.f23457b = fVar;
        this.f23459d = i;
        this.f23456a = new C4184a(dVar, j, j2, j3, j4, j5, j6);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C4186c mo17525a(long j) {
        long j2 = j;
        return new C4186c(j2, this.f23456a.mo17537k(j2), this.f23456a.f23462c, this.f23456a.f23463d, this.f23456a.f23464e, this.f23456a.f23465f, this.f23456a.f23466g);
    }

    /* renamed from: b */
    public final C4192b0 mo17526b() {
        return this.f23456a;
    }

    /* renamed from: c */
    public int mo17527c(C4216m mVar, C4190a0 a0Var) throws IOException {
        while (true) {
            C4186c cVar = (C4186c) C5917a.m34875h(this.f23458c);
            long b = cVar.m28352j();
            long c = cVar.m28351i();
            long d = cVar.m28353k();
            if (c - b <= ((long) this.f23459d)) {
                mo17529e(false, b);
                return mo17531g(mVar, b, a0Var);
            } else if (!mo17533i(mVar, d)) {
                return mo17531g(mVar, d, a0Var);
            } else {
                mVar.mo17560j();
                C4188e a = this.f23457b.mo17539a(mVar, cVar.m28355m());
                int a2 = a.f23476a;
                if (a2 == -3) {
                    mo17529e(false, d);
                    return mo17531g(mVar, d, a0Var);
                } else if (a2 == -2) {
                    cVar.m28358p(a.f23477b, a.f23478c);
                } else if (a2 == -1) {
                    cVar.m28357o(a.f23477b, a.f23478c);
                } else if (a2 == 0) {
                    mo17533i(mVar, a.f23478c);
                    mo17529e(true, a.f23478c);
                    return mo17531g(mVar, a.f23478c, a0Var);
                } else {
                    throw new IllegalStateException("Invalid case");
                }
            }
        }
    }

    /* renamed from: d */
    public final boolean mo17528d() {
        return this.f23458c != null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo17529e(boolean z, long j) {
        this.f23458c = null;
        this.f23457b.mo17540b();
        mo17530f(z, j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo17530f(boolean z, long j) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final int mo17531g(C4216m mVar, long j, C4190a0 a0Var) {
        if (j == mVar.mo17554c()) {
            return 0;
        }
        a0Var.f23479a = j;
        return 1;
    }

    /* renamed from: h */
    public final void mo17532h(long j) {
        C4186c cVar = this.f23458c;
        if (cVar == null || cVar.m28354l() != j) {
            this.f23458c = mo17525a(j);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final boolean mo17533i(C4216m mVar, long j) throws IOException {
        long c = j - mVar.mo17554c();
        if (c < 0 || c > 262144) {
            return false;
        }
        mVar.mo17561k((int) c);
        return true;
    }
}
