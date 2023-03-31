package com.google.firebase.firestore;

import java.util.ArrayList;
import java.util.Map;
import p008a8.C6498s1;
import p008a8.C6500t1;
import p218e6.C9975i;
import p218e6.C9980l;
import p220e8.C10006c;
import p220e8.C10009f;
import p220e8.C10016m;
import p247h8.C10472x;

/* renamed from: com.google.firebase.firestore.b1 */
/* compiled from: WriteBatch */
public class C7898b1 {

    /* renamed from: a */
    private final FirebaseFirestore f34317a;

    /* renamed from: b */
    private final ArrayList<C10009f> f34318b = new ArrayList<>();

    /* renamed from: c */
    private boolean f34319c = false;

    C7898b1(FirebaseFirestore firebaseFirestore) {
        this.f34317a = (FirebaseFirestore) C10472x.m52785b(firebaseFirestore);
    }

    /* renamed from: e */
    private C7898b1 m43689e(C7921l lVar, C6500t1 t1Var) {
        this.f34317a.mo26293N(lVar);
        m43690g();
        this.f34318b.add(t1Var.mo22065a(lVar.mo26390l(), C10016m.m51148a(true)));
        return this;
    }

    /* renamed from: g */
    private void m43690g() {
        if (this.f34319c) {
            throw new IllegalStateException("A write batch can no longer be used after commit() has been called.");
        }
    }

    /* renamed from: a */
    public C9975i<Void> mo26317a() {
        m43690g();
        this.f34319c = true;
        if (this.f34318b.size() > 0) {
            return this.f34317a.mo26305s().mo22032m0(this.f34318b);
        }
        return C9980l.m51031e(null);
    }

    /* renamed from: b */
    public C7898b1 mo26318b(C7921l lVar) {
        this.f34317a.mo26293N(lVar);
        m43690g();
        this.f34318b.add(new C10006c(lVar.mo26390l(), C10016m.f39979c));
        return this;
    }

    /* renamed from: c */
    public C7898b1 mo26319c(C7921l lVar, Object obj) {
        return mo26320d(lVar, obj, C7947s0.f34410c);
    }

    /* renamed from: d */
    public C7898b1 mo26320d(C7921l lVar, Object obj, C7947s0 s0Var) {
        C6498s1 s1Var;
        this.f34317a.mo26293N(lVar);
        C10472x.m52786c(obj, "Provided data must not be null.");
        C10472x.m52786c(s0Var, "Provided options must not be null.");
        m43690g();
        if (s0Var.mo26453b()) {
            s1Var = this.f34317a.mo26308x().mo26490g(obj, s0Var.mo26452a());
        } else {
            s1Var = this.f34317a.mo26308x().mo26493l(obj);
        }
        this.f34318b.add(s1Var.mo22064a(lVar.mo26390l(), C10016m.f39979c));
        return this;
    }

    /* renamed from: f */
    public C7898b1 mo26321f(C7921l lVar, Map<String, Object> map) {
        return m43689e(lVar, this.f34317a.mo26308x().mo26495o(map));
    }
}
