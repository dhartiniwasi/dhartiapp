package p052g3;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import p004a2.C0079u1;
import p030d2.C4035m;
import p031d3.C4072n;
import p037e2.C4202f;
import p037e2.C4216m;
import p052g3.C4366f;
import p059h3.C4449g;
import p127r2.C5432a;
import p155v3.C5828l;
import p155v3.C5835o;
import p155v3.C5837p;
import p160w2.C5903h;
import p160w2.C5911l;
import p161w3.C5917a;
import p161w3.C5918a0;
import p161w3.C5940i0;
import p161w3.C5947k0;
import p177z1.C6272r1;
import p182a7.C6408b;
import p190b7.C6685q;

/* renamed from: g3.i */
/* compiled from: HlsMediaChunk */
final class C4374i extends C4072n {

    /* renamed from: M */
    private static final AtomicInteger f24354M = new AtomicInteger();

    /* renamed from: A */
    private final boolean f24355A;

    /* renamed from: B */
    private final boolean f24356B;

    /* renamed from: C */
    private final C0079u1 f24357C;

    /* renamed from: D */
    private C4375j f24358D;

    /* renamed from: E */
    private C4378p f24359E;

    /* renamed from: F */
    private int f24360F;

    /* renamed from: G */
    private boolean f24361G;

    /* renamed from: H */
    private volatile boolean f24362H;

    /* renamed from: I */
    private boolean f24363I;

    /* renamed from: J */
    private C6685q<Integer> f24364J;

    /* renamed from: K */
    private boolean f24365K;

    /* renamed from: L */
    private boolean f24366L;

    /* renamed from: k */
    public final int f24367k;

    /* renamed from: l */
    public final int f24368l;

    /* renamed from: m */
    public final Uri f24369m;

    /* renamed from: n */
    public final boolean f24370n;

    /* renamed from: o */
    public final int f24371o;

    /* renamed from: p */
    private final C5828l f24372p;

    /* renamed from: q */
    private final C5837p f24373q;

    /* renamed from: r */
    private final C4375j f24374r;

    /* renamed from: s */
    private final boolean f24375s;

    /* renamed from: t */
    private final boolean f24376t;

    /* renamed from: u */
    private final C5940i0 f24377u;

    /* renamed from: v */
    private final C4373h f24378v;

    /* renamed from: w */
    private final List<C6272r1> f24379w;

    /* renamed from: x */
    private final C4035m f24380x;

    /* renamed from: y */
    private final C5903h f24381y;

    /* renamed from: z */
    private final C5918a0 f24382z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C4374i(C4373h hVar, C5828l lVar, C5837p pVar, C6272r1 r1Var, boolean z, C5828l lVar2, C5837p pVar2, boolean z2, Uri uri, List<C6272r1> list, int i, Object obj, long j, long j2, long j3, int i2, boolean z3, int i3, boolean z4, boolean z5, C5940i0 i0Var, C4035m mVar, C4375j jVar, C5903h hVar2, C5918a0 a0Var, boolean z6, C0079u1 u1Var) {
        super(lVar, pVar, r1Var, i, obj, j, j2, j3);
        C5837p pVar3 = pVar2;
        this.f24355A = z;
        this.f24371o = i2;
        this.f24366L = z3;
        this.f24368l = i3;
        this.f24373q = pVar3;
        this.f24372p = lVar2;
        this.f24361G = pVar3 != null;
        this.f24356B = z2;
        this.f24369m = uri;
        this.f24375s = z5;
        this.f24377u = i0Var;
        this.f24376t = z4;
        this.f24378v = hVar;
        this.f24379w = list;
        this.f24380x = mVar;
        this.f24374r = jVar;
        this.f24381y = hVar2;
        this.f24382z = a0Var;
        this.f24370n = z6;
        this.f24357C = u1Var;
        this.f24364J = C6685q.m38445x();
        this.f24367k = f24354M.getAndIncrement();
    }

    /* renamed from: i */
    private static C5828l m29065i(C5828l lVar, byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return lVar;
        }
        C5917a.m34872e(bArr2);
        return new C4360a(lVar, bArr, bArr2);
    }

    /* renamed from: j */
    public static C4374i m29066j(C4373h hVar, C5828l lVar, C6272r1 r1Var, long j, C4449g gVar, C4366f.C4371e eVar, Uri uri, List<C6272r1> list, int i, Object obj, boolean z, C4388s sVar, C4374i iVar, byte[] bArr, byte[] bArr2, boolean z2, C0079u1 u1Var) {
        boolean z3;
        boolean z4;
        C5837p pVar;
        C5828l lVar2;
        C5918a0 a0Var;
        C5903h hVar2;
        C4375j jVar;
        C5828l lVar3 = lVar;
        C4449g gVar2 = gVar;
        C4366f.C4371e eVar2 = eVar;
        C4374i iVar2 = iVar;
        byte[] bArr3 = bArr;
        byte[] bArr4 = bArr2;
        C4449g.C4454e eVar3 = eVar2.f24349a;
        C5837p a = new C5837p.C5839b().mo20380i(C5947k0.m35055e(gVar2.f24757a, eVar3.f24720a)).mo20379h(eVar3.f24728i).mo20378g(eVar3.f24729r).mo20373b(eVar2.f24352d ? 8 : 0).mo20372a();
        boolean z5 = bArr3 != null;
        C5828l i2 = m29065i(lVar3, bArr3, z5 ? m29068l((String) C5917a.m34872e(eVar3.f24727h)) : null);
        C4449g.C4453d dVar = eVar3.f24721b;
        if (dVar != null) {
            boolean z6 = bArr4 != null;
            byte[] l = z6 ? m29068l((String) C5917a.m34872e(dVar.f24727h)) : null;
            z3 = z5;
            pVar = new C5837p(C5947k0.m35055e(gVar2.f24757a, dVar.f24720a), dVar.f24728i, dVar.f24729r);
            lVar2 = m29065i(lVar3, bArr4, l);
            z4 = z6;
        } else {
            z3 = z5;
            lVar2 = null;
            pVar = null;
            z4 = false;
        }
        long j2 = j + eVar3.f24724e;
        long j3 = j2 + eVar3.f24722c;
        int i3 = gVar2.f24700j + eVar3.f24723d;
        if (iVar2 != null) {
            C5837p pVar2 = iVar2.f24373q;
            boolean z7 = pVar == pVar2 || (pVar != null && pVar2 != null && pVar.f28881a.equals(pVar2.f28881a) && pVar.f28887g == iVar2.f24373q.f28887g);
            boolean z8 = uri.equals(iVar2.f24369m) && iVar2.f24363I;
            C5903h hVar3 = iVar2.f24381y;
            hVar2 = hVar3;
            a0Var = iVar2.f24382z;
            jVar = (!z7 || !z8 || iVar2.f24365K || iVar2.f24368l != i3) ? null : iVar2.f24358D;
        } else {
            Uri uri2 = uri;
            hVar2 = new C5903h();
            a0Var = new C5918a0(10);
            jVar = null;
        }
        return new C4374i(hVar, i2, a, r1Var, z3, lVar2, pVar, z4, uri, list, i, obj, j2, j3, eVar2.f24350b, eVar2.f24351c, !eVar2.f24352d, i3, eVar3.f24730s, z, sVar.mo17894a(i3), eVar3.f24725f, jVar, hVar2, a0Var, z2, u1Var);
    }

    /* renamed from: k */
    private void m29067k(C5828l lVar, C5837p pVar, boolean z, boolean z2) throws IOException {
        C5837p pVar2;
        C4202f u;
        long c;
        long j;
        boolean z3 = false;
        if (z) {
            if (this.f24360F != 0) {
                z3 = true;
            }
            pVar2 = pVar;
        } else {
            pVar2 = pVar.mo20369e((long) this.f24360F);
        }
        try {
            u = m29073u(lVar, pVar2, z2);
            if (z3) {
                u.mo17561k(this.f24360F);
            }
            do {
                if (this.f24362H || !this.f24358D.mo17799b(u)) {
                    break;
                }
                break;
                break;
            } while (!this.f24358D.mo17799b(u));
            break;
            c = u.mo17554c();
            j = pVar.f28887g;
        } catch (EOFException e) {
            if ((this.f23165d.f30236e & 16384) != 0) {
                this.f24358D.mo17798a();
                c = u.mo17554c();
                j = pVar.f28887g;
            } else {
                throw e;
            }
        } catch (Throwable th) {
            C5835o.m34625a(lVar);
            throw th;
        }
        this.f24360F = (int) (c - j);
        C5835o.m34625a(lVar);
    }

    /* renamed from: l */
    private static byte[] m29068l(String str) {
        if (C6408b.m37506e(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    /* renamed from: p */
    private static boolean m29069p(C4366f.C4371e eVar, C4449g gVar) {
        C4449g.C4454e eVar2 = eVar.f24349a;
        if (eVar2 instanceof C4449g.C4451b) {
            return ((C4449g.C4451b) eVar2).f24713t || (eVar.f24351c == 0 && gVar.f24759c);
        }
        return gVar.f24759c;
    }

    /* renamed from: r */
    private void m29070r() throws IOException {
        m29067k(this.f23170i, this.f23163b, this.f24355A, true);
    }

    /* renamed from: s */
    private void m29071s() throws IOException {
        if (this.f24361G) {
            C5917a.m34872e(this.f24372p);
            C5917a.m34872e(this.f24373q);
            m29067k(this.f24372p, this.f24373q, this.f24356B, false);
            this.f24360F = 0;
            this.f24361G = false;
        }
    }

    /* renamed from: t */
    private long m29072t(C4216m mVar) throws IOException {
        mVar.mo17560j();
        try {
            this.f24382z.mo20542K(10);
            mVar.mo17563p(this.f24382z.mo20551d(), 0, 10);
            if (this.f24382z.mo20537F() != 4801587) {
                return -9223372036854775807L;
            }
            this.f24382z.mo20547P(3);
            int B = this.f24382z.mo20533B();
            int i = B + 10;
            if (i > this.f24382z.mo20549b()) {
                byte[] d = this.f24382z.mo20551d();
                this.f24382z.mo20542K(i);
                System.arraycopy(d, 0, this.f24382z.mo20551d(), 0, 10);
            }
            mVar.mo17563p(this.f24382z.mo20551d(), 10, B);
            C5432a e = this.f24381y.mo20495e(this.f24382z.mo20551d(), B);
            if (e == null) {
                return -9223372036854775807L;
            }
            int d2 = e.mo19696d();
            for (int i2 = 0; i2 < d2; i2++) {
                C5432a.C5434b c = e.mo19695c(i2);
                if (c instanceof C5911l) {
                    C5911l lVar = (C5911l) c;
                    if ("com.apple.streaming.transportStreamTimestamp".equals(lVar.f29041b)) {
                        System.arraycopy(lVar.f29042c, 0, this.f24382z.mo20551d(), 0, 8);
                        this.f24382z.mo20546O(0);
                        this.f24382z.mo20545N(8);
                        return this.f24382z.mo20569v() & 8589934591L;
                    }
                }
            }
            return -9223372036854775807L;
        } catch (EOFException unused) {
        }
    }

    /* renamed from: u */
    private C4202f m29073u(C5828l lVar, C5837p pVar, boolean z) throws IOException {
        C4375j jVar;
        long j;
        long o = lVar.mo6819o(pVar);
        if (z) {
            try {
                this.f24377u.mo20627h(this.f24375s, this.f23168g);
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            }
        }
        C4202f fVar = new C4202f(lVar, pVar.f28887g, o);
        if (this.f24358D == null) {
            long t = m29072t(fVar);
            fVar.mo17560j();
            C4375j jVar2 = this.f24374r;
            if (jVar2 != null) {
                jVar = jVar2.mo17803f();
            } else {
                jVar = this.f24378v.mo17805a(pVar.f28881a, this.f23165d, this.f24379w, this.f24377u, lVar.mo6816i(), fVar, this.f24357C);
            }
            this.f24358D = jVar;
            if (jVar.mo17800c()) {
                C4378p pVar2 = this.f24359E;
                if (t != -9223372036854775807L) {
                    j = this.f24377u.mo20622b(t);
                } else {
                    j = this.f23168g;
                }
                pVar2.mo17866m0(j);
            } else {
                this.f24359E.mo17866m0(0);
            }
            this.f24359E.mo17854Y();
            this.f24358D.mo17801d(this.f24359E);
        }
        this.f24359E.mo17863j0(this.f24380x);
        return fVar;
    }

    /* renamed from: w */
    public static boolean m29074w(C4374i iVar, Uri uri, C4449g gVar, C4366f.C4371e eVar, long j) {
        if (iVar == null) {
            return false;
        }
        if (uri.equals(iVar.f24369m) && iVar.f24363I) {
            return false;
        }
        long j2 = j + eVar.f24349a.f24724e;
        if (!m29069p(eVar, gVar) || j2 < iVar.f23169h) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public void mo6786b() throws IOException {
        C4375j jVar;
        C5917a.m34872e(this.f24359E);
        if (this.f24358D == null && (jVar = this.f24374r) != null && jVar.mo17802e()) {
            this.f24358D = this.f24374r;
            this.f24361G = false;
        }
        m29071s();
        if (!this.f24362H) {
            if (!this.f24376t) {
                m29070r();
            }
            this.f24363I = !this.f24362H;
        }
    }

    /* renamed from: c */
    public void mo6787c() {
        this.f24362H = true;
    }

    /* renamed from: h */
    public boolean mo17297h() {
        return this.f24363I;
    }

    /* renamed from: m */
    public int mo17833m(int i) {
        C5917a.m34873f(!this.f24370n);
        if (i >= this.f24364J.size()) {
            return 0;
        }
        return this.f24364J.get(i).intValue();
    }

    /* renamed from: n */
    public void mo17834n(C4378p pVar, C6685q<Integer> qVar) {
        this.f24359E = pVar;
        this.f24364J = qVar;
    }

    /* renamed from: o */
    public void mo17835o() {
        this.f24365K = true;
    }

    /* renamed from: q */
    public boolean mo17836q() {
        return this.f24366L;
    }

    /* renamed from: v */
    public void mo17837v() {
        this.f24366L = true;
    }
}
