package p268j9;

/* renamed from: j9.a */
/* compiled from: GenericGF */
public final class C11501a {

    /* renamed from: h */
    public static final C11501a f43913h = new C11501a(4201, 4096, 1);

    /* renamed from: i */
    public static final C11501a f43914i = new C11501a(1033, 1024, 1);

    /* renamed from: j */
    public static final C11501a f43915j;

    /* renamed from: k */
    public static final C11501a f43916k = new C11501a(19, 16, 1);

    /* renamed from: l */
    public static final C11501a f43917l = new C11501a(285, 256, 0);

    /* renamed from: m */
    public static final C11501a f43918m;

    /* renamed from: n */
    public static final C11501a f43919n;

    /* renamed from: o */
    public static final C11501a f43920o;

    /* renamed from: a */
    private final int[] f43921a;

    /* renamed from: b */
    private final int[] f43922b;

    /* renamed from: c */
    private final C11502b f43923c;

    /* renamed from: d */
    private final C11502b f43924d;

    /* renamed from: e */
    private final int f43925e;

    /* renamed from: f */
    private final int f43926f;

    /* renamed from: g */
    private final int f43927g;

    static {
        C11501a aVar = new C11501a(67, 64, 1);
        f43915j = aVar;
        C11501a aVar2 = new C11501a(301, 256, 1);
        f43918m = aVar2;
        f43919n = aVar2;
        f43920o = aVar;
    }

    public C11501a(int i, int i2, int i3) {
        this.f43926f = i;
        this.f43925e = i2;
        this.f43927g = i3;
        this.f43921a = new int[i2];
        this.f43922b = new int[i2];
        int i4 = 1;
        for (int i5 = 0; i5 < i2; i5++) {
            this.f43921a[i5] = i4;
            i4 <<= 1;
            if (i4 >= i2) {
                i4 = (i4 ^ i) & (i2 - 1);
            }
        }
        for (int i6 = 0; i6 < i2 - 1; i6++) {
            this.f43922b[this.f43921a[i6]] = i6;
        }
        this.f43923c = new C11502b(this, new int[]{0});
        this.f43924d = new C11502b(this, new int[]{1});
    }

    /* renamed from: a */
    static int m56241a(int i, int i2) {
        return i ^ i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C11502b mo35493b(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (i2 == 0) {
            return this.f43923c;
        } else {
            int[] iArr = new int[(i + 1)];
            iArr[0] = i2;
            return new C11502b(this, iArr);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo35494c(int i) {
        return this.f43921a[i];
    }

    /* renamed from: d */
    public int mo35495d() {
        return this.f43927g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C11502b mo35496e() {
        return this.f43924d;
    }

    /* renamed from: f */
    public int mo35497f() {
        return this.f43925e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C11502b mo35498g() {
        return this.f43923c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int mo35499h(int i) {
        if (i != 0) {
            return this.f43921a[(this.f43925e - this.f43922b[i]) - 1];
        }
        throw new ArithmeticException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo35500i(int i) {
        if (i != 0) {
            return this.f43922b[i];
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int mo35501j(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0;
        }
        int[] iArr = this.f43921a;
        int[] iArr2 = this.f43922b;
        return iArr[(iArr2[i] + iArr2[i2]) % (this.f43925e - 1)];
    }

    public String toString() {
        return "GF(0x" + Integer.toHexString(this.f43926f) + ',' + this.f43925e + ')';
    }
}
