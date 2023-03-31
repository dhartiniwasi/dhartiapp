package p378v9;

/* renamed from: v9.c */
/* compiled from: ModulusPoly */
final class C12857c {

    /* renamed from: a */
    private final C12856b f46966a;

    /* renamed from: b */
    private final int[] f46967b;

    C12857c(C12856b bVar, int[] iArr) {
        if (iArr.length != 0) {
            this.f46966a = bVar;
            int length = iArr.length;
            if (length <= 1 || iArr[0] != 0) {
                this.f46967b = iArr;
                return;
            }
            int i = 1;
            while (i < length && iArr[i] == 0) {
                i++;
            }
            if (i == length) {
                this.f46967b = new int[]{0};
                return;
            }
            int[] iArr2 = new int[(length - i)];
            this.f46967b = iArr2;
            System.arraycopy(iArr, i, iArr2, 0, iArr2.length);
            return;
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C12857c mo37855a(C12857c cVar) {
        if (!this.f46966a.equals(cVar.f46966a)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        } else if (mo37859e()) {
            return cVar;
        } else {
            if (cVar.mo37859e()) {
                return this;
            }
            int[] iArr = this.f46967b;
            int[] iArr2 = cVar.f46967b;
            if (iArr.length <= iArr2.length) {
                int[] iArr3 = iArr;
                iArr = iArr2;
                iArr2 = iArr3;
            }
            int[] iArr4 = new int[iArr.length];
            int length = iArr.length - iArr2.length;
            System.arraycopy(iArr, 0, iArr4, 0, length);
            for (int i = length; i < iArr.length; i++) {
                iArr4[i] = this.f46966a.mo37845a(iArr2[i - length], iArr[i]);
            }
            return new C12857c(this.f46966a, iArr4);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo37856b(int i) {
        if (i == 0) {
            return mo37857c(0);
        }
        if (i == 1) {
            int i2 = 0;
            for (int a : this.f46967b) {
                i2 = this.f46966a.mo37845a(i2, a);
            }
            return i2;
        }
        int[] iArr = this.f46967b;
        int i3 = iArr[0];
        int length = iArr.length;
        for (int i4 = 1; i4 < length; i4++) {
            C12856b bVar = this.f46966a;
            i3 = bVar.mo37845a(bVar.mo37853i(i, i3), this.f46967b[i4]);
        }
        return i3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo37857c(int i) {
        int[] iArr = this.f46967b;
        return iArr[(iArr.length - 1) - i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo37858d() {
        return this.f46967b.length - 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo37859e() {
        return this.f46967b[0] == 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C12857c mo37860f(int i) {
        if (i == 0) {
            return this.f46966a.mo37850f();
        }
        if (i == 1) {
            return this;
        }
        int length = this.f46967b.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = this.f46966a.mo37853i(this.f46967b[i2], i);
        }
        return new C12857c(this.f46966a, iArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C12857c mo37861g(C12857c cVar) {
        if (!this.f46966a.equals(cVar.f46966a)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        } else if (mo37859e() || cVar.mo37859e()) {
            return this.f46966a.mo37850f();
        } else {
            int[] iArr = this.f46967b;
            int length = iArr.length;
            int[] iArr2 = cVar.f46967b;
            int length2 = iArr2.length;
            int[] iArr3 = new int[((length + length2) - 1)];
            for (int i = 0; i < length; i++) {
                int i2 = iArr[i];
                for (int i3 = 0; i3 < length2; i3++) {
                    int i4 = i + i3;
                    C12856b bVar = this.f46966a;
                    iArr3[i4] = bVar.mo37845a(iArr3[i4], bVar.mo37853i(i2, iArr2[i3]));
                }
            }
            return new C12857c(this.f46966a, iArr3);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public C12857c mo37862h(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (i2 == 0) {
            return this.f46966a.mo37850f();
        } else {
            int length = this.f46967b.length;
            int[] iArr = new int[(i + length)];
            for (int i3 = 0; i3 < length; i3++) {
                iArr[i3] = this.f46966a.mo37853i(this.f46967b[i3], i2);
            }
            return new C12857c(this.f46966a, iArr);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C12857c mo37863i() {
        int length = this.f46967b.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = this.f46966a.mo37854j(0, this.f46967b[i]);
        }
        return new C12857c(this.f46966a, iArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public C12857c mo37864j(C12857c cVar) {
        if (!this.f46966a.equals(cVar.f46966a)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        } else if (cVar.mo37859e()) {
            return this;
        } else {
            return mo37855a(cVar.mo37863i());
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(mo37858d() * 8);
        for (int d = mo37858d(); d >= 0; d--) {
            int c = mo37857c(d);
            if (c != 0) {
                if (c < 0) {
                    sb.append(" - ");
                    c = -c;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (d == 0 || c != 1) {
                    sb.append(c);
                }
                if (d != 0) {
                    if (d == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(d);
                    }
                }
            }
        }
        return sb.toString();
    }
}
