package p211d8;

import java.util.Objects;
import p211d8.C9893q;

/* renamed from: d8.b */
/* compiled from: AutoValue_FieldIndex_IndexOffset */
final class C9878b extends C9893q.C9894a {

    /* renamed from: c */
    private final C9905w f39700c;

    /* renamed from: d */
    private final C9888l f39701d;

    /* renamed from: e */
    private final int f39702e;

    C9878b(C9905w wVar, C9888l lVar, int i) {
        Objects.requireNonNull(wVar, "Null readTime");
        this.f39700c = wVar;
        Objects.requireNonNull(lVar, "Null documentKey");
        this.f39701d = lVar;
        this.f39702e = i;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C9893q.C9894a)) {
            return false;
        }
        C9893q.C9894a aVar = (C9893q.C9894a) obj;
        if (!this.f39700c.equals(aVar.mo32334p()) || !this.f39701d.equals(aVar.mo32332n()) || this.f39702e != aVar.mo32333o()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((this.f39700c.hashCode() ^ 1000003) * 1000003) ^ this.f39701d.hashCode()) * 1000003) ^ this.f39702e;
    }

    /* renamed from: n */
    public C9888l mo32332n() {
        return this.f39701d;
    }

    /* renamed from: o */
    public int mo32333o() {
        return this.f39702e;
    }

    /* renamed from: p */
    public C9905w mo32334p() {
        return this.f39700c;
    }

    public String toString() {
        return "IndexOffset{readTime=" + this.f39700c + ", documentKey=" + this.f39701d + ", largestBatchId=" + this.f39702e + "}";
    }
}
