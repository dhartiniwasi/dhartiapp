package p381vc;

/* renamed from: vc.i */
/* compiled from: Settings */
public final class C12886i {

    /* renamed from: a */
    private int f47068a;

    /* renamed from: b */
    private int f47069b;

    /* renamed from: c */
    private int f47070c;

    /* renamed from: d */
    private final int[] f47071d = new int[10];

    /* renamed from: a */
    public int mo37909a(int i) {
        return this.f47071d[i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo37910b() {
        if ((this.f47068a & 2) != 0) {
            return this.f47071d[1];
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo37911c(int i) {
        return (this.f47068a & 32) != 0 ? this.f47071d[5] : i;
    }

    /* renamed from: d */
    public boolean mo37912d(int i) {
        return ((1 << i) & this.f47068a) != 0;
    }

    /* renamed from: e */
    public C12886i mo37913e(int i, int i2, int i3) {
        int[] iArr = this.f47071d;
        if (i >= iArr.length) {
            return this;
        }
        int i4 = 1 << i;
        this.f47068a |= i4;
        if ((i2 & 1) != 0) {
            this.f47069b |= i4;
        } else {
            this.f47069b &= ~i4;
        }
        if ((i2 & 2) != 0) {
            this.f47070c |= i4;
        } else {
            this.f47070c &= ~i4;
        }
        iArr[i] = i3;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo37914f() {
        return Integer.bitCount(this.f47068a);
    }
}
