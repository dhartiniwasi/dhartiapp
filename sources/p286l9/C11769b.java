package p286l9;

import p286l9.C11774e;

/* renamed from: l9.b */
/* compiled from: DataBlock */
final class C11769b {

    /* renamed from: a */
    private final int f44391a;

    /* renamed from: b */
    private final byte[] f44392b;

    private C11769b(int i, byte[] bArr) {
        this.f44391a = i;
        this.f44392b = bArr;
    }

    /* renamed from: b */
    static C11769b[] m57084b(byte[] bArr, C11774e eVar) {
        C11774e.C11777c d = eVar.mo36011d();
        C11774e.C11776b[] a = d.mo36019a();
        int i = 0;
        for (C11774e.C11776b a2 : a) {
            i += a2.mo36017a();
        }
        C11769b[] bVarArr = new C11769b[i];
        int i2 = 0;
        for (C11774e.C11776b bVar : a) {
            int i3 = 0;
            while (i3 < bVar.mo36017a()) {
                int b = bVar.mo36018b();
                bVarArr[i2] = new C11769b(b, new byte[(d.mo36020b() + b)]);
                i3++;
                i2++;
            }
        }
        int length = bVarArr[0].f44392b.length - d.mo36020b();
        int i4 = length - 1;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            int i7 = 0;
            while (i7 < i2) {
                bVarArr[i7].f44392b[i6] = bArr[i5];
                i7++;
                i5++;
            }
        }
        boolean z = eVar.mo36015i() == 24;
        int i8 = z ? 8 : i2;
        int i9 = 0;
        while (i9 < i8) {
            bVarArr[i9].f44392b[i4] = bArr[i5];
            i9++;
            i5++;
        }
        int length2 = bVarArr[0].f44392b.length;
        while (length < length2) {
            int i10 = 0;
            while (i10 < i2) {
                int i11 = z ? (i10 + 8) % i2 : i10;
                bVarArr[i11].f44392b[(!z || i11 <= 7) ? length : length - 1] = bArr[i5];
                i10++;
                i5++;
            }
            length++;
        }
        if (i5 == bArr.length) {
            return bVarArr;
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public byte[] mo36006a() {
        return this.f44392b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo36007c() {
        return this.f44391a;
    }
}
