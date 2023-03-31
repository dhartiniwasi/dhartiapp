package p153v1;

import java.util.Objects;
import p098n1.C5085i;
import p098n1.C5095o;

/* renamed from: v1.b */
/* compiled from: AutoValue_PersistedEvent */
final class C5759b extends C5772k {

    /* renamed from: a */
    private final long f28733a;

    /* renamed from: b */
    private final C5095o f28734b;

    /* renamed from: c */
    private final C5085i f28735c;

    C5759b(long j, C5095o oVar, C5085i iVar) {
        this.f28733a = j;
        Objects.requireNonNull(oVar, "Null transportContext");
        this.f28734b = oVar;
        Objects.requireNonNull(iVar, "Null event");
        this.f28735c = iVar;
    }

    /* renamed from: b */
    public C5085i mo20254b() {
        return this.f28735c;
    }

    /* renamed from: c */
    public long mo20255c() {
        return this.f28733a;
    }

    /* renamed from: d */
    public C5095o mo20256d() {
        return this.f28734b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5772k)) {
            return false;
        }
        C5772k kVar = (C5772k) obj;
        if (this.f28733a != kVar.mo20255c() || !this.f28734b.equals(kVar.mo20256d()) || !this.f28735c.equals(kVar.mo20254b())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.f28733a;
        return this.f28735c.hashCode() ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f28734b.hashCode()) * 1000003);
    }

    public String toString() {
        return "PersistedEvent{id=" + this.f28733a + ", transportContext=" + this.f28734b + ", event=" + this.f28735c + "}";
    }
}
