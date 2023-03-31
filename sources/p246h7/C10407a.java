package p246h7;

/* renamed from: h7.a */
/* compiled from: AutoValue_StartupTime */
final class C10407a extends C10427p {

    /* renamed from: a */
    private final long f41327a;

    /* renamed from: b */
    private final long f41328b;

    /* renamed from: c */
    private final long f41329c;

    C10407a(long j, long j2, long j3) {
        this.f41327a = j;
        this.f41328b = j2;
        this.f41329c = j3;
    }

    /* renamed from: b */
    public long mo33453b() {
        return this.f41328b;
    }

    /* renamed from: c */
    public long mo33454c() {
        return this.f41327a;
    }

    /* renamed from: d */
    public long mo33455d() {
        return this.f41329c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10427p)) {
            return false;
        }
        C10427p pVar = (C10427p) obj;
        if (this.f41327a == pVar.mo33454c() && this.f41328b == pVar.mo33453b() && this.f41329c == pVar.mo33455d()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.f41327a;
        long j2 = this.f41328b;
        long j3 = this.f41329c;
        return ((int) ((j3 >>> 32) ^ j3)) ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    public String toString() {
        return "StartupTime{epochMillis=" + this.f41327a + ", elapsedRealtime=" + this.f41328b + ", uptimeMillis=" + this.f41329c + "}";
    }
}
