package p105o1;

import java.util.Objects;
import p105o1.C5157g;

/* renamed from: o1.b */
/* compiled from: AutoValue_BackendResponse */
final class C5151b extends C5157g {

    /* renamed from: a */
    private final C5157g.C5158a f26675a;

    /* renamed from: b */
    private final long f26676b;

    C5151b(C5157g.C5158a aVar, long j) {
        Objects.requireNonNull(aVar, "Null status");
        this.f26675a = aVar;
        this.f26676b = j;
    }

    /* renamed from: b */
    public long mo19126b() {
        return this.f26676b;
    }

    /* renamed from: c */
    public C5157g.C5158a mo19127c() {
        return this.f26675a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5157g)) {
            return false;
        }
        C5157g gVar = (C5157g) obj;
        if (!this.f26675a.equals(gVar.mo19127c()) || this.f26676b != gVar.mo19126b()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.f26676b;
        return ((this.f26675a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.f26675a + ", nextRequestWaitMillis=" + this.f26676b + "}";
    }
}
