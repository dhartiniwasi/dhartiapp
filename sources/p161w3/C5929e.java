package p161w3;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: w3.e */
/* compiled from: CodecSpecificDataUtil */
public final class C5929e {

    /* renamed from: a */
    private static final byte[] f29065a = {0, 0, 0, 1};

    /* renamed from: b */
    private static final String[] f29066b = {"", "A", "B", "C"};

    /* renamed from: a */
    public static String m34964a(int i, int i2, int i3) {
        return String.format("avc1.%02X%02X%02X", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
    }

    /* renamed from: b */
    public static List<byte[]> m34965b(boolean z) {
        return Collections.singletonList(z ? new byte[]{1} : new byte[]{0});
    }

    /* renamed from: c */
    public static String m34966c(int i, boolean z, int i2, int i3, int[] iArr, int i4) {
        Object[] objArr = new Object[5];
        objArr[0] = f29066b[i];
        objArr[1] = Integer.valueOf(i2);
        objArr[2] = Integer.valueOf(i3);
        objArr[3] = Character.valueOf(z ? 'H' : 'L');
        objArr[4] = Integer.valueOf(i4);
        StringBuilder sb = new StringBuilder(C5953m0.m35072C("hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i5 = 0; i5 < length; i5++) {
            sb.append(String.format(".%02X", new Object[]{Integer.valueOf(iArr[i5])}));
        }
        return sb.toString();
    }

    /* renamed from: d */
    public static byte[] m34967d(byte[] bArr, int i, int i2) {
        byte[] bArr2 = f29065a;
        byte[] bArr3 = new byte[(bArr2.length + i2)];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i, bArr3, bArr2.length, i2);
        return bArr3;
    }

    /* renamed from: e */
    private static int m34968e(byte[] bArr, int i) {
        int length = bArr.length - f29065a.length;
        while (i <= length) {
            if (m34969f(bArr, i)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: f */
    private static boolean m34969f(byte[] bArr, int i) {
        if (bArr.length - i <= f29065a.length) {
            return false;
        }
        int i2 = 0;
        while (true) {
            byte[] bArr2 = f29065a;
            if (i2 >= bArr2.length) {
                return true;
            }
            if (bArr[i + i2] != bArr2[i2]) {
                return false;
            }
            i2++;
        }
    }

    /* renamed from: g */
    public static Pair<Integer, Integer> m34970g(byte[] bArr) {
        C5918a0 a0Var = new C5918a0(bArr);
        a0Var.mo20546O(9);
        int C = a0Var.mo20534C();
        a0Var.mo20546O(20);
        return Pair.create(Integer.valueOf(a0Var.mo20538G()), Integer.valueOf(C));
    }

    /* renamed from: h */
    public static boolean m34971h(List<byte[]> list) {
        if (list.size() == 1 && list.get(0).length == 1 && list.get(0)[0] == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public static byte[][] m34972i(byte[] bArr) {
        if (!m34969f(bArr, 0)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        do {
            arrayList.add(Integer.valueOf(i));
            i = m34968e(bArr, i + f29065a.length);
        } while (i != -1);
        byte[][] bArr2 = new byte[arrayList.size()][];
        int i2 = 0;
        while (i2 < arrayList.size()) {
            int intValue = ((Integer) arrayList.get(i2)).intValue();
            int intValue2 = (i2 < arrayList.size() + -1 ? ((Integer) arrayList.get(i2 + 1)).intValue() : bArr.length) - intValue;
            byte[] bArr3 = new byte[intValue2];
            System.arraycopy(bArr, intValue, bArr3, 0, intValue2);
            bArr2[i2] = bArr3;
            i2++;
        }
        return bArr2;
    }
}
