package com.google.firebase.firestore;

import android.app.Activity;
import com.google.firebase.firestore.C7959y;
import java.util.Collections;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import p008a8.C6452b1;
import p008a8.C6456d;
import p008a8.C6471h;
import p008a8.C6484p;
import p008a8.C6498s1;
import p008a8.C6500t1;
import p008a8.C6505w0;
import p008a8.C6514y1;
import p211d8.C9885i;
import p211d8.C9888l;
import p211d8.C9903u;
import p218e6.C9975i;
import p218e6.C9977j;
import p218e6.C9980l;
import p220e8.C10006c;
import p220e8.C10016m;
import p247h8.C10432b;
import p247h8.C10449g0;
import p247h8.C10460p;
import p247h8.C10472x;

/* renamed from: com.google.firebase.firestore.l */
/* compiled from: DocumentReference */
public class C7921l {

    /* renamed from: a */
    private final C9888l f34365a;

    /* renamed from: b */
    private final FirebaseFirestore f34366b;

    C7921l(C9888l lVar, FirebaseFirestore firebaseFirestore) {
        this.f34365a = (C9888l) C10472x.m52785b(lVar);
        this.f34366b = firebaseFirestore;
    }

    /* renamed from: f */
    private C7904e0 m43753f(Executor executor, C6484p.C6485a aVar, Activity activity, C7926n<C7923m> nVar) {
        C6471h hVar = new C6471h(executor, new C7915i(this, nVar));
        return C6456d.m37658c(activity, new C6505w0(this.f34366b.mo26305s(), this.f34366b.mo26305s().mo22024d0(m43754g(), aVar, hVar), hVar));
    }

    /* renamed from: g */
    private C6452b1 m43754g() {
        return C6452b1.m37619b(this.f34365a.mo32390s());
    }

    /* renamed from: i */
    static C7921l m43755i(C9903u uVar, FirebaseFirestore firebaseFirestore) {
        if (uVar.mo32358r() % 2 == 0) {
            return new C7921l(C9888l.m50697n(uVar), firebaseFirestore);
        }
        throw new IllegalArgumentException("Invalid document reference. Document references must have an even number of segments, but " + uVar.mo32348c() + " has " + uVar.mo32358r());
    }

    /* renamed from: n */
    private C9975i<C7923m> m43756n(C7951u0 u0Var) {
        C9977j jVar = new C9977j();
        C9977j jVar2 = new C9977j();
        C6484p.C6485a aVar = new C6484p.C6485a();
        aVar.f30819a = true;
        aVar.f30820b = true;
        aVar.f30821c = true;
        jVar2.mo32544c(m43753f(C10460p.f41438b, aVar, (Activity) null, new C7917j(jVar, jVar2, u0Var)));
        return jVar.mo32542a();
    }

    /* renamed from: o */
    private static C6484p.C6485a m43757o(C7916i0 i0Var) {
        C6484p.C6485a aVar = new C6484p.C6485a();
        C7916i0 i0Var2 = C7916i0.INCLUDE;
        boolean z = true;
        aVar.f30819a = i0Var == i0Var2;
        if (i0Var != i0Var2) {
            z = false;
        }
        aVar.f30820b = z;
        aVar.f30821c = false;
        return aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ void m43758p(C7926n nVar, C6514y1 y1Var, C7959y yVar) {
        C7923m mVar;
        if (yVar != null) {
            nVar.mo21951a(null, yVar);
            return;
        }
        boolean z = true;
        C10432b.m52648d(y1Var != null, "Got event without value or error set", new Object[0]);
        if (y1Var.mo22086e().size() > 1) {
            z = false;
        }
        C10432b.m52648d(z, "Too many documents returned on a document query", new Object[0]);
        C9885i i = y1Var.mo22086e().mo32397i(this.f34365a);
        if (i != null) {
            mVar = C7923m.m43773b(this.f34366b, i, y1Var.mo22094k(), y1Var.mo22088f().contains(i.getKey()));
        } else {
            mVar = C7923m.m43774c(this.f34366b, this.f34365a, y1Var.mo22094k());
        }
        nVar.mo21951a(mVar, (C7959y) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ C7923m m43759q(C9975i iVar) throws Exception {
        C9885i iVar2 = (C9885i) iVar.mo26358m();
        return new C7923m(this.f34366b, this.f34365a, iVar2, true, iVar2 != null && iVar2.mo32373d());
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public static /* synthetic */ void m43760r(C9977j jVar, C9977j jVar2, C7951u0 u0Var, C7923m mVar, C7959y yVar) {
        if (yVar != null) {
            jVar.mo32543b(yVar);
            return;
        }
        try {
            ((C7904e0) C9980l.m51027a(jVar2.mo32542a())).remove();
            if (!mVar.mo26395a() && mVar.mo26399f().mo26457b()) {
                jVar.mo32543b(new C7959y("Failed to get document because the client is offline.", C7959y.C7960a.UNAVAILABLE));
            } else if (!mVar.mo26395a() || !mVar.mo26399f().mo26457b() || u0Var != C7951u0.SERVER) {
                jVar.mo32544c(mVar);
            } else {
                jVar.mo32543b(new C7959y("Failed to get document from server. (However, this document does exist in the local cache. Run again without setting source to SERVER to retrieve the cached document.)", C7959y.C7960a.UNAVAILABLE));
            }
        } catch (ExecutionException e) {
            throw C10432b.m52646b(e, "Failed to register a listener for a single document", new Object[0]);
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            throw C10432b.m52646b(e2, "Failed to register a listener for a single document", new Object[0]);
        }
    }

    /* renamed from: u */
    private C9975i<Void> m43761u(C6500t1 t1Var) {
        return this.f34366b.mo26305s().mo22032m0(Collections.singletonList(t1Var.mo22065a(this.f34365a, C10016m.m51148a(true)))).mo26354i(C10460p.f41438b, C10449g0.m52700C());
    }

    /* renamed from: d */
    public C7904e0 mo26383d(C7916i0 i0Var, C7926n<C7923m> nVar) {
        return mo26384e(C10460p.f41437a, i0Var, nVar);
    }

    /* renamed from: e */
    public C7904e0 mo26384e(Executor executor, C7916i0 i0Var, C7926n<C7923m> nVar) {
        C10472x.m52786c(executor, "Provided executor must not be null.");
        C10472x.m52786c(i0Var, "Provided MetadataChanges value must not be null.");
        C10472x.m52786c(nVar, "Provided EventListener must not be null.");
        return m43753f(executor, m43757o(i0Var), (Activity) null, nVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7921l)) {
            return false;
        }
        C7921l lVar = (C7921l) obj;
        if (!this.f34365a.equals(lVar.f34365a) || !this.f34366b.equals(lVar.f34366b)) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public C9975i<Void> mo26386h() {
        return this.f34366b.mo26305s().mo22032m0(Collections.singletonList(new C10006c(this.f34365a, C10016m.f39979c))).mo26354i(C10460p.f41438b, C10449g0.m52700C());
    }

    public int hashCode() {
        return (this.f34365a.hashCode() * 31) + this.f34366b.hashCode();
    }

    /* renamed from: j */
    public C9975i<C7923m> mo26388j(C7951u0 u0Var) {
        if (u0Var == C7951u0.CACHE) {
            return this.f34366b.mo26305s().mo22020B(this.f34365a).mo26354i(C10460p.f41438b, new C7919k(this));
        }
        return m43756n(u0Var);
    }

    /* renamed from: k */
    public FirebaseFirestore mo26389k() {
        return this.f34366b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public C9888l mo26390l() {
        return this.f34365a;
    }

    /* renamed from: m */
    public String mo26391m() {
        return this.f34365a.mo32390s().mo32348c();
    }

    /* renamed from: s */
    public C9975i<Void> mo26392s(Object obj) {
        return mo26393t(obj, C7947s0.f34410c);
    }

    /* renamed from: t */
    public C9975i<Void> mo26393t(Object obj, C7947s0 s0Var) {
        C6498s1 s1Var;
        C10472x.m52786c(obj, "Provided data must not be null.");
        C10472x.m52786c(s0Var, "Provided options must not be null.");
        if (s0Var.mo26453b()) {
            s1Var = this.f34366b.mo26308x().mo26490g(obj, s0Var.mo26452a());
        } else {
            s1Var = this.f34366b.mo26308x().mo26493l(obj);
        }
        return this.f34366b.mo26305s().mo22032m0(Collections.singletonList(s1Var.mo22064a(this.f34365a, C10016m.f39979c))).mo26354i(C10460p.f41438b, C10449g0.m52700C());
    }

    /* renamed from: v */
    public C9975i<Void> mo26394v(C7932p pVar, Object obj, Object... objArr) {
        return m43761u(this.f34366b.mo26308x().mo26494n(C10449g0.m52706f(1, pVar, obj, objArr)));
    }
}
