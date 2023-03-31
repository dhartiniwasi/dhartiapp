package p106o2;

import com.facebook.ads.AdError;
import java.io.IOException;
import p037e2.C4183a;
import p037e2.C4216m;
import p161w3.C5918a0;
import p161w3.C5940i0;
import p161w3.C5953m0;

/* renamed from: o2.x */
/* compiled from: PsBinarySearchSeeker */
final class C5211x extends C4183a {

    /* renamed from: o2.x$b */
    /* compiled from: PsBinarySearchSeeker */
    private static final class C5213b implements C4183a.C4189f {

        /* renamed from: a */
        private final C5940i0 f27051a;

        /* renamed from: b */
        private final C5918a0 f27052b;

        /* renamed from: c */
        private C4183a.C4188e m32366c(C5918a0 a0Var, long j, long j2) {
            int i = -1;
            long j3 = -9223372036854775807L;
            int i2 = -1;
            while (a0Var.mo20548a() >= 4) {
                if (C5211x.m32365k(a0Var.mo20551d(), a0Var.mo20552e()) != 442) {
                    a0Var.mo20547P(1);
                } else {
                    a0Var.mo20547P(4);
                    long l = C5214y.m32377l(a0Var);
                    if (l != -9223372036854775807L) {
                        long b = this.f27051a.mo20622b(l);
                        if (b > j) {
                            if (j3 == -9223372036854775807L) {
                                return C4183a.C4188e.m28363d(b, j2);
                            }
                            return C4183a.C4188e.m28364e(j2 + ((long) i2));
                        } else if (100000 + b > j) {
                            return C4183a.C4188e.m28364e(j2 + ((long) a0Var.mo20552e()));
                        } else {
                            i2 = a0Var.mo20552e();
                            j3 = b;
                        }
                    }
                    m32367d(a0Var);
                    i = a0Var.mo20552e();
                }
            }
            if (j3 != -9223372036854775807L) {
                return C4183a.C4188e.m28365f(j3, j2 + ((long) i));
            }
            return C4183a.C4188e.f23475d;
        }

        /* renamed from: d */
        private static void m32367d(C5918a0 a0Var) {
            int f = a0Var.mo20553f();
            if (a0Var.mo20548a() < 10) {
                a0Var.mo20546O(f);
                return;
            }
            a0Var.mo20547P(9);
            int C = a0Var.mo20534C() & 7;
            if (a0Var.mo20548a() < C) {
                a0Var.mo20546O(f);
                return;
            }
            a0Var.mo20547P(C);
            if (a0Var.mo20548a() < 4) {
                a0Var.mo20546O(f);
                return;
            }
            if (C5211x.m32365k(a0Var.mo20551d(), a0Var.mo20552e()) == 443) {
                a0Var.mo20547P(4);
                int I = a0Var.mo20540I();
                if (a0Var.mo20548a() < I) {
                    a0Var.mo20546O(f);
                    return;
                }
                a0Var.mo20547P(I);
            }
            while (a0Var.mo20548a() >= 4 && (r1 = C5211x.m32365k(a0Var.mo20551d(), a0Var.mo20552e())) != 442 && r1 != 441 && (r1 >>> 8) == 1) {
                a0Var.mo20547P(4);
                if (a0Var.mo20548a() < 2) {
                    a0Var.mo20546O(f);
                    return;
                } else {
                    a0Var.mo20546O(Math.min(a0Var.mo20553f(), a0Var.mo20552e() + a0Var.mo20540I()));
                }
            }
        }

        /* renamed from: a */
        public C4183a.C4188e mo17539a(C4216m mVar, long j) throws IOException {
            long c = mVar.mo17554c();
            int min = (int) Math.min(20000, mVar.mo17553b() - c);
            this.f27052b.mo20542K(min);
            mVar.mo17563p(this.f27052b.mo20551d(), 0, min);
            return m32366c(this.f27052b, j, c);
        }

        /* renamed from: b */
        public void mo17540b() {
            this.f27052b.mo20543L(C5953m0.f29115f);
        }

        private C5213b(C5940i0 i0Var) {
            this.f27051a = i0Var;
            this.f27052b = new C5918a0();
        }
    }

    public C5211x(C5940i0 i0Var, long j, long j2) {
        super(new C4183a.C4185b(), new C5213b(i0Var), j, 0, j + 1, 0, j2, 188, AdError.NETWORK_ERROR_CODE);
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static int m32365k(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }
}
