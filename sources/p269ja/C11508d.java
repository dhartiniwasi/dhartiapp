package p269ja;

import com.onesignal.C8408e3;
import com.onesignal.C8469j3;
import com.onesignal.C8507n2;
import com.onesignal.C8547p1;
import kotlin.jvm.internal.C11669k;
import p278ka.C11604c;

/* renamed from: ja.d */
/* compiled from: OSOutcomeEventsFactory.kt */
public final class C11508d {

    /* renamed from: a */
    private final C11506b f43937a;

    /* renamed from: b */
    private C11604c f43938b;

    /* renamed from: c */
    private final C8547p1 f43939c;

    /* renamed from: d */
    private final C8408e3 f43940d;

    public C11508d(C8547p1 p1Var, C8408e3 e3Var, C8469j3 j3Var, C8507n2 n2Var) {
        C11669k.m56787e(p1Var, "logger");
        C11669k.m56787e(e3Var, "apiClient");
        this.f43939c = p1Var;
        this.f43940d = e3Var;
        C11669k.m56784b(j3Var);
        C11669k.m56784b(n2Var);
        this.f43937a = new C11506b(p1Var, j3Var, n2Var);
    }

    /* renamed from: a */
    private final C11509e m56277a() {
        if (this.f43937a.mo35518j()) {
            return new C11513i(this.f43939c, this.f43937a, new C11514j(this.f43940d));
        }
        return new C11511g(this.f43939c, this.f43937a, new C11512h(this.f43940d));
    }

    /* renamed from: c */
    private final C11604c m56278c() {
        if (!this.f43937a.mo35518j()) {
            C11604c cVar = this.f43938b;
            if (cVar instanceof C11511g) {
                C11669k.m56784b(cVar);
                return cVar;
            }
        }
        if (this.f43937a.mo35518j()) {
            C11604c cVar2 = this.f43938b;
            if (cVar2 instanceof C11513i) {
                C11669k.m56784b(cVar2);
                return cVar2;
            }
        }
        return m56277a();
    }

    /* renamed from: b */
    public final C11604c mo35523b() {
        return this.f43938b != null ? m56278c() : m56277a();
    }
}
