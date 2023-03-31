package com.google.android.exoplayer2.source.hls;

import android.os.Looper;
import java.io.IOException;
import java.util.List;
import p005a3.C0093c;
import p015b3.C1687a;
import p015b3.C1700e0;
import p015b3.C1712i;
import p015b3.C1729l;
import p015b3.C1765u;
import p015b3.C1767u0;
import p015b3.C1772x;
import p030d2.C4001b0;
import p030d2.C4033l;
import p030d2.C4052y;
import p052g3.C4362c;
import p052g3.C4372g;
import p052g3.C4373h;
import p052g3.C4376k;
import p059h3.C4442a;
import p059h3.C4443c;
import p059h3.C4447e;
import p059h3.C4449g;
import p059h3.C4456h;
import p059h3.C4463k;
import p059h3.C4464l;
import p155v3.C5789b;
import p155v3.C5804g0;
import p155v3.C5828l;
import p155v3.C5840p0;
import p155v3.C5853x;
import p161w3.C5917a;
import p161w3.C5953m0;
import p177z1.C6260o1;
import p177z1.C6300z1;

public final class HlsMediaSource extends C1687a implements C4464l.C4469e {

    /* renamed from: A */
    private final C6300z1 f5867A;

    /* renamed from: B */
    private C6300z1.C6309g f5868B;

    /* renamed from: C */
    private C5840p0 f5869C;

    /* renamed from: h */
    private final C4373h f5870h;

    /* renamed from: i */
    private final C6300z1.C6311h f5871i;

    /* renamed from: r */
    private final C4372g f5872r;

    /* renamed from: s */
    private final C1712i f5873s;

    /* renamed from: t */
    private final C4052y f5874t;

    /* renamed from: u */
    private final C5804g0 f5875u;

    /* renamed from: v */
    private final boolean f5876v;

    /* renamed from: w */
    private final int f5877w;

    /* renamed from: x */
    private final boolean f5878x;

    /* renamed from: y */
    private final C4464l f5879y;

    /* renamed from: z */
    private final long f5880z;

    public static final class Factory implements C1772x.C1773a {

        /* renamed from: a */
        private final C4372g f5881a;

        /* renamed from: b */
        private C4373h f5882b;

        /* renamed from: c */
        private C4463k f5883c;

        /* renamed from: d */
        private C4464l.C4465a f5884d;

        /* renamed from: e */
        private C1712i f5885e;

        /* renamed from: f */
        private C4001b0 f5886f;

        /* renamed from: g */
        private C5804g0 f5887g;

        /* renamed from: h */
        private boolean f5888h;

        /* renamed from: i */
        private int f5889i;

        /* renamed from: j */
        private boolean f5890j;

        /* renamed from: k */
        private long f5891k;

        public Factory(C5828l.C5829a aVar) {
            this((C4372g) new C4362c(aVar));
        }

        /* renamed from: a */
        public HlsMediaSource mo7791a(C6300z1 z1Var) {
            C6300z1 z1Var2 = z1Var;
            C5917a.m34872e(z1Var2.f30391b);
            C4463k kVar = this.f5883c;
            List<C0093c> list = z1Var2.f30391b.f30459e;
            if (!list.isEmpty()) {
                kVar = new C4447e(kVar, list);
            }
            C4372g gVar = this.f5881a;
            C4373h hVar = this.f5882b;
            C1712i iVar = this.f5885e;
            C4052y a = this.f5886f.mo17162a(z1Var2);
            C5804g0 g0Var = this.f5887g;
            return new HlsMediaSource(z1Var, gVar, hVar, iVar, a, g0Var, this.f5884d.mo18010a(this.f5881a, g0Var, kVar), this.f5891k, this.f5888h, this.f5889i, this.f5890j);
        }

        public Factory(C4372g gVar) {
            this.f5881a = (C4372g) C5917a.m34872e(gVar);
            this.f5886f = new C4033l();
            this.f5883c = new C4442a();
            this.f5884d = C4443c.f24664x;
            this.f5882b = C4373h.f24353a;
            this.f5887g = new C5853x();
            this.f5885e = new C1729l();
            this.f5889i = 1;
            this.f5891k = -9223372036854775807L;
            this.f5888h = true;
        }
    }

    static {
        C6260o1.m36802a("goog.exo.hls");
    }

    /* renamed from: F */
    private C1767u0 m8924F(C4449g gVar, long j, long j2, C2031a aVar) {
        long j3;
        C4449g gVar2 = gVar;
        long e = gVar2.f24698h - this.f5879y.mo17979e();
        long j4 = gVar2.f24705o ? e + gVar2.f24711u : -9223372036854775807L;
        long J = m8928J(gVar);
        long j5 = this.f5868B.f30445a;
        if (j5 != -9223372036854775807L) {
            j3 = C5953m0.m35071B0(j5);
        } else {
            j3 = m8930L(gVar2, J);
        }
        m8931M(gVar2, C5953m0.m35154r(j3, J, gVar2.f24711u + J));
        return new C1767u0(j, j2, -9223372036854775807L, j4, gVar2.f24711u, e, m8929K(gVar2, J), true, !gVar2.f24705o, gVar2.f24694d == 2 && gVar2.f24696f, aVar, this.f5867A, this.f5868B);
    }

    /* renamed from: G */
    private C1767u0 m8925G(C4449g gVar, long j, long j2, C2031a aVar) {
        long j3;
        C4449g gVar2 = gVar;
        if (gVar2.f24695e == -9223372036854775807L || gVar2.f24708r.isEmpty()) {
            j3 = 0;
        } else {
            if (!gVar2.f24697g) {
                long j4 = gVar2.f24695e;
                if (j4 != gVar2.f24711u) {
                    j3 = m8927I(gVar2.f24708r, j4).f24724e;
                }
            }
            j3 = gVar2.f24695e;
        }
        long j5 = gVar2.f24711u;
        return new C1767u0(j, j2, -9223372036854775807L, j5, j5, 0, j3, true, false, true, aVar, this.f5867A, (C6300z1.C6309g) null);
    }

    /* renamed from: H */
    private static C4449g.C4451b m8926H(List<C4449g.C4451b> list, long j) {
        C4449g.C4451b bVar = null;
        for (int i = 0; i < list.size(); i++) {
            C4449g.C4451b bVar2 = list.get(i);
            long j2 = bVar2.f24724e;
            if (j2 <= j && bVar2.f24713t) {
                bVar = bVar2;
            } else if (j2 > j) {
                break;
            }
        }
        return bVar;
    }

    /* renamed from: I */
    private static C4449g.C4453d m8927I(List<C4449g.C4453d> list, long j) {
        return list.get(C5953m0.m35130f(list, Long.valueOf(j), true, true));
    }

    /* renamed from: J */
    private long m8928J(C4449g gVar) {
        if (gVar.f24706p) {
            return C5953m0.m35071B0(C5953m0.m35121a0(this.f5880z)) - gVar.mo17999e();
        }
        return 0;
    }

    /* renamed from: K */
    private long m8929K(C4449g gVar, long j) {
        long j2 = gVar.f24695e;
        if (j2 == -9223372036854775807L) {
            j2 = (gVar.f24711u + j) - C5953m0.m35071B0(this.f5868B.f30445a);
        }
        if (gVar.f24697g) {
            return j2;
        }
        C4449g.C4451b H = m8926H(gVar.f24709s, j2);
        if (H != null) {
            return H.f24724e;
        }
        if (gVar.f24708r.isEmpty()) {
            return 0;
        }
        C4449g.C4453d I = m8927I(gVar.f24708r, j2);
        C4449g.C4451b H2 = m8926H(I.f24719u, j2);
        if (H2 != null) {
            return H2.f24724e;
        }
        return I.f24724e;
    }

    /* renamed from: L */
    private static long m8930L(C4449g gVar, long j) {
        long j2;
        C4449g.C4455f fVar = gVar.f24712v;
        long j3 = gVar.f24695e;
        if (j3 != -9223372036854775807L) {
            j2 = gVar.f24711u - j3;
        } else {
            long j4 = fVar.f24734d;
            if (j4 == -9223372036854775807L || gVar.f24704n == -9223372036854775807L) {
                long j5 = fVar.f24733c;
                if (j5 != -9223372036854775807L) {
                    j2 = j5;
                } else {
                    j2 = gVar.f24703m * 3;
                }
            } else {
                j2 = j4;
            }
        }
        return j2 + j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0048  */
    /* renamed from: M */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m8931M(p059h3.C4449g r6, long r7) {
        /*
            r5 = this;
            z1.z1 r0 = r5.f5867A
            z1.z1$g r0 = r0.f30393d
            float r1 = r0.f30448d
            r2 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L_0x0028
            float r0 = r0.f30449e
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0028
            h3.g$f r6 = r6.f24712v
            long r0 = r6.f24733c
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0028
            long r0 = r6.f24734d
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 != 0) goto L_0x0028
            r6 = 1
            goto L_0x0029
        L_0x0028:
            r6 = 0
        L_0x0029:
            z1.z1$g$a r0 = new z1.z1$g$a
            r0.<init>()
            long r7 = p161w3.C5953m0.m35117Y0(r7)
            z1.z1$g$a r7 = r0.mo21616k(r7)
            r8 = 1065353216(0x3f800000, float:1.0)
            if (r6 == 0) goto L_0x003d
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0041
        L_0x003d:
            z1.z1$g r0 = r5.f5868B
            float r0 = r0.f30448d
        L_0x0041:
            z1.z1$g$a r7 = r7.mo21615j(r0)
            if (r6 == 0) goto L_0x0048
            goto L_0x004c
        L_0x0048:
            z1.z1$g r6 = r5.f5868B
            float r8 = r6.f30449e
        L_0x004c:
            z1.z1$g$a r6 = r7.mo21613h(r8)
            z1.z1$g r6 = r6.mo21611f()
            r5.f5868B = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.HlsMediaSource.m8931M(h3.g, long):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public void mo6651C(C5840p0 p0Var) {
        this.f5869C = p0Var;
        this.f5874t.mo17207H();
        this.f5874t.mo17210c((Looper) C5917a.m34872e(Looper.myLooper()), mo6649A());
        this.f5879y.mo17977c(this.f5871i.f30455a, mo6667w((C1772x.C1774b) null), this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public void mo6653E() {
        this.f5879y.stop();
        this.f5874t.mo17208a();
    }

    /* renamed from: d */
    public void mo6707d(C1765u uVar) {
        ((C4376k) uVar).mo17843z();
    }

    /* renamed from: e */
    public void mo7790e(C4449g gVar) {
        C1767u0 u0Var;
        long Y0 = gVar.f24706p ? C5953m0.m35117Y0(gVar.f24698h) : -9223372036854775807L;
        int i = gVar.f24694d;
        long j = (i == 2 || i == 1) ? Y0 : -9223372036854775807L;
        C2031a aVar = new C2031a((C4456h) C5917a.m34872e(this.f5879y.mo17982h()), gVar);
        if (this.f5879y.mo17981g()) {
            u0Var = m8924F(gVar, j, Y0, aVar);
        } else {
            u0Var = m8925G(gVar, j, Y0, aVar);
        }
        mo6652D(u0Var);
    }

    /* renamed from: i */
    public C6300z1 mo6708i() {
        return this.f5867A;
    }

    /* renamed from: k */
    public C1765u mo6709k(C1772x.C1774b bVar, C5789b bVar2, long j) {
        C1700e0.C1701a w = mo6667w(bVar);
        return new C4376k(this.f5870h, this.f5879y, this.f5872r, this.f5869C, this.f5874t, mo6665u(bVar), this.f5875u, w, bVar2, this.f5873s, this.f5876v, this.f5877w, this.f5878x, mo6649A());
    }

    /* renamed from: l */
    public void mo6710l() throws IOException {
        this.f5879y.mo17984k();
    }

    private HlsMediaSource(C6300z1 z1Var, C4372g gVar, C4373h hVar, C1712i iVar, C4052y yVar, C5804g0 g0Var, C4464l lVar, long j, boolean z, int i, boolean z2) {
        this.f5871i = (C6300z1.C6311h) C5917a.m34872e(z1Var.f30391b);
        this.f5867A = z1Var;
        this.f5868B = z1Var.f30393d;
        this.f5872r = gVar;
        this.f5870h = hVar;
        this.f5873s = iVar;
        this.f5874t = yVar;
        this.f5875u = g0Var;
        this.f5879y = lVar;
        this.f5880z = j;
        this.f5876v = z;
        this.f5877w = i;
        this.f5878x = z2;
    }
}
