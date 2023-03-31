package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import com.startapp.C8843b4;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;

/* renamed from: com.google.android.gms.internal.ads.ol */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2702ol implements C2961vk {

    /* renamed from: Z */
    public static final C3072yk f15180Z = new C2517jl();

    /* renamed from: a0 */
    private static final byte[] f15181a0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: b0 */
    private static final byte[] f15182b0 = {32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32};
    /* access modifiers changed from: private */

    /* renamed from: c0 */
    public static final UUID f15183c0 = new UUID(72057594037932032L, -9223371306706625679L);

    /* renamed from: A */
    private C2447hq f15184A;

    /* renamed from: B */
    private C2447hq f15185B;

    /* renamed from: C */
    private boolean f15186C;

    /* renamed from: D */
    private int f15187D;

    /* renamed from: E */
    private long f15188E;

    /* renamed from: F */
    private long f15189F;

    /* renamed from: G */
    private int f15190G;

    /* renamed from: H */
    private int f15191H;

    /* renamed from: I */
    private int[] f15192I;

    /* renamed from: J */
    private int f15193J;

    /* renamed from: K */
    private int f15194K;

    /* renamed from: L */
    private int f15195L;

    /* renamed from: M */
    private int f15196M;

    /* renamed from: N */
    private boolean f15197N;

    /* renamed from: O */
    private boolean f15198O;

    /* renamed from: P */
    private boolean f15199P;

    /* renamed from: Q */
    private boolean f15200Q;

    /* renamed from: R */
    private byte f15201R;

    /* renamed from: S */
    private int f15202S;

    /* renamed from: T */
    private int f15203T;

    /* renamed from: U */
    private int f15204U;

    /* renamed from: V */
    private boolean f15205V;

    /* renamed from: W */
    private boolean f15206W;

    /* renamed from: X */
    private C3035xk f15207X;

    /* renamed from: Y */
    private final C2480il f15208Y;

    /* renamed from: a */
    private final C2777ql f15209a;

    /* renamed from: b */
    private final SparseArray f15210b;

    /* renamed from: c */
    private final boolean f15211c;

    /* renamed from: d */
    private final C2633mq f15212d;

    /* renamed from: e */
    private final C2633mq f15213e;

    /* renamed from: f */
    private final C2633mq f15214f;

    /* renamed from: g */
    private final C2633mq f15215g;

    /* renamed from: h */
    private final C2633mq f15216h;

    /* renamed from: i */
    private final C2633mq f15217i;

    /* renamed from: j */
    private final C2633mq f15218j;

    /* renamed from: k */
    private final C2633mq f15219k;

    /* renamed from: l */
    private final C2633mq f15220l;

    /* renamed from: m */
    private ByteBuffer f15221m;

    /* renamed from: n */
    private long f15222n;

    /* renamed from: o */
    private long f15223o = -1;

    /* renamed from: p */
    private long f15224p = -9223372036854775807L;

    /* renamed from: q */
    private long f15225q = -9223372036854775807L;

    /* renamed from: r */
    private long f15226r = -9223372036854775807L;

    /* renamed from: s */
    private C2665nl f15227s;

    /* renamed from: t */
    private boolean f15228t;

    /* renamed from: u */
    private int f15229u;

    /* renamed from: v */
    private long f15230v;

    /* renamed from: w */
    private boolean f15231w;

    /* renamed from: x */
    private long f15232x = -1;

    /* renamed from: y */
    private long f15233y = -1;

    /* renamed from: z */
    private long f15234z = -9223372036854775807L;

    public C2702ol(int i) {
        C2480il ilVar = new C2480il();
        this.f15208Y = ilVar;
        ilVar.mo11149b(new C2591ll(this, (C2554kl) null));
        this.f15211c = true;
        this.f15209a = new C2777ql();
        this.f15210b = new SparseArray();
        this.f15214f = new C2633mq(4);
        this.f15215g = new C2633mq(ByteBuffer.allocate(4).putInt(-1).array());
        this.f15216h = new C2633mq(4);
        this.f15212d = new C2633mq(C2559kq.f12213a);
        this.f15213e = new C2633mq(4);
        this.f15217i = new C2633mq();
        this.f15218j = new C2633mq();
        this.f15219k = new C2633mq(8);
        this.f15220l = new C2633mq();
    }

    /* renamed from: l */
    static final int m17914l(int i) {
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
            case 241:
            case 251:
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
            case 22186:
            case 22203:
            case 25188:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case 17026:
            case 2274716:
                return 3;
            case 160:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
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
                return 5;
            default:
                return 0;
        }
    }

    /* renamed from: m */
    static final boolean m17915m(int i) {
        return i == 357149030 || i == 524531317 || i == 475249515 || i == 374648427;
    }

    /* renamed from: n */
    private final long m17916n(long j) throws C2885ti {
        long j2 = this.f15224p;
        if (j2 != -9223372036854775807L) {
            return C2893tq.m21179j(j, j2, 1000);
        }
        throw new C2885ti("Can't scale timecode prior to timecodeScale being set.");
    }

    /* renamed from: o */
    private final void m17917o(C2665nl nlVar, long j) {
        byte[] bArr;
        if ("S_TEXT/UTF8".equals(nlVar.f14075a)) {
            byte[] bArr2 = this.f15218j.f13448a;
            long j2 = this.f15189F;
            if (j2 == -9223372036854775807L) {
                bArr = f15182b0;
            } else {
                int i = (int) (j2 / 3600000000L);
                long j3 = j2 - (((long) i) * 3600000000L);
                int i2 = (int) (j3 / 60000000);
                long j4 = j3 - ((long) (60000000 * i2));
                int i3 = (int) (j4 / 1000000);
                bArr = C2893tq.m21186q(String.format(Locale.US, "%02d:%02d:%02d,%03d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - ((long) (i3 * 1000000))) / 1000))}));
            }
            System.arraycopy(bArr, 0, bArr2, 19, 12);
            C2368fl flVar = nlVar.f14073O;
            C2633mq mqVar = this.f15218j;
            flVar.mo10174d(mqVar, mqVar.mo12393d());
            this.f15204U += this.f15218j.mo12393d();
        }
        nlVar.f14073O.mo10173c(j, this.f15195L, this.f15204U, 0, nlVar.f14081g);
        this.f15205V = true;
        m17918p();
    }

    /* renamed from: p */
    private final void m17918p() {
        this.f15196M = 0;
        this.f15204U = 0;
        this.f15203T = 0;
        this.f15197N = false;
        this.f15198O = false;
        this.f15200Q = false;
        this.f15202S = 0;
        this.f15201R = 0;
        this.f15199P = false;
        this.f15217i.mo12407r();
    }

    /* renamed from: q */
    private static int[] m17919q(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        int length = iArr.length;
        return length >= i ? iArr : new int[Math.max(length + length, i)];
    }

    /* renamed from: r */
    private final int m17920r(C2924uk ukVar, C2368fl flVar, int i) throws IOException, InterruptedException {
        int i2;
        int a = this.f15217i.mo12390a();
        if (a > 0) {
            i2 = Math.min(i, a);
            flVar.mo10174d(this.f15217i, i2);
        } else {
            i2 = flVar.mo10171a(ukVar, i, false);
        }
        this.f15196M += i2;
        this.f15204U += i2;
        return i2;
    }

    /* renamed from: s */
    private final void m17921s(C2924uk ukVar, int i) throws IOException, InterruptedException {
        if (this.f15214f.mo12393d() < i) {
            if (this.f15214f.mo12391b() < i) {
                C2633mq mqVar = this.f15214f;
                byte[] bArr = mqVar.f13448a;
                int length = bArr.length;
                mqVar.mo12409t(Arrays.copyOf(bArr, Math.max(length + length, i)), this.f15214f.mo12393d());
            }
            C2633mq mqVar2 = this.f15214f;
            ukVar.mo14528h(mqVar2.f13448a, mqVar2.mo12393d(), i - this.f15214f.mo12393d(), false);
            this.f15214f.mo12410u(i);
        }
    }

    /* renamed from: t */
    private final void m17922t(C2924uk ukVar, C2665nl nlVar, int i) throws IOException, InterruptedException {
        int i2;
        if ("S_TEXT/UTF8".equals(nlVar.f14075a)) {
            int i3 = i + 32;
            if (this.f15218j.mo12391b() < i3) {
                this.f15218j.f13448a = Arrays.copyOf(f15181a0, i3 + i);
            }
            ukVar.mo14528h(this.f15218j.f13448a, 32, i, false);
            this.f15218j.mo12411v(0);
            this.f15218j.mo12410u(i3);
            return;
        }
        C2368fl flVar = nlVar.f14073O;
        if (!this.f15197N) {
            if (nlVar.f14079e) {
                this.f15195L &= -1073741825;
                int i4 = 128;
                if (!this.f15198O) {
                    ukVar.mo14528h(this.f15214f.f13448a, 0, 1, false);
                    this.f15196M++;
                    byte b = this.f15214f.f13448a[0];
                    if ((b & C8843b4.f36445d) != 128) {
                        this.f15201R = b;
                        this.f15198O = true;
                    } else {
                        throw new C2885ti("Extension bit is set in signal byte");
                    }
                }
                byte b2 = this.f15201R;
                if ((b2 & 1) == 1) {
                    byte b3 = b2 & 2;
                    this.f15195L |= 1073741824;
                    if (!this.f15199P) {
                        ukVar.mo14528h(this.f15219k.f13448a, 0, 8, false);
                        this.f15196M += 8;
                        this.f15199P = true;
                        C2633mq mqVar = this.f15214f;
                        byte[] bArr = mqVar.f13448a;
                        if (b3 != 2) {
                            i4 = 0;
                        }
                        bArr[0] = (byte) (i4 | 8);
                        mqVar.mo12411v(0);
                        flVar.mo10174d(this.f15214f, 1);
                        this.f15204U++;
                        this.f15219k.mo12411v(0);
                        flVar.mo10174d(this.f15219k, 8);
                        this.f15204U += 8;
                    }
                    if (b3 == 2) {
                        if (!this.f15200Q) {
                            ukVar.mo14528h(this.f15214f.f13448a, 0, 1, false);
                            this.f15196M++;
                            this.f15214f.mo12411v(0);
                            this.f15202S = this.f15214f.mo12396g();
                            this.f15200Q = true;
                        }
                        int i5 = this.f15202S * 4;
                        this.f15214f.mo12408s(i5);
                        ukVar.mo14528h(this.f15214f.f13448a, 0, i5, false);
                        this.f15196M += i5;
                        int i6 = (this.f15202S >> 1) + 1;
                        int i7 = (i6 * 6) + 2;
                        ByteBuffer byteBuffer = this.f15221m;
                        if (byteBuffer == null || byteBuffer.capacity() < i7) {
                            this.f15221m = ByteBuffer.allocate(i7);
                        }
                        this.f15221m.position(0);
                        this.f15221m.putShort((short) i6);
                        int i8 = 0;
                        int i9 = 0;
                        while (true) {
                            i2 = this.f15202S;
                            if (i8 >= i2) {
                                break;
                            }
                            int i10 = this.f15214f.mo12398i();
                            if (i8 % 2 == 0) {
                                this.f15221m.putShort((short) (i10 - i9));
                            } else {
                                this.f15221m.putInt(i10 - i9);
                            }
                            i8++;
                            i9 = i10;
                        }
                        int i11 = (i - this.f15196M) - i9;
                        if ((i2 & 1) == 1) {
                            this.f15221m.putInt(i11);
                        } else {
                            this.f15221m.putShort((short) i11);
                            this.f15221m.putInt(0);
                        }
                        this.f15220l.mo12409t(this.f15221m.array(), i7);
                        flVar.mo10174d(this.f15220l, i7);
                        this.f15204U += i7;
                    }
                }
            } else {
                byte[] bArr2 = nlVar.f14080f;
                if (bArr2 != null) {
                    this.f15217i.mo12409t(bArr2, bArr2.length);
                }
            }
            this.f15197N = true;
        }
        int d = i + this.f15217i.mo12393d();
        if (!"V_MPEG4/ISO/AVC".equals(nlVar.f14075a) && !"V_MPEGH/ISO/HEVC".equals(nlVar.f14075a)) {
            while (true) {
                int i12 = this.f15196M;
                if (i12 >= d) {
                    break;
                }
                m17920r(ukVar, flVar, d - i12);
            }
        } else {
            byte[] bArr3 = this.f15213e.f13448a;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[2] = 0;
            int i13 = nlVar.f14074P;
            int i14 = 4 - i13;
            while (this.f15196M < d) {
                int i15 = this.f15203T;
                if (i15 == 0) {
                    int min = Math.min(i13, this.f15217i.mo12390a());
                    ukVar.mo14528h(bArr3, i14 + min, i13 - min, false);
                    if (min > 0) {
                        this.f15217i.mo12406q(bArr3, i14, min);
                    }
                    this.f15196M += i13;
                    this.f15213e.mo12411v(0);
                    this.f15203T = this.f15213e.mo12398i();
                    this.f15212d.mo12411v(0);
                    flVar.mo10174d(this.f15212d, 4);
                    this.f15204U += 4;
                } else {
                    this.f15203T = i15 - m17920r(ukVar, flVar, i15);
                }
            }
        }
        if ("A_VORBIS".equals(nlVar.f14075a)) {
            this.f15215g.mo12411v(0);
            flVar.mo10174d(this.f15215g, 4);
            this.f15204U += 4;
        }
    }

    /* renamed from: a */
    public final int mo10567a(C2924uk ukVar, C2219bl blVar) throws IOException, InterruptedException {
        this.f15205V = false;
        while (!this.f15205V) {
            if (!this.f15208Y.mo11150c(ukVar)) {
                return -1;
            }
            long d = ukVar.mo14524d();
            if (this.f15231w) {
                this.f15233y = d;
                blVar.f7339a = this.f15232x;
                this.f15231w = false;
                return 1;
            } else if (this.f15228t) {
                long j = this.f15233y;
                if (j != -1) {
                    blVar.f7339a = j;
                    this.f15233y = -1;
                    return 1;
                }
            }
        }
        return 0;
    }

    /* renamed from: b */
    public final boolean mo10568b(C2924uk ukVar) throws IOException, InterruptedException {
        return new C2740pl().mo13295a(ukVar);
    }

    /* renamed from: d */
    public final void mo10569d(long j, long j2) {
        this.f15234z = -9223372036854775807L;
        this.f15187D = 0;
        this.f15208Y.mo11148a();
        this.f15209a.mo13557d();
        m17918p();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo12966e(int i) throws C2885ti {
        C2293dl dlVar;
        C2447hq hqVar;
        C2447hq hqVar2;
        int i2;
        int i3 = 0;
        if (i != 160) {
            if (i == 174) {
                String str = this.f15227s.f14075a;
                if ("V_VP8".equals(str) || "V_VP9".equals(str) || "V_MPEG2".equals(str) || "V_MPEG4/ISO/SP".equals(str) || "V_MPEG4/ISO/ASP".equals(str) || "V_MPEG4/ISO/AP".equals(str) || "V_MPEG4/ISO/AVC".equals(str) || "V_MPEGH/ISO/HEVC".equals(str) || "V_MS/VFW/FOURCC".equals(str) || "V_THEORA".equals(str) || "A_OPUS".equals(str) || "A_VORBIS".equals(str) || "A_AAC".equals(str) || "A_MPEG/L2".equals(str) || "A_MPEG/L3".equals(str) || "A_AC3".equals(str) || "A_EAC3".equals(str) || "A_TRUEHD".equals(str) || "A_DTS".equals(str) || "A_DTS/EXPRESS".equals(str) || "A_DTS/LOSSLESS".equals(str) || "A_FLAC".equals(str) || "A_MS/ACM".equals(str) || "A_PCM/INT/LIT".equals(str) || "S_TEXT/UTF8".equals(str) || "S_VOBSUB".equals(str) || "S_HDMV/PGS".equals(str) || "S_DVBSUB".equals(str)) {
                    C2665nl nlVar = this.f15227s;
                    nlVar.mo12655b(this.f15207X, nlVar.f14076b);
                    SparseArray sparseArray = this.f15210b;
                    C2665nl nlVar2 = this.f15227s;
                    sparseArray.put(nlVar2.f14076b, nlVar2);
                }
                this.f15227s = null;
            } else if (i == 19899) {
                int i4 = this.f15229u;
                if (i4 != -1) {
                    long j = this.f15230v;
                    if (j != -1) {
                        if (i4 == 475249515) {
                            this.f15232x = j;
                            return;
                        }
                        return;
                    }
                }
                throw new C2885ti("Mandatory element SeekID or SeekPosition not found");
            } else if (i == 25152) {
                C2665nl nlVar3 = this.f15227s;
                if (!nlVar3.f14079e) {
                    return;
                }
                if (nlVar3.f14081g != null) {
                    nlVar3.f14083i = new C2813rk(new C2776qk(C2216bi.f7273b, "video/webm", this.f15227s.f14081g.f8840b, false));
                    return;
                }
                throw new C2885ti("Encrypted Track found but ContentEncKeyID was not found");
            } else if (i == 28032) {
                C2665nl nlVar4 = this.f15227s;
                if (nlVar4.f14079e && nlVar4.f14080f != null) {
                    throw new C2885ti("Combining encryption and compression is not supported");
                }
            } else if (i == 357149030) {
                if (this.f15224p == -9223372036854775807L) {
                    this.f15224p = 1000000;
                }
                long j2 = this.f15225q;
                if (j2 != -9223372036854775807L) {
                    this.f15226r = m17916n(j2);
                }
            } else if (i != 374648427) {
                if (i == 475249515 && !this.f15228t) {
                    C3035xk xkVar = this.f15207X;
                    if (this.f15223o == -1 || this.f15226r == -9223372036854775807L || (hqVar = this.f15184A) == null || hqVar.mo10891a() == 0 || (hqVar2 = this.f15185B) == null || hqVar2.mo10891a() != hqVar.mo10891a()) {
                        this.f15184A = null;
                        this.f15185B = null;
                        dlVar = new C2256cl(this.f15226r);
                    } else {
                        int a = hqVar.mo10891a();
                        int[] iArr = new int[a];
                        long[] jArr = new long[a];
                        long[] jArr2 = new long[a];
                        long[] jArr3 = new long[a];
                        for (int i5 = 0; i5 < a; i5++) {
                            jArr3[i5] = this.f15184A.mo10892b(i5);
                            jArr[i5] = this.f15223o + this.f15185B.mo10892b(i5);
                        }
                        while (true) {
                            i2 = a - 1;
                            if (i3 >= i2) {
                                break;
                            }
                            int i6 = i3 + 1;
                            iArr[i3] = (int) (jArr[i6] - jArr[i3]);
                            jArr2[i3] = jArr3[i6] - jArr3[i3];
                            i3 = i6;
                        }
                        iArr[i2] = (int) ((this.f15223o + this.f15222n) - jArr[i2]);
                        jArr2[i2] = this.f15226r - jArr3[i2];
                        this.f15184A = null;
                        this.f15185B = null;
                        dlVar = new C2887tk(iArr, jArr, jArr2, jArr3);
                    }
                    xkVar.mo15101a(dlVar);
                    this.f15228t = true;
                }
            } else if (this.f15210b.size() != 0) {
                this.f15207X.mo15102d();
            } else {
                throw new C2885ti("No valid tracks were found");
            }
        } else if (this.f15187D == 2) {
            if (!this.f15206W) {
                this.f15195L |= 1;
            }
            m17917o((C2665nl) this.f15210b.get(this.f15193J), this.f15188E);
            this.f15187D = 0;
        }
    }

    /* renamed from: f */
    public final void mo10570f(C3035xk xkVar) {
        this.f15207X = xkVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo12967g(int i, double d) {
        if (i == 181) {
            this.f15227s.f14067I = (int) d;
        } else if (i != 17545) {
            switch (i) {
                case 21969:
                    this.f15227s.f14097w = (float) d;
                    return;
                case 21970:
                    this.f15227s.f14098x = (float) d;
                    return;
                case 21971:
                    this.f15227s.f14099y = (float) d;
                    return;
                case 21972:
                    this.f15227s.f14100z = (float) d;
                    return;
                case 21973:
                    this.f15227s.f14059A = (float) d;
                    return;
                case 21974:
                    this.f15227s.f14060B = (float) d;
                    return;
                case 21975:
                    this.f15227s.f14061C = (float) d;
                    return;
                case 21976:
                    this.f15227s.f14062D = (float) d;
                    return;
                case 21977:
                    this.f15227s.f14063E = (float) d;
                    return;
                case 21978:
                    this.f15227s.f14064F = (float) d;
                    return;
                default:
                    return;
            }
        } else {
            this.f15225q = (long) d;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo12968h(int i, long j) throws C2885ti {
        if (i != 20529) {
            if (i != 20530) {
                boolean z = false;
                switch (i) {
                    case 131:
                        this.f15227s.f14077c = (int) j;
                        return;
                    case 136:
                        C2665nl nlVar = this.f15227s;
                        if (j == 1) {
                            z = true;
                        }
                        nlVar.f14070L = z;
                        return;
                    case 155:
                        this.f15189F = m17916n(j);
                        return;
                    case 159:
                        this.f15227s.f14065G = (int) j;
                        return;
                    case 176:
                        this.f15227s.f14084j = (int) j;
                        return;
                    case 179:
                        this.f15184A.mo10893c(m17916n(j));
                        return;
                    case 186:
                        this.f15227s.f14085k = (int) j;
                        return;
                    case 215:
                        this.f15227s.f14076b = (int) j;
                        return;
                    case 231:
                        this.f15234z = m17916n(j);
                        return;
                    case 241:
                        if (!this.f15186C) {
                            this.f15185B.mo10893c(j);
                            this.f15186C = true;
                            return;
                        }
                        return;
                    case 251:
                        this.f15206W = true;
                        return;
                    case 16980:
                        if (j != 3) {
                            throw new C2885ti("ContentCompAlgo " + j + " not supported");
                        }
                        return;
                    case 17029:
                        if (j < 1 || j > 2) {
                            throw new C2885ti("DocTypeReadVersion " + j + " not supported");
                        }
                        return;
                    case 17143:
                        if (j != 1) {
                            throw new C2885ti("EBMLReadVersion " + j + " not supported");
                        }
                        return;
                    case 18401:
                        if (j != 5) {
                            throw new C2885ti("ContentEncAlgo " + j + " not supported");
                        }
                        return;
                    case 18408:
                        if (j != 1) {
                            throw new C2885ti("AESSettingsCipherMode " + j + " not supported");
                        }
                        return;
                    case 21420:
                        this.f15230v = j + this.f15223o;
                        return;
                    case 21432:
                        int i2 = (int) j;
                        if (i2 == 0) {
                            this.f15227s.f14090p = 0;
                            return;
                        } else if (i2 == 1) {
                            this.f15227s.f14090p = 2;
                            return;
                        } else if (i2 == 3) {
                            this.f15227s.f14090p = 1;
                            return;
                        } else if (i2 == 15) {
                            this.f15227s.f14090p = 3;
                            return;
                        } else {
                            return;
                        }
                    case 21680:
                        this.f15227s.f14086l = (int) j;
                        return;
                    case 21682:
                        this.f15227s.f14088n = (int) j;
                        return;
                    case 21690:
                        this.f15227s.f14087m = (int) j;
                        return;
                    case 21930:
                        C2665nl nlVar2 = this.f15227s;
                        if (j == 1) {
                            z = true;
                        }
                        nlVar2.f14071M = z;
                        return;
                    case 22186:
                        this.f15227s.f14068J = j;
                        return;
                    case 22203:
                        this.f15227s.f14069K = j;
                        return;
                    case 25188:
                        this.f15227s.f14066H = (int) j;
                        return;
                    case 2352003:
                        this.f15227s.f14078d = (int) j;
                        return;
                    case 2807729:
                        this.f15224p = j;
                        return;
                    default:
                        switch (i) {
                            case 21945:
                                int i3 = (int) j;
                                if (i3 == 1) {
                                    this.f15227s.f14094t = 2;
                                    return;
                                } else if (i3 == 2) {
                                    this.f15227s.f14094t = 1;
                                    return;
                                } else {
                                    return;
                                }
                            case 21946:
                                int i4 = (int) j;
                                if (i4 != 1) {
                                    if (i4 == 16) {
                                        this.f15227s.f14093s = 6;
                                        return;
                                    } else if (i4 == 18) {
                                        this.f15227s.f14093s = 7;
                                        return;
                                    } else if (!(i4 == 6 || i4 == 7)) {
                                        return;
                                    }
                                }
                                this.f15227s.f14093s = 3;
                                return;
                            case 21947:
                                C2665nl nlVar3 = this.f15227s;
                                nlVar3.f14091q = true;
                                int i5 = (int) j;
                                if (i5 == 1) {
                                    nlVar3.f14092r = 1;
                                    return;
                                } else if (i5 == 9) {
                                    nlVar3.f14092r = 6;
                                    return;
                                } else if (i5 == 4 || i5 == 5 || i5 == 6 || i5 == 7) {
                                    nlVar3.f14092r = 2;
                                    return;
                                } else {
                                    return;
                                }
                            case 21948:
                                this.f15227s.f14095u = (int) j;
                                return;
                            case 21949:
                                this.f15227s.f14096v = (int) j;
                                return;
                            default:
                                return;
                        }
                }
            } else if (j != 1) {
                throw new C2885ti("ContentEncodingScope " + j + " not supported");
            }
        } else if (j != 0) {
            throw new C2885ti("ContentEncodingOrder " + j + " not supported");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo12969i(int i, long j, long j2) throws C2885ti {
        if (i == 160) {
            this.f15206W = false;
        } else if (i == 174) {
            this.f15227s = new C2665nl((C2628ml) null);
        } else if (i == 187) {
            this.f15186C = false;
        } else if (i == 19899) {
            this.f15229u = -1;
            this.f15230v = -1;
        } else if (i == 20533) {
            this.f15227s.f14079e = true;
        } else if (i == 21968) {
            this.f15227s.f14091q = true;
        } else if (i == 408125543) {
            long j3 = this.f15223o;
            if (j3 == -1 || j3 == j) {
                this.f15223o = j;
                this.f15222n = j2;
                return;
            }
            throw new C2885ti("Multiple Segment elements not supported");
        } else if (i == 475249515) {
            this.f15184A = new C2447hq(32);
            this.f15185B = new C2447hq(32);
        } else if (i != 524531317 || this.f15228t) {
        } else {
            if (!this.f15211c || this.f15232x == -1) {
                this.f15207X.mo15101a(new C2256cl(this.f15226r));
                this.f15228t = true;
                return;
            }
            this.f15231w = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo12970j(int i, String str) throws C2885ti {
        if (i == 134) {
            this.f15227s.f14075a = str;
        } else if (i != 17026) {
            if (i == 2274716) {
                this.f15227s.f14072N = str;
            }
        } else if (!"webm".equals(str) && !"matroska".equals(str)) {
            throw new C2885ti("DocType " + str + " not supported");
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01eb, code lost:
        throw new com.google.android.gms.internal.ads.C2885ti("EBML lacing sample size out of range.");
     */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0239  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x023c  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12971k(int r19, int r20, com.google.android.gms.internal.ads.C2924uk r21) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = 161(0xa1, float:2.26E-43)
            r5 = 163(0xa3, float:2.28E-43)
            r6 = 1
            r7 = 0
            if (r1 == r4) goto L_0x0089
            if (r1 == r5) goto L_0x0089
            r4 = 16981(0x4255, float:2.3795E-41)
            if (r1 == r4) goto L_0x007f
            r4 = 18402(0x47e2, float:2.5787E-41)
            if (r1 == r4) goto L_0x0070
            r4 = 21419(0x53ab, float:3.0014E-41)
            if (r1 == r4) goto L_0x0051
            r4 = 25506(0x63a2, float:3.5742E-41)
            if (r1 == r4) goto L_0x0047
            r4 = 30322(0x7672, float:4.249E-41)
            if (r1 != r4) goto L_0x0030
            com.google.android.gms.internal.ads.nl r1 = r0.f15227s
            byte[] r4 = new byte[r2]
            r1.f14089o = r4
            r3.mo14528h(r4, r7, r2, r7)
            return
        L_0x0030:
            com.google.android.gms.internal.ads.ti r2 = new com.google.android.gms.internal.ads.ti
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Unexpected id: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L_0x0047:
            com.google.android.gms.internal.ads.nl r1 = r0.f15227s
            byte[] r4 = new byte[r2]
            r1.f14082h = r4
            r3.mo14528h(r4, r7, r2, r7)
            return
        L_0x0051:
            com.google.android.gms.internal.ads.mq r1 = r0.f15216h
            byte[] r1 = r1.f13448a
            java.util.Arrays.fill(r1, r7)
            com.google.android.gms.internal.ads.mq r1 = r0.f15216h
            byte[] r1 = r1.f13448a
            int r4 = 4 - r2
            r3.mo14528h(r1, r4, r2, r7)
            com.google.android.gms.internal.ads.mq r1 = r0.f15216h
            r1.mo12411v(r7)
            com.google.android.gms.internal.ads.mq r1 = r0.f15216h
            long r1 = r1.mo12402m()
            int r2 = (int) r1
            r0.f15229u = r2
            return
        L_0x0070:
            byte[] r1 = new byte[r2]
            r3.mo14528h(r1, r7, r2, r7)
            com.google.android.gms.internal.ads.nl r2 = r0.f15227s
            com.google.android.gms.internal.ads.el r3 = new com.google.android.gms.internal.ads.el
            r3.<init>(r6, r1)
            r2.f14081g = r3
            return
        L_0x007f:
            com.google.android.gms.internal.ads.nl r1 = r0.f15227s
            byte[] r4 = new byte[r2]
            r1.f14080f = r4
            r3.mo14528h(r4, r7, r2, r7)
            return
        L_0x0089:
            int r4 = r0.f15187D
            r8 = 8
            if (r4 != 0) goto L_0x00ae
            com.google.android.gms.internal.ads.ql r4 = r0.f15209a
            long r9 = r4.mo13558e(r3, r7, r6, r8)
            int r4 = (int) r9
            r0.f15193J = r4
            com.google.android.gms.internal.ads.ql r4 = r0.f15209a
            int r4 = r4.mo13556a()
            r0.f15194K = r4
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.f15189F = r9
            r0.f15187D = r6
            com.google.android.gms.internal.ads.mq r4 = r0.f15214f
            r4.mo12407r()
        L_0x00ae:
            android.util.SparseArray r4 = r0.f15210b
            int r9 = r0.f15193J
            java.lang.Object r4 = r4.get(r9)
            com.google.android.gms.internal.ads.nl r4 = (com.google.android.gms.internal.ads.C2665nl) r4
            if (r4 != 0) goto L_0x00c4
            int r1 = r0.f15194K
            int r1 = r2 - r1
            r3.mo14529i(r1, r7)
            r0.f15187D = r7
            return
        L_0x00c4:
            int r9 = r0.f15187D
            if (r9 != r6) goto L_0x0256
            r9 = 3
            r0.m17921s(r3, r9)
            com.google.android.gms.internal.ads.mq r10 = r0.f15214f
            byte[] r10 = r10.f13448a
            r11 = 2
            byte r10 = r10[r11]
            r10 = r10 & 6
            int r10 = r10 >> r6
            r12 = 255(0xff, float:3.57E-43)
            if (r10 != 0) goto L_0x00ed
            r0.f15191H = r6
            int[] r9 = r0.f15192I
            int[] r9 = m17919q(r9, r6)
            r0.f15192I = r9
            int r10 = r0.f15194K
            int r2 = r2 - r10
            int r2 = r2 + -3
            r9[r7] = r2
            goto L_0x01fd
        L_0x00ed:
            if (r1 != r5) goto L_0x024e
            r13 = 4
            r0.m17921s(r3, r13)
            com.google.android.gms.internal.ads.mq r14 = r0.f15214f
            byte[] r14 = r14.f13448a
            byte r14 = r14[r9]
            r14 = r14 & r12
            int r14 = r14 + r6
            r0.f15191H = r14
            int[] r15 = r0.f15192I
            int[] r14 = m17919q(r15, r14)
            r0.f15192I = r14
            if (r10 != r11) goto L_0x0114
            int r9 = r0.f15194K
            int r10 = r0.f15191H
            int r2 = r2 - r9
            int r2 = r2 + -4
            int r2 = r2 / r10
            java.util.Arrays.fill(r14, r7, r10, r2)
            goto L_0x01fd
        L_0x0114:
            if (r10 != r6) goto L_0x0149
            r9 = 0
            r10 = 0
        L_0x0118:
            int r14 = r0.f15191H
            int r14 = r14 + -1
            if (r9 >= r14) goto L_0x013e
            int[] r14 = r0.f15192I
            r14[r9] = r7
        L_0x0122:
            int r13 = r13 + r6
            r0.m17921s(r3, r13)
            com.google.android.gms.internal.ads.mq r14 = r0.f15214f
            byte[] r14 = r14.f13448a
            int r15 = r13 + -1
            byte r14 = r14[r15]
            r14 = r14 & r12
            int[] r15 = r0.f15192I
            r16 = r15[r9]
            int r16 = r16 + r14
            r15[r9] = r16
            if (r14 == r12) goto L_0x0122
            int r10 = r10 + r16
            int r9 = r9 + 1
            goto L_0x0118
        L_0x013e:
            int[] r9 = r0.f15192I
            int r15 = r0.f15194K
            int r2 = r2 - r15
            int r2 = r2 - r13
            int r2 = r2 - r10
            r9[r14] = r2
            goto L_0x01fd
        L_0x0149:
            if (r10 != r9) goto L_0x0246
            r9 = 0
            r10 = 0
        L_0x014d:
            int r14 = r0.f15191H
            int r14 = r14 + -1
            if (r9 >= r14) goto L_0x01f4
            int[] r14 = r0.f15192I
            r14[r9] = r7
            int r13 = r13 + 1
            r0.m17921s(r3, r13)
            int r14 = r13 + -1
            com.google.android.gms.internal.ads.mq r15 = r0.f15214f
            byte[] r15 = r15.f13448a
            byte r15 = r15[r14]
            if (r15 == 0) goto L_0x01ec
            r15 = 0
        L_0x0167:
            if (r15 >= r8) goto L_0x01bb
            int r16 = 7 - r15
            int r5 = r6 << r16
            com.google.android.gms.internal.ads.mq r11 = r0.f15214f
            byte[] r11 = r11.f13448a
            byte r11 = r11[r14]
            r11 = r11 & r5
            if (r11 == 0) goto L_0x01b0
            int r13 = r13 + r15
            r0.m17921s(r3, r13)
            int r11 = r14 + 1
            com.google.android.gms.internal.ads.mq r6 = r0.f15214f
            byte[] r6 = r6.f13448a
            byte r6 = r6[r14]
            r6 = r6 & r12
            int r5 = ~r5
            r5 = r5 & r6
            long r5 = (long) r5
        L_0x0186:
            if (r11 >= r13) goto L_0x019e
            int r14 = r11 + 1
            long r5 = r5 << r8
            com.google.android.gms.internal.ads.mq r8 = r0.f15214f
            byte[] r8 = r8.f13448a
            byte r8 = r8[r11]
            r8 = r8 & r12
            r17 = r13
            long r12 = (long) r8
            long r5 = r5 | r12
            r11 = r14
            r13 = r17
            r8 = 8
            r12 = 255(0xff, float:3.57E-43)
            goto L_0x0186
        L_0x019e:
            r17 = r13
            if (r9 <= 0) goto L_0x01ad
            r12 = 1
            int r15 = r15 * 7
            int r15 = r15 + 6
            long r12 = r12 << r15
            r14 = -1
            long r12 = r12 + r14
            long r5 = r5 - r12
        L_0x01ad:
            r13 = r17
            goto L_0x01bd
        L_0x01b0:
            int r15 = r15 + 1
            r5 = 163(0xa3, float:2.28E-43)
            r6 = 1
            r8 = 8
            r11 = 2
            r12 = 255(0xff, float:3.57E-43)
            goto L_0x0167
        L_0x01bb:
            r5 = 0
        L_0x01bd:
            r14 = -2147483648(0xffffffff80000000, double:NaN)
            int r8 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r8 < 0) goto L_0x01e4
            r14 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r8 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r8 > 0) goto L_0x01e4
            int r6 = (int) r5
            int[] r5 = r0.f15192I
            if (r9 == 0) goto L_0x01d5
            int r8 = r9 + -1
            r8 = r5[r8]
            int r6 = r6 + r8
        L_0x01d5:
            r5[r9] = r6
            int r10 = r10 + r6
            int r9 = r9 + 1
            r5 = 163(0xa3, float:2.28E-43)
            r6 = 1
            r8 = 8
            r11 = 2
            r12 = 255(0xff, float:3.57E-43)
            goto L_0x014d
        L_0x01e4:
            com.google.android.gms.internal.ads.ti r1 = new com.google.android.gms.internal.ads.ti
            java.lang.String r2 = "EBML lacing sample size out of range."
            r1.<init>(r2)
            throw r1
        L_0x01ec:
            com.google.android.gms.internal.ads.ti r1 = new com.google.android.gms.internal.ads.ti
            java.lang.String r2 = "No valid varint length mask found"
            r1.<init>(r2)
            throw r1
        L_0x01f4:
            int[] r5 = r0.f15192I
            int r6 = r0.f15194K
            int r2 = r2 - r6
            int r2 = r2 - r13
            int r2 = r2 - r10
            r5[r14] = r2
        L_0x01fd:
            com.google.android.gms.internal.ads.mq r2 = r0.f15214f
            byte[] r2 = r2.f13448a
            byte r5 = r2[r7]
            r6 = 1
            byte r2 = r2[r6]
            long r8 = r0.f15234z
            r6 = 8
            int r5 = r5 << r6
            r6 = 255(0xff, float:3.57E-43)
            r2 = r2 & r6
            r2 = r2 | r5
            long r5 = (long) r2
            long r5 = r0.m17916n(r5)
            long r8 = r8 + r5
            r0.f15188E = r8
            com.google.android.gms.internal.ads.mq r2 = r0.f15214f
            byte[] r2 = r2.f13448a
            r5 = 2
            byte r2 = r2[r5]
            r6 = r2 & 8
            int r8 = r4.f14077c
            if (r8 == r5) goto L_0x0234
            r5 = 163(0xa3, float:2.28E-43)
            if (r1 != r5) goto L_0x0232
            r1 = 128(0x80, float:1.794E-43)
            r2 = r2 & r1
            if (r2 != r1) goto L_0x0230
            r1 = 163(0xa3, float:2.28E-43)
            goto L_0x0234
        L_0x0230:
            r1 = 163(0xa3, float:2.28E-43)
        L_0x0232:
            r2 = 0
            goto L_0x0235
        L_0x0234:
            r2 = 1
        L_0x0235:
            r5 = 8
            if (r6 != r5) goto L_0x023c
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x023d
        L_0x023c:
            r5 = 0
        L_0x023d:
            r2 = r2 | r5
            r0.f15195L = r2
            r2 = 2
            r0.f15187D = r2
            r0.f15190G = r7
            goto L_0x0256
        L_0x0246:
            com.google.android.gms.internal.ads.ti r1 = new com.google.android.gms.internal.ads.ti
            java.lang.String r2 = "Unexpected lacing value: 2"
            r1.<init>(r2)
            throw r1
        L_0x024e:
            com.google.android.gms.internal.ads.ti r1 = new com.google.android.gms.internal.ads.ti
            java.lang.String r2 = "Lacing only supported in SimpleBlocks."
            r1.<init>(r2)
            throw r1
        L_0x0256:
            r2 = 163(0xa3, float:2.28E-43)
            if (r1 != r2) goto L_0x0280
        L_0x025a:
            int r1 = r0.f15190G
            int r2 = r0.f15191H
            if (r1 >= r2) goto L_0x027d
            int[] r2 = r0.f15192I
            r1 = r2[r1]
            r0.m17922t(r3, r4, r1)
            long r1 = r0.f15188E
            int r5 = r0.f15190G
            int r6 = r4.f14078d
            int r5 = r5 * r6
            int r5 = r5 / 1000
            long r5 = (long) r5
            long r1 = r1 + r5
            r0.m17917o(r4, r1)
            int r1 = r0.f15190G
            r2 = 1
            int r1 = r1 + r2
            r0.f15190G = r1
            goto L_0x025a
        L_0x027d:
            r0.f15187D = r7
            return
        L_0x0280:
            int[] r1 = r0.f15192I
            r1 = r1[r7]
            r0.m17922t(r3, r4, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2702ol.mo12971k(int, int, com.google.android.gms.internal.ads.uk):void");
    }
}
