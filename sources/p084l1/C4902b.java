package p084l1;

import java.util.Objects;

/* renamed from: l1.b */
/* compiled from: Encoding */
public final class C4902b {

    /* renamed from: a */
    private final String f25862a;

    private C4902b(String str) {
        Objects.requireNonNull(str, "name is null");
        this.f25862a = str;
    }

    /* renamed from: b */
    public static C4902b m31123b(String str) {
        return new C4902b(str);
    }

    /* renamed from: a */
    public String mo18727a() {
        return this.f25862a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4902b)) {
            return false;
        }
        return this.f25862a.equals(((C4902b) obj).f25862a);
    }

    public int hashCode() {
        return this.f25862a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Encoding{name=\"" + this.f25862a + "\"}";
    }
}
