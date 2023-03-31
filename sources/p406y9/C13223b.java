package p406y9;

import p406y9.C13239j;

/* renamed from: y9.b */
/* compiled from: DataBlock */
final class C13223b {

    /* renamed from: a */
    private final int f47479a;

    /* renamed from: b */
    private final byte[] f47480b;

    private C13223b(int i, byte[] bArr) {
        this.f47479a = i;
        this.f47480b = bArr;
    }

    /* renamed from: b */
    static C13223b[] m62021b(byte[] bArr, C13239j jVar, C13235f fVar) {
        if (bArr.length == jVar.mo38339h()) {
            C13239j.C13241b f = jVar.mo38338f(fVar);
            C13239j.C13240a[] a = f.mo38344a();
            int i = 0;
            for (C13239j.C13240a a2 : a) {
                i += a2.mo38342a();
            }
            C13223b[] bVarArr = new C13223b[i];
            int i2 = 0;
            for (C13239j.C13240a aVar : a) {
                int i3 = 0;
                while (i3 < aVar.mo38342a()) {
                    int b = aVar.mo38343b();
                    bVarArr[i2] = new C13223b(b, new byte[(f.mo38345b() + b)]);
                    i3++;
                    i2++;
                }
            }
            int length = bVarArr[0].f47480b.length;
            int i4 = i - 1;
            while (i4 >= 0 && bVarArr[i4].f47480b.length != length) {
                i4--;
            }
            int i5 = i4 + 1;
            int b2 = length - f.mo38345b();
            int i6 = 0;
            for (int i7 = 0; i7 < b2; i7++) {
                int i8 = 0;
                while (i8 < i2) {
                    bVarArr[i8].f47480b[i7] = bArr[i6];
                    i8++;
                    i6++;
                }
            }
            int i9 = i5;
            while (i9 < i2) {
                bVarArr[i9].f47480b[b2] = bArr[i6];
                i9++;
                i6++;
            }
            int length2 = bVarArr[0].f47480b.length;
            while (b2 < length2) {
                int i10 = 0;
                while (i10 < i2) {
                    bVarArr[i10].f47480b[i10 < i5 ? b2 : b2 + 1] = bArr[i6];
                    i10++;
                    i6++;
                }
                b2++;
            }
            return bVarArr;
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public byte[] mo38324a() {
        return this.f47480b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo38325c() {
        return this.f47479a;
    }
}
