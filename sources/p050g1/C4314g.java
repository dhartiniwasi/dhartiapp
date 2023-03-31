package p050g1;

/* renamed from: g1.g */
/* compiled from: SystemIdInfo */
public class C4314g {

    /* renamed from: a */
    public final String f24192a;

    /* renamed from: b */
    public final int f24193b;

    public C4314g(String str, int i) {
        this.f24192a = str;
        this.f24193b = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4314g)) {
            return false;
        }
        C4314g gVar = (C4314g) obj;
        if (this.f24193b != gVar.f24193b) {
            return false;
        }
        return this.f24192a.equals(gVar.f24192a);
    }

    public int hashCode() {
        return (this.f24192a.hashCode() * 31) + this.f24193b;
    }
}
