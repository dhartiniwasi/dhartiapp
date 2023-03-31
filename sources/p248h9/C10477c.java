package p248h9;

/* renamed from: h9.c */
/* compiled from: BitSource */
public final class C10477c {

    /* renamed from: a */
    private final byte[] f41465a;

    /* renamed from: b */
    private int f41466b;

    /* renamed from: c */
    private int f41467c;

    public C10477c(byte[] bArr) {
        this.f41465a = bArr;
    }

    /* renamed from: a */
    public int mo33585a() {
        return ((this.f41465a.length - this.f41466b) * 8) - this.f41467c;
    }

    /* renamed from: b */
    public int mo33586b() {
        return this.f41467c;
    }

    /* renamed from: c */
    public int mo33587c() {
        return this.f41466b;
    }

    /* renamed from: d */
    public int mo33588d(int i) {
        if (i <= 0 || i > 32 || i > mo33585a()) {
            throw new IllegalArgumentException(String.valueOf(i));
        }
        int i2 = this.f41467c;
        byte b = 0;
        if (i2 > 0) {
            int i3 = 8 - i2;
            int i4 = i < i3 ? i : i3;
            int i5 = i3 - i4;
            byte[] bArr = this.f41465a;
            int i6 = this.f41466b;
            int i7 = (((255 >> (8 - i4)) << i5) & bArr[i6]) >> i5;
            i -= i4;
            int i8 = i2 + i4;
            this.f41467c = i8;
            if (i8 == 8) {
                this.f41467c = 0;
                this.f41466b = i6 + 1;
            }
            b = i7;
        }
        if (i <= 0) {
            return b;
        }
        while (i >= 8) {
            int i9 = b << 8;
            byte[] bArr2 = this.f41465a;
            int i10 = this.f41466b;
            b = (bArr2[i10] & 255) | i9;
            this.f41466b = i10 + 1;
            i -= 8;
        }
        if (i <= 0) {
            return b;
        }
        int i11 = 8 - i;
        int i12 = (b << i) | ((((255 >> i11) << i11) & this.f41465a[this.f41466b]) >> i11);
        this.f41467c += i;
        return i12;
    }
}
