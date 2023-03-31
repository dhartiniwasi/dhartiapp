package p330q8;

import p033d5.C4133p;

/* renamed from: q8.b */
/* compiled from: com.google.firebase:firebase-auth-interop@@20.0.0 */
public class C12193b {

    /* renamed from: a */
    private String f45280a;

    public C12193b(String str) {
        this.f45280a = str;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C12193b)) {
            return false;
        }
        return C4133p.m28193a(this.f45280a, ((C12193b) obj).f45280a);
    }

    public int hashCode() {
        return C4133p.m28194b(this.f45280a);
    }

    public String toString() {
        return C4133p.m28195c(this).mo17442a("token", this.f45280a).toString();
    }
}
