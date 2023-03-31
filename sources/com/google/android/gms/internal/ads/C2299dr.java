package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.dr */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2299dr extends C2852sm {

    /* renamed from: Q */
    private final Context f8370Q;

    /* renamed from: R */
    private final C2374fr f8371R;

    /* renamed from: S */
    private final C2671nr f8372S;

    /* renamed from: T */
    private final boolean f8373T;

    /* renamed from: U */
    private final long[] f8374U;

    /* renamed from: V */
    private C2774qi[] f8375V;

    /* renamed from: W */
    private C2225br f8376W;

    /* renamed from: X */
    private Surface f8377X;

    /* renamed from: Y */
    private Surface f8378Y;

    /* renamed from: Z */
    private boolean f8379Z;

    /* renamed from: a0 */
    private long f8380a0;

    /* renamed from: b0 */
    private long f8381b0;

    /* renamed from: c0 */
    private int f8382c0;

    /* renamed from: d0 */
    private int f8383d0;

    /* renamed from: e0 */
    private int f8384e0;

    /* renamed from: f0 */
    private float f8385f0;

    /* renamed from: g0 */
    private int f8386g0;

    /* renamed from: h0 */
    private int f8387h0;

    /* renamed from: i0 */
    private int f8388i0;

    /* renamed from: j0 */
    private float f8389j0;

    /* renamed from: k0 */
    private int f8390k0;

    /* renamed from: l0 */
    private int f8391l0;

    /* renamed from: m0 */
    private int f8392m0;

    /* renamed from: n0 */
    private float f8393n0;

    /* renamed from: o0 */
    private long f8394o0;

    /* renamed from: p0 */
    private int f8395p0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2299dr(Context context, C2926um umVar, long j, Handler handler, C2708or orVar, int i) {
        super(2, umVar, (C2850sk) null, false);
        boolean z = false;
        this.f8370Q = context.getApplicationContext();
        this.f8371R = new C2374fr(context);
        this.f8372S = new C2671nr(handler, orVar);
        if (C2893tq.f18208a <= 22 && "foster".equals(C2893tq.f18209b) && "NVIDIA".equals(C2893tq.f18210c)) {
            z = true;
        }
        this.f8373T = z;
        this.f8374U = new long[10];
        this.f8394o0 = -9223372036854775807L;
        this.f8380a0 = -9223372036854775807L;
        this.f8386g0 = -1;
        this.f8387h0 = -1;
        this.f8389j0 = -1.0f;
        this.f8385f0 = -1.0f;
        m11617O();
    }

    /* renamed from: N */
    private static int m11616N(C2774qi qiVar) {
        int i = qiVar.f16399u;
        if (i == -1) {
            return 0;
        }
        return i;
    }

    /* renamed from: O */
    private final void m11617O() {
        this.f8390k0 = -1;
        this.f8391l0 = -1;
        this.f8393n0 = -1.0f;
        this.f8392m0 = -1;
    }

    /* renamed from: P */
    private final void m11618P() {
        if (this.f8382c0 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f8372S.mo12699d(this.f8382c0, elapsedRealtime - this.f8381b0);
            this.f8382c0 = 0;
            this.f8381b0 = elapsedRealtime;
        }
    }

    /* renamed from: Q */
    private final void m11619Q() {
        int i = this.f8390k0;
        int i2 = this.f8386g0;
        if (i != i2 || this.f8391l0 != this.f8387h0 || this.f8392m0 != this.f8388i0 || this.f8393n0 != this.f8389j0) {
            this.f8372S.mo12703h(i2, this.f8387h0, this.f8388i0, this.f8389j0);
            this.f8390k0 = this.f8386g0;
            this.f8391l0 = this.f8387h0;
            this.f8392m0 = this.f8388i0;
            this.f8393n0 = this.f8389j0;
        }
    }

    /* renamed from: R */
    private final void m11620R() {
        if (this.f8390k0 != -1 || this.f8391l0 != -1) {
            this.f8372S.mo12703h(this.f8386g0, this.f8387h0, this.f8388i0, this.f8389j0);
        }
    }

    /* renamed from: S */
    private static boolean m11621S(long j) {
        return j < -30000;
    }

    /* renamed from: X */
    private final boolean m11622X(boolean z) {
        if (C2893tq.f18208a < 23 || (z && !C3115zq.m24732b(this.f8370Q))) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final boolean mo9667C(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) {
        MediaCodec mediaCodec2 = mediaCodec;
        int i3 = i;
        long j4 = j3;
        while (true) {
            int i4 = this.f8395p0;
            if (i4 == 0) {
                break;
            }
            long[] jArr = this.f8374U;
            long j5 = jArr[0];
            if (j4 < j5) {
                break;
            }
            this.f8394o0 = j5;
            int i5 = i4 - 1;
            this.f8395p0 = i5;
            System.arraycopy(jArr, 1, jArr, 0, i5);
        }
        long j6 = j4 - this.f8394o0;
        if (z) {
            mo9674M(mediaCodec2, i3, j6);
            return true;
        }
        long j7 = j4 - j;
        if (this.f8377X == this.f8378Y) {
            if (!m11621S(j7)) {
                return false;
            }
            mo9674M(mediaCodec2, i3, j6);
            return true;
        } else if (!this.f8379Z) {
            if (C2893tq.f18208a >= 21) {
                mo9673L(mediaCodec, i, j6, System.nanoTime());
            } else {
                mo9672K(mediaCodec2, i3, j6);
            }
            return true;
        } else if (mo8369d() != 2) {
            return false;
        } else {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long nanoTime = System.nanoTime();
            long a = this.f8371R.mo10262a(j4, ((j7 - ((elapsedRealtime * 1000) - j2)) * 1000) + nanoTime);
            long j8 = (a - nanoTime) / 1000;
            if (m11621S(j8)) {
                C2819rq.m19992a("dropVideoBuffer");
                mediaCodec2.releaseOutputBuffer(i3, false);
                C2819rq.m19993b();
                C2627mk mkVar = this.f17566O;
                mkVar.f13354f++;
                this.f8382c0++;
                int i6 = this.f8383d0 + 1;
                this.f8383d0 = i6;
                mkVar.f13355g = Math.max(i6, mkVar.f13355g);
                if (this.f8382c0 == -1) {
                    m11618P();
                }
                return true;
            }
            if (C2893tq.f18208a >= 21) {
                if (j8 < 50000) {
                    mo9673L(mediaCodec, i, j6, a);
                    return true;
                }
            } else if (j8 < 30000) {
                if (j8 > 11000) {
                    try {
                        Thread.sleep((j8 - 10000) / 1000);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
                mo9672K(mediaCodec2, i3, j6);
                return true;
            }
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public final void mo9668G(C2664nk nkVar) {
        int i = C2893tq.f18208a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public final void mo9669H() {
        try {
            super.mo9669H();
        } finally {
            Surface surface = this.f8378Y;
            if (surface != null) {
                if (this.f8377X == surface) {
                    this.f8377X = null;
                }
                surface.release();
                this.f8378Y = null;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public final boolean mo9670I(MediaCodec mediaCodec, boolean z, C2774qi qiVar, C2774qi qiVar2) {
        if (!qiVar.f16392f.equals(qiVar2.f16392f) || m11616N(qiVar) != m11616N(qiVar2)) {
            return false;
        }
        if (!z && (qiVar.f16396r != qiVar2.f16396r || qiVar.f16397s != qiVar2.f16397s)) {
            return false;
        }
        int i = qiVar2.f16396r;
        C2225br brVar = this.f8376W;
        return i <= brVar.f7427a && qiVar2.f16397s <= brVar.f7428b && qiVar2.f16393g <= brVar.f7429c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public final boolean mo9671J(C2778qm qmVar) {
        return this.f8377X != null || m11622X(qmVar.f16467d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public final void mo9672K(MediaCodec mediaCodec, int i, long j) {
        m11619Q();
        C2819rq.m19992a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, true);
        C2819rq.m19993b();
        this.f17566O.f13352d++;
        this.f8383d0 = 0;
        mo9678r();
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public final void mo9673L(MediaCodec mediaCodec, int i, long j, long j2) {
        m11619Q();
        C2819rq.m19992a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, j2);
        C2819rq.m19993b();
        this.f17566O.f13352d++;
        this.f8383d0 = 0;
        mo9678r();
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public final void mo9674M(MediaCodec mediaCodec, int i, long j) {
        C2819rq.m19992a("skipVideoBuffer");
        mediaCodec.releaseOutputBuffer(i, false);
        C2819rq.m19993b();
        this.f17566O.f13353e++;
    }

    /* renamed from: c */
    public final void mo9675c(int i, Object obj) throws C2253ci {
        if (i == 1) {
            Surface surface = (Surface) obj;
            if (surface == null) {
                Surface surface2 = this.f8378Y;
                if (surface2 != null) {
                    surface = surface2;
                } else {
                    C2778qm E = mo14079E();
                    if (E != null && m11622X(E.f16467d)) {
                        surface = C3115zq.m24731a(this.f8370Q, E.f16467d);
                        this.f8378Y = surface;
                    }
                }
            }
            if (this.f8377X != surface) {
                this.f8377X = surface;
                int d = mo8369d();
                if (d == 1 || d == 2) {
                    MediaCodec D = mo14078D();
                    if (C2893tq.f18208a < 23 || D == null || surface == null) {
                        mo9669H();
                        mo14080F();
                    } else {
                        D.setOutputSurface(surface);
                    }
                }
                if (surface == null || surface == this.f8378Y) {
                    m11617O();
                    this.f8379Z = false;
                    int i2 = C2893tq.f18208a;
                    return;
                }
                m11620R();
                this.f8379Z = false;
                int i3 = C2893tq.f18208a;
                if (d == 2) {
                    this.f8380a0 = -9223372036854775807L;
                }
            } else if (surface != null && surface != this.f8378Y) {
                m11620R();
                if (this.f8379Z) {
                    this.f8372S.mo12702g(this.f8377X);
                }
            }
        }
    }

    /* renamed from: i0 */
    public final boolean mo9676i0() {
        Surface surface;
        if (super.mo9676i0() && (this.f8379Z || (((surface = this.f8378Y) != null && this.f8377X == surface) || mo14078D() == null))) {
            this.f8380a0 = -9223372036854775807L;
            return true;
        } else if (this.f8380a0 == -9223372036854775807L) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() < this.f8380a0) {
                return true;
            }
            this.f8380a0 = -9223372036854775807L;
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo8377j() {
        this.f8386g0 = -1;
        this.f8387h0 = -1;
        this.f8389j0 = -1.0f;
        this.f8385f0 = -1.0f;
        this.f8394o0 = -9223372036854775807L;
        this.f8395p0 = 0;
        m11617O();
        this.f8379Z = false;
        int i = C2893tq.f18208a;
        this.f8371R.mo10263b();
        try {
            super.mo8377j();
        } finally {
            this.f17566O.mo12366a();
            this.f8372S.mo12698c(this.f17566O);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo8379k(boolean z) throws C2253ci {
        super.mo8379k(z);
        int i = mo8376i().f20624a;
        this.f8372S.mo12700e(this.f17566O);
        this.f8371R.mo10264c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo8380l(long j, boolean z) throws C2253ci {
        super.mo8380l(j, z);
        this.f8379Z = false;
        int i = C2893tq.f18208a;
        this.f8383d0 = 0;
        int i2 = this.f8395p0;
        if (i2 != 0) {
            this.f8394o0 = this.f8374U[i2 - 1];
            this.f8395p0 = 0;
        }
        this.f8380a0 = -9223372036854775807L;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo8382m() {
        this.f8382c0 = 0;
        this.f8381b0 = SystemClock.elapsedRealtime();
        this.f8380a0 = -9223372036854775807L;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final void mo8384n() {
        m11618P();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final void mo8386o(C2774qi[] qiVarArr, long j) throws C2253ci {
        this.f8375V = qiVarArr;
        if (this.f8394o0 == -9223372036854775807L) {
            this.f8394o0 = j;
            return;
        }
        int i = this.f8395p0;
        if (i == 10) {
            long j2 = this.f8374U[9];
            Log.w("MediaCodecVideoRenderer", "Too many stream changes, so dropping offset: " + j2);
        } else {
            this.f8395p0 = i + 1;
        }
        this.f8374U[this.f8395p0 - 1] = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final int mo9677q(C2926um umVar, C2774qi qiVar) throws C3037xm {
        boolean z;
        int i;
        int i2;
        String str = qiVar.f16392f;
        int i3 = 0;
        if (!C2522jq.m15005b(str)) {
            return 0;
        }
        C2813rk rkVar = qiVar.f16395i;
        if (rkVar != null) {
            z = false;
            for (int i4 = 0; i4 < rkVar.f16991c; i4++) {
                z |= rkVar.mo13824a(i4).f16426e;
            }
        } else {
            z = false;
        }
        C2778qm c = C2295dn.m11569c(str, z);
        if (c == null) {
            return 1;
        }
        boolean e = c.mo13572e(qiVar.f16389c);
        if (e && (i = qiVar.f16396r) > 0 && (i2 = qiVar.f16397s) > 0) {
            if (C2893tq.f18208a >= 21) {
                e = c.mo13573f(i, i2, (double) qiVar.f16398t);
            } else {
                e = i * i2 <= C2295dn.m11567a();
                if (!e) {
                    int i5 = qiVar.f16396r;
                    int i6 = qiVar.f16397s;
                    String str2 = C2893tq.f18212e;
                    Log.d("MediaCodecVideoRenderer", "FalseCheck [legacyFrameSize, " + i5 + "x" + i6 + "] [" + str2 + "]");
                }
            }
        }
        int i7 = true != c.f16465b ? 4 : 8;
        if (true == c.f16466c) {
            i3 = 16;
        }
        return (true != e ? 2 : 3) | i7 | i3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final void mo9678r() {
        if (!this.f8379Z) {
            this.f8379Z = true;
            this.f8372S.mo12702g(this.f8377X);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo9679v(com.google.android.gms.internal.ads.C2778qm r12, android.media.MediaCodec r13, com.google.android.gms.internal.ads.C2774qi r14, android.media.MediaCrypto r15) throws com.google.android.gms.internal.ads.C3037xm {
        /*
            r11 = this;
            com.google.android.gms.internal.ads.qi[] r15 = r11.f8375V
            int r0 = r14.f16396r
            int r1 = r14.f16397s
            int r2 = r14.f16393g
            r3 = 0
            r4 = -1
            if (r2 != r4) goto L_0x0091
            java.lang.String r2 = r14.f16392f
            if (r0 == r4) goto L_0x0090
            if (r1 != r4) goto L_0x0014
            goto L_0x0090
        L_0x0014:
            int r5 = r2.hashCode()
            r6 = 5
            r7 = 1
            r8 = 4
            r9 = 3
            r10 = 2
            switch(r5) {
                case -1664118616: goto L_0x0053;
                case -1662541442: goto L_0x0049;
                case 1187890754: goto L_0x003f;
                case 1331836730: goto L_0x0035;
                case 1599127256: goto L_0x002b;
                case 1599127257: goto L_0x0021;
                default: goto L_0x0020;
            }
        L_0x0020:
            goto L_0x005d
        L_0x0021:
            java.lang.String r5 = "video/x-vnd.on2.vp9"
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x005d
            r2 = 5
            goto L_0x005e
        L_0x002b:
            java.lang.String r5 = "video/x-vnd.on2.vp8"
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x005d
            r2 = 3
            goto L_0x005e
        L_0x0035:
            java.lang.String r5 = "video/avc"
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x005d
            r2 = 2
            goto L_0x005e
        L_0x003f:
            java.lang.String r5 = "video/mp4v-es"
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x005d
            r2 = 1
            goto L_0x005e
        L_0x0049:
            java.lang.String r5 = "video/hevc"
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x005d
            r2 = 4
            goto L_0x005e
        L_0x0053:
            java.lang.String r5 = "video/3gpp"
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x005d
            r2 = 0
            goto L_0x005e
        L_0x005d:
            r2 = -1
        L_0x005e:
            if (r2 == 0) goto L_0x0088
            if (r2 == r7) goto L_0x0088
            if (r2 == r10) goto L_0x006e
            if (r2 == r9) goto L_0x0088
            if (r2 == r8) goto L_0x006b
            if (r2 == r6) goto L_0x006b
            goto L_0x0090
        L_0x006b:
            int r2 = r0 * r1
            goto L_0x008b
        L_0x006e:
            java.lang.String r2 = com.google.android.gms.internal.ads.C2893tq.f18211d
            java.lang.String r5 = "BRAVIA 4K 2015"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0079
            goto L_0x0090
        L_0x0079:
            r2 = 16
            int r5 = com.google.android.gms.internal.ads.C2893tq.m21173d(r0, r2)
            int r2 = com.google.android.gms.internal.ads.C2893tq.m21173d(r1, r2)
            int r5 = r5 * r2
            int r2 = r5 * 256
            goto L_0x008a
        L_0x0088:
            int r2 = r0 * r1
        L_0x008a:
            r8 = 2
        L_0x008b:
            int r2 = r2 * 3
            int r8 = r8 + r8
            int r2 = r2 / r8
            goto L_0x0091
        L_0x0090:
            r2 = -1
        L_0x0091:
            int r15 = r15.length
            com.google.android.gms.internal.ads.br r15 = new com.google.android.gms.internal.ads.br
            r15.<init>(r0, r1, r2)
            r11.f8376W = r15
            boolean r0 = r11.f8373T
            android.media.MediaFormat r14 = r14.mo13539b()
            int r1 = r15.f7427a
            java.lang.String r2 = "max-width"
            r14.setInteger(r2, r1)
            int r1 = r15.f7428b
            java.lang.String r2 = "max-height"
            r14.setInteger(r2, r1)
            int r15 = r15.f7429c
            if (r15 == r4) goto L_0x00b6
            java.lang.String r1 = "max-input-size"
            r14.setInteger(r1, r15)
        L_0x00b6:
            if (r0 == 0) goto L_0x00bd
            java.lang.String r15 = "auto-frc"
            r14.setInteger(r15, r3)
        L_0x00bd:
            android.view.Surface r15 = r11.f8377X
            if (r15 != 0) goto L_0x00dc
            boolean r15 = r12.f16467d
            boolean r15 = r11.m11622X(r15)
            com.google.android.gms.internal.ads.C2335eq.m12245e(r15)
            android.view.Surface r15 = r11.f8378Y
            if (r15 != 0) goto L_0x00d8
            android.content.Context r15 = r11.f8370Q
            boolean r12 = r12.f16467d
            com.google.android.gms.internal.ads.zq r12 = com.google.android.gms.internal.ads.C3115zq.m24731a(r15, r12)
            r11.f8378Y = r12
        L_0x00d8:
            android.view.Surface r12 = r11.f8378Y
            r11.f8377X = r12
        L_0x00dc:
            android.view.Surface r12 = r11.f8377X
            r15 = 0
            r13.configure(r14, r12, r15, r3)
            int r12 = com.google.android.gms.internal.ads.C2893tq.f18208a
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2299dr.mo9679v(com.google.android.gms.internal.ads.qm, android.media.MediaCodec, com.google.android.gms.internal.ads.qi, android.media.MediaCrypto):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final void mo9680w(String str, long j, long j2) {
        this.f8372S.mo12697b(str, j, j2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final void mo9681x(C2774qi qiVar) throws C2253ci {
        super.mo9681x(qiVar);
        this.f8372S.mo12701f(qiVar);
        float f = qiVar.f16400v;
        if (f == -1.0f) {
            f = 1.0f;
        }
        this.f8385f0 = f;
        this.f8384e0 = m11616N(qiVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final void mo9682y(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        int i;
        int i2;
        boolean z = false;
        if (mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top")) {
            z = true;
        }
        if (z) {
            i = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
        } else {
            i = mediaFormat.getInteger("width");
        }
        this.f8386g0 = i;
        if (z) {
            i2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
        } else {
            i2 = mediaFormat.getInteger("height");
        }
        this.f8387h0 = i2;
        float f = this.f8385f0;
        this.f8389j0 = f;
        if (C2893tq.f18208a >= 21) {
            int i3 = this.f8384e0;
            if (i3 == 90 || i3 == 270) {
                int i4 = this.f8386g0;
                this.f8386g0 = i2;
                this.f8387h0 = i4;
                this.f8389j0 = 1.0f / f;
            }
        } else {
            this.f8388i0 = this.f8384e0;
        }
        mediaCodec.setVideoScalingMode(1);
    }
}
