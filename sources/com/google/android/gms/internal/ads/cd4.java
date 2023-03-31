package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class cd4 extends se4 implements e74 {

    /* renamed from: Q0 */
    private final Context f7682Q0;
    /* access modifiers changed from: private */

    /* renamed from: R0 */
    public final rb4 f7683R0;

    /* renamed from: S0 */
    private final yb4 f7684S0;

    /* renamed from: T0 */
    private int f7685T0;

    /* renamed from: U0 */
    private boolean f7686U0;

    /* renamed from: V0 */
    private C2388g4 f7687V0;

    /* renamed from: W0 */
    private long f7688W0;

    /* renamed from: X0 */
    private boolean f7689X0;

    /* renamed from: Y0 */
    private boolean f7690Y0;

    /* renamed from: Z0 */
    private boolean f7691Z0;
    /* access modifiers changed from: private */

    /* renamed from: a1 */
    public v74 f7692a1;

    public cd4(Context context, me4 me4, ue4 ue4, boolean z, Handler handler, sb4 sb4, yb4 yb4) {
        super(1, me4, ue4, false, 44100.0f);
        this.f7682Q0 = context.getApplicationContext();
        this.f7684S0 = yb4;
        this.f7683R0 = new rb4(handler, sb4);
        yb4.mo14720i(new ad4(this, (zc4) null));
    }

    /* renamed from: I0 */
    private final void m10858I0() {
        long k = this.f7684S0.mo14722k(mo9159y());
        if (k != Long.MIN_VALUE) {
            if (!this.f7690Y0) {
                k = Math.max(this.f7688W0, k);
            }
            this.f7688W0 = k;
            this.f7690Y0 = false;
        }
    }

    /* renamed from: M0 */
    private final int m10861M0(pe4 pe4, C2388g4 g4Var) {
        int i;
        if (!"OMX.google.raw.decoder".equals(pe4.f15824a) || (i = gb2.f9812a) >= 24 || (i == 23 && gb2.m13190x(this.f7682Q0))) {
            return g4Var.f9674m;
        }
        return -1;
    }

    /* renamed from: N0 */
    private static List m10862N0(ue4 ue4, C2388g4 g4Var, boolean z, yb4 yb4) throws bf4 {
        pe4 d;
        String str = g4Var.f9673l;
        if (str == null) {
            return ua3.m21508w();
        }
        if (yb4.mo14727o(g4Var) && (d = if4.m14307d()) != null) {
            return ua3.m21509x(d);
        }
        List f = if4.m14309f(str, false, false);
        String e = if4.m14308e(g4Var);
        if (e == null) {
            return ua3.m21506u(f);
        }
        List f2 = if4.m14309f(e, false, false);
        ra3 q = ua3.m21502q();
        q.mo13702g(f);
        q.mo13702g(f2);
        return q.mo13703h();
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public final void mo9131B() {
        this.f7691Z0 = true;
        try {
            this.f7684S0.mo14712a();
            try {
                super.mo9131B();
            } finally {
                this.f7683R0.mo13741e(this.f17400J0);
            }
        } catch (Throwable th) {
            super.mo9131B();
            throw th;
        } finally {
            this.f7683R0.mo13741e(this.f17400J0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final void mo9132D(boolean z, boolean z2) throws u44 {
        super.mo9132D(z, z2);
        this.f7683R0.mo13742f(this.f17400J0);
        mo13089z();
        this.f7684S0.mo14719h(mo13064A());
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final void mo9133E(long j, boolean z) throws u44 {
        super.mo9133E(j, z);
        this.f7684S0.mo14712a();
        this.f7688W0 = j;
        this.f7689X0 = true;
        this.f7690Y0 = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public final void mo9134F() {
        try {
            super.mo9134F();
            if (this.f7691Z0) {
                this.f7691Z0 = false;
                this.f7684S0.mo14711W();
            }
        } catch (Throwable th) {
            if (this.f7691Z0) {
                this.f7691Z0 = false;
                this.f7684S0.mo14711W();
            }
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public final void mo9135G() {
        this.f7684S0.mo14709U();
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public final void mo9136H() {
        m10858I0();
        this.f7684S0.mo14714c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public final float mo9137J(float f, C2388g4 g4Var, C2388g4[] g4VarArr) {
        int i = -1;
        for (C2388g4 g4Var2 : g4VarArr) {
            int i2 = g4Var2.f9687z;
            if (i2 != -1) {
                i = Math.max(i, i2);
            }
        }
        if (i == -1) {
            return -1.0f;
        }
        return ((float) i) * f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public final int mo9138K(ue4 ue4, C2388g4 g4Var) throws bf4 {
        boolean z;
        int i = 128;
        if (!d90.m11368g(g4Var.f9673l)) {
            return 128;
        }
        int i2 = gb2.f9812a >= 21 ? 32 : 0;
        int i3 = g4Var.f9660E;
        boolean F0 = se4.m20288F0(g4Var);
        if (F0 && this.f7684S0.mo14727o(g4Var) && (i3 == 0 || if4.m14307d() != null)) {
            return i2 | 140;
        }
        if (("audio/raw".equals(g4Var.f9673l) && !this.f7684S0.mo14727o(g4Var)) || !this.f7684S0.mo14727o(gb2.m13167f(2, g4Var.f9686y, g4Var.f9687z))) {
            return 129;
        }
        List N0 = m10862N0(ue4, g4Var, false, this.f7684S0);
        if (N0.isEmpty()) {
            return 129;
        }
        if (!F0) {
            return 130;
        }
        pe4 pe4 = (pe4) N0.get(0);
        boolean d = pe4.mo13263d(g4Var);
        if (!d) {
            int i4 = 1;
            while (true) {
                if (i4 >= N0.size()) {
                    break;
                }
                pe4 pe42 = (pe4) N0.get(i4);
                if (pe42.mo13263d(g4Var)) {
                    pe4 = pe42;
                    z = false;
                    d = true;
                    break;
                }
                i4++;
            }
        }
        z = true;
        int i5 = true != d ? 3 : 4;
        int i6 = 8;
        if (d && pe4.mo13264e(g4Var)) {
            i6 = 16;
        }
        int i7 = true != pe4.f15830g ? 0 : 64;
        if (true != z) {
            i = 0;
        }
        return i5 | i6 | i2 | i7 | i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public final oz3 mo9139L(pe4 pe4, C2388g4 g4Var, C2388g4 g4Var2) {
        int i;
        int i2;
        oz3 b = pe4.mo13262b(g4Var, g4Var2);
        int i3 = b.f15641e;
        if (m10861M0(pe4, g4Var2) > this.f7685T0) {
            i3 |= 64;
        }
        String str = pe4.f15824a;
        if (i3 != 0) {
            i = i3;
            i2 = 0;
        } else {
            i2 = b.f15640d;
            i = 0;
        }
        return new oz3(str, g4Var, g4Var2, i2, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public final oz3 mo9140M(c74 c74) throws u44 {
        oz3 M = super.mo9140M(c74);
        this.f7683R0.mo13743g(c74.f7638a, M);
        return M;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a8, code lost:
        if ("AXON 7 mini".equals(r10) == false) goto L_0x00aa;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00fb  */
    /* renamed from: P */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.le4 mo9141P(com.google.android.gms.internal.ads.pe4 r8, com.google.android.gms.internal.ads.C2388g4 r9, android.media.MediaCrypto r10, float r11) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.g4[] r10 = r7.mo13083q()
            int r0 = r7.m10861M0(r8, r9)
            int r1 = r10.length
            r2 = 0
            r3 = 1
            if (r1 != r3) goto L_0x000e
            goto L_0x0026
        L_0x000e:
            r4 = 0
        L_0x000f:
            if (r4 >= r1) goto L_0x0026
            r5 = r10[r4]
            com.google.android.gms.internal.ads.oz3 r6 = r8.mo13262b(r9, r5)
            int r6 = r6.f15640d
            if (r6 == 0) goto L_0x0023
            int r5 = r7.m10861M0(r8, r5)
            int r0 = java.lang.Math.max(r0, r5)
        L_0x0023:
            int r4 = r4 + 1
            goto L_0x000f
        L_0x0026:
            r7.f7685T0 = r0
            java.lang.String r10 = r8.f15824a
            int r0 = com.google.android.gms.internal.ads.gb2.f9812a
            r1 = 24
            if (r0 >= r1) goto L_0x005e
            java.lang.String r4 = "OMX.SEC.aac.dec"
            boolean r10 = r4.equals(r10)
            if (r10 == 0) goto L_0x005e
            java.lang.String r10 = com.google.android.gms.internal.ads.gb2.f9814c
            java.lang.String r4 = "samsung"
            boolean r10 = r4.equals(r10)
            if (r10 == 0) goto L_0x005e
            java.lang.String r10 = com.google.android.gms.internal.ads.gb2.f9813b
            java.lang.String r4 = "zeroflte"
            boolean r4 = r10.startsWith(r4)
            if (r4 != 0) goto L_0x005c
            java.lang.String r4 = "herolte"
            boolean r4 = r10.startsWith(r4)
            if (r4 != 0) goto L_0x005c
            java.lang.String r4 = "heroqlte"
            boolean r10 = r10.startsWith(r4)
            if (r10 == 0) goto L_0x005e
        L_0x005c:
            r10 = 1
            goto L_0x005f
        L_0x005e:
            r10 = 0
        L_0x005f:
            r7.f7686U0 = r10
            java.lang.String r10 = r8.f15826c
            int r4 = r7.f7685T0
            android.media.MediaFormat r5 = new android.media.MediaFormat
            r5.<init>()
            java.lang.String r6 = "mime"
            r5.setString(r6, r10)
            int r10 = r9.f9686y
            java.lang.String r6 = "channel-count"
            r5.setInteger(r6, r10)
            int r10 = r9.f9687z
            java.lang.String r6 = "sample-rate"
            r5.setInteger(r6, r10)
            java.util.List r10 = r9.f9675n
            com.google.android.gms.internal.ads.qv1.m19378b(r5, r10)
            java.lang.String r10 = "max-input-size"
            com.google.android.gms.internal.ads.qv1.m19377a(r5, r10, r4)
            r10 = 23
            if (r0 < r10) goto L_0x00af
            java.lang.String r4 = "priority"
            r5.setInteger(r4, r2)
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r2 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x00af
            if (r0 != r10) goto L_0x00aa
            java.lang.String r10 = com.google.android.gms.internal.ads.gb2.f9815d
            java.lang.String r2 = "ZTE B2017G"
            boolean r2 = r2.equals(r10)
            if (r2 != 0) goto L_0x00af
            java.lang.String r2 = "AXON 7 mini"
            boolean r10 = r2.equals(r10)
            if (r10 != 0) goto L_0x00af
        L_0x00aa:
            java.lang.String r10 = "operating-rate"
            r5.setFloat(r10, r11)
        L_0x00af:
            r10 = 28
            if (r0 > r10) goto L_0x00c2
            java.lang.String r10 = r9.f9673l
            java.lang.String r11 = "audio/ac4"
            boolean r10 = r11.equals(r10)
            if (r10 == 0) goto L_0x00c2
            java.lang.String r10 = "ac4-is-sync"
            r5.setInteger(r10, r3)
        L_0x00c2:
            if (r0 < r1) goto L_0x00db
            com.google.android.gms.internal.ads.yb4 r10 = r7.f7684S0
            int r11 = r9.f9686y
            int r1 = r9.f9687z
            r2 = 4
            com.google.android.gms.internal.ads.g4 r11 = com.google.android.gms.internal.ads.gb2.m13167f(r2, r11, r1)
            int r10 = r10.mo14713b(r11)
            r11 = 2
            if (r10 != r11) goto L_0x00db
            java.lang.String r10 = "pcm-encoding"
            r5.setInteger(r10, r2)
        L_0x00db:
            r10 = 32
            if (r0 < r10) goto L_0x00e6
            r10 = 99
            java.lang.String r11 = "max-output-channel-count"
            r5.setInteger(r11, r10)
        L_0x00e6:
            java.lang.String r10 = r8.f15825b
            java.lang.String r11 = "audio/raw"
            boolean r10 = r11.equals(r10)
            r0 = 0
            if (r10 == 0) goto L_0x00fb
            java.lang.String r10 = r9.f9673l
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x00fb
            r10 = r9
            goto L_0x00fc
        L_0x00fb:
            r10 = r0
        L_0x00fc:
            r7.f7687V0 = r10
            com.google.android.gms.internal.ads.le4 r8 = com.google.android.gms.internal.ads.le4.m15975a(r8, r5, r9, r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.cd4.mo9141P(com.google.android.gms.internal.ads.pe4, com.google.android.gms.internal.ads.g4, android.media.MediaCrypto, float):com.google.android.gms.internal.ads.le4");
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q */
    public final List mo9142Q(ue4 ue4, C2388g4 g4Var, boolean z) throws bf4 {
        return if4.m14310g(m10862N0(ue4, g4Var, false, this.f7684S0), g4Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: R */
    public final void mo9143R(Exception exc) {
        ot1.m18058c("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.f7683R0.mo13737a(exc);
    }

    /* access modifiers changed from: protected */
    /* renamed from: S */
    public final void mo9144S(String str, le4 le4, long j, long j2) {
        this.f7683R0.mo13739c(str, j, j2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: U */
    public final void mo9145U(String str) {
        this.f7683R0.mo13740d(str);
    }

    /* renamed from: V */
    public final e74 mo9146V() {
        return this;
    }

    /* renamed from: c */
    public final void mo9147c(fe0 fe0) {
        this.f7684S0.mo14729q(fe0);
    }

    /* renamed from: e */
    public final fe0 mo9148e() {
        return this.f7684S0.mo14716e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j0 */
    public final void mo9149j0(C2388g4 g4Var, MediaFormat mediaFormat) throws u44 {
        int i;
        int i2;
        C2388g4 g4Var2 = this.f7687V0;
        int[] iArr = null;
        if (g4Var2 != null) {
            g4Var = g4Var2;
        } else if (mo13988t0() != null) {
            if ("audio/raw".equals(g4Var.f9673l)) {
                i = g4Var.f9656A;
            } else if (gb2.f9812a < 24 || !mediaFormat.containsKey("pcm-encoding")) {
                i = mediaFormat.containsKey("v-bits-per-sample") ? gb2.m13154X(mediaFormat.getInteger("v-bits-per-sample")) : 2;
            } else {
                i = mediaFormat.getInteger("pcm-encoding");
            }
            C2311e2 e2Var = new C2311e2();
            e2Var.mo9776s("audio/raw");
            e2Var.mo9771n(i);
            e2Var.mo9754c(g4Var.f9657B);
            e2Var.mo9756d(g4Var.f9658C);
            e2Var.mo9759e0(mediaFormat.getInteger("channel-count"));
            e2Var.mo9777t(mediaFormat.getInteger("sample-rate"));
            C2388g4 y = e2Var.mo9782y();
            if (this.f7686U0 && y.f9686y == 6 && (i2 = g4Var.f9686y) < 6) {
                iArr = new int[i2];
                for (int i3 = 0; i3 < g4Var.f9686y; i3++) {
                    iArr[i3] = i3;
                }
            }
            g4Var = y;
        }
        try {
            this.f7684S0.mo14715d(g4Var, 0, iArr);
        } catch (tb4 e) {
            throw mo13085u(e, e.f17939a, false, 5001);
        }
    }

    /* renamed from: k */
    public final void mo9150k(int i, Object obj) throws u44 {
        if (i == 2) {
            this.f7684S0.mo14726n(((Float) obj).floatValue());
        } else if (i == 3) {
            this.f7684S0.mo14724l((w74) obj);
        } else if (i != 6) {
            switch (i) {
                case 9:
                    this.f7684S0.mo14723k0(((Boolean) obj).booleanValue());
                    return;
                case 10:
                    this.f7684S0.mo14725m(((Integer) obj).intValue());
                    return;
                case 11:
                    this.f7692a1 = (v74) obj;
                    return;
                default:
                    return;
            }
        } else {
            this.f7684S0.mo14728p((x84) obj);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l0 */
    public final void mo9151l0() {
        this.f7690Y0 = true;
    }

    /* renamed from: m */
    public final boolean mo9152m() {
        return this.f7684S0.mo14718g() || super.mo9152m();
    }

    /* access modifiers changed from: protected */
    /* renamed from: m0 */
    public final void mo9153m0() {
        this.f7684S0.mo14708T();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n0 */
    public final void mo9154n0(fo3 fo3) {
        if (this.f7689X0 && !fo3.mo15597f()) {
            if (Math.abs(fo3.f9375e - this.f7688W0) > 500000) {
                this.f7688W0 = fo3.f9375e;
            }
            this.f7689X0 = false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o0 */
    public final void mo9155o0() throws u44 {
        try {
            this.f7684S0.mo14710V();
        } catch (xb4 e) {
            throw mo13085u(e, e.f20067c, e.f20066b, 5002);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p0 */
    public final boolean mo9156p0(long j, long j2, ne4 ne4, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, C2388g4 g4Var) throws u44 {
        Objects.requireNonNull(byteBuffer);
        if (this.f7687V0 != null && (i2 & 2) != 0) {
            Objects.requireNonNull(ne4);
            ne4.mo11690g(i, false);
            return true;
        } else if (z) {
            if (ne4 != null) {
                ne4.mo11690g(i, false);
            }
            this.f17400J0.f14235f += i3;
            this.f7684S0.mo14708T();
            return true;
        } else {
            try {
                if (!this.f7684S0.mo14717f(byteBuffer, j3, i3)) {
                    return false;
                }
                if (ne4 != null) {
                    ne4.mo11690g(i, false);
                }
                this.f17400J0.f14234e += i3;
                return true;
            } catch (ub4 e) {
                throw mo13085u(e, e.f18490c, e.f18489b, 5001);
            } catch (xb4 e2) {
                throw mo13085u(e2, g4Var, e2.f20066b, 5002);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q0 */
    public final boolean mo9157q0(C2388g4 g4Var) {
        return this.f7684S0.mo14727o(g4Var);
    }

    /* renamed from: r */
    public final String mo9158r() {
        return "MediaCodecAudioRenderer";
    }

    /* renamed from: y */
    public final boolean mo9159y() {
        return super.mo9159y() && this.f7684S0.mo14721j();
    }

    public final long zza() {
        if (mo13080n() == 2) {
            m10858I0();
        }
        return this.f7688W0;
    }
}
