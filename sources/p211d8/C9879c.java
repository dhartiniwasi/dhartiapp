package p211d8;

import java.util.Objects;
import p211d8.C9893q;

/* renamed from: d8.c */
/* compiled from: AutoValue_FieldIndex_IndexState */
final class C9879c extends C9893q.C9895b {

    /* renamed from: a */
    private final long f39703a;

    /* renamed from: b */
    private final C9893q.C9894a f39704b;

    C9879c(long j, C9893q.C9894a aVar) {
        this.f39703a = j;
        Objects.requireNonNull(aVar, "Null offset");
        this.f39704b = aVar;
    }

    /* renamed from: c */
    public C9893q.C9894a mo32336c() {
        return this.f39704b;
    }

    /* renamed from: d */
    public long mo32337d() {
        return this.f39703a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C9893q.C9895b)) {
            return false;
        }
        C9893q.C9895b bVar = (C9893q.C9895b) obj;
        if (this.f39703a != bVar.mo32337d() || !this.f39704b.equals(bVar.mo32336c())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.f39703a;
        return this.f39704b.hashCode() ^ ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003);
    }

    public String toString() {
        return "IndexState{sequenceNumber=" + this.f39703a + ", offset=" + this.f39704b + "}";
    }
}
