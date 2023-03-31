package p286l9;

import p212d9.C9914f;
import p248h9.C10476b;

/* renamed from: l9.a */
/* compiled from: BitMatrixParser */
final class C11768a {

    /* renamed from: a */
    private final C10476b f44388a;

    /* renamed from: b */
    private final C10476b f44389b;

    /* renamed from: c */
    private final C11774e f44390c;

    C11768a(C10476b bVar) throws C9914f {
        int g = bVar.mo33574g();
        if (g < 8 || g > 144 || (g & 1) != 0) {
            throw C9914f.m50845a();
        }
        this.f44390c = m57081j(bVar);
        C10476b a = m57074a(bVar);
        this.f44388a = a;
        this.f44389b = new C10476b(a.mo33578j(), a.mo33574g());
    }

    /* renamed from: a */
    private C10476b m57074a(C10476b bVar) {
        int f = this.f44390c.mo36013f();
        int e = this.f44390c.mo36012e();
        if (bVar.mo33574g() == f) {
            int c = this.f44390c.mo36010c();
            int b = this.f44390c.mo36009b();
            int i = f / c;
            int i2 = e / b;
            C10476b bVar2 = new C10476b(i2 * b, i * c);
            for (int i3 = 0; i3 < i; i3++) {
                int i4 = i3 * c;
                for (int i5 = 0; i5 < i2; i5++) {
                    int i6 = i5 * b;
                    for (int i7 = 0; i7 < c; i7++) {
                        int i8 = ((c + 2) * i3) + 1 + i7;
                        int i9 = i4 + i7;
                        for (int i10 = 0; i10 < b; i10++) {
                            if (bVar.mo33570d(((b + 2) * i5) + 1 + i10, i8)) {
                                bVar2.mo33580l(i6 + i10, i9);
                            }
                        }
                        C10476b bVar3 = bVar;
                    }
                    C10476b bVar4 = bVar;
                }
                C10476b bVar5 = bVar;
            }
            return bVar2;
        }
        throw new IllegalArgumentException("Dimension of bitMarix must match the version size");
    }

    /* renamed from: d */
    private int m57075d(int i, int i2) {
        int i3 = i - 1;
        int i4 = (m57079h(i3, 0, i, i2) ? 1 : 0) << true;
        if (m57079h(i3, 1, i, i2)) {
            i4 |= 1;
        }
        int i5 = i4 << 1;
        if (m57079h(i3, 2, i, i2)) {
            i5 |= 1;
        }
        int i6 = i5 << 1;
        if (m57079h(0, i2 - 2, i, i2)) {
            i6 |= 1;
        }
        int i7 = i6 << 1;
        int i8 = i2 - 1;
        if (m57079h(0, i8, i, i2)) {
            i7 |= 1;
        }
        int i9 = i7 << 1;
        if (m57079h(1, i8, i, i2)) {
            i9 |= 1;
        }
        int i10 = i9 << 1;
        if (m57079h(2, i8, i, i2)) {
            i10 |= 1;
        }
        int i11 = i10 << 1;
        return m57079h(3, i8, i, i2) ? i11 | 1 : i11;
    }

    /* renamed from: e */
    private int m57076e(int i, int i2) {
        int i3 = (m57079h(i + -3, 0, i, i2) ? 1 : 0) << true;
        if (m57079h(i - 2, 0, i, i2)) {
            i3 |= 1;
        }
        int i4 = i3 << 1;
        if (m57079h(i - 1, 0, i, i2)) {
            i4 |= 1;
        }
        int i5 = i4 << 1;
        if (m57079h(0, i2 - 4, i, i2)) {
            i5 |= 1;
        }
        int i6 = i5 << 1;
        if (m57079h(0, i2 - 3, i, i2)) {
            i6 |= 1;
        }
        int i7 = i6 << 1;
        if (m57079h(0, i2 - 2, i, i2)) {
            i7 |= 1;
        }
        int i8 = i7 << 1;
        int i9 = i2 - 1;
        if (m57079h(0, i9, i, i2)) {
            i8 |= 1;
        }
        int i10 = i8 << 1;
        return m57079h(1, i9, i, i2) ? i10 | 1 : i10;
    }

    /* renamed from: f */
    private int m57077f(int i, int i2) {
        int i3 = i - 1;
        int i4 = (m57079h(i3, 0, i, i2) ? 1 : 0) << true;
        int i5 = i2 - 1;
        if (m57079h(i3, i5, i, i2)) {
            i4 |= 1;
        }
        int i6 = i4 << 1;
        int i7 = i2 - 3;
        if (m57079h(0, i7, i, i2)) {
            i6 |= 1;
        }
        int i8 = i6 << 1;
        int i9 = i2 - 2;
        if (m57079h(0, i9, i, i2)) {
            i8 |= 1;
        }
        int i10 = i8 << 1;
        if (m57079h(0, i5, i, i2)) {
            i10 |= 1;
        }
        int i11 = i10 << 1;
        if (m57079h(1, i7, i, i2)) {
            i11 |= 1;
        }
        int i12 = i11 << 1;
        if (m57079h(1, i9, i, i2)) {
            i12 |= 1;
        }
        int i13 = i12 << 1;
        return m57079h(1, i5, i, i2) ? i13 | 1 : i13;
    }

    /* renamed from: g */
    private int m57078g(int i, int i2) {
        int i3 = (m57079h(i + -3, 0, i, i2) ? 1 : 0) << true;
        if (m57079h(i - 2, 0, i, i2)) {
            i3 |= 1;
        }
        int i4 = i3 << 1;
        if (m57079h(i - 1, 0, i, i2)) {
            i4 |= 1;
        }
        int i5 = i4 << 1;
        if (m57079h(0, i2 - 2, i, i2)) {
            i5 |= 1;
        }
        int i6 = i5 << 1;
        int i7 = i2 - 1;
        if (m57079h(0, i7, i, i2)) {
            i6 |= 1;
        }
        int i8 = i6 << 1;
        if (m57079h(1, i7, i, i2)) {
            i8 |= 1;
        }
        int i9 = i8 << 1;
        if (m57079h(2, i7, i, i2)) {
            i9 |= 1;
        }
        int i10 = i9 << 1;
        return m57079h(3, i7, i, i2) ? i10 | 1 : i10;
    }

    /* renamed from: h */
    private boolean m57079h(int i, int i2, int i3, int i4) {
        if (i < 0) {
            i += i3;
            i2 += 4 - ((i3 + 4) & 7);
        }
        if (i2 < 0) {
            i2 += i4;
            i += 4 - ((i4 + 4) & 7);
        }
        this.f44389b.mo33580l(i2, i);
        return this.f44388a.mo33570d(i2, i);
    }

    /* renamed from: i */
    private int m57080i(int i, int i2, int i3, int i4) {
        int i5 = i - 2;
        int i6 = i2 - 2;
        int i7 = (m57079h(i5, i6, i3, i4) ? 1 : 0) << true;
        int i8 = i2 - 1;
        if (m57079h(i5, i8, i3, i4)) {
            i7 |= 1;
        }
        int i9 = i7 << 1;
        int i10 = i - 1;
        if (m57079h(i10, i6, i3, i4)) {
            i9 |= 1;
        }
        int i11 = i9 << 1;
        if (m57079h(i10, i8, i3, i4)) {
            i11 |= 1;
        }
        int i12 = i11 << 1;
        if (m57079h(i10, i2, i3, i4)) {
            i12 |= 1;
        }
        int i13 = i12 << 1;
        if (m57079h(i, i6, i3, i4)) {
            i13 |= 1;
        }
        int i14 = i13 << 1;
        if (m57079h(i, i8, i3, i4)) {
            i14 |= 1;
        }
        int i15 = i14 << 1;
        return m57079h(i, i2, i3, i4) ? i15 | 1 : i15;
    }

    /* renamed from: j */
    private static C11774e m57081j(C10476b bVar) throws C9914f {
        return C11774e.m57099h(bVar.mo33574g(), bVar.mo33578j());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C11774e mo36004b() {
        return this.f44390c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public byte[] mo36005c() throws C9914f {
        byte[] bArr = new byte[this.f44390c.mo36014g()];
        int g = this.f44388a.mo33574g();
        int j = this.f44388a.mo33578j();
        int i = 0;
        boolean z = false;
        int i2 = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        int i3 = 4;
        while (true) {
            if (i3 == g && i == 0 && !z) {
                bArr[i2] = (byte) m57075d(g, j);
                i3 -= 2;
                i += 2;
                i2++;
                z = true;
            } else {
                int i4 = g - 2;
                if (i3 == i4 && i == 0 && (j & 3) != 0 && !z2) {
                    bArr[i2] = (byte) m57076e(g, j);
                    i3 -= 2;
                    i += 2;
                    i2++;
                    z2 = true;
                } else if (i3 == g + 4 && i == 2 && (j & 7) == 0 && !z3) {
                    bArr[i2] = (byte) m57077f(g, j);
                    i3 -= 2;
                    i += 2;
                    i2++;
                    z3 = true;
                } else if (i3 == i4 && i == 0 && (j & 7) == 4 && !z4) {
                    bArr[i2] = (byte) m57078g(g, j);
                    i3 -= 2;
                    i += 2;
                    i2++;
                    z4 = true;
                } else {
                    do {
                        if (i3 < g && i >= 0 && !this.f44389b.mo33570d(i, i3)) {
                            bArr[i2] = (byte) m57080i(i3, i, g, j);
                            i2++;
                        }
                        i3 -= 2;
                        i += 2;
                        if (i3 < 0) {
                            break;
                        }
                    } while (i < j);
                    int i5 = i3 + 1;
                    int i6 = i + 3;
                    do {
                        if (i5 >= 0 && i6 < j && !this.f44389b.mo33570d(i6, i5)) {
                            bArr[i2] = (byte) m57080i(i5, i6, g, j);
                            i2++;
                        }
                        i5 += 2;
                        i6 -= 2;
                        if (i5 >= g) {
                            break;
                        }
                    } while (i6 >= 0);
                    i3 = i5 + 3;
                    i = i6 + 1;
                }
            }
            if (i3 >= g && i >= j) {
                break;
            }
        }
        if (i2 == this.f44390c.mo36014g()) {
            return bArr;
        }
        throw C9914f.m50845a();
    }
}
