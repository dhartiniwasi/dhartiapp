package p212d9;

/* renamed from: d9.g */
/* compiled from: InvertedLuminanceSource */
public final class C9915g extends C9916h {

    /* renamed from: c */
    private final C9916h f39799c;

    public C9915g(C9916h hVar) {
        super(hVar.mo32463d(), hVar.mo32462a());
        this.f39799c = hVar;
    }

    /* renamed from: b */
    public byte[] mo32458b() {
        byte[] b = this.f39799c.mo32458b();
        int d = mo32463d() * mo32462a();
        byte[] bArr = new byte[d];
        for (int i = 0; i < d; i++) {
            bArr[i] = (byte) (255 - (b[i] & 255));
        }
        return bArr;
    }

    /* renamed from: c */
    public byte[] mo32459c(int i, byte[] bArr) {
        byte[] c = this.f39799c.mo32459c(i, bArr);
        int d = mo32463d();
        for (int i2 = 0; i2 < d; i2++) {
            c[i2] = (byte) (255 - (c[i2] & 255));
        }
        return c;
    }

    /* renamed from: f */
    public boolean mo32460f() {
        return this.f39799c.mo32460f();
    }

    /* renamed from: g */
    public C9916h mo32461g() {
        return new C9915g(this.f39799c.mo32461g());
    }
}
