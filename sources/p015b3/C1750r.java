package p015b3;

import java.io.IOException;
import p015b3.C1765u;
import p015b3.C1772x;
import p149u3.C5735s;
import p155v3.C5789b;
import p161w3.C5917a;
import p161w3.C5953m0;
import p177z1.C6229i3;

/* renamed from: b3.r */
/* compiled from: MaskingMediaPeriod */
public final class C1750r implements C1765u, C1765u.C1766a {

    /* renamed from: a */
    public final C1772x.C1774b f5210a;

    /* renamed from: b */
    private final long f5211b;

    /* renamed from: c */
    private final C5789b f5212c;

    /* renamed from: d */
    private C1772x f5213d;

    /* renamed from: e */
    private C1765u f5214e;

    /* renamed from: f */
    private C1765u.C1766a f5215f;

    /* renamed from: g */
    private C1751a f5216g;

    /* renamed from: h */
    private boolean f5217h;

    /* renamed from: i */
    private long f5218i = -9223372036854775807L;

    /* renamed from: b3.r$a */
    /* compiled from: MaskingMediaPeriod */
    public interface C1751a {
        /* renamed from: a */
        void mo6866a(C1772x.C1774b bVar);

        /* renamed from: b */
        void mo6867b(C1772x.C1774b bVar, IOException iOException);
    }

    public C1750r(C1772x.C1774b bVar, C5789b bVar2, long j) {
        this.f5210a = bVar;
        this.f5212c = bVar2;
        this.f5211b = j;
    }

    /* renamed from: o */
    private long m8241o(long j) {
        long j2 = this.f5218i;
        return j2 != -9223372036854775807L ? j2 : j;
    }

    /* renamed from: a */
    public void mo6859a(C1772x.C1774b bVar) {
        long o = m8241o(this.f5211b);
        C1765u k = ((C1772x) C5917a.m34872e(this.f5213d)).mo6709k(bVar, this.f5212c, o);
        this.f5214e = k;
        if (this.f5215f != null) {
            k.mo6695r(this, o);
        }
    }

    /* renamed from: b */
    public void mo6680b(C1765u uVar) {
        ((C1765u.C1766a) C5953m0.m35138j(this.f5215f)).mo6680b(this);
        C1751a aVar = this.f5216g;
        if (aVar != null) {
            aVar.mo6866a(this.f5210a);
        }
    }

    /* renamed from: c */
    public long mo6681c(long j, C6229i3 i3Var) {
        return ((C1765u) C5953m0.m35138j(this.f5214e)).mo6681c(j, i3Var);
    }

    /* renamed from: d */
    public long mo6682d() {
        return ((C1765u) C5953m0.m35138j(this.f5214e)).mo6682d();
    }

    /* renamed from: e */
    public boolean mo6683e(long j) {
        C1765u uVar = this.f5214e;
        return uVar != null && uVar.mo6683e(j);
    }

    /* renamed from: g */
    public long mo6685g() {
        return ((C1765u) C5953m0.m35138j(this.f5214e)).mo6685g();
    }

    /* renamed from: h */
    public void mo6686h(long j) {
        ((C1765u) C5953m0.m35138j(this.f5214e)).mo6686h(j);
    }

    /* renamed from: i */
    public long mo6687i(C5735s[] sVarArr, boolean[] zArr, C1749q0[] q0VarArr, boolean[] zArr2, long j) {
        long j2;
        long j3 = this.f5218i;
        if (j3 == -9223372036854775807L || j != this.f5211b) {
            j2 = j;
        } else {
            this.f5218i = -9223372036854775807L;
            j2 = j3;
        }
        return ((C1765u) C5953m0.m35138j(this.f5214e)).mo6687i(sVarArr, zArr, q0VarArr, zArr2, j2);
    }

    public boolean isLoading() {
        C1765u uVar = this.f5214e;
        return uVar != null && uVar.isLoading();
    }

    /* renamed from: j */
    public long mo6860j() {
        return this.f5218i;
    }

    /* renamed from: k */
    public void mo6690k() throws IOException {
        try {
            C1765u uVar = this.f5214e;
            if (uVar != null) {
                uVar.mo6690k();
                return;
            }
            C1772x xVar = this.f5213d;
            if (xVar != null) {
                xVar.mo6710l();
            }
        } catch (IOException e) {
            C1751a aVar = this.f5216g;
            if (aVar == null) {
                throw e;
            } else if (!this.f5217h) {
                this.f5217h = true;
                aVar.mo6867b(this.f5210a, e);
            }
        }
    }

    /* renamed from: m */
    public long mo6691m(long j) {
        return ((C1765u) C5953m0.m35138j(this.f5214e)).mo6691m(j);
    }

    /* renamed from: n */
    public long mo6861n() {
        return this.f5211b;
    }

    /* renamed from: p */
    public long mo6694p() {
        return ((C1765u) C5953m0.m35138j(this.f5214e)).mo6694p();
    }

    /* renamed from: q */
    public void mo6684f(C1765u uVar) {
        ((C1765u.C1766a) C5953m0.m35138j(this.f5215f)).mo6684f(this);
    }

    /* renamed from: r */
    public void mo6695r(C1765u.C1766a aVar, long j) {
        this.f5215f = aVar;
        C1765u uVar = this.f5214e;
        if (uVar != null) {
            uVar.mo6695r(this, m8241o(this.f5211b));
        }
    }

    /* renamed from: s */
    public C1780z0 mo6696s() {
        return ((C1765u) C5953m0.m35138j(this.f5214e)).mo6696s();
    }

    /* renamed from: t */
    public void mo6697t(long j, boolean z) {
        ((C1765u) C5953m0.m35138j(this.f5214e)).mo6697t(j, z);
    }

    /* renamed from: u */
    public void mo6863u(long j) {
        this.f5218i = j;
    }

    /* renamed from: v */
    public void mo6864v() {
        if (this.f5214e != null) {
            ((C1772x) C5917a.m34872e(this.f5213d)).mo6707d(this.f5214e);
        }
    }

    /* renamed from: w */
    public void mo6865w(C1772x xVar) {
        C5917a.m34873f(this.f5213d == null);
        this.f5213d = xVar;
    }
}
