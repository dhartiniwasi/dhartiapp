package p343rc;

import p182a7.C6431n;

/* renamed from: rc.q */
/* compiled from: ConnectivityStateInfo */
public final class C12370q {

    /* renamed from: a */
    private final C12367p f45705a;

    /* renamed from: b */
    private final C12335j1 f45706b;

    private C12370q(C12367p pVar, C12335j1 j1Var) {
        this.f45705a = (C12367p) C6431n.m37562o(pVar, "state is null");
        this.f45706b = (C12335j1) C6431n.m37562o(j1Var, "status is null");
    }

    /* renamed from: a */
    public static C12370q m59185a(C12367p pVar) {
        C6431n.m37552e(pVar != C12367p.TRANSIENT_FAILURE, "state is TRANSIENT_ERROR. Use forError() instead");
        return new C12370q(pVar, C12335j1.f45606f);
    }

    /* renamed from: b */
    public static C12370q m59186b(C12335j1 j1Var) {
        C6431n.m37552e(!j1Var.mo37028o(), "The error status must not be OK");
        return new C12370q(C12367p.TRANSIENT_FAILURE, j1Var);
    }

    /* renamed from: c */
    public C12367p mo37080c() {
        return this.f45705a;
    }

    /* renamed from: d */
    public C12335j1 mo37081d() {
        return this.f45706b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C12370q)) {
            return false;
        }
        C12370q qVar = (C12370q) obj;
        if (!this.f45705a.equals(qVar.f45705a) || !this.f45706b.equals(qVar.f45706b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f45705a.hashCode() ^ this.f45706b.hashCode();
    }

    public String toString() {
        if (this.f45706b.mo37028o()) {
            return this.f45705a.toString();
        }
        return this.f45705a + "(" + this.f45706b + ")";
    }
}
