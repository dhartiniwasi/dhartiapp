package p248h9;

import java.util.Arrays;

/* renamed from: h9.b */
/* compiled from: BitMatrix */
public final class C10476b implements Cloneable {

    /* renamed from: a */
    private final int f41461a;

    /* renamed from: b */
    private final int f41462b;

    /* renamed from: c */
    private final int f41463c;

    /* renamed from: d */
    private final int[] f41464d;

    public C10476b(int i) {
        this(i, i);
    }

    /* renamed from: a */
    private String m52801a(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(this.f41462b * (this.f41461a + 1));
        for (int i = 0; i < this.f41462b; i++) {
            for (int i2 = 0; i2 < this.f41461a; i2++) {
                sb.append(mo33570d(i2, i) ? str : str2);
            }
            sb.append(str3);
        }
        return sb.toString();
    }

    /* renamed from: b */
    public C10476b clone() {
        return new C10476b(this.f41461a, this.f41462b, this.f41463c, (int[]) this.f41464d.clone());
    }

    /* renamed from: c */
    public void mo33568c(int i, int i2) {
        int i3 = (i2 * this.f41463c) + (i / 32);
        int[] iArr = this.f41464d;
        iArr[i3] = (1 << (i & 31)) ^ iArr[i3];
    }

    /* renamed from: d */
    public boolean mo33570d(int i, int i2) {
        return ((this.f41464d[(i2 * this.f41463c) + (i / 32)] >>> (i & 31)) & 1) != 0;
    }

    /* renamed from: e */
    public int[] mo33571e() {
        int length = this.f41464d.length - 1;
        while (length >= 0 && this.f41464d[length] == 0) {
            length--;
        }
        if (length < 0) {
            return null;
        }
        int i = this.f41463c;
        int i2 = length / i;
        int i3 = (length % i) << 5;
        int i4 = 31;
        while ((this.f41464d[length] >>> i4) == 0) {
            i4--;
        }
        return new int[]{i3 + i4, i2};
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C10476b)) {
            return false;
        }
        C10476b bVar = (C10476b) obj;
        if (this.f41461a == bVar.f41461a && this.f41462b == bVar.f41462b && this.f41463c == bVar.f41463c && Arrays.equals(this.f41464d, bVar.f41464d)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public int[] mo33573f() {
        int i = this.f41461a;
        int i2 = this.f41462b;
        int i3 = -1;
        int i4 = -1;
        for (int i5 = 0; i5 < this.f41462b; i5++) {
            int i6 = 0;
            while (true) {
                int i7 = this.f41463c;
                if (i6 >= i7) {
                    break;
                }
                int i8 = this.f41464d[(i7 * i5) + i6];
                if (i8 != 0) {
                    if (i5 < i2) {
                        i2 = i5;
                    }
                    if (i5 > i4) {
                        i4 = i5;
                    }
                    int i9 = i6 << 5;
                    if (i9 < i) {
                        int i10 = 0;
                        while ((i8 << (31 - i10)) == 0) {
                            i10++;
                        }
                        int i11 = i10 + i9;
                        if (i11 < i) {
                            i = i11;
                        }
                    }
                    if (i9 + 31 > i3) {
                        int i12 = 31;
                        while ((i8 >>> i12) == 0) {
                            i12--;
                        }
                        int i13 = i9 + i12;
                        if (i13 > i3) {
                            i3 = i13;
                        }
                    }
                }
                i6++;
            }
        }
        if (i3 < i || i4 < i2) {
            return null;
        }
        return new int[]{i, i2, (i3 - i) + 1, (i4 - i2) + 1};
    }

    /* renamed from: g */
    public int mo33574g() {
        return this.f41462b;
    }

    /* renamed from: h */
    public C10475a mo33575h(int i, C10475a aVar) {
        if (aVar == null || aVar.mo33560g() < this.f41461a) {
            aVar = new C10475a(this.f41461a);
        } else {
            aVar.mo33552a();
        }
        int i2 = i * this.f41463c;
        for (int i3 = 0; i3 < this.f41463c; i3++) {
            aVar.mo33565l(i3 << 5, this.f41464d[i2 + i3]);
        }
        return aVar;
    }

    public int hashCode() {
        int i = this.f41461a;
        return (((((((i * 31) + i) * 31) + this.f41462b) * 31) + this.f41463c) * 31) + Arrays.hashCode(this.f41464d);
    }

    /* renamed from: i */
    public int[] mo33577i() {
        int[] iArr;
        int i = 0;
        while (true) {
            iArr = this.f41464d;
            if (i < iArr.length && iArr[i] == 0) {
                i++;
            }
        }
        if (i == iArr.length) {
            return null;
        }
        int i2 = this.f41463c;
        int i3 = i / i2;
        int i4 = (i % i2) << 5;
        int i5 = iArr[i];
        int i6 = 0;
        while ((i5 << (31 - i6)) == 0) {
            i6++;
        }
        return new int[]{i4 + i6, i3};
    }

    /* renamed from: j */
    public int mo33578j() {
        return this.f41461a;
    }

    /* renamed from: k */
    public void mo33579k() {
        int j = mo33578j();
        int g = mo33574g();
        C10475a aVar = new C10475a(j);
        C10475a aVar2 = new C10475a(j);
        for (int i = 0; i < (g + 1) / 2; i++) {
            aVar = mo33575h(i, aVar);
            int i2 = (g - 1) - i;
            aVar2 = mo33575h(i2, aVar2);
            aVar.mo33563j();
            aVar2.mo33563j();
            mo33582n(i, aVar2);
            mo33582n(i2, aVar);
        }
    }

    /* renamed from: l */
    public void mo33580l(int i, int i2) {
        int i3 = (i2 * this.f41463c) + (i / 32);
        int[] iArr = this.f41464d;
        iArr[i3] = (1 << (i & 31)) | iArr[i3];
    }

    /* renamed from: m */
    public void mo33581m(int i, int i2, int i3, int i4) {
        if (i2 < 0 || i < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        } else if (i4 <= 0 || i3 <= 0) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        } else {
            int i5 = i3 + i;
            int i6 = i4 + i2;
            if (i6 > this.f41462b || i5 > this.f41461a) {
                throw new IllegalArgumentException("The region must fit inside the matrix");
            }
            while (i2 < i6) {
                int i7 = this.f41463c * i2;
                for (int i8 = i; i8 < i5; i8++) {
                    int[] iArr = this.f41464d;
                    int i9 = (i8 / 32) + i7;
                    iArr[i9] = iArr[i9] | (1 << (i8 & 31));
                }
                i2++;
            }
        }
    }

    /* renamed from: n */
    public void mo33582n(int i, C10475a aVar) {
        int[] d = aVar.mo33556d();
        int[] iArr = this.f41464d;
        int i2 = this.f41463c;
        System.arraycopy(d, 0, iArr, i * i2, i2);
    }

    /* renamed from: o */
    public String mo33583o(String str, String str2) {
        return m52801a(str, str2, "\n");
    }

    public String toString() {
        return mo33583o("X ", "  ");
    }

    public C10476b(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.f41461a = i;
        this.f41462b = i2;
        int i3 = (i + 31) / 32;
        this.f41463c = i3;
        this.f41464d = new int[(i3 * i2)];
    }

    private C10476b(int i, int i2, int i3, int[] iArr) {
        this.f41461a = i;
        this.f41462b = i2;
        this.f41463c = i3;
        this.f41464d = iArr;
    }
}
