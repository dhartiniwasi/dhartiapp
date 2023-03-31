package p388w9;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import p212d9.C9911c;
import p212d9.C9913e;
import p212d9.C9918j;
import p212d9.C9924p;
import p248h9.C10476b;

/* renamed from: w9.a */
/* compiled from: Detector */
public final class C12935a {

    /* renamed from: a */
    private static final int[] f47175a = {0, 4, 1, 5};

    /* renamed from: b */
    private static final int[] f47176b = {6, 2, 7, 3};

    /* renamed from: c */
    private static final int[] f47177c = {8, 1, 1, 1, 1, 1, 1, 3};

    /* renamed from: d */
    private static final int[] f47178d = {7, 1, 1, 3, 1, 1, 1, 2, 1};

    /* renamed from: a */
    private static void m61094a(C9924p[] pVarArr, C9924p[] pVarArr2, int[] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            pVarArr[iArr[i]] = pVarArr2[i];
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
        if (r4.hasNext() == false) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        r5 = (p212d9.C9924p[]) r4.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        if (r5[1] == null) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
        r3 = (int) java.lang.Math.max((float) r3, r5[1].mo32481d());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0041, code lost:
        if (r5[3] == null) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0043, code lost:
        r3 = java.lang.Math.max(r3, (int) r5[3].mo32481d());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        if (r5 == false) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        r4 = r0.iterator();
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.List<p212d9.C9924p[]> m61095b(boolean r8, p248h9.C10476b r9) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 1
            r2 = 0
            r3 = 0
        L_0x0008:
            r4 = 0
            r5 = 0
        L_0x000a:
            int r6 = r9.mo33574g()
            if (r3 >= r6) goto L_0x007c
            d9.p[] r4 = m61099f(r9, r3, r4)
            r6 = r4[r2]
            if (r6 != 0) goto L_0x0052
            r6 = 3
            r7 = r4[r6]
            if (r7 != 0) goto L_0x0052
            if (r5 == 0) goto L_0x007c
            java.util.Iterator r4 = r0.iterator()
        L_0x0023:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x004f
            java.lang.Object r5 = r4.next()
            d9.p[] r5 = (p212d9.C9924p[]) r5
            r7 = r5[r1]
            if (r7 == 0) goto L_0x003f
            float r3 = (float) r3
            r7 = r5[r1]
            float r7 = r7.mo32481d()
            float r3 = java.lang.Math.max(r3, r7)
            int r3 = (int) r3
        L_0x003f:
            r7 = r5[r6]
            if (r7 == 0) goto L_0x0023
            r5 = r5[r6]
            float r5 = r5.mo32481d()
            int r5 = (int) r5
            int r3 = java.lang.Math.max(r3, r5)
            goto L_0x0023
        L_0x004f:
            int r3 = r3 + 5
            goto L_0x0008
        L_0x0052:
            r0.add(r4)
            if (r8 == 0) goto L_0x007c
            r3 = 2
            r5 = r4[r3]
            if (r5 == 0) goto L_0x006a
            r5 = r4[r3]
            float r5 = r5.mo32480c()
            int r5 = (int) r5
            r3 = r4[r3]
            float r3 = r3.mo32481d()
            goto L_0x0078
        L_0x006a:
            r3 = 4
            r5 = r4[r3]
            float r5 = r5.mo32480c()
            int r5 = (int) r5
            r3 = r4[r3]
            float r3 = r3.mo32481d()
        L_0x0078:
            int r3 = (int) r3
            r4 = r5
            r5 = 1
            goto L_0x000a
        L_0x007c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p388w9.C12935a.m61095b(boolean, h9.b):java.util.List");
    }

    /* renamed from: c */
    public static C12936b m61096c(C9911c cVar, Map<C9913e, ?> map, boolean z) throws C9918j {
        C10476b a = cVar.mo32451a();
        List<C9924p[]> b = m61095b(z, a);
        if (b.isEmpty()) {
            a = a.clone();
            a.mo33579k();
            b = m61095b(z, a);
        }
        return new C12936b(a, b);
    }

    /* renamed from: d */
    private static int[] m61097d(C10476b bVar, int i, int i2, int i3, boolean z, int[] iArr, int[] iArr2) {
        Arrays.fill(iArr2, 0, iArr2.length, 0);
        int i4 = 0;
        while (bVar.mo33570d(i, i2) && i > 0) {
            int i5 = i4 + 1;
            if (i4 >= 3) {
                break;
            }
            i--;
            i4 = i5;
        }
        int length = iArr.length;
        boolean z2 = z;
        int i6 = 0;
        int i7 = i;
        while (i < i3) {
            if (bVar.mo33570d(i, i2) ^ z2) {
                iArr2[i6] = iArr2[i6] + 1;
            } else {
                int i8 = length - 1;
                if (i6 != i8) {
                    i6++;
                } else if (m61100g(iArr2, iArr, 0.8f) < 0.42f) {
                    return new int[]{i7, i};
                } else {
                    i7 += iArr2[0] + iArr2[1];
                    int i9 = length - 2;
                    System.arraycopy(iArr2, 2, iArr2, 0, i9);
                    iArr2[i9] = 0;
                    iArr2[i8] = 0;
                    i6--;
                }
                iArr2[i6] = 1;
                z2 = !z2;
            }
            i++;
        }
        if (i6 != length - 1 || m61100g(iArr2, iArr, 0.8f) >= 0.42f) {
            return null;
        }
        return new int[]{i7, i - 1};
    }

    /* renamed from: e */
    private static C9924p[] m61098e(C10476b bVar, int i, int i2, int i3, int i4, int[] iArr) {
        int i5;
        boolean z;
        int i6;
        int i7;
        int i8;
        int i9 = i;
        C9924p[] pVarArr = new C9924p[4];
        int[] iArr2 = new int[iArr.length];
        int i10 = i3;
        while (true) {
            if (i10 >= i9) {
                z = false;
                break;
            }
            int[] d = m61097d(bVar, i4, i10, i2, false, iArr, iArr2);
            if (d != null) {
                int i11 = i10;
                int[] iArr3 = d;
                int i12 = i11;
                while (true) {
                    if (i12 <= 0) {
                        i8 = i12;
                        break;
                    }
                    int i13 = i12 - 1;
                    int[] d2 = m61097d(bVar, i4, i13, i2, false, iArr, iArr2);
                    if (d2 == null) {
                        i8 = i13 + 1;
                        break;
                    }
                    iArr3 = d2;
                    i12 = i13;
                }
                float f = (float) i8;
                pVarArr[0] = new C9924p((float) iArr3[0], f);
                pVarArr[1] = new C9924p((float) iArr3[1], f);
                i10 = i8;
                z = true;
            } else {
                i10 += 5;
            }
        }
        int i14 = i10 + 1;
        if (z) {
            int[] iArr4 = {(int) pVarArr[0].mo32480c(), (int) pVarArr[1].mo32480c()};
            int i15 = i14;
            int i16 = 0;
            while (true) {
                if (i15 >= i9) {
                    i6 = i16;
                    i7 = i15;
                    break;
                }
                i6 = i16;
                i7 = i15;
                int[] d3 = m61097d(bVar, iArr4[0], i15, i2, false, iArr, iArr2);
                if (d3 == null || Math.abs(iArr4[0] - d3[0]) >= 5 || Math.abs(iArr4[1] - d3[1]) >= 5) {
                    if (i6 > 25) {
                        break;
                    }
                    i16 = i6 + 1;
                } else {
                    iArr4 = d3;
                    i16 = 0;
                }
                i15 = i7 + 1;
            }
            i14 = i7 - (i6 + 1);
            float f2 = (float) i14;
            pVarArr[2] = new C9924p((float) iArr4[0], f2);
            pVarArr[3] = new C9924p((float) iArr4[1], f2);
        }
        if (i14 - i10 < 10) {
            for (i5 = 0; i5 < 4; i5++) {
                pVarArr[i5] = null;
            }
        }
        return pVarArr;
    }

    /* renamed from: f */
    private static C9924p[] m61099f(C10476b bVar, int i, int i2) {
        int g = bVar.mo33574g();
        int j = bVar.mo33578j();
        C9924p[] pVarArr = new C9924p[8];
        m61094a(pVarArr, m61098e(bVar, g, j, i, i2, f47177c), f47175a);
        if (pVarArr[4] != null) {
            i2 = (int) pVarArr[4].mo32480c();
            i = (int) pVarArr[4].mo32481d();
        }
        m61094a(pVarArr, m61098e(bVar, g, j, i, i2, f47178d), f47176b);
        return pVarArr;
    }

    /* renamed from: g */
    private static float m61100g(int[] iArr, int[] iArr2, float f) {
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            i += iArr[i3];
            i2 += iArr2[i3];
        }
        if (i < i2) {
            return Float.POSITIVE_INFINITY;
        }
        float f2 = (float) i;
        float f3 = f2 / ((float) i2);
        float f4 = f * f3;
        float f5 = 0.0f;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = iArr[i4];
            float f6 = ((float) iArr2[i4]) * f3;
            float f7 = (float) i5;
            float f8 = f7 > f6 ? f7 - f6 : f6 - f7;
            if (f8 > f4) {
                return Float.POSITIVE_INFINITY;
            }
            f5 += f8;
        }
        return f5 / f2;
    }
}
