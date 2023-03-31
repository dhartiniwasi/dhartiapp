package p037e2;

/* renamed from: e2.c0 */
/* compiled from: SeekPoint */
public final class C4196c0 {

    /* renamed from: c */
    public static final C4196c0 f23484c = new C4196c0(0, 0);

    /* renamed from: a */
    public final long f23485a;

    /* renamed from: b */
    public final long f23486b;

    public C4196c0(long j, long j2) {
        this.f23485a = j;
        this.f23486b = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4196c0.class != obj.getClass()) {
            return false;
        }
        C4196c0 c0Var = (C4196c0) obj;
        if (this.f23485a == c0Var.f23485a && this.f23486b == c0Var.f23486b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((int) this.f23485a) * 31) + ((int) this.f23486b);
    }

    public String toString() {
        return "[timeUs=" + this.f23485a + ", position=" + this.f23486b + "]";
    }
}
