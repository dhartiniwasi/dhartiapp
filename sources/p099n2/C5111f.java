package p099n2;

import java.io.IOException;
import p037e2.C4216m;
import p037e2.C4219o;
import p161w3.C5917a;
import p161w3.C5918a0;
import p177z1.C6249m2;

/* renamed from: n2.f */
/* compiled from: OggPageHeader */
final class C5111f {

    /* renamed from: a */
    public int f26588a;

    /* renamed from: b */
    public int f26589b;

    /* renamed from: c */
    public long f26590c;

    /* renamed from: d */
    public long f26591d;

    /* renamed from: e */
    public long f26592e;

    /* renamed from: f */
    public long f26593f;

    /* renamed from: g */
    public int f26594g;

    /* renamed from: h */
    public int f26595h;

    /* renamed from: i */
    public int f26596i;

    /* renamed from: j */
    public final int[] f26597j = new int[255];

    /* renamed from: k */
    private final C5918a0 f26598k = new C5918a0(255);

    C5111f() {
    }

    /* renamed from: a */
    public boolean mo19080a(C4216m mVar, boolean z) throws IOException {
        mo19081b();
        this.f26598k.mo20542K(27);
        if (!C4219o.m28481b(mVar, this.f26598k.mo20551d(), 0, 27, z) || this.f26598k.mo20536E() != 1332176723) {
            return false;
        }
        int C = this.f26598k.mo20534C();
        this.f26588a = C;
        if (C == 0) {
            this.f26589b = this.f26598k.mo20534C();
            this.f26590c = this.f26598k.mo20564q();
            this.f26591d = this.f26598k.mo20566s();
            this.f26592e = this.f26598k.mo20566s();
            this.f26593f = this.f26598k.mo20566s();
            int C2 = this.f26598k.mo20534C();
            this.f26594g = C2;
            this.f26595h = C2 + 27;
            this.f26598k.mo20542K(C2);
            if (!C4219o.m28481b(mVar, this.f26598k.mo20551d(), 0, this.f26594g, z)) {
                return false;
            }
            for (int i = 0; i < this.f26594g; i++) {
                this.f26597j[i] = this.f26598k.mo20534C();
                this.f26596i += this.f26597j[i];
            }
            return true;
        } else if (z) {
            return false;
        } else {
            throw C6249m2.m36664d("unsupported bit stream revision");
        }
    }

    /* renamed from: b */
    public void mo19081b() {
        this.f26588a = 0;
        this.f26589b = 0;
        this.f26590c = 0;
        this.f26591d = 0;
        this.f26592e = 0;
        this.f26593f = 0;
        this.f26594g = 0;
        this.f26595h = 0;
        this.f26596i = 0;
    }

    /* renamed from: c */
    public boolean mo19082c(C4216m mVar) throws IOException {
        return mo19083d(mVar, -1);
    }

    /* renamed from: d */
    public boolean mo19083d(C4216m mVar, long j) throws IOException {
        int i;
        C5917a.m34868a(mVar.mo17554c() == mVar.mo17557f());
        this.f26598k.mo20542K(4);
        while (true) {
            i = (j > -1 ? 1 : (j == -1 ? 0 : -1));
            if ((i == 0 || mVar.mo17554c() + 4 < j) && C4219o.m28481b(mVar, this.f26598k.mo20551d(), 0, 4, true)) {
                this.f26598k.mo20546O(0);
                if (this.f26598k.mo20536E() == 1332176723) {
                    mVar.mo17560j();
                    return true;
                }
                mVar.mo17561k(1);
            }
        }
        do {
            if ((i != 0 && mVar.mo17554c() >= j) || mVar.mo17552a(1) == -1) {
                return false;
            }
            break;
        } while (mVar.mo17552a(1) == -1);
        return false;
    }
}
