package p113p2;

import android.util.Pair;
import com.pichillilorenzo.flutter_inappwebview.C8710R;
import java.io.IOException;
import p014b2.C1652m0;
import p037e2.C4190a0;
import p037e2.C4200e0;
import p037e2.C4215l;
import p037e2.C4216m;
import p037e2.C4217n;
import p037e2.C4221r;
import p161w3.C5917a;
import p161w3.C5918a0;
import p161w3.C5953m0;
import p161w3.C5961r;
import p177z1.C6249m2;
import p177z1.C6272r1;

/* renamed from: p2.b */
/* compiled from: WavExtractor */
public final class C5262b implements C4215l {

    /* renamed from: h */
    public static final C4221r f27131h = C12121a.f45169b;

    /* renamed from: a */
    private C4217n f27132a;

    /* renamed from: b */
    private C4200e0 f27133b;

    /* renamed from: c */
    private int f27134c = 0;

    /* renamed from: d */
    private long f27135d = -1;

    /* renamed from: e */
    private C5264b f27136e;

    /* renamed from: f */
    private int f27137f = -1;

    /* renamed from: g */
    private long f27138g = -1;

    /* renamed from: p2.b$a */
    /* compiled from: WavExtractor */
    private static final class C5263a implements C5264b {

        /* renamed from: m */
        private static final int[] f27139m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

        /* renamed from: n */
        private static final int[] f27140n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, C8710R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

        /* renamed from: a */
        private final C4217n f27141a;

        /* renamed from: b */
        private final C4200e0 f27142b;

        /* renamed from: c */
        private final C5266c f27143c;

        /* renamed from: d */
        private final int f27144d;

        /* renamed from: e */
        private final byte[] f27145e;

        /* renamed from: f */
        private final C5918a0 f27146f;

        /* renamed from: g */
        private final int f27147g;

        /* renamed from: h */
        private final C6272r1 f27148h;

        /* renamed from: i */
        private int f27149i;

        /* renamed from: j */
        private long f27150j;

        /* renamed from: k */
        private int f27151k;

        /* renamed from: l */
        private long f27152l;

        public C5263a(C4217n nVar, C4200e0 e0Var, C5266c cVar) throws C6249m2 {
            this.f27141a = nVar;
            this.f27142b = e0Var;
            this.f27143c = cVar;
            int max = Math.max(1, cVar.f27163c / 10);
            this.f27147g = max;
            C5918a0 a0Var = new C5918a0(cVar.f27167g);
            a0Var.mo20568u();
            int u = a0Var.mo20568u();
            this.f27144d = u;
            int i = cVar.f27162b;
            int i2 = (((cVar.f27165e - (i * 4)) * 8) / (cVar.f27166f * i)) + 1;
            if (u == i2) {
                int l = C5953m0.m35142l(max, u);
                this.f27145e = new byte[(cVar.f27165e * l)];
                this.f27146f = new C5918a0(l * m32496h(u, i));
                int i3 = ((cVar.f27163c * cVar.f27165e) * 8) / u;
                this.f27148h = new C6272r1.C6274b().mo21517e0("audio/raw").mo21493G(i3).mo21512Z(i3).mo21509W(m32496h(max, i)).mo21494H(cVar.f27162b).mo21518f0(cVar.f27163c).mo21511Y(2).mo21491E();
                return;
            }
            throw C6249m2.m36661a("Expected frames per block: " + i2 + "; got: " + u, (Throwable) null);
        }

        /* renamed from: d */
        private void m32492d(byte[] bArr, int i, C5918a0 a0Var) {
            for (int i2 = 0; i2 < i; i2++) {
                for (int i3 = 0; i3 < this.f27143c.f27162b; i3++) {
                    m32493e(bArr, i2, i3, a0Var.mo20551d());
                }
            }
            int g = m32495g(this.f27144d * i);
            a0Var.mo20546O(0);
            a0Var.mo20545N(g);
        }

        /* renamed from: e */
        private void m32493e(byte[] bArr, int i, int i2, byte[] bArr2) {
            C5266c cVar = this.f27143c;
            int i3 = cVar.f27165e;
            int i4 = cVar.f27162b;
            int i5 = (i * i3) + (i2 * 4);
            int i6 = (i4 * 4) + i5;
            int i7 = (i3 / i4) - 4;
            int i8 = (short) (((bArr[i5 + 1] & 255) << 8) | (bArr[i5] & 255));
            int min = Math.min(bArr[i5 + 2] & 255, 88);
            int i9 = f27140n[min];
            int i10 = ((i * this.f27144d * i4) + i2) * 2;
            bArr2[i10] = (byte) (i8 & 255);
            bArr2[i10 + 1] = (byte) (i8 >> 8);
            for (int i11 = 0; i11 < i7 * 2; i11++) {
                byte b = bArr[((i11 / 8) * i4 * 4) + i6 + ((i11 / 2) % 4)] & 255;
                int i12 = i11 % 2 == 0 ? b & 15 : b >> 4;
                int i13 = ((((i12 & 7) * 2) + 1) * i9) >> 3;
                if ((i12 & 8) != 0) {
                    i13 = -i13;
                }
                i8 = C5953m0.m35152q(i8 + i13, -32768, 32767);
                i10 += i4 * 2;
                bArr2[i10] = (byte) (i8 & 255);
                bArr2[i10 + 1] = (byte) (i8 >> 8);
                int i14 = min + f27139m[i12];
                int[] iArr = f27140n;
                min = C5953m0.m35152q(i14, 0, iArr.length - 1);
                i9 = iArr[min];
            }
        }

        /* renamed from: f */
        private int m32494f(int i) {
            return i / (this.f27143c.f27162b * 2);
        }

        /* renamed from: g */
        private int m32495g(int i) {
            return m32496h(i, this.f27143c.f27162b);
        }

        /* renamed from: h */
        private static int m32496h(int i, int i2) {
            return i * 2 * i2;
        }

        /* renamed from: i */
        private void m32497i(int i) {
            long N0 = this.f27150j + C5953m0.m35095N0(this.f27152l, 1000000, (long) this.f27143c.f27163c);
            int g = m32495g(i);
            this.f27142b.mo6838a(N0, 1, g, this.f27151k - g, (C4200e0.C4201a) null);
            this.f27152l += (long) i;
            this.f27151k -= g;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0048  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x003f A[EDGE_INSN: B:22:0x003f->B:10:0x003f ?: BREAK  , SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:5:0x0021  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo19249a(p037e2.C4216m r7, long r8) throws java.io.IOException {
            /*
                r6 = this;
                int r0 = r6.f27147g
                int r1 = r6.f27151k
                int r1 = r6.m32494f(r1)
                int r0 = r0 - r1
                int r1 = r6.f27144d
                int r0 = p161w3.C5953m0.m35142l(r0, r1)
                p2.c r1 = r6.f27143c
                int r1 = r1.f27165e
                int r0 = r0 * r1
                r1 = 1
                r2 = 0
                int r4 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
                if (r4 != 0) goto L_0x001e
            L_0x001c:
                r2 = 1
                goto L_0x001f
            L_0x001e:
                r2 = 0
            L_0x001f:
                if (r2 != 0) goto L_0x003f
                int r3 = r6.f27149i
                if (r3 >= r0) goto L_0x003f
                int r3 = r0 - r3
                long r3 = (long) r3
                long r3 = java.lang.Math.min(r3, r8)
                int r4 = (int) r3
                byte[] r3 = r6.f27145e
                int r5 = r6.f27149i
                int r3 = r7.read(r3, r5, r4)
                r4 = -1
                if (r3 != r4) goto L_0x0039
                goto L_0x001c
            L_0x0039:
                int r4 = r6.f27149i
                int r4 = r4 + r3
                r6.f27149i = r4
                goto L_0x001f
            L_0x003f:
                int r7 = r6.f27149i
                p2.c r8 = r6.f27143c
                int r8 = r8.f27165e
                int r7 = r7 / r8
                if (r7 <= 0) goto L_0x0077
                byte[] r8 = r6.f27145e
                w3.a0 r9 = r6.f27146f
                r6.m32492d(r8, r7, r9)
                int r8 = r6.f27149i
                p2.c r9 = r6.f27143c
                int r9 = r9.f27165e
                int r7 = r7 * r9
                int r8 = r8 - r7
                r6.f27149i = r8
                w3.a0 r7 = r6.f27146f
                int r7 = r7.mo20553f()
                e2.e0 r8 = r6.f27142b
                w3.a0 r9 = r6.f27146f
                r8.mo6843d(r9, r7)
                int r8 = r6.f27151k
                int r8 = r8 + r7
                r6.f27151k = r8
                int r7 = r6.m32494f(r8)
                int r8 = r6.f27147g
                if (r7 < r8) goto L_0x0077
                r6.m32497i(r8)
            L_0x0077:
                if (r2 == 0) goto L_0x0084
                int r7 = r6.f27151k
                int r7 = r6.m32494f(r7)
                if (r7 <= 0) goto L_0x0084
                r6.m32497i(r7)
            L_0x0084:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: p113p2.C5262b.C5263a.mo19249a(e2.m, long):boolean");
        }

        /* renamed from: b */
        public void mo19250b(long j) {
            this.f27149i = 0;
            this.f27150j = j;
            this.f27151k = 0;
            this.f27152l = 0;
        }

        /* renamed from: c */
        public void mo19251c(int i, long j) {
            this.f27141a.mo6781l(new C5269e(this.f27143c, this.f27144d, (long) i, j));
            this.f27142b.mo6845e(this.f27148h);
        }
    }

    /* renamed from: p2.b$b */
    /* compiled from: WavExtractor */
    private interface C5264b {
        /* renamed from: a */
        boolean mo19249a(C4216m mVar, long j) throws IOException;

        /* renamed from: b */
        void mo19250b(long j);

        /* renamed from: c */
        void mo19251c(int i, long j) throws C6249m2;
    }

    /* renamed from: p2.b$c */
    /* compiled from: WavExtractor */
    private static final class C5265c implements C5264b {

        /* renamed from: a */
        private final C4217n f27153a;

        /* renamed from: b */
        private final C4200e0 f27154b;

        /* renamed from: c */
        private final C5266c f27155c;

        /* renamed from: d */
        private final C6272r1 f27156d;

        /* renamed from: e */
        private final int f27157e;

        /* renamed from: f */
        private long f27158f;

        /* renamed from: g */
        private int f27159g;

        /* renamed from: h */
        private long f27160h;

        public C5265c(C4217n nVar, C4200e0 e0Var, C5266c cVar, String str, int i) throws C6249m2 {
            this.f27153a = nVar;
            this.f27154b = e0Var;
            this.f27155c = cVar;
            int i2 = (cVar.f27162b * cVar.f27166f) / 8;
            if (cVar.f27165e == i2) {
                int i3 = cVar.f27163c;
                int i4 = i3 * i2 * 8;
                int max = Math.max(i2, (i3 * i2) / 10);
                this.f27157e = max;
                this.f27156d = new C6272r1.C6274b().mo21517e0(str).mo21493G(i4).mo21512Z(i4).mo21509W(max).mo21494H(cVar.f27162b).mo21518f0(cVar.f27163c).mo21511Y(i).mo21491E();
                return;
            }
            throw C6249m2.m36661a("Expected block size: " + i2 + "; got: " + cVar.f27165e, (Throwable) null);
        }

        /* renamed from: a */
        public boolean mo19249a(C4216m mVar, long j) throws IOException {
            int i;
            int i2;
            int i3;
            long j2 = j;
            while (true) {
                i = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
                if (i <= 0 || (i2 = this.f27159g) >= (i3 = this.f27157e)) {
                    C5266c cVar = this.f27155c;
                    int i4 = cVar.f27165e;
                    int i5 = this.f27159g / i4;
                } else {
                    int b = this.f27154b.mo6840b(mVar, (int) Math.min((long) (i3 - i2), j2), true);
                    if (b == -1) {
                        j2 = 0;
                    } else {
                        this.f27159g += b;
                        j2 -= (long) b;
                    }
                }
            }
            C5266c cVar2 = this.f27155c;
            int i42 = cVar2.f27165e;
            int i52 = this.f27159g / i42;
            if (i52 > 0) {
                int i6 = i52 * i42;
                int i7 = this.f27159g - i6;
                this.f27154b.mo6838a(this.f27158f + C5953m0.m35095N0(this.f27160h, 1000000, (long) cVar2.f27163c), 1, i6, i7, (C4200e0.C4201a) null);
                this.f27160h += (long) i52;
                this.f27159g = i7;
            }
            if (i <= 0) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public void mo19250b(long j) {
            this.f27158f = j;
            this.f27159g = 0;
            this.f27160h = 0;
        }

        /* renamed from: c */
        public void mo19251c(int i, long j) {
            this.f27153a.mo6781l(new C5269e(this.f27155c, 1, (long) i, j));
            this.f27154b.mo6845e(this.f27156d);
        }
    }

    /* renamed from: f */
    private void m32480f() {
        C5917a.m34875h(this.f27133b);
        C5953m0.m35138j(this.f27132a);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ C4215l[] m32481g() {
        return new C4215l[]{new C5262b()};
    }

    /* renamed from: i */
    private void m32482i(C4216m mVar) throws IOException {
        C5917a.m34873f(mVar.mo17554c() == 0);
        int i = this.f27137f;
        if (i != -1) {
            mVar.mo17561k(i);
            this.f27134c = 4;
        } else if (C5267d.m32507a(mVar)) {
            mVar.mo17561k((int) (mVar.mo17557f() - mVar.mo17554c()));
            this.f27134c = 1;
        } else {
            throw C6249m2.m36661a("Unsupported or unrecognized wav file type.", (Throwable) null);
        }
    }

    /* renamed from: j */
    private void m32483j(C4216m mVar) throws IOException {
        C5266c b = C5267d.m32508b(mVar);
        int i = b.f27161a;
        if (i == 17) {
            this.f27136e = new C5263a(this.f27132a, this.f27133b, b);
        } else if (i == 6) {
            this.f27136e = new C5265c(this.f27132a, this.f27133b, b, "audio/g711-alaw", -1);
        } else if (i == 7) {
            this.f27136e = new C5265c(this.f27132a, this.f27133b, b, "audio/g711-mlaw", -1);
        } else {
            int a = C1652m0.m7603a(i, b.f27166f);
            if (a != 0) {
                this.f27136e = new C5265c(this.f27132a, this.f27133b, b, "audio/raw", a);
            } else {
                throw C6249m2.m36664d("Unsupported WAV format type: " + b.f27161a);
            }
        }
        this.f27134c = 3;
    }

    /* renamed from: k */
    private void m32484k(C4216m mVar) throws IOException {
        this.f27135d = C5267d.m32509c(mVar);
        this.f27134c = 2;
    }

    /* renamed from: l */
    private int m32485l(C4216m mVar) throws IOException {
        C5917a.m34873f(this.f27138g != -1);
        if (((C5264b) C5917a.m34872e(this.f27136e)).mo19249a(mVar, this.f27138g - mVar.mo17554c())) {
            return -1;
        }
        return 0;
    }

    /* renamed from: m */
    private void m32486m(C4216m mVar) throws IOException {
        Pair<Long, Long> e = C5267d.m32511e(mVar);
        this.f27137f = ((Long) e.first).intValue();
        long longValue = ((Long) e.second).longValue();
        long j = this.f27135d;
        if (j != -1 && longValue == 4294967295L) {
            longValue = j;
        }
        this.f27138g = ((long) this.f27137f) + longValue;
        long b = mVar.mo17553b();
        if (b != -1 && this.f27138g > b) {
            C5961r.m35215i("WavExtractor", "Data exceeds input length: " + this.f27138g + ", " + b);
            this.f27138g = b;
        }
        ((C5264b) C5917a.m34872e(this.f27136e)).mo19251c(this.f27137f, this.f27138g);
        this.f27134c = 4;
    }

    /* renamed from: a */
    public void mo17579a() {
    }

    /* renamed from: c */
    public void mo17580c(long j, long j2) {
        this.f27134c = j == 0 ? 0 : 4;
        C5264b bVar = this.f27136e;
        if (bVar != null) {
            bVar.mo19250b(j2);
        }
    }

    /* renamed from: d */
    public void mo17581d(C4217n nVar) {
        this.f27132a = nVar;
        this.f27133b = nVar.mo6778f(0, 1);
        nVar.mo6782n();
    }

    /* renamed from: e */
    public int mo17582e(C4216m mVar, C4190a0 a0Var) throws IOException {
        m32480f();
        int i = this.f27134c;
        if (i == 0) {
            m32482i(mVar);
            return 0;
        } else if (i == 1) {
            m32484k(mVar);
            return 0;
        } else if (i == 2) {
            m32483j(mVar);
            return 0;
        } else if (i == 3) {
            m32486m(mVar);
            return 0;
        } else if (i == 4) {
            return m32485l(mVar);
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: h */
    public boolean mo17583h(C4216m mVar) throws IOException {
        return C5267d.m32507a(mVar);
    }
}
