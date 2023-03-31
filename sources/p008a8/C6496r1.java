package p008a8;

import p211d8.C9898r;
import p220e8.C10019p;
import p247h8.C10432b;

/* renamed from: a8.r1 */
/* compiled from: UserData */
public class C6496r1 {

    /* renamed from: a */
    private final C6493q1 f30859a;

    /* renamed from: b */
    private final C9898r f30860b;

    /* renamed from: c */
    private final boolean f30861c;

    /* synthetic */ C6496r1(C6493q1 q1Var, C9898r rVar, boolean z, C6488p1 p1Var) {
        this(q1Var, rVar, z);
    }

    /* renamed from: k */
    private void m37922k() {
        if (this.f30860b != null) {
            for (int i = 0; i < this.f30860b.mo32358r(); i++) {
                m37923l(this.f30860b.mo32355o(i));
            }
        }
    }

    /* renamed from: l */
    private void m37923l(String str) {
        if (str.isEmpty()) {
            throw mo22059f("Document fields must not be empty");
        } else if (mo22063j() && str.startsWith("__") && str.endsWith("__")) {
            throw mo22059f("Document fields cannot begin and end with \"__\"");
        }
    }

    /* renamed from: a */
    public void mo22054a(C9898r rVar) {
        this.f30859a.mo22045b(rVar);
    }

    /* renamed from: b */
    public void mo22055b(C9898r rVar, C10019p pVar) {
        this.f30859a.mo22046c(rVar, pVar);
    }

    /* renamed from: c */
    public C6496r1 mo22056c(int i) {
        return new C6496r1(this.f30859a, (C9898r) null, true);
    }

    /* renamed from: d */
    public C6496r1 mo22057d(C9898r rVar) {
        C9898r rVar2 = this.f30860b;
        C6496r1 r1Var = new C6496r1(this.f30859a, rVar2 == null ? null : (C9898r) rVar2.mo32346a(rVar), false);
        r1Var.m37922k();
        return r1Var;
    }

    /* renamed from: e */
    public C6496r1 mo22058e(String str) {
        C9898r rVar = this.f30860b;
        C6496r1 r1Var = new C6496r1(this.f30859a, rVar == null ? null : (C9898r) rVar.mo32347b(str), false);
        r1Var.m37923l(str);
        return r1Var;
    }

    /* renamed from: f */
    public RuntimeException mo22059f(String str) {
        String str2;
        C9898r rVar = this.f30860b;
        if (rVar == null || rVar.mo32356p()) {
            str2 = "";
        } else {
            str2 = " (found in field " + this.f30860b.toString() + ")";
        }
        return new IllegalArgumentException("Invalid data. " + str + str2);
    }

    /* renamed from: g */
    public C6503u1 mo22060g() {
        return this.f30859a.f30855a;
    }

    /* renamed from: h */
    public C9898r mo22061h() {
        return this.f30860b;
    }

    /* renamed from: i */
    public boolean mo22062i() {
        return this.f30861c;
    }

    /* renamed from: j */
    public boolean mo22063j() {
        int i = C6488p1.f30838a[this.f30859a.f30855a.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return true;
        }
        if (i == 4 || i == 5) {
            return false;
        }
        throw C10432b.m52645a("Unexpected case for UserDataSource: %s", this.f30859a.f30855a.name());
    }

    private C6496r1(C6493q1 q1Var, C9898r rVar, boolean z) {
        this.f30859a = q1Var;
        this.f30860b = rVar;
        this.f30861c = z;
    }
}
