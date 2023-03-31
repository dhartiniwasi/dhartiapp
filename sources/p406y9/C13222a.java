package p406y9;

import p212d9.C9914f;
import p248h9.C10476b;

/* renamed from: y9.a */
/* compiled from: BitMatrixParser */
final class C13222a {

    /* renamed from: a */
    private final C10476b f47475a;

    /* renamed from: b */
    private C13239j f47476b;

    /* renamed from: c */
    private C13236g f47477c;

    /* renamed from: d */
    private boolean f47478d;

    C13222a(C10476b bVar) throws C9914f {
        int g = bVar.mo33574g();
        if (g < 21 || (g & 3) != 1) {
            throw C9914f.m50845a();
        }
        this.f47475a = bVar;
    }

    /* renamed from: a */
    private int m62014a(int i, int i2, int i3) {
        return this.f47478d ? this.f47475a.mo33570d(i2, i) : this.f47475a.mo33570d(i, i2) ? (i3 << 1) | 1 : i3 << 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo38318b() {
        int i = 0;
        while (i < this.f47475a.mo33578j()) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < this.f47475a.mo33574g(); i3++) {
                if (this.f47475a.mo33570d(i, i3) != this.f47475a.mo33570d(i3, i)) {
                    this.f47475a.mo33568c(i3, i);
                    this.f47475a.mo33568c(i, i3);
                }
            }
            i = i2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public byte[] mo38319c() throws C9914f {
        C13236g d = mo38320d();
        C13239j e = mo38321e();
        C13224c cVar = C13224c.values()[d.mo38329c()];
        int g = this.f47475a.mo33574g();
        cVar.mo38327b(this.f47475a, g);
        C10476b a = e.mo38335a();
        byte[] bArr = new byte[e.mo38339h()];
        int i = g - 1;
        boolean z = true;
        int i2 = i;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i2 > 0) {
            if (i2 == 6) {
                i2--;
            }
            for (int i6 = 0; i6 < g; i6++) {
                int i7 = z ? i - i6 : i6;
                for (int i8 = 0; i8 < 2; i8++) {
                    int i9 = i2 - i8;
                    if (!a.mo33570d(i9, i7)) {
                        i4++;
                        i5 <<= 1;
                        if (this.f47475a.mo33570d(i9, i7)) {
                            i5 |= 1;
                        }
                        if (i4 == 8) {
                            bArr[i3] = (byte) i5;
                            i3++;
                            i4 = 0;
                            i5 = 0;
                        }
                    }
                }
            }
            z = !z;
            i2 -= 2;
        }
        if (i3 == e.mo38339h()) {
            return bArr;
        }
        throw C9914f.m50845a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C13236g mo38320d() throws C9914f {
        C13236g gVar = this.f47477c;
        if (gVar != null) {
            return gVar;
        }
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < 6; i3++) {
            i2 = m62014a(i3, 8, i2);
        }
        int a = m62014a(8, 7, m62014a(8, 8, m62014a(7, 8, i2)));
        for (int i4 = 5; i4 >= 0; i4--) {
            a = m62014a(8, i4, a);
        }
        int g = this.f47475a.mo33574g();
        int i5 = g - 7;
        for (int i6 = g - 1; i6 >= i5; i6--) {
            i = m62014a(8, i6, i);
        }
        for (int i7 = g - 8; i7 < g; i7++) {
            i = m62014a(i7, 8, i);
        }
        C13236g a2 = C13236g.m62046a(a, i);
        this.f47477c = a2;
        if (a2 != null) {
            return a2;
        }
        throw C9914f.m50845a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C13239j mo38321e() throws C9914f {
        C13239j jVar = this.f47476b;
        if (jVar != null) {
            return jVar;
        }
        int g = this.f47475a.mo33574g();
        int i = (g - 17) / 4;
        if (i <= 6) {
            return C13239j.m62057i(i);
        }
        int i2 = g - 11;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 5; i5 >= 0; i5--) {
            for (int i6 = g - 9; i6 >= i2; i6--) {
                i4 = m62014a(i6, i5, i4);
            }
        }
        C13239j c = C13239j.m62055c(i4);
        if (c == null || c.mo38337e() != g) {
            for (int i7 = 5; i7 >= 0; i7--) {
                for (int i8 = g - 9; i8 >= i2; i8--) {
                    i3 = m62014a(i7, i8, i3);
                }
            }
            C13239j c2 = C13239j.m62055c(i3);
            if (c2 == null || c2.mo38337e() != g) {
                throw C9914f.m50845a();
            }
            this.f47476b = c2;
            return c2;
        }
        this.f47476b = c;
        return c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo38322f() {
        if (this.f47477c != null) {
            C13224c.values()[this.f47477c.mo38329c()].mo38327b(this.f47475a, this.f47475a.mo33574g());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo38323g(boolean z) {
        this.f47476b = null;
        this.f47477c = null;
        this.f47478d = z;
    }
}
