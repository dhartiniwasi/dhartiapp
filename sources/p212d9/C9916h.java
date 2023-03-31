package p212d9;

/* renamed from: d9.h */
/* compiled from: LuminanceSource */
public abstract class C9916h {

    /* renamed from: a */
    private final int f39800a;

    /* renamed from: b */
    private final int f39801b;

    protected C9916h(int i, int i2) {
        this.f39800a = i;
        this.f39801b = i2;
    }

    /* renamed from: a */
    public final int mo32462a() {
        return this.f39801b;
    }

    /* renamed from: b */
    public abstract byte[] mo32458b();

    /* renamed from: c */
    public abstract byte[] mo32459c(int i, byte[] bArr);

    /* renamed from: d */
    public final int mo32463d() {
        return this.f39800a;
    }

    /* renamed from: e */
    public C9916h mo32464e() {
        return new C9915g(this);
    }

    /* renamed from: f */
    public boolean mo32460f() {
        return false;
    }

    /* renamed from: g */
    public C9916h mo32461g() {
        throw new UnsupportedOperationException("This luminance source does not support rotation by 90 degrees.");
    }

    public final String toString() {
        int i = this.f39800a;
        byte[] bArr = new byte[i];
        StringBuilder sb = new StringBuilder(this.f39801b * (i + 1));
        for (int i2 = 0; i2 < this.f39801b; i2++) {
            bArr = mo32459c(i2, bArr);
            for (int i3 = 0; i3 < this.f39800a; i3++) {
                byte b = bArr[i3] & 255;
                sb.append(b < 64 ? '#' : b < 128 ? '+' : b < 192 ? '.' : ' ');
            }
            sb.append(10);
        }
        return sb.toString();
    }
}
