package p045f3;

import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;
import p161w3.C5953m0;
import p177z1.C6272r1;
import p210d7.C9871a;

/* renamed from: f3.k */
/* compiled from: SegmentBase */
public abstract class C4269k {

    /* renamed from: a */
    final C4264i f23710a;

    /* renamed from: b */
    final long f23711b;

    /* renamed from: c */
    final long f23712c;

    /* renamed from: f3.k$a */
    /* compiled from: SegmentBase */
    public static abstract class C4270a extends C4269k {

        /* renamed from: d */
        final long f23713d;

        /* renamed from: e */
        final long f23714e;

        /* renamed from: f */
        final List<C4273d> f23715f;

        /* renamed from: g */
        private final long f23716g;

        /* renamed from: h */
        private final long f23717h;

        /* renamed from: i */
        final long f23718i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4270a(C4264i iVar, long j, long j2, long j3, long j4, List<C4273d> list, long j5, long j6, long j7) {
            super(iVar, j, j2);
            this.f23713d = j3;
            this.f23714e = j4;
            this.f23715f = list;
            this.f23718i = j5;
            this.f23716g = j6;
            this.f23717h = j7;
        }

        /* renamed from: c */
        public long mo17693c(long j, long j2) {
            long g = mo17697g(j);
            if (g != -1) {
                return g;
            }
            return (long) ((int) (mo17699i((j2 - this.f23717h) + this.f23718i, j) - mo17694d(j, j2)));
        }

        /* renamed from: d */
        public long mo17694d(long j, long j2) {
            if (mo17697g(j) == -1) {
                long j3 = this.f23716g;
                if (j3 != -9223372036854775807L) {
                    return Math.max(mo17695e(), mo17699i((j2 - this.f23717h) - j3, j));
                }
            }
            return mo17695e();
        }

        /* renamed from: e */
        public long mo17695e() {
            return this.f23713d;
        }

        /* renamed from: f */
        public long mo17696f(long j, long j2) {
            if (this.f23715f != null) {
                return -9223372036854775807L;
            }
            long d = mo17694d(j, j2) + mo17693c(j, j2);
            return (mo17700j(d) + mo17698h(d, j)) - this.f23718i;
        }

        /* renamed from: g */
        public abstract long mo17697g(long j);

        /* renamed from: h */
        public final long mo17698h(long j, long j2) {
            List<C4273d> list = this.f23715f;
            if (list != null) {
                return (list.get((int) (j - this.f23713d)).f23724b * 1000000) / this.f23711b;
            }
            long g = mo17697g(j2);
            if (g == -1 || j != (mo17695e() + g) - 1) {
                return (this.f23714e * 1000000) / this.f23711b;
            }
            return j2 - mo17700j(j);
        }

        /* renamed from: i */
        public long mo17699i(long j, long j2) {
            long e = mo17695e();
            long g = mo17697g(j2);
            if (g == 0) {
                return e;
            }
            if (this.f23715f == null) {
                long j3 = this.f23713d + (j / ((this.f23714e * 1000000) / this.f23711b));
                if (j3 < e) {
                    return e;
                }
                if (g == -1) {
                    return j3;
                }
                return Math.min(j3, (e + g) - 1);
            }
            long j4 = (g + e) - 1;
            long j5 = e;
            while (j5 <= j4) {
                long j6 = ((j4 - j5) / 2) + j5;
                int i = (mo17700j(j6) > j ? 1 : (mo17700j(j6) == j ? 0 : -1));
                if (i < 0) {
                    j5 = j6 + 1;
                } else if (i <= 0) {
                    return j6;
                } else {
                    j4 = j6 - 1;
                }
            }
            return j5 == e ? j5 : j4;
        }

        /* renamed from: j */
        public final long mo17700j(long j) {
            long j2;
            List<C4273d> list = this.f23715f;
            if (list != null) {
                j2 = list.get((int) (j - this.f23713d)).f23723a - this.f23712c;
            } else {
                j2 = (j - this.f23713d) * this.f23714e;
            }
            return C5953m0.m35095N0(j2, 1000000, this.f23711b);
        }

        /* renamed from: k */
        public abstract C4264i mo17701k(C4265j jVar, long j);

        /* renamed from: l */
        public boolean mo17702l() {
            return this.f23715f != null;
        }
    }

    /* renamed from: f3.k$b */
    /* compiled from: SegmentBase */
    public static final class C4271b extends C4270a {

        /* renamed from: j */
        final List<C4264i> f23719j;

        public C4271b(C4264i iVar, long j, long j2, long j3, long j4, List<C4273d> list, long j5, List<C4264i> list2, long j6, long j7) {
            super(iVar, j, j2, j3, j4, list, j5, j6, j7);
            this.f23719j = list2;
        }

        /* renamed from: g */
        public long mo17697g(long j) {
            return (long) this.f23719j.size();
        }

        /* renamed from: k */
        public C4264i mo17701k(C4265j jVar, long j) {
            return this.f23719j.get((int) (j - this.f23713d));
        }

        /* renamed from: l */
        public boolean mo17702l() {
            return true;
        }
    }

    /* renamed from: f3.k$c */
    /* compiled from: SegmentBase */
    public static final class C4272c extends C4270a {

        /* renamed from: j */
        final C4277n f23720j;

        /* renamed from: k */
        final C4277n f23721k;

        /* renamed from: l */
        final long f23722l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4272c(C4264i iVar, long j, long j2, long j3, long j4, long j5, List<C4273d> list, long j6, C4277n nVar, C4277n nVar2, long j7, long j8) {
            super(iVar, j, j2, j3, j5, list, j6, j7, j8);
            this.f23720j = nVar;
            this.f23721k = nVar2;
            this.f23722l = j4;
        }

        /* renamed from: a */
        public C4264i mo17691a(C4265j jVar) {
            C4277n nVar = this.f23720j;
            if (nVar == null) {
                return C4269k.super.mo17691a(jVar);
            }
            C6272r1 r1Var = jVar.f23697b;
            return new C4264i(nVar.mo17706a(r1Var.f30232a, 0, r1Var.f30239h, 0), 0, -1);
        }

        /* renamed from: g */
        public long mo17697g(long j) {
            List<C4273d> list = this.f23715f;
            if (list != null) {
                return (long) list.size();
            }
            long j2 = this.f23722l;
            if (j2 != -1) {
                return (j2 - this.f23713d) + 1;
            }
            if (j != -9223372036854775807L) {
                return C9871a.m50639a(BigInteger.valueOf(j).multiply(BigInteger.valueOf(this.f23711b)), BigInteger.valueOf(this.f23714e).multiply(BigInteger.valueOf(1000000)), RoundingMode.CEILING).longValue();
            }
            return -1;
        }

        /* renamed from: k */
        public C4264i mo17701k(C4265j jVar, long j) {
            long j2;
            List<C4273d> list = this.f23715f;
            if (list != null) {
                j2 = list.get((int) (j - this.f23713d)).f23723a;
            } else {
                j2 = (j - this.f23713d) * this.f23714e;
            }
            long j3 = j2;
            C4277n nVar = this.f23721k;
            C6272r1 r1Var = jVar.f23697b;
            return new C4264i(nVar.mo17706a(r1Var.f30232a, j, r1Var.f30239h, j3), 0, -1);
        }
    }

    /* renamed from: f3.k$d */
    /* compiled from: SegmentBase */
    public static final class C4273d {

        /* renamed from: a */
        final long f23723a;

        /* renamed from: b */
        final long f23724b;

        public C4273d(long j, long j2) {
            this.f23723a = j;
            this.f23724b = j2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C4273d.class != obj.getClass()) {
                return false;
            }
            C4273d dVar = (C4273d) obj;
            if (this.f23723a == dVar.f23723a && this.f23724b == dVar.f23724b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((int) this.f23723a) * 31) + ((int) this.f23724b);
        }
    }

    public C4269k(C4264i iVar, long j, long j2) {
        this.f23710a = iVar;
        this.f23711b = j;
        this.f23712c = j2;
    }

    /* renamed from: a */
    public C4264i mo17691a(C4265j jVar) {
        return this.f23710a;
    }

    /* renamed from: b */
    public long mo17692b() {
        return C5953m0.m35095N0(this.f23712c, 1000000, this.f23711b);
    }

    /* renamed from: f3.k$e */
    /* compiled from: SegmentBase */
    public static class C4274e extends C4269k {

        /* renamed from: d */
        final long f23725d;

        /* renamed from: e */
        final long f23726e;

        public C4274e(C4264i iVar, long j, long j2, long j3, long j4) {
            super(iVar, j, j2);
            this.f23725d = j3;
            this.f23726e = j4;
        }

        /* renamed from: c */
        public C4264i mo17705c() {
            long j = this.f23726e;
            if (j <= 0) {
                return null;
            }
            return new C4264i((String) null, this.f23725d, j);
        }

        public C4274e() {
            this((C4264i) null, 1, 0, 0, 0);
        }
    }
}
