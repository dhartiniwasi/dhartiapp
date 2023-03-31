package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.ek */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2329ek extends C2852sm implements C2485iq {
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public final C2663nj f8821Q;

    /* renamed from: R */
    private final C2181ak f8822R = new C2181ak((C2328ej) null, new C2403gj[0], new C2292dk(this, (C2255ck) null));

    /* renamed from: S */
    private boolean f8823S;

    /* renamed from: T */
    private int f8824T;

    /* renamed from: U */
    private int f8825U;

    /* renamed from: V */
    private long f8826V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public boolean f8827W;

    public C2329ek(C2926um umVar, C2850sk skVar, boolean z, Handler handler, C2700oj ojVar) {
        super(1, umVar, (C2850sk) null, true);
        this.f8821Q = new C2663nj(handler, ojVar);
    }

    /* renamed from: A */
    public final long mo9926A() {
        long a = this.f8822R.mo8402a(mo9928k0());
        if (a != Long.MIN_VALUE) {
            if (!this.f8827W) {
                a = Math.max(this.f8826V, a);
            }
            this.f8826V = a;
            this.f8827W = false;
        }
        return this.f8826V;
    }

    /* renamed from: B */
    public final C2959vi mo9927B(C2959vi viVar) {
        return this.f8822R.mo8404d(viVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final boolean mo9667C(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) throws C2253ci {
        if (z) {
            mediaCodec.releaseOutputBuffer(i, false);
            this.f17566O.f13353e++;
            this.f8822R.mo8406f();
            return true;
        }
        try {
            if (!this.f8822R.mo8413m(byteBuffer, j3)) {
                return false;
            }
            mediaCodec.releaseOutputBuffer(i, false);
            this.f17566O.f13352d++;
            return true;
        } catch (C2923uj | C3108zj e) {
            throw C2253ci.m10944a(e, mo8372g());
        }
    }

    /* renamed from: V */
    public final C2485iq mo8366V() {
        return this;
    }

    /* renamed from: c */
    public final void mo9675c(int i, Object obj) throws C2253ci {
        if (i == 2) {
            this.f8822R.mo8412l(((Float) obj).floatValue());
        }
    }

    /* renamed from: i0 */
    public final boolean mo9676i0() {
        return this.f8822R.mo8414n() || super.mo9676i0();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo8377j() {
        try {
            this.f8822R.mo8410j();
            try {
                super.mo8377j();
            } finally {
                this.f17566O.mo12366a();
                this.f8821Q.mo12636e(this.f17566O);
            }
        } catch (Throwable th) {
            super.mo8377j();
            throw th;
        } finally {
            this.f17566O.mo12366a();
            this.f8821Q.mo12636e(this.f17566O);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo8379k(boolean z) throws C2253ci {
        super.mo8379k(z);
        this.f8821Q.mo12637f(this.f17566O);
        int i = mo8376i().f20624a;
    }

    /* renamed from: k0 */
    public final boolean mo9928k0() {
        return super.mo9928k0() && this.f8822R.mo8415o();
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo8380l(long j, boolean z) throws C2253ci {
        super.mo8380l(j, z);
        this.f8822R.mo8411k();
        this.f8826V = j;
        this.f8827W = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo8382m() {
        this.f8822R.mo8408h();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final void mo8384n() {
        this.f8822R.mo8407g();
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final int mo9677q(C2926um umVar, C2774qi qiVar) throws C3037xm {
        int i;
        int i2;
        String str = qiVar.f16392f;
        if (!C2522jq.m15004a(str)) {
            return 0;
        }
        int i3 = C2893tq.f18208a;
        int i4 = i3 >= 21 ? 16 : 0;
        C2778qm c = C2295dn.m11569c(str, false);
        if (c == null) {
            return 1;
        }
        int i5 = 2;
        if (i3 < 21 || (((i = qiVar.f16378A) == -1 || c.mo13571d(i)) && ((i2 = qiVar.f16404z) == -1 || c.mo13570c(i2)))) {
            i5 = 3;
        }
        return i4 | 4 | i5;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final C2778qm mo9929t(C2926um umVar, C2774qi qiVar, boolean z) throws C3037xm {
        return super.mo9929t(umVar, qiVar, false);
    }

    /* renamed from: u */
    public final C2959vi mo9930u() {
        return this.f8822R.mo8403c();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0034, code lost:
        if (r4.startsWith("heroqlte") == false) goto L_0x0037;
     */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo9679v(com.google.android.gms.internal.ads.C2778qm r4, android.media.MediaCodec r5, com.google.android.gms.internal.ads.C2774qi r6, android.media.MediaCrypto r7) {
        /*
            r3 = this;
            java.lang.String r4 = r4.f16464a
            int r7 = com.google.android.gms.internal.ads.C2893tq.f18208a
            r0 = 1
            r1 = 0
            r2 = 24
            if (r7 >= r2) goto L_0x0037
            java.lang.String r7 = "OMX.SEC.aac.dec"
            boolean r4 = r7.equals(r4)
            if (r4 == 0) goto L_0x0037
            java.lang.String r4 = com.google.android.gms.internal.ads.C2893tq.f18210c
            java.lang.String r7 = "samsung"
            boolean r4 = r7.equals(r4)
            if (r4 == 0) goto L_0x0037
            java.lang.String r4 = com.google.android.gms.internal.ads.C2893tq.f18209b
            java.lang.String r7 = "zeroflte"
            boolean r7 = r4.startsWith(r7)
            if (r7 != 0) goto L_0x0038
            java.lang.String r7 = "herolte"
            boolean r7 = r4.startsWith(r7)
            if (r7 != 0) goto L_0x0038
            java.lang.String r7 = "heroqlte"
            boolean r4 = r4.startsWith(r7)
            if (r4 == 0) goto L_0x0037
            goto L_0x0038
        L_0x0037:
            r0 = 0
        L_0x0038:
            r3.f8823S = r0
            android.media.MediaFormat r4 = r6.mo13539b()
            r6 = 0
            r5.configure(r4, r6, r6, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2329ek.mo9679v(com.google.android.gms.internal.ads.qm, android.media.MediaCodec, com.google.android.gms.internal.ads.qi, android.media.MediaCrypto):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final void mo9680w(String str, long j, long j2) {
        this.f8821Q.mo12635d(str, j, j2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final void mo9681x(C2774qi qiVar) throws C2253ci {
        super.mo9681x(qiVar);
        this.f8821Q.mo12638g(qiVar);
        this.f8824T = "audio/raw".equals(qiVar.f16392f) ? qiVar.f16379B : 2;
        this.f8825U = qiVar.f16404z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final void mo9682y(MediaCodec mediaCodec, MediaFormat mediaFormat) throws C2253ci {
        int[] iArr;
        int i;
        int integer = mediaFormat.getInteger("channel-count");
        int integer2 = mediaFormat.getInteger("sample-rate");
        if (!this.f8823S || integer != 6) {
            i = integer;
            iArr = null;
        } else {
            int i2 = this.f8825U;
            if (i2 < 6) {
                int[] iArr2 = new int[i2];
                for (int i3 = 0; i3 < this.f8825U; i3++) {
                    iArr2[i3] = i3;
                }
                iArr = iArr2;
            } else {
                iArr = null;
            }
            i = 6;
        }
        try {
            this.f8822R.mo8405e("audio/raw", i, integer2, this.f8824T, 0, iArr);
        } catch (C2886tj e) {
            throw C2253ci.m10944a(e, mo8372g());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final void mo9931z() throws C2253ci {
        try {
            this.f8822R.mo8409i();
        } catch (C3108zj e) {
            throw C2253ci.m10944a(e, mo8372g());
        }
    }
}
