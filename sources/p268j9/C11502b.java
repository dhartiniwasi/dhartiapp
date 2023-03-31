package p268j9;

/* renamed from: j9.b */
/* compiled from: GenericGFPoly */
final class C11502b {

    /* renamed from: a */
    private final C11501a f43928a;

    /* renamed from: b */
    private final int[] f43929b;

    C11502b(C11501a aVar, int[] iArr) {
        if (iArr.length != 0) {
            this.f43928a = aVar;
            int length = iArr.length;
            if (length <= 1 || iArr[0] != 0) {
                this.f43929b = iArr;
                return;
            }
            int i = 1;
            while (i < length && iArr[i] == 0) {
                i++;
            }
            if (i == length) {
                this.f43929b = new int[]{0};
                return;
            }
            int[] iArr2 = new int[(length - i)];
            this.f43929b = iArr2;
            System.arraycopy(iArr, i, iArr2, 0, iArr2.length);
            return;
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C11502b mo35503a(C11502b bVar) {
        if (!this.f43928a.equals(bVar.f43928a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        } else if (mo35507e()) {
            return bVar;
        } else {
            if (bVar.mo35507e()) {
                return this;
            }
            int[] iArr = this.f43929b;
            int[] iArr2 = bVar.f43929b;
            if (iArr.length <= iArr2.length) {
                int[] iArr3 = iArr;
                iArr = iArr2;
                iArr2 = iArr3;
            }
            int[] iArr4 = new int[iArr.length];
            int length = iArr.length - iArr2.length;
            System.arraycopy(iArr, 0, iArr4, 0, length);
            for (int i = length; i < iArr.length; i++) {
                iArr4[i] = C11501a.m56241a(iArr2[i - length], iArr[i]);
            }
            return new C11502b(this.f43928a, iArr4);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo35504b(int i) {
        if (i == 0) {
            return mo35505c(0);
        }
        if (i == 1) {
            int i2 = 0;
            for (int a : this.f43929b) {
                i2 = C11501a.m56241a(i2, a);
            }
            return i2;
        }
        int[] iArr = this.f43929b;
        int i3 = iArr[0];
        int length = iArr.length;
        for (int i4 = 1; i4 < length; i4++) {
            i3 = C11501a.m56241a(this.f43928a.mo35501j(i, i3), this.f43929b[i4]);
        }
        return i3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo35505c(int i) {
        int[] iArr = this.f43929b;
        return iArr[(iArr.length - 1) - i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo35506d() {
        return this.f43929b.length - 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo35507e() {
        return this.f43929b[0] == 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C11502b mo35508f(int i) {
        if (i == 0) {
            return this.f43928a.mo35498g();
        }
        if (i == 1) {
            return this;
        }
        int length = this.f43929b.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = this.f43928a.mo35501j(this.f43929b[i2], i);
        }
        return new C11502b(this.f43928a, iArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C11502b mo35509g(C11502b bVar) {
        if (!this.f43928a.equals(bVar.f43928a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        } else if (mo35507e() || bVar.mo35507e()) {
            return this.f43928a.mo35498g();
        } else {
            int[] iArr = this.f43929b;
            int length = iArr.length;
            int[] iArr2 = bVar.f43929b;
            int length2 = iArr2.length;
            int[] iArr3 = new int[((length + length2) - 1)];
            for (int i = 0; i < length; i++) {
                int i2 = iArr[i];
                for (int i3 = 0; i3 < length2; i3++) {
                    int i4 = i + i3;
                    iArr3[i4] = C11501a.m56241a(iArr3[i4], this.f43928a.mo35501j(i2, iArr2[i3]));
                }
            }
            return new C11502b(this.f43928a, iArr3);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public C11502b mo35510h(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (i2 == 0) {
            return this.f43928a.mo35498g();
        } else {
            int length = this.f43929b.length;
            int[] iArr = new int[(i + length)];
            for (int i3 = 0; i3 < length; i3++) {
                iArr[i3] = this.f43928a.mo35501j(this.f43929b[i3], i2);
            }
            return new C11502b(this.f43928a, iArr);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(mo35506d() * 8);
        for (int d = mo35506d(); d >= 0; d--) {
            int c = mo35505c(d);
            if (c != 0) {
                if (c < 0) {
                    sb.append(" - ");
                    c = -c;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (d == 0 || c != 1) {
                    int i = this.f43928a.mo35500i(c);
                    if (i == 0) {
                        sb.append('1');
                    } else if (i == 1) {
                        sb.append('a');
                    } else {
                        sb.append("a^");
                        sb.append(i);
                    }
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
