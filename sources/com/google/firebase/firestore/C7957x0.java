package com.google.firebase.firestore;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import p008a8.C6476k1;
import p008a8.C6498s1;
import p008a8.C6500t1;
import p211d8.C9899s;
import p218e6.C9975i;
import p218e6.C9980l;
import p247h8.C10432b;
import p247h8.C10460p;
import p247h8.C10472x;

/* renamed from: com.google.firebase.firestore.x0 */
/* compiled from: Transaction */
public class C7957x0 {

    /* renamed from: a */
    private final C6476k1 f34432a;

    /* renamed from: b */
    private final FirebaseFirestore f34433b;

    /* renamed from: com.google.firebase.firestore.x0$a */
    /* compiled from: Transaction */
    public interface C7958a<TResult> {
        /* renamed from: a */
        TResult mo26468a(C7957x0 x0Var) throws C7959y;
    }

    C7957x0(C6476k1 k1Var, FirebaseFirestore firebaseFirestore) {
        this.f34432a = (C6476k1) C10472x.m52785b(k1Var);
        this.f34433b = (FirebaseFirestore) C10472x.m52785b(firebaseFirestore);
    }

    /* renamed from: d */
    private C9975i<C7923m> m43883d(C7921l lVar) {
        return this.f34432a.mo21985j(Collections.singletonList(lVar.mo26390l())).mo26354i(C10460p.f41438b, new C7955w0(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ C7923m m43884e(C9975i iVar) throws Exception {
        if (iVar.mo26362q()) {
            List list = (List) iVar.mo26358m();
            if (list.size() == 1) {
                C9899s sVar = (C9899s) list.get(0);
                if (sVar.mo32371b()) {
                    return C7923m.m43773b(this.f34433b, sVar, false, false);
                }
                if (sVar.mo32379h()) {
                    return C7923m.m43774c(this.f34433b, sVar.getKey(), false);
                }
                throw C10432b.m52645a("BatchGetDocumentsRequest returned unexpected document type: " + C9899s.class.getCanonicalName(), new Object[0]);
            }
            throw C10432b.m52645a("Mismatch in docs returned from document lookup.", new Object[0]);
        }
        throw iVar.mo26357l();
    }

    /* renamed from: h */
    private C7957x0 m43885h(C7921l lVar, C6500t1 t1Var) {
        this.f34433b.mo26293N(lVar);
        this.f34432a.mo21987o(lVar.mo26390l(), t1Var);
        return this;
    }

    /* renamed from: b */
    public C7957x0 mo26463b(C7921l lVar) {
        this.f34433b.mo26293N(lVar);
        this.f34432a.mo21984e(lVar.mo26390l());
        return this;
    }

    /* renamed from: c */
    public C7923m mo26464c(C7921l lVar) throws C7959y {
        this.f34433b.mo26293N(lVar);
        try {
            return (C7923m) C9980l.m51027a(m43883d(lVar));
        } catch (ExecutionException e) {
            if (e.getCause() instanceof C7959y) {
                throw ((C7959y) e.getCause());
            }
            throw new RuntimeException(e.getCause());
        } catch (InterruptedException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: f */
    public C7957x0 mo26465f(C7921l lVar, Object obj) {
        return mo26466g(lVar, obj, C7947s0.f34410c);
    }

    /* renamed from: g */
    public C7957x0 mo26466g(C7921l lVar, Object obj, C7947s0 s0Var) {
        C6498s1 s1Var;
        this.f34433b.mo26293N(lVar);
        C10472x.m52786c(obj, "Provided data must not be null.");
        C10472x.m52786c(s0Var, "Provided options must not be null.");
        if (s0Var.mo26453b()) {
            s1Var = this.f34433b.mo26308x().mo26490g(obj, s0Var.mo26452a());
        } else {
            s1Var = this.f34433b.mo26308x().mo26493l(obj);
        }
        this.f34432a.mo21986n(lVar.mo26390l(), s1Var);
        return this;
    }

    /* renamed from: i */
    public C7957x0 mo26467i(C7921l lVar, Map<String, Object> map) {
        return m43885h(lVar, this.f34433b.mo26308x().mo26495o(map));
    }
}
