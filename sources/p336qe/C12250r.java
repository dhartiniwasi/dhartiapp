package p336qe;

import java.util.Arrays;

/* renamed from: qe.r */
/* compiled from: SegmentedByteString */
final class C12250r extends C12235f {

    /* renamed from: f */
    final transient byte[][] f45420f;

    /* renamed from: g */
    final transient int[] f45421g;

    C12250r(C12231c cVar, int i) {
        super((byte[]) null);
        C12255v.m58892b(cVar.f45378b, 0, (long) i);
        C12248p pVar = cVar.f45377a;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            int i5 = pVar.f45413c;
            int i6 = pVar.f45412b;
            if (i5 != i6) {
                i3 += i5 - i6;
                i4++;
                pVar = pVar.f45416f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        this.f45420f = new byte[i4][];
        this.f45421g = new int[(i4 * 2)];
        C12248p pVar2 = cVar.f45377a;
        int i7 = 0;
        while (i2 < i) {
            byte[][] bArr = this.f45420f;
            bArr[i7] = pVar2.f45411a;
            int i8 = pVar2.f45413c;
            int i9 = pVar2.f45412b;
            i2 += i8 - i9;
            if (i2 > i) {
                i2 = i;
            }
            int[] iArr = this.f45421g;
            iArr[i7] = i2;
            iArr[bArr.length + i7] = i9;
            pVar2.f45414d = true;
            i7++;
            pVar2 = pVar2.f45416f;
        }
    }

    /* renamed from: D */
    private int m58861D(int i) {
        int binarySearch = Arrays.binarySearch(this.f45421g, 0, this.f45420f.length, i + 1);
        return binarySearch >= 0 ? binarySearch : ~binarySearch;
    }

    /* renamed from: E */
    private C12235f m58862E() {
        return new C12235f(mo36831A());
    }

    /* renamed from: A */
    public byte[] mo36831A() {
        int[] iArr = this.f45421g;
        byte[][] bArr = this.f45420f;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr2 = this.f45421g;
            int i3 = iArr2[length + i];
            int i4 = iArr2[i];
            System.arraycopy(this.f45420f[i], i3, bArr2, i2, i4 - i2);
            i++;
            i2 = i4;
        }
        return bArr2;
    }

    /* renamed from: B */
    public String mo36832B() {
        return m58862E().mo36832B();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public void mo36833C(C12231c cVar) {
        int length = this.f45420f.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.f45421g;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            C12248p pVar = new C12248p(this.f45420f[i], i3, (i3 + i4) - i2, true, false);
            C12248p pVar2 = cVar.f45377a;
            if (pVar2 == null) {
                pVar.f45417g = pVar;
                pVar.f45416f = pVar;
                cVar.f45377a = pVar;
            } else {
                pVar2.f45417g.mo36878c(pVar);
            }
            i++;
            i2 = i4;
        }
        cVar.f45378b += (long) i2;
    }

    /* renamed from: a */
    public String mo36834a() {
        return m58862E().mo36834a();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C12235f) {
            C12235f fVar = (C12235f) obj;
            if (fVar.mo36846w() != mo36846w() || !mo36841s(0, fVar, 0, mo36846w())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = this.f45383b;
        if (i != 0) {
            return i;
        }
        int length = this.f45420f.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i2 < length) {
            byte[] bArr = this.f45420f[i2];
            int[] iArr = this.f45421g;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            int i7 = (i6 - i3) + i5;
            while (i5 < i7) {
                i4 = (i4 * 31) + bArr[i5];
                i5++;
            }
            i2++;
            i3 = i6;
        }
        this.f45383b = i4;
        return i4;
    }

    /* renamed from: p */
    public byte mo36839p(int i) {
        int i2;
        C12255v.m58892b((long) this.f45421g[this.f45420f.length - 1], (long) i, 1);
        int D = m58861D(i);
        if (D == 0) {
            i2 = 0;
        } else {
            i2 = this.f45421g[D - 1];
        }
        int[] iArr = this.f45421g;
        byte[][] bArr = this.f45420f;
        return bArr[D][(i - i2) + iArr[bArr.length + D]];
    }

    /* renamed from: q */
    public String mo36840q() {
        return m58862E().mo36840q();
    }

    /* renamed from: s */
    public boolean mo36841s(int i, C12235f fVar, int i2, int i3) {
        int i4;
        if (i < 0 || i > mo36846w() - i3) {
            return false;
        }
        int D = m58861D(i);
        while (i3 > 0) {
            if (D == 0) {
                i4 = 0;
            } else {
                i4 = this.f45421g[D - 1];
            }
            int min = Math.min(i3, ((this.f45421g[D] - i4) + i4) - i);
            int[] iArr = this.f45421g;
            byte[][] bArr = this.f45420f;
            if (!fVar.mo36842t(i2, bArr[D], (i - i4) + iArr[bArr.length + D], min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            D++;
        }
        return true;
    }

    /* renamed from: t */
    public boolean mo36842t(int i, byte[] bArr, int i2, int i3) {
        int i4;
        if (i < 0 || i > mo36846w() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int D = m58861D(i);
        while (i3 > 0) {
            if (D == 0) {
                i4 = 0;
            } else {
                i4 = this.f45421g[D - 1];
            }
            int min = Math.min(i3, ((this.f45421g[D] - i4) + i4) - i);
            int[] iArr = this.f45421g;
            byte[][] bArr2 = this.f45420f;
            if (!C12255v.m58891a(bArr2[D], (i - i4) + iArr[bArr2.length + D], bArr, i2, min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            D++;
        }
        return true;
    }

    public String toString() {
        return m58862E().toString();
    }

    /* renamed from: u */
    public C12235f mo36844u() {
        return m58862E().mo36844u();
    }

    /* renamed from: v */
    public C12235f mo36845v() {
        return m58862E().mo36845v();
    }

    /* renamed from: w */
    public int mo36846w() {
        return this.f45421g[this.f45420f.length - 1];
    }

    /* renamed from: y */
    public C12235f mo36848y(int i, int i2) {
        return m58862E().mo36848y(i, i2);
    }

    /* renamed from: z */
    public C12235f mo36849z() {
        return m58862E().mo36849z();
    }
}
