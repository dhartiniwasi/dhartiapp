package p248h9;

import p212d9.C9910b;
import p212d9.C9916h;
import p212d9.C9918j;

/* renamed from: h9.h */
/* compiled from: GlobalHistogramBinarizer */
public class C10482h extends C9910b {

    /* renamed from: d */
    private static final byte[] f41512d = new byte[0];

    /* renamed from: b */
    private byte[] f41513b = f41512d;

    /* renamed from: c */
    private final int[] f41514c = new int[32];

    public C10482h(C9916h hVar) {
        super(hVar);
    }

    /* renamed from: g */
    private static int m52838g(int[] iArr) throws C9918j {
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            if (iArr[i4] > i) {
                i = iArr[i4];
                i3 = i4;
            }
            if (iArr[i4] > i2) {
                i2 = iArr[i4];
            }
        }
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < length; i7++) {
            int i8 = i7 - i3;
            int i9 = iArr[i7] * i8 * i8;
            if (i9 > i6) {
                i5 = i7;
                i6 = i9;
            }
        }
        if (i3 <= i5) {
            int i10 = i3;
            i3 = i5;
            i5 = i10;
        }
        if (i3 - i5 > length / 16) {
            int i11 = i3 - 1;
            int i12 = i11;
            int i13 = -1;
            while (i11 > i5) {
                int i14 = i11 - i5;
                int i15 = i14 * i14 * (i3 - i11) * (i2 - iArr[i11]);
                if (i15 > i13) {
                    i12 = i11;
                    i13 = i15;
                }
                i11--;
            }
            return i12 << 3;
        }
        throw C9918j.m50862a();
    }

    /* renamed from: h */
    private void m52839h(int i) {
        if (this.f41513b.length < i) {
            this.f41513b = new byte[i];
        }
        for (int i2 = 0; i2 < 32; i2++) {
            this.f41514c[i2] = 0;
        }
    }

    /* renamed from: b */
    public C10476b mo32446b() throws C9918j {
        C9916h e = mo32449e();
        int d = e.mo32463d();
        int a = e.mo32462a();
        C10476b bVar = new C10476b(d, a);
        m52839h(d);
        int[] iArr = this.f41514c;
        for (int i = 1; i < 5; i++) {
            byte[] c = e.mo32459c((a * i) / 5, this.f41513b);
            int i2 = (d << 2) / 5;
            for (int i3 = d / 5; i3 < i2; i3++) {
                int i4 = (c[i3] & 255) >> 3;
                iArr[i4] = iArr[i4] + 1;
            }
        }
        int g = m52838g(iArr);
        byte[] b = e.mo32458b();
        for (int i5 = 0; i5 < a; i5++) {
            int i6 = i5 * d;
            for (int i7 = 0; i7 < d; i7++) {
                if ((b[i6 + i7] & 255) < g) {
                    bVar.mo33580l(i7, i5);
                }
            }
        }
        return bVar;
    }

    /* renamed from: c */
    public C10475a mo32447c(int i, C10475a aVar) throws C9918j {
        C9916h e = mo32449e();
        int d = e.mo32463d();
        if (aVar == null || aVar.mo33560g() < d) {
            aVar = new C10475a(d);
        } else {
            aVar.mo33552a();
        }
        m52839h(d);
        byte[] c = e.mo32459c(i, this.f41513b);
        int[] iArr = this.f41514c;
        for (int i2 = 0; i2 < d; i2++) {
            int i3 = (c[i2] & 255) >> 3;
            iArr[i3] = iArr[i3] + 1;
        }
        int g = m52838g(iArr);
        if (d < 3) {
            for (int i4 = 0; i4 < d; i4++) {
                if ((c[i4] & 255) < g) {
                    aVar.mo33564k(i4);
                }
            }
        } else {
            int i5 = 1;
            byte b = c[1] & 255;
            byte b2 = c[0] & 255;
            byte b3 = b;
            while (i5 < d - 1) {
                int i6 = i5 + 1;
                byte b4 = c[i6] & 255;
                if ((((b3 << 2) - b2) - b4) / 2 < g) {
                    aVar.mo33564k(i5);
                }
                b2 = b3;
                i5 = i6;
                b3 = b4;
            }
        }
        return aVar;
    }
}
