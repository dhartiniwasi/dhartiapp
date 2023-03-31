package p020c1;

/* renamed from: c1.b */
/* compiled from: NetworkState */
public class C1837b {

    /* renamed from: a */
    private boolean f5396a;

    /* renamed from: b */
    private boolean f5397b;

    /* renamed from: c */
    private boolean f5398c;

    /* renamed from: d */
    private boolean f5399d;

    public C1837b(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f5396a = z;
        this.f5397b = z2;
        this.f5398c = z3;
        this.f5399d = z4;
    }

    /* renamed from: a */
    public boolean mo7016a() {
        return this.f5396a;
    }

    /* renamed from: b */
    public boolean mo7017b() {
        return this.f5398c;
    }

    /* renamed from: c */
    public boolean mo7018c() {
        return this.f5399d;
    }

    /* renamed from: d */
    public boolean mo7019d() {
        return this.f5397b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1837b)) {
            return false;
        }
        C1837b bVar = (C1837b) obj;
        if (this.f5396a == bVar.f5396a && this.f5397b == bVar.f5397b && this.f5398c == bVar.f5398c && this.f5399d == bVar.f5399d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = this.f5396a;
        if (this.f5397b) {
            i += 16;
        }
        if (this.f5398c) {
            i += 256;
        }
        return this.f5399d ? i + 4096 : i;
    }

    public String toString() {
        return String.format("[ Connected=%b Validated=%b Metered=%b NotRoaming=%b ]", new Object[]{Boolean.valueOf(this.f5396a), Boolean.valueOf(this.f5397b), Boolean.valueOf(this.f5398c), Boolean.valueOf(this.f5399d)});
    }
}
