package p368u9;

import java.lang.reflect.Array;
import p258i9.C10566a;
import p358t9.C12553a;

/* renamed from: u9.i */
/* compiled from: PDF417CodewordDecoder */
final class C12720i {

    /* renamed from: a */
    private static final float[][] f46518a;

    static {
        int i;
        int length = C12553a.f46056b.length;
        int[] iArr = new int[2];
        iArr[1] = 8;
        iArr[0] = length;
        f46518a = (float[][]) Array.newInstance(float.class, iArr);
        int i2 = 0;
        while (true) {
            int[] iArr2 = C12553a.f46056b;
            if (i2 < iArr2.length) {
                int i3 = iArr2[i2];
                int i4 = i3 & 1;
                int i5 = 0;
                while (i5 < 8) {
                    float f = 0.0f;
                    while (true) {
                        i = i3 & 1;
                        if (i != i4) {
                            break;
                        }
                        f += 1.0f;
                        i3 >>= 1;
                    }
                    f46518a[i2][(8 - i5) - 1] = f / 17.0f;
                    i5++;
                    i4 = i;
                }
                i2++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private static int m60320a(int[] iArr) {
        long j = 0;
        for (int i = 0; i < iArr.length; i++) {
            for (int i2 = 0; i2 < iArr[i]; i2++) {
                int i3 = 1;
                long j2 = j << 1;
                if (i % 2 != 0) {
                    i3 = 0;
                }
                j = j2 | ((long) i3);
            }
        }
        return (int) j;
    }

    /* renamed from: b */
    private static int m60321b(int[] iArr) {
        int d = C10566a.m53113d(iArr);
        float[] fArr = new float[8];
        for (int i = 0; i < 8; i++) {
            fArr[i] = ((float) iArr[i]) / ((float) d);
        }
        float f = Float.MAX_VALUE;
        int i2 = -1;
        int i3 = 0;
        while (true) {
            float[][] fArr2 = f46518a;
            if (i3 >= fArr2.length) {
                return i2;
            }
            float f2 = 0.0f;
            float[] fArr3 = fArr2[i3];
            for (int i4 = 0; i4 < 8; i4++) {
                float f3 = fArr3[i4] - fArr[i4];
                f2 += f3 * f3;
                if (f2 >= f) {
                    break;
                }
            }
            if (f2 < f) {
                i2 = C12553a.f46056b[i3];
                f = f2;
            }
            i3++;
        }
    }

    /* renamed from: c */
    private static int m60322c(int[] iArr) {
        int a = m60320a(iArr);
        if (C12553a.m59748a(a) == -1) {
            return -1;
        }
        return a;
    }

    /* renamed from: d */
    static int m60323d(int[] iArr) {
        int c = m60322c(m60324e(iArr));
        if (c != -1) {
            return c;
        }
        return m60321b(iArr);
    }

    /* renamed from: e */
    private static int[] m60324e(int[] iArr) {
        float d = (float) C10566a.m53113d(iArr);
        int[] iArr2 = new int[8];
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < 17; i3++) {
            if (((float) (iArr[i2] + i)) <= (d / 34.0f) + ((((float) i3) * d) / 17.0f)) {
                i += iArr[i2];
                i2++;
            }
            iArr2[i2] = iArr2[i2] + 1;
        }
        return iArr2;
    }
}
