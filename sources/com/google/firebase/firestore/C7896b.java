package com.google.firebase.firestore;

import p218e6.C9975i;
import p218e6.C9977j;
import p247h8.C10460p;
import p247h8.C10472x;

/* renamed from: com.google.firebase.firestore.b */
/* compiled from: AggregateQuery */
public class C7896b {

    /* renamed from: a */
    private final C7929o0 f34315a;

    C7896b(C7929o0 o0Var) {
        this.f34315a = o0Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ Object m43686c(C9977j jVar, C9975i iVar) throws Exception {
        if (iVar.mo26362q()) {
            jVar.mo32544c(new C7899c(this, ((Long) iVar.mo26358m()).longValue()));
            return null;
        }
        jVar.mo32543b(iVar.mo26357l());
        return null;
    }

    /* renamed from: b */
    public C9975i<C7899c> mo26314b(C7901d dVar) {
        C10472x.m52786c(dVar, "AggregateSource must not be null");
        C9977j jVar = new C9977j();
        this.f34315a.f34383b.mo26305s().mo22027g0(this.f34315a.f34382a).mo26354i(C10460p.f41438b, new C7892a(this, jVar));
        return jVar.mo32542a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7896b)) {
            return false;
        }
        return this.f34315a.equals(((C7896b) obj).f34315a);
    }

    public int hashCode() {
        return this.f34315a.hashCode();
    }
}
