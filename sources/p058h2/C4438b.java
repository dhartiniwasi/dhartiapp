package p058h2;

import java.io.IOException;
import p037e2.C4183a;
import p037e2.C4191b;
import p037e2.C4216m;
import p037e2.C4222s;
import p037e2.C4227v;

/* renamed from: h2.b */
/* compiled from: FlacBinarySearchSeeker */
final class C4438b extends C4183a {

    /* renamed from: h2.b$b */
    /* compiled from: FlacBinarySearchSeeker */
    private static final class C4440b implements C4183a.C4189f {

        /* renamed from: a */
        private final C4227v f24646a;

        /* renamed from: b */
        private final int f24647b;

        /* renamed from: c */
        private final C4222s.C4223a f24648c;

        /* renamed from: c */
        private long m29388c(C4216m mVar) throws IOException {
            while (mVar.mo17557f() < mVar.mo17553b() - 6 && !C4222s.m28497h(mVar, this.f24646a, this.f24647b, this.f24648c)) {
                mVar.mo17558g(1);
            }
            if (mVar.mo17557f() < mVar.mo17553b() - 6) {
                return this.f24648c.f23565a;
            }
            mVar.mo17558g((int) (mVar.mo17553b() - mVar.mo17557f()));
            return this.f24646a.f23578j;
        }

        /* renamed from: a */
        public C4183a.C4188e mo17539a(C4216m mVar, long j) throws IOException {
            long c = mVar.mo17554c();
            long c2 = m29388c(mVar);
            long f = mVar.mo17557f();
            mVar.mo17558g(Math.max(6, this.f24646a.f23571c));
            long c3 = m29388c(mVar);
            long f2 = mVar.mo17557f();
            if (c2 <= j && c3 > j) {
                return C4183a.C4188e.m28364e(f);
            }
            if (c3 <= j) {
                return C4183a.C4188e.m28365f(c3, f2);
            }
            return C4183a.C4188e.m28363d(c2, c);
        }

        /* renamed from: b */
        public /* synthetic */ void mo17540b() {
            C4191b.m28368a(this);
        }

        private C4440b(C4227v vVar, int i) {
            this.f24646a = vVar;
            this.f24647b = i;
            this.f24648c = new C4222s.C4223a();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C4438b(p037e2.C4227v r17, int r18, long r19, long r21) {
        /*
            r16 = this;
            r0 = r17
            java.util.Objects.requireNonNull(r17)
            h2.a r1 = new h2.a
            r1.<init>(r0)
            h2.b$b r2 = new h2.b$b
            r3 = 0
            r4 = r18
            r2.<init>(r0, r4)
            long r3 = r17.mo17588f()
            long r7 = r0.f23578j
            long r13 = r17.mo17587d()
            int r0 = r0.f23571c
            r5 = 6
            int r15 = java.lang.Math.max(r5, r0)
            r5 = 0
            r0 = r16
            r9 = r19
            r11 = r21
            r0.<init>(r1, r2, r3, r5, r7, r9, r11, r13, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p058h2.C4438b.<init>(e2.v, int, long, long):void");
    }
}
