package p212d9;

/* renamed from: d9.k */
/* compiled from: PlanarYUVLuminanceSource */
public final class C9919k extends C9916h {

    /* renamed from: c */
    private final byte[] f39805c;

    /* renamed from: d */
    private final int f39806d;

    /* renamed from: e */
    private final int f39807e;

    /* renamed from: f */
    private final int f39808f;

    /* renamed from: g */
    private final int f39809g;

    public C9919k(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        super(i5, i6);
        if (i3 + i5 > i || i4 + i6 > i2) {
            throw new IllegalArgumentException("Crop rectangle does not fit within image data.");
        }
        this.f39805c = bArr;
        this.f39806d = i;
        this.f39807e = i2;
        this.f39808f = i3;
        this.f39809g = i4;
        if (z) {
            m50863h(i5, i6);
        }
    }

    /* renamed from: h */
    private void m50863h(int i, int i2) {
        byte[] bArr = this.f39805c;
        int i3 = (this.f39809g * this.f39806d) + this.f39808f;
        int i4 = 0;
        while (i4 < i2) {
            int i5 = (i / 2) + i3;
            int i6 = (i3 + i) - 1;
            int i7 = i3;
            while (i7 < i5) {
                byte b = bArr[i7];
                bArr[i7] = bArr[i6];
                bArr[i6] = b;
                i7++;
                i6--;
            }
            i4++;
            i3 += this.f39806d;
        }
    }

    /* renamed from: b */
    public byte[] mo32458b() {
        int d = mo32463d();
        int a = mo32462a();
        int i = this.f39806d;
        if (d == i && a == this.f39807e) {
            return this.f39805c;
        }
        int i2 = d * a;
        byte[] bArr = new byte[i2];
        int i3 = (this.f39809g * i) + this.f39808f;
        if (d == i) {
            System.arraycopy(this.f39805c, i3, bArr, 0, i2);
            return bArr;
        }
        for (int i4 = 0; i4 < a; i4++) {
            System.arraycopy(this.f39805c, i3, bArr, i4 * d, d);
            i3 += this.f39806d;
        }
        return bArr;
    }

    /* renamed from: c */
    public byte[] mo32459c(int i, byte[] bArr) {
        if (i < 0 || i >= mo32462a()) {
            throw new IllegalArgumentException("Requested row is outside the image: " + i);
        }
        int d = mo32463d();
        if (bArr == null || bArr.length < d) {
            bArr = new byte[d];
        }
        System.arraycopy(this.f39805c, ((i + this.f39809g) * this.f39806d) + this.f39808f, bArr, 0, d);
        return bArr;
    }
}
