package p322p9;

import p212d9.C9909a;
import p212d9.C9918j;
import p248h9.C10475a;

/* renamed from: p9.e */
/* compiled from: EAN13Reader */
public final class C12150e extends C12161p {

    /* renamed from: j */
    static final int[] f45224j = {0, 11, 13, 14, 19, 25, 28, 21, 22, 26};

    /* renamed from: i */
    private final int[] f45225i = new int[4];

    /* renamed from: q */
    private static void m58371q(StringBuilder sb, int i) throws C9918j {
        for (int i2 = 0; i2 < 10; i2++) {
            if (i == f45224j[i2]) {
                sb.insert(0, (char) (i2 + 48));
                return;
            }
        }
        throw C9918j.m50862a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public int mo36673k(C10475a aVar, int[] iArr, StringBuilder sb) throws C9918j {
        int[] iArr2 = this.f45225i;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int g = aVar.mo33560g();
        int i = iArr[1];
        int i2 = 0;
        for (int i3 = 0; i3 < 6 && i < g; i3++) {
            int i4 = C12161p.m58412i(aVar, iArr2, i, C12161p.f45249h);
            sb.append((char) ((i4 % 10) + 48));
            for (int i5 : iArr2) {
                i += i5;
            }
            if (i4 >= 10) {
                i2 |= 1 << (5 - i3);
            }
        }
        m58371q(sb, i2);
        int i6 = C12161p.m58413m(aVar, i, true, C12161p.f45246e)[1];
        for (int i7 = 0; i7 < 6 && i6 < g; i7++) {
            sb.append((char) (C12161p.m58412i(aVar, iArr2, i6, C12161p.f45248g) + 48));
            for (int i8 : iArr2) {
                i6 += i8;
            }
        }
        return i6;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public C9909a mo36674p() {
        return C9909a.EAN_13;
    }
}
