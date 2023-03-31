package p378v9;

/* renamed from: v9.b */
/* compiled from: ModulusGF */
public final class C12856b {

    /* renamed from: f */
    public static final C12856b f46960f = new C12856b(929, 3);

    /* renamed from: a */
    private final int[] f46961a;

    /* renamed from: b */
    private final int[] f46962b;

    /* renamed from: c */
    private final C12857c f46963c;

    /* renamed from: d */
    private final C12857c f46964d;

    /* renamed from: e */
    private final int f46965e;

    private C12856b(int i, int i2) {
        this.f46965e = i;
        this.f46961a = new int[i];
        this.f46962b = new int[i];
        int i3 = 1;
        for (int i4 = 0; i4 < i; i4++) {
            this.f46961a[i4] = i3;
            i3 = (i3 * i2) % i;
        }
        for (int i5 = 0; i5 < i - 1; i5++) {
            this.f46962b[this.f46961a[i5]] = i5;
        }
        this.f46963c = new C12857c(this, new int[]{0});
        this.f46964d = new C12857c(this, new int[]{1});
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo37845a(int i, int i2) {
        return (i + i2) % this.f46965e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C12857c mo37846b(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (i2 == 0) {
            return this.f46963c;
        } else {
            int[] iArr = new int[(i + 1)];
            iArr[0] = i2;
            return new C12857c(this, iArr);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo37847c(int i) {
        return this.f46961a[i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C12857c mo37848d() {
        return this.f46964d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo37849e() {
        return this.f46965e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C12857c mo37850f() {
        return this.f46963c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo37851g(int i) {
        if (i != 0) {
            return this.f46961a[(this.f46965e - this.f46962b[i]) - 1];
        }
        throw new ArithmeticException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int mo37852h(int i) {
        if (i != 0) {
            return this.f46962b[i];
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo37853i(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0;
        }
        int[] iArr = this.f46961a;
        int[] iArr2 = this.f46962b;
        return iArr[(iArr2[i] + iArr2[i2]) % (this.f46965e - 1)];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int mo37854j(int i, int i2) {
        int i3 = this.f46965e;
        return ((i + i3) - i2) % i3;
    }
}
