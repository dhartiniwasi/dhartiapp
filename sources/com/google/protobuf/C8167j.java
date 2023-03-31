package com.google.protobuf;

import com.startapp.C8843b4;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.protobuf.j */
/* compiled from: CodedInputStream */
public abstract class C8167j {

    /* renamed from: f */
    private static volatile int f34928f = 100;

    /* renamed from: a */
    int f34929a;

    /* renamed from: b */
    int f34930b;

    /* renamed from: c */
    int f34931c;

    /* renamed from: d */
    C8176k f34932d;

    /* renamed from: e */
    private boolean f34933e;

    /* renamed from: com.google.protobuf.j$b */
    /* compiled from: CodedInputStream */
    private static final class C8169b extends C8167j {

        /* renamed from: g */
        private final byte[] f34934g;

        /* renamed from: h */
        private final boolean f34935h;

        /* renamed from: i */
        private int f34936i;

        /* renamed from: j */
        private int f34937j;

        /* renamed from: k */
        private int f34938k;

        /* renamed from: l */
        private int f34939l;

        /* renamed from: m */
        private int f34940m;

        /* renamed from: n */
        private boolean f34941n;

        /* renamed from: o */
        private int f34942o;

        /* renamed from: P */
        private void m44873P() {
            int i = this.f34936i + this.f34937j;
            this.f34936i = i;
            int i2 = i - this.f34939l;
            int i3 = this.f34942o;
            if (i2 > i3) {
                int i4 = i2 - i3;
                this.f34937j = i4;
                this.f34936i = i - i4;
                return;
            }
            this.f34937j = 0;
        }

        /* renamed from: S */
        private void m44874S() throws IOException {
            if (this.f34936i - this.f34938k >= 10) {
                m44875T();
            } else {
                m44876U();
            }
        }

        /* renamed from: T */
        private void m44875T() throws IOException {
            int i = 0;
            while (i < 10) {
                byte[] bArr = this.f34934g;
                int i2 = this.f34938k;
                this.f34938k = i2 + 1;
                if (bArr[i2] < 0) {
                    i++;
                } else {
                    return;
                }
            }
            throw C8135e0.m44687f();
        }

        /* renamed from: U */
        private void m44876U() throws IOException {
            int i = 0;
            while (i < 10) {
                if (mo26988I() < 0) {
                    i++;
                } else {
                    return;
                }
            }
            throw C8135e0.m44687f();
        }

        /* renamed from: A */
        public long mo26963A() throws IOException {
            return C8167j.m44840c(mo26993N());
        }

        /* renamed from: B */
        public String mo26964B() throws IOException {
            int M = mo26992M();
            if (M > 0) {
                int i = this.f34936i;
                int i2 = this.f34938k;
                if (M <= i - i2) {
                    String str = new String(this.f34934g, i2, M, C8119d0.f34855b);
                    this.f34938k += M;
                    return str;
                }
            }
            if (M == 0) {
                return "";
            }
            if (M < 0) {
                throw C8135e0.m44688g();
            }
            throw C8135e0.m44692m();
        }

        /* renamed from: C */
        public String mo26965C() throws IOException {
            int M = mo26992M();
            if (M > 0) {
                int i = this.f34936i;
                int i2 = this.f34938k;
                if (M <= i - i2) {
                    String h = C8094a2.m44506h(this.f34934g, i2, M);
                    this.f34938k += M;
                    return h;
                }
            }
            if (M == 0) {
                return "";
            }
            if (M <= 0) {
                throw C8135e0.m44688g();
            }
            throw C8135e0.m44692m();
        }

        /* renamed from: D */
        public int mo26966D() throws IOException {
            if (mo26973e()) {
                this.f34940m = 0;
                return 0;
            }
            int M = mo26992M();
            this.f34940m = M;
            if (C8105b2.m44580a(M) != 0) {
                return this.f34940m;
            }
            throw C8135e0.m44684c();
        }

        /* renamed from: E */
        public int mo26967E() throws IOException {
            return mo26992M();
        }

        /* renamed from: F */
        public long mo26968F() throws IOException {
            return mo26993N();
        }

        /* renamed from: H */
        public boolean mo26970H(int i) throws IOException {
            int b = C8105b2.m44581b(i);
            if (b == 0) {
                m44874S();
                return true;
            } else if (b == 1) {
                mo26996R(8);
                return true;
            } else if (b == 2) {
                mo26996R(mo26992M());
                return true;
            } else if (b == 3) {
                mo26995Q();
                mo26971a(C8105b2.m44582c(C8105b2.m44580a(i), 4));
                return true;
            } else if (b == 4) {
                return false;
            } else {
                if (b == 5) {
                    mo26996R(4);
                    return true;
                }
                throw C8135e0.m44686e();
            }
        }

        /* renamed from: I */
        public byte mo26988I() throws IOException {
            int i = this.f34938k;
            if (i != this.f34936i) {
                byte[] bArr = this.f34934g;
                this.f34938k = i + 1;
                return bArr[i];
            }
            throw C8135e0.m44692m();
        }

        /* renamed from: J */
        public byte[] mo26989J(int i) throws IOException {
            if (i > 0) {
                int i2 = this.f34936i;
                int i3 = this.f34938k;
                if (i <= i2 - i3) {
                    int i4 = i + i3;
                    this.f34938k = i4;
                    return Arrays.copyOfRange(this.f34934g, i3, i4);
                }
            }
            if (i > 0) {
                throw C8135e0.m44692m();
            } else if (i == 0) {
                return C8119d0.f34857d;
            } else {
                throw C8135e0.m44688g();
            }
        }

        /* renamed from: K */
        public int mo26990K() throws IOException {
            int i = this.f34938k;
            if (this.f34936i - i >= 4) {
                byte[] bArr = this.f34934g;
                this.f34938k = i + 4;
                return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
            }
            throw C8135e0.m44692m();
        }

        /* renamed from: L */
        public long mo26991L() throws IOException {
            int i = this.f34938k;
            if (this.f34936i - i >= 8) {
                byte[] bArr = this.f34934g;
                this.f34938k = i + 8;
                return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
            }
            throw C8135e0.m44692m();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0068, code lost:
            if (r2[r3] < 0) goto L_0x006a;
         */
        /* renamed from: M */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo26992M() throws java.io.IOException {
            /*
                r5 = this;
                int r0 = r5.f34938k
                int r1 = r5.f34936i
                if (r1 != r0) goto L_0x0007
                goto L_0x006a
            L_0x0007:
                byte[] r2 = r5.f34934g
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0012
                r5.f34938k = r3
                return r0
            L_0x0012:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L_0x0018
                goto L_0x006a
            L_0x0018:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0024
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
                goto L_0x0070
            L_0x0024:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x0031
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L_0x002f:
                r1 = r3
                goto L_0x0070
            L_0x0031:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x003f
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L_0x0070
            L_0x003f:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r4 = r1 << 28
                r0 = r0 ^ r4
                r4 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r4
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r3 = r2[r3]
                if (r3 >= 0) goto L_0x0070
                int r3 = r1 + 1
                byte r1 = r2[r1]
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r3 = r2[r3]
                if (r3 >= 0) goto L_0x0070
                int r3 = r1 + 1
                byte r1 = r2[r1]
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r2 = r2[r3]
                if (r2 >= 0) goto L_0x0070
            L_0x006a:
                long r0 = r5.mo26994O()
                int r1 = (int) r0
                return r1
            L_0x0070:
                r5.f34938k = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C8167j.C8169b.mo26992M():int");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b4, code lost:
            if (((long) r2[r0]) < 0) goto L_0x00b6;
         */
        /* renamed from: N */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long mo26993N() throws java.io.IOException {
            /*
                r11 = this;
                int r0 = r11.f34938k
                int r1 = r11.f34936i
                if (r1 != r0) goto L_0x0008
                goto L_0x00b6
            L_0x0008:
                byte[] r2 = r11.f34934g
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0014
                r11.f34938k = r3
                long r0 = (long) r0
                return r0
            L_0x0014:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L_0x001b
                goto L_0x00b6
            L_0x001b:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0029
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
            L_0x0026:
                long r2 = (long) r0
                goto L_0x00bd
            L_0x0029:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x003a
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
                long r0 = (long) r0
                r9 = r0
                r1 = r3
                r2 = r9
                goto L_0x00bd
            L_0x003a:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0048
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L_0x0026
            L_0x0048:
                long r3 = (long) r0
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r5 = (long) r1
                r1 = 28
                long r5 = r5 << r1
                long r3 = r3 ^ r5
                r5 = 0
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L_0x005f
                r1 = 266354560(0xfe03f80, double:1.315966377E-315)
            L_0x005b:
                long r2 = r3 ^ r1
                r1 = r0
                goto L_0x00bd
            L_0x005f:
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                r0 = 35
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x0074
                r5 = -34093383808(0xfffffff80fe03f80, double:NaN)
            L_0x0071:
                long r2 = r3 ^ r5
                goto L_0x00bd
            L_0x0074:
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r7 = (long) r1
                r1 = 42
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L_0x0087
                r1 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
                goto L_0x005b
            L_0x0087:
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                r0 = 49
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x009a
                r5 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
                goto L_0x0071
            L_0x009a:
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r7 = (long) r1
                r1 = 56
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                r7 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 >= 0) goto L_0x00bb
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x00bc
            L_0x00b6:
                long r0 = r11.mo26994O()
                return r0
            L_0x00bb:
                r1 = r0
            L_0x00bc:
                r2 = r3
            L_0x00bd:
                r11.f34938k = r1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C8167j.C8169b.mo26993N():long");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: O */
        public long mo26994O() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte I = mo26988I();
                j |= ((long) (I & Byte.MAX_VALUE)) << i;
                if ((I & C8843b4.f36445d) == 0) {
                    return j;
                }
            }
            throw C8135e0.m44687f();
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* renamed from: Q */
        public void mo26995Q() throws java.io.IOException {
            /*
                r1 = this;
            L_0x0000:
                int r0 = r1.mo26966D()
                if (r0 == 0) goto L_0x000c
                boolean r0 = r1.mo26970H(r0)
                if (r0 != 0) goto L_0x0000
            L_0x000c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C8167j.C8169b.mo26995Q():void");
        }

        /* renamed from: R */
        public void mo26996R(int i) throws IOException {
            if (i >= 0) {
                int i2 = this.f34936i;
                int i3 = this.f34938k;
                if (i <= i2 - i3) {
                    this.f34938k = i3 + i;
                    return;
                }
            }
            if (i < 0) {
                throw C8135e0.m44688g();
            }
            throw C8135e0.m44692m();
        }

        /* renamed from: a */
        public void mo26971a(int i) throws C8135e0 {
            if (this.f34940m != i) {
                throw C8135e0.m44683b();
            }
        }

        /* renamed from: d */
        public int mo26972d() {
            return this.f34938k - this.f34939l;
        }

        /* renamed from: e */
        public boolean mo26973e() throws IOException {
            return this.f34938k == this.f34936i;
        }

        /* renamed from: m */
        public void mo26974m(int i) {
            this.f34942o = i;
            m44873P();
        }

        /* renamed from: n */
        public int mo26975n(int i) throws C8135e0 {
            if (i >= 0) {
                int d = i + mo26972d();
                if (d >= 0) {
                    int i2 = this.f34942o;
                    if (d <= i2) {
                        this.f34942o = d;
                        m44873P();
                        return i2;
                    }
                    throw C8135e0.m44692m();
                }
                throw C8135e0.m44689h();
            }
            throw C8135e0.m44688g();
        }

        /* renamed from: o */
        public boolean mo26976o() throws IOException {
            return mo26993N() != 0;
        }

        /* renamed from: p */
        public C8153i mo26977p() throws IOException {
            C8153i iVar;
            int M = mo26992M();
            if (M > 0) {
                int i = this.f34936i;
                int i2 = this.f34938k;
                if (M <= i - i2) {
                    if (!this.f34935h || !this.f34941n) {
                        iVar = C8153i.m44778r(this.f34934g, i2, M);
                    } else {
                        iVar = C8153i.m44771V(this.f34934g, i2, M);
                    }
                    this.f34938k += M;
                    return iVar;
                }
            }
            if (M == 0) {
                return C8153i.f34908b;
            }
            return C8153i.m44770T(mo26989J(M));
        }

        /* renamed from: q */
        public double mo26978q() throws IOException {
            return Double.longBitsToDouble(mo26991L());
        }

        /* renamed from: r */
        public int mo26979r() throws IOException {
            return mo26992M();
        }

        /* renamed from: s */
        public int mo26980s() throws IOException {
            return mo26990K();
        }

        /* renamed from: t */
        public long mo26981t() throws IOException {
            return mo26991L();
        }

        /* renamed from: u */
        public float mo26982u() throws IOException {
            return Float.intBitsToFloat(mo26990K());
        }

        /* renamed from: v */
        public int mo26983v() throws IOException {
            return mo26992M();
        }

        /* renamed from: w */
        public long mo26984w() throws IOException {
            return mo26993N();
        }

        /* renamed from: x */
        public int mo26985x() throws IOException {
            return mo26990K();
        }

        /* renamed from: y */
        public long mo26986y() throws IOException {
            return mo26991L();
        }

        /* renamed from: z */
        public int mo26987z() throws IOException {
            return C8167j.m44839b(mo26992M());
        }

        private C8169b(byte[] bArr, int i, int i2, boolean z) {
            super();
            this.f34942o = Integer.MAX_VALUE;
            this.f34934g = bArr;
            this.f34936i = i2 + i;
            this.f34938k = i;
            this.f34939l = i;
            this.f34935h = z;
        }
    }

    /* renamed from: com.google.protobuf.j$c */
    /* compiled from: CodedInputStream */
    private static final class C8170c extends C8167j {

        /* renamed from: g */
        private final Iterable<ByteBuffer> f34943g;

        /* renamed from: h */
        private final Iterator<ByteBuffer> f34944h;

        /* renamed from: i */
        private ByteBuffer f34945i;

        /* renamed from: j */
        private final boolean f34946j;

        /* renamed from: k */
        private boolean f34947k;

        /* renamed from: l */
        private int f34948l;

        /* renamed from: m */
        private int f34949m;

        /* renamed from: n */
        private int f34950n;

        /* renamed from: o */
        private int f34951o;

        /* renamed from: p */
        private int f34952p;

        /* renamed from: q */
        private int f34953q;

        /* renamed from: r */
        private long f34954r;

        /* renamed from: s */
        private long f34955s;

        /* renamed from: t */
        private long f34956t;

        /* renamed from: u */
        private long f34957u;

        /* renamed from: I */
        private long m44910I() {
            return this.f34957u - this.f34954r;
        }

        /* renamed from: J */
        private void m44911J() throws C8135e0 {
            if (this.f34944h.hasNext()) {
                m44917X();
                return;
            }
            throw C8135e0.m44692m();
        }

        /* renamed from: L */
        private void m44912L(byte[] bArr, int i, int i2) throws IOException {
            if (i2 >= 0 && i2 <= m44914S()) {
                int i3 = i2;
                while (i3 > 0) {
                    if (m44910I() == 0) {
                        m44911J();
                    }
                    int min = Math.min(i3, (int) m44910I());
                    long j = (long) min;
                    C8268z1.m46017p(this.f34954r, bArr, (long) ((i2 - i3) + i), j);
                    i3 -= min;
                    this.f34954r += j;
                }
            } else if (i2 > 0) {
                throw C8135e0.m44692m();
            } else if (i2 != 0) {
                throw C8135e0.m44688g();
            }
        }

        /* renamed from: R */
        private void m44913R() {
            int i = this.f34948l + this.f34949m;
            this.f34948l = i;
            int i2 = i - this.f34953q;
            int i3 = this.f34950n;
            if (i2 > i3) {
                int i4 = i2 - i3;
                this.f34949m = i4;
                this.f34948l = i - i4;
                return;
            }
            this.f34949m = 0;
        }

        /* renamed from: S */
        private int m44914S() {
            return (int) ((((long) (this.f34948l - this.f34952p)) - this.f34954r) + this.f34955s);
        }

        /* renamed from: V */
        private void m44915V() throws IOException {
            int i = 0;
            while (i < 10) {
                if (mo26997K() < 0) {
                    i++;
                } else {
                    return;
                }
            }
            throw C8135e0.m44687f();
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(3:6|7|8) */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
            throw r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:0x0021, code lost:
            r4 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0027, code lost:
            throw com.google.protobuf.C8135e0.m44692m();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0028, code lost:
            r2.position(r0);
            r2.limit(r1);
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0023 */
        /* renamed from: W */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private java.nio.ByteBuffer m44916W(int r4, int r5) throws java.io.IOException {
            /*
                r3 = this;
                java.nio.ByteBuffer r0 = r3.f34945i
                int r0 = r0.position()
                java.nio.ByteBuffer r1 = r3.f34945i
                int r1 = r1.limit()
                java.nio.ByteBuffer r2 = r3.f34945i
                r2.position(r4)     // Catch:{ IllegalArgumentException -> 0x0023 }
                r2.limit(r5)     // Catch:{ IllegalArgumentException -> 0x0023 }
                java.nio.ByteBuffer r4 = r3.f34945i     // Catch:{ IllegalArgumentException -> 0x0023 }
                java.nio.ByteBuffer r4 = r4.slice()     // Catch:{ IllegalArgumentException -> 0x0023 }
                r2.position(r0)
                r2.limit(r1)
                return r4
            L_0x0021:
                r4 = move-exception
                goto L_0x0028
            L_0x0023:
                com.google.protobuf.e0 r4 = com.google.protobuf.C8135e0.m44692m()     // Catch:{ all -> 0x0021 }
                throw r4     // Catch:{ all -> 0x0021 }
            L_0x0028:
                r2.position(r0)
                r2.limit(r1)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C8167j.C8170c.m44916W(int, int):java.nio.ByteBuffer");
        }

        /* renamed from: X */
        private void m44917X() {
            ByteBuffer next = this.f34944h.next();
            this.f34945i = next;
            this.f34952p += (int) (this.f34954r - this.f34955s);
            long position = (long) next.position();
            this.f34954r = position;
            this.f34955s = position;
            this.f34957u = (long) this.f34945i.limit();
            long k = C8268z1.m46012k(this.f34945i);
            this.f34956t = k;
            this.f34954r += k;
            this.f34955s += k;
            this.f34957u += k;
        }

        /* renamed from: A */
        public long mo26963A() throws IOException {
            return C8167j.m44840c(mo27001P());
        }

        /* renamed from: B */
        public String mo26964B() throws IOException {
            int O = mo27000O();
            if (O > 0) {
                long j = (long) O;
                long j2 = this.f34957u;
                long j3 = this.f34954r;
                if (j <= j2 - j3) {
                    byte[] bArr = new byte[O];
                    C8268z1.m46017p(j3, bArr, 0, j);
                    String str = new String(bArr, C8119d0.f34855b);
                    this.f34954r += j;
                    return str;
                }
            }
            if (O > 0 && O <= m44914S()) {
                byte[] bArr2 = new byte[O];
                m44912L(bArr2, 0, O);
                return new String(bArr2, C8119d0.f34855b);
            } else if (O == 0) {
                return "";
            } else {
                if (O < 0) {
                    throw C8135e0.m44688g();
                }
                throw C8135e0.m44692m();
            }
        }

        /* renamed from: C */
        public String mo26965C() throws IOException {
            int O = mo27000O();
            if (O > 0) {
                long j = (long) O;
                long j2 = this.f34957u;
                long j3 = this.f34954r;
                if (j <= j2 - j3) {
                    String g = C8094a2.m44505g(this.f34945i, (int) (j3 - this.f34955s), O);
                    this.f34954r += j;
                    return g;
                }
            }
            if (O >= 0 && O <= m44914S()) {
                byte[] bArr = new byte[O];
                m44912L(bArr, 0, O);
                return C8094a2.m44506h(bArr, 0, O);
            } else if (O == 0) {
                return "";
            } else {
                if (O <= 0) {
                    throw C8135e0.m44688g();
                }
                throw C8135e0.m44692m();
            }
        }

        /* renamed from: D */
        public int mo26966D() throws IOException {
            if (mo26973e()) {
                this.f34951o = 0;
                return 0;
            }
            int O = mo27000O();
            this.f34951o = O;
            if (C8105b2.m44580a(O) != 0) {
                return this.f34951o;
            }
            throw C8135e0.m44684c();
        }

        /* renamed from: E */
        public int mo26967E() throws IOException {
            return mo27000O();
        }

        /* renamed from: F */
        public long mo26968F() throws IOException {
            return mo27001P();
        }

        /* renamed from: H */
        public boolean mo26970H(int i) throws IOException {
            int b = C8105b2.m44581b(i);
            if (b == 0) {
                m44915V();
                return true;
            } else if (b == 1) {
                mo27004U(8);
                return true;
            } else if (b == 2) {
                mo27004U(mo27000O());
                return true;
            } else if (b == 3) {
                mo27003T();
                mo26971a(C8105b2.m44582c(C8105b2.m44580a(i), 4));
                return true;
            } else if (b == 4) {
                return false;
            } else {
                if (b == 5) {
                    mo27004U(4);
                    return true;
                }
                throw C8135e0.m44686e();
            }
        }

        /* renamed from: K */
        public byte mo26997K() throws IOException {
            if (m44910I() == 0) {
                m44911J();
            }
            long j = this.f34954r;
            this.f34954r = 1 + j;
            return C8268z1.m46024w(j);
        }

        /* renamed from: M */
        public int mo26998M() throws IOException {
            if (m44910I() < 4) {
                return (mo26997K() & 255) | ((mo26997K() & 255) << 8) | ((mo26997K() & 255) << 16) | ((mo26997K() & 255) << 24);
            }
            long j = this.f34954r;
            this.f34954r = 4 + j;
            return ((C8268z1.m46024w(j + 3) & 255) << 24) | (C8268z1.m46024w(j) & 255) | ((C8268z1.m46024w(1 + j) & 255) << 8) | ((C8268z1.m46024w(2 + j) & 255) << 16);
        }

        /* renamed from: N */
        public long mo26999N() throws IOException {
            if (m44910I() < 8) {
                return (((long) mo26997K()) & 255) | ((((long) mo26997K()) & 255) << 8) | ((((long) mo26997K()) & 255) << 16) | ((((long) mo26997K()) & 255) << 24) | ((((long) mo26997K()) & 255) << 32) | ((((long) mo26997K()) & 255) << 40) | ((((long) mo26997K()) & 255) << 48) | ((((long) mo26997K()) & 255) << 56);
            }
            long j = this.f34954r;
            this.f34954r = 8 + j;
            return ((((long) C8268z1.m46024w(j + 7)) & 255) << 56) | (((long) C8268z1.m46024w(j)) & 255) | ((((long) C8268z1.m46024w(1 + j)) & 255) << 8) | ((((long) C8268z1.m46024w(2 + j)) & 255) << 16) | ((((long) C8268z1.m46024w(3 + j)) & 255) << 24) | ((((long) C8268z1.m46024w(4 + j)) & 255) << 32) | ((((long) C8268z1.m46024w(5 + j)) & 255) << 40) | ((((long) C8268z1.m46024w(6 + j)) & 255) << 48);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0088, code lost:
            if (com.google.protobuf.C8268z1.m46024w(r4) < 0) goto L_0x008a;
         */
        /* renamed from: O */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo27000O() throws java.io.IOException {
            /*
                r10 = this;
                long r0 = r10.f34954r
                long r2 = r10.f34957u
                int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r4 != 0) goto L_0x000a
                goto L_0x008a
            L_0x000a:
                r2 = 1
                long r4 = r0 + r2
                byte r0 = com.google.protobuf.C8268z1.m46024w(r0)
                if (r0 < 0) goto L_0x001a
                long r4 = r10.f34954r
                long r4 = r4 + r2
                r10.f34954r = r4
                return r0
            L_0x001a:
                long r6 = r10.f34957u
                long r8 = r10.f34954r
                long r6 = r6 - r8
                r8 = 10
                int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r1 >= 0) goto L_0x0026
                goto L_0x008a
            L_0x0026:
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.C8268z1.m46024w(r4)
                int r1 = r1 << 7
                r0 = r0 ^ r1
                if (r0 >= 0) goto L_0x0034
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
                goto L_0x0090
            L_0x0034:
                long r4 = r6 + r2
                byte r1 = com.google.protobuf.C8268z1.m46024w(r6)
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x0043
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L_0x0041:
                r6 = r4
                goto L_0x0090
            L_0x0043:
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.C8268z1.m46024w(r4)
                int r1 = r1 << 21
                r0 = r0 ^ r1
                if (r0 >= 0) goto L_0x0053
                r1 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r1
                goto L_0x0090
            L_0x0053:
                long r4 = r6 + r2
                byte r1 = com.google.protobuf.C8268z1.m46024w(r6)
                int r6 = r1 << 28
                r0 = r0 ^ r6
                r6 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r6
                if (r1 >= 0) goto L_0x0041
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.C8268z1.m46024w(r4)
                if (r1 >= 0) goto L_0x0090
                long r4 = r6 + r2
                byte r1 = com.google.protobuf.C8268z1.m46024w(r6)
                if (r1 >= 0) goto L_0x0041
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.C8268z1.m46024w(r4)
                if (r1 >= 0) goto L_0x0090
                long r4 = r6 + r2
                byte r1 = com.google.protobuf.C8268z1.m46024w(r6)
                if (r1 >= 0) goto L_0x0041
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.C8268z1.m46024w(r4)
                if (r1 >= 0) goto L_0x0090
            L_0x008a:
                long r0 = r10.mo27002Q()
                int r1 = (int) r0
                return r1
            L_0x0090:
                r10.f34954r = r6
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C8167j.C8170c.mo27000O():int");
        }

        /* renamed from: P */
        public long mo27001P() throws IOException {
            long j;
            long j2;
            long j3;
            byte b;
            long j4 = this.f34954r;
            if (this.f34957u != j4) {
                long j5 = j4 + 1;
                byte w = C8268z1.m46024w(j4);
                if (w >= 0) {
                    this.f34954r++;
                    return (long) w;
                } else if (this.f34957u - this.f34954r >= 10) {
                    long j6 = j5 + 1;
                    byte w2 = w ^ (C8268z1.m46024w(j5) << 7);
                    if (w2 < 0) {
                        b = w2 ^ C8843b4.f36445d;
                    } else {
                        long j7 = j6 + 1;
                        byte w3 = w2 ^ (C8268z1.m46024w(j6) << 14);
                        if (w3 >= 0) {
                            j = (long) (w3 ^ C8843b4.f36445d);
                        } else {
                            j6 = j7 + 1;
                            byte w4 = w3 ^ (C8268z1.m46024w(j7) << 21);
                            if (w4 < 0) {
                                b = w4 ^ C8843b4.f36445d;
                            } else {
                                j7 = j6 + 1;
                                long w5 = ((long) w4) ^ (((long) C8268z1.m46024w(j6)) << 28);
                                if (w5 >= 0) {
                                    j3 = 266354560;
                                } else {
                                    long j8 = j7 + 1;
                                    long w6 = w5 ^ (((long) C8268z1.m46024w(j7)) << 35);
                                    if (w6 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        j7 = j8 + 1;
                                        w5 = w6 ^ (((long) C8268z1.m46024w(j8)) << 42);
                                        if (w5 >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            j8 = j7 + 1;
                                            w6 = w5 ^ (((long) C8268z1.m46024w(j7)) << 49);
                                            if (w6 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                j7 = j8 + 1;
                                                j = (w6 ^ (((long) C8268z1.m46024w(j8)) << 56)) ^ 71499008037633920L;
                                                if (j < 0) {
                                                    long j9 = 1 + j7;
                                                    if (((long) C8268z1.m46024w(j7)) >= 0) {
                                                        j6 = j9;
                                                        this.f34954r = j6;
                                                        return j;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    j = w6 ^ j2;
                                    j6 = j8;
                                    this.f34954r = j6;
                                    return j;
                                }
                                j = w5 ^ j3;
                            }
                        }
                        j6 = j7;
                        this.f34954r = j6;
                        return j;
                    }
                    j = (long) b;
                    this.f34954r = j6;
                    return j;
                }
            }
            return mo27002Q();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: Q */
        public long mo27002Q() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte K = mo26997K();
                j |= ((long) (K & Byte.MAX_VALUE)) << i;
                if ((K & C8843b4.f36445d) == 0) {
                    return j;
                }
            }
            throw C8135e0.m44687f();
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* renamed from: T */
        public void mo27003T() throws java.io.IOException {
            /*
                r1 = this;
            L_0x0000:
                int r0 = r1.mo26966D()
                if (r0 == 0) goto L_0x000c
                boolean r0 = r1.mo26970H(r0)
                if (r0 != 0) goto L_0x0000
            L_0x000c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C8167j.C8170c.mo27003T():void");
        }

        /* renamed from: U */
        public void mo27004U(int i) throws IOException {
            if (i >= 0 && ((long) i) <= (((long) (this.f34948l - this.f34952p)) - this.f34954r) + this.f34955s) {
                while (i > 0) {
                    if (m44910I() == 0) {
                        m44911J();
                    }
                    int min = Math.min(i, (int) m44910I());
                    i -= min;
                    this.f34954r += (long) min;
                }
            } else if (i < 0) {
                throw C8135e0.m44688g();
            } else {
                throw C8135e0.m44692m();
            }
        }

        /* renamed from: a */
        public void mo26971a(int i) throws C8135e0 {
            if (this.f34951o != i) {
                throw C8135e0.m44683b();
            }
        }

        /* renamed from: d */
        public int mo26972d() {
            return (int) ((((long) (this.f34952p - this.f34953q)) + this.f34954r) - this.f34955s);
        }

        /* renamed from: e */
        public boolean mo26973e() throws IOException {
            return (((long) this.f34952p) + this.f34954r) - this.f34955s == ((long) this.f34948l);
        }

        /* renamed from: m */
        public void mo26974m(int i) {
            this.f34950n = i;
            m44913R();
        }

        /* renamed from: n */
        public int mo26975n(int i) throws C8135e0 {
            if (i >= 0) {
                int d = i + mo26972d();
                int i2 = this.f34950n;
                if (d <= i2) {
                    this.f34950n = d;
                    m44913R();
                    return i2;
                }
                throw C8135e0.m44692m();
            }
            throw C8135e0.m44688g();
        }

        /* renamed from: o */
        public boolean mo26976o() throws IOException {
            return mo27001P() != 0;
        }

        /* renamed from: p */
        public C8153i mo26977p() throws IOException {
            int O = mo27000O();
            if (O > 0) {
                long j = (long) O;
                long j2 = this.f34957u;
                long j3 = this.f34954r;
                if (j <= j2 - j3) {
                    if (!this.f34946j || !this.f34947k) {
                        byte[] bArr = new byte[O];
                        C8268z1.m46017p(j3, bArr, 0, j);
                        this.f34954r += j;
                        return C8153i.m44770T(bArr);
                    }
                    int i = (int) (j3 - this.f34956t);
                    C8153i R = C8153i.m44769R(m44916W(i, O + i));
                    this.f34954r += j;
                    return R;
                }
            }
            if (O <= 0 || O > m44914S()) {
                if (O == 0) {
                    return C8153i.f34908b;
                }
                if (O < 0) {
                    throw C8135e0.m44688g();
                }
                throw C8135e0.m44692m();
            } else if (!this.f34946j || !this.f34947k) {
                byte[] bArr2 = new byte[O];
                m44912L(bArr2, 0, O);
                return C8153i.m44770T(bArr2);
            } else {
                ArrayList arrayList = new ArrayList();
                while (O > 0) {
                    if (m44910I() == 0) {
                        m44911J();
                    }
                    int min = Math.min(O, (int) m44910I());
                    int i2 = (int) (this.f34954r - this.f34956t);
                    arrayList.add(C8153i.m44769R(m44916W(i2, i2 + min)));
                    O -= min;
                    this.f34954r += (long) min;
                }
                return C8153i.m44776o(arrayList);
            }
        }

        /* renamed from: q */
        public double mo26978q() throws IOException {
            return Double.longBitsToDouble(mo26999N());
        }

        /* renamed from: r */
        public int mo26979r() throws IOException {
            return mo27000O();
        }

        /* renamed from: s */
        public int mo26980s() throws IOException {
            return mo26998M();
        }

        /* renamed from: t */
        public long mo26981t() throws IOException {
            return mo26999N();
        }

        /* renamed from: u */
        public float mo26982u() throws IOException {
            return Float.intBitsToFloat(mo26998M());
        }

        /* renamed from: v */
        public int mo26983v() throws IOException {
            return mo27000O();
        }

        /* renamed from: w */
        public long mo26984w() throws IOException {
            return mo27001P();
        }

        /* renamed from: x */
        public int mo26985x() throws IOException {
            return mo26998M();
        }

        /* renamed from: y */
        public long mo26986y() throws IOException {
            return mo26999N();
        }

        /* renamed from: z */
        public int mo26987z() throws IOException {
            return C8167j.m44839b(mo27000O());
        }

        private C8170c(Iterable<ByteBuffer> iterable, int i, boolean z) {
            super();
            this.f34950n = Integer.MAX_VALUE;
            this.f34948l = i;
            this.f34943g = iterable;
            this.f34944h = iterable.iterator();
            this.f34946j = z;
            this.f34952p = 0;
            this.f34953q = 0;
            if (i == 0) {
                this.f34945i = C8119d0.f34858e;
                this.f34954r = 0;
                this.f34955s = 0;
                this.f34957u = 0;
                this.f34956t = 0;
                return;
            }
            m44917X();
        }
    }

    /* renamed from: com.google.protobuf.j$d */
    /* compiled from: CodedInputStream */
    private static final class C8171d extends C8167j {

        /* renamed from: g */
        private final InputStream f34958g;

        /* renamed from: h */
        private final byte[] f34959h;

        /* renamed from: i */
        private int f34960i;

        /* renamed from: j */
        private int f34961j;

        /* renamed from: k */
        private int f34962k;

        /* renamed from: l */
        private int f34963l;

        /* renamed from: m */
        private int f34964m;

        /* renamed from: n */
        private int f34965n;

        /* renamed from: o */
        private C8172a f34966o;

        /* renamed from: com.google.protobuf.j$d$a */
        /* compiled from: CodedInputStream */
        private interface C8172a {
            /* renamed from: a */
            void mo27013a();
        }

        /* renamed from: I */
        private static int m44950I(InputStream inputStream) throws IOException {
            try {
                return inputStream.available();
            } catch (C8135e0 e) {
                e.mo26893j();
                throw e;
            }
        }

        /* renamed from: J */
        private static int m44951J(InputStream inputStream, byte[] bArr, int i, int i2) throws IOException {
            try {
                return inputStream.read(bArr, i, i2);
            } catch (C8135e0 e) {
                e.mo26893j();
                throw e;
            }
        }

        /* renamed from: K */
        private C8153i m44952K(int i) throws IOException {
            byte[] N = m44954N(i);
            if (N != null) {
                return C8153i.m44777q(N);
            }
            int i2 = this.f34962k;
            int i3 = this.f34960i;
            int i4 = i3 - i2;
            this.f34964m += i3;
            this.f34962k = 0;
            this.f34960i = 0;
            List<byte[]> O = m44955O(i - i4);
            byte[] bArr = new byte[i];
            System.arraycopy(this.f34959h, i2, bArr, 0, i4);
            for (byte[] next : O) {
                System.arraycopy(next, 0, bArr, i4, next.length);
                i4 += next.length;
            }
            return C8153i.m44770T(bArr);
        }

        /* renamed from: M */
        private byte[] m44953M(int i, boolean z) throws IOException {
            byte[] N = m44954N(i);
            if (N != null) {
                return z ? (byte[]) N.clone() : N;
            }
            int i2 = this.f34962k;
            int i3 = this.f34960i;
            int i4 = i3 - i2;
            this.f34964m += i3;
            this.f34962k = 0;
            this.f34960i = 0;
            List<byte[]> O = m44955O(i - i4);
            byte[] bArr = new byte[i];
            System.arraycopy(this.f34959h, i2, bArr, 0, i4);
            for (byte[] next : O) {
                System.arraycopy(next, 0, bArr, i4, next.length);
                i4 += next.length;
            }
            return bArr;
        }

        /* renamed from: N */
        private byte[] m44954N(int i) throws IOException {
            if (i == 0) {
                return C8119d0.f34857d;
            }
            if (i >= 0) {
                int i2 = this.f34964m;
                int i3 = this.f34962k;
                int i4 = i2 + i3 + i;
                if (i4 - this.f34931c <= 0) {
                    int i5 = this.f34965n;
                    if (i4 <= i5) {
                        int i6 = this.f34960i - i3;
                        int i7 = i - i6;
                        if (i7 >= 4096 && i7 > m44950I(this.f34958g)) {
                            return null;
                        }
                        byte[] bArr = new byte[i];
                        System.arraycopy(this.f34959h, this.f34962k, bArr, 0, i6);
                        this.f34964m += this.f34960i;
                        this.f34962k = 0;
                        this.f34960i = 0;
                        while (i6 < i) {
                            int J = m44951J(this.f34958g, bArr, i6, i - i6);
                            if (J != -1) {
                                this.f34964m += J;
                                i6 += J;
                            } else {
                                throw C8135e0.m44692m();
                            }
                        }
                        return bArr;
                    }
                    mo27012Y((i5 - i2) - i3);
                    throw C8135e0.m44692m();
                }
                throw C8135e0.m44691l();
            }
            throw C8135e0.m44688g();
        }

        /* renamed from: O */
        private List<byte[]> m44955O(int i) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i > 0) {
                int min = Math.min(i, 4096);
                byte[] bArr = new byte[min];
                int i2 = 0;
                while (i2 < min) {
                    int read = this.f34958g.read(bArr, i2, min - i2);
                    if (read != -1) {
                        this.f34964m += read;
                        i2 += read;
                    } else {
                        throw C8135e0.m44692m();
                    }
                }
                i -= min;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        /* renamed from: U */
        private void m44956U() {
            int i = this.f34960i + this.f34961j;
            this.f34960i = i;
            int i2 = this.f34964m + i;
            int i3 = this.f34965n;
            if (i2 > i3) {
                int i4 = i2 - i3;
                this.f34961j = i4;
                this.f34960i = i - i4;
                return;
            }
            this.f34961j = 0;
        }

        /* renamed from: V */
        private void m44957V(int i) throws IOException {
            if (m44963d0(i)) {
                return;
            }
            if (i > (this.f34931c - this.f34964m) - this.f34962k) {
                throw C8135e0.m44691l();
            }
            throw C8135e0.m44692m();
        }

        /* renamed from: W */
        private static long m44958W(InputStream inputStream, long j) throws IOException {
            try {
                return inputStream.skip(j);
            } catch (C8135e0 e) {
                e.mo26893j();
                throw e;
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x005c, code lost:
            throw new java.lang.IllegalStateException(r8.f34958g.getClass() + "#skip returned invalid result: " + r0 + "\nThe InputStream implementation is buggy.");
         */
        /* renamed from: Z */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m44959Z(int r9) throws java.io.IOException {
            /*
                r8 = this;
                if (r9 < 0) goto L_0x0097
                int r0 = r8.f34964m
                int r1 = r8.f34962k
                int r2 = r0 + r1
                int r2 = r2 + r9
                int r3 = r8.f34965n
                if (r2 > r3) goto L_0x008d
                com.google.protobuf.j$d$a r2 = r8.f34966o
                r3 = 0
                if (r2 != 0) goto L_0x006f
                int r0 = r0 + r1
                r8.f34964m = r0
                int r0 = r8.f34960i
                int r0 = r0 - r1
                r8.f34960i = r3
                r8.f34962k = r3
                r3 = r0
            L_0x001d:
                if (r3 >= r9) goto L_0x0067
                int r0 = r9 - r3
                java.io.InputStream r1 = r8.f34958g     // Catch:{ all -> 0x005d }
                long r4 = (long) r0     // Catch:{ all -> 0x005d }
                long r0 = m44958W(r1, r4)     // Catch:{ all -> 0x005d }
                r6 = 0
                int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
                if (r2 < 0) goto L_0x0038
                int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                if (r6 > 0) goto L_0x0038
                if (r2 != 0) goto L_0x0035
                goto L_0x0067
            L_0x0035:
                int r1 = (int) r0     // Catch:{ all -> 0x005d }
                int r3 = r3 + r1
                goto L_0x001d
            L_0x0038:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ all -> 0x005d }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x005d }
                r2.<init>()     // Catch:{ all -> 0x005d }
                java.io.InputStream r4 = r8.f34958g     // Catch:{ all -> 0x005d }
                java.lang.Class r4 = r4.getClass()     // Catch:{ all -> 0x005d }
                r2.append(r4)     // Catch:{ all -> 0x005d }
                java.lang.String r4 = "#skip returned invalid result: "
                r2.append(r4)     // Catch:{ all -> 0x005d }
                r2.append(r0)     // Catch:{ all -> 0x005d }
                java.lang.String r0 = "\nThe InputStream implementation is buggy."
                r2.append(r0)     // Catch:{ all -> 0x005d }
                java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x005d }
                r9.<init>(r0)     // Catch:{ all -> 0x005d }
                throw r9     // Catch:{ all -> 0x005d }
            L_0x005d:
                r9 = move-exception
                int r0 = r8.f34964m
                int r0 = r0 + r3
                r8.f34964m = r0
                r8.m44956U()
                throw r9
            L_0x0067:
                int r0 = r8.f34964m
                int r0 = r0 + r3
                r8.f34964m = r0
                r8.m44956U()
            L_0x006f:
                if (r3 >= r9) goto L_0x008c
                int r0 = r8.f34960i
                int r1 = r8.f34962k
                int r1 = r0 - r1
                r8.f34962k = r0
                r0 = 1
                r8.m44957V(r0)
            L_0x007d:
                int r2 = r9 - r1
                int r3 = r8.f34960i
                if (r2 <= r3) goto L_0x008a
                int r1 = r1 + r3
                r8.f34962k = r3
                r8.m44957V(r0)
                goto L_0x007d
            L_0x008a:
                r8.f34962k = r2
            L_0x008c:
                return
            L_0x008d:
                int r3 = r3 - r0
                int r3 = r3 - r1
                r8.mo27012Y(r3)
                com.google.protobuf.e0 r9 = com.google.protobuf.C8135e0.m44692m()
                throw r9
            L_0x0097:
                com.google.protobuf.e0 r9 = com.google.protobuf.C8135e0.m44688g()
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C8167j.C8171d.m44959Z(int):void");
        }

        /* renamed from: a0 */
        private void m44960a0() throws IOException {
            if (this.f34960i - this.f34962k >= 10) {
                m44961b0();
            } else {
                m44962c0();
            }
        }

        /* renamed from: b0 */
        private void m44961b0() throws IOException {
            int i = 0;
            while (i < 10) {
                byte[] bArr = this.f34959h;
                int i2 = this.f34962k;
                this.f34962k = i2 + 1;
                if (bArr[i2] < 0) {
                    i++;
                } else {
                    return;
                }
            }
            throw C8135e0.m44687f();
        }

        /* renamed from: c0 */
        private void m44962c0() throws IOException {
            int i = 0;
            while (i < 10) {
                if (mo27005L() < 0) {
                    i++;
                } else {
                    return;
                }
            }
            throw C8135e0.m44687f();
        }

        /* renamed from: d0 */
        private boolean m44963d0(int i) throws IOException {
            int i2 = this.f34962k;
            if (i2 + i > this.f34960i) {
                int i3 = this.f34931c;
                int i4 = this.f34964m;
                if (i > (i3 - i4) - i2 || i4 + i2 + i > this.f34965n) {
                    return false;
                }
                C8172a aVar = this.f34966o;
                if (aVar != null) {
                    aVar.mo27013a();
                }
                int i5 = this.f34962k;
                if (i5 > 0) {
                    int i6 = this.f34960i;
                    if (i6 > i5) {
                        byte[] bArr = this.f34959h;
                        System.arraycopy(bArr, i5, bArr, 0, i6 - i5);
                    }
                    this.f34964m += i5;
                    this.f34960i -= i5;
                    this.f34962k = 0;
                }
                InputStream inputStream = this.f34958g;
                byte[] bArr2 = this.f34959h;
                int i7 = this.f34960i;
                int J = m44951J(inputStream, bArr2, i7, Math.min(bArr2.length - i7, (this.f34931c - this.f34964m) - i7));
                if (J == 0 || J < -1 || J > this.f34959h.length) {
                    throw new IllegalStateException(this.f34958g.getClass() + "#read(byte[]) returned invalid result: " + J + "\nThe InputStream implementation is buggy.");
                } else if (J <= 0) {
                    return false;
                } else {
                    this.f34960i += J;
                    m44956U();
                    if (this.f34960i >= i) {
                        return true;
                    }
                    return m44963d0(i);
                }
            } else {
                throw new IllegalStateException("refillBuffer() called when " + i + " bytes were already available in buffer");
            }
        }

        /* renamed from: A */
        public long mo26963A() throws IOException {
            return C8167j.m44840c(mo27009S());
        }

        /* renamed from: B */
        public String mo26964B() throws IOException {
            int R = mo27008R();
            if (R > 0) {
                int i = this.f34960i;
                int i2 = this.f34962k;
                if (R <= i - i2) {
                    String str = new String(this.f34959h, i2, R, C8119d0.f34855b);
                    this.f34962k += R;
                    return str;
                }
            }
            if (R == 0) {
                return "";
            }
            if (R > this.f34960i) {
                return new String(m44953M(R, false), C8119d0.f34855b);
            }
            m44957V(R);
            String str2 = new String(this.f34959h, this.f34962k, R, C8119d0.f34855b);
            this.f34962k += R;
            return str2;
        }

        /* renamed from: C */
        public String mo26965C() throws IOException {
            byte[] bArr;
            int R = mo27008R();
            int i = this.f34962k;
            int i2 = this.f34960i;
            if (R <= i2 - i && R > 0) {
                bArr = this.f34959h;
                this.f34962k = i + R;
            } else if (R == 0) {
                return "";
            } else {
                if (R <= i2) {
                    m44957V(R);
                    bArr = this.f34959h;
                    this.f34962k = R + 0;
                } else {
                    bArr = m44953M(R, false);
                }
                i = 0;
            }
            return C8094a2.m44506h(bArr, i, R);
        }

        /* renamed from: D */
        public int mo26966D() throws IOException {
            if (mo26973e()) {
                this.f34963l = 0;
                return 0;
            }
            int R = mo27008R();
            this.f34963l = R;
            if (C8105b2.m44580a(R) != 0) {
                return this.f34963l;
            }
            throw C8135e0.m44684c();
        }

        /* renamed from: E */
        public int mo26967E() throws IOException {
            return mo27008R();
        }

        /* renamed from: F */
        public long mo26968F() throws IOException {
            return mo27009S();
        }

        /* renamed from: H */
        public boolean mo26970H(int i) throws IOException {
            int b = C8105b2.m44581b(i);
            if (b == 0) {
                m44960a0();
                return true;
            } else if (b == 1) {
                mo27012Y(8);
                return true;
            } else if (b == 2) {
                mo27012Y(mo27008R());
                return true;
            } else if (b == 3) {
                mo27011X();
                mo26971a(C8105b2.m44582c(C8105b2.m44580a(i), 4));
                return true;
            } else if (b == 4) {
                return false;
            } else {
                if (b == 5) {
                    mo27012Y(4);
                    return true;
                }
                throw C8135e0.m44686e();
            }
        }

        /* renamed from: L */
        public byte mo27005L() throws IOException {
            if (this.f34962k == this.f34960i) {
                m44957V(1);
            }
            byte[] bArr = this.f34959h;
            int i = this.f34962k;
            this.f34962k = i + 1;
            return bArr[i];
        }

        /* renamed from: P */
        public int mo27006P() throws IOException {
            int i = this.f34962k;
            if (this.f34960i - i < 4) {
                m44957V(4);
                i = this.f34962k;
            }
            byte[] bArr = this.f34959h;
            this.f34962k = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        /* renamed from: Q */
        public long mo27007Q() throws IOException {
            int i = this.f34962k;
            if (this.f34960i - i < 8) {
                m44957V(8);
                i = this.f34962k;
            }
            byte[] bArr = this.f34959h;
            this.f34962k = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0068, code lost:
            if (r2[r3] < 0) goto L_0x006a;
         */
        /* renamed from: R */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo27008R() throws java.io.IOException {
            /*
                r5 = this;
                int r0 = r5.f34962k
                int r1 = r5.f34960i
                if (r1 != r0) goto L_0x0007
                goto L_0x006a
            L_0x0007:
                byte[] r2 = r5.f34959h
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0012
                r5.f34962k = r3
                return r0
            L_0x0012:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L_0x0018
                goto L_0x006a
            L_0x0018:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0024
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
                goto L_0x0070
            L_0x0024:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x0031
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L_0x002f:
                r1 = r3
                goto L_0x0070
            L_0x0031:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x003f
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L_0x0070
            L_0x003f:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r4 = r1 << 28
                r0 = r0 ^ r4
                r4 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r4
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r3 = r2[r3]
                if (r3 >= 0) goto L_0x0070
                int r3 = r1 + 1
                byte r1 = r2[r1]
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r3 = r2[r3]
                if (r3 >= 0) goto L_0x0070
                int r3 = r1 + 1
                byte r1 = r2[r1]
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r2 = r2[r3]
                if (r2 >= 0) goto L_0x0070
            L_0x006a:
                long r0 = r5.mo27010T()
                int r1 = (int) r0
                return r1
            L_0x0070:
                r5.f34962k = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C8167j.C8171d.mo27008R():int");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b4, code lost:
            if (((long) r2[r0]) < 0) goto L_0x00b6;
         */
        /* renamed from: S */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long mo27009S() throws java.io.IOException {
            /*
                r11 = this;
                int r0 = r11.f34962k
                int r1 = r11.f34960i
                if (r1 != r0) goto L_0x0008
                goto L_0x00b6
            L_0x0008:
                byte[] r2 = r11.f34959h
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0014
                r11.f34962k = r3
                long r0 = (long) r0
                return r0
            L_0x0014:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L_0x001b
                goto L_0x00b6
            L_0x001b:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0029
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
            L_0x0026:
                long r2 = (long) r0
                goto L_0x00bd
            L_0x0029:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x003a
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
                long r0 = (long) r0
                r9 = r0
                r1 = r3
                r2 = r9
                goto L_0x00bd
            L_0x003a:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0048
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L_0x0026
            L_0x0048:
                long r3 = (long) r0
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r5 = (long) r1
                r1 = 28
                long r5 = r5 << r1
                long r3 = r3 ^ r5
                r5 = 0
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L_0x005f
                r1 = 266354560(0xfe03f80, double:1.315966377E-315)
            L_0x005b:
                long r2 = r3 ^ r1
                r1 = r0
                goto L_0x00bd
            L_0x005f:
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                r0 = 35
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x0074
                r5 = -34093383808(0xfffffff80fe03f80, double:NaN)
            L_0x0071:
                long r2 = r3 ^ r5
                goto L_0x00bd
            L_0x0074:
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r7 = (long) r1
                r1 = 42
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L_0x0087
                r1 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
                goto L_0x005b
            L_0x0087:
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                r0 = 49
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x009a
                r5 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
                goto L_0x0071
            L_0x009a:
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r7 = (long) r1
                r1 = 56
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                r7 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 >= 0) goto L_0x00bb
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x00bc
            L_0x00b6:
                long r0 = r11.mo27010T()
                return r0
            L_0x00bb:
                r1 = r0
            L_0x00bc:
                r2 = r3
            L_0x00bd:
                r11.f34962k = r1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C8167j.C8171d.mo27009S():long");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: T */
        public long mo27010T() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte L = mo27005L();
                j |= ((long) (L & Byte.MAX_VALUE)) << i;
                if ((L & C8843b4.f36445d) == 0) {
                    return j;
                }
            }
            throw C8135e0.m44687f();
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* renamed from: X */
        public void mo27011X() throws java.io.IOException {
            /*
                r1 = this;
            L_0x0000:
                int r0 = r1.mo26966D()
                if (r0 == 0) goto L_0x000c
                boolean r0 = r1.mo26970H(r0)
                if (r0 != 0) goto L_0x0000
            L_0x000c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C8167j.C8171d.mo27011X():void");
        }

        /* renamed from: Y */
        public void mo27012Y(int i) throws IOException {
            int i2 = this.f34960i;
            int i3 = this.f34962k;
            if (i > i2 - i3 || i < 0) {
                m44959Z(i);
            } else {
                this.f34962k = i3 + i;
            }
        }

        /* renamed from: a */
        public void mo26971a(int i) throws C8135e0 {
            if (this.f34963l != i) {
                throw C8135e0.m44683b();
            }
        }

        /* renamed from: d */
        public int mo26972d() {
            return this.f34964m + this.f34962k;
        }

        /* renamed from: e */
        public boolean mo26973e() throws IOException {
            return this.f34962k == this.f34960i && !m44963d0(1);
        }

        /* renamed from: m */
        public void mo26974m(int i) {
            this.f34965n = i;
            m44956U();
        }

        /* renamed from: n */
        public int mo26975n(int i) throws C8135e0 {
            if (i >= 0) {
                int i2 = i + this.f34964m + this.f34962k;
                int i3 = this.f34965n;
                if (i2 <= i3) {
                    this.f34965n = i2;
                    m44956U();
                    return i3;
                }
                throw C8135e0.m44692m();
            }
            throw C8135e0.m44688g();
        }

        /* renamed from: o */
        public boolean mo26976o() throws IOException {
            return mo27009S() != 0;
        }

        /* renamed from: p */
        public C8153i mo26977p() throws IOException {
            int R = mo27008R();
            int i = this.f34960i;
            int i2 = this.f34962k;
            if (R <= i - i2 && R > 0) {
                C8153i r = C8153i.m44778r(this.f34959h, i2, R);
                this.f34962k += R;
                return r;
            } else if (R == 0) {
                return C8153i.f34908b;
            } else {
                return m44952K(R);
            }
        }

        /* renamed from: q */
        public double mo26978q() throws IOException {
            return Double.longBitsToDouble(mo27007Q());
        }

        /* renamed from: r */
        public int mo26979r() throws IOException {
            return mo27008R();
        }

        /* renamed from: s */
        public int mo26980s() throws IOException {
            return mo27006P();
        }

        /* renamed from: t */
        public long mo26981t() throws IOException {
            return mo27007Q();
        }

        /* renamed from: u */
        public float mo26982u() throws IOException {
            return Float.intBitsToFloat(mo27006P());
        }

        /* renamed from: v */
        public int mo26983v() throws IOException {
            return mo27008R();
        }

        /* renamed from: w */
        public long mo26984w() throws IOException {
            return mo27009S();
        }

        /* renamed from: x */
        public int mo26985x() throws IOException {
            return mo27006P();
        }

        /* renamed from: y */
        public long mo26986y() throws IOException {
            return mo27007Q();
        }

        /* renamed from: z */
        public int mo26987z() throws IOException {
            return C8167j.m44839b(mo27008R());
        }

        private C8171d(InputStream inputStream, int i) {
            super();
            this.f34965n = Integer.MAX_VALUE;
            this.f34966o = null;
            C8119d0.m44650b(inputStream, "input");
            this.f34958g = inputStream;
            this.f34959h = new byte[i];
            this.f34960i = 0;
            this.f34962k = 0;
            this.f34964m = 0;
        }
    }

    /* renamed from: com.google.protobuf.j$e */
    /* compiled from: CodedInputStream */
    private static final class C8173e extends C8167j {

        /* renamed from: g */
        private final ByteBuffer f34967g;

        /* renamed from: h */
        private final boolean f34968h;

        /* renamed from: i */
        private final long f34969i;

        /* renamed from: j */
        private long f34970j;

        /* renamed from: k */
        private long f34971k;

        /* renamed from: l */
        private long f34972l;

        /* renamed from: m */
        private int f34973m;

        /* renamed from: n */
        private int f34974n;

        /* renamed from: o */
        private boolean f34975o;

        /* renamed from: p */
        private int f34976p;

        /* renamed from: I */
        private int m44997I(long j) {
            return (int) (j - this.f34969i);
        }

        /* renamed from: J */
        static boolean m44998J() {
            return C8268z1.m45987J();
        }

        /* renamed from: Q */
        private void m44999Q() {
            long j = this.f34970j + ((long) this.f34973m);
            this.f34970j = j;
            int i = (int) (j - this.f34972l);
            int i2 = this.f34976p;
            if (i > i2) {
                int i3 = i - i2;
                this.f34973m = i3;
                this.f34970j = j - ((long) i3);
                return;
            }
            this.f34973m = 0;
        }

        /* renamed from: R */
        private int m45000R() {
            return (int) (this.f34970j - this.f34971k);
        }

        /* renamed from: U */
        private void m45001U() throws IOException {
            if (m45000R() >= 10) {
                m45002V();
            } else {
                m45003W();
            }
        }

        /* renamed from: V */
        private void m45002V() throws IOException {
            int i = 0;
            while (i < 10) {
                long j = this.f34971k;
                this.f34971k = 1 + j;
                if (C8268z1.m46024w(j) < 0) {
                    i++;
                } else {
                    return;
                }
            }
            throw C8135e0.m44687f();
        }

        /* renamed from: W */
        private void m45003W() throws IOException {
            int i = 0;
            while (i < 10) {
                if (mo27014K() < 0) {
                    i++;
                } else {
                    return;
                }
            }
            throw C8135e0.m44687f();
        }

        /* renamed from: X */
        private ByteBuffer m45004X(long j, long j2) throws IOException {
            int position = this.f34967g.position();
            int limit = this.f34967g.limit();
            ByteBuffer byteBuffer = this.f34967g;
            try {
                byteBuffer.position(m44997I(j));
                byteBuffer.limit(m44997I(j2));
                ByteBuffer slice = this.f34967g.slice();
                byteBuffer.position(position);
                byteBuffer.limit(limit);
                return slice;
            } catch (IllegalArgumentException e) {
                C8135e0 m = C8135e0.m44692m();
                m.initCause(e);
                throw m;
            } catch (Throwable th) {
                byteBuffer.position(position);
                byteBuffer.limit(limit);
                throw th;
            }
        }

        /* renamed from: A */
        public long mo26963A() throws IOException {
            return C8167j.m44840c(mo27018O());
        }

        /* renamed from: B */
        public String mo26964B() throws IOException {
            int N = mo27017N();
            if (N > 0 && N <= m45000R()) {
                byte[] bArr = new byte[N];
                long j = (long) N;
                C8268z1.m46017p(this.f34971k, bArr, 0, j);
                String str = new String(bArr, C8119d0.f34855b);
                this.f34971k += j;
                return str;
            } else if (N == 0) {
                return "";
            } else {
                if (N < 0) {
                    throw C8135e0.m44688g();
                }
                throw C8135e0.m44692m();
            }
        }

        /* renamed from: C */
        public String mo26965C() throws IOException {
            int N = mo27017N();
            if (N > 0 && N <= m45000R()) {
                String g = C8094a2.m44505g(this.f34967g, m44997I(this.f34971k), N);
                this.f34971k += (long) N;
                return g;
            } else if (N == 0) {
                return "";
            } else {
                if (N <= 0) {
                    throw C8135e0.m44688g();
                }
                throw C8135e0.m44692m();
            }
        }

        /* renamed from: D */
        public int mo26966D() throws IOException {
            if (mo26973e()) {
                this.f34974n = 0;
                return 0;
            }
            int N = mo27017N();
            this.f34974n = N;
            if (C8105b2.m44580a(N) != 0) {
                return this.f34974n;
            }
            throw C8135e0.m44684c();
        }

        /* renamed from: E */
        public int mo26967E() throws IOException {
            return mo27017N();
        }

        /* renamed from: F */
        public long mo26968F() throws IOException {
            return mo27018O();
        }

        /* renamed from: H */
        public boolean mo26970H(int i) throws IOException {
            int b = C8105b2.m44581b(i);
            if (b == 0) {
                m45001U();
                return true;
            } else if (b == 1) {
                mo27021T(8);
                return true;
            } else if (b == 2) {
                mo27021T(mo27017N());
                return true;
            } else if (b == 3) {
                mo27020S();
                mo26971a(C8105b2.m44582c(C8105b2.m44580a(i), 4));
                return true;
            } else if (b == 4) {
                return false;
            } else {
                if (b == 5) {
                    mo27021T(4);
                    return true;
                }
                throw C8135e0.m44686e();
            }
        }

        /* renamed from: K */
        public byte mo27014K() throws IOException {
            long j = this.f34971k;
            if (j != this.f34970j) {
                this.f34971k = 1 + j;
                return C8268z1.m46024w(j);
            }
            throw C8135e0.m44692m();
        }

        /* renamed from: L */
        public int mo27015L() throws IOException {
            long j = this.f34971k;
            if (this.f34970j - j >= 4) {
                this.f34971k = 4 + j;
                return ((C8268z1.m46024w(j + 3) & 255) << 24) | (C8268z1.m46024w(j) & 255) | ((C8268z1.m46024w(1 + j) & 255) << 8) | ((C8268z1.m46024w(2 + j) & 255) << 16);
            }
            throw C8135e0.m44692m();
        }

        /* renamed from: M */
        public long mo27016M() throws IOException {
            long j = this.f34971k;
            if (this.f34970j - j >= 8) {
                this.f34971k = 8 + j;
                return ((((long) C8268z1.m46024w(j + 7)) & 255) << 56) | (((long) C8268z1.m46024w(j)) & 255) | ((((long) C8268z1.m46024w(1 + j)) & 255) << 8) | ((((long) C8268z1.m46024w(2 + j)) & 255) << 16) | ((((long) C8268z1.m46024w(3 + j)) & 255) << 24) | ((((long) C8268z1.m46024w(4 + j)) & 255) << 32) | ((((long) C8268z1.m46024w(5 + j)) & 255) << 40) | ((((long) C8268z1.m46024w(6 + j)) & 255) << 48);
            }
            throw C8135e0.m44692m();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0083, code lost:
            if (com.google.protobuf.C8268z1.m46024w(r4) < 0) goto L_0x0085;
         */
        /* renamed from: N */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo27017N() throws java.io.IOException {
            /*
                r10 = this;
                long r0 = r10.f34971k
                long r2 = r10.f34970j
                int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r4 != 0) goto L_0x000a
                goto L_0x0085
            L_0x000a:
                r2 = 1
                long r4 = r0 + r2
                byte r0 = com.google.protobuf.C8268z1.m46024w(r0)
                if (r0 < 0) goto L_0x0017
                r10.f34971k = r4
                return r0
            L_0x0017:
                long r6 = r10.f34970j
                long r6 = r6 - r4
                r8 = 9
                int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r1 >= 0) goto L_0x0021
                goto L_0x0085
            L_0x0021:
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.C8268z1.m46024w(r4)
                int r1 = r1 << 7
                r0 = r0 ^ r1
                if (r0 >= 0) goto L_0x002f
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
                goto L_0x008b
            L_0x002f:
                long r4 = r6 + r2
                byte r1 = com.google.protobuf.C8268z1.m46024w(r6)
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x003e
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L_0x003c:
                r6 = r4
                goto L_0x008b
            L_0x003e:
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.C8268z1.m46024w(r4)
                int r1 = r1 << 21
                r0 = r0 ^ r1
                if (r0 >= 0) goto L_0x004e
                r1 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r1
                goto L_0x008b
            L_0x004e:
                long r4 = r6 + r2
                byte r1 = com.google.protobuf.C8268z1.m46024w(r6)
                int r6 = r1 << 28
                r0 = r0 ^ r6
                r6 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r6
                if (r1 >= 0) goto L_0x003c
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.C8268z1.m46024w(r4)
                if (r1 >= 0) goto L_0x008b
                long r4 = r6 + r2
                byte r1 = com.google.protobuf.C8268z1.m46024w(r6)
                if (r1 >= 0) goto L_0x003c
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.C8268z1.m46024w(r4)
                if (r1 >= 0) goto L_0x008b
                long r4 = r6 + r2
                byte r1 = com.google.protobuf.C8268z1.m46024w(r6)
                if (r1 >= 0) goto L_0x003c
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.C8268z1.m46024w(r4)
                if (r1 >= 0) goto L_0x008b
            L_0x0085:
                long r0 = r10.mo27019P()
                int r1 = (int) r0
                return r1
            L_0x008b:
                r10.f34971k = r6
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C8167j.C8173e.mo27017N():int");
        }

        /* renamed from: O */
        public long mo27018O() throws IOException {
            long j;
            long j2;
            long j3;
            byte b;
            long j4 = this.f34971k;
            if (this.f34970j != j4) {
                long j5 = j4 + 1;
                byte w = C8268z1.m46024w(j4);
                if (w >= 0) {
                    this.f34971k = j5;
                    return (long) w;
                } else if (this.f34970j - j5 >= 9) {
                    long j6 = j5 + 1;
                    byte w2 = w ^ (C8268z1.m46024w(j5) << 7);
                    if (w2 < 0) {
                        b = w2 ^ C8843b4.f36445d;
                    } else {
                        long j7 = j6 + 1;
                        byte w3 = w2 ^ (C8268z1.m46024w(j6) << 14);
                        if (w3 >= 0) {
                            j = (long) (w3 ^ C8843b4.f36445d);
                        } else {
                            j6 = j7 + 1;
                            byte w4 = w3 ^ (C8268z1.m46024w(j7) << 21);
                            if (w4 < 0) {
                                b = w4 ^ C8843b4.f36445d;
                            } else {
                                j7 = j6 + 1;
                                long w5 = ((long) w4) ^ (((long) C8268z1.m46024w(j6)) << 28);
                                if (w5 >= 0) {
                                    j3 = 266354560;
                                } else {
                                    long j8 = j7 + 1;
                                    long w6 = w5 ^ (((long) C8268z1.m46024w(j7)) << 35);
                                    if (w6 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        j7 = j8 + 1;
                                        w5 = w6 ^ (((long) C8268z1.m46024w(j8)) << 42);
                                        if (w5 >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            j8 = j7 + 1;
                                            w6 = w5 ^ (((long) C8268z1.m46024w(j7)) << 49);
                                            if (w6 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                j7 = j8 + 1;
                                                j = (w6 ^ (((long) C8268z1.m46024w(j8)) << 56)) ^ 71499008037633920L;
                                                if (j < 0) {
                                                    long j9 = 1 + j7;
                                                    if (((long) C8268z1.m46024w(j7)) >= 0) {
                                                        j6 = j9;
                                                        this.f34971k = j6;
                                                        return j;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    j = w6 ^ j2;
                                    j6 = j8;
                                    this.f34971k = j6;
                                    return j;
                                }
                                j = w5 ^ j3;
                            }
                        }
                        j6 = j7;
                        this.f34971k = j6;
                        return j;
                    }
                    j = (long) b;
                    this.f34971k = j6;
                    return j;
                }
            }
            return mo27019P();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: P */
        public long mo27019P() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte K = mo27014K();
                j |= ((long) (K & Byte.MAX_VALUE)) << i;
                if ((K & C8843b4.f36445d) == 0) {
                    return j;
                }
            }
            throw C8135e0.m44687f();
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* renamed from: S */
        public void mo27020S() throws java.io.IOException {
            /*
                r1 = this;
            L_0x0000:
                int r0 = r1.mo26966D()
                if (r0 == 0) goto L_0x000c
                boolean r0 = r1.mo26970H(r0)
                if (r0 != 0) goto L_0x0000
            L_0x000c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C8167j.C8173e.mo27020S():void");
        }

        /* renamed from: T */
        public void mo27021T(int i) throws IOException {
            if (i >= 0 && i <= m45000R()) {
                this.f34971k += (long) i;
            } else if (i < 0) {
                throw C8135e0.m44688g();
            } else {
                throw C8135e0.m44692m();
            }
        }

        /* renamed from: a */
        public void mo26971a(int i) throws C8135e0 {
            if (this.f34974n != i) {
                throw C8135e0.m44683b();
            }
        }

        /* renamed from: d */
        public int mo26972d() {
            return (int) (this.f34971k - this.f34972l);
        }

        /* renamed from: e */
        public boolean mo26973e() throws IOException {
            return this.f34971k == this.f34970j;
        }

        /* renamed from: m */
        public void mo26974m(int i) {
            this.f34976p = i;
            m44999Q();
        }

        /* renamed from: n */
        public int mo26975n(int i) throws C8135e0 {
            if (i >= 0) {
                int d = i + mo26972d();
                int i2 = this.f34976p;
                if (d <= i2) {
                    this.f34976p = d;
                    m44999Q();
                    return i2;
                }
                throw C8135e0.m44692m();
            }
            throw C8135e0.m44688g();
        }

        /* renamed from: o */
        public boolean mo26976o() throws IOException {
            return mo27018O() != 0;
        }

        /* renamed from: p */
        public C8153i mo26977p() throws IOException {
            int N = mo27017N();
            if (N <= 0 || N > m45000R()) {
                if (N == 0) {
                    return C8153i.f34908b;
                }
                if (N < 0) {
                    throw C8135e0.m44688g();
                }
                throw C8135e0.m44692m();
            } else if (!this.f34968h || !this.f34975o) {
                byte[] bArr = new byte[N];
                long j = (long) N;
                C8268z1.m46017p(this.f34971k, bArr, 0, j);
                this.f34971k += j;
                return C8153i.m44770T(bArr);
            } else {
                long j2 = this.f34971k;
                long j3 = (long) N;
                ByteBuffer X = m45004X(j2, j2 + j3);
                this.f34971k += j3;
                return C8153i.m44769R(X);
            }
        }

        /* renamed from: q */
        public double mo26978q() throws IOException {
            return Double.longBitsToDouble(mo27016M());
        }

        /* renamed from: r */
        public int mo26979r() throws IOException {
            return mo27017N();
        }

        /* renamed from: s */
        public int mo26980s() throws IOException {
            return mo27015L();
        }

        /* renamed from: t */
        public long mo26981t() throws IOException {
            return mo27016M();
        }

        /* renamed from: u */
        public float mo26982u() throws IOException {
            return Float.intBitsToFloat(mo27015L());
        }

        /* renamed from: v */
        public int mo26983v() throws IOException {
            return mo27017N();
        }

        /* renamed from: w */
        public long mo26984w() throws IOException {
            return mo27018O();
        }

        /* renamed from: x */
        public int mo26985x() throws IOException {
            return mo27015L();
        }

        /* renamed from: y */
        public long mo26986y() throws IOException {
            return mo27016M();
        }

        /* renamed from: z */
        public int mo26987z() throws IOException {
            return C8167j.m44839b(mo27017N());
        }

        private C8173e(ByteBuffer byteBuffer, boolean z) {
            super();
            this.f34976p = Integer.MAX_VALUE;
            this.f34967g = byteBuffer;
            long k = C8268z1.m46012k(byteBuffer);
            this.f34969i = k;
            this.f34970j = ((long) byteBuffer.limit()) + k;
            long position = k + ((long) byteBuffer.position());
            this.f34971k = position;
            this.f34972l = position;
            this.f34968h = z;
        }
    }

    /* renamed from: b */
    public static int m44839b(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    /* renamed from: c */
    public static long m44840c(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* renamed from: f */
    public static C8167j m44841f(InputStream inputStream) {
        return m44842g(inputStream, 4096);
    }

    /* renamed from: g */
    public static C8167j m44842g(InputStream inputStream, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("bufferSize must be > 0");
        } else if (inputStream == null) {
            return m44845j(C8119d0.f34857d);
        } else {
            return new C8171d(inputStream, i);
        }
    }

    /* renamed from: h */
    static C8167j m44843h(Iterable<ByteBuffer> iterable, boolean z) {
        boolean z2 = false;
        int i = 0;
        for (ByteBuffer next : iterable) {
            i += next.remaining();
            if (next.hasArray()) {
                z2 |= true;
            } else {
                z2 = next.isDirect() ? z2 | true : z2 | true;
            }
        }
        if (z2) {
            return new C8170c(iterable, i, z);
        }
        return m44841f(new C8142f0(iterable));
    }

    /* renamed from: i */
    static C8167j m44844i(ByteBuffer byteBuffer, boolean z) {
        if (byteBuffer.hasArray()) {
            return m44847l(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining(), z);
        }
        if (byteBuffer.isDirect() && C8173e.m44998J()) {
            return new C8173e(byteBuffer, z);
        }
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.duplicate().get(bArr);
        return m44847l(bArr, 0, remaining, true);
    }

    /* renamed from: j */
    public static C8167j m44845j(byte[] bArr) {
        return m44846k(bArr, 0, bArr.length);
    }

    /* renamed from: k */
    public static C8167j m44846k(byte[] bArr, int i, int i2) {
        return m44847l(bArr, i, i2, false);
    }

    /* renamed from: l */
    static C8167j m44847l(byte[] bArr, int i, int i2, boolean z) {
        C8169b bVar = new C8169b(bArr, i, i2, z);
        try {
            bVar.mo26975n(i2);
            return bVar;
        } catch (C8135e0 e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: A */
    public abstract long mo26963A() throws IOException;

    /* renamed from: B */
    public abstract String mo26964B() throws IOException;

    /* renamed from: C */
    public abstract String mo26965C() throws IOException;

    /* renamed from: D */
    public abstract int mo26966D() throws IOException;

    /* renamed from: E */
    public abstract int mo26967E() throws IOException;

    /* renamed from: F */
    public abstract long mo26968F() throws IOException;

    /* renamed from: G */
    public final int mo26969G(int i) {
        if (i >= 0) {
            int i2 = this.f34931c;
            this.f34931c = i;
            return i2;
        }
        throw new IllegalArgumentException("Size limit cannot be negative: " + i);
    }

    /* renamed from: H */
    public abstract boolean mo26970H(int i) throws IOException;

    /* renamed from: a */
    public abstract void mo26971a(int i) throws C8135e0;

    /* renamed from: d */
    public abstract int mo26972d();

    /* renamed from: e */
    public abstract boolean mo26973e() throws IOException;

    /* renamed from: m */
    public abstract void mo26974m(int i);

    /* renamed from: n */
    public abstract int mo26975n(int i) throws C8135e0;

    /* renamed from: o */
    public abstract boolean mo26976o() throws IOException;

    /* renamed from: p */
    public abstract C8153i mo26977p() throws IOException;

    /* renamed from: q */
    public abstract double mo26978q() throws IOException;

    /* renamed from: r */
    public abstract int mo26979r() throws IOException;

    /* renamed from: s */
    public abstract int mo26980s() throws IOException;

    /* renamed from: t */
    public abstract long mo26981t() throws IOException;

    /* renamed from: u */
    public abstract float mo26982u() throws IOException;

    /* renamed from: v */
    public abstract int mo26983v() throws IOException;

    /* renamed from: w */
    public abstract long mo26984w() throws IOException;

    /* renamed from: x */
    public abstract int mo26985x() throws IOException;

    /* renamed from: y */
    public abstract long mo26986y() throws IOException;

    /* renamed from: z */
    public abstract int mo26987z() throws IOException;

    private C8167j() {
        this.f34930b = f34928f;
        this.f34931c = Integer.MAX_VALUE;
        this.f34933e = false;
    }
}
