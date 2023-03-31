package p211d8;

import java.util.Objects;
import p211d8.C9893q;

/* renamed from: d8.d */
/* compiled from: AutoValue_FieldIndex_Segment */
final class C9880d extends C9893q.C9896c {

    /* renamed from: a */
    private final C9898r f39705a;

    /* renamed from: b */
    private final C9893q.C9896c.C9897a f39706b;

    C9880d(C9898r rVar, C9893q.C9896c.C9897a aVar) {
        Objects.requireNonNull(rVar, "Null fieldPath");
        this.f39705a = rVar;
        Objects.requireNonNull(aVar, "Null kind");
        this.f39706b = aVar;
    }

    /* renamed from: c */
    public C9898r mo32341c() {
        return this.f39705a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C9893q.C9896c)) {
            return false;
        }
        C9893q.C9896c cVar = (C9893q.C9896c) obj;
        if (!this.f39705a.equals(cVar.mo32341c()) || !this.f39706b.equals(cVar.mo32344j())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.f39705a.hashCode() ^ 1000003) * 1000003) ^ this.f39706b.hashCode();
    }

    /* renamed from: j */
    public C9893q.C9896c.C9897a mo32344j() {
        return this.f39706b;
    }

    public String toString() {
        return "Segment{fieldPath=" + this.f39705a + ", kind=" + this.f39706b + "}";
    }
}
