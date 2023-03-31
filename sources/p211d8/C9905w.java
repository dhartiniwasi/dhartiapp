package p211d8;

import p246h7.C10428q;

/* renamed from: d8.w */
/* compiled from: SnapshotVersion */
public final class C9905w implements Comparable<C9905w> {

    /* renamed from: b */
    public static final C9905w f39751b = new C9905w(new C10428q(0, 0));

    /* renamed from: a */
    private final C10428q f39752a;

    public C9905w(C10428q qVar) {
        this.f39752a = qVar;
    }

    /* renamed from: a */
    public int compareTo(C9905w wVar) {
        return this.f39752a.compareTo(wVar.f39752a);
    }

    /* renamed from: b */
    public C10428q mo32439b() {
        return this.f39752a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C9905w) && compareTo((C9905w) obj) == 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return mo32439b().hashCode();
    }

    public String toString() {
        return "SnapshotVersion(seconds=" + this.f39752a.mo33499c() + ", nanos=" + this.f39752a.mo33498b() + ")";
    }
}
