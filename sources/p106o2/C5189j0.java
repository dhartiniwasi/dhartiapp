package p106o2;

import p161w3.C5918a0;

/* renamed from: o2.j0 */
/* compiled from: TsUtil */
public final class C5189j0 {
    /* renamed from: a */
    public static int m32234a(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] != 71) {
            i++;
        }
        return i;
    }

    /* renamed from: b */
    public static boolean m32235b(byte[] bArr, int i, int i2, int i3) {
        int i4 = 0;
        for (int i5 = -4; i5 <= 4; i5++) {
            int i6 = (i5 * 188) + i3;
            if (i6 < i || i6 >= i2 || bArr[i6] != 71) {
                i4 = 0;
            } else {
                i4++;
                if (i4 == 5) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    public static long m32236c(C5918a0 a0Var, int i, int i2) {
        a0Var.mo20546O(i);
        if (a0Var.mo20548a() < 5) {
            return -9223372036854775807L;
        }
        int m = a0Var.mo20560m();
        if ((8388608 & m) != 0 || ((2096896 & m) >> 8) != i2) {
            return -9223372036854775807L;
        }
        boolean z = true;
        if (((m & 32) != 0) && a0Var.mo20534C() >= 7 && a0Var.mo20548a() >= 7) {
            if ((a0Var.mo20534C() & 16) != 16) {
                z = false;
            }
            if (z) {
                byte[] bArr = new byte[6];
                a0Var.mo20557j(bArr, 0, 6);
                return m32237d(bArr);
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: d */
    private static long m32237d(byte[] bArr) {
        return ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | ((((long) bArr[3]) & 255) << 1) | ((255 & ((long) bArr[4])) >> 7);
    }
}
