package p211d8;

import p247h8.C10432b;

/* renamed from: d8.f */
/* compiled from: DatabaseId */
public final class C9882f implements Comparable<C9882f> {

    /* renamed from: c */
    public static final C9882f f39708c = m50673b("", "");

    /* renamed from: a */
    private final String f39709a;

    /* renamed from: b */
    private final String f39710b;

    private C9882f(String str, String str2) {
        this.f39709a = str;
        this.f39710b = str2;
    }

    /* renamed from: b */
    public static C9882f m50673b(String str, String str2) {
        return new C9882f(str, str2);
    }

    /* renamed from: c */
    public static C9882f m50674c(String str) {
        C9903u w = C9903u.m50784w(str);
        C10432b.m52648d(w.mo32358r() > 3 && w.mo32355o(0).equals("projects") && w.mo32355o(2).equals("databases"), "Tried to parse an invalid resource name: %s", w);
        return new C9882f(w.mo32355o(1), w.mo32355o(3));
    }

    /* renamed from: a */
    public int compareTo(C9882f fVar) {
        int compareTo = this.f39709a.compareTo(fVar.f39709a);
        return compareTo != 0 ? compareTo : this.f39710b.compareTo(fVar.f39710b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9882f.class != obj.getClass()) {
            return false;
        }
        C9882f fVar = (C9882f) obj;
        if (!this.f39709a.equals(fVar.f39709a) || !this.f39710b.equals(fVar.f39710b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.f39709a.hashCode() * 31) + this.f39710b.hashCode();
    }

    /* renamed from: j */
    public String mo32366j() {
        return this.f39710b;
    }

    /* renamed from: k */
    public String mo32367k() {
        return this.f39709a;
    }

    public String toString() {
        return "DatabaseId(" + this.f39709a + ", " + this.f39710b + ")";
    }
}
