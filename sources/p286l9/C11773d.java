package p286l9;

import p212d9.C9912d;
import p212d9.C9914f;
import p248h9.C10476b;
import p248h9.C10479e;
import p268j9.C11501a;
import p268j9.C11503c;
import p268j9.C11504d;

/* renamed from: l9.d */
/* compiled from: Decoder */
public final class C11773d {

    /* renamed from: a */
    private final C11503c f44407a = new C11503c(C11501a.f43918m);

    /* renamed from: a */
    private void m57096a(byte[] bArr, int i) throws C9912d {
        int length = bArr.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        try {
            this.f44407a.mo35512a(iArr, bArr.length - i);
            for (int i3 = 0; i3 < i; i3++) {
                bArr[i3] = (byte) iArr[i3];
            }
        } catch (C11504d unused) {
            throw C9912d.m50844a();
        }
    }

    /* renamed from: b */
    public C10479e mo36008b(C10476b bVar) throws C9914f, C9912d {
        C11768a aVar = new C11768a(bVar);
        C11769b[] b = C11769b.m57084b(aVar.mo36005c(), aVar.mo36004b());
        int i = 0;
        for (C11769b c : b) {
            i += c.mo36007c();
        }
        byte[] bArr = new byte[i];
        int length = b.length;
        for (int i2 = 0; i2 < length; i2++) {
            C11769b bVar2 = b[i2];
            byte[] a = bVar2.mo36006a();
            int c2 = bVar2.mo36007c();
            m57096a(a, c2);
            for (int i3 = 0; i3 < c2; i3++) {
                bArr[(i3 * length) + i2] = a[i3];
            }
        }
        return C11770c.m57087a(bArr);
    }
}
