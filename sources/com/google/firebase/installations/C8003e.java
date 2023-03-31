package com.google.firebase.installations;

import p218e6.C9977j;
import p303n8.C11981d;

/* renamed from: com.google.firebase.installations.e */
/* compiled from: GetAuthTokenListener */
class C8003e implements C8007h {

    /* renamed from: a */
    private final C8008i f34566a;

    /* renamed from: b */
    private final C9977j<C8005g> f34567b;

    public C8003e(C8008i iVar, C9977j<C8005g> jVar) {
        this.f34566a = iVar;
        this.f34567b = jVar;
    }

    /* renamed from: a */
    public boolean mo26568a(Exception exc) {
        this.f34567b.mo32545d(exc);
        return true;
    }

    /* renamed from: b */
    public boolean mo26569b(C11981d dVar) {
        if (!dVar.mo36337k() || this.f34566a.mo26573f(dVar)) {
            return false;
        }
        this.f34567b.mo32544c(C8005g.m44068a().mo26558b(dVar.mo36312b()).mo26560d(dVar.mo36313c()).mo26559c(dVar.mo36319h()).mo26557a());
        return true;
    }
}
