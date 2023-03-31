package p091m1;

/* renamed from: m1.h */
/* compiled from: AutoValue_LogResponse */
final class C4984h extends C4996n {

    /* renamed from: a */
    private final long f26136a;

    C4984h(long j) {
        this.f26136a = j;
    }

    /* renamed from: c */
    public long mo18913c() {
        return this.f26136a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4996n) || this.f26136a != ((C4996n) obj).mo18913c()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.f26136a;
        return 1000003 ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f26136a + "}";
    }
}
