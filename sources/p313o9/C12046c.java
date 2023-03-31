package p313o9;

import java.util.Map;
import p212d9.C9912d;
import p212d9.C9913e;
import p212d9.C9914f;
import p248h9.C10476b;
import p248h9.C10479e;
import p268j9.C11501a;
import p268j9.C11503c;
import p268j9.C11504d;

/* renamed from: o9.c */
/* compiled from: Decoder */
public final class C12046c {

    /* renamed from: a */
    private final C11503c f45046a = new C11503c(C11501a.f43920o);

    /* renamed from: a */
    private void m58002a(byte[] bArr, int i, int i2, int i3, int i4) throws C9912d {
        int i5 = i2 + i3;
        int i6 = i4 == 0 ? 1 : 2;
        int[] iArr = new int[(i5 / i6)];
        for (int i7 = 0; i7 < i5; i7++) {
            if (i4 == 0 || i7 % 2 == i4 - 1) {
                iArr[i7 / i6] = bArr[i7 + i] & 255;
            }
        }
        try {
            this.f45046a.mo35512a(iArr, i3 / i6);
            for (int i8 = 0; i8 < i2; i8++) {
                if (i4 == 0 || i8 % 2 == i4 - 1) {
                    bArr[i8 + i] = (byte) iArr[i8 / i6];
                }
            }
        } catch (C11504d unused) {
            throw C9912d.m50844a();
        }
    }

    /* renamed from: b */
    public C10479e mo36417b(C10476b bVar, Map<C9913e, ?> map) throws C9914f, C9912d {
        byte[] bArr;
        byte[] a = new C12044a(bVar).mo36416a();
        m58002a(a, 0, 10, 10, 0);
        byte b = a[0] & 15;
        if (b == 2 || b == 3 || b == 4) {
            byte[] bArr2 = a;
            m58002a(bArr2, 20, 84, 40, 1);
            m58002a(bArr2, 20, 84, 40, 2);
            bArr = new byte[94];
        } else if (b == 5) {
            byte[] bArr3 = a;
            m58002a(bArr3, 20, 68, 56, 1);
            m58002a(bArr3, 20, 68, 56, 2);
            bArr = new byte[78];
        } else {
            throw C9914f.m50845a();
        }
        System.arraycopy(a, 0, bArr, 0, 10);
        System.arraycopy(a, 20, bArr, 10, bArr.length - 10);
        return C12045b.m57993a(bArr, b);
    }
}
