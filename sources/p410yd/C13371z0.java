package p410yd;

/* renamed from: yd.z0 */
/* compiled from: JobSupport.kt */
final class C13371z0 implements C13319k1 {

    /* renamed from: a */
    private final boolean f47702a;

    public C13371z0(boolean z) {
        this.f47702a = z;
    }

    /* renamed from: b */
    public boolean mo38390b() {
        return this.f47702a;
    }

    /* renamed from: e */
    public C13267a2 mo38391e() {
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empty{");
        sb.append(mo38390b() ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
