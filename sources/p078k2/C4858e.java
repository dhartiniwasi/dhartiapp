package p078k2;

import android.util.Pair;
import android.util.SparseArray;
import com.facebook.ads.AdError;
import com.startapp.C8843b4;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import p030d2.C4035m;
import p037e2.C4190a0;
import p037e2.C4192b0;
import p037e2.C4197d;
import p037e2.C4200e0;
import p037e2.C4203f0;
import p037e2.C4215l;
import p037e2.C4216m;
import p037e2.C4217n;
import p037e2.C4221r;
import p161w3.C5917a;
import p161w3.C5918a0;
import p161w3.C5953m0;
import p161w3.C5961r;
import p161w3.C5964s;
import p161w3.C5970w;
import p167x3.C6053c;
import p177z1.C6227i;
import p177z1.C6249m2;

/* renamed from: k2.e */
/* compiled from: MatroskaExtractor */
public class C4858e implements C4215l {

    /* renamed from: c0 */
    public static final C4221r f25637c0 = C11593d.f44135b;

    /* renamed from: d0 */
    private static final byte[] f25638d0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    /* access modifiers changed from: private */

    /* renamed from: e0 */
    public static final byte[] f25639e0 = C5953m0.m35145m0("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");

    /* renamed from: f0 */
    private static final byte[] f25640f0 = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};

    /* renamed from: g0 */
    private static final byte[] f25641g0 = {87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
    /* access modifiers changed from: private */

    /* renamed from: h0 */
    public static final UUID f25642h0 = new UUID(72057594037932032L, -9223371306706625679L);
    /* access modifiers changed from: private */

    /* renamed from: i0 */
    public static final Map<String, Integer> f25643i0;

    /* renamed from: A */
    private long f25644A;

    /* renamed from: B */
    private long f25645B;

    /* renamed from: C */
    private C5964s f25646C;

    /* renamed from: D */
    private C5964s f25647D;

    /* renamed from: E */
    private boolean f25648E;

    /* renamed from: F */
    private boolean f25649F;

    /* renamed from: G */
    private int f25650G;

    /* renamed from: H */
    private long f25651H;

    /* renamed from: I */
    private long f25652I;

    /* renamed from: J */
    private int f25653J;

    /* renamed from: K */
    private int f25654K;

    /* renamed from: L */
    private int[] f25655L;

    /* renamed from: M */
    private int f25656M;

    /* renamed from: N */
    private int f25657N;

    /* renamed from: O */
    private int f25658O;

    /* renamed from: P */
    private int f25659P;

    /* renamed from: Q */
    private boolean f25660Q;

    /* renamed from: R */
    private long f25661R;

    /* renamed from: S */
    private int f25662S;

    /* renamed from: T */
    private int f25663T;

    /* renamed from: U */
    private int f25664U;

    /* renamed from: V */
    private boolean f25665V;

    /* renamed from: W */
    private boolean f25666W;

    /* renamed from: X */
    private boolean f25667X;

    /* renamed from: Y */
    private int f25668Y;

    /* renamed from: Z */
    private byte f25669Z;

    /* renamed from: a */
    private final C4857c f25670a;

    /* renamed from: a0 */
    private boolean f25671a0;

    /* renamed from: b */
    private final C4863g f25672b;

    /* renamed from: b0 */
    private C4217n f25673b0;

    /* renamed from: c */
    private final SparseArray<C4861c> f25674c;

    /* renamed from: d */
    private final boolean f25675d;

    /* renamed from: e */
    private final C5918a0 f25676e;

    /* renamed from: f */
    private final C5918a0 f25677f;

    /* renamed from: g */
    private final C5918a0 f25678g;

    /* renamed from: h */
    private final C5918a0 f25679h;

    /* renamed from: i */
    private final C5918a0 f25680i;

    /* renamed from: j */
    private final C5918a0 f25681j;

    /* renamed from: k */
    private final C5918a0 f25682k;

    /* renamed from: l */
    private final C5918a0 f25683l;

    /* renamed from: m */
    private final C5918a0 f25684m;

    /* renamed from: n */
    private final C5918a0 f25685n;

    /* renamed from: o */
    private ByteBuffer f25686o;

    /* renamed from: p */
    private long f25687p;

    /* renamed from: q */
    private long f25688q;

    /* renamed from: r */
    private long f25689r;

    /* renamed from: s */
    private long f25690s;

    /* renamed from: t */
    private long f25691t;

    /* renamed from: u */
    private C4861c f25692u;

    /* renamed from: v */
    private boolean f25693v;

    /* renamed from: w */
    private int f25694w;

    /* renamed from: x */
    private long f25695x;

    /* renamed from: y */
    private boolean f25696y;

    /* renamed from: z */
    private long f25697z;

    /* renamed from: k2.e$b */
    /* compiled from: MatroskaExtractor */
    private final class C4860b implements C4856b {
        private C4860b() {
        }

        /* renamed from: a */
        public void mo18595a(int i) throws C6249m2 {
            C4858e.this.mo18607p(i);
        }

        /* renamed from: b */
        public int mo18596b(int i) {
            return C4858e.this.mo18610v(i);
        }

        /* renamed from: c */
        public boolean mo18597c(int i) {
            return C4858e.this.mo18603A(i);
        }

        /* renamed from: d */
        public void mo18598d(int i, String str) throws C6249m2 {
            C4858e.this.mo18605I(i, str);
        }

        /* renamed from: e */
        public void mo18599e(int i, double d) throws C6249m2 {
            C4858e.this.mo18608s(i, d);
        }

        /* renamed from: f */
        public void mo18600f(int i, int i2, C4216m mVar) throws IOException {
            C4858e.this.mo18606m(i, i2, mVar);
        }

        /* renamed from: g */
        public void mo18601g(int i, long j, long j2) throws C6249m2 {
            C4858e.this.mo18604H(i, j, j2);
        }

        /* renamed from: h */
        public void mo18602h(int i, long j) throws C6249m2 {
            C4858e.this.mo18613y(i, j);
        }
    }

    /* renamed from: k2.e$c */
    /* compiled from: MatroskaExtractor */
    protected static final class C4861c {

        /* renamed from: A */
        public int f25699A = -1;

        /* renamed from: B */
        public int f25700B = AdError.NETWORK_ERROR_CODE;

        /* renamed from: C */
        public int f25701C = 200;

        /* renamed from: D */
        public float f25702D = -1.0f;

        /* renamed from: E */
        public float f25703E = -1.0f;

        /* renamed from: F */
        public float f25704F = -1.0f;

        /* renamed from: G */
        public float f25705G = -1.0f;

        /* renamed from: H */
        public float f25706H = -1.0f;

        /* renamed from: I */
        public float f25707I = -1.0f;

        /* renamed from: J */
        public float f25708J = -1.0f;

        /* renamed from: K */
        public float f25709K = -1.0f;

        /* renamed from: L */
        public float f25710L = -1.0f;

        /* renamed from: M */
        public float f25711M = -1.0f;

        /* renamed from: N */
        public byte[] f25712N;

        /* renamed from: O */
        public int f25713O = 1;

        /* renamed from: P */
        public int f25714P = -1;

        /* renamed from: Q */
        public int f25715Q = 8000;

        /* renamed from: R */
        public long f25716R = 0;

        /* renamed from: S */
        public long f25717S = 0;

        /* renamed from: T */
        public C4203f0 f25718T;

        /* renamed from: U */
        public boolean f25719U;

        /* renamed from: V */
        public boolean f25720V = true;
        /* access modifiers changed from: private */

        /* renamed from: W */
        public String f25721W = "eng";

        /* renamed from: X */
        public C4200e0 f25722X;

        /* renamed from: Y */
        public int f25723Y;

        /* renamed from: a */
        public String f25724a;

        /* renamed from: b */
        public String f25725b;

        /* renamed from: c */
        public int f25726c;

        /* renamed from: d */
        public int f25727d;

        /* renamed from: e */
        public int f25728e;

        /* renamed from: f */
        public int f25729f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public int f25730g;

        /* renamed from: h */
        public boolean f25731h;

        /* renamed from: i */
        public byte[] f25732i;

        /* renamed from: j */
        public C4200e0.C4201a f25733j;

        /* renamed from: k */
        public byte[] f25734k;

        /* renamed from: l */
        public C4035m f25735l;

        /* renamed from: m */
        public int f25736m = -1;

        /* renamed from: n */
        public int f25737n = -1;

        /* renamed from: o */
        public int f25738o = -1;

        /* renamed from: p */
        public int f25739p = -1;

        /* renamed from: q */
        public int f25740q = 0;

        /* renamed from: r */
        public int f25741r = -1;

        /* renamed from: s */
        public float f25742s = 0.0f;

        /* renamed from: t */
        public float f25743t = 0.0f;

        /* renamed from: u */
        public float f25744u = 0.0f;

        /* renamed from: v */
        public byte[] f25745v = null;

        /* renamed from: w */
        public int f25746w = -1;

        /* renamed from: x */
        public boolean f25747x = false;

        /* renamed from: y */
        public int f25748y = -1;

        /* renamed from: z */
        public int f25749z = -1;

        protected C4861c() {
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public void m30955f() {
            C5917a.m34872e(this.f25722X);
        }

        /* renamed from: g */
        private byte[] m30956g(String str) throws C6249m2 {
            byte[] bArr = this.f25734k;
            if (bArr != null) {
                return bArr;
            }
            throw C6249m2.m36661a("Missing CodecPrivate for codec " + str, (Throwable) null);
        }

        /* renamed from: h */
        private byte[] m30957h() {
            if (this.f25702D == -1.0f || this.f25703E == -1.0f || this.f25704F == -1.0f || this.f25705G == -1.0f || this.f25706H == -1.0f || this.f25707I == -1.0f || this.f25708J == -1.0f || this.f25709K == -1.0f || this.f25710L == -1.0f || this.f25711M == -1.0f) {
                return null;
            }
            byte[] bArr = new byte[25];
            ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            order.put((byte) 0);
            order.putShort((short) ((int) ((this.f25702D * 50000.0f) + 0.5f)));
            order.putShort((short) ((int) ((this.f25703E * 50000.0f) + 0.5f)));
            order.putShort((short) ((int) ((this.f25704F * 50000.0f) + 0.5f)));
            order.putShort((short) ((int) ((this.f25705G * 50000.0f) + 0.5f)));
            order.putShort((short) ((int) ((this.f25706H * 50000.0f) + 0.5f)));
            order.putShort((short) ((int) ((this.f25707I * 50000.0f) + 0.5f)));
            order.putShort((short) ((int) ((this.f25708J * 50000.0f) + 0.5f)));
            order.putShort((short) ((int) ((this.f25709K * 50000.0f) + 0.5f)));
            order.putShort((short) ((int) (this.f25710L + 0.5f)));
            order.putShort((short) ((int) (this.f25711M + 0.5f)));
            order.putShort((short) this.f25700B);
            order.putShort((short) this.f25701C);
            return bArr;
        }

        /* renamed from: k */
        private static Pair<String, List<byte[]>> m30958k(C5918a0 a0Var) throws C6249m2 {
            try {
                a0Var.mo20547P(16);
                long s = a0Var.mo20566s();
                if (s == 1482049860) {
                    return new Pair<>("video/divx", (Object) null);
                }
                if (s == 859189832) {
                    return new Pair<>("video/3gpp", (Object) null);
                }
                if (s == 826496599) {
                    byte[] d = a0Var.mo20551d();
                    for (int e = a0Var.mo20552e() + 20; e < d.length - 4; e++) {
                        if (d[e] == 0 && d[e + 1] == 0 && d[e + 2] == 1 && d[e + 3] == 15) {
                            return new Pair<>("video/wvc1", Collections.singletonList(Arrays.copyOfRange(d, e, d.length)));
                        }
                    }
                    throw C6249m2.m36661a("Failed to find FourCC VC1 initialization data", (Throwable) null);
                }
                C5961r.m35215i("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair<>("video/x-unknown", (Object) null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw C6249m2.m36661a("Error parsing FourCC private data", (Throwable) null);
            }
        }

        /* renamed from: l */
        private static boolean m30959l(C5918a0 a0Var) throws C6249m2 {
            try {
                int u = a0Var.mo20568u();
                if (u == 1) {
                    return true;
                }
                if (u != 65534) {
                    return false;
                }
                a0Var.mo20546O(24);
                if (a0Var.mo20569v() == C4858e.f25642h0.getMostSignificantBits() && a0Var.mo20569v() == C4858e.f25642h0.getLeastSignificantBits()) {
                    return true;
                }
                return false;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw C6249m2.m36661a("Error parsing MS/ACM codec private", (Throwable) null);
            }
        }

        /* renamed from: m */
        private static List<byte[]> m30960m(byte[] bArr) throws C6249m2 {
            try {
                if (bArr[0] == 2) {
                    int i = 1;
                    int i2 = 0;
                    while ((bArr[i] & 255) == 255) {
                        i2 += 255;
                        i++;
                    }
                    int i3 = i + 1;
                    int i4 = i2 + (bArr[i] & 255);
                    int i5 = 0;
                    while ((bArr[i3] & 255) == 255) {
                        i5 += 255;
                        i3++;
                    }
                    int i6 = i3 + 1;
                    int i7 = i5 + (bArr[i3] & 255);
                    if (bArr[i6] == 1) {
                        byte[] bArr2 = new byte[i4];
                        System.arraycopy(bArr, i6, bArr2, 0, i4);
                        int i8 = i6 + i4;
                        if (bArr[i8] == 3) {
                            int i9 = i8 + i7;
                            if (bArr[i9] == 5) {
                                byte[] bArr3 = new byte[(bArr.length - i9)];
                                System.arraycopy(bArr, i9, bArr3, 0, bArr.length - i9);
                                ArrayList arrayList = new ArrayList(2);
                                arrayList.add(bArr2);
                                arrayList.add(bArr3);
                                return arrayList;
                            }
                            throw C6249m2.m36661a("Error parsing vorbis codec private", (Throwable) null);
                        }
                        throw C6249m2.m36661a("Error parsing vorbis codec private", (Throwable) null);
                    }
                    throw C6249m2.m36661a("Error parsing vorbis codec private", (Throwable) null);
                }
                throw C6249m2.m36661a("Error parsing vorbis codec private", (Throwable) null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw C6249m2.m36661a("Error parsing vorbis codec private", (Throwable) null);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: o */
        public boolean m30961o(boolean z) {
            if ("A_OPUS".equals(this.f25725b)) {
                return z;
            }
            return this.f25729f > 0;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v13, resolved type: java.lang.String} */
        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:117:0x02a5, code lost:
            r4 = r1;
            r1 = null;
            r3 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:132:0x030c, code lost:
            r1 = null;
            r3 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:133:0x030e, code lost:
            r4 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:134:0x030f, code lost:
            r6 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:142:0x0362, code lost:
            r4 = -1;
            r6 = -1;
            r18 = r3;
            r3 = r1;
            r1 = r18;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:145:0x0398, code lost:
            r3 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:148:0x03a0, code lost:
            r1 = null;
            r3 = null;
            r4 = -1;
            r6 = 4096;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:157:0x040f, code lost:
            r1 = null;
            r3 = null;
            r17 = "audio/x-unknown";
         */
        /* JADX WARNING: Code restructure failed: missing block: B:163:0x0423, code lost:
            r7 = r0.f25712N;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:164:0x0425, code lost:
            if (r7 == null) goto L_0x0436;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:165:0x0427, code lost:
            r7 = p167x3.C6054d.m35502a(new p161w3.C5918a0(r7));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:166:0x0430, code lost:
            if (r7 == null) goto L_0x0436;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:167:0x0432, code lost:
            r3 = r7.f29339c;
            r17 = "video/dolby-vision";
         */
        /* JADX WARNING: Code restructure failed: missing block: B:168:0x0436, code lost:
            r7 = r17;
            r10 = r0.f25720V | 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:169:0x043e, code lost:
            if (r0.f25719U == false) goto L_0x0442;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:170:0x0440, code lost:
            r9 = 2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:171:0x0442, code lost:
            r9 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:172:0x0443, code lost:
            r9 = r9 | r10;
            r10 = new p177z1.C6272r1.C6274b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:173:0x044d, code lost:
            if (p161w3.C5967v.m35251o(r7) == false) goto L_0x0461;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:174:0x044f, code lost:
            r10.mo21494H(r0.f25713O).mo21518f0(r0.f25715Q).mo21511Y(r4);
            r5 = 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:176:0x0465, code lost:
            if (p161w3.C5967v.m35255s(r7) == false) goto L_0x053b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:178:0x0469, code lost:
            if (r0.f25740q != 0) goto L_0x047d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:179:0x046b, code lost:
            r2 = r0.f25738o;
            r4 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:180:0x046e, code lost:
            if (r2 != -1) goto L_0x0472;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:181:0x0470, code lost:
            r2 = r0.f25736m;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:182:0x0472, code lost:
            r0.f25738o = r2;
            r2 = r0.f25739p;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:183:0x0476, code lost:
            if (r2 != -1) goto L_0x047a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:184:0x0478, code lost:
            r2 = r0.f25737n;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:185:0x047a, code lost:
            r0.f25739p = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:186:0x047d, code lost:
            r4 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:187:0x047e, code lost:
            r2 = -1.0f;
            r5 = r0.f25738o;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:188:0x0482, code lost:
            if (r5 == r4) goto L_0x0493;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:189:0x0484, code lost:
            r12 = r0.f25739p;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:190:0x0486, code lost:
            if (r12 == r4) goto L_0x0493;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:191:0x0488, code lost:
            r2 = ((float) (r0.f25737n * r5)) / ((float) (r0.f25736m * r12));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:193:0x0495, code lost:
            if (r0.f25747x == false) goto L_0x04a6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:194:0x0497, code lost:
            r8 = new p167x3.C6053c(r0.f25748y, r0.f25699A, r0.f25749z, m30957h());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:196:0x04a8, code lost:
            if (r0.f25724a == null) goto L_0x04c6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:198:0x04b4, code lost:
            if (p078k2.C4858e.m30915g().containsKey(r0.f25724a) == false) goto L_0x04c6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:199:0x04b6, code lost:
            r4 = ((java.lang.Integer) p078k2.C4858e.m30915g().get(r0.f25724a)).intValue();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:201:0x04c8, code lost:
            if (r0.f25741r != 0) goto L_0x0516;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:203:0x04d1, code lost:
            if (java.lang.Float.compare(r0.f25742s, 0.0f) != 0) goto L_0x0516;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:205:0x04d9, code lost:
            if (java.lang.Float.compare(r0.f25743t, 0.0f) != 0) goto L_0x0516;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:207:0x04e1, code lost:
            if (java.lang.Float.compare(r0.f25744u, 0.0f) != 0) goto L_0x04e5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:208:0x04e3, code lost:
            r4 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:210:0x04ed, code lost:
            if (java.lang.Float.compare(r0.f25743t, 90.0f) != 0) goto L_0x04f2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:211:0x04ef, code lost:
            r4 = 90;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:213:0x04fa, code lost:
            if (java.lang.Float.compare(r0.f25743t, -180.0f) == 0) goto L_0x0514;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:215:0x0504, code lost:
            if (java.lang.Float.compare(r0.f25743t, 180.0f) != 0) goto L_0x0507;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:217:0x050f, code lost:
            if (java.lang.Float.compare(r0.f25743t, -90.0f) != 0) goto L_0x0516;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:218:0x0511, code lost:
            r4 = 270;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:219:0x0514, code lost:
            r4 = 180;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:220:0x0516, code lost:
            r10.mo21522j0(r0.f25736m).mo21503Q(r0.f25737n).mo21513a0(r2).mo21516d0(r4).mo21514b0(r0.f25745v).mo21520h0(r0.f25746w).mo21496J(r8);
            r5 = 2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:222:0x053f, code lost:
            if ("application/x-subrip".equals(r7) != false) goto L_0x0567;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:224:0x0545, code lost:
            if ("text/x-ssa".equals(r7) != false) goto L_0x0567;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:226:0x054b, code lost:
            if ("text/vtt".equals(r7) != false) goto L_0x0567;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:228:0x0551, code lost:
            if ("application/vobsub".equals(r7) != false) goto L_0x0567;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:230:0x0557, code lost:
            if ("application/pgs".equals(r7) != false) goto L_0x0567;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:232:0x055d, code lost:
            if ("application/dvbsubs".equals(r7) == false) goto L_0x0560;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:234:0x0566, code lost:
            throw p177z1.C6249m2.m36661a("Unexpected MIME type.", (java.lang.Throwable) null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:235:0x0567, code lost:
            r5 = 3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:237:0x056a, code lost:
            if (r0.f25724a == null) goto L_0x057d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:239:0x0576, code lost:
            if (p078k2.C4858e.m30915g().containsKey(r0.f25724a) != false) goto L_0x057d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:240:0x0578, code lost:
            r10.mo21507U(r0.f25724a);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:241:0x057d, code lost:
            r1 = r10.mo21504R(r21).mo21517e0(r7).mo21509W(r6).mo21508V(r0.f25721W).mo21519g0(r9).mo21506T(r1).mo21495I(r3).mo21499M(r0.f25735l).mo21491E();
            r2 = r20.mo6778f(r0.f25726c, r5);
            r0.f25722X = r2;
            r2.mo6845e(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:242:0x05b4, code lost:
            return;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: i */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo18614i(p037e2.C4217n r20, int r21) throws p177z1.C6249m2 {
            /*
                r19 = this;
                r0 = r19
                java.lang.String r1 = r0.f25725b
                r1.hashCode()
                int r2 = r1.hashCode()
                r3 = 32
                r4 = 16
                r7 = 8
                r9 = 3
                switch(r2) {
                    case -2095576542: goto L_0x01c1;
                    case -2095575984: goto L_0x01b5;
                    case -1985379776: goto L_0x01a9;
                    case -1784763192: goto L_0x019d;
                    case -1730367663: goto L_0x0191;
                    case -1482641358: goto L_0x0185;
                    case -1482641357: goto L_0x0179;
                    case -1373388978: goto L_0x016d;
                    case -933872740: goto L_0x015f;
                    case -538363189: goto L_0x0151;
                    case -538363109: goto L_0x0143;
                    case -425012669: goto L_0x0135;
                    case -356037306: goto L_0x0127;
                    case 62923557: goto L_0x0119;
                    case 62923603: goto L_0x010b;
                    case 62927045: goto L_0x00fd;
                    case 82318131: goto L_0x00ef;
                    case 82338133: goto L_0x00e1;
                    case 82338134: goto L_0x00d3;
                    case 99146302: goto L_0x00c5;
                    case 444813526: goto L_0x00b7;
                    case 542569478: goto L_0x00a9;
                    case 635596514: goto L_0x009b;
                    case 725948237: goto L_0x008d;
                    case 725957860: goto L_0x0080;
                    case 738597099: goto L_0x0073;
                    case 855502857: goto L_0x0066;
                    case 1045209816: goto L_0x0059;
                    case 1422270023: goto L_0x004c;
                    case 1809237540: goto L_0x003f;
                    case 1950749482: goto L_0x0032;
                    case 1950789798: goto L_0x0025;
                    case 1951062397: goto L_0x0018;
                    default: goto L_0x0015;
                }
            L_0x0015:
                r1 = -1
                goto L_0x01cc
            L_0x0018:
                java.lang.String r2 = "A_OPUS"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0021
                goto L_0x0015
            L_0x0021:
                r1 = 32
                goto L_0x01cc
            L_0x0025:
                java.lang.String r2 = "A_FLAC"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x002e
                goto L_0x0015
            L_0x002e:
                r1 = 31
                goto L_0x01cc
            L_0x0032:
                java.lang.String r2 = "A_EAC3"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x003b
                goto L_0x0015
            L_0x003b:
                r1 = 30
                goto L_0x01cc
            L_0x003f:
                java.lang.String r2 = "V_MPEG2"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0048
                goto L_0x0015
            L_0x0048:
                r1 = 29
                goto L_0x01cc
            L_0x004c:
                java.lang.String r2 = "S_TEXT/UTF8"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0055
                goto L_0x0015
            L_0x0055:
                r1 = 28
                goto L_0x01cc
            L_0x0059:
                java.lang.String r2 = "S_TEXT/WEBVTT"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0062
                goto L_0x0015
            L_0x0062:
                r1 = 27
                goto L_0x01cc
            L_0x0066:
                java.lang.String r2 = "V_MPEGH/ISO/HEVC"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x006f
                goto L_0x0015
            L_0x006f:
                r1 = 26
                goto L_0x01cc
            L_0x0073:
                java.lang.String r2 = "S_TEXT/ASS"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x007c
                goto L_0x0015
            L_0x007c:
                r1 = 25
                goto L_0x01cc
            L_0x0080:
                java.lang.String r2 = "A_PCM/INT/LIT"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0089
                goto L_0x0015
            L_0x0089:
                r1 = 24
                goto L_0x01cc
            L_0x008d:
                java.lang.String r2 = "A_PCM/INT/BIG"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0097
                goto L_0x0015
            L_0x0097:
                r1 = 23
                goto L_0x01cc
            L_0x009b:
                java.lang.String r2 = "A_PCM/FLOAT/IEEE"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x00a5
                goto L_0x0015
            L_0x00a5:
                r1 = 22
                goto L_0x01cc
            L_0x00a9:
                java.lang.String r2 = "A_DTS/EXPRESS"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x00b3
                goto L_0x0015
            L_0x00b3:
                r1 = 21
                goto L_0x01cc
            L_0x00b7:
                java.lang.String r2 = "V_THEORA"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x00c1
                goto L_0x0015
            L_0x00c1:
                r1 = 20
                goto L_0x01cc
            L_0x00c5:
                java.lang.String r2 = "S_HDMV/PGS"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x00cf
                goto L_0x0015
            L_0x00cf:
                r1 = 19
                goto L_0x01cc
            L_0x00d3:
                java.lang.String r2 = "V_VP9"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x00dd
                goto L_0x0015
            L_0x00dd:
                r1 = 18
                goto L_0x01cc
            L_0x00e1:
                java.lang.String r2 = "V_VP8"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x00eb
                goto L_0x0015
            L_0x00eb:
                r1 = 17
                goto L_0x01cc
            L_0x00ef:
                java.lang.String r2 = "V_AV1"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x00f9
                goto L_0x0015
            L_0x00f9:
                r1 = 16
                goto L_0x01cc
            L_0x00fd:
                java.lang.String r2 = "A_DTS"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0107
                goto L_0x0015
            L_0x0107:
                r1 = 15
                goto L_0x01cc
            L_0x010b:
                java.lang.String r2 = "A_AC3"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0115
                goto L_0x0015
            L_0x0115:
                r1 = 14
                goto L_0x01cc
            L_0x0119:
                java.lang.String r2 = "A_AAC"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0123
                goto L_0x0015
            L_0x0123:
                r1 = 13
                goto L_0x01cc
            L_0x0127:
                java.lang.String r2 = "A_DTS/LOSSLESS"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0131
                goto L_0x0015
            L_0x0131:
                r1 = 12
                goto L_0x01cc
            L_0x0135:
                java.lang.String r2 = "S_VOBSUB"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x013f
                goto L_0x0015
            L_0x013f:
                r1 = 11
                goto L_0x01cc
            L_0x0143:
                java.lang.String r2 = "V_MPEG4/ISO/AVC"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x014d
                goto L_0x0015
            L_0x014d:
                r1 = 10
                goto L_0x01cc
            L_0x0151:
                java.lang.String r2 = "V_MPEG4/ISO/ASP"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x015b
                goto L_0x0015
            L_0x015b:
                r1 = 9
                goto L_0x01cc
            L_0x015f:
                java.lang.String r2 = "S_DVBSUB"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0169
                goto L_0x0015
            L_0x0169:
                r1 = 8
                goto L_0x01cc
            L_0x016d:
                java.lang.String r2 = "V_MS/VFW/FOURCC"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0177
                goto L_0x0015
            L_0x0177:
                r1 = 7
                goto L_0x01cc
            L_0x0179:
                java.lang.String r2 = "A_MPEG/L3"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0183
                goto L_0x0015
            L_0x0183:
                r1 = 6
                goto L_0x01cc
            L_0x0185:
                java.lang.String r2 = "A_MPEG/L2"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x018f
                goto L_0x0015
            L_0x018f:
                r1 = 5
                goto L_0x01cc
            L_0x0191:
                java.lang.String r2 = "A_VORBIS"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x019b
                goto L_0x0015
            L_0x019b:
                r1 = 4
                goto L_0x01cc
            L_0x019d:
                java.lang.String r2 = "A_TRUEHD"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x01a7
                goto L_0x0015
            L_0x01a7:
                r1 = 3
                goto L_0x01cc
            L_0x01a9:
                java.lang.String r2 = "A_MS/ACM"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x01b3
                goto L_0x0015
            L_0x01b3:
                r1 = 2
                goto L_0x01cc
            L_0x01b5:
                java.lang.String r2 = "V_MPEG4/ISO/SP"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x01bf
                goto L_0x0015
            L_0x01bf:
                r1 = 1
                goto L_0x01cc
            L_0x01c1:
                java.lang.String r2 = "V_MPEG4/ISO/AP"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x01cb
                goto L_0x0015
            L_0x01cb:
                r1 = 0
            L_0x01cc:
                java.lang.String r2 = "application/dvbsubs"
                java.lang.String r12 = "application/pgs"
                java.lang.String r13 = "application/vobsub"
                java.lang.String r14 = "text/vtt"
                java.lang.String r15 = "text/x-ssa"
                java.lang.String r5 = "application/x-subrip"
                r16 = 4096(0x1000, float:5.74E-42)
                java.lang.String r6 = ". Setting mimeType to "
                java.lang.String r17 = "audio/raw"
                java.lang.String r11 = "MatroskaExtractor"
                java.lang.String r10 = "audio/x-unknown"
                r8 = 0
                switch(r1) {
                    case 0: goto L_0x0415;
                    case 1: goto L_0x0415;
                    case 2: goto L_0x03c5;
                    case 3: goto L_0x03ba;
                    case 4: goto L_0x03a7;
                    case 5: goto L_0x039e;
                    case 6: goto L_0x039b;
                    case 7: goto L_0x037f;
                    case 8: goto L_0x036b;
                    case 9: goto L_0x0415;
                    case 10: goto L_0x0349;
                    case 11: goto L_0x033b;
                    case 12: goto L_0x0338;
                    case 13: goto L_0x031b;
                    case 14: goto L_0x0318;
                    case 15: goto L_0x0315;
                    case 16: goto L_0x0312;
                    case 17: goto L_0x030a;
                    case 18: goto L_0x0307;
                    case 19: goto L_0x0302;
                    case 20: goto L_0x02ff;
                    case 21: goto L_0x0315;
                    case 22: goto L_0x02d9;
                    case 23: goto L_0x02aa;
                    case 24: goto L_0x027f;
                    case 25: goto L_0x026c;
                    case 26: goto L_0x0251;
                    case 27: goto L_0x024b;
                    case 28: goto L_0x0247;
                    case 29: goto L_0x0243;
                    case 30: goto L_0x023f;
                    case 31: goto L_0x0231;
                    case 32: goto L_0x01ed;
                    default: goto L_0x01e6;
                }
            L_0x01e6:
                java.lang.String r1 = "Unrecognized codec identifier."
                z1.m2 r1 = p177z1.C6249m2.m36661a(r1, r8)
                throw r1
            L_0x01ed:
                r16 = 5760(0x1680, float:8.071E-42)
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>(r9)
                java.lang.String r3 = r0.f25725b
                byte[] r3 = r0.m30956g(r3)
                r1.add(r3)
                java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocate(r7)
                java.nio.ByteOrder r4 = java.nio.ByteOrder.LITTLE_ENDIAN
                java.nio.ByteBuffer r3 = r3.order(r4)
                long r10 = r0.f25716R
                java.nio.ByteBuffer r3 = r3.putLong(r10)
                byte[] r3 = r3.array()
                r1.add(r3)
                java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocate(r7)
                java.nio.ByteBuffer r3 = r3.order(r4)
                long r6 = r0.f25717S
                java.nio.ByteBuffer r3 = r3.putLong(r6)
                byte[] r3 = r3.array()
                r1.add(r3)
                java.lang.String r17 = "audio/opus"
                r3 = r8
                r4 = -1
                r6 = 5760(0x1680, float:8.071E-42)
                goto L_0x0423
            L_0x0231:
                java.lang.String r1 = r0.f25725b
                byte[] r1 = r0.m30956g(r1)
                java.util.List r1 = java.util.Collections.singletonList(r1)
                java.lang.String r17 = "audio/flac"
                goto L_0x0398
            L_0x023f:
                java.lang.String r17 = "audio/eac3"
                goto L_0x030c
            L_0x0243:
                java.lang.String r17 = "video/mpeg2"
                goto L_0x030c
            L_0x0247:
                r17 = r5
                goto L_0x030c
            L_0x024b:
                r1 = r8
                r3 = r1
                r17 = r14
                goto L_0x030e
            L_0x0251:
                w3.a0 r1 = new w3.a0
                java.lang.String r3 = r0.f25725b
                byte[] r3 = r0.m30956g(r3)
                r1.<init>((byte[]) r3)
                x3.f r1 = p167x3.C6057f.m35517a(r1)
                java.util.List<byte[]> r3 = r1.f29354a
                int r4 = r1.f29355b
                r0.f25723Y = r4
                java.lang.String r1 = r1.f29359f
                java.lang.String r17 = "video/hevc"
                goto L_0x0362
            L_0x026c:
                byte[] r1 = p078k2.C4858e.f25639e0
                java.lang.String r3 = r0.f25725b
                byte[] r3 = r0.m30956g(r3)
                b7.q r1 = p190b7.C6685q.m38447z(r1, r3)
                r3 = r8
                r17 = r15
                goto L_0x030e
            L_0x027f:
                int r1 = r0.f25714P
                int r1 = p161w3.C5953m0.m35123b0(r1)
                if (r1 != 0) goto L_0x02a5
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = "Unsupported little endian PCM bit depth: "
                r1.append(r3)
                int r3 = r0.f25714P
                r1.append(r3)
                r1.append(r6)
                r1.append(r10)
                java.lang.String r1 = r1.toString()
                p161w3.C5961r.m35215i(r11, r1)
                goto L_0x040f
            L_0x02a5:
                r4 = r1
                r1 = r8
                r3 = r1
                goto L_0x030f
            L_0x02aa:
                int r1 = r0.f25714P
                if (r1 != r7) goto L_0x02b2
                r1 = r8
                r3 = r1
                r4 = 3
                goto L_0x030f
            L_0x02b2:
                if (r1 != r4) goto L_0x02bb
                r1 = 268435456(0x10000000, float:2.5243549E-29)
                r1 = r8
                r3 = r1
                r4 = 268435456(0x10000000, float:2.5243549E-29)
                goto L_0x030f
            L_0x02bb:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = "Unsupported big endian PCM bit depth: "
                r1.append(r3)
                int r3 = r0.f25714P
                r1.append(r3)
                r1.append(r6)
                r1.append(r10)
                java.lang.String r1 = r1.toString()
                p161w3.C5961r.m35215i(r11, r1)
                goto L_0x040f
            L_0x02d9:
                int r1 = r0.f25714P
                if (r1 != r3) goto L_0x02e1
                r1 = r8
                r3 = r1
                r4 = 4
                goto L_0x030f
            L_0x02e1:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = "Unsupported floating point PCM bit depth: "
                r1.append(r3)
                int r3 = r0.f25714P
                r1.append(r3)
                r1.append(r6)
                r1.append(r10)
                java.lang.String r1 = r1.toString()
                p161w3.C5961r.m35215i(r11, r1)
                goto L_0x040f
            L_0x02ff:
                java.lang.String r17 = "video/x-unknown"
                goto L_0x030c
            L_0x0302:
                r1 = r8
                r3 = r1
                r17 = r12
                goto L_0x030e
            L_0x0307:
                java.lang.String r17 = "video/x-vnd.on2.vp9"
                goto L_0x030c
            L_0x030a:
                java.lang.String r17 = "video/x-vnd.on2.vp8"
            L_0x030c:
                r1 = r8
                r3 = r1
            L_0x030e:
                r4 = -1
            L_0x030f:
                r6 = -1
                goto L_0x0423
            L_0x0312:
                java.lang.String r17 = "video/av01"
                goto L_0x030c
            L_0x0315:
                java.lang.String r17 = "audio/vnd.dts"
                goto L_0x030c
            L_0x0318:
                java.lang.String r17 = "audio/ac3"
                goto L_0x030c
            L_0x031b:
                java.lang.String r1 = r0.f25725b
                byte[] r1 = r0.m30956g(r1)
                java.util.List r1 = java.util.Collections.singletonList(r1)
                byte[] r3 = r0.f25734k
                b2.a$b r3 = p014b2.C1609a.m7406f(r3)
                int r4 = r3.f4614a
                r0.f25715Q = r4
                int r4 = r3.f4615b
                r0.f25713O = r4
                java.lang.String r3 = r3.f4616c
                java.lang.String r17 = "audio/mp4a-latm"
                goto L_0x030e
            L_0x0338:
                java.lang.String r17 = "audio/vnd.dts.hd"
                goto L_0x030c
            L_0x033b:
                java.lang.String r1 = r0.f25725b
                byte[] r1 = r0.m30956g(r1)
                b7.q r1 = p190b7.C6685q.m38446y(r1)
                r3 = r8
                r17 = r13
                goto L_0x030e
            L_0x0349:
                w3.a0 r1 = new w3.a0
                java.lang.String r3 = r0.f25725b
                byte[] r3 = r0.m30956g(r3)
                r1.<init>((byte[]) r3)
                x3.a r1 = p167x3.C6052a.m35496b(r1)
                java.util.List<byte[]> r3 = r1.f29325a
                int r4 = r1.f29326b
                r0.f25723Y = r4
                java.lang.String r1 = r1.f29330f
                java.lang.String r17 = "video/avc"
            L_0x0362:
                r4 = -1
                r6 = -1
                r18 = r3
                r3 = r1
                r1 = r18
                goto L_0x0423
            L_0x036b:
                r1 = 4
                byte[] r3 = new byte[r1]
                java.lang.String r4 = r0.f25725b
                byte[] r4 = r0.m30956g(r4)
                r6 = 0
                java.lang.System.arraycopy(r4, r6, r3, r6, r1)
                b7.q r1 = p190b7.C6685q.m38446y(r3)
                r17 = r2
                goto L_0x0398
            L_0x037f:
                w3.a0 r1 = new w3.a0
                java.lang.String r3 = r0.f25725b
                byte[] r3 = r0.m30956g(r3)
                r1.<init>((byte[]) r3)
                android.util.Pair r1 = m30958k(r1)
                java.lang.Object r3 = r1.first
                r17 = r3
                java.lang.String r17 = (java.lang.String) r17
                java.lang.Object r1 = r1.second
                java.util.List r1 = (java.util.List) r1
            L_0x0398:
                r3 = r8
                goto L_0x030e
            L_0x039b:
                java.lang.String r17 = "audio/mpeg"
                goto L_0x03a0
            L_0x039e:
                java.lang.String r17 = "audio/mpeg-L2"
            L_0x03a0:
                r1 = r8
                r3 = r1
                r4 = -1
                r6 = 4096(0x1000, float:5.74E-42)
                goto L_0x0423
            L_0x03a7:
                r16 = 8192(0x2000, float:1.14794E-41)
                java.lang.String r1 = r0.f25725b
                byte[] r1 = r0.m30956g(r1)
                java.util.List r1 = m30960m(r1)
                java.lang.String r17 = "audio/vorbis"
                r3 = r8
                r4 = -1
                r6 = 8192(0x2000, float:1.14794E-41)
                goto L_0x0423
            L_0x03ba:
                e2.f0 r1 = new e2.f0
                r1.<init>()
                r0.f25718T = r1
                java.lang.String r17 = "audio/true-hd"
                goto L_0x030c
            L_0x03c5:
                w3.a0 r1 = new w3.a0
                java.lang.String r3 = r0.f25725b
                byte[] r3 = r0.m30956g(r3)
                r1.<init>((byte[]) r3)
                boolean r1 = m30959l(r1)
                if (r1 == 0) goto L_0x03fb
                int r1 = r0.f25714P
                int r1 = p161w3.C5953m0.m35123b0(r1)
                if (r1 != 0) goto L_0x02a5
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = "Unsupported PCM bit depth: "
                r1.append(r3)
                int r3 = r0.f25714P
                r1.append(r3)
                r1.append(r6)
                r1.append(r10)
                java.lang.String r1 = r1.toString()
                p161w3.C5961r.m35215i(r11, r1)
                goto L_0x040f
            L_0x03fb:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = "Non-PCM MS/ACM is unsupported. Setting mimeType to "
                r1.append(r3)
                r1.append(r10)
                java.lang.String r1 = r1.toString()
                p161w3.C5961r.m35215i(r11, r1)
            L_0x040f:
                r1 = r8
                r3 = r1
                r17 = r10
                goto L_0x030e
            L_0x0415:
                byte[] r1 = r0.f25734k
                if (r1 != 0) goto L_0x041b
                r1 = r8
                goto L_0x041f
            L_0x041b:
                java.util.List r1 = java.util.Collections.singletonList(r1)
            L_0x041f:
                java.lang.String r17 = "video/mp4v-es"
                goto L_0x0398
            L_0x0423:
                byte[] r7 = r0.f25712N
                if (r7 == 0) goto L_0x0436
                w3.a0 r10 = new w3.a0
                r10.<init>((byte[]) r7)
                x3.d r7 = p167x3.C6054d.m35502a(r10)
                if (r7 == 0) goto L_0x0436
                java.lang.String r3 = r7.f29339c
                java.lang.String r17 = "video/dolby-vision"
            L_0x0436:
                r7 = r17
                boolean r10 = r0.f25720V
                r11 = 0
                r10 = r10 | r11
                boolean r9 = r0.f25719U
                if (r9 == 0) goto L_0x0442
                r9 = 2
                goto L_0x0443
            L_0x0442:
                r9 = 0
            L_0x0443:
                r9 = r9 | r10
                z1.r1$b r10 = new z1.r1$b
                r10.<init>()
                boolean r17 = p161w3.C5967v.m35251o(r7)
                if (r17 == 0) goto L_0x0461
                int r2 = r0.f25713O
                z1.r1$b r2 = r10.mo21494H(r2)
                int r5 = r0.f25715Q
                z1.r1$b r2 = r2.mo21518f0(r5)
                r2.mo21511Y(r4)
                r5 = 1
                goto L_0x0568
            L_0x0461:
                boolean r4 = p161w3.C5967v.m35255s(r7)
                if (r4 == 0) goto L_0x053b
                int r2 = r0.f25740q
                if (r2 != 0) goto L_0x047d
                int r2 = r0.f25738o
                r4 = -1
                if (r2 != r4) goto L_0x0472
                int r2 = r0.f25736m
            L_0x0472:
                r0.f25738o = r2
                int r2 = r0.f25739p
                if (r2 != r4) goto L_0x047a
                int r2 = r0.f25737n
            L_0x047a:
                r0.f25739p = r2
                goto L_0x047e
            L_0x047d:
                r4 = -1
            L_0x047e:
                r2 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r5 = r0.f25738o
                if (r5 == r4) goto L_0x0493
                int r12 = r0.f25739p
                if (r12 == r4) goto L_0x0493
                int r2 = r0.f25737n
                int r2 = r2 * r5
                float r2 = (float) r2
                int r5 = r0.f25736m
                int r5 = r5 * r12
                float r5 = (float) r5
                float r2 = r2 / r5
            L_0x0493:
                boolean r5 = r0.f25747x
                if (r5 == 0) goto L_0x04a6
                byte[] r5 = r19.m30957h()
                x3.c r8 = new x3.c
                int r12 = r0.f25748y
                int r13 = r0.f25699A
                int r14 = r0.f25749z
                r8.<init>(r12, r13, r14, r5)
            L_0x04a6:
                java.lang.String r5 = r0.f25724a
                if (r5 == 0) goto L_0x04c6
                java.util.Map r5 = p078k2.C4858e.f25643i0
                java.lang.String r12 = r0.f25724a
                boolean r5 = r5.containsKey(r12)
                if (r5 == 0) goto L_0x04c6
                java.util.Map r4 = p078k2.C4858e.f25643i0
                java.lang.String r5 = r0.f25724a
                java.lang.Object r4 = r4.get(r5)
                java.lang.Integer r4 = (java.lang.Integer) r4
                int r4 = r4.intValue()
            L_0x04c6:
                int r5 = r0.f25741r
                if (r5 != 0) goto L_0x0516
                float r5 = r0.f25742s
                r12 = 0
                int r5 = java.lang.Float.compare(r5, r12)
                if (r5 != 0) goto L_0x0516
                float r5 = r0.f25743t
                int r5 = java.lang.Float.compare(r5, r12)
                if (r5 != 0) goto L_0x0516
                float r5 = r0.f25744u
                int r5 = java.lang.Float.compare(r5, r12)
                if (r5 != 0) goto L_0x04e5
                r4 = 0
                goto L_0x0516
            L_0x04e5:
                float r5 = r0.f25743t
                r11 = 1119092736(0x42b40000, float:90.0)
                int r5 = java.lang.Float.compare(r5, r11)
                if (r5 != 0) goto L_0x04f2
                r4 = 90
                goto L_0x0516
            L_0x04f2:
                float r5 = r0.f25743t
                r11 = -1020002304(0xffffffffc3340000, float:-180.0)
                int r5 = java.lang.Float.compare(r5, r11)
                if (r5 == 0) goto L_0x0514
                float r5 = r0.f25743t
                r11 = 1127481344(0x43340000, float:180.0)
                int r5 = java.lang.Float.compare(r5, r11)
                if (r5 != 0) goto L_0x0507
                goto L_0x0514
            L_0x0507:
                float r5 = r0.f25743t
                r11 = -1028390912(0xffffffffc2b40000, float:-90.0)
                int r5 = java.lang.Float.compare(r5, r11)
                if (r5 != 0) goto L_0x0516
                r4 = 270(0x10e, float:3.78E-43)
                goto L_0x0516
            L_0x0514:
                r4 = 180(0xb4, float:2.52E-43)
            L_0x0516:
                int r5 = r0.f25736m
                z1.r1$b r5 = r10.mo21522j0(r5)
                int r11 = r0.f25737n
                z1.r1$b r5 = r5.mo21503Q(r11)
                z1.r1$b r2 = r5.mo21513a0(r2)
                z1.r1$b r2 = r2.mo21516d0(r4)
                byte[] r4 = r0.f25745v
                z1.r1$b r2 = r2.mo21514b0(r4)
                int r4 = r0.f25746w
                z1.r1$b r2 = r2.mo21520h0(r4)
                r2.mo21496J(r8)
                r5 = 2
                goto L_0x0568
            L_0x053b:
                boolean r4 = r5.equals(r7)
                if (r4 != 0) goto L_0x0567
                boolean r4 = r15.equals(r7)
                if (r4 != 0) goto L_0x0567
                boolean r4 = r14.equals(r7)
                if (r4 != 0) goto L_0x0567
                boolean r4 = r13.equals(r7)
                if (r4 != 0) goto L_0x0567
                boolean r4 = r12.equals(r7)
                if (r4 != 0) goto L_0x0567
                boolean r2 = r2.equals(r7)
                if (r2 == 0) goto L_0x0560
                goto L_0x0567
            L_0x0560:
                java.lang.String r1 = "Unexpected MIME type."
                z1.m2 r1 = p177z1.C6249m2.m36661a(r1, r8)
                throw r1
            L_0x0567:
                r5 = 3
            L_0x0568:
                java.lang.String r2 = r0.f25724a
                if (r2 == 0) goto L_0x057d
                java.util.Map r2 = p078k2.C4858e.f25643i0
                java.lang.String r4 = r0.f25724a
                boolean r2 = r2.containsKey(r4)
                if (r2 != 0) goto L_0x057d
                java.lang.String r2 = r0.f25724a
                r10.mo21507U(r2)
            L_0x057d:
                r2 = r21
                z1.r1$b r2 = r10.mo21504R(r2)
                z1.r1$b r2 = r2.mo21517e0(r7)
                z1.r1$b r2 = r2.mo21509W(r6)
                java.lang.String r4 = r0.f25721W
                z1.r1$b r2 = r2.mo21508V(r4)
                z1.r1$b r2 = r2.mo21519g0(r9)
                z1.r1$b r1 = r2.mo21506T(r1)
                z1.r1$b r1 = r1.mo21495I(r3)
                d2.m r2 = r0.f25735l
                z1.r1$b r1 = r1.mo21499M(r2)
                z1.r1 r1 = r1.mo21491E()
                int r2 = r0.f25726c
                r3 = r20
                e2.e0 r2 = r3.mo6778f(r2, r5)
                r0.f25722X = r2
                r2.mo6845e(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p078k2.C4858e.C4861c.mo18614i(e2.n, int):void");
        }

        /* renamed from: j */
        public void mo18615j() {
            C4203f0 f0Var = this.f25718T;
            if (f0Var != null) {
                f0Var.mo17566a(this.f25722X, this.f25733j);
            }
        }

        /* renamed from: n */
        public void mo18616n() {
            C4203f0 f0Var = this.f25718T;
            if (f0Var != null) {
                f0Var.mo17567b();
            }
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("htc_video_rotA-000", 0);
        hashMap.put("htc_video_rotA-090", 90);
        hashMap.put("htc_video_rotA-180", 180);
        hashMap.put("htc_video_rotA-270", 270);
        f25643i0 = Collections.unmodifiableMap(hashMap);
    }

    public C4858e() {
        this(0);
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public static /* synthetic */ C4215l[] m30903B() {
        return new C4215l[]{new C4858e()};
    }

    /* renamed from: C */
    private boolean m30904C(C4190a0 a0Var, long j) {
        if (this.f25696y) {
            this.f25644A = j;
            a0Var.f23479a = this.f25697z;
            this.f25696y = false;
            return true;
        }
        if (this.f25693v) {
            long j2 = this.f25644A;
            if (j2 != -1) {
                a0Var.f23479a = j2;
                this.f25644A = -1;
                return true;
            }
        }
        return false;
    }

    /* renamed from: D */
    private void m30905D(C4216m mVar, int i) throws IOException {
        if (this.f25678g.mo20553f() < i) {
            if (this.f25678g.mo20549b() < i) {
                C5918a0 a0Var = this.f25678g;
                a0Var.mo20550c(Math.max(a0Var.mo20549b() * 2, i));
            }
            mVar.readFully(this.f25678g.mo20551d(), this.f25678g.mo20553f(), i - this.f25678g.mo20553f());
            this.f25678g.mo20545N(i);
        }
    }

    /* renamed from: E */
    private void m30906E() {
        this.f25662S = 0;
        this.f25663T = 0;
        this.f25664U = 0;
        this.f25665V = false;
        this.f25666W = false;
        this.f25667X = false;
        this.f25668Y = 0;
        this.f25669Z = 0;
        this.f25671a0 = false;
        this.f25681j.mo20542K(0);
    }

    /* renamed from: F */
    private long m30907F(long j) throws C6249m2 {
        long j2 = this.f25689r;
        if (j2 != -9223372036854775807L) {
            return C5953m0.m35095N0(j, j2, 1000);
        }
        throw C6249m2.m36661a("Can't scale timecode prior to timecodeScale being set.", (Throwable) null);
    }

    /* renamed from: G */
    private static void m30908G(String str, long j, byte[] bArr) {
        int i;
        byte[] bArr2;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case 738597099:
                if (str.equals("S_TEXT/ASS")) {
                    c = 0;
                    break;
                }
                break;
            case 1045209816:
                if (str.equals("S_TEXT/WEBVTT")) {
                    c = 1;
                    break;
                }
                break;
            case 1422270023:
                if (str.equals("S_TEXT/UTF8")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                bArr2 = m30924t(j, "%01d:%02d:%02d:%02d", 10000);
                i = 21;
                break;
            case 1:
                bArr2 = m30924t(j, "%02d:%02d:%02d.%03d", 1000);
                i = 25;
                break;
            case 2:
                bArr2 = m30924t(j, "%02d:%02d:%02d,%03d", 1000);
                i = 19;
                break;
            default:
                throw new IllegalArgumentException();
        }
        System.arraycopy(bArr2, 0, bArr, i, bArr2.length);
    }

    /* renamed from: J */
    private int m30909J(C4216m mVar, C4861c cVar, int i, boolean z) throws IOException {
        int i2;
        if ("S_TEXT/UTF8".equals(cVar.f25725b)) {
            m30910K(mVar, f25638d0, i);
            return m30923r();
        } else if ("S_TEXT/ASS".equals(cVar.f25725b)) {
            m30910K(mVar, f25640f0, i);
            return m30923r();
        } else if ("S_TEXT/WEBVTT".equals(cVar.f25725b)) {
            m30910K(mVar, f25641g0, i);
            return m30923r();
        } else {
            C4200e0 e0Var = cVar.f25722X;
            boolean z2 = true;
            if (!this.f25665V) {
                if (cVar.f25731h) {
                    this.f25658O &= -1073741825;
                    int i3 = 128;
                    if (!this.f25666W) {
                        mVar.readFully(this.f25678g.mo20551d(), 0, 1);
                        this.f25662S++;
                        if ((this.f25678g.mo20551d()[0] & C8843b4.f36445d) != 128) {
                            this.f25669Z = this.f25678g.mo20551d()[0];
                            this.f25666W = true;
                        } else {
                            throw C6249m2.m36661a("Extension bit is set in signal byte", (Throwable) null);
                        }
                    }
                    byte b = this.f25669Z;
                    if ((b & 1) == 1) {
                        boolean z3 = (b & 2) == 2;
                        this.f25658O |= 1073741824;
                        if (!this.f25671a0) {
                            mVar.readFully(this.f25683l.mo20551d(), 0, 8);
                            this.f25662S += 8;
                            this.f25671a0 = true;
                            byte[] d = this.f25678g.mo20551d();
                            if (!z3) {
                                i3 = 0;
                            }
                            d[0] = (byte) (i3 | 8);
                            this.f25678g.mo20546O(0);
                            e0Var.mo6847f(this.f25678g, 1, 1);
                            this.f25663T++;
                            this.f25683l.mo20546O(0);
                            e0Var.mo6847f(this.f25683l, 8, 1);
                            this.f25663T += 8;
                        }
                        if (z3) {
                            if (!this.f25667X) {
                                mVar.readFully(this.f25678g.mo20551d(), 0, 1);
                                this.f25662S++;
                                this.f25678g.mo20546O(0);
                                this.f25668Y = this.f25678g.mo20534C();
                                this.f25667X = true;
                            }
                            int i4 = this.f25668Y * 4;
                            this.f25678g.mo20542K(i4);
                            mVar.readFully(this.f25678g.mo20551d(), 0, i4);
                            this.f25662S += i4;
                            short s = (short) ((this.f25668Y / 2) + 1);
                            int i5 = (s * 6) + 2;
                            ByteBuffer byteBuffer = this.f25686o;
                            if (byteBuffer == null || byteBuffer.capacity() < i5) {
                                this.f25686o = ByteBuffer.allocate(i5);
                            }
                            this.f25686o.position(0);
                            this.f25686o.putShort(s);
                            int i6 = 0;
                            int i7 = 0;
                            while (true) {
                                i2 = this.f25668Y;
                                if (i6 >= i2) {
                                    break;
                                }
                                int G = this.f25678g.mo20538G();
                                if (i6 % 2 == 0) {
                                    this.f25686o.putShort((short) (G - i7));
                                } else {
                                    this.f25686o.putInt(G - i7);
                                }
                                i6++;
                                i7 = G;
                            }
                            int i8 = (i - this.f25662S) - i7;
                            if (i2 % 2 == 1) {
                                this.f25686o.putInt(i8);
                            } else {
                                this.f25686o.putShort((short) i8);
                                this.f25686o.putInt(0);
                            }
                            this.f25684m.mo20544M(this.f25686o.array(), i5);
                            e0Var.mo6847f(this.f25684m, i5, 1);
                            this.f25663T += i5;
                        }
                    }
                } else {
                    byte[] bArr = cVar.f25732i;
                    if (bArr != null) {
                        this.f25681j.mo20544M(bArr, bArr.length);
                    }
                }
                if (cVar.m30961o(z)) {
                    this.f25658O |= 268435456;
                    this.f25685n.mo20542K(0);
                    int f = (this.f25681j.mo20553f() + i) - this.f25662S;
                    this.f25678g.mo20542K(4);
                    this.f25678g.mo20551d()[0] = (byte) ((f >> 24) & 255);
                    this.f25678g.mo20551d()[1] = (byte) ((f >> 16) & 255);
                    this.f25678g.mo20551d()[2] = (byte) ((f >> 8) & 255);
                    this.f25678g.mo20551d()[3] = (byte) (f & 255);
                    e0Var.mo6847f(this.f25678g, 4, 2);
                    this.f25663T += 4;
                }
                this.f25665V = true;
            }
            int f2 = i + this.f25681j.mo20553f();
            if (!"V_MPEG4/ISO/AVC".equals(cVar.f25725b) && !"V_MPEGH/ISO/HEVC".equals(cVar.f25725b)) {
                if (cVar.f25718T != null) {
                    if (this.f25681j.mo20553f() != 0) {
                        z2 = false;
                    }
                    C5917a.m34873f(z2);
                    cVar.f25718T.mo17569d(mVar);
                }
                while (true) {
                    int i9 = this.f25662S;
                    if (i9 >= f2) {
                        break;
                    }
                    int L = m30911L(mVar, e0Var, f2 - i9);
                    this.f25662S += L;
                    this.f25663T += L;
                }
            } else {
                byte[] d2 = this.f25677f.mo20551d();
                d2[0] = 0;
                d2[1] = 0;
                d2[2] = 0;
                int i10 = cVar.f25723Y;
                int i11 = 4 - i10;
                while (this.f25662S < f2) {
                    int i12 = this.f25664U;
                    if (i12 == 0) {
                        m30912M(mVar, d2, i11, i10);
                        this.f25662S += i10;
                        this.f25677f.mo20546O(0);
                        this.f25664U = this.f25677f.mo20538G();
                        this.f25676e.mo20546O(0);
                        e0Var.mo6843d(this.f25676e, 4);
                        this.f25663T += 4;
                    } else {
                        int L2 = m30911L(mVar, e0Var, i12);
                        this.f25662S += L2;
                        this.f25663T += L2;
                        this.f25664U -= L2;
                    }
                }
            }
            if ("A_VORBIS".equals(cVar.f25725b)) {
                this.f25679h.mo20546O(0);
                e0Var.mo6843d(this.f25679h, 4);
                this.f25663T += 4;
            }
            return m30923r();
        }
    }

    /* renamed from: K */
    private void m30910K(C4216m mVar, byte[] bArr, int i) throws IOException {
        int length = bArr.length + i;
        if (this.f25682k.mo20549b() < length) {
            this.f25682k.mo20543L(Arrays.copyOf(bArr, length + i));
        } else {
            System.arraycopy(bArr, 0, this.f25682k.mo20551d(), 0, bArr.length);
        }
        mVar.readFully(this.f25682k.mo20551d(), bArr.length, i);
        this.f25682k.mo20546O(0);
        this.f25682k.mo20545N(length);
    }

    /* renamed from: L */
    private int m30911L(C4216m mVar, C4200e0 e0Var, int i) throws IOException {
        int a = this.f25681j.mo20548a();
        if (a <= 0) {
            return e0Var.mo6840b(mVar, i, false);
        }
        int min = Math.min(i, a);
        e0Var.mo6843d(this.f25681j, min);
        return min;
    }

    /* renamed from: M */
    private void m30912M(C4216m mVar, byte[] bArr, int i, int i2) throws IOException {
        int min = Math.min(i2, this.f25681j.mo20548a());
        mVar.readFully(bArr, i + min, i2 - min);
        if (min > 0) {
            this.f25681j.mo20557j(bArr, i, min);
        }
    }

    /* renamed from: j */
    private void m30917j(int i) throws C6249m2 {
        if (this.f25646C == null || this.f25647D == null) {
            throw C6249m2.m36661a("Element " + i + " must be in a Cues", (Throwable) null);
        }
    }

    /* renamed from: k */
    private void m30918k(int i) throws C6249m2 {
        if (this.f25692u == null) {
            throw C6249m2.m36661a("Element " + i + " must be in a TrackEntry", (Throwable) null);
        }
    }

    /* renamed from: l */
    private void m30919l() {
        C5917a.m34875h(this.f25673b0);
    }

    /* renamed from: n */
    private C4192b0 m30920n(C5964s sVar, C5964s sVar2) {
        int i;
        if (this.f25688q == -1 || this.f25691t == -9223372036854775807L || sVar == null || sVar.mo20662c() == 0 || sVar2 == null || sVar2.mo20662c() != sVar.mo20662c()) {
            return new C4192b0.C4194b(this.f25691t);
        }
        int c = sVar.mo20662c();
        int[] iArr = new int[c];
        long[] jArr = new long[c];
        long[] jArr2 = new long[c];
        long[] jArr3 = new long[c];
        int i2 = 0;
        for (int i3 = 0; i3 < c; i3++) {
            jArr3[i3] = sVar.mo20661b(i3);
            jArr[i3] = this.f25688q + sVar2.mo20661b(i3);
        }
        while (true) {
            i = c - 1;
            if (i2 >= i) {
                break;
            }
            int i4 = i2 + 1;
            iArr[i2] = (int) (jArr[i4] - jArr[i2]);
            jArr2[i2] = jArr3[i4] - jArr3[i2];
            i2 = i4;
        }
        iArr[i] = (int) ((this.f25688q + this.f25687p) - jArr[i]);
        jArr2[i] = this.f25691t - jArr3[i];
        long j = jArr2[i];
        if (j <= 0) {
            C5961r.m35215i("MatroskaExtractor", "Discarding last cue point with unexpected duration: " + j);
            iArr = Arrays.copyOf(iArr, i);
            jArr = Arrays.copyOf(jArr, i);
            jArr2 = Arrays.copyOf(jArr2, i);
            jArr3 = Arrays.copyOf(jArr3, i);
        }
        return new C4197d(iArr, jArr, jArr2, jArr3);
    }

    /* renamed from: o */
    private void m30921o(C4861c cVar, long j, int i, int i2, int i3) {
        C4203f0 f0Var = cVar.f25718T;
        if (f0Var != null) {
            f0Var.mo17568c(cVar.f25722X, j, i, i2, i3, cVar.f25733j);
        } else {
            if ("S_TEXT/UTF8".equals(cVar.f25725b) || "S_TEXT/ASS".equals(cVar.f25725b) || "S_TEXT/WEBVTT".equals(cVar.f25725b)) {
                if (this.f25654K > 1) {
                    C5961r.m35215i("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j2 = this.f25652I;
                    if (j2 == -9223372036854775807L) {
                        C5961r.m35215i("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        m30908G(cVar.f25725b, j2, this.f25682k.mo20551d());
                        int e = this.f25682k.mo20552e();
                        while (true) {
                            if (e >= this.f25682k.mo20553f()) {
                                break;
                            } else if (this.f25682k.mo20551d()[e] == 0) {
                                this.f25682k.mo20545N(e);
                                break;
                            } else {
                                e++;
                            }
                        }
                        C4200e0 e0Var = cVar.f25722X;
                        C5918a0 a0Var = this.f25682k;
                        e0Var.mo6843d(a0Var, a0Var.mo20553f());
                        i2 += this.f25682k.mo20553f();
                    }
                }
            }
            if ((268435456 & i) != 0) {
                if (this.f25654K > 1) {
                    this.f25685n.mo20542K(0);
                } else {
                    int f = this.f25685n.mo20553f();
                    cVar.f25722X.mo6847f(this.f25685n, f, 2);
                    i2 += f;
                }
            }
            cVar.f25722X.mo6838a(j, i, i2, i3, cVar.f25733j);
        }
        this.f25649F = true;
    }

    /* renamed from: q */
    private static int[] m30922q(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        if (iArr.length >= i) {
            return iArr;
        }
        return new int[Math.max(iArr.length * 2, i)];
    }

    /* renamed from: r */
    private int m30923r() {
        int i = this.f25663T;
        m30906E();
        return i;
    }

    /* renamed from: t */
    private static byte[] m30924t(long j, String str, long j2) {
        C5917a.m34868a(j != -9223372036854775807L);
        int i = (int) (j / 3600000000L);
        long j3 = j - ((((long) i) * 3600) * 1000000);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - ((((long) i2) * 60) * 1000000);
        int i3 = (int) (j4 / 1000000);
        return C5953m0.m35145m0(String.format(Locale.US, str, new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (((long) i3) * 1000000)) / j2))}));
    }

    /* renamed from: z */
    private static boolean m30925z(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -2095576542:
                if (str.equals("V_MPEG4/ISO/AP")) {
                    c = 0;
                    break;
                }
                break;
            case -2095575984:
                if (str.equals("V_MPEG4/ISO/SP")) {
                    c = 1;
                    break;
                }
                break;
            case -1985379776:
                if (str.equals("A_MS/ACM")) {
                    c = 2;
                    break;
                }
                break;
            case -1784763192:
                if (str.equals("A_TRUEHD")) {
                    c = 3;
                    break;
                }
                break;
            case -1730367663:
                if (str.equals("A_VORBIS")) {
                    c = 4;
                    break;
                }
                break;
            case -1482641358:
                if (str.equals("A_MPEG/L2")) {
                    c = 5;
                    break;
                }
                break;
            case -1482641357:
                if (str.equals("A_MPEG/L3")) {
                    c = 6;
                    break;
                }
                break;
            case -1373388978:
                if (str.equals("V_MS/VFW/FOURCC")) {
                    c = 7;
                    break;
                }
                break;
            case -933872740:
                if (str.equals("S_DVBSUB")) {
                    c = 8;
                    break;
                }
                break;
            case -538363189:
                if (str.equals("V_MPEG4/ISO/ASP")) {
                    c = 9;
                    break;
                }
                break;
            case -538363109:
                if (str.equals("V_MPEG4/ISO/AVC")) {
                    c = 10;
                    break;
                }
                break;
            case -425012669:
                if (str.equals("S_VOBSUB")) {
                    c = 11;
                    break;
                }
                break;
            case -356037306:
                if (str.equals("A_DTS/LOSSLESS")) {
                    c = 12;
                    break;
                }
                break;
            case 62923557:
                if (str.equals("A_AAC")) {
                    c = 13;
                    break;
                }
                break;
            case 62923603:
                if (str.equals("A_AC3")) {
                    c = 14;
                    break;
                }
                break;
            case 62927045:
                if (str.equals("A_DTS")) {
                    c = 15;
                    break;
                }
                break;
            case 82318131:
                if (str.equals("V_AV1")) {
                    c = 16;
                    break;
                }
                break;
            case 82338133:
                if (str.equals("V_VP8")) {
                    c = 17;
                    break;
                }
                break;
            case 82338134:
                if (str.equals("V_VP9")) {
                    c = 18;
                    break;
                }
                break;
            case 99146302:
                if (str.equals("S_HDMV/PGS")) {
                    c = 19;
                    break;
                }
                break;
            case 444813526:
                if (str.equals("V_THEORA")) {
                    c = 20;
                    break;
                }
                break;
            case 542569478:
                if (str.equals("A_DTS/EXPRESS")) {
                    c = 21;
                    break;
                }
                break;
            case 635596514:
                if (str.equals("A_PCM/FLOAT/IEEE")) {
                    c = 22;
                    break;
                }
                break;
            case 725948237:
                if (str.equals("A_PCM/INT/BIG")) {
                    c = 23;
                    break;
                }
                break;
            case 725957860:
                if (str.equals("A_PCM/INT/LIT")) {
                    c = 24;
                    break;
                }
                break;
            case 738597099:
                if (str.equals("S_TEXT/ASS")) {
                    c = 25;
                    break;
                }
                break;
            case 855502857:
                if (str.equals("V_MPEGH/ISO/HEVC")) {
                    c = 26;
                    break;
                }
                break;
            case 1045209816:
                if (str.equals("S_TEXT/WEBVTT")) {
                    c = 27;
                    break;
                }
                break;
            case 1422270023:
                if (str.equals("S_TEXT/UTF8")) {
                    c = 28;
                    break;
                }
                break;
            case 1809237540:
                if (str.equals("V_MPEG2")) {
                    c = 29;
                    break;
                }
                break;
            case 1950749482:
                if (str.equals("A_EAC3")) {
                    c = 30;
                    break;
                }
                break;
            case 1950789798:
                if (str.equals("A_FLAC")) {
                    c = 31;
                    break;
                }
                break;
            case 1951062397:
                if (str.equals("A_OPUS")) {
                    c = ' ';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case ' ':
                return true;
            default:
                return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public boolean mo18603A(int i) {
        return i == 357149030 || i == 524531317 || i == 475249515 || i == 374648427;
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public void mo18604H(int i, long j, long j2) throws C6249m2 {
        m30919l();
        if (i == 160) {
            this.f25660Q = false;
            this.f25661R = 0;
        } else if (i == 174) {
            this.f25692u = new C4861c();
        } else if (i == 187) {
            this.f25648E = false;
        } else if (i == 19899) {
            this.f25694w = -1;
            this.f25695x = -1;
        } else if (i == 20533) {
            mo18609u(i).f25731h = true;
        } else if (i == 21968) {
            mo18609u(i).f25747x = true;
        } else if (i == 408125543) {
            long j3 = this.f25688q;
            if (j3 == -1 || j3 == j) {
                this.f25688q = j;
                this.f25687p = j2;
                return;
            }
            throw C6249m2.m36661a("Multiple Segment elements not supported", (Throwable) null);
        } else if (i == 475249515) {
            this.f25646C = new C5964s();
            this.f25647D = new C5964s();
        } else if (i != 524531317 || this.f25693v) {
        } else {
            if (!this.f25675d || this.f25697z == -1) {
                this.f25673b0.mo6781l(new C4192b0.C4194b(this.f25691t));
                this.f25693v = true;
                return;
            }
            this.f25696y = true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public void mo18605I(int i, String str) throws C6249m2 {
        if (i == 134) {
            mo18609u(i).f25725b = str;
        } else if (i != 17026) {
            if (i == 21358) {
                mo18609u(i).f25724a = str;
            } else if (i == 2274716) {
                String unused = mo18609u(i).f25721W = str;
            }
        } else if (!"webm".equals(str) && !"matroska".equals(str)) {
            throw C6249m2.m36661a("DocType " + str + " not supported", (Throwable) null);
        }
    }

    /* renamed from: a */
    public final void mo17579a() {
    }

    /* renamed from: c */
    public void mo17580c(long j, long j2) {
        this.f25645B = -9223372036854775807L;
        this.f25650G = 0;
        this.f25670a.reset();
        this.f25672b.mo18620e();
        m30906E();
        for (int i = 0; i < this.f25674c.size(); i++) {
            this.f25674c.valueAt(i).mo18616n();
        }
    }

    /* renamed from: d */
    public final void mo17581d(C4217n nVar) {
        this.f25673b0 = nVar;
    }

    /* renamed from: e */
    public final int mo17582e(C4216m mVar, C4190a0 a0Var) throws IOException {
        this.f25649F = false;
        boolean z = true;
        while (z && !this.f25649F) {
            z = this.f25670a.mo18593b(mVar);
            if (z && m30904C(a0Var, mVar.mo17554c())) {
                return 1;
            }
        }
        if (z) {
            return 0;
        }
        for (int i = 0; i < this.f25674c.size(); i++) {
            C4861c valueAt = this.f25674c.valueAt(i);
            valueAt.m30955f();
            valueAt.mo18615j();
        }
        return -1;
    }

    /* renamed from: h */
    public final boolean mo17583h(C4216m mVar) throws IOException {
        return new C4862f().mo18617b(mVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo18606m(int i, int i2, C4216m mVar) throws IOException {
        C4861c cVar;
        C4861c cVar2;
        C4861c cVar3;
        long j;
        long j2;
        int i3;
        byte b;
        int[] iArr;
        int i4 = i;
        int i5 = i2;
        C4216m mVar2 = mVar;
        int i6 = 0;
        int i7 = 1;
        if (i4 == 161 || i4 == 163) {
            if (this.f25650G == 0) {
                this.f25656M = (int) this.f25672b.mo18619d(mVar2, false, true, 8);
                this.f25657N = this.f25672b.mo18618b();
                this.f25652I = -9223372036854775807L;
                this.f25650G = 1;
                this.f25678g.mo20542K(0);
            }
            C4861c cVar4 = this.f25674c.get(this.f25656M);
            if (cVar4 == null) {
                mVar2.mo17561k(i5 - this.f25657N);
                this.f25650G = 0;
                return;
            }
            cVar4.m30955f();
            if (this.f25650G == 1) {
                m30905D(mVar2, 3);
                int i8 = (this.f25678g.mo20551d()[2] & 6) >> 1;
                byte b2 = 255;
                if (i8 == 0) {
                    this.f25654K = 1;
                    int[] q = m30922q(this.f25655L, 1);
                    this.f25655L = q;
                    q[0] = (i5 - this.f25657N) - 3;
                } else {
                    int i9 = 4;
                    m30905D(mVar2, 4);
                    int i10 = (this.f25678g.mo20551d()[3] & 255) + 1;
                    this.f25654K = i10;
                    int[] q2 = m30922q(this.f25655L, i10);
                    this.f25655L = q2;
                    if (i8 == 2) {
                        int i11 = this.f25654K;
                        Arrays.fill(q2, 0, i11, ((i5 - this.f25657N) - 4) / i11);
                    } else if (i8 == 1) {
                        int i12 = 0;
                        int i13 = 0;
                        while (true) {
                            i3 = this.f25654K;
                            if (i12 >= i3 - 1) {
                                break;
                            }
                            this.f25655L[i12] = 0;
                            do {
                                i9++;
                                m30905D(mVar2, i9);
                                b = this.f25678g.mo20551d()[i9 - 1] & 255;
                                iArr = this.f25655L;
                                iArr[i12] = iArr[i12] + b;
                            } while (b == 255);
                            i13 += iArr[i12];
                            i12++;
                        }
                        this.f25655L[i3 - 1] = ((i5 - this.f25657N) - i9) - i13;
                    } else if (i8 == 3) {
                        int i14 = 0;
                        int i15 = 0;
                        while (true) {
                            int i16 = this.f25654K;
                            if (i14 >= i16 - 1) {
                                cVar2 = cVar4;
                                this.f25655L[i16 - 1] = ((i5 - this.f25657N) - i9) - i15;
                                break;
                            }
                            this.f25655L[i14] = i6;
                            i9++;
                            m30905D(mVar2, i9);
                            int i17 = i9 - 1;
                            if (this.f25678g.mo20551d()[i17] != 0) {
                                int i18 = 0;
                                while (true) {
                                    if (i18 >= 8) {
                                        cVar3 = cVar4;
                                        j = 0;
                                        break;
                                    }
                                    int i19 = i7 << (7 - i18);
                                    if ((this.f25678g.mo20551d()[i17] & i19) != 0) {
                                        int i20 = i9 + i18;
                                        m30905D(mVar2, i20);
                                        cVar3 = cVar4;
                                        long j3 = (long) ((~i19) & this.f25678g.mo20551d()[i17] & b2);
                                        int i21 = i17 + 1;
                                        while (true) {
                                            j2 = j3;
                                            if (i21 >= i20) {
                                                break;
                                            }
                                            j3 = (j2 << 8) | ((long) (this.f25678g.mo20551d()[i21] & b2));
                                            i21++;
                                            i20 = i20;
                                            b2 = 255;
                                        }
                                        int i22 = i20;
                                        if (i14 > 0) {
                                            j2 -= (1 << ((i18 * 7) + 6)) - 1;
                                        }
                                        j = j2;
                                        i9 = i22;
                                    } else {
                                        C4861c cVar5 = cVar4;
                                        i18++;
                                        i7 = 1;
                                        b2 = 255;
                                    }
                                }
                                if (j >= -2147483648L && j <= 2147483647L) {
                                    int i23 = (int) j;
                                    int[] iArr2 = this.f25655L;
                                    if (i14 != 0) {
                                        i23 += iArr2[i14 - 1];
                                    }
                                    iArr2[i14] = i23;
                                    i15 += iArr2[i14];
                                    i14++;
                                    cVar4 = cVar3;
                                    i6 = 0;
                                    i7 = 1;
                                    b2 = 255;
                                }
                            } else {
                                throw C6249m2.m36661a("No valid varint length mask found", (Throwable) null);
                            }
                        }
                        throw C6249m2.m36661a("EBML lacing sample size out of range.", (Throwable) null);
                    } else {
                        throw C6249m2.m36661a("Unexpected lacing value: " + i8, (Throwable) null);
                    }
                }
                cVar2 = cVar4;
                this.f25651H = this.f25645B + m30907F((long) ((this.f25678g.mo20551d()[0] << 8) | (this.f25678g.mo20551d()[1] & 255)));
                cVar = cVar2;
                this.f25658O = (cVar.f25727d == 2 || (i4 == 163 && (this.f25678g.mo20551d()[2] & C8843b4.f36445d) == 128)) ? 1 : 0;
                this.f25650G = 2;
                this.f25653J = 0;
            } else {
                cVar = cVar4;
            }
            if (i4 == 163) {
                while (true) {
                    int i24 = this.f25653J;
                    if (i24 < this.f25654K) {
                        m30921o(cVar, ((long) ((this.f25653J * cVar.f25728e) / AdError.NETWORK_ERROR_CODE)) + this.f25651H, this.f25658O, m30909J(mVar2, cVar, this.f25655L[i24], false), 0);
                        this.f25653J++;
                    } else {
                        this.f25650G = 0;
                        return;
                    }
                }
            } else {
                while (true) {
                    int i25 = this.f25653J;
                    if (i25 < this.f25654K) {
                        int[] iArr3 = this.f25655L;
                        iArr3[i25] = m30909J(mVar2, cVar, iArr3[i25], true);
                        this.f25653J++;
                    } else {
                        return;
                    }
                }
            }
        } else if (i4 != 165) {
            if (i4 == 16877) {
                mo18611w(mo18609u(i), mVar2, i5);
            } else if (i4 == 16981) {
                m30918k(i);
                byte[] bArr = new byte[i5];
                this.f25692u.f25732i = bArr;
                mVar2.readFully(bArr, 0, i5);
            } else if (i4 == 18402) {
                byte[] bArr2 = new byte[i5];
                mVar2.readFully(bArr2, 0, i5);
                mo18609u(i).f25733j = new C4200e0.C4201a(1, bArr2, 0, 0);
            } else if (i4 == 21419) {
                Arrays.fill(this.f25680i.mo20551d(), (byte) 0);
                mVar2.readFully(this.f25680i.mo20551d(), 4 - i5, i5);
                this.f25680i.mo20546O(0);
                this.f25694w = (int) this.f25680i.mo20536E();
            } else if (i4 == 25506) {
                m30918k(i);
                byte[] bArr3 = new byte[i5];
                this.f25692u.f25734k = bArr3;
                mVar2.readFully(bArr3, 0, i5);
            } else if (i4 == 30322) {
                m30918k(i);
                byte[] bArr4 = new byte[i5];
                this.f25692u.f25745v = bArr4;
                mVar2.readFully(bArr4, 0, i5);
            } else {
                throw C6249m2.m36661a("Unexpected id: " + i4, (Throwable) null);
            }
        } else if (this.f25650G == 2) {
            mo18612x(this.f25674c.get(this.f25656M), this.f25659P, mVar2, i5);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo18607p(int i) throws C6249m2 {
        m30919l();
        if (i != 160) {
            if (i == 174) {
                C4861c cVar = (C4861c) C5917a.m34875h(this.f25692u);
                String str = cVar.f25725b;
                if (str != null) {
                    if (m30925z(str)) {
                        cVar.mo18614i(this.f25673b0, cVar.f25726c);
                        this.f25674c.put(cVar.f25726c, cVar);
                    }
                    this.f25692u = null;
                    return;
                }
                throw C6249m2.m36661a("CodecId is missing in TrackEntry element", (Throwable) null);
            } else if (i == 19899) {
                int i2 = this.f25694w;
                if (i2 != -1) {
                    long j = this.f25695x;
                    if (j != -1) {
                        if (i2 == 475249515) {
                            this.f25697z = j;
                            return;
                        }
                        return;
                    }
                }
                throw C6249m2.m36661a("Mandatory element SeekID or SeekPosition not found", (Throwable) null);
            } else if (i == 25152) {
                m30918k(i);
                C4861c cVar2 = this.f25692u;
                if (!cVar2.f25731h) {
                    return;
                }
                if (cVar2.f25733j != null) {
                    cVar2.f25735l = new C4035m(new C4035m.C4037b(C6227i.f29960a, "video/webm", this.f25692u.f25733j.f23501b));
                    return;
                }
                throw C6249m2.m36661a("Encrypted Track found but ContentEncKeyID was not found", (Throwable) null);
            } else if (i == 28032) {
                m30918k(i);
                C4861c cVar3 = this.f25692u;
                if (cVar3.f25731h && cVar3.f25732i != null) {
                    throw C6249m2.m36661a("Combining encryption and compression is not supported", (Throwable) null);
                }
            } else if (i == 357149030) {
                if (this.f25689r == -9223372036854775807L) {
                    this.f25689r = 1000000;
                }
                long j2 = this.f25690s;
                if (j2 != -9223372036854775807L) {
                    this.f25691t = m30907F(j2);
                }
            } else if (i != 374648427) {
                if (i == 475249515) {
                    if (!this.f25693v) {
                        this.f25673b0.mo6781l(m30920n(this.f25646C, this.f25647D));
                        this.f25693v = true;
                    }
                    this.f25646C = null;
                    this.f25647D = null;
                }
            } else if (this.f25674c.size() != 0) {
                this.f25673b0.mo6782n();
            } else {
                throw C6249m2.m36661a("No valid tracks were found", (Throwable) null);
            }
        } else if (this.f25650G == 2) {
            C4861c cVar4 = this.f25674c.get(this.f25656M);
            cVar4.m30955f();
            if (this.f25661R > 0 && "A_OPUS".equals(cVar4.f25725b)) {
                this.f25685n.mo20543L(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.f25661R).array());
            }
            int i3 = 0;
            for (int i4 = 0; i4 < this.f25654K; i4++) {
                i3 += this.f25655L[i4];
            }
            int i5 = 0;
            while (i5 < this.f25654K) {
                long j3 = this.f25651H + ((long) ((cVar4.f25728e * i5) / AdError.NETWORK_ERROR_CODE));
                int i6 = this.f25658O;
                if (i5 == 0 && !this.f25660Q) {
                    i6 |= 1;
                }
                int i7 = this.f25655L[i5];
                int i8 = i3 - i7;
                m30921o(cVar4, j3, i6, i7, i8);
                i5++;
                i3 = i8;
            }
            this.f25650G = 0;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo18608s(int i, double d) throws C6249m2 {
        if (i == 181) {
            mo18609u(i).f25715Q = (int) d;
        } else if (i != 17545) {
            switch (i) {
                case 21969:
                    mo18609u(i).f25702D = (float) d;
                    return;
                case 21970:
                    mo18609u(i).f25703E = (float) d;
                    return;
                case 21971:
                    mo18609u(i).f25704F = (float) d;
                    return;
                case 21972:
                    mo18609u(i).f25705G = (float) d;
                    return;
                case 21973:
                    mo18609u(i).f25706H = (float) d;
                    return;
                case 21974:
                    mo18609u(i).f25707I = (float) d;
                    return;
                case 21975:
                    mo18609u(i).f25708J = (float) d;
                    return;
                case 21976:
                    mo18609u(i).f25709K = (float) d;
                    return;
                case 21977:
                    mo18609u(i).f25710L = (float) d;
                    return;
                case 21978:
                    mo18609u(i).f25711M = (float) d;
                    return;
                default:
                    switch (i) {
                        case 30323:
                            mo18609u(i).f25742s = (float) d;
                            return;
                        case 30324:
                            mo18609u(i).f25743t = (float) d;
                            return;
                        case 30325:
                            mo18609u(i).f25744u = (float) d;
                            return;
                        default:
                            return;
                    }
            }
        } else {
            this.f25690s = (long) d;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public C4861c mo18609u(int i) throws C6249m2 {
        m30918k(i);
        return this.f25692u;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public int mo18610v(int i) {
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

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public void mo18611w(C4861c cVar, C4216m mVar, int i) throws IOException {
        if (cVar.f25730g == 1685485123 || cVar.f25730g == 1685480259) {
            byte[] bArr = new byte[i];
            cVar.f25712N = bArr;
            mVar.readFully(bArr, 0, i);
            return;
        }
        mVar.mo17561k(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public void mo18612x(C4861c cVar, int i, C4216m mVar, int i2) throws IOException {
        if (i != 4 || !"V_VP9".equals(cVar.f25725b)) {
            mVar.mo17561k(i2);
            return;
        }
        this.f25685n.mo20542K(i2);
        mVar.readFully(this.f25685n.mo20551d(), 0, i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public void mo18613y(int i, long j) throws C6249m2 {
        if (i != 20529) {
            if (i != 20530) {
                boolean z = false;
                switch (i) {
                    case 131:
                        mo18609u(i).f25727d = (int) j;
                        return;
                    case 136:
                        C4861c u = mo18609u(i);
                        if (j == 1) {
                            z = true;
                        }
                        u.f25720V = z;
                        return;
                    case 155:
                        this.f25652I = m30907F(j);
                        return;
                    case 159:
                        mo18609u(i).f25713O = (int) j;
                        return;
                    case 176:
                        mo18609u(i).f25736m = (int) j;
                        return;
                    case 179:
                        m30917j(i);
                        this.f25646C.mo20660a(m30907F(j));
                        return;
                    case 186:
                        mo18609u(i).f25737n = (int) j;
                        return;
                    case 215:
                        mo18609u(i).f25726c = (int) j;
                        return;
                    case 231:
                        this.f25645B = m30907F(j);
                        return;
                    case 238:
                        this.f25659P = (int) j;
                        return;
                    case 241:
                        if (!this.f25648E) {
                            m30917j(i);
                            this.f25647D.mo20660a(j);
                            this.f25648E = true;
                            return;
                        }
                        return;
                    case 251:
                        this.f25660Q = true;
                        return;
                    case 16871:
                        int unused = mo18609u(i).f25730g = (int) j;
                        return;
                    case 16980:
                        if (j != 3) {
                            throw C6249m2.m36661a("ContentCompAlgo " + j + " not supported", (Throwable) null);
                        }
                        return;
                    case 17029:
                        if (j < 1 || j > 2) {
                            throw C6249m2.m36661a("DocTypeReadVersion " + j + " not supported", (Throwable) null);
                        }
                        return;
                    case 17143:
                        if (j != 1) {
                            throw C6249m2.m36661a("EBMLReadVersion " + j + " not supported", (Throwable) null);
                        }
                        return;
                    case 18401:
                        if (j != 5) {
                            throw C6249m2.m36661a("ContentEncAlgo " + j + " not supported", (Throwable) null);
                        }
                        return;
                    case 18408:
                        if (j != 1) {
                            throw C6249m2.m36661a("AESSettingsCipherMode " + j + " not supported", (Throwable) null);
                        }
                        return;
                    case 21420:
                        this.f25695x = j + this.f25688q;
                        return;
                    case 21432:
                        int i2 = (int) j;
                        m30918k(i);
                        if (i2 == 0) {
                            this.f25692u.f25746w = 0;
                            return;
                        } else if (i2 == 1) {
                            this.f25692u.f25746w = 2;
                            return;
                        } else if (i2 == 3) {
                            this.f25692u.f25746w = 1;
                            return;
                        } else if (i2 == 15) {
                            this.f25692u.f25746w = 3;
                            return;
                        } else {
                            return;
                        }
                    case 21680:
                        mo18609u(i).f25738o = (int) j;
                        return;
                    case 21682:
                        mo18609u(i).f25740q = (int) j;
                        return;
                    case 21690:
                        mo18609u(i).f25739p = (int) j;
                        return;
                    case 21930:
                        C4861c u2 = mo18609u(i);
                        if (j == 1) {
                            z = true;
                        }
                        u2.f25719U = z;
                        return;
                    case 21998:
                        mo18609u(i).f25729f = (int) j;
                        return;
                    case 22186:
                        mo18609u(i).f25716R = j;
                        return;
                    case 22203:
                        mo18609u(i).f25717S = j;
                        return;
                    case 25188:
                        mo18609u(i).f25714P = (int) j;
                        return;
                    case 30114:
                        this.f25661R = j;
                        return;
                    case 30321:
                        m30918k(i);
                        int i3 = (int) j;
                        if (i3 == 0) {
                            this.f25692u.f25741r = 0;
                            return;
                        } else if (i3 == 1) {
                            this.f25692u.f25741r = 1;
                            return;
                        } else if (i3 == 2) {
                            this.f25692u.f25741r = 2;
                            return;
                        } else if (i3 == 3) {
                            this.f25692u.f25741r = 3;
                            return;
                        } else {
                            return;
                        }
                    case 2352003:
                        mo18609u(i).f25728e = (int) j;
                        return;
                    case 2807729:
                        this.f25689r = j;
                        return;
                    default:
                        switch (i) {
                            case 21945:
                                m30918k(i);
                                int i4 = (int) j;
                                if (i4 == 1) {
                                    this.f25692u.f25699A = 2;
                                    return;
                                } else if (i4 == 2) {
                                    this.f25692u.f25699A = 1;
                                    return;
                                } else {
                                    return;
                                }
                            case 21946:
                                m30918k(i);
                                int c = C6053c.m35499c((int) j);
                                if (c != -1) {
                                    this.f25692u.f25749z = c;
                                    return;
                                }
                                return;
                            case 21947:
                                m30918k(i);
                                this.f25692u.f25747x = true;
                                int b = C6053c.m35498b((int) j);
                                if (b != -1) {
                                    this.f25692u.f25748y = b;
                                    return;
                                }
                                return;
                            case 21948:
                                mo18609u(i).f25700B = (int) j;
                                return;
                            case 21949:
                                mo18609u(i).f25701C = (int) j;
                                return;
                            default:
                                return;
                        }
                }
            } else if (j != 1) {
                throw C6249m2.m36661a("ContentEncodingScope " + j + " not supported", (Throwable) null);
            }
        } else if (j != 0) {
            throw C6249m2.m36661a("ContentEncodingOrder " + j + " not supported", (Throwable) null);
        }
    }

    public C4858e(int i) {
        this(new C4853a(), i);
    }

    C4858e(C4857c cVar, int i) {
        this.f25688q = -1;
        this.f25689r = -9223372036854775807L;
        this.f25690s = -9223372036854775807L;
        this.f25691t = -9223372036854775807L;
        this.f25697z = -1;
        this.f25644A = -1;
        this.f25645B = -9223372036854775807L;
        this.f25670a = cVar;
        cVar.mo18592a(new C4860b());
        this.f25675d = (i & 1) == 0;
        this.f25672b = new C4863g();
        this.f25674c = new SparseArray<>();
        this.f25678g = new C5918a0(4);
        this.f25679h = new C5918a0(ByteBuffer.allocate(4).putInt(-1).array());
        this.f25680i = new C5918a0(4);
        this.f25676e = new C5918a0(C5970w.f29150a);
        this.f25677f = new C5918a0(4);
        this.f25681j = new C5918a0();
        this.f25682k = new C5918a0();
        this.f25683l = new C5918a0(8);
        this.f25684m = new C5918a0();
        this.f25685n = new C5918a0();
        this.f25655L = new int[1];
    }
}
