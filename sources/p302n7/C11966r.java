package p302n7;

/* renamed from: n7.r */
/* compiled from: Dependency */
public final class C11966r {

    /* renamed from: a */
    private final C11943f0<?> f44879a;

    /* renamed from: b */
    private final int f44880b;

    /* renamed from: c */
    private final int f44881c;

    private C11966r(Class<?> cls, int i, int i2) {
        this(C11943f0.m57675b(cls), i, i2);
    }

    /* renamed from: a */
    public static C11966r m57740a(Class<?> cls) {
        return new C11966r(cls, 0, 2);
    }

    /* renamed from: b */
    private static String m57741b(int i) {
        if (i == 0) {
            return "direct";
        }
        if (i == 1) {
            return "provider";
        }
        if (i == 2) {
            return "deferred";
        }
        throw new AssertionError("Unsupported injection: " + i);
    }

    @Deprecated
    /* renamed from: h */
    public static C11966r m57742h(Class<?> cls) {
        return new C11966r(cls, 0, 0);
    }

    /* renamed from: i */
    public static C11966r m57743i(Class<?> cls) {
        return new C11966r(cls, 0, 1);
    }

    /* renamed from: j */
    public static C11966r m57744j(Class<?> cls) {
        return new C11966r(cls, 1, 0);
    }

    /* renamed from: k */
    public static C11966r m57745k(C11943f0<?> f0Var) {
        return new C11966r(f0Var, 1, 0);
    }

    /* renamed from: l */
    public static C11966r m57746l(Class<?> cls) {
        return new C11966r(cls, 1, 1);
    }

    /* renamed from: m */
    public static C11966r m57747m(Class<?> cls) {
        return new C11966r(cls, 2, 0);
    }

    /* renamed from: c */
    public C11943f0<?> mo36297c() {
        return this.f44879a;
    }

    /* renamed from: d */
    public boolean mo36298d() {
        return this.f44881c == 2;
    }

    /* renamed from: e */
    public boolean mo36299e() {
        return this.f44881c == 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C11966r)) {
            return false;
        }
        C11966r rVar = (C11966r) obj;
        if (this.f44879a.equals(rVar.f44879a) && this.f44880b == rVar.f44880b && this.f44881c == rVar.f44881c) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo36301f() {
        return this.f44880b == 1;
    }

    /* renamed from: g */
    public boolean mo36302g() {
        return this.f44880b == 2;
    }

    public int hashCode() {
        return ((((this.f44879a.hashCode() ^ 1000003) * 1000003) ^ this.f44880b) * 1000003) ^ this.f44881c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f44879a);
        sb.append(", type=");
        int i = this.f44880b;
        sb.append(i == 1 ? "required" : i == 0 ? "optional" : "set");
        sb.append(", injection=");
        sb.append(m57741b(this.f44881c));
        sb.append("}");
        return sb.toString();
    }

    private C11966r(C11943f0<?> f0Var, int i, int i2) {
        this.f44879a = (C11943f0) C11941e0.m57672c(f0Var, "Null dependency anInterface.");
        this.f44880b = i;
        this.f44881c = i2;
    }
}
