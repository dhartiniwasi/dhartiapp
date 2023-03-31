package p257i8;

import java.util.List;
import java.util.Objects;

/* renamed from: i8.a */
/* compiled from: AutoValue_HeartBeatResult */
final class C10552a extends C10565l {

    /* renamed from: a */
    private final String f41583a;

    /* renamed from: b */
    private final List<String> f41584b;

    C10552a(String str, List<String> list) {
        Objects.requireNonNull(str, "Null userAgent");
        this.f41583a = str;
        Objects.requireNonNull(list, "Null usedDates");
        this.f41584b = list;
    }

    /* renamed from: b */
    public List<String> mo33746b() {
        return this.f41584b;
    }

    /* renamed from: c */
    public String mo33747c() {
        return this.f41583a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10565l)) {
            return false;
        }
        C10565l lVar = (C10565l) obj;
        if (!this.f41583a.equals(lVar.mo33747c()) || !this.f41584b.equals(lVar.mo33746b())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.f41583a.hashCode() ^ 1000003) * 1000003) ^ this.f41584b.hashCode();
    }

    public String toString() {
        return "HeartBeatResult{userAgent=" + this.f41583a + ", usedDates=" + this.f41584b + "}";
    }
}
