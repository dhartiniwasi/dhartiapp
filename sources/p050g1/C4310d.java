package p050g1;

/* renamed from: g1.d */
/* compiled from: Preference */
public class C4310d {

    /* renamed from: a */
    public String f24187a;

    /* renamed from: b */
    public Long f24188b;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C4310d(String str, boolean z) {
        this(str, z ? 1 : 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4310d)) {
            return false;
        }
        C4310d dVar = (C4310d) obj;
        if (!this.f24187a.equals(dVar.f24187a)) {
            return false;
        }
        Long l = this.f24188b;
        Long l2 = dVar.f24188b;
        if (l != null) {
            return l.equals(l2);
        }
        if (l2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f24187a.hashCode() * 31;
        Long l = this.f24188b;
        return hashCode + (l != null ? l.hashCode() : 0);
    }

    public C4310d(String str, long j) {
        this.f24187a = str;
        this.f24188b = Long.valueOf(j);
    }
}
