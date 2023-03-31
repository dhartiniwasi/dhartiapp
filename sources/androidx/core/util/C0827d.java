package androidx.core.util;

/* renamed from: androidx.core.util.d */
/* compiled from: Pair */
public class C0827d<F, S> {

    /* renamed from: a */
    public final F f2438a;

    /* renamed from: b */
    public final S f2439b;

    public C0827d(F f, S s) {
        this.f2438a = f;
        this.f2439b = s;
    }

    /* renamed from: a */
    public static <A, B> C0827d<A, B> m3649a(A a, B b) {
        return new C0827d<>(a, b);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0827d)) {
            return false;
        }
        C0827d dVar = (C0827d) obj;
        if (!C0825c.m3642a(dVar.f2438a, this.f2438a) || !C0825c.m3642a(dVar.f2439b, this.f2439b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        F f = this.f2438a;
        int i = 0;
        int hashCode = f == null ? 0 : f.hashCode();
        S s = this.f2439b;
        if (s != null) {
            i = s.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "Pair{" + this.f2438a + " " + this.f2439b + "}";
    }
}
