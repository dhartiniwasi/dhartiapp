package p091m1;

import java.util.List;
import java.util.Objects;

/* renamed from: m1.d */
/* compiled from: AutoValue_BatchedLogRequest */
final class C4974d extends C4988j {

    /* renamed from: a */
    private final List<C4994m> f26103a;

    C4974d(List<C4994m> list) {
        Objects.requireNonNull(list, "Null logRequests");
        this.f26103a = list;
    }

    /* renamed from: c */
    public List<C4994m> mo18865c() {
        return this.f26103a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4988j) {
            return this.f26103a.equals(((C4988j) obj).mo18865c());
        }
        return false;
    }

    public int hashCode() {
        return this.f26103a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.f26103a + "}";
    }
}
