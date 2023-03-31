package p368u9;

/* renamed from: u9.d */
/* compiled from: Codeword */
final class C12713d {

    /* renamed from: a */
    private final int f46494a;

    /* renamed from: b */
    private final int f46495b;

    /* renamed from: c */
    private final int f46496c;

    /* renamed from: d */
    private final int f46497d;

    /* renamed from: e */
    private int f46498e = -1;

    C12713d(int i, int i2, int i3, int i4) {
        this.f46494a = i;
        this.f46495b = i2;
        this.f46496c = i3;
        this.f46497d = i4;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo37596a() {
        return this.f46496c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo37597b() {
        return this.f46495b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo37598c() {
        return this.f46498e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo37599d() {
        return this.f46494a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo37600e() {
        return this.f46497d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo37601f() {
        return this.f46495b - this.f46494a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo37602g() {
        return mo37603h(this.f46498e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo37603h(int i) {
        return i != -1 && this.f46496c == (i % 3) * 3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo37604i(int i) {
        this.f46498e = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo37605j() {
        this.f46498e = ((this.f46497d / 30) * 3) + (this.f46496c / 3);
    }

    public String toString() {
        return this.f46498e + "|" + this.f46497d;
    }
}
