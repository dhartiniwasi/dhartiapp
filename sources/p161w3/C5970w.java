package p161w3;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: w3.w */
/* compiled from: NalUnitUtil */
public final class C5970w {

    /* renamed from: a */
    public static final byte[] f29150a = {0, 0, 0, 1};

    /* renamed from: b */
    public static final float[] f29151b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: c */
    private static final Object f29152c = new Object();

    /* renamed from: d */
    private static int[] f29153d = new int[10];

    /* renamed from: w3.w$a */
    /* compiled from: NalUnitUtil */
    public static final class C5971a {

        /* renamed from: a */
        public final int f29154a;

        /* renamed from: b */
        public final boolean f29155b;

        /* renamed from: c */
        public final int f29156c;

        /* renamed from: d */
        public final int f29157d;

        /* renamed from: e */
        public final int[] f29158e;

        /* renamed from: f */
        public final int f29159f;

        /* renamed from: g */
        public final int f29160g;

        /* renamed from: h */
        public final int f29161h;

        /* renamed from: i */
        public final int f29162i;

        /* renamed from: j */
        public final float f29163j;

        public C5971a(int i, boolean z, int i2, int i3, int[] iArr, int i4, int i5, int i6, int i7, float f) {
            this.f29154a = i;
            this.f29155b = z;
            this.f29156c = i2;
            this.f29157d = i3;
            this.f29158e = iArr;
            this.f29159f = i4;
            this.f29160g = i5;
            this.f29161h = i6;
            this.f29162i = i7;
            this.f29163j = f;
        }
    }

    /* renamed from: w3.w$b */
    /* compiled from: NalUnitUtil */
    public static final class C5972b {

        /* renamed from: a */
        public final int f29164a;

        /* renamed from: b */
        public final int f29165b;

        /* renamed from: c */
        public final boolean f29166c;

        public C5972b(int i, int i2, boolean z) {
            this.f29164a = i;
            this.f29165b = i2;
            this.f29166c = z;
        }
    }

    /* renamed from: w3.w$c */
    /* compiled from: NalUnitUtil */
    public static final class C5973c {

        /* renamed from: a */
        public final int f29167a;

        /* renamed from: b */
        public final int f29168b;

        /* renamed from: c */
        public final int f29169c;

        /* renamed from: d */
        public final int f29170d;

        /* renamed from: e */
        public final int f29171e;

        /* renamed from: f */
        public final int f29172f;

        /* renamed from: g */
        public final int f29173g;

        /* renamed from: h */
        public final float f29174h;

        /* renamed from: i */
        public final boolean f29175i;

        /* renamed from: j */
        public final boolean f29176j;

        /* renamed from: k */
        public final int f29177k;

        /* renamed from: l */
        public final int f29178l;

        /* renamed from: m */
        public final int f29179m;

        /* renamed from: n */
        public final boolean f29180n;

        public C5973c(int i, int i2, int i3, int i4, int i5, int i6, int i7, float f, boolean z, boolean z2, int i8, int i9, int i10, boolean z3) {
            this.f29167a = i;
            this.f29168b = i2;
            this.f29169c = i3;
            this.f29170d = i4;
            this.f29171e = i5;
            this.f29172f = i6;
            this.f29173g = i7;
            this.f29174h = f;
            this.f29175i = z;
            this.f29176j = z2;
            this.f29177k = i8;
            this.f29178l = i9;
            this.f29179m = i10;
            this.f29180n = z3;
        }
    }

    /* renamed from: a */
    public static void m35258a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    /* renamed from: b */
    public static void m35259b(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i + 1;
            if (i3 < position) {
                byte b = byteBuffer.get(i) & 255;
                if (i2 == 3) {
                    if (b == 1 && (byteBuffer.get(i3) & 31) == 7) {
                        ByteBuffer duplicate = byteBuffer.duplicate();
                        duplicate.position(i - 3);
                        duplicate.limit(position);
                        byteBuffer.position(0);
                        byteBuffer.put(duplicate);
                        return;
                    }
                } else if (b == 0) {
                    i2++;
                }
                if (b != 0) {
                    i2 = 0;
                }
                i = i3;
            } else {
                byteBuffer.clear();
                return;
            }
        }
    }

    /* renamed from: c */
    public static int m35260c(byte[] bArr, int i, int i2, boolean[] zArr) {
        boolean z;
        int i3 = i2 - i;
        boolean z2 = false;
        C5917a.m34873f(i3 >= 0);
        if (i3 == 0) {
            return i2;
        }
        if (zArr[0]) {
            m35258a(zArr);
            return i - 3;
        } else if (i3 > 1 && zArr[1] && bArr[i] == 1) {
            m35258a(zArr);
            return i - 2;
        } else if (i3 <= 2 || !zArr[2] || bArr[i] != 0 || bArr[i + 1] != 1) {
            int i4 = i2 - 1;
            int i5 = i + 2;
            while (i5 < i4) {
                if ((bArr[i5] & 254) == 0) {
                    int i6 = i5 - 2;
                    if (bArr[i6] == 0 && bArr[i5 - 1] == 0 && bArr[i5] == 1) {
                        m35258a(zArr);
                        return i6;
                    }
                    i5 -= 2;
                }
                i5 += 3;
            }
            if (i3 <= 2 ? i3 != 2 ? !zArr[1] || bArr[i4] != 1 : !(zArr[2] && bArr[i2 - 2] == 0 && bArr[i4] == 1) : !(bArr[i2 - 3] == 0 && bArr[i2 - 2] == 0 && bArr[i4] == 1)) {
                z = false;
            } else {
                z = true;
            }
            zArr[0] = z;
            zArr[1] = i3 <= 1 ? !(!zArr[2] || bArr[i4] != 0) : bArr[i2 + -2] == 0 && bArr[i4] == 0;
            if (bArr[i4] == 0) {
                z2 = true;
            }
            zArr[2] = z2;
            return i2;
        } else {
            m35258a(zArr);
            return i - 1;
        }
    }

    /* renamed from: d */
    private static int m35261d(byte[] bArr, int i, int i2) {
        while (i < i2 - 2) {
            if (bArr[i] == 0 && bArr[i + 1] == 0 && bArr[i + 2] == 3) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: e */
    public static int m35262e(byte[] bArr, int i) {
        return (bArr[i + 3] & 126) >> 1;
    }

    /* renamed from: f */
    public static int m35263f(byte[] bArr, int i) {
        return bArr[i + 3] & 31;
    }

    /* renamed from: g */
    public static boolean m35264g(String str, byte b) {
        if ("video/avc".equals(str) && (b & 31) == 6) {
            return true;
        }
        if (!"video/hevc".equals(str) || ((b & 126) >> 1) != 39) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public static C5971a m35265h(byte[] bArr, int i, int i2) {
        return m35266i(bArr, i + 2, i2);
    }

    /* renamed from: i */
    public static C5971a m35266i(byte[] bArr, int i, int i2) {
        C5920b0 b0Var = new C5920b0(bArr, i, i2);
        b0Var.mo20582l(4);
        int e = b0Var.mo20577e(3);
        b0Var.mo20581k();
        int e2 = b0Var.mo20577e(2);
        boolean d = b0Var.mo20576d();
        int e3 = b0Var.mo20577e(5);
        int i3 = 0;
        for (int i4 = 0; i4 < 32; i4++) {
            if (b0Var.mo20576d()) {
                i3 |= 1 << i4;
            }
        }
        int[] iArr = new int[6];
        for (int i5 = 0; i5 < 6; i5++) {
            iArr[i5] = b0Var.mo20577e(8);
        }
        int e4 = b0Var.mo20577e(8);
        int i6 = 0;
        for (int i7 = 0; i7 < e; i7++) {
            if (b0Var.mo20576d()) {
                i6 += 89;
            }
            if (b0Var.mo20576d()) {
                i6 += 8;
            }
        }
        b0Var.mo20582l(i6);
        if (e > 0) {
            b0Var.mo20582l((8 - e) * 2);
        }
        int h = b0Var.mo20579h();
        int h2 = b0Var.mo20579h();
        if (h2 == 3) {
            b0Var.mo20581k();
        }
        int h3 = b0Var.mo20579h();
        int h4 = b0Var.mo20579h();
        if (b0Var.mo20576d()) {
            int h5 = b0Var.mo20579h();
            int h6 = b0Var.mo20579h();
            int h7 = b0Var.mo20579h();
            int h8 = b0Var.mo20579h();
            h3 -= ((h2 == 1 || h2 == 2) ? 2 : 1) * (h5 + h6);
            h4 -= (h2 == 1 ? 2 : 1) * (h7 + h8);
        }
        b0Var.mo20579h();
        b0Var.mo20579h();
        int h9 = b0Var.mo20579h();
        for (int i8 = b0Var.mo20576d() ? 0 : e; i8 <= e; i8++) {
            b0Var.mo20579h();
            b0Var.mo20579h();
            b0Var.mo20579h();
        }
        b0Var.mo20579h();
        b0Var.mo20579h();
        b0Var.mo20579h();
        b0Var.mo20579h();
        b0Var.mo20579h();
        b0Var.mo20579h();
        if (b0Var.mo20576d() && b0Var.mo20576d()) {
            m35271n(b0Var);
        }
        b0Var.mo20582l(2);
        if (b0Var.mo20576d()) {
            b0Var.mo20582l(8);
            b0Var.mo20579h();
            b0Var.mo20579h();
            b0Var.mo20581k();
        }
        m35273p(b0Var);
        if (b0Var.mo20576d()) {
            for (int i9 = 0; i9 < b0Var.mo20579h(); i9++) {
                b0Var.mo20582l(h9 + 4 + 1);
            }
        }
        b0Var.mo20582l(2);
        float f = 1.0f;
        if (b0Var.mo20576d()) {
            if (b0Var.mo20576d()) {
                int e5 = b0Var.mo20577e(8);
                if (e5 == 255) {
                    int e6 = b0Var.mo20577e(16);
                    int e7 = b0Var.mo20577e(16);
                    if (!(e6 == 0 || e7 == 0)) {
                        f = ((float) e6) / ((float) e7);
                    }
                } else {
                    float[] fArr = f29151b;
                    if (e5 < fArr.length) {
                        f = fArr[e5];
                    } else {
                        C5961r.m35215i("NalUnitUtil", "Unexpected aspect_ratio_idc value: " + e5);
                    }
                }
            }
            if (b0Var.mo20576d()) {
                b0Var.mo20581k();
            }
            if (b0Var.mo20576d()) {
                b0Var.mo20582l(4);
                if (b0Var.mo20576d()) {
                    b0Var.mo20582l(24);
                }
            }
            if (b0Var.mo20576d()) {
                b0Var.mo20579h();
                b0Var.mo20579h();
            }
            b0Var.mo20581k();
            if (b0Var.mo20576d()) {
                h4 *= 2;
            }
        }
        return new C5971a(e2, d, e3, i3, iArr, e4, h, h3, h4, f);
    }

    /* renamed from: j */
    public static C5972b m35267j(byte[] bArr, int i, int i2) {
        return m35268k(bArr, i + 1, i2);
    }

    /* renamed from: k */
    public static C5972b m35268k(byte[] bArr, int i, int i2) {
        C5920b0 b0Var = new C5920b0(bArr, i, i2);
        int h = b0Var.mo20579h();
        int h2 = b0Var.mo20579h();
        b0Var.mo20581k();
        return new C5972b(h, h2, b0Var.mo20576d());
    }

    /* renamed from: l */
    public static C5973c m35269l(byte[] bArr, int i, int i2) {
        return m35270m(bArr, i + 1, i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x014b  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p161w3.C5970w.C5973c m35270m(byte[] r22, int r23, int r24) {
        /*
            w3.b0 r0 = new w3.b0
            r1 = r22
            r2 = r23
            r3 = r24
            r0.<init>(r1, r2, r3)
            r1 = 8
            int r3 = r0.mo20577e(r1)
            int r4 = r0.mo20577e(r1)
            int r5 = r0.mo20577e(r1)
            int r6 = r0.mo20579h()
            r2 = 3
            r9 = 1
            r10 = 100
            if (r3 == r10) goto L_0x004b
            r10 = 110(0x6e, float:1.54E-43)
            if (r3 == r10) goto L_0x004b
            r10 = 122(0x7a, float:1.71E-43)
            if (r3 == r10) goto L_0x004b
            r10 = 244(0xf4, float:3.42E-43)
            if (r3 == r10) goto L_0x004b
            r10 = 44
            if (r3 == r10) goto L_0x004b
            r10 = 83
            if (r3 == r10) goto L_0x004b
            r10 = 86
            if (r3 == r10) goto L_0x004b
            r10 = 118(0x76, float:1.65E-43)
            if (r3 == r10) goto L_0x004b
            r10 = 128(0x80, float:1.794E-43)
            if (r3 == r10) goto L_0x004b
            r10 = 138(0x8a, float:1.93E-43)
            if (r3 != r10) goto L_0x0048
            goto L_0x004b
        L_0x0048:
            r10 = 1
            r11 = 0
            goto L_0x0084
        L_0x004b:
            int r10 = r0.mo20579h()
            if (r10 != r2) goto L_0x0056
            boolean r11 = r0.mo20576d()
            goto L_0x0057
        L_0x0056:
            r11 = 0
        L_0x0057:
            r0.mo20579h()
            r0.mo20579h()
            r0.mo20581k()
            boolean r12 = r0.mo20576d()
            if (r12 == 0) goto L_0x0084
            if (r10 == r2) goto L_0x006b
            r12 = 8
            goto L_0x006d
        L_0x006b:
            r12 = 12
        L_0x006d:
            r13 = 0
        L_0x006e:
            if (r13 >= r12) goto L_0x0084
            boolean r14 = r0.mo20576d()
            if (r14 == 0) goto L_0x0081
            r14 = 6
            if (r13 >= r14) goto L_0x007c
            r14 = 16
            goto L_0x007e
        L_0x007c:
            r14 = 64
        L_0x007e:
            m35272o(r0, r14)
        L_0x0081:
            int r13 = r13 + 1
            goto L_0x006e
        L_0x0084:
            int r12 = r0.mo20579h()
            int r13 = r12 + 4
            int r14 = r0.mo20579h()
            if (r14 != 0) goto L_0x0098
            int r12 = r0.mo20579h()
            int r12 = r12 + 4
            r15 = r12
            goto L_0x00ba
        L_0x0098:
            if (r14 != r9) goto L_0x00b9
            boolean r12 = r0.mo20576d()
            r0.mo20578g()
            r0.mo20578g()
            int r15 = r0.mo20579h()
            long r1 = (long) r15
            r15 = 0
        L_0x00aa:
            long r7 = (long) r15
            int r17 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r17 >= 0) goto L_0x00b5
            r0.mo20579h()
            int r15 = r15 + 1
            goto L_0x00aa
        L_0x00b5:
            r16 = r12
            r15 = 0
            goto L_0x00bc
        L_0x00b9:
            r15 = 0
        L_0x00ba:
            r16 = 0
        L_0x00bc:
            int r7 = r0.mo20579h()
            r0.mo20581k()
            int r1 = r0.mo20579h()
            int r1 = r1 + r9
            int r2 = r0.mo20579h()
            int r2 = r2 + r9
            boolean r12 = r0.mo20576d()
            int r8 = 2 - r12
            int r8 = r8 * r2
            if (r12 != 0) goto L_0x00da
            r0.mo20581k()
        L_0x00da:
            r0.mo20581k()
            r2 = 16
            int r1 = r1 * 16
            int r8 = r8 * 16
            boolean r2 = r0.mo20576d()
            if (r2 == 0) goto L_0x011e
            int r2 = r0.mo20579h()
            int r17 = r0.mo20579h()
            int r18 = r0.mo20579h()
            int r19 = r0.mo20579h()
            if (r10 != 0) goto L_0x00fe
            int r10 = 2 - r12
            goto L_0x0113
        L_0x00fe:
            r20 = 2
            r9 = 3
            if (r10 != r9) goto L_0x0107
            r9 = 1
            r21 = 1
            goto L_0x010a
        L_0x0107:
            r9 = 1
            r21 = 2
        L_0x010a:
            if (r10 != r9) goto L_0x010d
            r9 = 2
        L_0x010d:
            int r10 = 2 - r12
            int r10 = r10 * r9
            r9 = r21
        L_0x0113:
            int r2 = r2 + r17
            int r2 = r2 * r9
            int r1 = r1 - r2
            int r18 = r18 + r19
            int r18 = r18 * r10
            int r8 = r8 - r18
        L_0x011e:
            r9 = r8
            r8 = r1
            r1 = 1065353216(0x3f800000, float:1.0)
            boolean r2 = r0.mo20576d()
            if (r2 == 0) goto L_0x016a
            boolean r2 = r0.mo20576d()
            if (r2 == 0) goto L_0x016a
            r2 = 8
            int r2 = r0.mo20577e(r2)
            r10 = 255(0xff, float:3.57E-43)
            if (r2 != r10) goto L_0x014b
            r10 = 16
            int r2 = r0.mo20577e(r10)
            int r0 = r0.mo20577e(r10)
            if (r2 == 0) goto L_0x0149
            if (r0 == 0) goto L_0x0149
            float r1 = (float) r2
            float r0 = (float) r0
            float r1 = r1 / r0
        L_0x0149:
            r10 = r1
            goto L_0x016c
        L_0x014b:
            float[] r0 = f29151b
            int r10 = r0.length
            if (r2 >= r10) goto L_0x0154
            r0 = r0[r2]
            r10 = r0
            goto L_0x016c
        L_0x0154:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r10 = "Unexpected aspect_ratio_idc value: "
            r0.append(r10)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "NalUnitUtil"
            p161w3.C5961r.m35215i(r2, r0)
        L_0x016a:
            r10 = 1065353216(0x3f800000, float:1.0)
        L_0x016c:
            w3.w$c r0 = new w3.w$c
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p161w3.C5970w.m35270m(byte[], int, int):w3.w$c");
    }

    /* renamed from: n */
    private static void m35271n(C5920b0 b0Var) {
        for (int i = 0; i < 4; i++) {
            int i2 = 0;
            while (i2 < 6) {
                int i3 = 1;
                if (!b0Var.mo20576d()) {
                    b0Var.mo20579h();
                } else {
                    int min = Math.min(64, 1 << ((i << 1) + 4));
                    if (i > 1) {
                        b0Var.mo20578g();
                    }
                    for (int i4 = 0; i4 < min; i4++) {
                        b0Var.mo20578g();
                    }
                }
                if (i == 3) {
                    i3 = 3;
                }
                i2 += i3;
            }
        }
    }

    /* renamed from: o */
    private static void m35272o(C5920b0 b0Var, int i) {
        int i2 = 8;
        int i3 = 8;
        for (int i4 = 0; i4 < i; i4++) {
            if (i2 != 0) {
                i2 = ((b0Var.mo20578g() + i3) + 256) % 256;
            }
            if (i2 != 0) {
                i3 = i2;
            }
        }
    }

    /* renamed from: p */
    private static void m35273p(C5920b0 b0Var) {
        int h = b0Var.mo20579h();
        int[] iArr = new int[0];
        int[] iArr2 = new int[0];
        int i = -1;
        int i2 = -1;
        int i3 = 0;
        while (i3 < h) {
            if (i3 != 0 && b0Var.mo20576d()) {
                int i4 = i + i2;
                int h2 = (1 - ((b0Var.mo20576d() ? 1 : 0) * true)) * (b0Var.mo20579h() + 1);
                int i5 = i4 + 1;
                boolean[] zArr = new boolean[i5];
                for (int i6 = 0; i6 <= i4; i6++) {
                    if (!b0Var.mo20576d()) {
                        zArr[i6] = b0Var.mo20576d();
                    } else {
                        zArr[i6] = true;
                    }
                }
                int[] iArr3 = new int[i5];
                int[] iArr4 = new int[i5];
                int i7 = 0;
                for (int i8 = i2 - 1; i8 >= 0; i8--) {
                    int i9 = iArr2[i8] + h2;
                    if (i9 < 0 && zArr[i + i8]) {
                        iArr3[i7] = i9;
                        i7++;
                    }
                }
                if (h2 < 0 && zArr[i4]) {
                    iArr3[i7] = h2;
                    i7++;
                }
                for (int i10 = 0; i10 < i; i10++) {
                    int i11 = iArr[i10] + h2;
                    if (i11 < 0 && zArr[i10]) {
                        iArr3[i7] = i11;
                        i7++;
                    }
                }
                int[] copyOf = Arrays.copyOf(iArr3, i7);
                int i12 = 0;
                for (int i13 = i - 1; i13 >= 0; i13--) {
                    int i14 = iArr[i13] + h2;
                    if (i14 > 0 && zArr[i13]) {
                        iArr4[i12] = i14;
                        i12++;
                    }
                }
                if (h2 > 0 && zArr[i4]) {
                    iArr4[i12] = h2;
                    i12++;
                }
                for (int i15 = 0; i15 < i2; i15++) {
                    int i16 = iArr2[i15] + h2;
                    if (i16 > 0 && zArr[i + i15]) {
                        iArr4[i12] = i16;
                        i12++;
                    }
                }
                iArr2 = Arrays.copyOf(iArr4, i12);
                iArr = copyOf;
                i = i7;
                i2 = i12;
            } else {
                int h3 = b0Var.mo20579h();
                int h4 = b0Var.mo20579h();
                int[] iArr5 = new int[h3];
                for (int i17 = 0; i17 < h3; i17++) {
                    iArr5[i17] = b0Var.mo20579h() + 1;
                    b0Var.mo20581k();
                }
                int[] iArr6 = new int[h4];
                for (int i18 = 0; i18 < h4; i18++) {
                    iArr6[i18] = b0Var.mo20579h() + 1;
                    b0Var.mo20581k();
                }
                int[] iArr7 = iArr5;
                i = h3;
                iArr = iArr7;
                int[] iArr8 = iArr6;
                i2 = h4;
                iArr2 = iArr8;
            }
            i3++;
        }
    }

    /* renamed from: q */
    public static int m35274q(byte[] bArr, int i) {
        int i2;
        synchronized (f29152c) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                try {
                    i3 = m35261d(bArr, i3, i);
                    if (i3 < i) {
                        int[] iArr = f29153d;
                        if (iArr.length <= i4) {
                            f29153d = Arrays.copyOf(iArr, iArr.length * 2);
                        }
                        f29153d[i4] = i3;
                        i3 += 3;
                        i4++;
                    }
                } finally {
                }
            }
            i2 = i - i4;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < i4; i7++) {
                int i8 = f29153d[i7] - i6;
                System.arraycopy(bArr, i6, bArr, i5, i8);
                int i9 = i5 + i8;
                int i10 = i9 + 1;
                bArr[i9] = 0;
                i5 = i10 + 1;
                bArr[i10] = 0;
                i6 += i8 + 3;
            }
            System.arraycopy(bArr, i6, bArr, i5, i2 - i5);
        }
        return i2;
    }
}
