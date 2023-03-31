package p106o2;

import android.util.SparseArray;
import java.io.IOException;
import p037e2.C4190a0;
import p037e2.C4192b0;
import p037e2.C4215l;
import p037e2.C4216m;
import p037e2.C4217n;
import p037e2.C4221r;
import p106o2.C5183i0;
import p161w3.C5917a;
import p161w3.C5918a0;
import p161w3.C5940i0;
import p161w3.C5980z;
import p177z1.C6249m2;

/* renamed from: o2.a0 */
/* compiled from: PsExtractor */
public final class C5166a0 implements C4215l {

    /* renamed from: l */
    public static final C4221r f26699l = C12014z.f44979b;

    /* renamed from: a */
    private final C5940i0 f26700a;

    /* renamed from: b */
    private final SparseArray<C5167a> f26701b;

    /* renamed from: c */
    private final C5918a0 f26702c;

    /* renamed from: d */
    private final C5214y f26703d;

    /* renamed from: e */
    private boolean f26704e;

    /* renamed from: f */
    private boolean f26705f;

    /* renamed from: g */
    private boolean f26706g;

    /* renamed from: h */
    private long f26707h;

    /* renamed from: i */
    private C5211x f26708i;

    /* renamed from: j */
    private C4217n f26709j;

    /* renamed from: k */
    private boolean f26710k;

    /* renamed from: o2.a0$a */
    /* compiled from: PsExtractor */
    private static final class C5167a {

        /* renamed from: a */
        private final C5193m f26711a;

        /* renamed from: b */
        private final C5940i0 f26712b;

        /* renamed from: c */
        private final C5980z f26713c = new C5980z(new byte[64]);

        /* renamed from: d */
        private boolean f26714d;

        /* renamed from: e */
        private boolean f26715e;

        /* renamed from: f */
        private boolean f26716f;

        /* renamed from: g */
        private int f26717g;

        /* renamed from: h */
        private long f26718h;

        public C5167a(C5193m mVar, C5940i0 i0Var) {
            this.f26711a = mVar;
            this.f26712b = i0Var;
        }

        /* renamed from: b */
        private void m32099b() {
            this.f26713c.mo20686r(8);
            this.f26714d = this.f26713c.mo20675g();
            this.f26715e = this.f26713c.mo20675g();
            this.f26713c.mo20686r(6);
            this.f26717g = this.f26713c.mo20676h(8);
        }

        /* renamed from: c */
        private void m32100c() {
            this.f26718h = 0;
            if (this.f26714d) {
                this.f26713c.mo20686r(4);
                this.f26713c.mo20686r(1);
                this.f26713c.mo20686r(1);
                long h = (((long) this.f26713c.mo20676h(3)) << 30) | ((long) (this.f26713c.mo20676h(15) << 15)) | ((long) this.f26713c.mo20676h(15));
                this.f26713c.mo20686r(1);
                if (!this.f26716f && this.f26715e) {
                    this.f26713c.mo20686r(4);
                    this.f26713c.mo20686r(1);
                    this.f26713c.mo20686r(1);
                    this.f26713c.mo20686r(1);
                    this.f26712b.mo20622b((((long) this.f26713c.mo20676h(3)) << 30) | ((long) (this.f26713c.mo20676h(15) << 15)) | ((long) this.f26713c.mo20676h(15)));
                    this.f26716f = true;
                }
                this.f26718h = this.f26712b.mo20622b(h);
            }
        }

        /* renamed from: a */
        public void mo19143a(C5918a0 a0Var) throws C6249m2 {
            a0Var.mo20557j(this.f26713c.f29188a, 0, 3);
            this.f26713c.mo20684p(0);
            m32099b();
            a0Var.mo20557j(this.f26713c.f29188a, 0, this.f26717g);
            this.f26713c.mo20684p(0);
            m32100c();
            this.f26711a.mo19151e(this.f26718h, 4);
            this.f26711a.mo19147a(a0Var);
            this.f26711a.mo19149c();
        }

        /* renamed from: d */
        public void mo19144d() {
            this.f26716f = false;
            this.f26711a.mo19148b();
        }
    }

    public C5166a0() {
        this(new C5940i0(0));
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static /* synthetic */ C4215l[] m32092f() {
        return new C4215l[]{new C5166a0()};
    }

    /* renamed from: g */
    private void m32093g(long j) {
        if (!this.f26710k) {
            this.f26710k = true;
            if (this.f26703d.mo19199c() != -9223372036854775807L) {
                C5211x xVar = new C5211x(this.f26703d.mo19200d(), this.f26703d.mo19199c(), j);
                this.f26708i = xVar;
                this.f26709j.mo6781l(xVar.mo17526b());
                return;
            }
            this.f26709j.mo6781l(new C4192b0.C4194b(this.f26703d.mo19199c()));
        }
    }

    /* renamed from: a */
    public void mo17579a() {
    }

    /* renamed from: c */
    public void mo17580c(long j, long j2) {
        boolean z = true;
        boolean z2 = this.f26700a.mo20625e() == -9223372036854775807L;
        if (!z2) {
            long c = this.f26700a.mo20623c();
            if (c == -9223372036854775807L || c == 0 || c == j2) {
                z = false;
            }
            z2 = z;
        }
        if (z2) {
            this.f26700a.mo20626g(j2);
        }
        C5211x xVar = this.f26708i;
        if (xVar != null) {
            xVar.mo17532h(j2);
        }
        for (int i = 0; i < this.f26701b.size(); i++) {
            this.f26701b.valueAt(i).mo19144d();
        }
    }

    /* renamed from: d */
    public void mo17581d(C4217n nVar) {
        this.f26709j = nVar;
    }

    /* renamed from: e */
    public int mo17582e(C4216m mVar, C4190a0 a0Var) throws IOException {
        C5917a.m34875h(this.f26709j);
        long b = mVar.mo17553b();
        int i = (b > -1 ? 1 : (b == -1 ? 0 : -1));
        if ((i != 0) && !this.f26703d.mo19201e()) {
            return this.f26703d.mo19202g(mVar, a0Var);
        }
        m32093g(b);
        C5211x xVar = this.f26708i;
        if (xVar != null && xVar.mo17528d()) {
            return this.f26708i.mo17527c(mVar, a0Var);
        }
        mVar.mo17560j();
        long f = i != 0 ? b - mVar.mo17557f() : -1;
        if ((f != -1 && f < 4) || !mVar.mo17556e(this.f26702c.mo20551d(), 0, 4, true)) {
            return -1;
        }
        this.f26702c.mo20546O(0);
        int m = this.f26702c.mo20560m();
        if (m == 441) {
            return -1;
        }
        if (m == 442) {
            mVar.mo17563p(this.f26702c.mo20551d(), 0, 10);
            this.f26702c.mo20546O(9);
            mVar.mo17561k((this.f26702c.mo20534C() & 7) + 14);
            return 0;
        } else if (m == 443) {
            mVar.mo17563p(this.f26702c.mo20551d(), 0, 2);
            this.f26702c.mo20546O(0);
            mVar.mo17561k(this.f26702c.mo20540I() + 6);
            return 0;
        } else if (((m & -256) >> 8) != 1) {
            mVar.mo17561k(1);
            return 0;
        } else {
            int i2 = m & 255;
            C5167a aVar = this.f26701b.get(i2);
            if (!this.f26704e) {
                if (aVar == null) {
                    C5193m mVar2 = null;
                    if (i2 == 189) {
                        mVar2 = new C5170c();
                        this.f26705f = true;
                        this.f26707h = mVar.mo17554c();
                    } else if ((i2 & 224) == 192) {
                        mVar2 = new C5207t();
                        this.f26705f = true;
                        this.f26707h = mVar.mo17554c();
                    } else if ((i2 & 240) == 224) {
                        mVar2 = new C5194n();
                        this.f26706g = true;
                        this.f26707h = mVar.mo17554c();
                    }
                    if (mVar2 != null) {
                        mVar2.mo19150d(this.f26709j, new C5183i0.C5187d(i2, 256));
                        aVar = new C5167a(mVar2, this.f26700a);
                        this.f26701b.put(i2, aVar);
                    }
                }
                if (mVar.mo17554c() > ((!this.f26705f || !this.f26706g) ? 1048576 : this.f26707h + 8192)) {
                    this.f26704e = true;
                    this.f26709j.mo6782n();
                }
            }
            mVar.mo17563p(this.f26702c.mo20551d(), 0, 2);
            this.f26702c.mo20546O(0);
            int I = this.f26702c.mo20540I() + 6;
            if (aVar == null) {
                mVar.mo17561k(I);
            } else {
                this.f26702c.mo20542K(I);
                mVar.readFully(this.f26702c.mo20551d(), 0, I);
                this.f26702c.mo20546O(6);
                aVar.mo19143a(this.f26702c);
                C5918a0 a0Var2 = this.f26702c;
                a0Var2.mo20545N(a0Var2.mo20549b());
            }
            return 0;
        }
    }

    /* renamed from: h */
    public boolean mo17583h(C4216m mVar) throws IOException {
        byte[] bArr = new byte[14];
        mVar.mo17563p(bArr, 0, 14);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        mVar.mo17558g(bArr[13] & 7);
        mVar.mo17563p(bArr, 0, 3);
        if (1 == (((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255))) {
            return true;
        }
        return false;
    }

    public C5166a0(C5940i0 i0Var) {
        this.f26700a = i0Var;
        this.f26702c = new C5918a0(4096);
        this.f26701b = new SparseArray<>();
        this.f26703d = new C5214y();
    }
}
