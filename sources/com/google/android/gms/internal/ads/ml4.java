package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class ml4 extends se4 {

    /* renamed from: v1 */
    private static final int[] f13361v1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* renamed from: w1 */
    private static boolean f13362w1;

    /* renamed from: x1 */
    private static boolean f13363x1;

    /* renamed from: Q0 */
    private final Context f13364Q0;

    /* renamed from: R0 */
    private final xl4 f13365R0;

    /* renamed from: S0 */
    private final jm4 f13366S0;

    /* renamed from: T0 */
    private final boolean f13367T0 = "NVIDIA".equals(gb2.f9814c);

    /* renamed from: U0 */
    private ll4 f13368U0;

    /* renamed from: V0 */
    private boolean f13369V0;

    /* renamed from: W0 */
    private boolean f13370W0;

    /* renamed from: X0 */
    private Surface f13371X0;

    /* renamed from: Y0 */
    private pl4 f13372Y0;

    /* renamed from: Z0 */
    private boolean f13373Z0;

    /* renamed from: a1 */
    private int f13374a1 = 1;

    /* renamed from: b1 */
    private boolean f13375b1;

    /* renamed from: c1 */
    private boolean f13376c1;

    /* renamed from: d1 */
    private boolean f13377d1;

    /* renamed from: e1 */
    private long f13378e1;

    /* renamed from: f1 */
    private long f13379f1 = -9223372036854775807L;

    /* renamed from: g1 */
    private long f13380g1;

    /* renamed from: h1 */
    private int f13381h1;

    /* renamed from: i1 */
    private int f13382i1;

    /* renamed from: j1 */
    private int f13383j1;

    /* renamed from: k1 */
    private long f13384k1;

    /* renamed from: l1 */
    private long f13385l1;

    /* renamed from: m1 */
    private long f13386m1;

    /* renamed from: n1 */
    private int f13387n1;

    /* renamed from: o1 */
    private int f13388o1 = -1;

    /* renamed from: p1 */
    private int f13389p1 = -1;

    /* renamed from: q1 */
    private int f13390q1;

    /* renamed from: r1 */
    private float f13391r1 = -1.0f;

    /* renamed from: s1 */
    private s61 f13392s1 = null;

    /* renamed from: t1 */
    private int f13393t1 = 0;

    /* renamed from: u1 */
    private ql4 f13394u1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ml4(Context context, me4 me4, ue4 ue4, long j, boolean z, Handler handler, km4 km4, int i, float f) {
        super(2, me4, ue4, false, 30.0f);
        Context applicationContext = context.getApplicationContext();
        this.f13364Q0 = applicationContext;
        this.f13365R0 = new xl4(applicationContext);
        Handler handler2 = handler;
        km4 km42 = km4;
        this.f13366S0 = new jm4(handler, km4);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0060, code lost:
        if (r3.equals("video/mp4v-es") != false) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0021, code lost:
        r11 = ((java.lang.Integer) r11.first).intValue();
     */
    /* renamed from: K0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m16559K0(com.google.android.gms.internal.ads.pe4 r10, com.google.android.gms.internal.ads.C2388g4 r11) {
        /*
            int r0 = r11.f9678q
            int r1 = r11.f9679r
            r2 = -1
            if (r0 == r2) goto L_0x00c7
            if (r1 != r2) goto L_0x000b
            goto L_0x00c7
        L_0x000b:
            java.lang.String r3 = r11.f9673l
            java.lang.String r4 = "video/dolby-vision"
            boolean r4 = r4.equals(r3)
            r5 = 1
            java.lang.String r6 = "video/avc"
            java.lang.String r7 = "video/hevc"
            r8 = 2
            if (r4 == 0) goto L_0x0034
            android.util.Pair r11 = com.google.android.gms.internal.ads.if4.m14305b(r11)
            if (r11 == 0) goto L_0x0033
            java.lang.Object r11 = r11.first
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            r3 = 512(0x200, float:7.175E-43)
            if (r11 == r3) goto L_0x0031
            if (r11 == r5) goto L_0x0031
            if (r11 != r8) goto L_0x0033
        L_0x0031:
            r3 = r6
            goto L_0x0034
        L_0x0033:
            r3 = r7
        L_0x0034:
            int r11 = r3.hashCode()
            r4 = 4
            r9 = 3
            switch(r11) {
                case -1664118616: goto L_0x0075;
                case -1662735862: goto L_0x006b;
                case -1662541442: goto L_0x0063;
                case 1187890754: goto L_0x005a;
                case 1331836730: goto L_0x0052;
                case 1599127256: goto L_0x0048;
                case 1599127257: goto L_0x003e;
                default: goto L_0x003d;
            }
        L_0x003d:
            goto L_0x007f
        L_0x003e:
            java.lang.String r11 = "video/x-vnd.on2.vp9"
            boolean r11 = r3.equals(r11)
            if (r11 == 0) goto L_0x007f
            r5 = 6
            goto L_0x0080
        L_0x0048:
            java.lang.String r11 = "video/x-vnd.on2.vp8"
            boolean r11 = r3.equals(r11)
            if (r11 == 0) goto L_0x007f
            r5 = 4
            goto L_0x0080
        L_0x0052:
            boolean r11 = r3.equals(r6)
            if (r11 == 0) goto L_0x007f
            r5 = 2
            goto L_0x0080
        L_0x005a:
            java.lang.String r11 = "video/mp4v-es"
            boolean r11 = r3.equals(r11)
            if (r11 == 0) goto L_0x007f
            goto L_0x0080
        L_0x0063:
            boolean r11 = r3.equals(r7)
            if (r11 == 0) goto L_0x007f
            r5 = 5
            goto L_0x0080
        L_0x006b:
            java.lang.String r11 = "video/av01"
            boolean r11 = r3.equals(r11)
            if (r11 == 0) goto L_0x007f
            r5 = 3
            goto L_0x0080
        L_0x0075:
            java.lang.String r11 = "video/3gpp"
            boolean r11 = r3.equals(r11)
            if (r11 == 0) goto L_0x007f
            r5 = 0
            goto L_0x0080
        L_0x007f:
            r5 = -1
        L_0x0080:
            switch(r5) {
                case 0: goto L_0x00c0;
                case 1: goto L_0x00c0;
                case 2: goto L_0x0088;
                case 3: goto L_0x00c0;
                case 4: goto L_0x00c0;
                case 5: goto L_0x0084;
                case 6: goto L_0x0084;
                default: goto L_0x0083;
            }
        L_0x0083:
            return r2
        L_0x0084:
            int r0 = r0 * r1
            r8 = 4
            goto L_0x00c2
        L_0x0088:
            java.lang.String r11 = com.google.android.gms.internal.ads.gb2.f9815d
            java.lang.String r3 = "BRAVIA 4K 2015"
            boolean r3 = r3.equals(r11)
            if (r3 != 0) goto L_0x00bf
            java.lang.String r3 = com.google.android.gms.internal.ads.gb2.f9814c
            java.lang.String r4 = "Amazon"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x00b0
            java.lang.String r3 = "KFSOWI"
            boolean r3 = r3.equals(r11)
            if (r3 != 0) goto L_0x00bf
            java.lang.String r3 = "AFTS"
            boolean r11 = r3.equals(r11)
            if (r11 == 0) goto L_0x00b0
            boolean r10 = r10.f15829f
            if (r10 != 0) goto L_0x00bf
        L_0x00b0:
            r10 = 16
            int r11 = com.google.android.gms.internal.ads.gb2.m13145O(r0, r10)
            int r10 = com.google.android.gms.internal.ads.gb2.m13145O(r1, r10)
            int r11 = r11 * r10
            int r0 = r11 * 256
            goto L_0x00c2
        L_0x00bf:
            return r2
        L_0x00c0:
            int r0 = r0 * r1
        L_0x00c2:
            int r0 = r0 * 3
            int r8 = r8 + r8
            int r0 = r0 / r8
            return r0
        L_0x00c7:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ml4.m16559K0(com.google.android.gms.internal.ads.pe4, com.google.android.gms.internal.ads.g4):int");
    }

    /* renamed from: L0 */
    protected static int m16560L0(pe4 pe4, C2388g4 g4Var) {
        if (g4Var.f9674m == -1) {
            return m16559K0(pe4, g4Var);
        }
        int size = g4Var.f9675n.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((byte[]) g4Var.f9675n.get(i2)).length;
        }
        return g4Var.f9674m + i;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x04c0, code lost:
        if (r0.equals("deb") != false) goto L_0x078a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:511:0x07a0, code lost:
        if (r10 != 0) goto L_0x07a2;
     */
    /* renamed from: N0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static final boolean m16561N0(java.lang.String r17) {
        /*
            java.lang.String r0 = "OMX.google"
            r1 = r17
            boolean r0 = r1.startsWith(r0)
            r1 = 0
            if (r0 == 0) goto L_0x000c
            return r1
        L_0x000c:
            java.lang.Class<com.google.android.gms.internal.ads.ml4> r2 = com.google.android.gms.internal.ads.ml4.class
            monitor-enter(r2)
            boolean r0 = f13362w1     // Catch:{ all -> 0x07aa }
            if (r0 != 0) goto L_0x07a6
            int r0 = com.google.android.gms.internal.ads.gb2.f9812a     // Catch:{ all -> 0x07aa }
            r3 = 28
            r4 = 5
            r5 = 6
            r6 = 4
            r7 = 7
            r8 = 2
            r9 = 3
            r10 = -1
            r11 = 1
            if (r0 > r3) goto L_0x0083
            java.lang.String r12 = com.google.android.gms.internal.ads.gb2.f9813b     // Catch:{ all -> 0x07aa }
            int r13 = r12.hashCode()     // Catch:{ all -> 0x07aa }
            switch(r13) {
                case -1339091551: goto L_0x0071;
                case -1220081023: goto L_0x0067;
                case -1220066608: goto L_0x005d;
                case -1012436106: goto L_0x0053;
                case -760312546: goto L_0x0049;
                case -64886864: goto L_0x003f;
                case 3415681: goto L_0x0035;
                case 825323514: goto L_0x002b;
                default: goto L_0x002a;
            }
        L_0x002a:
            goto L_0x007b
        L_0x002b:
            java.lang.String r13 = "machuca"
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L_0x007b
            r12 = 5
            goto L_0x007c
        L_0x0035:
            java.lang.String r13 = "once"
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L_0x007b
            r12 = 6
            goto L_0x007c
        L_0x003f:
            java.lang.String r13 = "magnolia"
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L_0x007b
            r12 = 4
            goto L_0x007c
        L_0x0049:
            java.lang.String r13 = "aquaman"
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L_0x007b
            r12 = 0
            goto L_0x007c
        L_0x0053:
            java.lang.String r13 = "oneday"
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L_0x007b
            r12 = 7
            goto L_0x007c
        L_0x005d:
            java.lang.String r13 = "dangalUHD"
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L_0x007b
            r12 = 2
            goto L_0x007c
        L_0x0067:
            java.lang.String r13 = "dangalFHD"
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L_0x007b
            r12 = 3
            goto L_0x007c
        L_0x0071:
            java.lang.String r13 = "dangal"
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L_0x007b
            r12 = 1
            goto L_0x007c
        L_0x007b:
            r12 = -1
        L_0x007c:
            switch(r12) {
                case 0: goto L_0x0080;
                case 1: goto L_0x0080;
                case 2: goto L_0x0080;
                case 3: goto L_0x0080;
                case 4: goto L_0x0080;
                case 5: goto L_0x0080;
                case 6: goto L_0x0080;
                case 7: goto L_0x0080;
                default: goto L_0x007f;
            }
        L_0x007f:
            goto L_0x0083
        L_0x0080:
            r1 = 1
            goto L_0x07a2
        L_0x0083:
            r12 = 27
            if (r0 > r12) goto L_0x0092
            java.lang.String r13 = "HWEML"
            java.lang.String r14 = com.google.android.gms.internal.ads.gb2.f9813b     // Catch:{ all -> 0x07aa }
            boolean r13 = r13.equals(r14)     // Catch:{ all -> 0x07aa }
            if (r13 == 0) goto L_0x0092
            goto L_0x0080
        L_0x0092:
            java.lang.String r13 = com.google.android.gms.internal.ads.gb2.f9815d     // Catch:{ all -> 0x07aa }
            int r14 = r13.hashCode()     // Catch:{ all -> 0x07aa }
            r15 = 8
            switch(r14) {
                case -349662828: goto L_0x00ef;
                case -321033677: goto L_0x00e5;
                case 2006354: goto L_0x00db;
                case 2006367: goto L_0x00d1;
                case 2006371: goto L_0x00c7;
                case 1785421873: goto L_0x00bd;
                case 1785421876: goto L_0x00b3;
                case 1798172390: goto L_0x00a8;
                case 2119412532: goto L_0x009e;
                default: goto L_0x009d;
            }
        L_0x009d:
            goto L_0x00f9
        L_0x009e:
            java.lang.String r14 = "AFTEUFF014"
            boolean r14 = r13.equals(r14)
            if (r14 == 0) goto L_0x00f9
            r14 = 5
            goto L_0x00fa
        L_0x00a8:
            java.lang.String r14 = "AFTSO001"
            boolean r14 = r13.equals(r14)
            if (r14 == 0) goto L_0x00f9
            r14 = 8
            goto L_0x00fa
        L_0x00b3:
            java.lang.String r14 = "AFTEU014"
            boolean r14 = r13.equals(r14)
            if (r14 == 0) goto L_0x00f9
            r14 = 4
            goto L_0x00fa
        L_0x00bd:
            java.lang.String r14 = "AFTEU011"
            boolean r14 = r13.equals(r14)
            if (r14 == 0) goto L_0x00f9
            r14 = 3
            goto L_0x00fa
        L_0x00c7:
            java.lang.String r14 = "AFTR"
            boolean r14 = r13.equals(r14)
            if (r14 == 0) goto L_0x00f9
            r14 = 2
            goto L_0x00fa
        L_0x00d1:
            java.lang.String r14 = "AFTN"
            boolean r14 = r13.equals(r14)
            if (r14 == 0) goto L_0x00f9
            r14 = 1
            goto L_0x00fa
        L_0x00db:
            java.lang.String r14 = "AFTA"
            boolean r14 = r13.equals(r14)
            if (r14 == 0) goto L_0x00f9
            r14 = 0
            goto L_0x00fa
        L_0x00e5:
            java.lang.String r14 = "AFTKMST12"
            boolean r14 = r13.equals(r14)
            if (r14 == 0) goto L_0x00f9
            r14 = 7
            goto L_0x00fa
        L_0x00ef:
            java.lang.String r14 = "AFTJMST12"
            boolean r14 = r13.equals(r14)
            if (r14 == 0) goto L_0x00f9
            r14 = 6
            goto L_0x00fa
        L_0x00f9:
            r14 = -1
        L_0x00fa:
            switch(r14) {
                case 0: goto L_0x0080;
                case 1: goto L_0x0080;
                case 2: goto L_0x0080;
                case 3: goto L_0x0080;
                case 4: goto L_0x0080;
                case 5: goto L_0x0080;
                case 6: goto L_0x0080;
                case 7: goto L_0x0080;
                case 8: goto L_0x0080;
                default: goto L_0x00fd;
            }
        L_0x00fd:
            r14 = 26
            if (r0 > r14) goto L_0x07a2
            java.lang.String r0 = com.google.android.gms.internal.ads.gb2.f9813b     // Catch:{ all -> 0x07aa }
            int r16 = r0.hashCode()     // Catch:{ all -> 0x07aa }
            switch(r16) {
                case -2144781245: goto L_0x077e;
                case -2144781185: goto L_0x0773;
                case -2144781160: goto L_0x0768;
                case -2097309513: goto L_0x075d;
                case -2022874474: goto L_0x0752;
                case -1978993182: goto L_0x0747;
                case -1978990237: goto L_0x073c;
                case -1936688988: goto L_0x0731;
                case -1936688066: goto L_0x0726;
                case -1936688065: goto L_0x071a;
                case -1931988508: goto L_0x070e;
                case -1885099851: goto L_0x0702;
                case -1696512866: goto L_0x06f6;
                case -1680025915: goto L_0x06ea;
                case -1615810839: goto L_0x06de;
                case -1600724499: goto L_0x06d2;
                case -1554255044: goto L_0x06c6;
                case -1481772737: goto L_0x06ba;
                case -1481772730: goto L_0x06ae;
                case -1481772729: goto L_0x06a2;
                case -1320080169: goto L_0x0696;
                case -1217592143: goto L_0x068a;
                case -1180384755: goto L_0x067e;
                case -1139198265: goto L_0x0672;
                case -1052835013: goto L_0x0666;
                case -993250464: goto L_0x065b;
                case -993250458: goto L_0x0650;
                case -965403638: goto L_0x0644;
                case -958336948: goto L_0x0638;
                case -879245230: goto L_0x062c;
                case -842500323: goto L_0x0620;
                case -821392978: goto L_0x0614;
                case -797483286: goto L_0x0608;
                case -794946968: goto L_0x05fc;
                case -788334647: goto L_0x05f0;
                case -782144577: goto L_0x05e4;
                case -575125681: goto L_0x05d8;
                case -521118391: goto L_0x05cc;
                case -430914369: goto L_0x05c0;
                case -290434366: goto L_0x05b4;
                case -282781963: goto L_0x05a8;
                case -277133239: goto L_0x059c;
                case -173639913: goto L_0x0590;
                case -56598463: goto L_0x0584;
                case 2126: goto L_0x0578;
                case 2564: goto L_0x056c;
                case 2715: goto L_0x0560;
                case 2719: goto L_0x0554;
                case 3091: goto L_0x0548;
                case 3483: goto L_0x053c;
                case 73405: goto L_0x0530;
                case 75537: goto L_0x0524;
                case 75739: goto L_0x0518;
                case 76779: goto L_0x050c;
                case 78669: goto L_0x0500;
                case 79305: goto L_0x04f4;
                case 80618: goto L_0x04e8;
                case 88274: goto L_0x04dc;
                case 98846: goto L_0x04d0;
                case 98848: goto L_0x04c4;
                case 99329: goto L_0x04ba;
                case 101481: goto L_0x04ae;
                case 1513190: goto L_0x04a3;
                case 1514184: goto L_0x0498;
                case 1514185: goto L_0x048d;
                case 2133089: goto L_0x0481;
                case 2133091: goto L_0x0475;
                case 2133120: goto L_0x0469;
                case 2133151: goto L_0x045d;
                case 2133182: goto L_0x0451;
                case 2133184: goto L_0x0445;
                case 2436959: goto L_0x0439;
                case 2463773: goto L_0x042d;
                case 2464648: goto L_0x0421;
                case 2689555: goto L_0x0415;
                case 3154429: goto L_0x0409;
                case 3284551: goto L_0x03fd;
                case 3351335: goto L_0x03f1;
                case 3386211: goto L_0x03e5;
                case 41325051: goto L_0x03d9;
                case 51349633: goto L_0x03ce;
                case 51350594: goto L_0x03c3;
                case 55178625: goto L_0x03b7;
                case 61542055: goto L_0x03ac;
                case 65355429: goto L_0x03a0;
                case 66214468: goto L_0x0394;
                case 66214470: goto L_0x0388;
                case 66214473: goto L_0x037c;
                case 66215429: goto L_0x0370;
                case 66215431: goto L_0x0364;
                case 66215433: goto L_0x0358;
                case 66216390: goto L_0x034c;
                case 76402249: goto L_0x0340;
                case 76404105: goto L_0x0334;
                case 76404911: goto L_0x0328;
                case 80963634: goto L_0x031c;
                case 82882791: goto L_0x0310;
                case 98715550: goto L_0x0304;
                case 101370885: goto L_0x02f8;
                case 102844228: goto L_0x02ec;
                case 165221241: goto L_0x02e0;
                case 182191441: goto L_0x02d4;
                case 245388979: goto L_0x02c8;
                case 287431619: goto L_0x02bc;
                case 307593612: goto L_0x02b0;
                case 308517133: goto L_0x02a4;
                case 316215098: goto L_0x0298;
                case 316215116: goto L_0x028c;
                case 316246811: goto L_0x0280;
                case 316246818: goto L_0x0274;
                case 407160593: goto L_0x0268;
                case 507412548: goto L_0x025c;
                case 793982701: goto L_0x0250;
                case 794038622: goto L_0x0244;
                case 794040393: goto L_0x0238;
                case 835649806: goto L_0x022c;
                case 917340916: goto L_0x0220;
                case 958008161: goto L_0x0214;
                case 1060579533: goto L_0x0208;
                case 1150207623: goto L_0x01fc;
                case 1176899427: goto L_0x01f0;
                case 1280332038: goto L_0x01e4;
                case 1306947716: goto L_0x01d8;
                case 1349174697: goto L_0x01cc;
                case 1522194893: goto L_0x01c0;
                case 1691543273: goto L_0x01b4;
                case 1691544261: goto L_0x01a8;
                case 1709443163: goto L_0x019c;
                case 1865889110: goto L_0x0190;
                case 1906253259: goto L_0x0184;
                case 1977196784: goto L_0x0178;
                case 2006372676: goto L_0x016c;
                case 2019281702: goto L_0x0160;
                case 2029784656: goto L_0x0154;
                case 2030379515: goto L_0x0148;
                case 2033393791: goto L_0x013c;
                case 2047190025: goto L_0x0130;
                case 2047252157: goto L_0x0124;
                case 2048319463: goto L_0x0118;
                case 2048855701: goto L_0x010c;
                default: goto L_0x010a;
            }
        L_0x010a:
            goto L_0x0789
        L_0x010c:
            java.lang.String r3 = "HWWAS-H"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 66
            goto L_0x078a
        L_0x0118:
            java.lang.String r3 = "HWVNS-H"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 65
            goto L_0x078a
        L_0x0124:
            java.lang.String r3 = "ELUGA_Prim"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 33
            goto L_0x078a
        L_0x0130:
            java.lang.String r3 = "ELUGA_Note"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 32
            goto L_0x078a
        L_0x013c:
            java.lang.String r3 = "ASUS_X00AD_2"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 14
            goto L_0x078a
        L_0x0148:
            java.lang.String r3 = "HWCAM-H"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 64
            goto L_0x078a
        L_0x0154:
            java.lang.String r3 = "HWBLN-H"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 63
            goto L_0x078a
        L_0x0160:
            java.lang.String r3 = "DM-01K"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 29
            goto L_0x078a
        L_0x016c:
            java.lang.String r3 = "BRAVIA_ATV3_4K"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 19
            goto L_0x078a
        L_0x0178:
            java.lang.String r3 = "Infinix-X572"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 69
            goto L_0x078a
        L_0x0184:
            java.lang.String r3 = "PB2-670M"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 100
            goto L_0x078a
        L_0x0190:
            java.lang.String r3 = "santoni"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 117(0x75, float:1.64E-43)
            goto L_0x078a
        L_0x019c:
            java.lang.String r3 = "iball8735_9806"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 68
            goto L_0x078a
        L_0x01a8:
            java.lang.String r3 = "CPH1715"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 24
            goto L_0x078a
        L_0x01b4:
            java.lang.String r3 = "CPH1609"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 23
            goto L_0x078a
        L_0x01c0:
            java.lang.String r3 = "woods_f"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 133(0x85, float:1.86E-43)
            goto L_0x078a
        L_0x01cc:
            java.lang.String r3 = "htc_e56ml_dtul"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 61
            goto L_0x078a
        L_0x01d8:
            java.lang.String r3 = "EverStar_S"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 35
            goto L_0x078a
        L_0x01e4:
            java.lang.String r3 = "hwALE-H"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 62
            goto L_0x078a
        L_0x01f0:
            java.lang.String r3 = "itel_S41"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 71
            goto L_0x078a
        L_0x01fc:
            java.lang.String r3 = "LS-5017"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 78
            goto L_0x078a
        L_0x0208:
            java.lang.String r3 = "panell_d"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 96
            goto L_0x078a
        L_0x0214:
            java.lang.String r3 = "j2xlteins"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 72
            goto L_0x078a
        L_0x0220:
            java.lang.String r3 = "A7000plus"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 10
            goto L_0x078a
        L_0x022c:
            java.lang.String r3 = "manning"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 81
            goto L_0x078a
        L_0x0238:
            java.lang.String r3 = "GIONEE_WBL7519"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 59
            goto L_0x078a
        L_0x0244:
            java.lang.String r3 = "GIONEE_WBL7365"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 58
            goto L_0x078a
        L_0x0250:
            java.lang.String r3 = "GIONEE_WBL5708"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 57
            goto L_0x078a
        L_0x025c:
            java.lang.String r3 = "QM16XE_U"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 114(0x72, float:1.6E-43)
            goto L_0x078a
        L_0x0268:
            java.lang.String r3 = "Pixi5-10_4G"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 106(0x6a, float:1.49E-43)
            goto L_0x078a
        L_0x0274:
            java.lang.String r3 = "TB3-850M"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 125(0x7d, float:1.75E-43)
            goto L_0x078a
        L_0x0280:
            java.lang.String r3 = "TB3-850F"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 124(0x7c, float:1.74E-43)
            goto L_0x078a
        L_0x028c:
            java.lang.String r3 = "TB3-730X"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 123(0x7b, float:1.72E-43)
            goto L_0x078a
        L_0x0298:
            java.lang.String r3 = "TB3-730F"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 122(0x7a, float:1.71E-43)
            goto L_0x078a
        L_0x02a4:
            java.lang.String r3 = "A7020a48"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 12
            goto L_0x078a
        L_0x02b0:
            java.lang.String r3 = "A7010a48"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 11
            goto L_0x078a
        L_0x02bc:
            java.lang.String r3 = "griffin"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 60
            goto L_0x078a
        L_0x02c8:
            java.lang.String r3 = "marino_f"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 82
            goto L_0x078a
        L_0x02d4:
            java.lang.String r3 = "CPY83_I00"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 25
            goto L_0x078a
        L_0x02e0:
            java.lang.String r3 = "A2016a40"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 8
            goto L_0x078a
        L_0x02ec:
            java.lang.String r3 = "le_x6"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 77
            goto L_0x078a
        L_0x02f8:
            java.lang.String r3 = "l5460"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 76
            goto L_0x078a
        L_0x0304:
            java.lang.String r3 = "i9031"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 67
            goto L_0x078a
        L_0x0310:
            java.lang.String r3 = "X3_HK"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 135(0x87, float:1.89E-43)
            goto L_0x078a
        L_0x031c:
            java.lang.String r3 = "V23GB"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 128(0x80, float:1.794E-43)
            goto L_0x078a
        L_0x0328:
            java.lang.String r3 = "Q4310"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 112(0x70, float:1.57E-43)
            goto L_0x078a
        L_0x0334:
            java.lang.String r3 = "Q4260"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 110(0x6e, float:1.54E-43)
            goto L_0x078a
        L_0x0340:
            java.lang.String r3 = "PRO7S"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 108(0x6c, float:1.51E-43)
            goto L_0x078a
        L_0x034c:
            java.lang.String r3 = "F3311"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 48
            goto L_0x078a
        L_0x0358:
            java.lang.String r3 = "F3215"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 47
            goto L_0x078a
        L_0x0364:
            java.lang.String r3 = "F3213"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 46
            goto L_0x078a
        L_0x0370:
            java.lang.String r3 = "F3211"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 45
            goto L_0x078a
        L_0x037c:
            java.lang.String r3 = "F3116"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 44
            goto L_0x078a
        L_0x0388:
            java.lang.String r3 = "F3113"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 43
            goto L_0x078a
        L_0x0394:
            java.lang.String r3 = "F3111"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 42
            goto L_0x078a
        L_0x03a0:
            java.lang.String r3 = "E5643"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 30
            goto L_0x078a
        L_0x03ac:
            java.lang.String r3 = "A1601"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 7
            goto L_0x078a
        L_0x03b7:
            java.lang.String r3 = "Aura_Note_2"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 15
            goto L_0x078a
        L_0x03c3:
            java.lang.String r3 = "602LV"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 4
            goto L_0x078a
        L_0x03ce:
            java.lang.String r3 = "601LV"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 3
            goto L_0x078a
        L_0x03d9:
            java.lang.String r3 = "MEIZU_M5"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 83
            goto L_0x078a
        L_0x03e5:
            java.lang.String r3 = "p212"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 92
            goto L_0x078a
        L_0x03f1:
            java.lang.String r3 = "mido"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 85
            goto L_0x078a
        L_0x03fd:
            java.lang.String r3 = "kate"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 75
            goto L_0x078a
        L_0x0409:
            java.lang.String r3 = "fugu"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 50
            goto L_0x078a
        L_0x0415:
            java.lang.String r3 = "XE2X"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 136(0x88, float:1.9E-43)
            goto L_0x078a
        L_0x0421:
            java.lang.String r3 = "Q427"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 111(0x6f, float:1.56E-43)
            goto L_0x078a
        L_0x042d:
            java.lang.String r3 = "Q350"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 109(0x6d, float:1.53E-43)
            goto L_0x078a
        L_0x0439:
            java.lang.String r3 = "P681"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 93
            goto L_0x078a
        L_0x0445:
            java.lang.String r3 = "F04J"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 41
            goto L_0x078a
        L_0x0451:
            java.lang.String r3 = "F04H"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 40
            goto L_0x078a
        L_0x045d:
            java.lang.String r3 = "F03H"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 39
            goto L_0x078a
        L_0x0469:
            java.lang.String r3 = "F02H"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 38
            goto L_0x078a
        L_0x0475:
            java.lang.String r3 = "F01J"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 37
            goto L_0x078a
        L_0x0481:
            java.lang.String r3 = "F01H"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 36
            goto L_0x078a
        L_0x048d:
            java.lang.String r3 = "1714"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 2
            goto L_0x078a
        L_0x0498:
            java.lang.String r3 = "1713"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 1
            goto L_0x078a
        L_0x04a3:
            java.lang.String r3 = "1601"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 0
            goto L_0x078a
        L_0x04ae:
            java.lang.String r3 = "flo"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 49
            goto L_0x078a
        L_0x04ba:
            java.lang.String r4 = "deb"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0789
            goto L_0x078a
        L_0x04c4:
            java.lang.String r3 = "cv3"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 27
            goto L_0x078a
        L_0x04d0:
            java.lang.String r3 = "cv1"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 26
            goto L_0x078a
        L_0x04dc:
            java.lang.String r3 = "Z80"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 139(0x8b, float:1.95E-43)
            goto L_0x078a
        L_0x04e8:
            java.lang.String r3 = "QX1"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 115(0x73, float:1.61E-43)
            goto L_0x078a
        L_0x04f4:
            java.lang.String r3 = "PLE"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 107(0x6b, float:1.5E-43)
            goto L_0x078a
        L_0x0500:
            java.lang.String r3 = "P85"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 94
            goto L_0x078a
        L_0x050c:
            java.lang.String r3 = "MX6"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 86
            goto L_0x078a
        L_0x0518:
            java.lang.String r3 = "M5c"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 80
            goto L_0x078a
        L_0x0524:
            java.lang.String r3 = "M04"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 79
            goto L_0x078a
        L_0x0530:
            java.lang.String r3 = "JGZ"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 73
            goto L_0x078a
        L_0x053c:
            java.lang.String r3 = "mh"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 84
            goto L_0x078a
        L_0x0548:
            java.lang.String r3 = "b5"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 16
            goto L_0x078a
        L_0x0554:
            java.lang.String r3 = "V5"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 129(0x81, float:1.81E-43)
            goto L_0x078a
        L_0x0560:
            java.lang.String r3 = "V1"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 127(0x7f, float:1.78E-43)
            goto L_0x078a
        L_0x056c:
            java.lang.String r3 = "Q5"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 113(0x71, float:1.58E-43)
            goto L_0x078a
        L_0x0578:
            java.lang.String r3 = "C1"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 20
            goto L_0x078a
        L_0x0584:
            java.lang.String r3 = "woods_fn"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 134(0x86, float:1.88E-43)
            goto L_0x078a
        L_0x0590:
            java.lang.String r3 = "ELUGA_A3_Pro"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 31
            goto L_0x078a
        L_0x059c:
            java.lang.String r3 = "Z12_PRO"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 138(0x8a, float:1.93E-43)
            goto L_0x078a
        L_0x05a8:
            java.lang.String r3 = "BLACK-1X"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 17
            goto L_0x078a
        L_0x05b4:
            java.lang.String r3 = "taido_row"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 121(0x79, float:1.7E-43)
            goto L_0x078a
        L_0x05c0:
            java.lang.String r3 = "Pixi4-7_3G"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 105(0x69, float:1.47E-43)
            goto L_0x078a
        L_0x05cc:
            java.lang.String r3 = "GIONEE_GBL7360"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 53
            goto L_0x078a
        L_0x05d8:
            java.lang.String r3 = "GiONEE_CBL7513"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 51
            goto L_0x078a
        L_0x05e4:
            java.lang.String r3 = "OnePlus5T"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 91
            goto L_0x078a
        L_0x05f0:
            java.lang.String r3 = "whyred"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 132(0x84, float:1.85E-43)
            goto L_0x078a
        L_0x05fc:
            java.lang.String r3 = "watson"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 131(0x83, float:1.84E-43)
            goto L_0x078a
        L_0x0608:
            java.lang.String r3 = "SVP-DTV15"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 119(0x77, float:1.67E-43)
            goto L_0x078a
        L_0x0614:
            java.lang.String r3 = "A7000-a"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 9
            goto L_0x078a
        L_0x0620:
            java.lang.String r3 = "nicklaus_f"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 88
            goto L_0x078a
        L_0x062c:
            java.lang.String r3 = "tcl_eu"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 126(0x7e, float:1.77E-43)
            goto L_0x078a
        L_0x0638:
            java.lang.String r3 = "ELUGA_Ray_X"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 34
            goto L_0x078a
        L_0x0644:
            java.lang.String r3 = "s905x018"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 120(0x78, float:1.68E-43)
            goto L_0x078a
        L_0x0650:
            java.lang.String r3 = "A10-70L"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 6
            goto L_0x078a
        L_0x065b:
            java.lang.String r3 = "A10-70F"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 5
            goto L_0x078a
        L_0x0666:
            java.lang.String r3 = "namath"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 87
            goto L_0x078a
        L_0x0672:
            java.lang.String r3 = "Slate_Pro"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 118(0x76, float:1.65E-43)
            goto L_0x078a
        L_0x067e:
            java.lang.String r3 = "iris60"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 70
            goto L_0x078a
        L_0x068a:
            java.lang.String r3 = "BRAVIA_ATV2"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 18
            goto L_0x078a
        L_0x0696:
            java.lang.String r3 = "GiONEE_GBL7319"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 52
            goto L_0x078a
        L_0x06a2:
            java.lang.String r3 = "panell_dt"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 99
            goto L_0x078a
        L_0x06ae:
            java.lang.String r3 = "panell_ds"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 98
            goto L_0x078a
        L_0x06ba:
            java.lang.String r3 = "panell_dl"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 97
            goto L_0x078a
        L_0x06c6:
            java.lang.String r3 = "vernee_M5"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 130(0x82, float:1.82E-43)
            goto L_0x078a
        L_0x06d2:
            java.lang.String r3 = "pacificrim"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 95
            goto L_0x078a
        L_0x06de:
            java.lang.String r3 = "Phantom6"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 104(0x68, float:1.46E-43)
            goto L_0x078a
        L_0x06ea:
            java.lang.String r3 = "ComioS1"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 21
            goto L_0x078a
        L_0x06f6:
            java.lang.String r3 = "XT1663"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 137(0x89, float:1.92E-43)
            goto L_0x078a
        L_0x0702:
            java.lang.String r3 = "RAIJIN"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 116(0x74, float:1.63E-43)
            goto L_0x078a
        L_0x070e:
            java.lang.String r3 = "AquaPowerM"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 13
            goto L_0x078a
        L_0x071a:
            java.lang.String r3 = "PGN611"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 103(0x67, float:1.44E-43)
            goto L_0x078a
        L_0x0726:
            java.lang.String r3 = "PGN610"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 102(0x66, float:1.43E-43)
            goto L_0x078a
        L_0x0731:
            java.lang.String r3 = "PGN528"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 101(0x65, float:1.42E-43)
            goto L_0x078a
        L_0x073c:
            java.lang.String r3 = "NX573J"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 90
            goto L_0x078a
        L_0x0747:
            java.lang.String r3 = "NX541J"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 89
            goto L_0x078a
        L_0x0752:
            java.lang.String r3 = "CP8676_I02"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 22
            goto L_0x078a
        L_0x075d:
            java.lang.String r3 = "K50a40"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 74
            goto L_0x078a
        L_0x0768:
            java.lang.String r3 = "GIONEE_SWW1631"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 56
            goto L_0x078a
        L_0x0773:
            java.lang.String r3 = "GIONEE_SWW1627"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 55
            goto L_0x078a
        L_0x077e:
            java.lang.String r3 = "GIONEE_SWW1609"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 54
            goto L_0x078a
        L_0x0789:
            r3 = -1
        L_0x078a:
            switch(r3) {
                case 0: goto L_0x0080;
                case 1: goto L_0x0080;
                case 2: goto L_0x0080;
                case 3: goto L_0x0080;
                case 4: goto L_0x0080;
                case 5: goto L_0x0080;
                case 6: goto L_0x0080;
                case 7: goto L_0x0080;
                case 8: goto L_0x0080;
                case 9: goto L_0x0080;
                case 10: goto L_0x0080;
                case 11: goto L_0x0080;
                case 12: goto L_0x0080;
                case 13: goto L_0x0080;
                case 14: goto L_0x0080;
                case 15: goto L_0x0080;
                case 16: goto L_0x0080;
                case 17: goto L_0x0080;
                case 18: goto L_0x0080;
                case 19: goto L_0x0080;
                case 20: goto L_0x0080;
                case 21: goto L_0x0080;
                case 22: goto L_0x0080;
                case 23: goto L_0x0080;
                case 24: goto L_0x0080;
                case 25: goto L_0x0080;
                case 26: goto L_0x0080;
                case 27: goto L_0x0080;
                case 28: goto L_0x0080;
                case 29: goto L_0x0080;
                case 30: goto L_0x0080;
                case 31: goto L_0x0080;
                case 32: goto L_0x0080;
                case 33: goto L_0x0080;
                case 34: goto L_0x0080;
                case 35: goto L_0x0080;
                case 36: goto L_0x0080;
                case 37: goto L_0x0080;
                case 38: goto L_0x0080;
                case 39: goto L_0x0080;
                case 40: goto L_0x0080;
                case 41: goto L_0x0080;
                case 42: goto L_0x0080;
                case 43: goto L_0x0080;
                case 44: goto L_0x0080;
                case 45: goto L_0x0080;
                case 46: goto L_0x0080;
                case 47: goto L_0x0080;
                case 48: goto L_0x0080;
                case 49: goto L_0x0080;
                case 50: goto L_0x0080;
                case 51: goto L_0x0080;
                case 52: goto L_0x0080;
                case 53: goto L_0x0080;
                case 54: goto L_0x0080;
                case 55: goto L_0x0080;
                case 56: goto L_0x0080;
                case 57: goto L_0x0080;
                case 58: goto L_0x0080;
                case 59: goto L_0x0080;
                case 60: goto L_0x0080;
                case 61: goto L_0x0080;
                case 62: goto L_0x0080;
                case 63: goto L_0x0080;
                case 64: goto L_0x0080;
                case 65: goto L_0x0080;
                case 66: goto L_0x0080;
                case 67: goto L_0x0080;
                case 68: goto L_0x0080;
                case 69: goto L_0x0080;
                case 70: goto L_0x0080;
                case 71: goto L_0x0080;
                case 72: goto L_0x0080;
                case 73: goto L_0x0080;
                case 74: goto L_0x0080;
                case 75: goto L_0x0080;
                case 76: goto L_0x0080;
                case 77: goto L_0x0080;
                case 78: goto L_0x0080;
                case 79: goto L_0x0080;
                case 80: goto L_0x0080;
                case 81: goto L_0x0080;
                case 82: goto L_0x0080;
                case 83: goto L_0x0080;
                case 84: goto L_0x0080;
                case 85: goto L_0x0080;
                case 86: goto L_0x0080;
                case 87: goto L_0x0080;
                case 88: goto L_0x0080;
                case 89: goto L_0x0080;
                case 90: goto L_0x0080;
                case 91: goto L_0x0080;
                case 92: goto L_0x0080;
                case 93: goto L_0x0080;
                case 94: goto L_0x0080;
                case 95: goto L_0x0080;
                case 96: goto L_0x0080;
                case 97: goto L_0x0080;
                case 98: goto L_0x0080;
                case 99: goto L_0x0080;
                case 100: goto L_0x0080;
                case 101: goto L_0x0080;
                case 102: goto L_0x0080;
                case 103: goto L_0x0080;
                case 104: goto L_0x0080;
                case 105: goto L_0x0080;
                case 106: goto L_0x0080;
                case 107: goto L_0x0080;
                case 108: goto L_0x0080;
                case 109: goto L_0x0080;
                case 110: goto L_0x0080;
                case 111: goto L_0x0080;
                case 112: goto L_0x0080;
                case 113: goto L_0x0080;
                case 114: goto L_0x0080;
                case 115: goto L_0x0080;
                case 116: goto L_0x0080;
                case 117: goto L_0x0080;
                case 118: goto L_0x0080;
                case 119: goto L_0x0080;
                case 120: goto L_0x0080;
                case 121: goto L_0x0080;
                case 122: goto L_0x0080;
                case 123: goto L_0x0080;
                case 124: goto L_0x0080;
                case 125: goto L_0x0080;
                case 126: goto L_0x0080;
                case 127: goto L_0x0080;
                case 128: goto L_0x0080;
                case 129: goto L_0x0080;
                case 130: goto L_0x0080;
                case 131: goto L_0x0080;
                case 132: goto L_0x0080;
                case 133: goto L_0x0080;
                case 134: goto L_0x0080;
                case 135: goto L_0x0080;
                case 136: goto L_0x0080;
                case 137: goto L_0x0080;
                case 138: goto L_0x0080;
                case 139: goto L_0x0080;
                default: goto L_0x078d;
            }
        L_0x078d:
            int r0 = r13.hashCode()     // Catch:{ all -> 0x07aa }
            r3 = -594534941(0xffffffffdc901de3, float:-3.2452206E17)
            if (r0 == r3) goto L_0x0797
            goto L_0x07a0
        L_0x0797:
            java.lang.String r0 = "JSN-L21"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x07a0
            r10 = 0
        L_0x07a0:
            if (r10 == 0) goto L_0x0080
        L_0x07a2:
            f13363x1 = r1     // Catch:{ all -> 0x07aa }
            f13362w1 = r11     // Catch:{ all -> 0x07aa }
        L_0x07a6:
            monitor-exit(r2)     // Catch:{ all -> 0x07aa }
            boolean r0 = f13363x1
            return r0
        L_0x07aa:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x07aa }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ml4.m16561N0(java.lang.String):boolean");
    }

    /* renamed from: O0 */
    private static List m16562O0(ue4 ue4, C2388g4 g4Var, boolean z, boolean z2) throws bf4 {
        String str = g4Var.f9673l;
        if (str == null) {
            return ua3.m21508w();
        }
        List f = if4.m14309f(str, z, z2);
        String e = if4.m14308e(g4Var);
        if (e == null) {
            return ua3.m21506u(f);
        }
        List f2 = if4.m14309f(e, z, z2);
        ra3 q = ua3.m21502q();
        q.mo13702g(f);
        q.mo13702g(f2);
        return q.mo13703h();
    }

    /* renamed from: P0 */
    private final void m16563P0() {
        int i = this.f13388o1;
        if (i == -1) {
            if (this.f13389p1 != -1) {
                i = -1;
            } else {
                return;
            }
        }
        s61 s61 = this.f13392s1;
        if (s61 == null || s61.f17273a != i || s61.f17274b != this.f13389p1 || s61.f17275c != this.f13390q1 || s61.f17276d != this.f13391r1) {
            s61 s612 = new s61(i, this.f13389p1, this.f13390q1, this.f13391r1);
            this.f13392s1 = s612;
            this.f13366S0.mo11468t(s612);
        }
    }

    /* renamed from: Q0 */
    private final void m16564Q0() {
        s61 s61 = this.f13392s1;
        if (s61 != null) {
            this.f13366S0.mo11468t(s61);
        }
    }

    /* renamed from: R0 */
    private final void m16565R0() {
        Surface surface = this.f13371X0;
        pl4 pl4 = this.f13372Y0;
        if (surface == pl4) {
            this.f13371X0 = null;
        }
        pl4.release();
        this.f13372Y0 = null;
    }

    /* renamed from: S0 */
    private static boolean m16566S0(long j) {
        return j < -30000;
    }

    /* renamed from: T0 */
    private final boolean m16567T0(pe4 pe4) {
        if (gb2.f9812a < 23 || m16561N0(pe4.f15824a) || (pe4.f15829f && !pl4.m18658b(this.f13364Q0))) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A0 */
    public final void mo12371A0() {
        super.mo12371A0();
        this.f13383j1 = 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public final void mo9131B() {
        this.f13392s1 = null;
        this.f13375b1 = false;
        int i = gb2.f9812a;
        this.f13373Z0 = false;
        try {
            super.mo9131B();
        } finally {
            this.f13366S0.mo11451c(this.f17400J0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final void mo9132D(boolean z, boolean z2) throws u44 {
        super.mo9132D(z, z2);
        mo13089z();
        this.f13366S0.mo11453e(this.f17400J0);
        this.f13376c1 = z2;
        this.f13377d1 = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final void mo9133E(long j, boolean z) throws u44 {
        super.mo9133E(j, z);
        this.f13375b1 = false;
        int i = gb2.f9812a;
        this.f13365R0.mo15185f();
        this.f13384k1 = -9223372036854775807L;
        this.f13378e1 = -9223372036854775807L;
        this.f13382i1 = 0;
        this.f13379f1 = -9223372036854775807L;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E0 */
    public final boolean mo12372E0(pe4 pe4) {
        return this.f13371X0 != null || m16567T0(pe4);
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public final void mo9134F() {
        try {
            super.mo9134F();
            if (this.f13372Y0 != null) {
                m16565R0();
            }
        } catch (Throwable th) {
            if (this.f13372Y0 != null) {
                m16565R0();
            }
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public final void mo9135G() {
        this.f13381h1 = 0;
        this.f13380g1 = SystemClock.elapsedRealtime();
        this.f13385l1 = SystemClock.elapsedRealtime() * 1000;
        this.f13386m1 = 0;
        this.f13387n1 = 0;
        this.f13365R0.mo15186g();
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public final void mo9136H() {
        this.f13379f1 = -9223372036854775807L;
        if (this.f13381h1 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f13366S0.mo11452d(this.f13381h1, elapsedRealtime - this.f13380g1);
            this.f13381h1 = 0;
            this.f13380g1 = elapsedRealtime;
        }
        int i = this.f13387n1;
        if (i != 0) {
            this.f13366S0.mo11466r(this.f13386m1, i);
            this.f13386m1 = 0;
            this.f13387n1 = 0;
        }
        this.f13365R0.mo15187h();
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public final float mo9137J(float f, C2388g4 g4Var, C2388g4[] g4VarArr) {
        float f2 = -1.0f;
        for (C2388g4 g4Var2 : g4VarArr) {
            float f3 = g4Var2.f9680s;
            if (f3 != -1.0f) {
                f2 = Math.max(f2, f3);
            }
        }
        if (f2 == -1.0f) {
            return -1.0f;
        }
        return f2 * f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public final int mo9138K(ue4 ue4, C2388g4 g4Var) throws bf4 {
        boolean z;
        int i = 128;
        if (!d90.m11369h(g4Var.f9673l)) {
            return 128;
        }
        int i2 = 0;
        boolean z2 = g4Var.f9676o != null;
        List O0 = m16562O0(ue4, g4Var, z2, false);
        if (z2 && O0.isEmpty()) {
            O0 = m16562O0(ue4, g4Var, false, false);
        }
        if (O0.isEmpty()) {
            return 129;
        }
        if (!se4.m20288F0(g4Var)) {
            return 130;
        }
        pe4 pe4 = (pe4) O0.get(0);
        boolean d = pe4.mo13263d(g4Var);
        if (!d) {
            int i3 = 1;
            while (true) {
                if (i3 >= O0.size()) {
                    break;
                }
                pe4 pe42 = (pe4) O0.get(i3);
                if (pe42.mo13263d(g4Var)) {
                    pe4 = pe42;
                    z = false;
                    d = true;
                    break;
                }
                i3++;
            }
        }
        z = true;
        int i4 = true != d ? 3 : 4;
        int i5 = true != pe4.mo13264e(g4Var) ? 8 : 16;
        int i6 = true != pe4.f15830g ? 0 : 64;
        if (true != z) {
            i = 0;
        }
        if (d) {
            List O02 = m16562O0(ue4, g4Var, z2, true);
            if (!O02.isEmpty()) {
                pe4 pe43 = (pe4) if4.m14310g(O02, g4Var).get(0);
                if (pe43.mo13263d(g4Var) && pe43.mo13264e(g4Var)) {
                    i2 = 32;
                }
            }
        }
        return i4 | i5 | i2 | i6 | i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public final oz3 mo9139L(pe4 pe4, C2388g4 g4Var, C2388g4 g4Var2) {
        int i;
        int i2;
        oz3 b = pe4.mo13262b(g4Var, g4Var2);
        int i3 = b.f15641e;
        int i4 = g4Var2.f9678q;
        ll4 ll4 = this.f13368U0;
        if (i4 > ll4.f12840a || g4Var2.f9679r > ll4.f12841b) {
            i3 |= 256;
        }
        if (m16560L0(pe4, g4Var2) > this.f13368U0.f12842c) {
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
        this.f13366S0.mo11454f(c74.f7638a, M);
        return M;
    }

    /* access modifiers changed from: protected */
    /* renamed from: M0 */
    public final void mo12373M0(long j) {
        ny3 ny3 = this.f17400J0;
        ny3.f14240k += j;
        ny3.f14241l++;
        this.f13386m1 += j;
        this.f13387n1++;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x012f, code lost:
        r20 = r9;
        r21 = r10;
     */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01b9  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0213  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0226  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0236  */
    /* renamed from: P */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.le4 mo9141P(com.google.android.gms.internal.ads.pe4 r23, com.google.android.gms.internal.ads.C2388g4 r24, android.media.MediaCrypto r25, float r26) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = r26
            com.google.android.gms.internal.ads.pl4 r4 = r0.f13372Y0
            if (r4 == 0) goto L_0x0015
            boolean r4 = r4.f15905a
            boolean r5 = r1.f15829f
            if (r4 == r5) goto L_0x0015
            r22.m16565R0()
        L_0x0015:
            java.lang.String r4 = r1.f15826c
            com.google.android.gms.internal.ads.g4[] r5 = r22.mo13083q()
            int r6 = r2.f9678q
            int r7 = r2.f9679r
            int r8 = m16560L0(r23, r24)
            int r9 = r5.length
            r10 = -1
            r13 = 1
            if (r9 != r13) goto L_0x0043
            if (r8 == r10) goto L_0x003a
            int r5 = m16559K0(r23, r24)
            if (r5 == r10) goto L_0x003a
            float r8 = (float) r8
            r9 = 1069547520(0x3fc00000, float:1.5)
            float r8 = r8 * r9
            int r8 = (int) r8
            int r8 = java.lang.Math.min(r8, r5)
        L_0x003a:
            com.google.android.gms.internal.ads.ll4 r5 = new com.google.android.gms.internal.ads.ll4
            r5.<init>(r6, r7, r8)
            r16 = r4
            goto L_0x017e
        L_0x0043:
            r14 = 0
            r15 = 0
        L_0x0045:
            if (r14 >= r9) goto L_0x0089
            r11 = r5[r14]
            com.google.android.gms.internal.ads.be4 r13 = r2.f9685x
            if (r13 == 0) goto L_0x005e
            com.google.android.gms.internal.ads.be4 r13 = r11.f9685x
            if (r13 != 0) goto L_0x005e
            com.google.android.gms.internal.ads.e2 r11 = r11.mo10384b()
            com.google.android.gms.internal.ads.be4 r13 = r2.f9685x
            r11.mo9763g0(r13)
            com.google.android.gms.internal.ads.g4 r11 = r11.mo9782y()
        L_0x005e:
            com.google.android.gms.internal.ads.oz3 r13 = r1.mo13262b(r2, r11)
            int r13 = r13.f15640d
            if (r13 == 0) goto L_0x0085
            int r13 = r11.f9678q
            if (r13 == r10) goto L_0x0071
            int r12 = r11.f9679r
            if (r12 != r10) goto L_0x006f
            goto L_0x0071
        L_0x006f:
            r12 = 0
            goto L_0x0072
        L_0x0071:
            r12 = 1
        L_0x0072:
            r15 = r15 | r12
            int r6 = java.lang.Math.max(r6, r13)
            int r12 = r11.f9679r
            int r7 = java.lang.Math.max(r7, r12)
            int r11 = m16560L0(r1, r11)
            int r8 = java.lang.Math.max(r8, r11)
        L_0x0085:
            int r14 = r14 + 1
            r13 = 1
            goto L_0x0045
        L_0x0089:
            if (r15 == 0) goto L_0x0177
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r9 = "Resolutions unknown. Codec max resolution: "
            r5.append(r9)
            r5.append(r6)
            java.lang.String r9 = "x"
            r5.append(r9)
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            java.lang.String r10 = "MediaCodecVideoRenderer"
            com.google.android.gms.internal.ads.ot1.m18060e(r10, r5)
            int r5 = r2.f9679r
            int r11 = r2.f9678q
            if (r5 <= r11) goto L_0x00b1
            r12 = r5
            goto L_0x00b2
        L_0x00b1:
            r12 = r11
        L_0x00b2:
            if (r5 > r11) goto L_0x00b6
            r13 = r5
            goto L_0x00b7
        L_0x00b6:
            r13 = r11
        L_0x00b7:
            float r14 = (float) r13
            float r15 = (float) r12
            float r14 = r14 / r15
            int[] r15 = f13361v1
            r16 = r4
            r3 = 0
        L_0x00bf:
            r4 = 9
            if (r3 >= r4) goto L_0x012f
            r4 = r15[r3]
            r17 = r15
            float r15 = (float) r4
            float r15 = r15 * r14
            int r15 = (int) r15
            if (r4 <= r12) goto L_0x012f
            if (r15 > r13) goto L_0x00d1
            goto L_0x012f
        L_0x00d1:
            r18 = r12
            int r12 = com.google.android.gms.internal.ads.gb2.f9812a
            r19 = r13
            r13 = 21
            if (r12 < r13) goto L_0x00f9
            if (r5 > r11) goto L_0x00df
            r12 = r4
            goto L_0x00e0
        L_0x00df:
            r12 = r15
        L_0x00e0:
            if (r5 > r11) goto L_0x00e3
            r4 = r15
        L_0x00e3:
            android.graphics.Point r4 = r1.mo13261a(r12, r4)
            float r12 = r2.f9680s
            int r13 = r4.x
            int r15 = r4.y
            r20 = r9
            r21 = r10
            double r9 = (double) r12
            boolean r9 = r1.mo13265f(r13, r15, r9)
            if (r9 == 0) goto L_0x0122
            goto L_0x0134
        L_0x00f9:
            r20 = r9
            r21 = r10
            r9 = 16
            int r4 = com.google.android.gms.internal.ads.gb2.m13145O(r4, r9)     // Catch:{ bf4 -> 0x0133 }
            int r4 = r4 * 16
            int r10 = com.google.android.gms.internal.ads.gb2.m13145O(r15, r9)     // Catch:{ bf4 -> 0x0133 }
            int r10 = r10 * 16
            int r9 = r4 * r10
            int r12 = com.google.android.gms.internal.ads.if4.m14304a()     // Catch:{ bf4 -> 0x0133 }
            if (r9 > r12) goto L_0x0122
            android.graphics.Point r3 = new android.graphics.Point     // Catch:{ bf4 -> 0x0133 }
            if (r5 > r11) goto L_0x0119
            r9 = r4
            goto L_0x011a
        L_0x0119:
            r9 = r10
        L_0x011a:
            if (r5 > r11) goto L_0x011d
            r4 = r10
        L_0x011d:
            r3.<init>(r9, r4)     // Catch:{ bf4 -> 0x0133 }
            r4 = r3
            goto L_0x0134
        L_0x0122:
            int r3 = r3 + 1
            r15 = r17
            r12 = r18
            r13 = r19
            r9 = r20
            r10 = r21
            goto L_0x00bf
        L_0x012f:
            r20 = r9
            r21 = r10
        L_0x0133:
            r4 = 0
        L_0x0134:
            if (r4 == 0) goto L_0x0179
            int r3 = r4.x
            int r6 = java.lang.Math.max(r6, r3)
            int r3 = r4.y
            int r7 = java.lang.Math.max(r7, r3)
            com.google.android.gms.internal.ads.e2 r3 = r24.mo10384b()
            r3.mo9781x(r6)
            r3.mo9760f(r7)
            com.google.android.gms.internal.ads.g4 r3 = r3.mo9782y()
            int r3 = m16559K0(r1, r3)
            int r8 = java.lang.Math.max(r8, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Codec max resolution adjusted to: "
            r3.append(r4)
            r3.append(r6)
            r4 = r20
            r3.append(r4)
            r3.append(r7)
            java.lang.String r3 = r3.toString()
            r4 = r21
            com.google.android.gms.internal.ads.ot1.m18060e(r4, r3)
            goto L_0x0179
        L_0x0177:
            r16 = r4
        L_0x0179:
            com.google.android.gms.internal.ads.ll4 r5 = new com.google.android.gms.internal.ads.ll4
            r5.<init>(r6, r7, r8)
        L_0x017e:
            r0.f13368U0 = r5
            boolean r3 = r0.f13367T0
            android.media.MediaFormat r4 = new android.media.MediaFormat
            r4.<init>()
            java.lang.String r6 = "mime"
            r7 = r16
            r4.setString(r6, r7)
            int r6 = r2.f9678q
            java.lang.String r7 = "width"
            r4.setInteger(r7, r6)
            int r6 = r2.f9679r
            java.lang.String r7 = "height"
            r4.setInteger(r7, r6)
            java.util.List r6 = r2.f9675n
            com.google.android.gms.internal.ads.qv1.m19378b(r4, r6)
            float r6 = r2.f9680s
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r8 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r8 == 0) goto L_0x01ae
            java.lang.String r8 = "frame-rate"
            r4.setFloat(r8, r6)
        L_0x01ae:
            int r6 = r2.f9681t
            java.lang.String r8 = "rotation-degrees"
            com.google.android.gms.internal.ads.qv1.m19377a(r4, r8, r6)
            com.google.android.gms.internal.ads.be4 r6 = r2.f9685x
            if (r6 == 0) goto L_0x01db
            int r8 = r6.f7222c
            java.lang.String r9 = "color-transfer"
            com.google.android.gms.internal.ads.qv1.m19377a(r4, r9, r8)
            int r8 = r6.f7220a
            java.lang.String r9 = "color-standard"
            com.google.android.gms.internal.ads.qv1.m19377a(r4, r9, r8)
            int r8 = r6.f7221b
            java.lang.String r9 = "color-range"
            com.google.android.gms.internal.ads.qv1.m19377a(r4, r9, r8)
            byte[] r6 = r6.f7223d
            if (r6 == 0) goto L_0x01db
            java.nio.ByteBuffer r6 = java.nio.ByteBuffer.wrap(r6)
            java.lang.String r8 = "hdr-static-info"
            r4.setByteBuffer(r8, r6)
        L_0x01db:
            java.lang.String r6 = r2.f9673l
            java.lang.String r8 = "video/dolby-vision"
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L_0x01f8
            android.util.Pair r6 = com.google.android.gms.internal.ads.if4.m14305b(r24)
            if (r6 == 0) goto L_0x01f8
            java.lang.Object r6 = r6.first
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            java.lang.String r8 = "profile"
            com.google.android.gms.internal.ads.qv1.m19377a(r4, r8, r6)
        L_0x01f8:
            int r6 = r5.f12840a
            java.lang.String r8 = "max-width"
            r4.setInteger(r8, r6)
            int r6 = r5.f12841b
            java.lang.String r8 = "max-height"
            r4.setInteger(r8, r6)
            int r5 = r5.f12842c
            java.lang.String r6 = "max-input-size"
            com.google.android.gms.internal.ads.qv1.m19377a(r4, r6, r5)
            int r5 = com.google.android.gms.internal.ads.gb2.f9812a
            r6 = 23
            if (r5 < r6) goto L_0x0224
            java.lang.String r5 = "priority"
            r6 = 0
            r4.setInteger(r5, r6)
            r5 = r26
            int r6 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r6 == 0) goto L_0x0224
            java.lang.String r6 = "operating-rate"
            r4.setFloat(r6, r5)
        L_0x0224:
            if (r3 == 0) goto L_0x0232
            java.lang.String r3 = "no-post-process"
            r5 = 1
            r4.setInteger(r3, r5)
            java.lang.String r3 = "auto-frc"
            r5 = 0
            r4.setInteger(r3, r5)
        L_0x0232:
            android.view.Surface r3 = r0.f13371X0
            if (r3 != 0) goto L_0x0255
            boolean r3 = r22.m16567T0(r23)
            if (r3 == 0) goto L_0x024f
            com.google.android.gms.internal.ads.pl4 r3 = r0.f13372Y0
            if (r3 != 0) goto L_0x024a
            android.content.Context r3 = r0.f13364Q0
            boolean r5 = r1.f15829f
            com.google.android.gms.internal.ads.pl4 r3 = com.google.android.gms.internal.ads.pl4.m18657a(r3, r5)
            r0.f13372Y0 = r3
        L_0x024a:
            com.google.android.gms.internal.ads.pl4 r3 = r0.f13372Y0
            r0.f13371X0 = r3
            goto L_0x0255
        L_0x024f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x0255:
            android.view.Surface r3 = r0.f13371X0
            r5 = 0
            com.google.android.gms.internal.ads.le4 r1 = com.google.android.gms.internal.ads.le4.m15976b(r1, r4, r2, r3, r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ml4.mo9141P(com.google.android.gms.internal.ads.pe4, com.google.android.gms.internal.ads.g4, android.media.MediaCrypto, float):com.google.android.gms.internal.ads.le4");
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q */
    public final List mo9142Q(ue4 ue4, C2388g4 g4Var, boolean z) throws bf4 {
        return if4.m14310g(m16562O0(ue4, g4Var, false, false), g4Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: R */
    public final void mo9143R(Exception exc) {
        ot1.m18058c("MediaCodecVideoRenderer", "Video codec error", exc);
        this.f13366S0.mo11467s(exc);
    }

    /* access modifiers changed from: protected */
    /* renamed from: S */
    public final void mo9144S(String str, le4 le4, long j, long j2) {
        this.f13366S0.mo11449a(str, j, j2);
        this.f13369V0 = m16561N0(str);
        pe4 v0 = mo13989v0();
        Objects.requireNonNull(v0);
        boolean z = false;
        if (gb2.f9812a >= 29 && "video/x-vnd.on2.vp9".equals(v0.f15825b)) {
            MediaCodecInfo.CodecProfileLevel[] g = v0.mo13266g();
            int length = g.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (g[i].profile == 16384) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
        }
        this.f13370W0 = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: U */
    public final void mo9145U(String str) {
        this.f13366S0.mo11450b(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: U0 */
    public final void mo12374U0(ne4 ne4, int i, long j) {
        m16563P0();
        int i2 = gb2.f9812a;
        Trace.beginSection("releaseOutputBuffer");
        ne4.mo11690g(i, true);
        Trace.endSection();
        this.f13385l1 = SystemClock.elapsedRealtime() * 1000;
        this.f17400J0.f14234e++;
        this.f13382i1 = 0;
        mo9151l0();
    }

    /* access modifiers changed from: protected */
    /* renamed from: V0 */
    public final void mo12375V0(ne4 ne4, int i, long j, long j2) {
        m16563P0();
        int i2 = gb2.f9812a;
        Trace.beginSection("releaseOutputBuffer");
        ne4.mo11682a(i, j2);
        Trace.endSection();
        this.f13385l1 = SystemClock.elapsedRealtime() * 1000;
        this.f17400J0.f14234e++;
        this.f13382i1 = 0;
        mo9151l0();
    }

    /* access modifiers changed from: protected */
    /* renamed from: W0 */
    public final void mo12376W0(ne4 ne4, int i, long j) {
        int i2 = gb2.f9812a;
        Trace.beginSection("skipVideoBuffer");
        ne4.mo11690g(i, false);
        Trace.endSection();
        this.f17400J0.f14235f++;
    }

    /* access modifiers changed from: protected */
    /* renamed from: X0 */
    public final void mo12377X0(int i, int i2) {
        ny3 ny3 = this.f17400J0;
        ny3.f14237h += i;
        int i3 = i + i2;
        ny3.f14236g += i3;
        this.f13381h1 += i3;
        int i4 = this.f13382i1 + i3;
        this.f13382i1 = i4;
        ny3.f14238i = Math.max(i4, ny3.f14238i);
    }

    /* renamed from: f */
    public final void mo12378f(float f, float f2) throws u44 {
        super.mo12378f(f, f2);
        this.f13365R0.mo15184e(f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j0 */
    public final void mo9149j0(C2388g4 g4Var, MediaFormat mediaFormat) {
        int i;
        int i2;
        ne4 t0 = mo13988t0();
        if (t0 != null) {
            t0.mo11688f(this.f13374a1);
        }
        Objects.requireNonNull(mediaFormat);
        boolean z = false;
        if (mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top")) {
            z = true;
        }
        if (z) {
            i = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
        } else {
            i = mediaFormat.getInteger("width");
        }
        this.f13388o1 = i;
        if (z) {
            i2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
        } else {
            i2 = mediaFormat.getInteger("height");
        }
        this.f13389p1 = i2;
        float f = g4Var.f9682u;
        this.f13391r1 = f;
        if (gb2.f9812a >= 21) {
            int i3 = g4Var.f9681t;
            if (i3 == 90 || i3 == 270) {
                int i4 = this.f13388o1;
                this.f13388o1 = i2;
                this.f13389p1 = i4;
                this.f13391r1 = 1.0f / f;
            }
        } else {
            this.f13390q1 = g4Var.f9681t;
        }
        this.f13365R0.mo15182c(g4Var.f9680s);
    }

    /* JADX WARNING: Failed to insert additional move for type inference */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo9150k(int r6, java.lang.Object r7) throws com.google.android.gms.internal.ads.u44 {
        /*
            r5 = this;
            r0 = 1
            if (r6 == r0) goto L_0x0042
            r0 = 7
            if (r6 == r0) goto L_0x003d
            r0 = 10
            if (r6 == r0) goto L_0x0030
            r0 = 4
            if (r6 == r0) goto L_0x001e
            r0 = 5
            if (r6 == r0) goto L_0x0012
            goto L_0x00ca
        L_0x0012:
            com.google.android.gms.internal.ads.xl4 r6 = r5.f13365R0
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r6.mo15189j(r7)
            return
        L_0x001e:
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r6 = r7.intValue()
            r5.f13374a1 = r6
            com.google.android.gms.internal.ads.ne4 r7 = r5.mo13988t0()
            if (r7 == 0) goto L_0x00ca
            r7.mo11688f(r6)
            return
        L_0x0030:
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r6 = r7.intValue()
            int r7 = r5.f13393t1
            if (r7 == r6) goto L_0x00ca
            r5.f13393t1 = r6
            return
        L_0x003d:
            com.google.android.gms.internal.ads.ql4 r7 = (com.google.android.gms.internal.ads.ql4) r7
            r5.f13394u1 = r7
            return
        L_0x0042:
            boolean r6 = r7 instanceof android.view.Surface
            r0 = 0
            if (r6 == 0) goto L_0x004a
            android.view.Surface r7 = (android.view.Surface) r7
            goto L_0x004b
        L_0x004a:
            r7 = r0
        L_0x004b:
            if (r7 != 0) goto L_0x0069
            com.google.android.gms.internal.ads.pl4 r6 = r5.f13372Y0
            if (r6 == 0) goto L_0x0053
            r7 = r6
            goto L_0x0069
        L_0x0053:
            com.google.android.gms.internal.ads.pe4 r6 = r5.mo13989v0()
            if (r6 == 0) goto L_0x0069
            boolean r1 = r5.m16567T0(r6)
            if (r1 == 0) goto L_0x0069
            android.content.Context r7 = r5.f13364Q0
            boolean r6 = r6.f15829f
            com.google.android.gms.internal.ads.pl4 r7 = com.google.android.gms.internal.ads.pl4.m18657a(r7, r6)
            r5.f13372Y0 = r7
        L_0x0069:
            android.view.Surface r6 = r5.f13371X0
            if (r6 == r7) goto L_0x00b6
            r5.f13371X0 = r7
            com.google.android.gms.internal.ads.xl4 r6 = r5.f13365R0
            r6.mo15188i(r7)
            r6 = 0
            r5.f13373Z0 = r6
            int r1 = r5.mo13080n()
            com.google.android.gms.internal.ads.ne4 r2 = r5.mo13988t0()
            if (r2 == 0) goto L_0x0097
            int r3 = com.google.android.gms.internal.ads.gb2.f9812a
            r4 = 23
            if (r3 < r4) goto L_0x0091
            if (r7 == 0) goto L_0x0091
            boolean r3 = r5.f13369V0
            if (r3 != 0) goto L_0x0091
            r2.mo11684c(r7)
            goto L_0x0097
        L_0x0091:
            r5.mo13991z0()
            r5.mo13990x0()
        L_0x0097:
            if (r7 == 0) goto L_0x00af
            com.google.android.gms.internal.ads.pl4 r2 = r5.f13372Y0
            if (r7 == r2) goto L_0x00af
            r5.m16564Q0()
            r5.f13375b1 = r6
            int r6 = com.google.android.gms.internal.ads.gb2.f9812a
            r6 = 2
            if (r1 != r6) goto L_0x00ca
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5.f13379f1 = r6
            return
        L_0x00af:
            r5.f13392s1 = r0
            r5.f13375b1 = r6
            int r6 = com.google.android.gms.internal.ads.gb2.f9812a
            return
        L_0x00b6:
            if (r7 == 0) goto L_0x00ca
            com.google.android.gms.internal.ads.pl4 r6 = r5.f13372Y0
            if (r7 == r6) goto L_0x00ca
            r5.m16564Q0()
            boolean r6 = r5.f13373Z0
            if (r6 == 0) goto L_0x00ca
            com.google.android.gms.internal.ads.jm4 r6 = r5.f13366S0
            android.view.Surface r7 = r5.f13371X0
            r6.mo11465q(r7)
        L_0x00ca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ml4.mo9150k(int, java.lang.Object):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l0 */
    public final void mo9151l0() {
        this.f13377d1 = true;
        if (!this.f13375b1) {
            this.f13375b1 = true;
            this.f13366S0.mo11465q(this.f13371X0);
            this.f13373Z0 = true;
        }
    }

    /* renamed from: m */
    public final boolean mo9152m() {
        pl4 pl4;
        if (super.mo9152m() && (this.f13375b1 || (((pl4 = this.f13372Y0) != null && this.f13371X0 == pl4) || mo13988t0() == null))) {
            this.f13379f1 = -9223372036854775807L;
            return true;
        } else if (this.f13379f1 == -9223372036854775807L) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() < this.f13379f1) {
                return true;
            }
            this.f13379f1 = -9223372036854775807L;
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m0 */
    public final void mo9153m0() {
        this.f13375b1 = false;
        int i = gb2.f9812a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n0 */
    public final void mo9154n0(fo3 fo3) throws u44 {
        this.f13383j1++;
        int i = gb2.f9812a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p0 */
    public final boolean mo9156p0(long j, long j2, ne4 ne4, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, C2388g4 g4Var) throws u44 {
        boolean z3;
        int v;
        long j4 = j;
        ne4 ne42 = ne4;
        int i4 = i;
        long j5 = j3;
        Objects.requireNonNull(ne4);
        if (this.f13378e1 == -9223372036854775807L) {
            this.f13378e1 = j4;
        }
        if (j5 != this.f13384k1) {
            this.f13365R0.mo15183d(j5);
            this.f13384k1 = j5;
        }
        long s0 = mo13987s0();
        long j6 = j5 - s0;
        if (!z || z2) {
            float r0 = mo13986r0();
            int n = mo13080n();
            long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
            long j7 = (long) (((double) (j5 - j4)) / ((double) r0));
            if (n == 2) {
                j7 -= elapsedRealtime - j2;
            }
            if (this.f13371X0 != this.f13372Y0) {
                long j8 = elapsedRealtime - this.f13385l1;
                boolean z4 = this.f13377d1 ? !this.f13375b1 : !(n != 2 && !this.f13376c1);
                if (this.f13379f1 == -9223372036854775807L && j4 >= s0 && (z4 || (n == 2 && m16566S0(j7) && j8 > 100000))) {
                    long nanoTime = System.nanoTime();
                    if (gb2.f9812a >= 21) {
                        mo12375V0(ne4, i, j6, nanoTime);
                    } else {
                        mo12374U0(ne42, i4, j6);
                    }
                    mo12373M0(j7);
                    return true;
                } else if (n != 2 || j4 == this.f13378e1) {
                    return false;
                } else {
                    long nanoTime2 = System.nanoTime();
                    long a = this.f13365R0.mo15181a((j7 * 1000) + nanoTime2);
                    long j9 = (a - nanoTime2) / 1000;
                    long j10 = this.f13379f1;
                    if (j9 < -500000 && !z2 && (v = mo13086v(j)) != 0) {
                        if (j10 != -9223372036854775807L) {
                            ny3 ny3 = this.f17400J0;
                            ny3.f14233d += v;
                            ny3.f14235f += this.f13383j1;
                        } else {
                            this.f17400J0.f14239j++;
                            mo12377X0(v, this.f13383j1);
                        }
                        mo13984C0();
                        return false;
                    } else if (m16566S0(j9) && !z2) {
                        if (j10 != -9223372036854775807L) {
                            mo12376W0(ne42, i4, j6);
                            z3 = true;
                        } else {
                            int i5 = gb2.f9812a;
                            Trace.beginSection("dropVideoBuffer");
                            ne42.mo11690g(i4, false);
                            Trace.endSection();
                            z3 = true;
                            mo12377X0(0, 1);
                        }
                        mo12373M0(j9);
                        return z3;
                    } else if (gb2.f9812a >= 21) {
                        if (j9 >= 50000) {
                            return false;
                        }
                        mo12375V0(ne4, i, j6, a);
                        mo12373M0(j9);
                        return true;
                    } else if (j9 >= 30000) {
                        return false;
                    } else {
                        if (j9 > 11000) {
                            try {
                                Thread.sleep((-10000 + j9) / 1000);
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                                return false;
                            }
                        }
                        mo12374U0(ne42, i4, j6);
                        mo12373M0(j9);
                        return true;
                    }
                }
            } else if (!m16566S0(j7)) {
                return false;
            } else {
                mo12376W0(ne42, i4, j6);
                mo12373M0(j7);
                return true;
            }
        } else {
            mo12376W0(ne42, i4, j6);
            return true;
        }
    }

    /* renamed from: r */
    public final String mo9158r() {
        return "MediaCodecVideoRenderer";
    }

    /* access modifiers changed from: protected */
    /* renamed from: u0 */
    public final oe4 mo12379u0(Throwable th, pe4 pe4) {
        return new kl4(th, pe4, this.f13371X0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: w0 */
    public final void mo12380w0(fo3 fo3) throws u44 {
        if (this.f13370W0) {
            ByteBuffer byteBuffer = fo3.f9376f;
            Objects.requireNonNull(byteBuffer);
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                byteBuffer.position(0);
                if (b != -75 || s != 60 || s2 != 1 || b2 != 4) {
                    return;
                }
                if (b3 == 0 || b3 == 1) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    ne4 t0 = mo13988t0();
                    Bundle bundle = new Bundle();
                    bundle.putByteArray("hdr10-plus-info", bArr);
                    t0.mo11679F(bundle);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: y0 */
    public final void mo12381y0(long j) {
        super.mo12381y0(j);
        this.f13383j1--;
    }
}
