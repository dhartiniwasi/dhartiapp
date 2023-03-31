package p367u8;

import java.util.Objects;

/* renamed from: u8.a */
/* compiled from: AutoValue_LibraryVersion */
final class C12700a extends C12705f {

    /* renamed from: a */
    private final String f46470a;

    /* renamed from: b */
    private final String f46471b;

    C12700a(String str, String str2) {
        Objects.requireNonNull(str, "Null libraryName");
        this.f46470a = str;
        Objects.requireNonNull(str2, "Null version");
        this.f46471b = str2;
    }

    /* renamed from: b */
    public String mo37573b() {
        return this.f46470a;
    }

    /* renamed from: c */
    public String mo37574c() {
        return this.f46471b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C12705f)) {
            return false;
        }
        C12705f fVar = (C12705f) obj;
        if (!this.f46470a.equals(fVar.mo37573b()) || !this.f46471b.equals(fVar.mo37574c())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.f46470a.hashCode() ^ 1000003) * 1000003) ^ this.f46471b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.f46470a + ", version=" + this.f46471b + "}";
    }
}
