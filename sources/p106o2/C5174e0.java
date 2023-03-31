package p106o2;

import java.io.IOException;
import p037e2.C4183a;
import p037e2.C4216m;
import p161w3.C5918a0;
import p161w3.C5940i0;
import p161w3.C5953m0;

/* renamed from: o2.e0 */
/* compiled from: TsBinarySearchSeeker */
final class C5174e0 extends C4183a {

    /* renamed from: o2.e0$a */
    /* compiled from: TsBinarySearchSeeker */
    private static final class C5175a implements C4183a.C4189f {

        /* renamed from: a */
        private final C5940i0 f26747a;

        /* renamed from: b */
        private final C5918a0 f26748b = new C5918a0();

        /* renamed from: c */
        private final int f26749c;

        /* renamed from: d */
        private final int f26750d;

        public C5175a(int i, C5940i0 i0Var, int i2) {
            this.f26749c = i;
            this.f26747a = i0Var;
            this.f26750d = i2;
        }

        /* renamed from: c */
        private C4183a.C4188e m32132c(C5918a0 a0Var, long j, long j2) {
            int a;
            int i;
            C5918a0 a0Var2 = a0Var;
            long j3 = j2;
            int f = a0Var.mo20553f();
            long j4 = -1;
            long j5 = -1;
            long j6 = -9223372036854775807L;
            while (a0Var.mo20548a() >= 188 && (i = a + 188) <= f) {
                long c = C5189j0.m32236c(a0Var2, (a = C5189j0.m32234a(a0Var.mo20551d(), a0Var.mo20552e(), f)), this.f26749c);
                if (c != -9223372036854775807L) {
                    long b = this.f26747a.mo20622b(c);
                    if (b > j) {
                        if (j6 == -9223372036854775807L) {
                            return C4183a.C4188e.m28363d(b, j3);
                        }
                        return C4183a.C4188e.m28364e(j3 + j5);
                    } else if (100000 + b > j) {
                        return C4183a.C4188e.m28364e(j3 + ((long) a));
                    } else {
                        j5 = (long) a;
                        j6 = b;
                    }
                }
                a0Var2.mo20546O(i);
                j4 = (long) i;
            }
            if (j6 != -9223372036854775807L) {
                return C4183a.C4188e.m28365f(j6, j3 + j4);
            }
            return C4183a.C4188e.f23475d;
        }

        /* renamed from: a */
        public C4183a.C4188e mo17539a(C4216m mVar, long j) throws IOException {
            long c = mVar.mo17554c();
            int min = (int) Math.min((long) this.f26750d, mVar.mo17553b() - c);
            this.f26748b.mo20542K(min);
            mVar.mo17563p(this.f26748b.mo20551d(), 0, min);
            return m32132c(this.f26748b, j, c);
        }

        /* renamed from: b */
        public void mo17540b() {
            this.f26748b.mo20543L(C5953m0.f29115f);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C5174e0(p161w3.C5940i0 r17, long r18, long r20, int r22, int r23) {
        /*
            r16 = this;
            e2.a$b r1 = new e2.a$b
            r1.<init>()
            o2.e0$a r2 = new o2.e0$a
            r0 = r17
            r3 = r22
            r4 = r23
            r2.<init>(r3, r0, r4)
            r3 = 1
            long r7 = r18 + r3
            r5 = 0
            r9 = 0
            r13 = 188(0xbc, double:9.3E-322)
            r15 = 940(0x3ac, float:1.317E-42)
            r0 = r16
            r3 = r18
            r11 = r20
            r0.<init>(r1, r2, r3, r5, r7, r9, r11, r13, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p106o2.C5174e0.<init>(w3.i0, long, long, int, int):void");
    }
}
