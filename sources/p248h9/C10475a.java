package p248h9;

import java.util.Arrays;

/* renamed from: h9.a */
/* compiled from: BitArray */
public final class C10475a implements Cloneable {

    /* renamed from: a */
    private int[] f41459a;

    /* renamed from: b */
    private int f41460b;

    public C10475a() {
        this.f41460b = 0;
        this.f41459a = new int[1];
    }

    /* renamed from: i */
    private static int[] m52789i(int i) {
        return new int[((i + 31) / 32)];
    }

    /* renamed from: a */
    public void mo33552a() {
        int length = this.f41459a.length;
        for (int i = 0; i < length; i++) {
            this.f41459a[i] = 0;
        }
    }

    /* renamed from: b */
    public C10475a clone() {
        return new C10475a((int[]) this.f41459a.clone(), this.f41460b);
    }

    /* renamed from: c */
    public boolean mo33554c(int i) {
        return ((1 << (i & 31)) & this.f41459a[i / 32]) != 0;
    }

    /* renamed from: d */
    public int[] mo33556d() {
        return this.f41459a;
    }

    /* renamed from: e */
    public int mo33557e(int i) {
        int i2 = this.f41460b;
        if (i >= i2) {
            return i2;
        }
        int i3 = i / 32;
        int i4 = (~((1 << (i & 31)) - 1)) & this.f41459a[i3];
        while (i4 == 0) {
            i3++;
            int[] iArr = this.f41459a;
            if (i3 == iArr.length) {
                return this.f41460b;
            }
            i4 = iArr[i3];
        }
        int numberOfTrailingZeros = (i3 << 5) + Integer.numberOfTrailingZeros(i4);
        int i5 = this.f41460b;
        return numberOfTrailingZeros > i5 ? i5 : numberOfTrailingZeros;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C10475a)) {
            return false;
        }
        C10475a aVar = (C10475a) obj;
        if (this.f41460b != aVar.f41460b || !Arrays.equals(this.f41459a, aVar.f41459a)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public int mo33559f(int i) {
        int i2 = this.f41460b;
        if (i >= i2) {
            return i2;
        }
        int i3 = i / 32;
        int i4 = (~((1 << (i & 31)) - 1)) & (~this.f41459a[i3]);
        while (i4 == 0) {
            i3++;
            int[] iArr = this.f41459a;
            if (i3 == iArr.length) {
                return this.f41460b;
            }
            i4 = ~iArr[i3];
        }
        int numberOfTrailingZeros = (i3 << 5) + Integer.numberOfTrailingZeros(i4);
        int i5 = this.f41460b;
        return numberOfTrailingZeros > i5 ? i5 : numberOfTrailingZeros;
    }

    /* renamed from: g */
    public int mo33560g() {
        return this.f41460b;
    }

    /* renamed from: h */
    public boolean mo33561h(int i, int i2, boolean z) {
        if (i2 < i || i < 0 || i2 > this.f41460b) {
            throw new IllegalArgumentException();
        } else if (i2 == i) {
            return true;
        } else {
            int i3 = i2 - 1;
            int i4 = i / 32;
            int i5 = i3 / 32;
            int i6 = i4;
            while (i6 <= i5) {
                int i7 = 31;
                int i8 = i6 > i4 ? 0 : i & 31;
                if (i6 >= i5) {
                    i7 = 31 & i3;
                }
                int i9 = (2 << i7) - (1 << i8);
                int i10 = this.f41459a[i6] & i9;
                if (!z) {
                    i9 = 0;
                }
                if (i10 != i9) {
                    return false;
                }
                i6++;
            }
            return true;
        }
    }

    public int hashCode() {
        return (this.f41460b * 31) + Arrays.hashCode(this.f41459a);
    }

    /* renamed from: j */
    public void mo33563j() {
        int[] iArr = new int[this.f41459a.length];
        int i = (this.f41460b - 1) / 32;
        int i2 = i + 1;
        for (int i3 = 0; i3 < i2; i3++) {
            long j = (long) this.f41459a[i3];
            long j2 = ((j & 1431655765) << 1) | ((j >> 1) & 1431655765);
            long j3 = ((j2 & 858993459) << 2) | ((j2 >> 2) & 858993459);
            long j4 = ((j3 & 252645135) << 4) | ((j3 >> 4) & 252645135);
            long j5 = ((j4 & 16711935) << 8) | ((j4 >> 8) & 16711935);
            iArr[i - i3] = (int) (((j5 & 65535) << 16) | ((j5 >> 16) & 65535));
        }
        int i4 = this.f41460b;
        int i5 = i2 << 5;
        if (i4 != i5) {
            int i6 = i5 - i4;
            int i7 = iArr[0] >>> i6;
            for (int i8 = 1; i8 < i2; i8++) {
                int i9 = iArr[i8];
                iArr[i8 - 1] = i7 | (i9 << (32 - i6));
                i7 = i9 >>> i6;
            }
            iArr[i2 - 1] = i7;
        }
        this.f41459a = iArr;
    }

    /* renamed from: k */
    public void mo33564k(int i) {
        int[] iArr = this.f41459a;
        int i2 = i / 32;
        iArr[i2] = (1 << (i & 31)) | iArr[i2];
    }

    /* renamed from: l */
    public void mo33565l(int i, int i2) {
        this.f41459a[i / 32] = i2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(this.f41460b);
        for (int i = 0; i < this.f41460b; i++) {
            if ((i & 7) == 0) {
                sb.append(' ');
            }
            sb.append(mo33554c(i) ? 'X' : '.');
        }
        return sb.toString();
    }

    public C10475a(int i) {
        this.f41460b = i;
        this.f41459a = m52789i(i);
    }

    C10475a(int[] iArr, int i) {
        this.f41459a = iArr;
        this.f41460b = i;
    }
}
