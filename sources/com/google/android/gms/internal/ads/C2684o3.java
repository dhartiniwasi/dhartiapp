package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import com.startapp.C8843b4;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/* renamed from: com.google.android.gms.internal.ads.o3 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2684o3 implements qn4 {

    /* renamed from: c0 */
    public static final xn4 f14816c0 = C2536k3.f11883b;

    /* renamed from: d0 */
    private static final byte[] f14817d0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    /* access modifiers changed from: private */

    /* renamed from: e0 */
    public static final byte[] f14818e0 = gb2.m13132B("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");

    /* renamed from: f0 */
    private static final byte[] f14819f0 = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};

    /* renamed from: g0 */
    private static final byte[] f14820g0 = {87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
    /* access modifiers changed from: private */

    /* renamed from: h0 */
    public static final UUID f14821h0 = new UUID(72057594037932032L, -9223371306706625679L);
    /* access modifiers changed from: private */

    /* renamed from: i0 */
    public static final Map f14822i0;

    /* renamed from: A */
    private long f14823A = -1;

    /* renamed from: B */
    private long f14824B = -9223372036854775807L;

    /* renamed from: C */
    private pu1 f14825C;

    /* renamed from: D */
    private pu1 f14826D;

    /* renamed from: E */
    private boolean f14827E;

    /* renamed from: F */
    private boolean f14828F;

    /* renamed from: G */
    private int f14829G;

    /* renamed from: H */
    private long f14830H;

    /* renamed from: I */
    private long f14831I;

    /* renamed from: J */
    private int f14832J;

    /* renamed from: K */
    private int f14833K;

    /* renamed from: L */
    private int[] f14834L;

    /* renamed from: M */
    private int f14835M;

    /* renamed from: N */
    private int f14836N;

    /* renamed from: O */
    private int f14837O;

    /* renamed from: P */
    private int f14838P;

    /* renamed from: Q */
    private boolean f14839Q;

    /* renamed from: R */
    private long f14840R;

    /* renamed from: S */
    private int f14841S;

    /* renamed from: T */
    private int f14842T;

    /* renamed from: U */
    private int f14843U;

    /* renamed from: V */
    private boolean f14844V;

    /* renamed from: W */
    private boolean f14845W;

    /* renamed from: X */
    private boolean f14846X;

    /* renamed from: Y */
    private int f14847Y;

    /* renamed from: Z */
    private byte f14848Z;

    /* renamed from: a */
    private final C2499j3 f14849a;

    /* renamed from: a0 */
    private boolean f14850a0;

    /* renamed from: b */
    private final C2759q3 f14851b;

    /* renamed from: b0 */
    private tn4 f14852b0;

    /* renamed from: c */
    private final SparseArray f14853c;

    /* renamed from: d */
    private final boolean f14854d;

    /* renamed from: e */
    private final y22 f14855e;

    /* renamed from: f */
    private final y22 f14856f;

    /* renamed from: g */
    private final y22 f14857g;

    /* renamed from: h */
    private final y22 f14858h;

    /* renamed from: i */
    private final y22 f14859i;

    /* renamed from: j */
    private final y22 f14860j;

    /* renamed from: k */
    private final y22 f14861k;

    /* renamed from: l */
    private final y22 f14862l;

    /* renamed from: m */
    private final y22 f14863m;

    /* renamed from: n */
    private final y22 f14864n;

    /* renamed from: o */
    private ByteBuffer f14865o;

    /* renamed from: p */
    private long f14866p;

    /* renamed from: q */
    private long f14867q = -1;

    /* renamed from: r */
    private long f14868r = -9223372036854775807L;

    /* renamed from: s */
    private long f14869s = -9223372036854775807L;

    /* renamed from: t */
    private long f14870t = -9223372036854775807L;

    /* renamed from: u */
    private C2647n3 f14871u;

    /* renamed from: v */
    private boolean f14872v;

    /* renamed from: w */
    private int f14873w;

    /* renamed from: x */
    private long f14874x;

    /* renamed from: y */
    private boolean f14875y;

    /* renamed from: z */
    private long f14876z = -1;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("htc_video_rotA-000", 0);
        hashMap.put("htc_video_rotA-090", 90);
        hashMap.put("htc_video_rotA-180", 180);
        hashMap.put("htc_video_rotA-270", 270);
        f14822i0 = Collections.unmodifiableMap(hashMap);
    }

    public C2684o3(int i) {
        C2424h3 h3Var = new C2424h3();
        this.f14849a = h3Var;
        h3Var.mo10726f(new C2610m3(this, (C2573l3) null));
        this.f14854d = true;
        this.f14851b = new C2759q3();
        this.f14853c = new SparseArray();
        this.f14857g = new y22(4);
        this.f14858h = new y22(ByteBuffer.allocate(4).putInt(-1).array());
        this.f14859i = new y22(4);
        this.f14855e = new y22(C2420h.f10130a);
        this.f14856f = new y22(4);
        this.f14860j = new y22();
        this.f14861k = new y22();
        this.f14862l = new y22(8);
        this.f14863m = new y22();
        this.f14864n = new y22();
        this.f14834L = new int[1];
    }

    /* renamed from: n */
    protected static final int m17444n(int i) {
        switch (i) {
            case 131:
            case 136:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
            case 215:
            case 231:
            case 238:
            case 241:
            case 251:
            case 16871:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 21998:
            case 22186:
            case 22203:
            case 25188:
            case 30114:
            case 30321:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case 17026:
            case 21358:
            case 2274716:
                return 3;
            case 160:
            case 166:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 16868:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30113:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 165:
            case 16877:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
            case 30323:
            case 30324:
            case 30325:
                return 5;
            default:
                return 0;
        }
    }

    /* renamed from: o */
    protected static final boolean m17445o(int i) {
        return i == 357149030 || i == 524531317 || i == 475249515 || i == 374648427;
    }

    /* renamed from: p */
    private final int m17446p(rn4 rn4, C2647n3 n3Var, int i, boolean z) throws IOException {
        int i2;
        if ("S_TEXT/UTF8".equals(n3Var.f13800b)) {
            m17454x(rn4, f14817d0, i);
            int i3 = this.f14842T;
            m17453w();
            return i3;
        } else if ("S_TEXT/ASS".equals(n3Var.f13800b)) {
            m17454x(rn4, f14819f0, i);
            int i4 = this.f14842T;
            m17453w();
            return i4;
        } else if ("S_TEXT/WEBVTT".equals(n3Var.f13800b)) {
            m17454x(rn4, f14820g0, i);
            int i5 = this.f14842T;
            m17453w();
            return i5;
        } else {
            C2792r rVar = n3Var.f13797X;
            boolean z2 = true;
            if (!this.f14844V) {
                if (n3Var.f13806h) {
                    this.f14837O &= -1073741825;
                    int i6 = 128;
                    if (!this.f14845W) {
                        ((fn4) rn4).mo9984g(this.f14857g.mo15295h(), 0, 1, false);
                        this.f14841S++;
                        if ((this.f14857g.mo15295h()[0] & C8843b4.f36445d) != 128) {
                            this.f14848Z = this.f14857g.mo15295h()[0];
                            this.f14845W = true;
                        } else {
                            throw ea0.m11990a("Extension bit is set in signal byte", (Throwable) null);
                        }
                    }
                    byte b = this.f14848Z;
                    if ((b & 1) == 1) {
                        byte b2 = b & 2;
                        this.f14837O |= 1073741824;
                        if (!this.f14850a0) {
                            ((fn4) rn4).mo9984g(this.f14862l.mo15295h(), 0, 8, false);
                            this.f14841S += 8;
                            this.f14850a0 = true;
                            byte[] h = this.f14857g.mo15295h();
                            if (b2 != 2) {
                                i6 = 0;
                            }
                            h[0] = (byte) (i6 | 8);
                            this.f14857g.mo15293f(0);
                            rVar.mo8822d(this.f14857g, 1, 1);
                            this.f14842T++;
                            this.f14862l.mo15293f(0);
                            rVar.mo8822d(this.f14862l, 8, 1);
                            this.f14842T += 8;
                        }
                        if (b2 == 2) {
                            if (!this.f14846X) {
                                ((fn4) rn4).mo9984g(this.f14857g.mo15295h(), 0, 1, false);
                                this.f14841S++;
                                this.f14857g.mo15293f(0);
                                this.f14847Y = this.f14857g.mo15306s();
                                this.f14846X = true;
                            }
                            int i7 = this.f14847Y * 4;
                            this.f14857g.mo15290c(i7);
                            ((fn4) rn4).mo9984g(this.f14857g.mo15295h(), 0, i7, false);
                            this.f14841S += i7;
                            int i8 = (this.f14847Y >> 1) + 1;
                            int i9 = (i8 * 6) + 2;
                            ByteBuffer byteBuffer = this.f14865o;
                            if (byteBuffer == null || byteBuffer.capacity() < i9) {
                                this.f14865o = ByteBuffer.allocate(i9);
                            }
                            this.f14865o.position(0);
                            this.f14865o.putShort((short) i8);
                            int i10 = 0;
                            int i11 = 0;
                            while (true) {
                                i2 = this.f14847Y;
                                if (i10 >= i2) {
                                    break;
                                }
                                int v = this.f14857g.mo15309v();
                                if (i10 % 2 == 0) {
                                    this.f14865o.putShort((short) (v - i11));
                                } else {
                                    this.f14865o.putInt(v - i11);
                                }
                                i10++;
                                i11 = v;
                            }
                            int i12 = (i - this.f14841S) - i11;
                            if ((i2 & 1) == 1) {
                                this.f14865o.putInt(i12);
                            } else {
                                this.f14865o.putShort((short) i12);
                                this.f14865o.putInt(0);
                            }
                            this.f14863m.mo15291d(this.f14865o.array(), i9);
                            rVar.mo8822d(this.f14863m, i9, 1);
                            this.f14842T += i9;
                        }
                    }
                } else {
                    byte[] bArr = n3Var.f13807i;
                    if (bArr != null) {
                        this.f14860j.mo15291d(bArr, bArr.length);
                    }
                }
                if (!"A_OPUS".equals(n3Var.f13800b) ? n3Var.f13804f > 0 : z) {
                    this.f14837O |= 268435456;
                    this.f14864n.mo15290c(0);
                    int l = (this.f14860j.mo15299l() + i) - this.f14841S;
                    this.f14857g.mo15290c(4);
                    this.f14857g.mo15295h()[0] = (byte) ((l >> 24) & 255);
                    this.f14857g.mo15295h()[1] = (byte) ((l >> 16) & 255);
                    this.f14857g.mo15295h()[2] = (byte) ((l >> 8) & 255);
                    this.f14857g.mo15295h()[3] = (byte) (l & 255);
                    rVar.mo8822d(this.f14857g, 4, 2);
                    this.f14842T += 4;
                }
                this.f14844V = true;
            }
            int l2 = i + this.f14860j.mo15299l();
            if (!"V_MPEG4/ISO/AVC".equals(n3Var.f13800b) && !"V_MPEGH/ISO/HEVC".equals(n3Var.f13800b)) {
                if (n3Var.f13793T != null) {
                    if (this.f14860j.mo15299l() != 0) {
                        z2 = false;
                    }
                    v91.m22052f(z2);
                    n3Var.f13793T.mo13914d(rn4);
                }
                while (true) {
                    int i13 = this.f14841S;
                    if (i13 >= l2) {
                        break;
                    }
                    int q = m17447q(rn4, rVar, l2 - i13);
                    this.f14841S += q;
                    this.f14842T += q;
                }
            } else {
                byte[] h2 = this.f14856f.mo15295h();
                h2[0] = 0;
                h2[1] = 0;
                h2[2] = 0;
                int i14 = n3Var.f13798Y;
                int i15 = 4 - i14;
                while (this.f14841S < l2) {
                    int i16 = this.f14843U;
                    if (i16 == 0) {
                        int min = Math.min(i14, this.f14860j.mo15296i());
                        ((fn4) rn4).mo9984g(h2, i15 + min, i14 - min, false);
                        if (min > 0) {
                            this.f14860j.mo15289b(h2, i15, min);
                        }
                        this.f14841S += i14;
                        this.f14856f.mo15293f(0);
                        this.f14843U = this.f14856f.mo15309v();
                        this.f14855e.mo15293f(0);
                        C2717p.m18261b(rVar, this.f14855e, 4);
                        this.f14842T += 4;
                    } else {
                        int q2 = m17447q(rn4, rVar, i16);
                        this.f14841S += q2;
                        this.f14842T += q2;
                        this.f14843U -= q2;
                    }
                }
            }
            if ("A_VORBIS".equals(n3Var.f13800b)) {
                this.f14858h.mo15293f(0);
                C2717p.m18261b(rVar, this.f14858h, 4);
                this.f14842T += 4;
            }
            int i17 = this.f14842T;
            m17453w();
            return i17;
        }
    }

    /* renamed from: q */
    private final int m17447q(rn4 rn4, C2792r rVar, int i) throws IOException {
        int i2 = this.f14860j.mo15296i();
        if (i2 <= 0) {
            return C2717p.m18260a(rVar, rn4, i, false);
        }
        int min = Math.min(i, i2);
        C2717p.m18261b(rVar, this.f14860j, min);
        return min;
    }

    /* renamed from: r */
    private final long m17448r(long j) throws ea0 {
        long j2 = this.f14868r;
        if (j2 != -9223372036854775807L) {
            return gb2.m13170g0(j, j2, 1000);
        }
        throw ea0.m11990a("Can't scale timecode prior to timecodeScale being set.", (Throwable) null);
    }

    /* renamed from: s */
    private final void m17449s(int i) throws ea0 {
        if (this.f14825C == null || this.f14826D == null) {
            throw ea0.m11990a("Element " + i + " must be in a Cues", (Throwable) null);
        }
    }

    /* renamed from: t */
    private final void m17450t(int i) throws ea0 {
        if (this.f14871u == null) {
            throw ea0.m11990a("Element " + i + " must be in a TrackEntry", (Throwable) null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00e0 A[EDGE_INSN: B:59:0x00e0->B:48:0x00e0 ?: BREAK  , SYNTHETIC] */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m17451u(com.google.android.gms.internal.ads.C2647n3 r18, long r19, int r21, int r22, int r23) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            com.google.android.gms.internal.ads.s r2 = r1.f13793T
            r9 = 1
            if (r2 == 0) goto L_0x001c
            com.google.android.gms.internal.ads.r r3 = r1.f13797X
            com.google.android.gms.internal.ads.q r8 = r1.f13808j
            r1 = r2
            r2 = r3
            r3 = r19
            r5 = r21
            r6 = r22
            r7 = r23
            r1.mo13913c(r2, r3, r5, r6, r7, r8)
            goto L_0x0121
        L_0x001c:
            java.lang.String r2 = r1.f13800b
            java.lang.String r3 = "S_TEXT/UTF8"
            boolean r2 = r3.equals(r2)
            java.lang.String r4 = "S_TEXT/WEBVTT"
            java.lang.String r5 = "S_TEXT/ASS"
            r6 = 0
            r7 = 2
            if (r2 != 0) goto L_0x003c
            java.lang.String r2 = r1.f13800b
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L_0x003c
            java.lang.String r2 = r1.f13800b
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x0058
        L_0x003c:
            int r2 = r0.f14833K
            java.lang.String r8 = "MatroskaExtractor"
            if (r2 <= r9) goto L_0x0048
            java.lang.String r2 = "Skipping subtitle sample in laced block."
            com.google.android.gms.internal.ads.ot1.m18060e(r8, r2)
            goto L_0x0058
        L_0x0048:
            long r10 = r0.f14831I
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r2 != 0) goto L_0x005c
            java.lang.String r2 = "Skipping subtitle sample with no duration."
            com.google.android.gms.internal.ads.ot1.m18060e(r8, r2)
        L_0x0058:
            r2 = r22
            goto L_0x00f3
        L_0x005c:
            java.lang.String r2 = r1.f13800b
            com.google.android.gms.internal.ads.y22 r8 = r0.f14861k
            byte[] r8 = r8.mo15295h()
            int r12 = r2.hashCode()
            r13 = 738597099(0x2c0618eb, float:1.9056378E-12)
            if (r12 == r13) goto L_0x0088
            r5 = 1045209816(0x3e4ca2d8, float:0.19983995)
            if (r12 == r5) goto L_0x0080
            r4 = 1422270023(0x54c61e47, float:6.807292E12)
            if (r12 == r4) goto L_0x0078
            goto L_0x0090
        L_0x0078:
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0090
            r2 = 0
            goto L_0x0091
        L_0x0080:
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x0090
            r2 = 2
            goto L_0x0091
        L_0x0088:
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x0090
            r2 = 1
            goto L_0x0091
        L_0x0090:
            r2 = -1
        L_0x0091:
            r3 = 1000(0x3e8, double:4.94E-321)
            if (r2 == 0) goto L_0x00b3
            if (r2 == r9) goto L_0x00a8
            if (r2 != r7) goto L_0x00a2
            java.lang.String r2 = "%02d:%02d:%02d.%03d"
            byte[] r2 = m17455y(r10, r2, r3)
            r3 = 25
            goto L_0x00bb
        L_0x00a2:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>()
            throw r1
        L_0x00a8:
            r2 = 10000(0x2710, double:4.9407E-320)
            java.lang.String r4 = "%01d:%02d:%02d:%02d"
            byte[] r2 = m17455y(r10, r4, r2)
            r3 = 21
            goto L_0x00bb
        L_0x00b3:
            java.lang.String r2 = "%02d:%02d:%02d,%03d"
            byte[] r2 = m17455y(r10, r2, r3)
            r3 = 19
        L_0x00bb:
            int r4 = r2.length
            java.lang.System.arraycopy(r2, r6, r8, r3, r4)
            com.google.android.gms.internal.ads.y22 r2 = r0.f14861k
            int r2 = r2.mo15298k()
        L_0x00c5:
            com.google.android.gms.internal.ads.y22 r3 = r0.f14861k
            int r3 = r3.mo15299l()
            if (r2 >= r3) goto L_0x00e0
            com.google.android.gms.internal.ads.y22 r3 = r0.f14861k
            byte[] r3 = r3.mo15295h()
            byte r3 = r3[r2]
            if (r3 != 0) goto L_0x00dd
            com.google.android.gms.internal.ads.y22 r3 = r0.f14861k
            r3.mo15292e(r2)
            goto L_0x00e0
        L_0x00dd:
            int r2 = r2 + 1
            goto L_0x00c5
        L_0x00e0:
            com.google.android.gms.internal.ads.r r2 = r1.f13797X
            com.google.android.gms.internal.ads.y22 r3 = r0.f14861k
            int r4 = r3.mo15299l()
            com.google.android.gms.internal.ads.C2717p.m18261b(r2, r3, r4)
            com.google.android.gms.internal.ads.y22 r2 = r0.f14861k
            int r2 = r2.mo15299l()
            int r2 = r22 + r2
        L_0x00f3:
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            r3 = r21 & r3
            if (r3 == 0) goto L_0x0111
            int r3 = r0.f14833K
            if (r3 <= r9) goto L_0x0103
            com.google.android.gms.internal.ads.y22 r3 = r0.f14864n
            r3.mo15290c(r6)
            goto L_0x0111
        L_0x0103:
            com.google.android.gms.internal.ads.y22 r3 = r0.f14864n
            int r3 = r3.mo15299l()
            com.google.android.gms.internal.ads.r r4 = r1.f13797X
            com.google.android.gms.internal.ads.y22 r5 = r0.f14864n
            r4.mo8822d(r5, r3, r7)
            int r2 = r2 + r3
        L_0x0111:
            r14 = r2
            com.google.android.gms.internal.ads.r r10 = r1.f13797X
            com.google.android.gms.internal.ads.q r1 = r1.f13808j
            r11 = r19
            r13 = r21
            r15 = r23
            r16 = r1
            r10.mo8824f(r11, r13, r14, r15, r16)
        L_0x0121:
            r0.f14828F = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2684o3.m17451u(com.google.android.gms.internal.ads.n3, long, int, int, int):void");
    }

    /* renamed from: v */
    private final void m17452v(rn4 rn4, int i) throws IOException {
        if (this.f14857g.mo15299l() < i) {
            if (this.f14857g.mo15297j() < i) {
                y22 y22 = this.f14857g;
                int j = y22.mo15297j();
                y22.mo15287H(Math.max(j + j, i));
            }
            ((fn4) rn4).mo9984g(this.f14857g.mo15295h(), this.f14857g.mo15299l(), i - this.f14857g.mo15299l(), false);
            this.f14857g.mo15292e(i);
        }
    }

    /* renamed from: w */
    private final void m17453w() {
        this.f14841S = 0;
        this.f14842T = 0;
        this.f14843U = 0;
        this.f14844V = false;
        this.f14845W = false;
        this.f14846X = false;
        this.f14847Y = 0;
        this.f14848Z = 0;
        this.f14850a0 = false;
        this.f14860j.mo15290c(0);
    }

    /* renamed from: x */
    private final void m17454x(rn4 rn4, byte[] bArr, int i) throws IOException {
        int length = bArr.length;
        int i2 = length + i;
        if (this.f14861k.mo15297j() < i2) {
            y22 y22 = this.f14861k;
            byte[] copyOf = Arrays.copyOf(bArr, i2 + i);
            y22.mo15291d(copyOf, copyOf.length);
        } else {
            System.arraycopy(bArr, 0, this.f14861k.mo15295h(), 0, length);
        }
        ((fn4) rn4).mo9984g(this.f14861k.mo15295h(), length, i, false);
        this.f14861k.mo15293f(0);
        this.f14861k.mo15292e(i2);
    }

    /* renamed from: y */
    private static byte[] m17455y(long j, String str, long j2) {
        v91.m22050d(j != -9223372036854775807L);
        int i = (int) (j / 3600000000L);
        long j3 = j - (((long) i) * 3600000000L);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - (((long) i2) * 60000000);
        int i3 = (int) (j4 / 1000000);
        return gb2.m13132B(String.format(Locale.US, str, new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (((long) i3) * 1000000)) / j2))}));
    }

    /* renamed from: z */
    private static int[] m17456z(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        int length = iArr.length;
        return length >= i ? iArr : new int[Math.max(length + length, i)];
    }

    /* renamed from: b */
    public final boolean mo9023b(rn4 rn4) throws IOException {
        return new C2721p3().mo13123a(rn4);
    }

    /* renamed from: c */
    public final void mo9024c(tn4 tn4) {
        this.f14852b0 = tn4;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x027f, code lost:
        throw com.google.android.gms.internal.ads.ea0.m11990a("EBML lacing sample size out of range.", (java.lang.Throwable) null);
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12806e(int r19, int r20, com.google.android.gms.internal.ads.rn4 r21) throws java.io.IOException {
        /*
            r18 = this;
            r7 = r18
            r0 = r19
            r1 = r20
            r8 = r21
            r2 = 161(0xa1, float:2.26E-43)
            r3 = 0
            r4 = 4
            r5 = 163(0xa3, float:2.28E-43)
            r6 = 2
            r9 = 1
            r10 = 0
            if (r0 == r2) goto L_0x0112
            if (r0 == r5) goto L_0x0112
            r2 = 165(0xa5, float:2.31E-43)
            if (r0 == r2) goto L_0x00dc
            r2 = 16877(0x41ed, float:2.365E-41)
            if (r0 == r2) goto L_0x00b2
            r2 = 16981(0x4255, float:2.3795E-41)
            if (r0 == r2) goto L_0x00a2
            r2 = 18402(0x47e2, float:2.5787E-41)
            if (r0 == r2) goto L_0x008d
            r2 = 21419(0x53ab, float:3.0014E-41)
            if (r0 == r2) goto L_0x0067
            r2 = 25506(0x63a2, float:3.5742E-41)
            if (r0 == r2) goto L_0x0057
            r2 = 30322(0x7672, float:4.249E-41)
            if (r0 != r2) goto L_0x0041
            r18.m17450t(r19)
            com.google.android.gms.internal.ads.n3 r0 = r7.f14871u
            byte[] r2 = new byte[r1]
            r0.f13820v = r2
            r0 = r8
            com.google.android.gms.internal.ads.fn4 r0 = (com.google.android.gms.internal.ads.fn4) r0
            r0.mo9984g(r2, r10, r1, r10)
            return
        L_0x0041:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unexpected id: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.google.android.gms.internal.ads.ea0 r0 = com.google.android.gms.internal.ads.ea0.m11990a(r0, r3)
            throw r0
        L_0x0057:
            r18.m17450t(r19)
            com.google.android.gms.internal.ads.n3 r0 = r7.f14871u
            byte[] r2 = new byte[r1]
            r0.f13809k = r2
            r0 = r8
            com.google.android.gms.internal.ads.fn4 r0 = (com.google.android.gms.internal.ads.fn4) r0
            r0.mo9984g(r2, r10, r1, r10)
            return
        L_0x0067:
            com.google.android.gms.internal.ads.y22 r0 = r7.f14859i
            byte[] r0 = r0.mo15295h()
            java.util.Arrays.fill(r0, r10)
            com.google.android.gms.internal.ads.y22 r0 = r7.f14859i
            byte[] r0 = r0.mo15295h()
            r2 = r8
            com.google.android.gms.internal.ads.fn4 r2 = (com.google.android.gms.internal.ads.fn4) r2
            int r3 = 4 - r1
            r2.mo9984g(r0, r3, r1, r10)
            com.google.android.gms.internal.ads.y22 r0 = r7.f14859i
            r0.mo15293f(r10)
            com.google.android.gms.internal.ads.y22 r0 = r7.f14859i
            long r0 = r0.mo15280A()
            int r1 = (int) r0
            r7.f14873w = r1
            return
        L_0x008d:
            byte[] r2 = new byte[r1]
            r3 = r8
            com.google.android.gms.internal.ads.fn4 r3 = (com.google.android.gms.internal.ads.fn4) r3
            r3.mo9984g(r2, r10, r1, r10)
            r18.m17450t(r19)
            com.google.android.gms.internal.ads.n3 r0 = r7.f14871u
            com.google.android.gms.internal.ads.q r1 = new com.google.android.gms.internal.ads.q
            r1.<init>(r9, r2, r10, r10)
            r0.f13808j = r1
            return
        L_0x00a2:
            r18.m17450t(r19)
            com.google.android.gms.internal.ads.n3 r0 = r7.f14871u
            byte[] r2 = new byte[r1]
            r0.f13807i = r2
            r0 = r8
            com.google.android.gms.internal.ads.fn4 r0 = (com.google.android.gms.internal.ads.fn4) r0
            r0.mo9984g(r2, r10, r1, r10)
            return
        L_0x00b2:
            r18.m17450t(r19)
            com.google.android.gms.internal.ads.n3 r0 = r7.f14871u
            int r2 = r0.f13805g
            r3 = 1685485123(0x64767643, float:1.8185683E22)
            if (r2 == r3) goto L_0x00d1
            int r2 = r0.f13805g
            r3 = 1685480259(0x64766343, float:1.8180206E22)
            if (r2 != r3) goto L_0x00ca
            goto L_0x00d1
        L_0x00ca:
            r0 = r8
            com.google.android.gms.internal.ads.fn4 r0 = (com.google.android.gms.internal.ads.fn4) r0
            r0.mo10218n(r1, r10)
            return
        L_0x00d1:
            byte[] r2 = new byte[r1]
            r0.f13787N = r2
            r0 = r8
            com.google.android.gms.internal.ads.fn4 r0 = (com.google.android.gms.internal.ads.fn4) r0
            r0.mo9984g(r2, r10, r1, r10)
            return
        L_0x00dc:
            int r0 = r7.f14829G
            if (r0 == r6) goto L_0x00e1
            return
        L_0x00e1:
            android.util.SparseArray r0 = r7.f14853c
            int r2 = r7.f14835M
            java.lang.Object r0 = r0.get(r2)
            com.google.android.gms.internal.ads.n3 r0 = (com.google.android.gms.internal.ads.C2647n3) r0
            int r2 = r7.f14838P
            if (r2 != r4) goto L_0x010b
            java.lang.String r0 = r0.f13800b
            java.lang.String r2 = "V_VP9"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x010b
            com.google.android.gms.internal.ads.y22 r0 = r7.f14864n
            r0.mo15290c(r1)
            com.google.android.gms.internal.ads.y22 r0 = r7.f14864n
            byte[] r0 = r0.mo15295h()
            r2 = r8
            com.google.android.gms.internal.ads.fn4 r2 = (com.google.android.gms.internal.ads.fn4) r2
            r2.mo9984g(r0, r10, r1, r10)
            return
        L_0x010b:
            r0 = r8
            com.google.android.gms.internal.ads.fn4 r0 = (com.google.android.gms.internal.ads.fn4) r0
            r0.mo10218n(r1, r10)
            return
        L_0x0112:
            int r2 = r7.f14829G
            r11 = 8
            if (r2 != 0) goto L_0x0137
            com.google.android.gms.internal.ads.q3 r2 = r7.f14851b
            long r12 = r2.mo13466d(r8, r10, r9, r11)
            int r2 = (int) r12
            r7.f14835M = r2
            com.google.android.gms.internal.ads.q3 r2 = r7.f14851b
            int r2 = r2.mo13465a()
            r7.f14836N = r2
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7.f14831I = r12
            r7.f14829G = r9
            com.google.android.gms.internal.ads.y22 r2 = r7.f14857g
            r2.mo15290c(r10)
        L_0x0137:
            android.util.SparseArray r2 = r7.f14853c
            int r12 = r7.f14835M
            java.lang.Object r2 = r2.get(r12)
            r12 = r2
            com.google.android.gms.internal.ads.n3 r12 = (com.google.android.gms.internal.ads.C2647n3) r12
            if (r12 != 0) goto L_0x0151
            int r0 = r7.f14836N
            r2 = r8
            com.google.android.gms.internal.ads.fn4 r2 = (com.google.android.gms.internal.ads.fn4) r2
            int r0 = r1 - r0
            r2.mo10218n(r0, r10)
            r7.f14829G = r10
            return
        L_0x0151:
            java.util.Objects.requireNonNull(r12.f13797X)
            int r2 = r7.f14829G
            if (r2 != r9) goto L_0x02e0
            r2 = 3
            r7.m17452v(r8, r2)
            com.google.android.gms.internal.ads.y22 r13 = r7.f14857g
            byte[] r13 = r13.mo15295h()
            byte r13 = r13[r6]
            r13 = r13 & 6
            int r13 = r13 >> r9
            r14 = 255(0xff, float:3.57E-43)
            if (r13 != 0) goto L_0x017e
            r7.f14833K = r9
            int[] r2 = r7.f14834L
            int[] r2 = m17456z(r2, r9)
            r7.f14834L = r2
            int r3 = r7.f14836N
            int r1 = r1 - r3
            int r1 = r1 + -3
            r2[r10] = r1
            goto L_0x0290
        L_0x017e:
            r7.m17452v(r8, r4)
            com.google.android.gms.internal.ads.y22 r15 = r7.f14857g
            byte[] r15 = r15.mo15295h()
            byte r15 = r15[r2]
            r15 = r15 & r14
            int r15 = r15 + r9
            r7.f14833K = r15
            int[] r4 = r7.f14834L
            int[] r4 = m17456z(r4, r15)
            r7.f14834L = r4
            if (r13 != r6) goto L_0x01a4
            int r2 = r7.f14836N
            int r3 = r7.f14833K
            int r1 = r1 - r2
            int r1 = r1 + -4
            int r1 = r1 / r3
            java.util.Arrays.fill(r4, r10, r3, r1)
            goto L_0x0290
        L_0x01a4:
            if (r13 != r9) goto L_0x01dc
            r2 = 0
            r3 = 0
            r4 = 4
        L_0x01a9:
            int r13 = r7.f14833K
            int r13 = r13 + -1
            if (r2 >= r13) goto L_0x01d1
            int[] r13 = r7.f14834L
            r13[r2] = r10
        L_0x01b3:
            int r4 = r4 + r9
            r7.m17452v(r8, r4)
            com.google.android.gms.internal.ads.y22 r13 = r7.f14857g
            byte[] r13 = r13.mo15295h()
            int r15 = r4 + -1
            byte r13 = r13[r15]
            r13 = r13 & r14
            int[] r15 = r7.f14834L
            r16 = r15[r2]
            int r16 = r16 + r13
            r15[r2] = r16
            if (r13 == r14) goto L_0x01b3
            int r3 = r3 + r16
            int r2 = r2 + 1
            goto L_0x01a9
        L_0x01d1:
            int[] r2 = r7.f14834L
            int r15 = r7.f14836N
            int r1 = r1 - r15
            int r1 = r1 - r4
            int r1 = r1 - r3
            r2[r13] = r1
            goto L_0x0290
        L_0x01dc:
            if (r13 != r2) goto L_0x02d9
            r2 = 0
            r4 = 4
            r13 = 0
        L_0x01e1:
            int r15 = r7.f14833K
            int r15 = r15 + -1
            if (r2 >= r15) goto L_0x0287
            int[] r15 = r7.f14834L
            r15[r2] = r10
            int r4 = r4 + 1
            r7.m17452v(r8, r4)
            int r15 = r4 + -1
            com.google.android.gms.internal.ads.y22 r5 = r7.f14857g
            byte[] r5 = r5.mo15295h()
            byte r5 = r5[r15]
            if (r5 == 0) goto L_0x0280
            r5 = 0
        L_0x01fd:
            if (r5 >= r11) goto L_0x024f
            int r17 = 7 - r5
            int r6 = r9 << r17
            com.google.android.gms.internal.ads.y22 r9 = r7.f14857g
            byte[] r9 = r9.mo15295h()
            byte r9 = r9[r15]
            r9 = r9 & r6
            if (r9 == 0) goto L_0x0245
            int r4 = r4 + r5
            r7.m17452v(r8, r4)
            int r9 = r15 + 1
            com.google.android.gms.internal.ads.y22 r10 = r7.f14857g
            byte[] r10 = r10.mo15295h()
            byte r10 = r10[r15]
            r10 = r10 & r14
            int r6 = ~r6
            r6 = r6 & r10
            long r14 = (long) r6
        L_0x0220:
            if (r9 >= r4) goto L_0x0236
            int r6 = r9 + 1
            long r14 = r14 << r11
            com.google.android.gms.internal.ads.y22 r10 = r7.f14857g
            byte[] r10 = r10.mo15295h()
            byte r9 = r10[r9]
            r10 = 255(0xff, float:3.57E-43)
            r9 = r9 & r10
            long r10 = (long) r9
            long r14 = r14 | r10
            r9 = r6
            r11 = 8
            goto L_0x0220
        L_0x0236:
            if (r2 <= 0) goto L_0x0251
            r9 = 1
            int r5 = r5 * 7
            int r5 = r5 + 6
            long r5 = r9 << r5
            r9 = -1
            long r5 = r5 + r9
            long r14 = r14 - r5
            goto L_0x0251
        L_0x0245:
            int r5 = r5 + 1
            r6 = 2
            r9 = 1
            r10 = 0
            r11 = 8
            r14 = 255(0xff, float:3.57E-43)
            goto L_0x01fd
        L_0x024f:
            r14 = 0
        L_0x0251:
            r5 = -2147483648(0xffffffff80000000, double:NaN)
            int r9 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r9 < 0) goto L_0x0279
            r5 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r9 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r9 > 0) goto L_0x0279
            int r5 = (int) r14
            int[] r6 = r7.f14834L
            if (r2 == 0) goto L_0x0269
            int r9 = r2 + -1
            r9 = r6[r9]
            int r5 = r5 + r9
        L_0x0269:
            r6[r2] = r5
            int r13 = r13 + r5
            int r2 = r2 + 1
            r5 = 163(0xa3, float:2.28E-43)
            r6 = 2
            r9 = 1
            r10 = 0
            r11 = 8
            r14 = 255(0xff, float:3.57E-43)
            goto L_0x01e1
        L_0x0279:
            java.lang.String r0 = "EBML lacing sample size out of range."
            com.google.android.gms.internal.ads.ea0 r0 = com.google.android.gms.internal.ads.ea0.m11990a(r0, r3)
            throw r0
        L_0x0280:
            java.lang.String r0 = "No valid varint length mask found"
            com.google.android.gms.internal.ads.ea0 r0 = com.google.android.gms.internal.ads.ea0.m11990a(r0, r3)
            throw r0
        L_0x0287:
            int[] r2 = r7.f14834L
            int r3 = r7.f14836N
            int r1 = r1 - r3
            int r1 = r1 - r4
            int r1 = r1 - r13
            r2[r15] = r1
        L_0x0290:
            com.google.android.gms.internal.ads.y22 r1 = r7.f14857g
            byte[] r1 = r1.mo15295h()
            r2 = 0
            byte r1 = r1[r2]
            com.google.android.gms.internal.ads.y22 r2 = r7.f14857g
            byte[] r2 = r2.mo15295h()
            r3 = 1
            byte r2 = r2[r3]
            long r3 = r7.f14824B
            r5 = 8
            int r1 = r1 << r5
            r5 = 255(0xff, float:3.57E-43)
            r2 = r2 & r5
            r1 = r1 | r2
            long r1 = (long) r1
            long r1 = r7.m17448r(r1)
            long r3 = r3 + r1
            r7.f14830H = r3
            int r1 = r12.f13802d
            r2 = 2
            if (r1 == r2) goto L_0x02d0
            r1 = 163(0xa3, float:2.28E-43)
            if (r0 != r1) goto L_0x02ce
            com.google.android.gms.internal.ads.y22 r0 = r7.f14857g
            byte[] r0 = r0.mo15295h()
            byte r0 = r0[r2]
            r1 = 128(0x80, float:1.794E-43)
            r0 = r0 & r1
            if (r0 != r1) goto L_0x02cc
            r0 = 163(0xa3, float:2.28E-43)
            goto L_0x02d0
        L_0x02cc:
            r0 = 163(0xa3, float:2.28E-43)
        L_0x02ce:
            r1 = 0
            goto L_0x02d1
        L_0x02d0:
            r1 = 1
        L_0x02d1:
            r7.f14837O = r1
            r7.f14829G = r2
            r1 = 0
            r7.f14832J = r1
            goto L_0x02e0
        L_0x02d9:
            java.lang.String r0 = "Unexpected lacing value: 2"
            com.google.android.gms.internal.ads.ea0 r0 = com.google.android.gms.internal.ads.ea0.m11990a(r0, r3)
            throw r0
        L_0x02e0:
            r1 = 163(0xa3, float:2.28E-43)
            if (r0 != r1) goto L_0x0313
        L_0x02e4:
            int r0 = r7.f14832J
            int r1 = r7.f14833K
            if (r0 >= r1) goto L_0x030f
            int[] r1 = r7.f14834L
            r0 = r1[r0]
            r1 = 0
            int r5 = r7.m17446p(r8, r12, r0, r1)
            long r0 = r7.f14830H
            int r2 = r7.f14832J
            int r3 = r12.f13803e
            int r2 = r2 * r3
            int r2 = r2 / 1000
            long r2 = (long) r2
            long r2 = r2 + r0
            int r4 = r7.f14837O
            r6 = 0
            r0 = r18
            r1 = r12
            r0.m17451u(r1, r2, r4, r5, r6)
            int r0 = r7.f14832J
            r1 = 1
            int r0 = r0 + r1
            r7.f14832J = r0
            goto L_0x02e4
        L_0x030f:
            r0 = 0
            r7.f14829G = r0
            return
        L_0x0313:
            r1 = 1
        L_0x0314:
            int r0 = r7.f14832J
            int r2 = r7.f14833K
            if (r0 >= r2) goto L_0x032a
            int[] r2 = r7.f14834L
            r3 = r2[r0]
            int r3 = r7.m17446p(r8, r12, r3, r1)
            r2[r0] = r3
            int r0 = r7.f14832J
            int r0 = r0 + r1
            r7.f14832J = r0
            goto L_0x0314
        L_0x032a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2684o3.mo12806e(int, int, com.google.android.gms.internal.ads.rn4):void");
    }

    /* renamed from: f */
    public final int mo9025f(rn4 rn4, C2532k kVar) throws IOException {
        this.f14828F = false;
        while (!this.f14828F) {
            if (this.f14849a.mo10725e(rn4)) {
                long T = rn4.mo9003T();
                if (this.f14875y) {
                    this.f14823A = T;
                    kVar.f11852a = this.f14876z;
                    this.f14875y = false;
                    return 1;
                } else if (this.f14872v) {
                    long j = this.f14823A;
                    if (j != -1) {
                        kVar.f11852a = j;
                        this.f14823A = -1;
                        return 1;
                    }
                }
            } else {
                for (int i = 0; i < this.f14853c.size(); i++) {
                    C2647n3 n3Var = (C2647n3) this.f14853c.valueAt(i);
                    Objects.requireNonNull(n3Var.f13797X);
                    C2829s sVar = n3Var.f13793T;
                    if (sVar != null) {
                        sVar.mo13911a(n3Var.f13797X, n3Var.f13808j);
                    }
                }
                return -1;
            }
        }
        return 0;
    }

    /* renamed from: g */
    public final void mo9026g(long j, long j2) {
        this.f14824B = -9223372036854775807L;
        this.f14829G = 0;
        this.f14849a.mo10724d();
        this.f14851b.mo13467e();
        m17453w();
        for (int i = 0; i < this.f14853c.size(); i++) {
            C2829s sVar = ((C2647n3) this.f14853c.valueAt(i)).f13793T;
            if (sVar != null) {
                sVar.mo13912b();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01e8, code lost:
        if (r5.equals("V_MPEGH/ISO/HEVC") != false) goto L_0x0315;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12807h(int r22) throws com.google.android.gms.internal.ads.ea0 {
        /*
            r21 = this;
            r7 = r21
            r0 = r22
            com.google.android.gms.internal.ads.tn4 r1 = r7.f14852b0
            com.google.android.gms.internal.ads.v91.m22048b(r1)
            r1 = 160(0xa0, float:2.24E-43)
            r2 = 8
            java.lang.String r3 = "A_OPUS"
            r4 = 2
            r5 = 0
            if (r0 == r1) goto L_0x0334
            r1 = 174(0xae, float:2.44E-43)
            r10 = -1
            if (r0 == r1) goto L_0x018a
            r1 = 19899(0x4dbb, float:2.7884E-41)
            r2 = -1
            r4 = 475249515(0x1c53bb6b, float:7.0056276E-22)
            if (r0 == r1) goto L_0x0172
            r1 = 25152(0x6240, float:3.5245E-41)
            if (r0 == r1) goto L_0x013f
            r1 = 28032(0x6d80, float:3.9281E-41)
            if (r0 == r1) goto L_0x0129
            r1 = 357149030(0x1549a966, float:4.072526E-26)
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r0 == r1) goto L_0x0111
            r1 = 374648427(0x1654ae6b, float:1.718026E-25)
            if (r0 == r1) goto L_0x00fb
            if (r0 == r4) goto L_0x003d
            goto L_0x0181
        L_0x003d:
            boolean r0 = r7.f14872v
            if (r0 != 0) goto L_0x00f5
            com.google.android.gms.internal.ads.tn4 r0 = r7.f14852b0
            com.google.android.gms.internal.ads.pu1 r1 = r7.f14825C
            com.google.android.gms.internal.ads.pu1 r4 = r7.f14826D
            long r14 = r7.f14867q
            int r16 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r16 == 0) goto L_0x00e8
            long r2 = r7.f14870t
            int r14 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r14 == 0) goto L_0x00e8
            if (r1 == 0) goto L_0x00e8
            int r2 = r1.mo13381a()
            if (r2 == 0) goto L_0x00e8
            if (r4 == 0) goto L_0x00e8
            int r2 = r4.mo13381a()
            int r3 = r1.mo13381a()
            if (r2 == r3) goto L_0x0069
            goto L_0x00e8
        L_0x0069:
            int r2 = r1.mo13381a()
            int[] r3 = new int[r2]
            long[] r12 = new long[r2]
            long[] r13 = new long[r2]
            long[] r14 = new long[r2]
            r15 = 0
        L_0x0076:
            if (r15 >= r2) goto L_0x008b
            long r16 = r1.mo13382b(r15)
            r14[r15] = r16
            long r8 = r7.f14867q
            long r18 = r4.mo13382b(r15)
            long r8 = r8 + r18
            r12[r15] = r8
            int r15 = r15 + 1
            goto L_0x0076
        L_0x008b:
            r9 = 0
        L_0x008c:
            int r1 = r2 + -1
            if (r9 >= r1) goto L_0x00a6
            int r1 = r9 + 1
            r17 = r12[r1]
            r19 = r12[r9]
            long r10 = r17 - r19
            int r4 = (int) r10
            r3[r9] = r4
            r10 = r14[r1]
            r17 = r14[r9]
            long r10 = r10 - r17
            r13[r9] = r10
            r9 = r1
            r10 = -1
            goto L_0x008c
        L_0x00a6:
            long r8 = r7.f14867q
            long r10 = r7.f14866p
            long r8 = r8 + r10
            r10 = r12[r1]
            long r8 = r8 - r10
            int r2 = (int) r8
            r3[r1] = r2
            long r8 = r7.f14870t
            r10 = r14[r1]
            long r8 = r8 - r10
            r13[r1] = r8
            int r2 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r2 > 0) goto L_0x00e2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "Discarding last cue point with unexpected duration: "
            r2.append(r4)
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            java.lang.String r4 = "MatroskaExtractor"
            com.google.android.gms.internal.ads.ot1.m18060e(r4, r2)
            int[] r3 = java.util.Arrays.copyOf(r3, r1)
            long[] r12 = java.util.Arrays.copyOf(r12, r1)
            long[] r13 = java.util.Arrays.copyOf(r13, r1)
            long[] r14 = java.util.Arrays.copyOf(r14, r1)
        L_0x00e2:
            com.google.android.gms.internal.ads.dn4 r1 = new com.google.android.gms.internal.ads.dn4
            r1.<init>(r3, r12, r13, r14)
            goto L_0x00ef
        L_0x00e8:
            com.google.android.gms.internal.ads.m r1 = new com.google.android.gms.internal.ads.m
            long r2 = r7.f14870t
            r1.<init>(r2, r5)
        L_0x00ef:
            r0.mo10059j(r1)
            r0 = 1
            r7.f14872v = r0
        L_0x00f5:
            r0 = 0
            r7.f14825C = r0
            r7.f14826D = r0
            return
        L_0x00fb:
            r0 = 0
            android.util.SparseArray r1 = r7.f14853c
            int r1 = r1.size()
            if (r1 == 0) goto L_0x010a
            com.google.android.gms.internal.ads.tn4 r0 = r7.f14852b0
            r0.mo10058C()
            return
        L_0x010a:
            java.lang.String r1 = "No valid tracks were found"
            com.google.android.gms.internal.ads.ea0 r0 = com.google.android.gms.internal.ads.ea0.m11990a(r1, r0)
            throw r0
        L_0x0111:
            long r0 = r7.f14868r
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 != 0) goto L_0x011c
            r0 = 1000000(0xf4240, double:4.940656E-318)
            r7.f14868r = r0
        L_0x011c:
            long r0 = r7.f14869s
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 == 0) goto L_0x0181
            long r0 = r7.m17448r(r0)
            r7.f14870t = r0
            return
        L_0x0129:
            r21.m17450t(r22)
            com.google.android.gms.internal.ads.n3 r0 = r7.f14871u
            boolean r1 = r0.f13806h
            if (r1 == 0) goto L_0x0181
            byte[] r0 = r0.f13807i
            if (r0 != 0) goto L_0x0137
            goto L_0x0181
        L_0x0137:
            java.lang.String r0 = "Combining encryption and compression is not supported"
            r1 = 0
            com.google.android.gms.internal.ads.ea0 r0 = com.google.android.gms.internal.ads.ea0.m11990a(r0, r1)
            throw r0
        L_0x013f:
            r21.m17450t(r22)
            com.google.android.gms.internal.ads.n3 r0 = r7.f14871u
            boolean r1 = r0.f13806h
            if (r1 == 0) goto L_0x0181
            com.google.android.gms.internal.ads.q r1 = r0.f13808j
            if (r1 == 0) goto L_0x016a
            com.google.android.gms.internal.ads.fl4 r1 = new com.google.android.gms.internal.ads.fl4
            r2 = 1
            com.google.android.gms.internal.ads.ek4[] r2 = new com.google.android.gms.internal.ads.ek4[r2]
            com.google.android.gms.internal.ads.ek4 r3 = new com.google.android.gms.internal.ads.ek4
            java.util.UUID r4 = com.google.android.gms.internal.ads.ac4.f6520a
            com.google.android.gms.internal.ads.n3 r5 = r7.f14871u
            com.google.android.gms.internal.ads.q r5 = r5.f13808j
            byte[] r5 = r5.f16102b
            java.lang.String r6 = "video/webm"
            r8 = 0
            r3.<init>(r4, r8, r6, r5)
            r4 = 0
            r2[r4] = r3
            r1.<init>(r8, r2)
            r0.f13810l = r1
            return
        L_0x016a:
            r8 = 0
            java.lang.String r0 = "Encrypted Track found but ContentEncKeyID was not found"
            com.google.android.gms.internal.ads.ea0 r0 = com.google.android.gms.internal.ads.ea0.m11990a(r0, r8)
            throw r0
        L_0x0172:
            int r0 = r7.f14873w
            r1 = -1
            if (r0 == r1) goto L_0x0182
            long r5 = r7.f14874x
            int r1 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x0182
            if (r0 != r4) goto L_0x0181
            r7.f14876z = r5
        L_0x0181:
            return
        L_0x0182:
            java.lang.String r0 = "Mandatory element SeekID or SeekPosition not found"
            r1 = 0
            com.google.android.gms.internal.ads.ea0 r0 = com.google.android.gms.internal.ads.ea0.m11990a(r0, r1)
            throw r0
        L_0x018a:
            r1 = -1
            com.google.android.gms.internal.ads.n3 r0 = r7.f14871u
            com.google.android.gms.internal.ads.v91.m22048b(r0)
            java.lang.String r5 = r0.f13800b
            if (r5 == 0) goto L_0x032c
            int r6 = r5.hashCode()
            switch(r6) {
                case -2095576542: goto L_0x030a;
                case -2095575984: goto L_0x0300;
                case -1985379776: goto L_0x02f5;
                case -1784763192: goto L_0x02ea;
                case -1730367663: goto L_0x02df;
                case -1482641358: goto L_0x02d4;
                case -1482641357: goto L_0x02c9;
                case -1373388978: goto L_0x02be;
                case -933872740: goto L_0x02b3;
                case -538363189: goto L_0x02a8;
                case -538363109: goto L_0x029d;
                case -425012669: goto L_0x0291;
                case -356037306: goto L_0x0285;
                case 62923557: goto L_0x0279;
                case 62923603: goto L_0x026d;
                case 62927045: goto L_0x0261;
                case 82318131: goto L_0x0256;
                case 82338133: goto L_0x024b;
                case 82338134: goto L_0x0240;
                case 99146302: goto L_0x0234;
                case 444813526: goto L_0x0228;
                case 542569478: goto L_0x021c;
                case 635596514: goto L_0x0210;
                case 725948237: goto L_0x0204;
                case 725957860: goto L_0x01f8;
                case 738597099: goto L_0x01ec;
                case 855502857: goto L_0x01e2;
                case 1045209816: goto L_0x01d6;
                case 1422270023: goto L_0x01ca;
                case 1809237540: goto L_0x01bf;
                case 1950749482: goto L_0x01b3;
                case 1950789798: goto L_0x01a7;
                case 1951062397: goto L_0x019d;
                default: goto L_0x019b;
            }
        L_0x019b:
            goto L_0x0314
        L_0x019d:
            boolean r2 = r5.equals(r3)
            if (r2 == 0) goto L_0x0314
            r2 = 11
            goto L_0x0315
        L_0x01a7:
            java.lang.String r2 = "A_FLAC"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0314
            r2 = 22
            goto L_0x0315
        L_0x01b3:
            java.lang.String r2 = "A_EAC3"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0314
            r2 = 17
            goto L_0x0315
        L_0x01bf:
            java.lang.String r2 = "V_MPEG2"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0314
            r2 = 3
            goto L_0x0315
        L_0x01ca:
            java.lang.String r2 = "S_TEXT/UTF8"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0314
            r2 = 27
            goto L_0x0315
        L_0x01d6:
            java.lang.String r2 = "S_TEXT/WEBVTT"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0314
            r2 = 29
            goto L_0x0315
        L_0x01e2:
            java.lang.String r3 = "V_MPEGH/ISO/HEVC"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L_0x0314
            goto L_0x0315
        L_0x01ec:
            java.lang.String r2 = "S_TEXT/ASS"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0314
            r2 = 28
            goto L_0x0315
        L_0x01f8:
            java.lang.String r2 = "A_PCM/INT/LIT"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0314
            r2 = 24
            goto L_0x0315
        L_0x0204:
            java.lang.String r2 = "A_PCM/INT/BIG"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0314
            r2 = 25
            goto L_0x0315
        L_0x0210:
            java.lang.String r2 = "A_PCM/FLOAT/IEEE"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0314
            r2 = 26
            goto L_0x0315
        L_0x021c:
            java.lang.String r2 = "A_DTS/EXPRESS"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0314
            r2 = 20
            goto L_0x0315
        L_0x0228:
            java.lang.String r2 = "V_THEORA"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0314
            r2 = 10
            goto L_0x0315
        L_0x0234:
            java.lang.String r2 = "S_HDMV/PGS"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0314
            r2 = 31
            goto L_0x0315
        L_0x0240:
            java.lang.String r2 = "V_VP9"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0314
            r2 = 1
            goto L_0x0315
        L_0x024b:
            java.lang.String r2 = "V_VP8"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0314
            r2 = 0
            goto L_0x0315
        L_0x0256:
            java.lang.String r2 = "V_AV1"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0314
            r2 = 2
            goto L_0x0315
        L_0x0261:
            java.lang.String r2 = "A_DTS"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0314
            r2 = 19
            goto L_0x0315
        L_0x026d:
            java.lang.String r2 = "A_AC3"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0314
            r2 = 16
            goto L_0x0315
        L_0x0279:
            java.lang.String r2 = "A_AAC"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0314
            r2 = 13
            goto L_0x0315
        L_0x0285:
            java.lang.String r2 = "A_DTS/LOSSLESS"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0314
            r2 = 21
            goto L_0x0315
        L_0x0291:
            java.lang.String r2 = "S_VOBSUB"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0314
            r2 = 30
            goto L_0x0315
        L_0x029d:
            java.lang.String r2 = "V_MPEG4/ISO/AVC"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0314
            r2 = 7
            goto L_0x0315
        L_0x02a8:
            java.lang.String r2 = "V_MPEG4/ISO/ASP"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0314
            r2 = 5
            goto L_0x0315
        L_0x02b3:
            java.lang.String r2 = "S_DVBSUB"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0314
            r2 = 32
            goto L_0x0315
        L_0x02be:
            java.lang.String r2 = "V_MS/VFW/FOURCC"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0314
            r2 = 9
            goto L_0x0315
        L_0x02c9:
            java.lang.String r2 = "A_MPEG/L3"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0314
            r2 = 15
            goto L_0x0315
        L_0x02d4:
            java.lang.String r2 = "A_MPEG/L2"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0314
            r2 = 14
            goto L_0x0315
        L_0x02df:
            java.lang.String r2 = "A_VORBIS"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0314
            r2 = 12
            goto L_0x0315
        L_0x02ea:
            java.lang.String r2 = "A_TRUEHD"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0314
            r2 = 18
            goto L_0x0315
        L_0x02f5:
            java.lang.String r2 = "A_MS/ACM"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0314
            r2 = 23
            goto L_0x0315
        L_0x0300:
            java.lang.String r2 = "V_MPEG4/ISO/SP"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0314
            r2 = 4
            goto L_0x0315
        L_0x030a:
            java.lang.String r2 = "V_MPEG4/ISO/AP"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0314
            r2 = 6
            goto L_0x0315
        L_0x0314:
            r2 = -1
        L_0x0315:
            switch(r2) {
                case 0: goto L_0x031a;
                case 1: goto L_0x031a;
                case 2: goto L_0x031a;
                case 3: goto L_0x031a;
                case 4: goto L_0x031a;
                case 5: goto L_0x031a;
                case 6: goto L_0x031a;
                case 7: goto L_0x031a;
                case 8: goto L_0x031a;
                case 9: goto L_0x031a;
                case 10: goto L_0x031a;
                case 11: goto L_0x031a;
                case 12: goto L_0x031a;
                case 13: goto L_0x031a;
                case 14: goto L_0x031a;
                case 15: goto L_0x031a;
                case 16: goto L_0x031a;
                case 17: goto L_0x031a;
                case 18: goto L_0x031a;
                case 19: goto L_0x031a;
                case 20: goto L_0x031a;
                case 21: goto L_0x031a;
                case 22: goto L_0x031a;
                case 23: goto L_0x031a;
                case 24: goto L_0x031a;
                case 25: goto L_0x031a;
                case 26: goto L_0x031a;
                case 27: goto L_0x031a;
                case 28: goto L_0x031a;
                case 29: goto L_0x031a;
                case 30: goto L_0x031a;
                case 31: goto L_0x031a;
                case 32: goto L_0x031a;
                default: goto L_0x0318;
            }
        L_0x0318:
            r0 = 0
            goto L_0x0329
        L_0x031a:
            com.google.android.gms.internal.ads.tn4 r1 = r7.f14852b0
            int r2 = r0.f13801c
            r0.mo12510e(r1, r2)
            android.util.SparseArray r1 = r7.f14853c
            int r2 = r0.f13801c
            r1.put(r2, r0)
            goto L_0x0318
        L_0x0329:
            r7.f14871u = r0
            return
        L_0x032c:
            r0 = 0
            java.lang.String r1 = "CodecId is missing in TrackEntry element"
            com.google.android.gms.internal.ads.ea0 r0 = com.google.android.gms.internal.ads.ea0.m11990a(r1, r0)
            throw r0
        L_0x0334:
            int r0 = r7.f14829G
            if (r0 == r4) goto L_0x0339
            return
        L_0x0339:
            android.util.SparseArray r0 = r7.f14853c
            int r1 = r7.f14835M
            java.lang.Object r0 = r0.get(r1)
            r8 = r0
            com.google.android.gms.internal.ads.n3 r8 = (com.google.android.gms.internal.ads.C2647n3) r8
            java.util.Objects.requireNonNull(r8.f13797X)
            long r0 = r7.f14840R
            int r4 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x036f
            java.lang.String r0 = r8.f13800b
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x036f
            com.google.android.gms.internal.ads.y22 r0 = r7.f14864n
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r2)
            java.nio.ByteOrder r2 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r1 = r1.order(r2)
            long r2 = r7.f14840R
            java.nio.ByteBuffer r1 = r1.putLong(r2)
            byte[] r1 = r1.array()
            int r2 = r1.length
            r0.mo15291d(r1, r2)
        L_0x036f:
            r0 = 0
            r4 = 0
        L_0x0371:
            int r1 = r7.f14833K
            if (r4 >= r1) goto L_0x037d
            int[] r1 = r7.f14834L
            r1 = r1[r4]
            int r0 = r0 + r1
            int r4 = r4 + 1
            goto L_0x0371
        L_0x037d:
            r4 = 0
        L_0x037e:
            int r1 = r7.f14833K
            if (r4 >= r1) goto L_0x03ae
            long r1 = r7.f14830H
            int r3 = r8.f13803e
            int r3 = r3 * r4
            int r3 = r3 / 1000
            long r5 = (long) r3
            long r2 = r1 + r5
            int r1 = r7.f14837O
            if (r4 != 0) goto L_0x039a
            boolean r4 = r7.f14839Q
            if (r4 != 0) goto L_0x0397
            r1 = r1 | 1
        L_0x0397:
            r4 = r1
            r9 = 0
            goto L_0x039c
        L_0x039a:
            r9 = r4
            r4 = r1
        L_0x039c:
            int[] r1 = r7.f14834L
            r5 = r1[r9]
            int r10 = r0 - r5
            r0 = r21
            r1 = r8
            r6 = r10
            r0.m17451u(r1, r2, r4, r5, r6)
            r0 = 1
            int r4 = r9 + 1
            r0 = r10
            goto L_0x037e
        L_0x03ae:
            r1 = 0
            r7.f14829G = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2684o3.mo12807h(int):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo12808i(int i, double d) throws ea0 {
        if (i == 181) {
            m17450t(i);
            this.f14871u.f13790Q = (int) d;
        } else if (i != 17545) {
            switch (i) {
                case 21969:
                    m17450t(i);
                    this.f14871u.f13777D = (float) d;
                    return;
                case 21970:
                    m17450t(i);
                    this.f14871u.f13778E = (float) d;
                    return;
                case 21971:
                    m17450t(i);
                    this.f14871u.f13779F = (float) d;
                    return;
                case 21972:
                    m17450t(i);
                    this.f14871u.f13780G = (float) d;
                    return;
                case 21973:
                    m17450t(i);
                    this.f14871u.f13781H = (float) d;
                    return;
                case 21974:
                    m17450t(i);
                    this.f14871u.f13782I = (float) d;
                    return;
                case 21975:
                    m17450t(i);
                    this.f14871u.f13783J = (float) d;
                    return;
                case 21976:
                    m17450t(i);
                    this.f14871u.f13784K = (float) d;
                    return;
                case 21977:
                    m17450t(i);
                    this.f14871u.f13785L = (float) d;
                    return;
                case 21978:
                    m17450t(i);
                    this.f14871u.f13786M = (float) d;
                    return;
                default:
                    switch (i) {
                        case 30323:
                            m17450t(i);
                            this.f14871u.f13817s = (float) d;
                            return;
                        case 30324:
                            m17450t(i);
                            this.f14871u.f13818t = (float) d;
                            return;
                        case 30325:
                            m17450t(i);
                            this.f14871u.f13819u = (float) d;
                            return;
                        default:
                            return;
                    }
            }
        } else {
            this.f14869s = (long) d;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo12809j(int i, long j) throws ea0 {
        if (i != 20529) {
            if (i != 20530) {
                boolean z = false;
                switch (i) {
                    case 131:
                        m17450t(i);
                        this.f14871u.f13802d = (int) j;
                        return;
                    case 136:
                        m17450t(i);
                        C2647n3 n3Var = this.f14871u;
                        if (j == 1) {
                            z = true;
                        }
                        n3Var.f13795V = z;
                        return;
                    case 155:
                        this.f14831I = m17448r(j);
                        return;
                    case 159:
                        m17450t(i);
                        this.f14871u.f13788O = (int) j;
                        return;
                    case 176:
                        m17450t(i);
                        this.f14871u.f13811m = (int) j;
                        return;
                    case 179:
                        m17449s(i);
                        this.f14825C.mo13383c(m17448r(j));
                        return;
                    case 186:
                        m17450t(i);
                        this.f14871u.f13812n = (int) j;
                        return;
                    case 215:
                        m17450t(i);
                        this.f14871u.f13801c = (int) j;
                        return;
                    case 231:
                        this.f14824B = m17448r(j);
                        return;
                    case 238:
                        this.f14838P = (int) j;
                        return;
                    case 241:
                        if (!this.f14827E) {
                            m17449s(i);
                            this.f14826D.mo13383c(j);
                            this.f14827E = true;
                            return;
                        }
                        return;
                    case 251:
                        this.f14839Q = true;
                        return;
                    case 16871:
                        m17450t(i);
                        this.f14871u.f13805g = (int) j;
                        return;
                    case 16980:
                        if (j != 3) {
                            throw ea0.m11990a("ContentCompAlgo " + j + " not supported", (Throwable) null);
                        }
                        return;
                    case 17029:
                        if (j < 1 || j > 2) {
                            throw ea0.m11990a("DocTypeReadVersion " + j + " not supported", (Throwable) null);
                        }
                        return;
                    case 17143:
                        if (j != 1) {
                            throw ea0.m11990a("EBMLReadVersion " + j + " not supported", (Throwable) null);
                        }
                        return;
                    case 18401:
                        if (j != 5) {
                            throw ea0.m11990a("ContentEncAlgo " + j + " not supported", (Throwable) null);
                        }
                        return;
                    case 18408:
                        if (j != 1) {
                            throw ea0.m11990a("AESSettingsCipherMode " + j + " not supported", (Throwable) null);
                        }
                        return;
                    case 21420:
                        this.f14874x = j + this.f14867q;
                        return;
                    case 21432:
                        m17450t(i);
                        int i2 = (int) j;
                        if (i2 == 0) {
                            this.f14871u.f13821w = 0;
                            return;
                        } else if (i2 == 1) {
                            this.f14871u.f13821w = 2;
                            return;
                        } else if (i2 == 3) {
                            this.f14871u.f13821w = 1;
                            return;
                        } else if (i2 == 15) {
                            this.f14871u.f13821w = 3;
                            return;
                        } else {
                            return;
                        }
                    case 21680:
                        m17450t(i);
                        this.f14871u.f13813o = (int) j;
                        return;
                    case 21682:
                        m17450t(i);
                        this.f14871u.f13815q = (int) j;
                        return;
                    case 21690:
                        m17450t(i);
                        this.f14871u.f13814p = (int) j;
                        return;
                    case 21930:
                        m17450t(i);
                        C2647n3 n3Var2 = this.f14871u;
                        if (j == 1) {
                            z = true;
                        }
                        n3Var2.f13794U = z;
                        return;
                    case 21998:
                        m17450t(i);
                        this.f14871u.f13804f = (int) j;
                        return;
                    case 22186:
                        m17450t(i);
                        this.f14871u.f13791R = j;
                        return;
                    case 22203:
                        m17450t(i);
                        this.f14871u.f13792S = j;
                        return;
                    case 25188:
                        m17450t(i);
                        this.f14871u.f13789P = (int) j;
                        return;
                    case 30114:
                        this.f14840R = j;
                        return;
                    case 30321:
                        m17450t(i);
                        int i3 = (int) j;
                        if (i3 == 0) {
                            this.f14871u.f13816r = 0;
                            return;
                        } else if (i3 == 1) {
                            this.f14871u.f13816r = 1;
                            return;
                        } else if (i3 == 2) {
                            this.f14871u.f13816r = 2;
                            return;
                        } else if (i3 == 3) {
                            this.f14871u.f13816r = 3;
                            return;
                        } else {
                            return;
                        }
                    case 2352003:
                        m17450t(i);
                        this.f14871u.f13803e = (int) j;
                        return;
                    case 2807729:
                        this.f14868r = j;
                        return;
                    default:
                        switch (i) {
                            case 21945:
                                m17450t(i);
                                int i4 = (int) j;
                                if (i4 == 1) {
                                    this.f14871u.f13774A = 2;
                                    return;
                                } else if (i4 == 2) {
                                    this.f14871u.f13774A = 1;
                                    return;
                                } else {
                                    return;
                                }
                            case 21946:
                                m17450t(i);
                                int b = be4.m10334b((int) j);
                                if (b != -1) {
                                    this.f14871u.f13824z = b;
                                    return;
                                }
                                return;
                            case 21947:
                                m17450t(i);
                                C2647n3 n3Var3 = this.f14871u;
                                n3Var3.f13822x = true;
                                int a = be4.m10333a((int) j);
                                if (a != -1) {
                                    n3Var3.f13823y = a;
                                    return;
                                }
                                return;
                            case 21948:
                                m17450t(i);
                                this.f14871u.f13775B = (int) j;
                                return;
                            case 21949:
                                m17450t(i);
                                this.f14871u.f13776C = (int) j;
                                return;
                            default:
                                return;
                        }
                }
            } else if (j != 1) {
                throw ea0.m11990a("ContentEncodingScope " + j + " not supported", (Throwable) null);
            }
        } else if (j != 0) {
            throw ea0.m11990a("ContentEncodingOrder " + j + " not supported", (Throwable) null);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo12810k(int i, long j, long j2) throws ea0 {
        v91.m22048b(this.f14852b0);
        if (i == 160) {
            this.f14839Q = false;
            this.f14840R = 0;
        } else if (i == 174) {
            this.f14871u = new C2647n3();
        } else if (i == 187) {
            this.f14827E = false;
        } else if (i == 19899) {
            this.f14873w = -1;
            this.f14874x = -1;
        } else if (i == 20533) {
            m17450t(i);
            this.f14871u.f13806h = true;
        } else if (i == 21968) {
            m17450t(i);
            this.f14871u.f13822x = true;
        } else if (i == 408125543) {
            long j3 = this.f14867q;
            if (j3 == -1 || j3 == j) {
                this.f14867q = j;
                this.f14866p = j2;
                return;
            }
            throw ea0.m11990a("Multiple Segment elements not supported", (Throwable) null);
        } else if (i == 475249515) {
            this.f14825C = new pu1(32);
            this.f14826D = new pu1(32);
        } else if (i != 524531317 || this.f14872v) {
        } else {
            if (!this.f14854d || this.f14876z == -1) {
                this.f14852b0.mo10059j(new C2606m(this.f14870t, 0));
                this.f14872v = true;
                return;
            }
            this.f14875y = true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo12811l(int i, String str) throws ea0 {
        if (i == 134) {
            m17450t(i);
            this.f14871u.f13800b = str;
        } else if (i != 17026) {
            if (i == 21358) {
                m17450t(i);
                this.f14871u.f13799a = str;
            } else if (i == 2274716) {
                m17450t(i);
                this.f14871u.f13796W = str;
            }
        } else if (!"webm".equals(str) && !"matroska".equals(str)) {
            throw ea0.m11990a("DocType " + str + " not supported", (Throwable) null);
        }
    }
}
