package p220e8;

import java.util.Objects;

/* renamed from: e8.b */
/* compiled from: AutoValue_Overlay */
final class C10005b extends C10014k {

    /* renamed from: a */
    private final int f39956a;

    /* renamed from: b */
    private final C10009f f39957b;

    C10005b(int i, C10009f fVar) {
        this.f39956a = i;
        Objects.requireNonNull(fVar, "Null mutation");
        this.f39957b = fVar;
    }

    /* renamed from: c */
    public int mo32576c() {
        return this.f39956a;
    }

    /* renamed from: d */
    public C10009f mo32577d() {
        return this.f39957b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10014k)) {
            return false;
        }
        C10014k kVar = (C10014k) obj;
        if (this.f39956a != kVar.mo32576c() || !this.f39957b.equals(kVar.mo32577d())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.f39956a ^ 1000003) * 1000003) ^ this.f39957b.hashCode();
    }

    public String toString() {
        return "Overlay{largestBatchId=" + this.f39956a + ", mutation=" + this.f39957b + "}";
    }
}
