package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public abstract class se4 extends ox3 {

    /* renamed from: P0 */
    private static final byte[] f17380P0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};

    /* renamed from: A */
    private final he4 f17381A;

    /* renamed from: A0 */
    private int f17382A0;

    /* renamed from: B */
    private final d82 f17383B;

    /* renamed from: B0 */
    private boolean f17384B0;

    /* renamed from: C */
    private final ArrayList f17385C;

    /* renamed from: C0 */
    private boolean f17386C0;

    /* renamed from: D */
    private final MediaCodec.BufferInfo f17387D;

    /* renamed from: D0 */
    private boolean f17388D0;

    /* renamed from: E */
    private final long[] f17389E;

    /* renamed from: E0 */
    private long f17390E0;

    /* renamed from: F */
    private final long[] f17391F;

    /* renamed from: F0 */
    private long f17392F0;

    /* renamed from: G */
    private final long[] f17393G;

    /* renamed from: G0 */
    private boolean f17394G0;

    /* renamed from: H */
    private C2388g4 f17395H;

    /* renamed from: H0 */
    private boolean f17396H0;

    /* renamed from: I */
    private C2388g4 f17397I;

    /* renamed from: I0 */
    private boolean f17398I0;

    /* renamed from: J */
    private MediaCrypto f17399J;

    /* renamed from: J0 */
    protected ny3 f17400J0;

    /* renamed from: K */
    private boolean f17401K;

    /* renamed from: K0 */
    private long f17402K0;

    /* renamed from: L */
    private long f17403L;

    /* renamed from: L0 */
    private long f17404L0;

    /* renamed from: M */
    private float f17405M;

    /* renamed from: M0 */
    private int f17406M0;

    /* renamed from: N */
    private float f17407N;

    /* renamed from: N0 */
    private sd4 f17408N0;

    /* renamed from: O */
    private ne4 f17409O;

    /* renamed from: O0 */
    private sd4 f17410O0;

    /* renamed from: P */
    private C2388g4 f17411P;

    /* renamed from: Q */
    private MediaFormat f17412Q;

    /* renamed from: R */
    private boolean f17413R;

    /* renamed from: S */
    private float f17414S;

    /* renamed from: a0 */
    private ArrayDeque f17415a0;

    /* renamed from: b0 */
    private re4 f17416b0;

    /* renamed from: c0 */
    private pe4 f17417c0;

    /* renamed from: d0 */
    private int f17418d0;

    /* renamed from: e0 */
    private boolean f17419e0;

    /* renamed from: f0 */
    private boolean f17420f0;

    /* renamed from: g0 */
    private boolean f17421g0;

    /* renamed from: h0 */
    private boolean f17422h0;

    /* renamed from: i0 */
    private boolean f17423i0;

    /* renamed from: j0 */
    private boolean f17424j0;

    /* renamed from: k0 */
    private boolean f17425k0;

    /* renamed from: l0 */
    private boolean f17426l0;

    /* renamed from: m0 */
    private boolean f17427m0;

    /* renamed from: n0 */
    private ie4 f17428n0;

    /* renamed from: o0 */
    private long f17429o0;

    /* renamed from: p0 */
    private int f17430p0;

    /* renamed from: q0 */
    private int f17431q0;

    /* renamed from: r0 */
    private ByteBuffer f17432r0;

    /* renamed from: s0 */
    private boolean f17433s0;

    /* renamed from: t0 */
    private boolean f17434t0;

    /* renamed from: u */
    private final me4 f17435u;

    /* renamed from: u0 */
    private boolean f17436u0;

    /* renamed from: v */
    private final ue4 f17437v;

    /* renamed from: v0 */
    private boolean f17438v0;

    /* renamed from: w */
    private final float f17439w;

    /* renamed from: w0 */
    private boolean f17440w0;

    /* renamed from: x */
    private final fo3 f17441x = new fo3(0, 0);

    /* renamed from: x0 */
    private boolean f17442x0;

    /* renamed from: y */
    private final fo3 f17443y = new fo3(0, 0);

    /* renamed from: y0 */
    private int f17444y0;

    /* renamed from: z */
    private final fo3 f17445z = new fo3(2, 0);

    /* renamed from: z0 */
    private int f17446z0;

    public se4(int i, me4 me4, ue4 ue4, boolean z, float f) {
        super(i);
        this.f17435u = me4;
        Objects.requireNonNull(ue4);
        this.f17437v = ue4;
        this.f17439w = f;
        he4 he4 = new he4();
        this.f17381A = he4;
        this.f17383B = new d82(10);
        this.f17385C = new ArrayList();
        this.f17387D = new MediaCodec.BufferInfo();
        this.f17405M = 1.0f;
        this.f17407N = 1.0f;
        this.f17403L = -9223372036854775807L;
        this.f17389E = new long[10];
        this.f17391F = new long[10];
        this.f17393G = new long[10];
        this.f17402K0 = -9223372036854775807L;
        this.f17404L0 = -9223372036854775807L;
        he4.mo10234i(0);
        he4.f9373c.order(ByteOrder.nativeOrder());
        this.f17414S = -1.0f;
        this.f17418d0 = 0;
        this.f17444y0 = 0;
        this.f17430p0 = -1;
        this.f17431q0 = -1;
        this.f17429o0 = -9223372036854775807L;
        this.f17390E0 = -9223372036854775807L;
        this.f17392F0 = -9223372036854775807L;
        this.f17446z0 = 0;
        this.f17382A0 = 0;
    }

    /* renamed from: F0 */
    protected static boolean m20288F0(C2388g4 g4Var) {
        return g4Var.f9660E == 0;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0196, code lost:
        if ("stvm8".equals(r5) == false) goto L_0x01a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01a6, code lost:
        if ("OMX.amlogic.avc.decoder.awesome.secure".equals(r2) == false) goto L_0x01a9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0252  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0260  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0285 A[SYNTHETIC, Splitter:B:149:0x0285] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01b8  */
    /* renamed from: G0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m20289G0(com.google.android.gms.internal.ads.pe4 r17, android.media.MediaCrypto r18) throws java.lang.Exception {
        /*
            r16 = this;
            r8 = r16
            r0 = r17
            java.lang.String r1 = "createCodec:"
            java.lang.String r2 = r0.f15824a
            int r3 = com.google.android.gms.internal.ads.gb2.f9812a
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            r5 = 23
            if (r3 >= r5) goto L_0x0013
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x001f
        L_0x0013:
            float r6 = r8.f17407N
            com.google.android.gms.internal.ads.g4 r7 = r8.f17395H
            com.google.android.gms.internal.ads.g4[] r9 = r16.mo13083q()
            float r6 = r8.mo9137J(r6, r7, r9)
        L_0x001f:
            float r7 = r8.f17439w
            int r7 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r7 > 0) goto L_0x0026
            goto L_0x0027
        L_0x0026:
            r4 = r6
        L_0x0027:
            long r6 = android.os.SystemClock.elapsedRealtime()
            com.google.android.gms.internal.ads.g4 r9 = r8.f17395H
            r10 = 0
            com.google.android.gms.internal.ads.le4 r9 = r8.mo9141P(r0, r9, r10, r4)
            r11 = 31
            if (r3 < r11) goto L_0x003d
            com.google.android.gms.internal.ads.bb4 r12 = r16.mo13064A()
            com.google.android.gms.internal.ads.qe4.m19177a(r9, r12)
        L_0x003d:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x0289 }
            r12.<init>()     // Catch:{ all -> 0x0289 }
            r12.append(r1)     // Catch:{ all -> 0x0289 }
            r12.append(r2)     // Catch:{ all -> 0x0289 }
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x0289 }
            android.os.Trace.beginSection(r12)     // Catch:{ all -> 0x0289 }
            r12 = 0
            if (r3 < r5) goto L_0x0075
            if (r3 < r11) goto L_0x0075
            com.google.android.gms.internal.ads.g4 r1 = r9.f12759c     // Catch:{ all -> 0x0289 }
            java.lang.String r1 = r1.f9673l     // Catch:{ all -> 0x0289 }
            int r1 = com.google.android.gms.internal.ads.d90.m11363b(r1)     // Catch:{ all -> 0x0289 }
            java.lang.String r10 = "DMCodecAdapterFactory"
            java.lang.String r11 = com.google.android.gms.internal.ads.gb2.m13181o(r1)     // Catch:{ all -> 0x0289 }
            java.lang.String r13 = "Creating an asynchronous MediaCodec adapter for track type "
            java.lang.String r11 = r13.concat(r11)     // Catch:{ all -> 0x0289 }
            com.google.android.gms.internal.ads.ot1.m18059d(r10, r11)     // Catch:{ all -> 0x0289 }
            com.google.android.gms.internal.ads.xd4 r10 = new com.google.android.gms.internal.ads.xd4     // Catch:{ all -> 0x0289 }
            r10.<init>(r1, r12)     // Catch:{ all -> 0x0289 }
            com.google.android.gms.internal.ads.zd4 r1 = r10.mo15088c(r9)     // Catch:{ all -> 0x0289 }
            goto L_0x00ae
        L_0x0075:
            com.google.android.gms.internal.ads.pe4 r11 = r9.f12757a     // Catch:{ IOException -> 0x0282, RuntimeException -> 0x0280 }
            java.util.Objects.requireNonNull(r11)
            java.lang.String r11 = r11.f15824a     // Catch:{ IOException -> 0x0282, RuntimeException -> 0x0280 }
            java.lang.String r13 = java.lang.String.valueOf(r11)     // Catch:{ IOException -> 0x0282, RuntimeException -> 0x0280 }
            java.lang.String r1 = r1.concat(r13)     // Catch:{ IOException -> 0x0282, RuntimeException -> 0x0280 }
            android.os.Trace.beginSection(r1)     // Catch:{ IOException -> 0x0282, RuntimeException -> 0x0280 }
            android.media.MediaCodec r1 = android.media.MediaCodec.createByCodecName(r11)     // Catch:{ IOException -> 0x0282, RuntimeException -> 0x0280 }
            android.os.Trace.endSection()     // Catch:{ IOException -> 0x0282, RuntimeException -> 0x0280 }
            java.lang.String r11 = "configureCodec"
            android.os.Trace.beginSection(r11)     // Catch:{ IOException -> 0x027d, RuntimeException -> 0x027b }
            android.media.MediaFormat r11 = r9.f12758b     // Catch:{ IOException -> 0x027d, RuntimeException -> 0x027b }
            android.view.Surface r13 = r9.f12760d     // Catch:{ IOException -> 0x027d, RuntimeException -> 0x027b }
            r1.configure(r11, r13, r10, r12)     // Catch:{ IOException -> 0x027d, RuntimeException -> 0x027b }
            android.os.Trace.endSection()     // Catch:{ IOException -> 0x027d, RuntimeException -> 0x027b }
            java.lang.String r11 = "startCodec"
            android.os.Trace.beginSection(r11)     // Catch:{ IOException -> 0x027d, RuntimeException -> 0x027b }
            r1.start()     // Catch:{ IOException -> 0x027d, RuntimeException -> 0x027b }
            android.os.Trace.endSection()     // Catch:{ IOException -> 0x027d, RuntimeException -> 0x027b }
            com.google.android.gms.internal.ads.kf4 r11 = new com.google.android.gms.internal.ads.kf4     // Catch:{ IOException -> 0x027d, RuntimeException -> 0x027b }
            r11.<init>(r1, r10)     // Catch:{ IOException -> 0x027d, RuntimeException -> 0x027b }
            r1 = r11
        L_0x00ae:
            r8.f17409O = r1     // Catch:{ all -> 0x0289 }
            android.os.Trace.endSection()
            long r10 = android.os.SystemClock.elapsedRealtime()
            r8.f17417c0 = r0
            r8.f17414S = r4
            com.google.android.gms.internal.ads.g4 r1 = r8.f17395H
            r8.f17411P = r1
            java.lang.String r1 = "OMX.Exynos.avc.dec.secure"
            r4 = 25
            if (r3 > r4) goto L_0x00ef
            boolean r15 = r1.equals(r2)
            if (r15 == 0) goto L_0x00ef
            java.lang.String r15 = com.google.android.gms.internal.ads.gb2.f9815d
            java.lang.String r12 = "SM-T585"
            boolean r12 = r15.startsWith(r12)
            if (r12 != 0) goto L_0x00ed
            java.lang.String r12 = "SM-A510"
            boolean r12 = r15.startsWith(r12)
            if (r12 != 0) goto L_0x00ed
            java.lang.String r12 = "SM-A520"
            boolean r12 = r15.startsWith(r12)
            if (r12 != 0) goto L_0x00ed
            java.lang.String r12 = "SM-J700"
            boolean r12 = r15.startsWith(r12)
            if (r12 == 0) goto L_0x00ef
        L_0x00ed:
            r12 = 2
            goto L_0x0128
        L_0x00ef:
            r12 = 24
            if (r3 >= r12) goto L_0x0127
            java.lang.String r12 = "OMX.Nvidia.h264.decode"
            boolean r12 = r12.equals(r2)
            if (r12 != 0) goto L_0x0103
            java.lang.String r12 = "OMX.Nvidia.h264.decode.secure"
            boolean r12 = r12.equals(r2)
            if (r12 == 0) goto L_0x0127
        L_0x0103:
            java.lang.String r12 = com.google.android.gms.internal.ads.gb2.f9813b
            java.lang.String r15 = "flounder"
            boolean r15 = r15.equals(r12)
            if (r15 != 0) goto L_0x0125
            java.lang.String r15 = "flounder_lte"
            boolean r15 = r15.equals(r12)
            if (r15 != 0) goto L_0x0125
            java.lang.String r15 = "grouper"
            boolean r15 = r15.equals(r12)
            if (r15 != 0) goto L_0x0125
            java.lang.String r15 = "tilapia"
            boolean r12 = r15.equals(r12)
            if (r12 == 0) goto L_0x0127
        L_0x0125:
            r12 = 1
            goto L_0x0128
        L_0x0127:
            r12 = 0
        L_0x0128:
            r8.f17418d0 = r12
            com.google.android.gms.internal.ads.g4 r12 = r8.f17411P
            r15 = 21
            if (r3 >= r15) goto L_0x0142
            java.util.List r12 = r12.f9675n
            boolean r12 = r12.isEmpty()
            if (r12 == 0) goto L_0x0142
            java.lang.String r12 = "OMX.MTK.VIDEO.DECODER.AVC"
            boolean r12 = r12.equals(r2)
            if (r12 == 0) goto L_0x0142
            r12 = 1
            goto L_0x0143
        L_0x0142:
            r12 = 0
        L_0x0143:
            r8.f17419e0 = r12
            r12 = 19
            if (r3 != r12) goto L_0x0163
            java.lang.String r14 = com.google.android.gms.internal.ads.gb2.f9815d
            java.lang.String r13 = "SM-G800"
            boolean r13 = r14.startsWith(r13)
            if (r13 == 0) goto L_0x0163
            java.lang.String r13 = "OMX.Exynos.avc.dec"
            boolean r13 = r13.equals(r2)
            if (r13 != 0) goto L_0x0161
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0163
        L_0x0161:
            r1 = 1
            goto L_0x0164
        L_0x0163:
            r1 = 0
        L_0x0164:
            r8.f17420f0 = r1
            r1 = 29
            if (r3 != r1) goto L_0x0174
            java.lang.String r13 = "c2.android.aac.decoder"
            boolean r13 = r13.equals(r2)
            if (r13 == 0) goto L_0x0174
            r13 = 1
            goto L_0x0175
        L_0x0174:
            r13 = 0
        L_0x0175:
            r8.f17421g0 = r13
            if (r3 > r5) goto L_0x0184
            java.lang.String r5 = "OMX.google.vorbis.decoder"
            boolean r5 = r5.equals(r2)
            if (r5 != 0) goto L_0x0182
            goto L_0x0184
        L_0x0182:
            r5 = 1
            goto L_0x01aa
        L_0x0184:
            if (r3 > r12) goto L_0x01a9
            java.lang.String r5 = com.google.android.gms.internal.ads.gb2.f9813b
            java.lang.String r12 = "hb2000"
            boolean r12 = r12.equals(r5)
            if (r12 != 0) goto L_0x0198
            java.lang.String r12 = "stvm8"
            boolean r5 = r12.equals(r5)
            if (r5 == 0) goto L_0x01a9
        L_0x0198:
            java.lang.String r5 = "OMX.amlogic.avc.decoder.awesome"
            boolean r5 = r5.equals(r2)
            if (r5 != 0) goto L_0x0182
            java.lang.String r5 = "OMX.amlogic.avc.decoder.awesome.secure"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x01a9
            goto L_0x0182
        L_0x01a9:
            r5 = 0
        L_0x01aa:
            r8.f17422h0 = r5
            if (r3 != r15) goto L_0x01b8
            java.lang.String r5 = "OMX.google.aac.decoder"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x01b8
            r5 = 1
            goto L_0x01b9
        L_0x01b8:
            r5 = 0
        L_0x01b9:
            r8.f17423i0 = r5
            if (r3 >= r15) goto L_0x0203
            java.lang.String r5 = "OMX.SEC.mp3.dec"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x0203
            java.lang.String r5 = com.google.android.gms.internal.ads.gb2.f9814c
            java.lang.String r12 = "samsung"
            boolean r5 = r12.equals(r5)
            if (r5 == 0) goto L_0x0203
            java.lang.String r5 = com.google.android.gms.internal.ads.gb2.f9813b
            java.lang.String r12 = "baffin"
            boolean r12 = r5.startsWith(r12)
            if (r12 != 0) goto L_0x0201
            java.lang.String r12 = "grand"
            boolean r12 = r5.startsWith(r12)
            if (r12 != 0) goto L_0x0201
            java.lang.String r12 = "fortuna"
            boolean r12 = r5.startsWith(r12)
            if (r12 != 0) goto L_0x0201
            java.lang.String r12 = "gprimelte"
            boolean r12 = r5.startsWith(r12)
            if (r12 != 0) goto L_0x0201
            java.lang.String r12 = "j2y18lte"
            boolean r12 = r5.startsWith(r12)
            if (r12 != 0) goto L_0x0201
            java.lang.String r12 = "ms01"
            boolean r5 = r5.startsWith(r12)
            if (r5 == 0) goto L_0x0203
        L_0x0201:
            r5 = 1
            goto L_0x0204
        L_0x0203:
            r5 = 0
        L_0x0204:
            r8.f17424j0 = r5
            java.lang.String r5 = r0.f15824a
            if (r3 > r4) goto L_0x0215
            java.lang.String r4 = "OMX.rk.video_decoder.avc"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0213
            goto L_0x0215
        L_0x0213:
            r12 = 1
            goto L_0x0241
        L_0x0215:
            if (r3 > r1) goto L_0x0227
            java.lang.String r1 = "OMX.broadcom.video_decoder.tunnel"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x0213
            java.lang.String r1 = "OMX.broadcom.video_decoder.tunnel.secure"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x0213
        L_0x0227:
            java.lang.String r1 = com.google.android.gms.internal.ads.gb2.f9814c
            java.lang.String r3 = "Amazon"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x0240
            java.lang.String r1 = com.google.android.gms.internal.ads.gb2.f9815d
            java.lang.String r3 = "AFTS"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x0240
            boolean r1 = r0.f15829f
            if (r1 == 0) goto L_0x0240
            goto L_0x0213
        L_0x0240:
            r12 = 0
        L_0x0241:
            r8.f17427m0 = r12
            com.google.android.gms.internal.ads.ne4 r1 = r8.f17409O
            r1.mo11687e0()
            java.lang.String r0 = r0.f15824a
            java.lang.String r1 = "c2.android.mp3.decoder"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0259
            com.google.android.gms.internal.ads.ie4 r0 = new com.google.android.gms.internal.ads.ie4
            r0.<init>()
            r8.f17428n0 = r0
        L_0x0259:
            int r0 = r16.mo13080n()
            r1 = 2
            if (r0 != r1) goto L_0x0269
            long r0 = android.os.SystemClock.elapsedRealtime()
            r3 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 + r3
            r8.f17429o0 = r0
        L_0x0269:
            com.google.android.gms.internal.ads.ny3 r0 = r8.f17400J0
            int r1 = r0.f14230a
            r3 = 1
            int r1 = r1 + r3
            r0.f14230a = r1
            long r6 = r10 - r6
            r1 = r16
            r3 = r9
            r4 = r10
            r1.mo9144S(r2, r3, r4, r6)
            return
        L_0x027b:
            r0 = move-exception
            goto L_0x027e
        L_0x027d:
            r0 = move-exception
        L_0x027e:
            r10 = r1
            goto L_0x0283
        L_0x0280:
            r0 = move-exception
            goto L_0x0283
        L_0x0282:
            r0 = move-exception
        L_0x0283:
            if (r10 == 0) goto L_0x0288
            r10.release()     // Catch:{ all -> 0x0289 }
        L_0x0288:
            throw r0     // Catch:{ all -> 0x0289 }
        L_0x0289:
            r0 = move-exception
            android.os.Trace.endSection()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.se4.m20289G0(com.google.android.gms.internal.ads.pe4, android.media.MediaCrypto):void");
    }

    /* renamed from: H0 */
    private final void m20290H0() throws u44 {
        int i = this.f17382A0;
        if (i == 1) {
            mo9151l0();
        } else if (i == 2) {
            mo9151l0();
            m20295X();
        } else if (i != 3) {
            this.f17396H0 = true;
            mo9155o0();
        } else {
            mo13991z0();
            mo13990x0();
        }
    }

    /* renamed from: I0 */
    private final void m20291I0() {
        this.f17430p0 = -1;
        this.f17443y.f9373c = null;
    }

    /* renamed from: J0 */
    private final void m20292J0() {
        this.f17431q0 = -1;
        this.f17432r0 = null;
    }

    /* renamed from: N */
    private final void m20293N() {
        this.f17440w0 = false;
        this.f17381A.mo10233b();
        this.f17445z.mo10233b();
        this.f17438v0 = false;
        this.f17436u0 = false;
    }

    /* renamed from: O */
    private final void m20294O() throws u44 {
        if (this.f17384B0) {
            this.f17446z0 = 1;
            this.f17382A0 = 3;
            return;
        }
        mo13991z0();
        mo13990x0();
    }

    /* renamed from: X */
    private final void m20295X() throws u44 {
        try {
            throw null;
        } catch (MediaCryptoException e) {
            throw mo13085u(e, this.f17395H, false, 6006);
        }
    }

    /* renamed from: Y */
    private final boolean m20296Y() throws u44 {
        if (this.f17384B0) {
            this.f17446z0 = 1;
            if (this.f17420f0 || this.f17422h0) {
                this.f17382A0 = 3;
                return false;
            }
            this.f17382A0 = 2;
        } else {
            m20295X();
        }
        return true;
    }

    /* renamed from: Z */
    private final boolean m20297Z() throws u44 {
        ne4 ne4 = this.f17409O;
        if (ne4 == null || this.f17446z0 == 2 || this.f17394G0) {
            return false;
        }
        if (this.f17430p0 < 0) {
            int zza = ne4.zza();
            this.f17430p0 = zza;
            if (zza < 0) {
                return false;
            }
            this.f17443y.f9373c = this.f17409O.mo11692p(zza);
            this.f17443y.mo10233b();
        }
        if (this.f17446z0 == 1) {
            if (!this.f17427m0) {
                this.f17386C0 = true;
                this.f17409O.mo11683b(this.f17430p0, 0, 0, 0, 4);
                m20291I0();
            }
            this.f17446z0 = 2;
            return false;
        } else if (this.f17425k0) {
            this.f17425k0 = false;
            this.f17443y.f9373c.put(f17380P0);
            this.f17409O.mo11683b(this.f17430p0, 0, 38, 0, 0);
            m20291I0();
            this.f17384B0 = true;
            return true;
        } else {
            if (this.f17444y0 == 1) {
                for (int i = 0; i < this.f17411P.f9675n.size(); i++) {
                    this.f17443y.f9373c.put((byte[]) this.f17411P.f9675n.get(i));
                }
                this.f17444y0 = 2;
            }
            int position = this.f17443y.f9373c.position();
            c74 x = mo13088x();
            try {
                int t = mo13084t(x, this.f17443y, 0);
                if (mo13081o()) {
                    this.f17392F0 = this.f17390E0;
                }
                if (t == -3) {
                    return false;
                }
                if (t == -5) {
                    if (this.f17444y0 == 2) {
                        this.f17443y.mo10233b();
                        this.f17444y0 = 1;
                    }
                    mo9140M(x);
                    return true;
                }
                fo3 fo3 = this.f17443y;
                if (fo3.mo15598g()) {
                    if (this.f17444y0 == 2) {
                        fo3.mo10233b();
                        this.f17444y0 = 1;
                    }
                    this.f17394G0 = true;
                    if (!this.f17384B0) {
                        m20290H0();
                        return false;
                    }
                    try {
                        if (!this.f17427m0) {
                            this.f17386C0 = true;
                            this.f17409O.mo11683b(this.f17430p0, 0, 0, 0, 4);
                            m20291I0();
                        }
                        return false;
                    } catch (MediaCodec.CryptoException e) {
                        throw mo13085u(e, this.f17395H, false, gb2.m13152V(e.getErrorCode()));
                    }
                } else if (this.f17384B0 || fo3.mo15599h()) {
                    boolean k = fo3.mo10236k();
                    if (k) {
                        fo3.f9372b.mo9209b(position);
                    }
                    if (this.f17419e0 && !k) {
                        ByteBuffer byteBuffer = this.f17443y.f9373c;
                        byte[] bArr = C2420h.f10130a;
                        int position2 = byteBuffer.position();
                        int i2 = 0;
                        int i3 = 0;
                        while (true) {
                            int i4 = i2 + 1;
                            if (i4 >= position2) {
                                byteBuffer.clear();
                                break;
                            }
                            byte b = byteBuffer.get(i2) & 255;
                            if (i3 == 3) {
                                if (b == 1) {
                                    if ((byteBuffer.get(i4) & 31) == 7) {
                                        ByteBuffer duplicate = byteBuffer.duplicate();
                                        duplicate.position(i2 - 3);
                                        duplicate.limit(position2);
                                        byteBuffer.position(0);
                                        byteBuffer.put(duplicate);
                                        break;
                                    }
                                    b = 1;
                                }
                            } else if (b == 0) {
                                i3++;
                            }
                            if (b != 0) {
                                i3 = 0;
                            }
                            i2 = i4;
                        }
                        if (this.f17443y.f9373c.position() == 0) {
                            return true;
                        }
                        this.f17419e0 = false;
                    }
                    fo3 fo32 = this.f17443y;
                    long j = fo32.f9375e;
                    ie4 ie4 = this.f17428n0;
                    if (ie4 != null) {
                        j = ie4.mo11100b(this.f17395H, fo32);
                        this.f17390E0 = Math.max(this.f17390E0, this.f17428n0.mo11099a(this.f17395H));
                    }
                    long j2 = j;
                    if (this.f17443y.mo15597f()) {
                        this.f17385C.add(Long.valueOf(j2));
                    }
                    if (this.f17398I0) {
                        this.f17383B.mo9460d(j2, this.f17395H);
                        this.f17398I0 = false;
                    }
                    this.f17390E0 = Math.max(this.f17390E0, j2);
                    this.f17443y.mo10235j();
                    fo3 fo33 = this.f17443y;
                    if (fo33.mo15596e()) {
                        mo12380w0(fo33);
                    }
                    mo9154n0(this.f17443y);
                    if (k) {
                        try {
                            this.f17409O.mo11685d(this.f17430p0, 0, this.f17443y.f9372b, j2, 0);
                        } catch (MediaCodec.CryptoException e2) {
                            throw mo13085u(e2, this.f17395H, false, gb2.m13152V(e2.getErrorCode()));
                        }
                    } else {
                        this.f17409O.mo11683b(this.f17430p0, 0, this.f17443y.f9373c.limit(), j2, 0);
                    }
                    m20291I0();
                    this.f17384B0 = true;
                    this.f17444y0 = 0;
                    this.f17400J0.f14232c++;
                    return true;
                } else {
                    fo3.mo10233b();
                    if (this.f17444y0 == 2) {
                        this.f17444y0 = 1;
                    }
                    return true;
                }
            } catch (en3 e3) {
                mo9143R(e3);
                m20299d0(0);
                mo9151l0();
                return true;
            }
        }
    }

    /* renamed from: b0 */
    private final boolean m20298b0() {
        return this.f17431q0 >= 0;
    }

    /* renamed from: d0 */
    private final boolean m20299d0(int i) throws u44 {
        c74 x = mo13088x();
        this.f17441x.mo10233b();
        int t = mo13084t(x, this.f17441x, i | 4);
        if (t == -5) {
            mo9140M(x);
            return true;
        } else if (t != -4 || !this.f17441x.mo15598g()) {
            return false;
        } else {
            this.f17394G0 = true;
            m20290H0();
            return false;
        }
    }

    /* renamed from: f0 */
    private final boolean m20300f0(long j) {
        return this.f17403L == -9223372036854775807L || SystemClock.elapsedRealtime() - j < this.f17403L;
    }

    /* renamed from: g0 */
    private final boolean m20301g0(C2388g4 g4Var) throws u44 {
        if (!(gb2.f9812a < 23 || this.f17409O == null || this.f17382A0 == 3 || mo13080n() == 0)) {
            float J = mo9137J(this.f17407N, g4Var, mo13083q());
            float f = this.f17414S;
            if (f == J) {
                return true;
            }
            if (J == -1.0f) {
                m20294O();
                return false;
            } else if (f == -1.0f && J <= this.f17439w) {
                return true;
            } else {
                Bundle bundle = new Bundle();
                bundle.putFloat("operating-rate", J);
                this.f17409O.mo11679F(bundle);
                this.f17414S = J;
            }
        }
        return true;
    }

    /* renamed from: l0 */
    private final void mo9151l0() {
        try {
            this.f17409O.mo11680V();
        } finally {
            mo12371A0();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: A0 */
    public void mo12371A0() {
        m20291I0();
        m20292J0();
        this.f17429o0 = -9223372036854775807L;
        this.f17386C0 = false;
        this.f17384B0 = false;
        this.f17425k0 = false;
        this.f17426l0 = false;
        this.f17433s0 = false;
        this.f17434t0 = false;
        this.f17385C.clear();
        this.f17390E0 = -9223372036854775807L;
        this.f17392F0 = -9223372036854775807L;
        ie4 ie4 = this.f17428n0;
        if (ie4 != null) {
            ie4.mo11101c();
        }
        this.f17446z0 = 0;
        this.f17382A0 = 0;
        this.f17444y0 = this.f17442x0 ? 1 : 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public void mo9131B() {
        this.f17395H = null;
        this.f17402K0 = -9223372036854775807L;
        this.f17404L0 = -9223372036854775807L;
        this.f17406M0 = 0;
        mo13985D0();
    }

    /* access modifiers changed from: protected */
    /* renamed from: B0 */
    public final void mo13983B0() {
        mo12371A0();
        this.f17428n0 = null;
        this.f17415a0 = null;
        this.f17417c0 = null;
        this.f17411P = null;
        this.f17412Q = null;
        this.f17413R = false;
        this.f17388D0 = false;
        this.f17414S = -1.0f;
        this.f17418d0 = 0;
        this.f17419e0 = false;
        this.f17420f0 = false;
        this.f17421g0 = false;
        this.f17422h0 = false;
        this.f17423i0 = false;
        this.f17424j0 = false;
        this.f17427m0 = false;
        this.f17442x0 = false;
        this.f17444y0 = 0;
        this.f17401K = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C0 */
    public final boolean mo13984C0() throws u44 {
        boolean D0 = mo13985D0();
        if (D0) {
            mo13990x0();
        }
        return D0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public void mo9132D(boolean z, boolean z2) throws u44 {
        this.f17400J0 = new ny3();
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public final boolean mo13985D0() {
        if (this.f17409O == null) {
            return false;
        }
        int i = this.f17382A0;
        if (i == 3 || this.f17420f0 || ((this.f17421g0 && !this.f17388D0) || (this.f17422h0 && this.f17386C0))) {
            mo13991z0();
            return true;
        }
        if (i == 2) {
            int i2 = gb2.f9812a;
            v91.m22052f(i2 >= 23);
            if (i2 >= 23) {
                try {
                    m20295X();
                } catch (u44 e) {
                    ot1.m18061f("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e);
                    mo13991z0();
                    return true;
                }
            }
        }
        mo9151l0();
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public void mo9133E(long j, boolean z) throws u44 {
        this.f17394G0 = false;
        this.f17396H0 = false;
        if (this.f17436u0) {
            this.f17381A.mo10233b();
            this.f17445z.mo10233b();
            this.f17438v0 = false;
        } else {
            mo13984C0();
        }
        d82 d82 = this.f17383B;
        if (d82.mo9457a() > 0) {
            this.f17398I0 = true;
        }
        d82.mo9461e();
        int i = this.f17406M0;
        if (i != 0) {
            int i2 = i - 1;
            this.f17404L0 = this.f17391F[i2];
            this.f17402K0 = this.f17389E[i2];
            this.f17406M0 = 0;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: E0 */
    public boolean mo12372E0(pe4 pe4) {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public void mo9134F() {
        try {
            m20293N();
            mo13991z0();
        } finally {
            this.f17410O0 = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public final void mo12629I(C2388g4[] g4VarArr, long j, long j2) throws u44 {
        boolean z = true;
        if (this.f17404L0 == -9223372036854775807L) {
            if (this.f17402K0 != -9223372036854775807L) {
                z = false;
            }
            v91.m22052f(z);
            this.f17402K0 = j;
            this.f17404L0 = j2;
            return;
        }
        int i = this.f17406M0;
        if (i == 10) {
            ot1.m18060e("MediaCodecRenderer", "Too many stream changes, so dropping offset: " + this.f17391F[9]);
        } else {
            this.f17406M0 = i + 1;
        }
        long[] jArr = this.f17389E;
        int i2 = this.f17406M0 - 1;
        jArr[i2] = j;
        this.f17391F[i2] = j2;
        this.f17393G[i2] = this.f17390E0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public abstract float mo9137J(float f, C2388g4 g4Var, C2388g4[] g4VarArr);

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public abstract int mo9138K(ue4 ue4, C2388g4 g4Var) throws bf4;

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public abstract oz3 mo9139L(pe4 pe4, C2388g4 g4Var, C2388g4 g4Var2);

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005b, code lost:
        if (m20296Y() == false) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0087, code lost:
        if (m20296Y() == false) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x009b, code lost:
        if (m20296Y() == false) goto L_0x009d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00d0 A[RETURN] */
    /* renamed from: M */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.internal.ads.oz3 mo9140M(com.google.android.gms.internal.ads.c74 r13) throws com.google.android.gms.internal.ads.u44 {
        /*
            r12 = this;
            r0 = 1
            r12.f17398I0 = r0
            com.google.android.gms.internal.ads.g4 r4 = r13.f7638a
            java.util.Objects.requireNonNull(r4)
            java.lang.String r1 = r4.f9673l
            r2 = 0
            if (r1 == 0) goto L_0x00f8
            com.google.android.gms.internal.ads.sd4 r13 = r13.f7639b
            r12.f17410O0 = r13
            r12.f17395H = r4
            boolean r1 = r12.f17436u0
            r3 = 0
            if (r1 == 0) goto L_0x001b
            r12.f17440w0 = r0
            return r3
        L_0x001b:
            com.google.android.gms.internal.ads.ne4 r1 = r12.f17409O
            if (r1 != 0) goto L_0x0025
            r12.f17415a0 = r3
            r12.mo13990x0()
            return r3
        L_0x0025:
            com.google.android.gms.internal.ads.pe4 r3 = r12.f17417c0
            com.google.android.gms.internal.ads.g4 r5 = r12.f17411P
            com.google.android.gms.internal.ads.sd4 r6 = r12.f17408N0
            r7 = 23
            if (r6 != r13) goto L_0x00d1
            if (r13 == r6) goto L_0x0038
            int r8 = com.google.android.gms.internal.ads.gb2.f9812a
            if (r8 < r7) goto L_0x0036
            goto L_0x0038
        L_0x0036:
            r7 = 0
            goto L_0x0039
        L_0x0038:
            r7 = 1
        L_0x0039:
            com.google.android.gms.internal.ads.v91.m22052f(r7)
            com.google.android.gms.internal.ads.oz3 r7 = r12.mo9139L(r3, r5, r4)
            int r8 = r7.f15640d
            r9 = 3
            r10 = 16
            r11 = 2
            if (r8 == 0) goto L_0x00b4
            if (r8 == r0) goto L_0x008a
            if (r8 == r11) goto L_0x005e
            boolean r0 = r12.m20301g0(r4)
            if (r0 != 0) goto L_0x0053
            goto L_0x0090
        L_0x0053:
            r12.f17411P = r4
            if (r13 == r6) goto L_0x00b7
            boolean r13 = r12.m20296Y()
            if (r13 != 0) goto L_0x00b7
            goto L_0x009d
        L_0x005e:
            boolean r8 = r12.m20301g0(r4)
            if (r8 != 0) goto L_0x0065
            goto L_0x0090
        L_0x0065:
            r12.f17442x0 = r0
            r12.f17444y0 = r0
            int r8 = r12.f17418d0
            if (r8 == r11) goto L_0x007d
            if (r8 != r0) goto L_0x007c
            int r8 = r4.f9678q
            int r10 = r5.f9678q
            if (r8 != r10) goto L_0x007c
            int r8 = r4.f9679r
            int r10 = r5.f9679r
            if (r8 != r10) goto L_0x007c
            goto L_0x007d
        L_0x007c:
            r0 = 0
        L_0x007d:
            r12.f17425k0 = r0
            r12.f17411P = r4
            if (r13 == r6) goto L_0x00b7
            boolean r13 = r12.m20296Y()
            if (r13 != 0) goto L_0x00b7
            goto L_0x009d
        L_0x008a:
            boolean r8 = r12.m20301g0(r4)
            if (r8 != 0) goto L_0x0093
        L_0x0090:
            r6 = 16
            goto L_0x00b8
        L_0x0093:
            r12.f17411P = r4
            if (r13 == r6) goto L_0x009f
            boolean r13 = r12.m20296Y()
            if (r13 != 0) goto L_0x00b7
        L_0x009d:
            r6 = 2
            goto L_0x00b8
        L_0x009f:
            boolean r13 = r12.f17384B0
            if (r13 == 0) goto L_0x00b7
            r12.f17446z0 = r0
            boolean r13 = r12.f17420f0
            if (r13 != 0) goto L_0x00b1
            boolean r13 = r12.f17422h0
            if (r13 == 0) goto L_0x00ae
            goto L_0x00b1
        L_0x00ae:
            r12.f17382A0 = r0
            goto L_0x00b7
        L_0x00b1:
            r12.f17382A0 = r9
            goto L_0x009d
        L_0x00b4:
            r12.m20294O()
        L_0x00b7:
            r6 = 0
        L_0x00b8:
            int r13 = r7.f15640d
            if (r13 == 0) goto L_0x00d0
            com.google.android.gms.internal.ads.ne4 r13 = r12.f17409O
            if (r13 != r1) goto L_0x00c4
            int r13 = r12.f17382A0
            if (r13 != r9) goto L_0x00d0
        L_0x00c4:
            com.google.android.gms.internal.ads.oz3 r13 = new com.google.android.gms.internal.ads.oz3
            java.lang.String r2 = r3.f15824a
            r0 = 0
            r1 = r13
            r3 = r5
            r5 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            return r13
        L_0x00d0:
            return r7
        L_0x00d1:
            if (r13 == 0) goto L_0x00e7
            if (r6 != 0) goto L_0x00d6
            goto L_0x00e7
        L_0x00d6:
            int r13 = com.google.android.gms.internal.ads.gb2.f9812a
            if (r13 < r7) goto L_0x00e7
            java.util.UUID r13 = com.google.android.gms.internal.ads.ac4.f6524e
            java.util.UUID r0 = com.google.android.gms.internal.ads.ac4.f6520a
            boolean r1 = r13.equals(r0)
            if (r1 != 0) goto L_0x00e7
            r13.equals(r0)
        L_0x00e7:
            r12.m20294O()
            com.google.android.gms.internal.ads.oz3 r13 = new com.google.android.gms.internal.ads.oz3
            java.lang.String r2 = r3.f15824a
            r0 = 0
            r6 = 128(0x80, float:1.794E-43)
            r1 = r13
            r3 = r5
            r5 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            return r13
        L_0x00f8:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            r13.<init>()
            r0 = 4005(0xfa5, float:5.612E-42)
            com.google.android.gms.internal.ads.u44 r13 = r12.mo13085u(r13, r4, r2, r0)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.se4.mo9140M(com.google.android.gms.internal.ads.c74):com.google.android.gms.internal.ads.oz3");
    }

    /* access modifiers changed from: protected */
    /* renamed from: P */
    public abstract le4 mo9141P(pe4 pe4, C2388g4 g4Var, MediaCrypto mediaCrypto, float f);

    /* access modifiers changed from: protected */
    /* renamed from: Q */
    public abstract List mo9142Q(ue4 ue4, C2388g4 g4Var, boolean z) throws bf4;

    /* access modifiers changed from: protected */
    /* renamed from: R */
    public abstract void mo9143R(Exception exc);

    /* access modifiers changed from: protected */
    /* renamed from: S */
    public abstract void mo9144S(String str, le4 le4, long j, long j2);

    /* access modifiers changed from: protected */
    /* renamed from: U */
    public abstract void mo9145U(String str);

    /* renamed from: a */
    public final int mo13068a() {
        return 8;
    }

    /* renamed from: f */
    public void mo12378f(float f, float f2) throws u44 {
        this.f17405M = f;
        this.f17407N = f2;
        m20301g0(this.f17411P);
    }

    /* renamed from: j */
    public final int mo12631j(C2388g4 g4Var) throws u44 {
        try {
            return mo9138K(this.f17437v, g4Var);
        } catch (bf4 e) {
            throw mo13085u(e, g4Var, false, 4002);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j0 */
    public abstract void mo9149j0(C2388g4 g4Var, MediaFormat mediaFormat) throws u44;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v1, resolved type: com.google.android.gms.internal.ads.se4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: com.google.android.gms.internal.ads.se4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: com.google.android.gms.internal.ads.se4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v8, resolved type: com.google.android.gms.internal.ads.se4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v25, resolved type: com.google.android.gms.internal.ads.ne4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v26, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v27, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v28, resolved type: com.google.android.gms.internal.ads.se4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v29, resolved type: android.media.MediaFormat} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v30, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v31, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v34, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v17, resolved type: com.google.android.gms.internal.ads.se4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v70, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v26, resolved type: com.google.android.gms.internal.ads.se4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v27, resolved type: com.google.android.gms.internal.ads.se4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v71, resolved type: com.google.android.gms.internal.ads.se4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v74, resolved type: com.google.android.gms.internal.ads.se4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v75, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v82, resolved type: com.google.android.gms.internal.ads.se4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v31, resolved type: com.google.android.gms.internal.ads.g4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v83, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v84, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v86, resolved type: com.google.android.gms.internal.ads.se4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v87, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v88, resolved type: com.google.android.gms.internal.ads.se4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v90, resolved type: com.google.android.gms.internal.ads.se4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v91, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v92, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v93, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v94, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v95, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v38, resolved type: com.google.android.gms.internal.ads.g4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v39, resolved type: com.google.android.gms.internal.ads.se4} */
    /* JADX WARNING: Can't wrap try/catch for region: R(9:84|85|(1:87)(0)|88|260|(1:195)|199|210|211) */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0260, code lost:
        if (r15.f17397I != null) goto L_0x0262;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x02ac, code lost:
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:?, code lost:
        m20290H0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x02af, code lost:
        r15 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x02b1, code lost:
        r1 = r1;
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x02b3, code lost:
        if (r15.f17396H0 != false) goto L_0x02b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x02b5, code lost:
        mo13991z0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x02b8, code lost:
        r1 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x02bc, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x032d, code lost:
        r0 = e;
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0150, code lost:
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:?, code lost:
        m20290H0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0155, code lost:
        if (r15.f17396H0 != false) goto L_0x0157;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0157, code lost:
        mo13991z0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x015a, code lost:
        r2 = r9;
        r1 = r15;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:165:0x02ac */
    /* JADX WARNING: Missing exception handler attribute for start block: B:84:0x0150 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x01a3 A[Catch:{ IllegalStateException -> 0x0352 }] */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x02ed  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x030e A[Catch:{ IllegalStateException -> 0x034f }, LOOP:2: B:75:0x0139->B:193:0x030e, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x0318 A[Catch:{ IllegalStateException -> 0x034f }, LOOP:4: B:195:0x0318->B:198:0x0322, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x030d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x0315 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x016a A[Catch:{ IllegalStateException -> 0x0352 }] */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12632l(long r24, long r26) throws com.google.android.gms.internal.ads.u44 {
        /*
            r23 = this;
            r15 = r23
            r14 = 1
            r13 = 0
            boolean r0 = r15.f17396H0     // Catch:{ IllegalStateException -> 0x0352 }
            if (r0 == 0) goto L_0x000c
            r23.mo9155o0()     // Catch:{ IllegalStateException -> 0x0352 }
            return
        L_0x000c:
            com.google.android.gms.internal.ads.g4 r0 = r15.f17395H     // Catch:{ IllegalStateException -> 0x0352 }
            r11 = 2
            if (r0 != 0) goto L_0x0019
            boolean r0 = r15.m20299d0(r11)     // Catch:{ IllegalStateException -> 0x0352 }
            if (r0 == 0) goto L_0x0018
            goto L_0x0019
        L_0x0018:
            return
        L_0x0019:
            r23.mo13990x0()     // Catch:{ IllegalStateException -> 0x0352 }
            boolean r0 = r15.f17436u0     // Catch:{ IllegalStateException -> 0x0352 }
            if (r0 == 0) goto L_0x012a
            java.lang.String r0 = "bypassRender"
            int r1 = com.google.android.gms.internal.ads.gb2.f9812a     // Catch:{ IllegalStateException -> 0x0352 }
            android.os.Trace.beginSection(r0)     // Catch:{ IllegalStateException -> 0x0352 }
        L_0x0027:
            boolean r0 = r15.f17396H0     // Catch:{ IllegalStateException -> 0x0352 }
            r0 = r0 ^ r14
            com.google.android.gms.internal.ads.v91.m22052f(r0)     // Catch:{ IllegalStateException -> 0x0352 }
            com.google.android.gms.internal.ads.he4 r0 = r15.f17381A     // Catch:{ IllegalStateException -> 0x0352 }
            boolean r1 = r0.mo10807q()     // Catch:{ IllegalStateException -> 0x0352 }
            if (r1 == 0) goto L_0x007b
            java.nio.ByteBuffer r7 = r0.f9373c     // Catch:{ IllegalStateException -> 0x0352 }
            int r8 = r15.f17431q0     // Catch:{ IllegalStateException -> 0x0352 }
            int r10 = r0.mo10803m()     // Catch:{ IllegalStateException -> 0x0352 }
            long r11 = r0.f9375e     // Catch:{ IllegalStateException -> 0x0352 }
            boolean r16 = r0.mo15597f()     // Catch:{ IllegalStateException -> 0x0352 }
            r6 = 0
            r9 = 0
            boolean r0 = r0.mo15598g()     // Catch:{ IllegalStateException -> 0x0352 }
            com.google.android.gms.internal.ads.g4 r4 = r15.f17397I     // Catch:{ IllegalStateException -> 0x0352 }
            r1 = r23
            r2 = r24
            r17 = r4
            r4 = r26
            r13 = r16
            r14 = r0
            r15 = r17
            boolean r0 = r1.mo9156p0(r2, r4, r6, r7, r8, r9, r10, r11, r13, r14, r15)     // Catch:{ IllegalStateException -> 0x0075 }
            if (r0 == 0) goto L_0x006f
            r15 = r23
            com.google.android.gms.internal.ads.he4 r0 = r15.f17381A     // Catch:{ IllegalStateException -> 0x0352 }
            long r0 = r0.mo10804n()     // Catch:{ IllegalStateException -> 0x0352 }
            r15.mo12381y0(r0)     // Catch:{ IllegalStateException -> 0x0352 }
            com.google.android.gms.internal.ads.he4 r0 = r15.f17381A     // Catch:{ IllegalStateException -> 0x0352 }
            r0.mo10233b()     // Catch:{ IllegalStateException -> 0x0352 }
            goto L_0x007b
        L_0x006f:
            r15 = r23
            r13 = 0
            r14 = 1
            goto L_0x0121
        L_0x0075:
            r0 = move-exception
            r2 = 1
            r19 = 0
            goto L_0x02be
        L_0x007b:
            boolean r0 = r15.f17394G0     // Catch:{ IllegalStateException -> 0x0352 }
            if (r0 == 0) goto L_0x0085
            r14 = 1
            r15.f17396H0 = r14     // Catch:{ IllegalStateException -> 0x0352 }
            r13 = 0
            goto L_0x0121
        L_0x0085:
            r14 = 1
            boolean r0 = r15.f17438v0     // Catch:{ IllegalStateException -> 0x0352 }
            if (r0 == 0) goto L_0x0099
            com.google.android.gms.internal.ads.he4 r0 = r15.f17381A     // Catch:{ IllegalStateException -> 0x0352 }
            com.google.android.gms.internal.ads.fo3 r1 = r15.f17445z     // Catch:{ IllegalStateException -> 0x0352 }
            boolean r0 = r0.mo10806p(r1)     // Catch:{ IllegalStateException -> 0x0352 }
            com.google.android.gms.internal.ads.v91.m22052f(r0)     // Catch:{ IllegalStateException -> 0x0352 }
            r13 = 0
            r15.f17438v0 = r13     // Catch:{ IllegalStateException -> 0x0352 }
            goto L_0x009a
        L_0x0099:
            r13 = 0
        L_0x009a:
            boolean r0 = r15.f17440w0     // Catch:{ IllegalStateException -> 0x0352 }
            if (r0 == 0) goto L_0x00b2
            com.google.android.gms.internal.ads.he4 r0 = r15.f17381A     // Catch:{ IllegalStateException -> 0x0352 }
            boolean r0 = r0.mo10807q()     // Catch:{ IllegalStateException -> 0x0352 }
            if (r0 != 0) goto L_0x0027
            r23.m20293N()     // Catch:{ IllegalStateException -> 0x0352 }
            r15.f17440w0 = r13     // Catch:{ IllegalStateException -> 0x0352 }
            r23.mo13990x0()     // Catch:{ IllegalStateException -> 0x0352 }
            boolean r0 = r15.f17436u0     // Catch:{ IllegalStateException -> 0x0352 }
            if (r0 == 0) goto L_0x0121
        L_0x00b2:
            boolean r0 = r15.f17394G0     // Catch:{ IllegalStateException -> 0x0352 }
            r0 = r0 ^ r14
            com.google.android.gms.internal.ads.v91.m22052f(r0)     // Catch:{ IllegalStateException -> 0x0352 }
            com.google.android.gms.internal.ads.c74 r0 = r23.mo13088x()     // Catch:{ IllegalStateException -> 0x0352 }
            com.google.android.gms.internal.ads.fo3 r1 = r15.f17445z     // Catch:{ IllegalStateException -> 0x0352 }
            r1.mo10233b()     // Catch:{ IllegalStateException -> 0x0352 }
        L_0x00c1:
            com.google.android.gms.internal.ads.fo3 r1 = r15.f17445z     // Catch:{ IllegalStateException -> 0x0352 }
            r1.mo10233b()     // Catch:{ IllegalStateException -> 0x0352 }
            com.google.android.gms.internal.ads.fo3 r1 = r15.f17445z     // Catch:{ IllegalStateException -> 0x0352 }
            int r1 = r15.mo13084t(r0, r1, r13)     // Catch:{ IllegalStateException -> 0x0352 }
            r2 = -5
            if (r1 == r2) goto L_0x0101
            r2 = -4
            if (r1 == r2) goto L_0x00d3
            goto L_0x0104
        L_0x00d3:
            com.google.android.gms.internal.ads.fo3 r1 = r15.f17445z     // Catch:{ IllegalStateException -> 0x0352 }
            boolean r1 = r1.mo15598g()     // Catch:{ IllegalStateException -> 0x0352 }
            if (r1 == 0) goto L_0x00de
            r15.f17394G0 = r14     // Catch:{ IllegalStateException -> 0x0352 }
            goto L_0x0104
        L_0x00de:
            boolean r1 = r15.f17398I0     // Catch:{ IllegalStateException -> 0x0352 }
            if (r1 == 0) goto L_0x00ef
            com.google.android.gms.internal.ads.g4 r1 = r15.f17395H     // Catch:{ IllegalStateException -> 0x0352 }
            java.util.Objects.requireNonNull(r1)
            r15.f17397I = r1     // Catch:{ IllegalStateException -> 0x0352 }
            r2 = 0
            r15.mo9149j0(r1, r2)     // Catch:{ IllegalStateException -> 0x0352 }
            r15.f17398I0 = r13     // Catch:{ IllegalStateException -> 0x0352 }
        L_0x00ef:
            com.google.android.gms.internal.ads.fo3 r1 = r15.f17445z     // Catch:{ IllegalStateException -> 0x0352 }
            r1.mo10235j()     // Catch:{ IllegalStateException -> 0x0352 }
            com.google.android.gms.internal.ads.he4 r1 = r15.f17381A     // Catch:{ IllegalStateException -> 0x0352 }
            com.google.android.gms.internal.ads.fo3 r2 = r15.f17445z     // Catch:{ IllegalStateException -> 0x0352 }
            boolean r1 = r1.mo10806p(r2)     // Catch:{ IllegalStateException -> 0x0352 }
            if (r1 != 0) goto L_0x00c1
            r15.f17438v0 = r14     // Catch:{ IllegalStateException -> 0x0352 }
            goto L_0x0104
        L_0x0101:
            r15.mo9140M(r0)     // Catch:{ IllegalStateException -> 0x0352 }
        L_0x0104:
            com.google.android.gms.internal.ads.he4 r0 = r15.f17381A     // Catch:{ IllegalStateException -> 0x0352 }
            boolean r1 = r0.mo10807q()     // Catch:{ IllegalStateException -> 0x0352 }
            if (r1 == 0) goto L_0x010f
            r0.mo10235j()     // Catch:{ IllegalStateException -> 0x0352 }
        L_0x010f:
            com.google.android.gms.internal.ads.he4 r0 = r15.f17381A     // Catch:{ IllegalStateException -> 0x0352 }
            boolean r0 = r0.mo10807q()     // Catch:{ IllegalStateException -> 0x0352 }
            if (r0 != 0) goto L_0x0027
            boolean r0 = r15.f17394G0     // Catch:{ IllegalStateException -> 0x0352 }
            if (r0 != 0) goto L_0x0027
            boolean r0 = r15.f17440w0     // Catch:{ IllegalStateException -> 0x0352 }
            if (r0 == 0) goto L_0x0121
            goto L_0x0027
        L_0x0121:
            android.os.Trace.endSection()     // Catch:{ IllegalStateException -> 0x0352 }
            r1 = r15
            r2 = 1
            r19 = 0
            goto L_0x0347
        L_0x012a:
            com.google.android.gms.internal.ads.ne4 r0 = r15.f17409O     // Catch:{ IllegalStateException -> 0x0352 }
            if (r0 == 0) goto L_0x0335
            long r9 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IllegalStateException -> 0x0330 }
            java.lang.String r0 = "drainAndFeed"
            int r1 = com.google.android.gms.internal.ads.gb2.f9812a     // Catch:{ IllegalStateException -> 0x0330 }
            android.os.Trace.beginSection(r0)     // Catch:{ IllegalStateException -> 0x0330 }
        L_0x0139:
            boolean r0 = r23.m20298b0()     // Catch:{ IllegalStateException -> 0x0330 }
            if (r0 != 0) goto L_0x026b
            boolean r0 = r15.f17423i0     // Catch:{ IllegalStateException -> 0x0352 }
            if (r0 == 0) goto L_0x0160
            boolean r0 = r15.f17386C0     // Catch:{ IllegalStateException -> 0x0352 }
            if (r0 == 0) goto L_0x0160
            com.google.android.gms.internal.ads.ne4 r0 = r15.f17409O     // Catch:{ IllegalStateException -> 0x0150 }
            android.media.MediaCodec$BufferInfo r1 = r15.f17387D     // Catch:{ IllegalStateException -> 0x0150 }
            int r0 = r0.mo11691h(r1)     // Catch:{ IllegalStateException -> 0x0150 }
            goto L_0x0168
        L_0x0150:
            r23.m20290H0()     // Catch:{ IllegalStateException -> 0x0352 }
            boolean r0 = r15.f17396H0     // Catch:{ IllegalStateException -> 0x0352 }
            if (r0 == 0) goto L_0x015a
            r23.mo13991z0()     // Catch:{ IllegalStateException -> 0x0352 }
        L_0x015a:
            r2 = r9
            r1 = r15
            r19 = 0
            goto L_0x0318
        L_0x0160:
            com.google.android.gms.internal.ads.ne4 r0 = r15.f17409O     // Catch:{ IllegalStateException -> 0x0352 }
            android.media.MediaCodec$BufferInfo r1 = r15.f17387D     // Catch:{ IllegalStateException -> 0x0352 }
            int r0 = r0.mo11691h(r1)     // Catch:{ IllegalStateException -> 0x0352 }
        L_0x0168:
            if (r0 >= 0) goto L_0x01a3
            r1 = -2
            if (r0 != r1) goto L_0x0193
            r15.f17388D0 = r14     // Catch:{ IllegalStateException -> 0x0352 }
            com.google.android.gms.internal.ads.ne4 r0 = r15.f17409O     // Catch:{ IllegalStateException -> 0x0352 }
            android.media.MediaFormat r0 = r0.mo11686e()     // Catch:{ IllegalStateException -> 0x0352 }
            int r1 = r15.f17418d0     // Catch:{ IllegalStateException -> 0x0352 }
            if (r1 == 0) goto L_0x018e
            java.lang.String r1 = "width"
            int r1 = r0.getInteger(r1)     // Catch:{ IllegalStateException -> 0x0352 }
            r2 = 32
            if (r1 != r2) goto L_0x018e
            java.lang.String r1 = "height"
            int r1 = r0.getInteger(r1)     // Catch:{ IllegalStateException -> 0x0352 }
            if (r1 != r2) goto L_0x018e
            r15.f17426l0 = r14     // Catch:{ IllegalStateException -> 0x0352 }
            goto L_0x01ae
        L_0x018e:
            r15.f17412Q = r0     // Catch:{ IllegalStateException -> 0x0352 }
            r15.f17413R = r14     // Catch:{ IllegalStateException -> 0x0352 }
            goto L_0x01ae
        L_0x0193:
            boolean r0 = r15.f17427m0     // Catch:{ IllegalStateException -> 0x0352 }
            if (r0 == 0) goto L_0x015a
            boolean r0 = r15.f17394G0     // Catch:{ IllegalStateException -> 0x0352 }
            if (r0 != 0) goto L_0x019f
            int r0 = r15.f17446z0     // Catch:{ IllegalStateException -> 0x0352 }
            if (r0 != r11) goto L_0x015a
        L_0x019f:
            r23.m20290H0()     // Catch:{ IllegalStateException -> 0x0352 }
            goto L_0x015a
        L_0x01a3:
            boolean r1 = r15.f17426l0     // Catch:{ IllegalStateException -> 0x0352 }
            if (r1 == 0) goto L_0x01b6
            r15.f17426l0 = r13     // Catch:{ IllegalStateException -> 0x0352 }
            com.google.android.gms.internal.ads.ne4 r1 = r15.f17409O     // Catch:{ IllegalStateException -> 0x0352 }
            r1.mo11690g(r0, r13)     // Catch:{ IllegalStateException -> 0x0352 }
        L_0x01ae:
            r2 = r9
            r1 = r15
            r16 = 2
            r19 = 0
            goto L_0x0307
        L_0x01b6:
            android.media.MediaCodec$BufferInfo r1 = r15.f17387D     // Catch:{ IllegalStateException -> 0x0352 }
            int r2 = r1.size     // Catch:{ IllegalStateException -> 0x0352 }
            if (r2 != 0) goto L_0x01c6
            int r1 = r1.flags     // Catch:{ IllegalStateException -> 0x0352 }
            r1 = r1 & 4
            if (r1 == 0) goto L_0x01c6
            r23.m20290H0()     // Catch:{ IllegalStateException -> 0x0352 }
            goto L_0x015a
        L_0x01c6:
            r15.f17431q0 = r0     // Catch:{ IllegalStateException -> 0x0352 }
            com.google.android.gms.internal.ads.ne4 r1 = r15.f17409O     // Catch:{ IllegalStateException -> 0x0352 }
            java.nio.ByteBuffer r0 = r1.mo11689f0(r0)     // Catch:{ IllegalStateException -> 0x0352 }
            r15.f17432r0 = r0     // Catch:{ IllegalStateException -> 0x0352 }
            if (r0 == 0) goto L_0x01e5
            android.media.MediaCodec$BufferInfo r1 = r15.f17387D     // Catch:{ IllegalStateException -> 0x0352 }
            int r1 = r1.offset     // Catch:{ IllegalStateException -> 0x0352 }
            r0.position(r1)     // Catch:{ IllegalStateException -> 0x0352 }
            java.nio.ByteBuffer r0 = r15.f17432r0     // Catch:{ IllegalStateException -> 0x0352 }
            android.media.MediaCodec$BufferInfo r1 = r15.f17387D     // Catch:{ IllegalStateException -> 0x0352 }
            int r2 = r1.offset     // Catch:{ IllegalStateException -> 0x0352 }
            int r1 = r1.size     // Catch:{ IllegalStateException -> 0x0352 }
            int r2 = r2 + r1
            r0.limit(r2)     // Catch:{ IllegalStateException -> 0x0352 }
        L_0x01e5:
            boolean r0 = r15.f17424j0     // Catch:{ IllegalStateException -> 0x0352 }
            if (r0 == 0) goto L_0x0206
            android.media.MediaCodec$BufferInfo r0 = r15.f17387D     // Catch:{ IllegalStateException -> 0x0352 }
            long r1 = r0.presentationTimeUs     // Catch:{ IllegalStateException -> 0x0352 }
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0206
            int r1 = r0.flags     // Catch:{ IllegalStateException -> 0x0352 }
            r1 = r1 & 4
            if (r1 == 0) goto L_0x0206
            long r1 = r15.f17390E0     // Catch:{ IllegalStateException -> 0x0352 }
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0206
            r0.presentationTimeUs = r1     // Catch:{ IllegalStateException -> 0x0352 }
        L_0x0206:
            android.media.MediaCodec$BufferInfo r0 = r15.f17387D     // Catch:{ IllegalStateException -> 0x0352 }
            long r0 = r0.presentationTimeUs     // Catch:{ IllegalStateException -> 0x0352 }
            java.util.ArrayList r2 = r15.f17385C     // Catch:{ IllegalStateException -> 0x0352 }
            int r2 = r2.size()     // Catch:{ IllegalStateException -> 0x0352 }
            r3 = 0
        L_0x0211:
            if (r3 >= r2) goto L_0x022d
            java.util.ArrayList r4 = r15.f17385C     // Catch:{ IllegalStateException -> 0x0352 }
            java.lang.Object r4 = r4.get(r3)     // Catch:{ IllegalStateException -> 0x0352 }
            java.lang.Long r4 = (java.lang.Long) r4     // Catch:{ IllegalStateException -> 0x0352 }
            long r4 = r4.longValue()     // Catch:{ IllegalStateException -> 0x0352 }
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 != 0) goto L_0x022a
            java.util.ArrayList r0 = r15.f17385C     // Catch:{ IllegalStateException -> 0x0352 }
            r0.remove(r3)     // Catch:{ IllegalStateException -> 0x0352 }
            r0 = 1
            goto L_0x022e
        L_0x022a:
            int r3 = r3 + 1
            goto L_0x0211
        L_0x022d:
            r0 = 0
        L_0x022e:
            r15.f17433s0 = r0     // Catch:{ IllegalStateException -> 0x0352 }
            long r0 = r15.f17392F0     // Catch:{ IllegalStateException -> 0x0352 }
            android.media.MediaCodec$BufferInfo r2 = r15.f17387D     // Catch:{ IllegalStateException -> 0x0352 }
            long r2 = r2.presentationTimeUs     // Catch:{ IllegalStateException -> 0x0352 }
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x023c
            r0 = 1
            goto L_0x023d
        L_0x023c:
            r0 = 0
        L_0x023d:
            r15.f17434t0 = r0     // Catch:{ IllegalStateException -> 0x0352 }
            com.google.android.gms.internal.ads.d82 r0 = r15.f17383B     // Catch:{ IllegalStateException -> 0x0352 }
            java.lang.Object r0 = r0.mo9459c(r2)     // Catch:{ IllegalStateException -> 0x0352 }
            com.google.android.gms.internal.ads.g4 r0 = (com.google.android.gms.internal.ads.C2388g4) r0     // Catch:{ IllegalStateException -> 0x0352 }
            if (r0 != 0) goto L_0x0255
            boolean r1 = r15.f17413R     // Catch:{ IllegalStateException -> 0x0352 }
            if (r1 == 0) goto L_0x0255
            com.google.android.gms.internal.ads.d82 r0 = r15.f17383B     // Catch:{ IllegalStateException -> 0x0352 }
            java.lang.Object r0 = r0.mo9458b()     // Catch:{ IllegalStateException -> 0x0352 }
            com.google.android.gms.internal.ads.g4 r0 = (com.google.android.gms.internal.ads.C2388g4) r0     // Catch:{ IllegalStateException -> 0x0352 }
        L_0x0255:
            if (r0 == 0) goto L_0x025a
            r15.f17397I = r0     // Catch:{ IllegalStateException -> 0x0352 }
            goto L_0x0262
        L_0x025a:
            boolean r0 = r15.f17413R     // Catch:{ IllegalStateException -> 0x0352 }
            if (r0 == 0) goto L_0x026b
            com.google.android.gms.internal.ads.g4 r0 = r15.f17397I     // Catch:{ IllegalStateException -> 0x0352 }
            if (r0 == 0) goto L_0x026b
        L_0x0262:
            com.google.android.gms.internal.ads.g4 r0 = r15.f17397I     // Catch:{ IllegalStateException -> 0x0352 }
            android.media.MediaFormat r1 = r15.f17412Q     // Catch:{ IllegalStateException -> 0x0352 }
            r15.mo9149j0(r0, r1)     // Catch:{ IllegalStateException -> 0x0352 }
            r15.f17413R = r13     // Catch:{ IllegalStateException -> 0x0352 }
        L_0x026b:
            boolean r0 = r15.f17423i0     // Catch:{ IllegalStateException -> 0x0330 }
            if (r0 == 0) goto L_0x02c7
            boolean r0 = r15.f17386C0     // Catch:{ IllegalStateException -> 0x02c2 }
            if (r0 == 0) goto L_0x02c7
            com.google.android.gms.internal.ads.ne4 r6 = r15.f17409O     // Catch:{ IllegalStateException -> 0x02a8 }
            java.nio.ByteBuffer r7 = r15.f17432r0     // Catch:{ IllegalStateException -> 0x02a8 }
            int r8 = r15.f17431q0     // Catch:{ IllegalStateException -> 0x02a8 }
            android.media.MediaCodec$BufferInfo r0 = r15.f17387D     // Catch:{ IllegalStateException -> 0x02a8 }
            int r12 = r0.flags     // Catch:{ IllegalStateException -> 0x02a8 }
            r16 = 1
            long r4 = r0.presentationTimeUs     // Catch:{ IllegalStateException -> 0x02a8 }
            boolean r0 = r15.f17433s0     // Catch:{ IllegalStateException -> 0x02a8 }
            boolean r2 = r15.f17434t0     // Catch:{ IllegalStateException -> 0x02a8 }
            com.google.android.gms.internal.ads.g4 r3 = r15.f17397I     // Catch:{ IllegalStateException -> 0x02a8 }
            r1 = r23
            r17 = r2
            r18 = r3
            r2 = r24
            r19 = r4
            r4 = r26
            r21 = r9
            r9 = r12
            r10 = r16
            r16 = 2
            r11 = r19
            r19 = 0
            r13 = r0
            r14 = r17
            r15 = r18
            boolean r0 = r1.mo9156p0(r2, r4, r6, r7, r8, r9, r10, r11, r13, r14, r15)     // Catch:{ IllegalStateException -> 0x02ac }
            goto L_0x02eb
        L_0x02a8:
            r21 = r9
            r19 = 0
        L_0x02ac:
            r23.m20290H0()     // Catch:{ IllegalStateException -> 0x02bc }
            r15 = r23
            boolean r0 = r15.f17396H0     // Catch:{ IllegalStateException -> 0x032d }
            if (r0 == 0) goto L_0x02b8
            r23.mo13991z0()     // Catch:{ IllegalStateException -> 0x032d }
        L_0x02b8:
            r1 = r15
        L_0x02b9:
            r2 = r21
            goto L_0x0318
        L_0x02bc:
            r0 = move-exception
            r2 = 1
        L_0x02be:
            r1 = r23
            goto L_0x0357
        L_0x02c2:
            r0 = move-exception
            r19 = 0
            goto L_0x032e
        L_0x02c7:
            r21 = r9
            r16 = 2
            r19 = 0
            com.google.android.gms.internal.ads.ne4 r6 = r15.f17409O     // Catch:{ IllegalStateException -> 0x032d }
            java.nio.ByteBuffer r7 = r15.f17432r0     // Catch:{ IllegalStateException -> 0x032d }
            int r8 = r15.f17431q0     // Catch:{ IllegalStateException -> 0x032d }
            android.media.MediaCodec$BufferInfo r0 = r15.f17387D     // Catch:{ IllegalStateException -> 0x032d }
            int r9 = r0.flags     // Catch:{ IllegalStateException -> 0x032d }
            r10 = 1
            long r11 = r0.presentationTimeUs     // Catch:{ IllegalStateException -> 0x032d }
            boolean r13 = r15.f17433s0     // Catch:{ IllegalStateException -> 0x032d }
            boolean r14 = r15.f17434t0     // Catch:{ IllegalStateException -> 0x032d }
            com.google.android.gms.internal.ads.g4 r0 = r15.f17397I     // Catch:{ IllegalStateException -> 0x032d }
            r1 = r23
            r2 = r24
            r4 = r26
            r15 = r0
            boolean r0 = r1.mo9156p0(r2, r4, r6, r7, r8, r9, r10, r11, r13, r14, r15)     // Catch:{ IllegalStateException -> 0x0329 }
        L_0x02eb:
            if (r0 == 0) goto L_0x0315
            r1 = r23
            android.media.MediaCodec$BufferInfo r0 = r1.f17387D     // Catch:{ IllegalStateException -> 0x034f }
            long r2 = r0.presentationTimeUs     // Catch:{ IllegalStateException -> 0x034f }
            r1.mo12381y0(r2)     // Catch:{ IllegalStateException -> 0x034f }
            android.media.MediaCodec$BufferInfo r0 = r1.f17387D     // Catch:{ IllegalStateException -> 0x034f }
            int r0 = r0.flags     // Catch:{ IllegalStateException -> 0x034f }
            r23.m20292J0()     // Catch:{ IllegalStateException -> 0x034f }
            r0 = r0 & 4
            if (r0 == 0) goto L_0x0305
            r23.m20290H0()     // Catch:{ IllegalStateException -> 0x034f }
            goto L_0x02b9
        L_0x0305:
            r2 = r21
        L_0x0307:
            boolean r0 = r1.m20300f0(r2)     // Catch:{ IllegalStateException -> 0x034f }
            if (r0 != 0) goto L_0x030e
            goto L_0x0318
        L_0x030e:
            r15 = r1
            r9 = r2
            r11 = 2
            r13 = 0
            r14 = 1
            goto L_0x0139
        L_0x0315:
            r1 = r23
            goto L_0x02b9
        L_0x0318:
            boolean r0 = r23.m20297Z()     // Catch:{ IllegalStateException -> 0x034f }
            if (r0 == 0) goto L_0x0324
            boolean r0 = r1.m20300f0(r2)     // Catch:{ IllegalStateException -> 0x034f }
            if (r0 != 0) goto L_0x0318
        L_0x0324:
            android.os.Trace.endSection()     // Catch:{ IllegalStateException -> 0x034f }
            r2 = 1
            goto L_0x0347
        L_0x0329:
            r0 = move-exception
            r1 = r23
            goto L_0x0350
        L_0x032d:
            r0 = move-exception
        L_0x032e:
            r1 = r15
            goto L_0x0350
        L_0x0330:
            r0 = move-exception
            r1 = r15
            r19 = 0
            goto L_0x0350
        L_0x0335:
            r1 = r15
            r19 = 0
            com.google.android.gms.internal.ads.ny3 r0 = r1.f17400J0     // Catch:{ IllegalStateException -> 0x034f }
            int r2 = r0.f14233d     // Catch:{ IllegalStateException -> 0x034f }
            int r3 = r23.mo13086v(r24)     // Catch:{ IllegalStateException -> 0x034f }
            int r2 = r2 + r3
            r0.f14233d = r2     // Catch:{ IllegalStateException -> 0x034f }
            r2 = 1
            r1.m20299d0(r2)     // Catch:{ IllegalStateException -> 0x034d }
        L_0x0347:
            com.google.android.gms.internal.ads.ny3 r0 = r1.f17400J0     // Catch:{ IllegalStateException -> 0x034d }
            r0.mo12729a()     // Catch:{ IllegalStateException -> 0x034d }
            return
        L_0x034d:
            r0 = move-exception
            goto L_0x0357
        L_0x034f:
            r0 = move-exception
        L_0x0350:
            r2 = 1
            goto L_0x0357
        L_0x0352:
            r0 = move-exception
            r1 = r15
            r2 = 1
            r19 = 0
        L_0x0357:
            int r3 = com.google.android.gms.internal.ads.gb2.f9812a
            r4 = 21
            if (r3 < r4) goto L_0x0362
            boolean r5 = r0 instanceof android.media.MediaCodec.CodecException
            if (r5 == 0) goto L_0x0362
            goto L_0x0377
        L_0x0362:
            java.lang.StackTraceElement[] r5 = r0.getStackTrace()
            int r6 = r5.length
            if (r6 <= 0) goto L_0x03a0
            r5 = r5[r19]
            java.lang.String r5 = r5.getClassName()
            java.lang.String r6 = "android.media.MediaCodec"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x03a0
        L_0x0377:
            r1.mo9143R(r0)
            if (r3 < r4) goto L_0x038b
            boolean r3 = r0 instanceof android.media.MediaCodec.CodecException
            if (r3 == 0) goto L_0x038b
            r3 = r0
            android.media.MediaCodec$CodecException r3 = (android.media.MediaCodec.CodecException) r3
            boolean r3 = r3.isRecoverable()
            if (r3 == 0) goto L_0x038b
            r14 = 1
            goto L_0x038c
        L_0x038b:
            r14 = 0
        L_0x038c:
            if (r14 == 0) goto L_0x0391
            r23.mo13991z0()
        L_0x0391:
            com.google.android.gms.internal.ads.pe4 r2 = r1.f17417c0
            com.google.android.gms.internal.ads.oe4 r0 = r1.mo12379u0(r0, r2)
            com.google.android.gms.internal.ads.g4 r2 = r1.f17395H
            r3 = 4003(0xfa3, float:5.61E-42)
            com.google.android.gms.internal.ads.u44 r0 = r1.mo13085u(r0, r2, r14, r3)
            throw r0
        L_0x03a0:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.se4.mo12632l(long, long):void");
    }

    /* renamed from: m */
    public boolean mo9152m() {
        if (this.f17395H != null) {
            if (mo13082p() || m20298b0()) {
                return true;
            }
            if (this.f17429o0 == -9223372036854775807L || SystemClock.elapsedRealtime() >= this.f17429o0) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m0 */
    public abstract void mo9153m0();

    /* access modifiers changed from: protected */
    /* renamed from: n0 */
    public abstract void mo9154n0(fo3 fo3) throws u44;

    /* access modifiers changed from: protected */
    /* renamed from: o0 */
    public void mo9155o0() throws u44 {
    }

    /* access modifiers changed from: protected */
    /* renamed from: p0 */
    public abstract boolean mo9156p0(long j, long j2, ne4 ne4, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, C2388g4 g4Var) throws u44;

    /* access modifiers changed from: protected */
    /* renamed from: q0 */
    public boolean mo9157q0(C2388g4 g4Var) {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r0 */
    public final float mo13986r0() {
        return this.f17405M;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s0 */
    public final long mo13987s0() {
        return this.f17404L0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t0 */
    public final ne4 mo13988t0() {
        return this.f17409O;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u0 */
    public oe4 mo12379u0(Throwable th, pe4 pe4) {
        return new oe4(th, pe4);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v0 */
    public final pe4 mo13989v0() {
        return this.f17417c0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w0 */
    public void mo12380w0(fo3 fo3) throws u44 {
    }

    /* access modifiers changed from: protected */
    /* renamed from: x0 */
    public final void mo13990x0() throws u44 {
        C2388g4 g4Var;
        if (this.f17409O == null && !this.f17436u0 && (g4Var = this.f17395H) != null) {
            if (this.f17410O0 != null || !mo9157q0(g4Var)) {
                sd4 sd4 = this.f17410O0;
                this.f17408N0 = sd4;
                C2388g4 g4Var2 = this.f17395H;
                String str = g4Var2.f9673l;
                if (sd4 == null || !td4.f17961a) {
                    try {
                        if (this.f17415a0 == null) {
                            List Q = mo9142Q(this.f17437v, g4Var2, false);
                            Q.isEmpty();
                            this.f17415a0 = new ArrayDeque();
                            if (!Q.isEmpty()) {
                                this.f17415a0.add((pe4) Q.get(0));
                            }
                            this.f17416b0 = null;
                        }
                        if (!this.f17415a0.isEmpty()) {
                            pe4 pe4 = (pe4) this.f17415a0.peekFirst();
                            while (this.f17409O == null) {
                                pe4 pe42 = (pe4) this.f17415a0.peekFirst();
                                if (mo12372E0(pe42)) {
                                    try {
                                        m20289G0(pe42, (MediaCrypto) null);
                                    } catch (Exception e) {
                                        if (pe42 == pe4) {
                                            ot1.m18060e("MediaCodecRenderer", "Preferred decoder instantiation failed. Sleeping for 50ms then retrying.");
                                            Thread.sleep(50);
                                            m20289G0(pe42, (MediaCrypto) null);
                                        } else {
                                            throw e;
                                        }
                                    } catch (Exception e2) {
                                        ot1.m18061f("MediaCodecRenderer", "Failed to initialize decoder: ".concat(String.valueOf(pe42)), e2);
                                        this.f17415a0.removeFirst();
                                        re4 re4 = new re4(this.f17395H, (Throwable) e2, false, pe42);
                                        mo9143R(re4);
                                        re4 re42 = this.f17416b0;
                                        if (re42 == null) {
                                            this.f17416b0 = re4;
                                        } else {
                                            this.f17416b0 = re4.m19812a(re42, re4);
                                        }
                                        if (this.f17415a0.isEmpty()) {
                                            throw this.f17416b0;
                                        }
                                    }
                                } else {
                                    return;
                                }
                            }
                            this.f17415a0 = null;
                            return;
                        }
                        throw new re4(this.f17395H, (Throwable) null, false, -49999);
                    } catch (bf4 e3) {
                        throw new re4(this.f17395H, (Throwable) e3, false, -49998);
                    } catch (re4 e4) {
                        throw mo13085u(e4, this.f17395H, false, 4001);
                    }
                } else {
                    jd4 a = sd4.mo13977a();
                    throw mo13085u(a, this.f17395H, false, a.f11330a);
                }
            } else {
                C2388g4 g4Var3 = this.f17395H;
                m20293N();
                String str2 = g4Var3.f9673l;
                if ("audio/mp4a-latm".equals(str2) || "audio/mpeg".equals(str2) || "audio/opus".equals(str2)) {
                    this.f17381A.mo10805o(32);
                } else {
                    this.f17381A.mo10805o(1);
                }
                this.f17436u0 = true;
            }
        }
    }

    /* renamed from: y */
    public boolean mo9159y() {
        return this.f17396H0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y0 */
    public void mo12381y0(long j) {
        while (true) {
            int i = this.f17406M0;
            if (i != 0 && j >= this.f17393G[0]) {
                long[] jArr = this.f17389E;
                this.f17402K0 = jArr[0];
                this.f17404L0 = this.f17391F[0];
                int i2 = i - 1;
                this.f17406M0 = i2;
                System.arraycopy(jArr, 1, jArr, 0, i2);
                long[] jArr2 = this.f17391F;
                System.arraycopy(jArr2, 1, jArr2, 0, this.f17406M0);
                long[] jArr3 = this.f17393G;
                System.arraycopy(jArr3, 1, jArr3, 0, this.f17406M0);
                mo9153m0();
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: z0 */
    public final void mo13991z0() {
        try {
            ne4 ne4 = this.f17409O;
            if (ne4 != null) {
                ne4.mo11681Z();
                this.f17400J0.f14231b++;
                mo9145U(this.f17417c0.f15824a);
            }
        } finally {
            this.f17409O = null;
            this.f17399J = null;
            this.f17408N0 = null;
            mo13983B0();
        }
    }
}
