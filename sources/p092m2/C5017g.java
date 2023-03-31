package p092m2;

import android.util.Pair;
import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;
import com.pichillilorenzo.flutter_inappwebview.C8710R;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import p014b2.C1618c;
import p030d2.C4035m;
import p037e2.C4190a0;
import p037e2.C4192b0;
import p037e2.C4195c;
import p037e2.C4197d;
import p037e2.C4200e0;
import p037e2.C4215l;
import p037e2.C4216m;
import p037e2.C4217n;
import p037e2.C4221r;
import p037e2.C4230x;
import p092m2.C5002a;
import p141t2.C5510c;
import p161w3.C5917a;
import p161w3.C5918a0;
import p161w3.C5940i0;
import p161w3.C5953m0;
import p161w3.C5961r;
import p161w3.C5970w;
import p177z1.C6249m2;
import p177z1.C6272r1;

/* renamed from: m2.g */
/* compiled from: FragmentedMp4Extractor */
public class C5017g implements C4215l {

    /* renamed from: I */
    public static final C4221r f26244I = C11799f.f44462b;

    /* renamed from: J */
    private static final byte[] f26245J = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* renamed from: K */
    private static final C6272r1 f26246K = new C6272r1.C6274b().mo21517e0("application/x-emsg").mo21491E();

    /* renamed from: A */
    private int f26247A;

    /* renamed from: B */
    private int f26248B;

    /* renamed from: C */
    private int f26249C;

    /* renamed from: D */
    private boolean f26250D;

    /* renamed from: E */
    private C4217n f26251E;

    /* renamed from: F */
    private C4200e0[] f26252F;

    /* renamed from: G */
    private C4200e0[] f26253G;

    /* renamed from: H */
    private boolean f26254H;

    /* renamed from: a */
    private final int f26255a;

    /* renamed from: b */
    private final C5028o f26256b;

    /* renamed from: c */
    private final List<C6272r1> f26257c;

    /* renamed from: d */
    private final SparseArray<C5019b> f26258d;

    /* renamed from: e */
    private final C5918a0 f26259e;

    /* renamed from: f */
    private final C5918a0 f26260f;

    /* renamed from: g */
    private final C5918a0 f26261g;

    /* renamed from: h */
    private final byte[] f26262h;

    /* renamed from: i */
    private final C5918a0 f26263i;

    /* renamed from: j */
    private final C5940i0 f26264j;

    /* renamed from: k */
    private final C5510c f26265k;

    /* renamed from: l */
    private final C5918a0 f26266l;

    /* renamed from: m */
    private final ArrayDeque<C5002a.C5003a> f26267m;

    /* renamed from: n */
    private final ArrayDeque<C5018a> f26268n;

    /* renamed from: o */
    private final C4200e0 f26269o;

    /* renamed from: p */
    private int f26270p;

    /* renamed from: q */
    private int f26271q;

    /* renamed from: r */
    private long f26272r;

    /* renamed from: s */
    private int f26273s;

    /* renamed from: t */
    private C5918a0 f26274t;

    /* renamed from: u */
    private long f26275u;

    /* renamed from: v */
    private int f26276v;

    /* renamed from: w */
    private long f26277w;

    /* renamed from: x */
    private long f26278x;

    /* renamed from: y */
    private long f26279y;

    /* renamed from: z */
    private C5019b f26280z;

    /* renamed from: m2.g$a */
    /* compiled from: FragmentedMp4Extractor */
    private static final class C5018a {

        /* renamed from: a */
        public final long f26281a;

        /* renamed from: b */
        public final boolean f26282b;

        /* renamed from: c */
        public final int f26283c;

        public C5018a(long j, boolean z, int i) {
            this.f26281a = j;
            this.f26282b = z;
            this.f26283c = i;
        }
    }

    /* renamed from: m2.g$b */
    /* compiled from: FragmentedMp4Extractor */
    private static final class C5019b {

        /* renamed from: a */
        public final C4200e0 f26284a;

        /* renamed from: b */
        public final C5030q f26285b = new C5030q();

        /* renamed from: c */
        public final C5918a0 f26286c = new C5918a0();

        /* renamed from: d */
        public C5031r f26287d;

        /* renamed from: e */
        public C5013c f26288e;

        /* renamed from: f */
        public int f26289f;

        /* renamed from: g */
        public int f26290g;

        /* renamed from: h */
        public int f26291h;

        /* renamed from: i */
        public int f26292i;

        /* renamed from: j */
        private final C5918a0 f26293j = new C5918a0(1);

        /* renamed from: k */
        private final C5918a0 f26294k = new C5918a0();
        /* access modifiers changed from: private */

        /* renamed from: l */
        public boolean f26295l;

        public C5019b(C4200e0 e0Var, C5031r rVar, C5013c cVar) {
            this.f26284a = e0Var;
            this.f26287d = rVar;
            this.f26288e = cVar;
            mo18946j(rVar, cVar);
        }

        /* renamed from: c */
        public int mo18939c() {
            int i;
            if (!this.f26295l) {
                i = this.f26287d.f26379g[this.f26289f];
            } else {
                i = this.f26285b.f26365k[this.f26289f] ? 1 : 0;
            }
            return mo18943g() != null ? i | 1073741824 : i;
        }

        /* renamed from: d */
        public long mo18940d() {
            if (!this.f26295l) {
                return this.f26287d.f26375c[this.f26289f];
            }
            return this.f26285b.f26361g[this.f26291h];
        }

        /* renamed from: e */
        public long mo18941e() {
            if (!this.f26295l) {
                return this.f26287d.f26378f[this.f26289f];
            }
            return this.f26285b.mo18957c(this.f26289f);
        }

        /* renamed from: f */
        public int mo18942f() {
            if (!this.f26295l) {
                return this.f26287d.f26376d[this.f26289f];
            }
            return this.f26285b.f26363i[this.f26289f];
        }

        /* renamed from: g */
        public C5029p mo18943g() {
            if (!this.f26295l) {
                return null;
            }
            int i = ((C5013c) C5953m0.m35138j(this.f26285b.f26355a)).f26234a;
            C5029p pVar = this.f26285b.f26368n;
            if (pVar == null) {
                pVar = this.f26287d.f26373a.mo18954a(i);
            }
            if (pVar == null || !pVar.f26350a) {
                return null;
            }
            return pVar;
        }

        /* renamed from: h */
        public boolean mo18944h() {
            this.f26289f++;
            if (!this.f26295l) {
                return false;
            }
            int i = this.f26290g + 1;
            this.f26290g = i;
            int[] iArr = this.f26285b.f26362h;
            int i2 = this.f26291h;
            if (i != iArr[i2]) {
                return true;
            }
            this.f26291h = i2 + 1;
            this.f26290g = 0;
            return false;
        }

        /* renamed from: i */
        public int mo18945i(int i, int i2) {
            C5918a0 a0Var;
            C5029p g = mo18943g();
            if (g == null) {
                return 0;
            }
            int i3 = g.f26353d;
            if (i3 != 0) {
                a0Var = this.f26285b.f26369o;
            } else {
                byte[] bArr = (byte[]) C5953m0.m35138j(g.f26354e);
                this.f26294k.mo20544M(bArr, bArr.length);
                C5918a0 a0Var2 = this.f26294k;
                i3 = bArr.length;
                a0Var = a0Var2;
            }
            boolean g2 = this.f26285b.mo18961g(this.f26289f);
            boolean z = g2 || i2 != 0;
            this.f26293j.mo20551d()[0] = (byte) ((z ? 128 : 0) | i3);
            this.f26293j.mo20546O(0);
            this.f26284a.mo6847f(this.f26293j, 1, 1);
            this.f26284a.mo6847f(a0Var, i3, 1);
            if (!z) {
                return i3 + 1;
            }
            if (!g2) {
                this.f26286c.mo20542K(8);
                byte[] d = this.f26286c.mo20551d();
                d[0] = 0;
                d[1] = 1;
                d[2] = (byte) ((i2 >> 8) & 255);
                d[3] = (byte) (i2 & 255);
                d[4] = (byte) ((i >> 24) & 255);
                d[5] = (byte) ((i >> 16) & 255);
                d[6] = (byte) ((i >> 8) & 255);
                d[7] = (byte) (i & 255);
                this.f26284a.mo6847f(this.f26286c, 8, 1);
                return i3 + 1 + 8;
            }
            C5918a0 a0Var3 = this.f26285b.f26369o;
            int I = a0Var3.mo20540I();
            a0Var3.mo20547P(-2);
            int i4 = (I * 6) + 2;
            if (i2 != 0) {
                this.f26286c.mo20542K(i4);
                byte[] d2 = this.f26286c.mo20551d();
                a0Var3.mo20557j(d2, 0, i4);
                int i5 = (((d2[2] & 255) << 8) | (d2[3] & 255)) + i2;
                d2[2] = (byte) ((i5 >> 8) & 255);
                d2[3] = (byte) (i5 & 255);
                a0Var3 = this.f26286c;
            }
            this.f26284a.mo6847f(a0Var3, i4, 1);
            return i3 + 1 + i4;
        }

        /* renamed from: j */
        public void mo18946j(C5031r rVar, C5013c cVar) {
            this.f26287d = rVar;
            this.f26288e = cVar;
            this.f26284a.mo6845e(rVar.f26373a.f26344f);
            mo18947k();
        }

        /* renamed from: k */
        public void mo18947k() {
            this.f26285b.mo18960f();
            this.f26289f = 0;
            this.f26291h = 0;
            this.f26290g = 0;
            this.f26292i = 0;
            this.f26295l = false;
        }

        /* renamed from: l */
        public void mo18948l(long j) {
            int i = this.f26289f;
            while (true) {
                C5030q qVar = this.f26285b;
                if (i < qVar.f26360f && qVar.mo18957c(i) < j) {
                    if (this.f26285b.f26365k[i]) {
                        this.f26292i = i;
                    }
                    i++;
                } else {
                    return;
                }
            }
        }

        /* renamed from: m */
        public void mo18949m() {
            C5029p g = mo18943g();
            if (g != null) {
                C5918a0 a0Var = this.f26285b.f26369o;
                int i = g.f26353d;
                if (i != 0) {
                    a0Var.mo20547P(i);
                }
                if (this.f26285b.mo18961g(this.f26289f)) {
                    a0Var.mo20547P(a0Var.mo20540I() * 6);
                }
            }
        }

        /* renamed from: n */
        public void mo18950n(C4035m mVar) {
            C5029p a = this.f26287d.f26373a.mo18954a(((C5013c) C5953m0.m35138j(this.f26285b.f26355a)).f26234a);
            this.f26284a.mo6845e(this.f26287d.f26373a.f26344f.mo21483b().mo21499M(mVar.mo17228c(a != null ? a.f26351b : null)).mo21491E());
        }
    }

    public C5017g() {
        this(0);
    }

    /* renamed from: A */
    private static void m31608A(C5918a0 a0Var, C5030q qVar) throws C6249m2 {
        m31643z(a0Var, 0, qVar);
    }

    /* renamed from: B */
    private static Pair<Long, C4197d> m31609B(C5918a0 a0Var, long j) throws C6249m2 {
        long j2;
        long j3;
        C5918a0 a0Var2 = a0Var;
        a0Var2.mo20546O(8);
        int c = C5002a.m31555c(a0Var.mo20560m());
        a0Var2.mo20547P(4);
        long E = a0Var.mo20536E();
        if (c == 0) {
            j3 = a0Var.mo20536E();
            j2 = a0Var.mo20536E();
        } else {
            j3 = a0Var.mo20539H();
            j2 = a0Var.mo20539H();
        }
        long j4 = j3;
        long j5 = j + j2;
        long N0 = C5953m0.m35095N0(j4, 1000000, E);
        a0Var2.mo20547P(2);
        int I = a0Var.mo20540I();
        int[] iArr = new int[I];
        long[] jArr = new long[I];
        long[] jArr2 = new long[I];
        long[] jArr3 = new long[I];
        long j6 = j4;
        long j7 = N0;
        int i = 0;
        while (i < I) {
            int m = a0Var.mo20560m();
            if ((m & RecyclerView.UNDEFINED_DURATION) == 0) {
                long E2 = a0Var.mo20536E();
                iArr[i] = m & Integer.MAX_VALUE;
                jArr[i] = j5;
                jArr3[i] = j7;
                long j8 = j6 + E2;
                long[] jArr4 = jArr2;
                long[] jArr5 = jArr3;
                int i2 = I;
                int[] iArr2 = iArr;
                long N02 = C5953m0.m35095N0(j8, 1000000, E);
                jArr4[i] = N02 - jArr5[i];
                a0Var2.mo20547P(4);
                j5 += (long) iArr2[i];
                i++;
                iArr = iArr2;
                jArr3 = jArr5;
                jArr2 = jArr4;
                jArr = jArr;
                I = i2;
                long j9 = N02;
                j6 = j8;
                j7 = j9;
            } else {
                throw C6249m2.m36661a("Unhandled indirect reference", (Throwable) null);
            }
        }
        return Pair.create(Long.valueOf(N0), new C4197d(iArr, jArr, jArr2, jArr3));
    }

    /* renamed from: C */
    private static long m31610C(C5918a0 a0Var) {
        a0Var.mo20546O(8);
        return C5002a.m31555c(a0Var.mo20560m()) == 1 ? a0Var.mo20539H() : a0Var.mo20536E();
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [android.util.SparseArray, android.util.SparseArray<m2.g$b>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static p092m2.C5017g.C5019b m31611D(p161w3.C5918a0 r4, android.util.SparseArray<p092m2.C5017g.C5019b> r5, boolean r6) {
        /*
            r0 = 8
            r4.mo20546O(r0)
            int r0 = r4.mo20560m()
            int r0 = p092m2.C5002a.m31554b(r0)
            int r1 = r4.mo20560m()
            if (r6 == 0) goto L_0x0019
            r6 = 0
            java.lang.Object r5 = r5.valueAt(r6)
            goto L_0x001d
        L_0x0019:
            java.lang.Object r5 = r5.get(r1)
        L_0x001d:
            m2.g$b r5 = (p092m2.C5017g.C5019b) r5
            if (r5 != 0) goto L_0x0023
            r4 = 0
            return r4
        L_0x0023:
            r6 = r0 & 1
            if (r6 == 0) goto L_0x0031
            long r1 = r4.mo20539H()
            m2.q r6 = r5.f26285b
            r6.f26357c = r1
            r6.f26358d = r1
        L_0x0031:
            m2.c r6 = r5.f26288e
            r1 = r0 & 2
            if (r1 == 0) goto L_0x003e
            int r1 = r4.mo20560m()
            int r1 = r1 + -1
            goto L_0x0040
        L_0x003e:
            int r1 = r6.f26234a
        L_0x0040:
            r2 = r0 & 8
            if (r2 == 0) goto L_0x0049
            int r2 = r4.mo20560m()
            goto L_0x004b
        L_0x0049:
            int r2 = r6.f26235b
        L_0x004b:
            r3 = r0 & 16
            if (r3 == 0) goto L_0x0054
            int r3 = r4.mo20560m()
            goto L_0x0056
        L_0x0054:
            int r3 = r6.f26236c
        L_0x0056:
            r0 = r0 & 32
            if (r0 == 0) goto L_0x005f
            int r4 = r4.mo20560m()
            goto L_0x0061
        L_0x005f:
            int r4 = r6.f26237d
        L_0x0061:
            m2.q r6 = r5.f26285b
            m2.c r0 = new m2.c
            r0.<init>(r1, r2, r3, r4)
            r6.f26355a = r0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p092m2.C5017g.m31611D(w3.a0, android.util.SparseArray, boolean):m2.g$b");
    }

    /* renamed from: E */
    private static void m31612E(C5002a.C5003a aVar, SparseArray<C5019b> sparseArray, boolean z, int i, byte[] bArr) throws C6249m2 {
        C5019b D = m31611D(((C5002a.C5004b) C5917a.m34872e(aVar.mo18933g(1952868452))).f26204b, sparseArray, z);
        if (D != null) {
            C5030q qVar = D.f26285b;
            long j = qVar.f26371q;
            boolean z2 = qVar.f26372r;
            D.mo18947k();
            boolean unused = D.f26295l = true;
            C5002a.C5004b g = aVar.mo18933g(1952867444);
            if (g == null || (i & 2) != 0) {
                qVar.f26371q = j;
                qVar.f26372r = z2;
            } else {
                qVar.f26371q = m31610C(g.f26204b);
                qVar.f26372r = true;
            }
            m31615H(aVar, D, i);
            C5029p a = D.f26287d.f26373a.mo18954a(((C5013c) C5917a.m34872e(qVar.f26355a)).f26234a);
            C5002a.C5004b g2 = aVar.mo18933g(1935763834);
            if (g2 != null) {
                m31641x((C5029p) C5917a.m34872e(a), g2.f26204b, qVar);
            }
            C5002a.C5004b g3 = aVar.mo18933g(1935763823);
            if (g3 != null) {
                m31640w(g3.f26204b, qVar);
            }
            C5002a.C5004b g4 = aVar.mo18933g(1936027235);
            if (g4 != null) {
                m31608A(g4.f26204b, qVar);
            }
            m31642y(aVar, a != null ? a.f26351b : null, qVar);
            int size = aVar.f26202c.size();
            for (int i2 = 0; i2 < size; i2++) {
                C5002a.C5004b bVar = aVar.f26202c.get(i2);
                if (bVar.f26200a == 1970628964) {
                    m31616I(bVar.f26204b, qVar, bArr);
                }
            }
        }
    }

    /* renamed from: F */
    private static Pair<Integer, C5013c> m31613F(C5918a0 a0Var) {
        a0Var.mo20546O(12);
        return Pair.create(Integer.valueOf(a0Var.mo20560m()), new C5013c(a0Var.mo20560m() - 1, a0Var.mo20560m(), a0Var.mo20560m(), a0Var.mo20560m()));
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b2  */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m31614G(p092m2.C5017g.C5019b r34, int r35, int r36, p161w3.C5918a0 r37, int r38) throws p177z1.C6249m2 {
        /*
            r0 = r34
            r1 = 8
            r2 = r37
            r2.mo20546O(r1)
            int r1 = r37.mo20560m()
            int r1 = p092m2.C5002a.m31554b(r1)
            m2.r r3 = r0.f26287d
            m2.o r3 = r3.f26373a
            m2.q r4 = r0.f26285b
            m2.c r5 = r4.f26355a
            java.lang.Object r5 = p161w3.C5953m0.m35138j(r5)
            m2.c r5 = (p092m2.C5013c) r5
            int[] r6 = r4.f26362h
            int r7 = r37.mo20538G()
            r6[r35] = r7
            long[] r6 = r4.f26361g
            long r7 = r4.f26357c
            r6[r35] = r7
            r7 = r1 & 1
            if (r7 == 0) goto L_0x003b
            r7 = r6[r35]
            int r9 = r37.mo20560m()
            long r9 = (long) r9
            long r7 = r7 + r9
            r6[r35] = r7
        L_0x003b:
            r6 = r1 & 4
            r7 = 0
            r8 = 1
            if (r6 == 0) goto L_0x0043
            r6 = 1
            goto L_0x0044
        L_0x0043:
            r6 = 0
        L_0x0044:
            int r9 = r5.f26237d
            if (r6 == 0) goto L_0x004c
            int r9 = r37.mo20560m()
        L_0x004c:
            r10 = r1 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0052
            r10 = 1
            goto L_0x0053
        L_0x0052:
            r10 = 0
        L_0x0053:
            r11 = r1 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0059
            r11 = 1
            goto L_0x005a
        L_0x0059:
            r11 = 0
        L_0x005a:
            r12 = r1 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0060
            r12 = 1
            goto L_0x0061
        L_0x0060:
            r12 = 0
        L_0x0061:
            r1 = r1 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0067
            r1 = 1
            goto L_0x0068
        L_0x0067:
            r1 = 0
        L_0x0068:
            long[] r13 = r3.f26346h
            if (r13 == 0) goto L_0x0082
            int r14 = r13.length
            if (r14 != r8) goto L_0x0082
            r14 = r13[r7]
            r16 = 0
            int r13 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r13 != 0) goto L_0x0084
            long[] r13 = r3.f26347i
            java.lang.Object r13 = p161w3.C5953m0.m35138j(r13)
            long[] r13 = (long[]) r13
            r14 = r13[r7]
            goto L_0x0086
        L_0x0082:
            r16 = 0
        L_0x0084:
            r14 = r16
        L_0x0086:
            int[] r13 = r4.f26363i
            long[] r7 = r4.f26364j
            boolean[] r8 = r4.f26365k
            int r2 = r3.f26340b
            r18 = r9
            r9 = 2
            if (r2 != r9) goto L_0x009a
            r2 = 1
            r9 = r36 & 1
            if (r9 == 0) goto L_0x009a
            r2 = 1
            goto L_0x009b
        L_0x009a:
            r2 = 0
        L_0x009b:
            int[] r9 = r4.f26362h
            r9 = r9[r35]
            int r9 = r38 + r9
            r36 = r2
            long r2 = r3.f26341c
            r25 = r7
            r26 = r8
            long r7 = r4.f26371q
            r27 = r2
            r2 = r7
            r7 = r38
        L_0x00b0:
            if (r7 >= r9) goto L_0x013f
            if (r10 == 0) goto L_0x00b9
            int r8 = r37.mo20560m()
            goto L_0x00bb
        L_0x00b9:
            int r8 = r5.f26235b
        L_0x00bb:
            int r8 = m31625f(r8)
            if (r11 == 0) goto L_0x00c8
            int r19 = r37.mo20560m()
            r29 = r10
            goto L_0x00ce
        L_0x00c8:
            r29 = r10
            int r10 = r5.f26236c
            r19 = r10
        L_0x00ce:
            int r10 = m31625f(r19)
            if (r12 == 0) goto L_0x00dd
            int r19 = r37.mo20560m()
            r30 = r6
            r6 = r19
            goto L_0x00ea
        L_0x00dd:
            if (r7 != 0) goto L_0x00e6
            if (r6 == 0) goto L_0x00e6
            r30 = r6
            r6 = r18
            goto L_0x00ea
        L_0x00e6:
            r30 = r6
            int r6 = r5.f26237d
        L_0x00ea:
            if (r1 == 0) goto L_0x00f9
            int r19 = r37.mo20560m()
            r31 = r1
            r32 = r11
            r33 = r12
            r1 = r19
            goto L_0x0100
        L_0x00f9:
            r31 = r1
            r32 = r11
            r33 = r12
            r1 = 0
        L_0x0100:
            long r11 = (long) r1
            long r11 = r11 + r2
            long r19 = r11 - r14
            r21 = 1000000(0xf4240, double:4.940656E-318)
            r23 = r27
            long r11 = p161w3.C5953m0.m35095N0(r19, r21, r23)
            r25[r7] = r11
            boolean r1 = r4.f26372r
            if (r1 != 0) goto L_0x011c
            r11 = r25[r7]
            m2.r r1 = r0.f26287d
            long r0 = r1.f26380h
            long r11 = r11 + r0
            r25[r7] = r11
        L_0x011c:
            r13[r7] = r10
            int r0 = r6 >> 16
            r1 = 1
            r0 = r0 & r1
            if (r0 != 0) goto L_0x012a
            if (r36 == 0) goto L_0x0128
            if (r7 != 0) goto L_0x012a
        L_0x0128:
            r0 = 1
            goto L_0x012b
        L_0x012a:
            r0 = 0
        L_0x012b:
            r26[r7] = r0
            long r10 = (long) r8
            long r2 = r2 + r10
            int r7 = r7 + 1
            r0 = r34
            r10 = r29
            r6 = r30
            r1 = r31
            r11 = r32
            r12 = r33
            goto L_0x00b0
        L_0x013f:
            r4.f26371q = r2
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p092m2.C5017g.m31614G(m2.g$b, int, int, w3.a0, int):int");
    }

    /* renamed from: H */
    private static void m31615H(C5002a.C5003a aVar, C5019b bVar, int i) throws C6249m2 {
        List<C5002a.C5004b> list = aVar.f26202c;
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            C5002a.C5004b bVar2 = list.get(i4);
            if (bVar2.f26200a == 1953658222) {
                C5918a0 a0Var = bVar2.f26204b;
                a0Var.mo20546O(12);
                int G = a0Var.mo20538G();
                if (G > 0) {
                    i3 += G;
                    i2++;
                }
            }
        }
        bVar.f26291h = 0;
        bVar.f26290g = 0;
        bVar.f26289f = 0;
        bVar.f26285b.mo18959e(i2, i3);
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            C5002a.C5004b bVar3 = list.get(i7);
            if (bVar3.f26200a == 1953658222) {
                i6 = m31614G(bVar, i5, i, bVar3.f26204b, i6);
                i5++;
            }
        }
    }

    /* renamed from: I */
    private static void m31616I(C5918a0 a0Var, C5030q qVar, byte[] bArr) throws C6249m2 {
        a0Var.mo20546O(8);
        a0Var.mo20557j(bArr, 0, 16);
        if (Arrays.equals(bArr, f26245J)) {
            m31643z(a0Var, 16, qVar);
        }
    }

    /* renamed from: J */
    private void m31617J(long j) throws C6249m2 {
        while (!this.f26267m.isEmpty() && this.f26267m.peek().f26201b == j) {
            m31632o(this.f26267m.pop());
        }
        m31626g();
    }

    /* renamed from: K */
    private boolean m31618K(C4216m mVar) throws IOException {
        if (this.f26273s == 0) {
            if (!mVar.mo17555d(this.f26266l.mo20551d(), 0, 8, true)) {
                return false;
            }
            this.f26273s = 8;
            this.f26266l.mo20546O(0);
            this.f26272r = this.f26266l.mo20536E();
            this.f26271q = this.f26266l.mo20560m();
        }
        long j = this.f26272r;
        if (j == 1) {
            mVar.readFully(this.f26266l.mo20551d(), 8, 8);
            this.f26273s += 8;
            this.f26272r = this.f26266l.mo20539H();
        } else if (j == 0) {
            long b = mVar.mo17553b();
            if (b == -1 && !this.f26267m.isEmpty()) {
                b = this.f26267m.peek().f26201b;
            }
            if (b != -1) {
                this.f26272r = (b - mVar.mo17554c()) + ((long) this.f26273s);
            }
        }
        if (this.f26272r >= ((long) this.f26273s)) {
            long c = mVar.mo17554c() - ((long) this.f26273s);
            int i = this.f26271q;
            if ((i == 1836019558 || i == 1835295092) && !this.f26254H) {
                this.f26251E.mo6781l(new C4192b0.C4194b(this.f26278x, c));
                this.f26254H = true;
            }
            if (this.f26271q == 1836019558) {
                int size = this.f26258d.size();
                for (int i2 = 0; i2 < size; i2++) {
                    C5030q qVar = this.f26258d.valueAt(i2).f26285b;
                    qVar.f26356b = c;
                    qVar.f26358d = c;
                    qVar.f26357c = c;
                }
            }
            int i3 = this.f26271q;
            if (i3 == 1835295092) {
                this.f26280z = null;
                this.f26275u = c + this.f26272r;
                this.f26270p = 2;
                return true;
            }
            if (m31622O(i3)) {
                long c2 = (mVar.mo17554c() + this.f26272r) - 8;
                this.f26267m.push(new C5002a.C5003a(this.f26271q, c2));
                if (this.f26272r == ((long) this.f26273s)) {
                    m31617J(c2);
                } else {
                    m31626g();
                }
            } else if (m31623P(this.f26271q)) {
                if (this.f26273s == 8) {
                    long j2 = this.f26272r;
                    if (j2 <= 2147483647L) {
                        C5918a0 a0Var = new C5918a0((int) j2);
                        System.arraycopy(this.f26266l.mo20551d(), 0, a0Var.mo20551d(), 0, 8);
                        this.f26274t = a0Var;
                        this.f26270p = 1;
                    } else {
                        throw C6249m2.m36664d("Leaf atom with length > 2147483647 (unsupported).");
                    }
                } else {
                    throw C6249m2.m36664d("Leaf atom defines extended atom size (unsupported).");
                }
            } else if (this.f26272r <= 2147483647L) {
                this.f26274t = null;
                this.f26270p = 1;
            } else {
                throw C6249m2.m36664d("Skipping atom with length > 2147483647 (unsupported).");
            }
            return true;
        }
        throw C6249m2.m36664d("Atom size less than header length (unsupported).");
    }

    /* renamed from: L */
    private void m31619L(C4216m mVar) throws IOException {
        int i = ((int) this.f26272r) - this.f26273s;
        C5918a0 a0Var = this.f26274t;
        if (a0Var != null) {
            mVar.readFully(a0Var.mo20551d(), 8, i);
            m31634q(new C5002a.C5004b(this.f26271q, a0Var), mVar.mo17554c());
        } else {
            mVar.mo17561k(i);
        }
        m31617J(mVar.mo17554c());
    }

    /* renamed from: M */
    private void m31620M(C4216m mVar) throws IOException {
        int size = this.f26258d.size();
        long j = Long.MAX_VALUE;
        C5019b bVar = null;
        for (int i = 0; i < size; i++) {
            C5030q qVar = this.f26258d.valueAt(i).f26285b;
            if (qVar.f26370p) {
                long j2 = qVar.f26358d;
                if (j2 < j) {
                    bVar = this.f26258d.valueAt(i);
                    j = j2;
                }
            }
        }
        if (bVar == null) {
            this.f26270p = 3;
            return;
        }
        int c = (int) (j - mVar.mo17554c());
        if (c >= 0) {
            mVar.mo17561k(c);
            bVar.f26285b.mo18955a(mVar);
            return;
        }
        throw C6249m2.m36661a("Offset to encryption data was negative.", (Throwable) null);
    }

    /* renamed from: N */
    private boolean m31621N(C4216m mVar) throws IOException {
        int i;
        C4216m mVar2 = mVar;
        C5019b bVar = this.f26280z;
        Throwable th = null;
        if (bVar == null) {
            bVar = m31629k(this.f26258d);
            if (bVar == null) {
                int c = (int) (this.f26275u - mVar.mo17554c());
                if (c >= 0) {
                    mVar2.mo17561k(c);
                    m31626g();
                    return false;
                }
                throw C6249m2.m36661a("Offset to end of mdat was negative.", (Throwable) null);
            }
            int d = (int) (bVar.mo18940d() - mVar.mo17554c());
            if (d < 0) {
                C5961r.m35215i("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                d = 0;
            }
            mVar2.mo17561k(d);
            this.f26280z = bVar;
        }
        int i2 = 4;
        int i3 = 1;
        if (this.f26270p == 3) {
            int f = bVar.mo18942f();
            this.f26247A = f;
            if (bVar.f26289f < bVar.f26292i) {
                mVar2.mo17561k(f);
                bVar.mo18949m();
                if (!bVar.mo18944h()) {
                    this.f26280z = null;
                }
                this.f26270p = 3;
                return true;
            }
            if (bVar.f26287d.f26373a.f26345g == 1) {
                this.f26247A = f - 8;
                mVar2.mo17561k(8);
            }
            if ("audio/ac4".equals(bVar.f26287d.f26373a.f26344f.f30243t)) {
                this.f26248B = bVar.mo18945i(this.f26247A, 7);
                C1618c.m7431a(this.f26247A, this.f26263i);
                bVar.f26284a.mo6843d(this.f26263i, 7);
                this.f26248B += 7;
            } else {
                this.f26248B = bVar.mo18945i(this.f26247A, 0);
            }
            this.f26247A += this.f26248B;
            this.f26270p = 4;
            this.f26249C = 0;
        }
        C5028o oVar = bVar.f26287d.f26373a;
        C4200e0 e0Var = bVar.f26284a;
        long e = bVar.mo18941e();
        C5940i0 i0Var = this.f26264j;
        if (i0Var != null) {
            e = i0Var.mo20621a(e);
        }
        long j = e;
        if (oVar.f26348j == 0) {
            while (true) {
                int i4 = this.f26248B;
                int i5 = this.f26247A;
                if (i4 >= i5) {
                    break;
                }
                this.f26248B += e0Var.mo6840b(mVar2, i5 - i4, false);
            }
        } else {
            byte[] d2 = this.f26260f.mo20551d();
            d2[0] = 0;
            d2[1] = 0;
            d2[2] = 0;
            int i6 = oVar.f26348j;
            int i7 = i6 + 1;
            int i8 = 4 - i6;
            while (this.f26248B < this.f26247A) {
                int i9 = this.f26249C;
                if (i9 == 0) {
                    mVar2.readFully(d2, i8, i7);
                    this.f26260f.mo20546O(0);
                    int m = this.f26260f.mo20560m();
                    if (m >= i3) {
                        this.f26249C = m - 1;
                        this.f26259e.mo20546O(0);
                        e0Var.mo6843d(this.f26259e, i2);
                        e0Var.mo6843d(this.f26260f, i3);
                        this.f26250D = this.f26253G.length > 0 && C5970w.m35264g(oVar.f26344f.f30243t, d2[i2]);
                        this.f26248B += 5;
                        this.f26247A += i8;
                    } else {
                        throw C6249m2.m36661a("Invalid NAL length", th);
                    }
                } else {
                    if (this.f26250D) {
                        this.f26261g.mo20542K(i9);
                        mVar2.readFully(this.f26261g.mo20551d(), 0, this.f26249C);
                        e0Var.mo6843d(this.f26261g, this.f26249C);
                        i = this.f26249C;
                        int q = C5970w.m35274q(this.f26261g.mo20551d(), this.f26261g.mo20553f());
                        this.f26261g.mo20546O("video/hevc".equals(oVar.f26344f.f30243t) ? 1 : 0);
                        this.f26261g.mo20545N(q);
                        C4195c.m28375a(j, this.f26261g, this.f26253G);
                    } else {
                        i = e0Var.mo6840b(mVar2, i9, false);
                    }
                    this.f26248B += i;
                    this.f26249C -= i;
                    th = null;
                    i2 = 4;
                    i3 = 1;
                }
            }
        }
        int c2 = bVar.mo18939c();
        C5029p g = bVar.mo18943g();
        e0Var.mo6838a(j, c2, this.f26247A, 0, g != null ? g.f26352c : null);
        m31637t(j);
        if (!bVar.mo18944h()) {
            this.f26280z = null;
        }
        this.f26270p = 3;
        return true;
    }

    /* renamed from: O */
    private static boolean m31622O(int i) {
        return i == 1836019574 || i == 1953653099 || i == 1835297121 || i == 1835626086 || i == 1937007212 || i == 1836019558 || i == 1953653094 || i == 1836475768 || i == 1701082227;
    }

    /* renamed from: P */
    private static boolean m31623P(int i) {
        return i == 1751411826 || i == 1835296868 || i == 1836476516 || i == 1936286840 || i == 1937011556 || i == 1937011827 || i == 1668576371 || i == 1937011555 || i == 1937011578 || i == 1937013298 || i == 1937007471 || i == 1668232756 || i == 1937011571 || i == 1952867444 || i == 1952868452 || i == 1953196132 || i == 1953654136 || i == 1953658222 || i == 1886614376 || i == 1935763834 || i == 1935763823 || i == 1936027235 || i == 1970628964 || i == 1935828848 || i == 1936158820 || i == 1701606260 || i == 1835362404 || i == 1701671783;
    }

    /* renamed from: f */
    private static int m31625f(int i) throws C6249m2 {
        if (i >= 0) {
            return i;
        }
        throw C6249m2.m36661a("Unexpected negative value: " + i, (Throwable) null);
    }

    /* renamed from: g */
    private void m31626g() {
        this.f26270p = 0;
        this.f26273s = 0;
    }

    /* renamed from: i */
    private C5013c m31627i(SparseArray<C5013c> sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        return (C5013c) C5917a.m34872e(sparseArray.get(i));
    }

    /* renamed from: j */
    private static C4035m m31628j(List<C5002a.C5004b> list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            C5002a.C5004b bVar = list.get(i);
            if (bVar.f26200a == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] d = bVar.f26204b.mo20551d();
                UUID f = C5023l.m31713f(d);
                if (f == null) {
                    C5961r.m35215i("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new C4035m.C4037b(f, "video/mp4", d));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new C4035m((List<C4035m.C4037b>) arrayList);
    }

    /* renamed from: k */
    private static C5019b m31629k(SparseArray<C5019b> sparseArray) {
        int size = sparseArray.size();
        C5019b bVar = null;
        long j = Long.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            C5019b valueAt = sparseArray.valueAt(i);
            if ((valueAt.f26295l || valueAt.f26289f != valueAt.f26287d.f26374b) && (!valueAt.f26295l || valueAt.f26291h != valueAt.f26285b.f26359e)) {
                long d = valueAt.mo18940d();
                if (d < j) {
                    bVar = valueAt;
                    j = d;
                }
            }
        }
        return bVar;
    }

    /* renamed from: l */
    private void m31630l() {
        int i;
        C4200e0[] e0VarArr = new C4200e0[2];
        this.f26252F = e0VarArr;
        C4200e0 e0Var = this.f26269o;
        int i2 = 0;
        if (e0Var != null) {
            e0VarArr[0] = e0Var;
            i = 1;
        } else {
            i = 0;
        }
        int i3 = 100;
        if ((this.f26255a & 4) != 0) {
            e0VarArr[i] = this.f26251E.mo6778f(100, 5);
            i++;
            i3 = C8710R.styleable.AppCompatTheme_switchStyle;
        }
        C4200e0[] e0VarArr2 = (C4200e0[]) C5953m0.m35081G0(this.f26252F, i);
        this.f26252F = e0VarArr2;
        for (C4200e0 e : e0VarArr2) {
            e.mo6845e(f26246K);
        }
        this.f26253G = new C4200e0[this.f26257c.size()];
        while (i2 < this.f26253G.length) {
            C4200e0 f = this.f26251E.mo6778f(i3, 3);
            f.mo6845e(this.f26257c.get(i2));
            this.f26253G[i2] = f;
            i2++;
            i3++;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static /* synthetic */ C4215l[] m31631m() {
        return new C4215l[]{new C5017g()};
    }

    /* renamed from: o */
    private void m31632o(C5002a.C5003a aVar) throws C6249m2 {
        int i = aVar.f26200a;
        if (i == 1836019574) {
            m31636s(aVar);
        } else if (i == 1836019558) {
            m31635r(aVar);
        } else if (!this.f26267m.isEmpty()) {
            this.f26267m.peek().mo18930d(aVar);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m31633p(p161w3.C5918a0 r28) {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            e2.e0[] r2 = r0.f26252F
            int r2 = r2.length
            if (r2 != 0) goto L_0x000a
            return
        L_0x000a:
            r2 = 8
            r1.mo20546O(r2)
            int r2 = r28.mo20560m()
            int r2 = p092m2.C5002a.m31555c(r2)
            r3 = 1
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r2 == 0) goto L_0x0074
            if (r2 == r3) goto L_0x0038
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Skipping unsupported emsg version: "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "FragmentedMp4Extractor"
            p161w3.C5961r.m35215i(r2, r1)
            return
        L_0x0038:
            long r12 = r28.mo20536E()
            long r6 = r28.mo20539H()
            r8 = 1000000(0xf4240, double:4.940656E-318)
            r10 = r12
            long r14 = p161w3.C5953m0.m35095N0(r6, r8, r10)
            long r6 = r28.mo20536E()
            r8 = 1000(0x3e8, double:4.94E-321)
            long r6 = p161w3.C5953m0.m35095N0(r6, r8, r10)
            long r8 = r28.mo20536E()
            java.lang.String r2 = r28.mo20570w()
            java.lang.Object r2 = p161w3.C5917a.m34872e(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r10 = r28.mo20570w()
            java.lang.Object r10 = p161w3.C5917a.m34872e(r10)
            java.lang.String r10 = (java.lang.String) r10
            r20 = r2
            r22 = r6
            r24 = r8
            r21 = r10
            r8 = r4
            goto L_0x00be
        L_0x0074:
            java.lang.String r2 = r28.mo20570w()
            java.lang.Object r2 = p161w3.C5917a.m34872e(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r6 = r28.mo20570w()
            java.lang.Object r6 = p161w3.C5917a.m34872e(r6)
            r10 = r6
            java.lang.String r10 = (java.lang.String) r10
            long r6 = r28.mo20536E()
            long r11 = r28.mo20536E()
            r13 = 1000000(0xf4240, double:4.940656E-318)
            r15 = r6
            long r8 = p161w3.C5953m0.m35095N0(r11, r13, r15)
            long r11 = r0.f26279y
            int r13 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r13 == 0) goto L_0x00a3
            long r11 = r11 + r8
            r17 = r11
            goto L_0x00a5
        L_0x00a3:
            r17 = r4
        L_0x00a5:
            long r11 = r28.mo20536E()
            r13 = 1000(0x3e8, double:4.94E-321)
            r15 = r6
            long r6 = p161w3.C5953m0.m35095N0(r11, r13, r15)
            long r11 = r28.mo20536E()
            r20 = r2
            r22 = r6
            r21 = r10
            r24 = r11
            r14 = r17
        L_0x00be:
            int r2 = r28.mo20548a()
            byte[] r2 = new byte[r2]
            int r6 = r28.mo20548a()
            r7 = 0
            r1.mo20557j(r2, r7, r6)
            t2.a r1 = new t2.a
            r19 = r1
            r26 = r2
            r19.<init>(r20, r21, r22, r24, r26)
            w3.a0 r2 = new w3.a0
            t2.c r6 = r0.f26265k
            byte[] r1 = r6.mo19791a(r1)
            r2.<init>((byte[]) r1)
            int r1 = r2.mo20548a()
            e2.e0[] r6 = r0.f26252F
            int r10 = r6.length
            r11 = 0
        L_0x00e8:
            if (r11 >= r10) goto L_0x00f5
            r12 = r6[r11]
            r2.mo20546O(r7)
            r12.mo6843d(r2, r1)
            int r11 = r11 + 1
            goto L_0x00e8
        L_0x00f5:
            int r2 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r2 != 0) goto L_0x0109
            java.util.ArrayDeque<m2.g$a> r2 = r0.f26268n
            m2.g$a r4 = new m2.g$a
            r4.<init>(r8, r3, r1)
            r2.addLast(r4)
            int r2 = r0.f26276v
            int r2 = r2 + r1
            r0.f26276v = r2
            goto L_0x0140
        L_0x0109:
            java.util.ArrayDeque<m2.g$a> r2 = r0.f26268n
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0121
            java.util.ArrayDeque<m2.g$a> r2 = r0.f26268n
            m2.g$a r3 = new m2.g$a
            r3.<init>(r14, r7, r1)
            r2.addLast(r3)
            int r2 = r0.f26276v
            int r2 = r2 + r1
            r0.f26276v = r2
            goto L_0x0140
        L_0x0121:
            w3.i0 r2 = r0.f26264j
            if (r2 == 0) goto L_0x0129
            long r14 = r2.mo20621a(r14)
        L_0x0129:
            e2.e0[] r2 = r0.f26252F
            int r3 = r2.length
        L_0x012c:
            if (r7 >= r3) goto L_0x0140
            r16 = r2[r7]
            r19 = 1
            r21 = 0
            r22 = 0
            r17 = r14
            r20 = r1
            r16.mo6838a(r17, r19, r20, r21, r22)
            int r7 = r7 + 1
            goto L_0x012c
        L_0x0140:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p092m2.C5017g.m31633p(w3.a0):void");
    }

    /* renamed from: q */
    private void m31634q(C5002a.C5004b bVar, long j) throws C6249m2 {
        if (!this.f26267m.isEmpty()) {
            this.f26267m.peek().mo18931e(bVar);
            return;
        }
        int i = bVar.f26200a;
        if (i == 1936286840) {
            Pair<Long, C4197d> B = m31609B(bVar.f26204b, j);
            this.f26279y = ((Long) B.first).longValue();
            this.f26251E.mo6781l((C4192b0) B.second);
            this.f26254H = true;
        } else if (i == 1701671783) {
            m31633p(bVar.f26204b);
        }
    }

    /* renamed from: r */
    private void m31635r(C5002a.C5003a aVar) throws C6249m2 {
        m31639v(aVar, this.f26258d, this.f26256b != null, this.f26255a, this.f26262h);
        C4035m j = m31628j(aVar.f26202c);
        if (j != null) {
            int size = this.f26258d.size();
            for (int i = 0; i < size; i++) {
                this.f26258d.valueAt(i).mo18950n(j);
            }
        }
        if (this.f26277w != -9223372036854775807L) {
            int size2 = this.f26258d.size();
            for (int i2 = 0; i2 < size2; i2++) {
                this.f26258d.valueAt(i2).mo18948l(this.f26277w);
            }
            this.f26277w = -9223372036854775807L;
        }
    }

    /* renamed from: s */
    private void m31636s(C5002a.C5003a aVar) throws C6249m2 {
        boolean z = true;
        int i = 0;
        C5917a.m34874g(this.f26256b == null, "Unexpected moov box.");
        C4035m j = m31628j(aVar.f26202c);
        C5002a.C5003a aVar2 = (C5002a.C5003a) C5917a.m34872e(aVar.mo18932f(1836475768));
        SparseArray sparseArray = new SparseArray();
        int size = aVar2.f26202c.size();
        long j2 = -9223372036854775807L;
        for (int i2 = 0; i2 < size; i2++) {
            C5002a.C5004b bVar = aVar2.f26202c.get(i2);
            int i3 = bVar.f26200a;
            if (i3 == 1953654136) {
                Pair<Integer, C5013c> F = m31613F(bVar.f26204b);
                sparseArray.put(((Integer) F.first).intValue(), (C5013c) F.second);
            } else if (i3 == 1835362404) {
                j2 = m31638u(bVar.f26204b);
            }
        }
        List<C5031r> A = C5005b.m31560A(aVar, new C4230x(), j2, j, (this.f26255a & 16) != 0, false, new C11798e(this));
        int size2 = A.size();
        if (this.f26258d.size() == 0) {
            while (i < size2) {
                C5031r rVar = A.get(i);
                C5028o oVar = rVar.f26373a;
                this.f26258d.put(oVar.f26339a, new C5019b(this.f26251E.mo6778f(i, oVar.f26340b), rVar, m31627i(sparseArray, oVar.f26339a)));
                this.f26278x = Math.max(this.f26278x, oVar.f26343e);
                i++;
            }
            this.f26251E.mo6782n();
            return;
        }
        if (this.f26258d.size() != size2) {
            z = false;
        }
        C5917a.m34873f(z);
        while (i < size2) {
            C5031r rVar2 = A.get(i);
            C5028o oVar2 = rVar2.f26373a;
            this.f26258d.get(oVar2.f26339a).mo18946j(rVar2, m31627i(sparseArray, oVar2.f26339a));
            i++;
        }
    }

    /* renamed from: t */
    private void m31637t(long j) {
        while (!this.f26268n.isEmpty()) {
            C5018a removeFirst = this.f26268n.removeFirst();
            this.f26276v -= removeFirst.f26283c;
            long j2 = removeFirst.f26281a;
            if (removeFirst.f26282b) {
                j2 += j;
            }
            C5940i0 i0Var = this.f26264j;
            if (i0Var != null) {
                j2 = i0Var.mo20621a(j2);
            }
            for (C4200e0 a : this.f26252F) {
                a.mo6838a(j2, 1, removeFirst.f26283c, this.f26276v, (C4200e0.C4201a) null);
            }
        }
    }

    /* renamed from: u */
    private static long m31638u(C5918a0 a0Var) {
        a0Var.mo20546O(8);
        return C5002a.m31555c(a0Var.mo20560m()) == 0 ? a0Var.mo20536E() : a0Var.mo20539H();
    }

    /* renamed from: v */
    private static void m31639v(C5002a.C5003a aVar, SparseArray<C5019b> sparseArray, boolean z, int i, byte[] bArr) throws C6249m2 {
        int size = aVar.f26203d.size();
        for (int i2 = 0; i2 < size; i2++) {
            C5002a.C5003a aVar2 = aVar.f26203d.get(i2);
            if (aVar2.f26200a == 1953653094) {
                m31612E(aVar2, sparseArray, z, i, bArr);
            }
        }
    }

    /* renamed from: w */
    private static void m31640w(C5918a0 a0Var, C5030q qVar) throws C6249m2 {
        a0Var.mo20546O(8);
        int m = a0Var.mo20560m();
        if ((C5002a.m31554b(m) & 1) == 1) {
            a0Var.mo20547P(8);
        }
        int G = a0Var.mo20538G();
        if (G == 1) {
            qVar.f26358d += C5002a.m31555c(m) == 0 ? a0Var.mo20536E() : a0Var.mo20539H();
            return;
        }
        throw C6249m2.m36661a("Unexpected saio entry count: " + G, (Throwable) null);
    }

    /* renamed from: x */
    private static void m31641x(C5029p pVar, C5918a0 a0Var, C5030q qVar) throws C6249m2 {
        int i;
        int i2 = pVar.f26353d;
        a0Var.mo20546O(8);
        boolean z = true;
        if ((C5002a.m31554b(a0Var.mo20560m()) & 1) == 1) {
            a0Var.mo20547P(8);
        }
        int C = a0Var.mo20534C();
        int G = a0Var.mo20538G();
        if (G <= qVar.f26360f) {
            if (C == 0) {
                boolean[] zArr = qVar.f26367m;
                i = 0;
                for (int i3 = 0; i3 < G; i3++) {
                    int C2 = a0Var.mo20534C();
                    i += C2;
                    zArr[i3] = C2 > i2;
                }
            } else {
                if (C <= i2) {
                    z = false;
                }
                i = (C * G) + 0;
                Arrays.fill(qVar.f26367m, 0, G, z);
            }
            Arrays.fill(qVar.f26367m, G, qVar.f26360f, false);
            if (i > 0) {
                qVar.mo18958d(i);
                return;
            }
            return;
        }
        throw C6249m2.m36661a("Saiz sample count " + G + " is greater than fragment sample count" + qVar.f26360f, (Throwable) null);
    }

    /* renamed from: y */
    private static void m31642y(C5002a.C5003a aVar, String str, C5030q qVar) throws C6249m2 {
        C5002a.C5003a aVar2 = aVar;
        C5030q qVar2 = qVar;
        byte[] bArr = null;
        C5918a0 a0Var = null;
        C5918a0 a0Var2 = null;
        for (int i = 0; i < aVar2.f26202c.size(); i++) {
            C5002a.C5004b bVar = aVar2.f26202c.get(i);
            C5918a0 a0Var3 = bVar.f26204b;
            int i2 = bVar.f26200a;
            if (i2 == 1935828848) {
                a0Var3.mo20546O(12);
                if (a0Var3.mo20560m() == 1936025959) {
                    a0Var = a0Var3;
                }
            } else if (i2 == 1936158820) {
                a0Var3.mo20546O(12);
                if (a0Var3.mo20560m() == 1936025959) {
                    a0Var2 = a0Var3;
                }
            }
        }
        if (a0Var != null && a0Var2 != null) {
            a0Var.mo20546O(8);
            int c = C5002a.m31555c(a0Var.mo20560m());
            a0Var.mo20547P(4);
            if (c == 1) {
                a0Var.mo20547P(4);
            }
            if (a0Var.mo20560m() == 1) {
                a0Var2.mo20546O(8);
                int c2 = C5002a.m31555c(a0Var2.mo20560m());
                a0Var2.mo20547P(4);
                if (c2 == 1) {
                    if (a0Var2.mo20536E() == 0) {
                        throw C6249m2.m36664d("Variable length description in sgpd found (unsupported)");
                    }
                } else if (c2 >= 2) {
                    a0Var2.mo20547P(4);
                }
                if (a0Var2.mo20536E() == 1) {
                    a0Var2.mo20547P(1);
                    int C = a0Var2.mo20534C();
                    int i3 = (C & 240) >> 4;
                    int i4 = C & 15;
                    boolean z = a0Var2.mo20534C() == 1;
                    if (z) {
                        int C2 = a0Var2.mo20534C();
                        byte[] bArr2 = new byte[16];
                        a0Var2.mo20557j(bArr2, 0, 16);
                        if (C2 == 0) {
                            int C3 = a0Var2.mo20534C();
                            bArr = new byte[C3];
                            a0Var2.mo20557j(bArr, 0, C3);
                        }
                        qVar2.f26366l = true;
                        qVar2.f26368n = new C5029p(z, str, C2, bArr2, i3, i4, bArr);
                        return;
                    }
                    return;
                }
                throw C6249m2.m36664d("Entry count in sgpd != 1 (unsupported).");
            }
            throw C6249m2.m36664d("Entry count in sbgp != 1 (unsupported).");
        }
    }

    /* renamed from: z */
    private static void m31643z(C5918a0 a0Var, int i, C5030q qVar) throws C6249m2 {
        a0Var.mo20546O(i + 8);
        int b = C5002a.m31554b(a0Var.mo20560m());
        if ((b & 1) == 0) {
            boolean z = (b & 2) != 0;
            int G = a0Var.mo20538G();
            if (G == 0) {
                Arrays.fill(qVar.f26367m, 0, qVar.f26360f, false);
            } else if (G == qVar.f26360f) {
                Arrays.fill(qVar.f26367m, 0, G, z);
                qVar.mo18958d(a0Var.mo20548a());
                qVar.mo18956b(a0Var);
            } else {
                throw C6249m2.m36661a("Senc sample count " + G + " is different from fragment sample count" + qVar.f26360f, (Throwable) null);
            }
        } else {
            throw C6249m2.m36664d("Overriding TrackEncryptionBox parameters is unsupported.");
        }
    }

    /* renamed from: a */
    public void mo17579a() {
    }

    /* renamed from: c */
    public void mo17580c(long j, long j2) {
        int size = this.f26258d.size();
        for (int i = 0; i < size; i++) {
            this.f26258d.valueAt(i).mo18947k();
        }
        this.f26268n.clear();
        this.f26276v = 0;
        this.f26277w = j2;
        this.f26267m.clear();
        m31626g();
    }

    /* renamed from: d */
    public void mo17581d(C4217n nVar) {
        this.f26251E = nVar;
        m31626g();
        m31630l();
        C5028o oVar = this.f26256b;
        if (oVar != null) {
            this.f26258d.put(0, new C5019b(nVar.mo6778f(0, oVar.f26340b), new C5031r(this.f26256b, new long[0], new int[0], 0, new long[0], new int[0], 0), new C5013c(0, 0, 0, 0)));
            this.f26251E.mo6782n();
        }
    }

    /* renamed from: e */
    public int mo17582e(C4216m mVar, C4190a0 a0Var) throws IOException {
        while (true) {
            int i = this.f26270p;
            if (i != 0) {
                if (i == 1) {
                    m31619L(mVar);
                } else if (i == 2) {
                    m31620M(mVar);
                } else if (m31621N(mVar)) {
                    return 0;
                }
            } else if (!m31618K(mVar)) {
                return -1;
            }
        }
    }

    /* renamed from: h */
    public boolean mo17583h(C4216m mVar) throws IOException {
        return C5027n.m31726b(mVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public C5028o mo18938n(C5028o oVar) {
        return oVar;
    }

    public C5017g(int i) {
        this(i, (C5940i0) null);
    }

    public C5017g(int i, C5940i0 i0Var) {
        this(i, i0Var, (C5028o) null, Collections.emptyList());
    }

    public C5017g(int i, C5940i0 i0Var, C5028o oVar) {
        this(i, i0Var, oVar, Collections.emptyList());
    }

    public C5017g(int i, C5940i0 i0Var, C5028o oVar, List<C6272r1> list) {
        this(i, i0Var, oVar, list, (C4200e0) null);
    }

    public C5017g(int i, C5940i0 i0Var, C5028o oVar, List<C6272r1> list, C4200e0 e0Var) {
        this.f26255a = i;
        this.f26264j = i0Var;
        this.f26256b = oVar;
        this.f26257c = Collections.unmodifiableList(list);
        this.f26269o = e0Var;
        this.f26265k = new C5510c();
        this.f26266l = new C5918a0(16);
        this.f26259e = new C5918a0(C5970w.f29150a);
        this.f26260f = new C5918a0(5);
        this.f26261g = new C5918a0();
        byte[] bArr = new byte[16];
        this.f26262h = bArr;
        this.f26263i = new C5918a0(bArr);
        this.f26267m = new ArrayDeque<>();
        this.f26268n = new ArrayDeque<>();
        this.f26258d = new SparseArray<>();
        this.f26278x = -9223372036854775807L;
        this.f26277w = -9223372036854775807L;
        this.f26279y = -9223372036854775807L;
        this.f26251E = C4217n.f23563W;
        this.f26252F = new C4200e0[0];
        this.f26253G = new C4200e0[0];
    }
}
