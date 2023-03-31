package p084l1;

import java.util.Objects;

/* renamed from: l1.a */
/* compiled from: AutoValue_Event */
final class C4901a<T> extends C4903c<T> {

    /* renamed from: a */
    private final Integer f25859a;

    /* renamed from: b */
    private final T f25860b;

    /* renamed from: c */
    private final C4904d f25861c;

    C4901a(Integer num, T t, C4904d dVar) {
        this.f25859a = num;
        Objects.requireNonNull(t, "Null payload");
        this.f25860b = t;
        Objects.requireNonNull(dVar, "Null priority");
        this.f25861c = dVar;
    }

    /* renamed from: a */
    public Integer mo18721a() {
        return this.f25859a;
    }

    /* renamed from: b */
    public T mo18722b() {
        return this.f25860b;
    }

    /* renamed from: c */
    public C4904d mo18723c() {
        return this.f25861c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4903c)) {
            return false;
        }
        C4903c cVar = (C4903c) obj;
        Integer num = this.f25859a;
        if (num != null ? num.equals(cVar.mo18721a()) : cVar.mo18721a() == null) {
            if (!this.f25860b.equals(cVar.mo18722b()) || !this.f25861c.equals(cVar.mo18723c())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.f25859a;
        return (((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f25860b.hashCode()) * 1000003) ^ this.f25861c.hashCode();
    }

    public String toString() {
        return "Event{code=" + this.f25859a + ", payload=" + this.f25860b + ", priority=" + this.f25861c + "}";
    }
}
