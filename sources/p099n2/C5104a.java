package p099n2;

import java.io.EOFException;
import java.io.IOException;
import p037e2.C4192b0;
import p037e2.C4196c0;
import p037e2.C4216m;
import p037e2.C4219o;
import p161w3.C5917a;
import p161w3.C5953m0;

/* renamed from: n2.a */
/* compiled from: DefaultOggSeeker */
final class C5104a implements C5112g {

    /* renamed from: a */
    private final C5111f f26560a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final long f26561b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final long f26562c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C5114i f26563d;

    /* renamed from: e */
    private int f26564e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public long f26565f;

    /* renamed from: g */
    private long f26566g;

    /* renamed from: h */
    private long f26567h;

    /* renamed from: i */
    private long f26568i;

    /* renamed from: j */
    private long f26569j;

    /* renamed from: k */
    private long f26570k;

    /* renamed from: l */
    private long f26571l;

    /* renamed from: n2.a$b */
    /* compiled from: DefaultOggSeeker */
    private final class C5106b implements C4192b0 {
        private C5106b() {
        }

        /* renamed from: g */
        public boolean mo17534g() {
            return true;
        }

        /* renamed from: i */
        public C4192b0.C4193a mo17535i(long j) {
            return new C4192b0.C4193a(new C4196c0(j, C5953m0.m35154r((C5104a.this.f26561b + ((C5104a.this.f26563d.mo19085c(j) * (C5104a.this.f26562c - C5104a.this.f26561b)) / C5104a.this.f26565f)) - 30000, C5104a.this.f26561b, C5104a.this.f26562c - 1)));
        }

        /* renamed from: j */
        public long mo17536j() {
            return C5104a.this.f26563d.mo19084b(C5104a.this.f26565f);
        }
    }

    public C5104a(C5114i iVar, long j, long j2, long j3, long j4, boolean z) {
        C5917a.m34868a(j >= 0 && j2 > j);
        this.f26563d = iVar;
        this.f26561b = j;
        this.f26562c = j2;
        if (j3 == j2 - j || z) {
            this.f26565f = j4;
            this.f26564e = 4;
        } else {
            this.f26564e = 0;
        }
        this.f26560a = new C5111f();
    }

    /* renamed from: i */
    private long m31922i(C4216m mVar) throws IOException {
        C4216m mVar2 = mVar;
        if (this.f26568i == this.f26569j) {
            return -1;
        }
        long c = mVar.mo17554c();
        if (!this.f26560a.mo19083d(mVar2, this.f26569j)) {
            long j = this.f26568i;
            if (j != c) {
                return j;
            }
            throw new IOException("No ogg page can be found.");
        }
        this.f26560a.mo19080a(mVar2, false);
        mVar.mo17560j();
        long j2 = this.f26567h;
        C5111f fVar = this.f26560a;
        long j3 = fVar.f26590c;
        long j4 = j2 - j3;
        int i = fVar.f26595h + fVar.f26596i;
        if (0 <= j4 && j4 < 72000) {
            return -1;
        }
        int i2 = (j4 > 0 ? 1 : (j4 == 0 ? 0 : -1));
        if (i2 < 0) {
            this.f26569j = c;
            this.f26571l = j3;
        } else {
            this.f26568i = mVar.mo17554c() + ((long) i);
            this.f26570k = this.f26560a.f26590c;
        }
        long j5 = this.f26569j;
        long j6 = this.f26568i;
        if (j5 - j6 < 100000) {
            this.f26569j = j6;
            return j6;
        }
        long j7 = ((long) i) * (i2 <= 0 ? 2 : 1);
        long j8 = this.f26569j;
        long j9 = this.f26568i;
        return C5953m0.m35154r((mVar.mo17554c() - j7) + ((j4 * (j8 - j9)) / (this.f26571l - this.f26570k)), j9, j8 - 1);
    }

    /* renamed from: k */
    private void m31923k(C4216m mVar) throws IOException {
        while (true) {
            this.f26560a.mo19082c(mVar);
            this.f26560a.mo19080a(mVar, false);
            C5111f fVar = this.f26560a;
            if (fVar.f26590c > this.f26567h) {
                mVar.mo17560j();
                return;
            }
            mVar.mo17561k(fVar.f26595h + fVar.f26596i);
            this.f26568i = mVar.mo17554c();
            this.f26570k = this.f26560a.f26590c;
        }
    }

    /* renamed from: b */
    public long mo19067b(C4216m mVar) throws IOException {
        int i = this.f26564e;
        if (i == 0) {
            long c = mVar.mo17554c();
            this.f26566g = c;
            this.f26564e = 1;
            long j = this.f26562c - 65307;
            if (j > c) {
                return j;
            }
        } else if (i != 1) {
            if (i == 2) {
                long i2 = m31922i(mVar);
                if (i2 != -1) {
                    return i2;
                }
                this.f26564e = 3;
            } else if (i != 3) {
                if (i == 4) {
                    return -1;
                }
                throw new IllegalStateException();
            }
            m31923k(mVar);
            this.f26564e = 4;
            return -(this.f26570k + 2);
        }
        this.f26565f = mo19070j(mVar);
        this.f26564e = 4;
        return this.f26566g;
    }

    /* renamed from: c */
    public void mo19068c(long j) {
        this.f26567h = C5953m0.m35154r(j, 0, this.f26565f - 1);
        this.f26564e = 2;
        this.f26568i = this.f26561b;
        this.f26569j = this.f26562c;
        this.f26570k = 0;
        this.f26571l = this.f26565f;
    }

    /* renamed from: h */
    public C5106b mo19066a() {
        if (this.f26565f != 0) {
            return new C5106b();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public long mo19070j(C4216m mVar) throws IOException {
        this.f26560a.mo19081b();
        if (this.f26560a.mo19082c(mVar)) {
            this.f26560a.mo19080a(mVar, false);
            C5111f fVar = this.f26560a;
            mVar.mo17561k(fVar.f26595h + fVar.f26596i);
            long j = this.f26560a.f26590c;
            while (true) {
                C5111f fVar2 = this.f26560a;
                if ((fVar2.f26589b & 4) == 4 || !fVar2.mo19082c(mVar) || mVar.mo17554c() >= this.f26562c || !this.f26560a.mo19080a(mVar, true)) {
                    break;
                }
                C5111f fVar3 = this.f26560a;
                if (!C4219o.m28484e(mVar, fVar3.f26595h + fVar3.f26596i)) {
                    break;
                }
                j = this.f26560a.f26590c;
            }
            return j;
        }
        throw new EOFException();
    }
}
