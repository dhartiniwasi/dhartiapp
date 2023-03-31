package p015b3;

/* renamed from: b3.v */
/* compiled from: MediaPeriodId */
public class C1768v {

    /* renamed from: a */
    public final Object f5270a;

    /* renamed from: b */
    public final int f5271b;

    /* renamed from: c */
    public final int f5272c;

    /* renamed from: d */
    public final long f5273d;

    /* renamed from: e */
    public final int f5274e;

    public C1768v(Object obj) {
        this(obj, -1);
    }

    /* renamed from: a */
    public C1768v mo6885a(Object obj) {
        if (this.f5270a.equals(obj)) {
            return this;
        }
        return new C1768v(obj, this.f5271b, this.f5272c, this.f5273d, this.f5274e);
    }

    /* renamed from: b */
    public boolean mo6886b() {
        return this.f5271b != -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1768v)) {
            return false;
        }
        C1768v vVar = (C1768v) obj;
        if (this.f5270a.equals(vVar.f5270a) && this.f5271b == vVar.f5271b && this.f5272c == vVar.f5272c && this.f5273d == vVar.f5273d && this.f5274e == vVar.f5274e) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((527 + this.f5270a.hashCode()) * 31) + this.f5271b) * 31) + this.f5272c) * 31) + ((int) this.f5273d)) * 31) + this.f5274e;
    }

    public C1768v(Object obj, long j) {
        this(obj, -1, -1, j, -1);
    }

    public C1768v(Object obj, long j, int i) {
        this(obj, -1, -1, j, i);
    }

    public C1768v(Object obj, int i, int i2, long j) {
        this(obj, i, i2, j, -1);
    }

    protected C1768v(C1768v vVar) {
        this.f5270a = vVar.f5270a;
        this.f5271b = vVar.f5271b;
        this.f5272c = vVar.f5272c;
        this.f5273d = vVar.f5273d;
        this.f5274e = vVar.f5274e;
    }

    private C1768v(Object obj, int i, int i2, long j, int i3) {
        this.f5270a = obj;
        this.f5271b = i;
        this.f5272c = i2;
        this.f5273d = j;
        this.f5274e = i3;
    }
}
