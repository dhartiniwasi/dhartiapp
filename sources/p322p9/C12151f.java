package p322p9;

import p212d9.C9909a;
import p212d9.C9918j;
import p248h9.C10475a;

/* renamed from: p9.f */
/* compiled from: EAN8Reader */
public final class C12151f extends C12161p {

    /* renamed from: i */
    private final int[] f45226i = new int[4];

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public int mo36673k(C10475a aVar, int[] iArr, StringBuilder sb) throws C9918j {
        int[] iArr2 = this.f45226i;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int g = aVar.mo33560g();
        int i = iArr[1];
        for (int i2 = 0; i2 < 4 && i < g; i2++) {
            sb.append((char) (C12161p.m58412i(aVar, iArr2, i, C12161p.f45248g) + 48));
            for (int i3 : iArr2) {
                i += i3;
            }
        }
        int i4 = C12161p.m58413m(aVar, i, true, C12161p.f45246e)[1];
        for (int i5 = 0; i5 < 4 && i4 < g; i5++) {
            sb.append((char) (C12161p.m58412i(aVar, iArr2, i4, C12161p.f45248g) + 48));
            for (int i6 : iArr2) {
                i4 += i6;
            }
        }
        return i4;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public C9909a mo36674p() {
        return C9909a.EAN_8;
    }
}
