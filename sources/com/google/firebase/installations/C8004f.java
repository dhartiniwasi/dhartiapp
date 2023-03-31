package com.google.firebase.installations;

import p218e6.C9977j;
import p303n8.C11981d;

/* renamed from: com.google.firebase.installations.f */
/* compiled from: GetIdListener */
class C8004f implements C8007h {

    /* renamed from: a */
    final C9977j<String> f34568a;

    public C8004f(C9977j<String> jVar) {
        this.f34568a = jVar;
    }

    /* renamed from: a */
    public boolean mo26568a(Exception exc) {
        return false;
    }

    /* renamed from: b */
    public boolean mo26569b(C11981d dVar) {
        if (!dVar.mo36338l() && !dVar.mo36337k() && !dVar.mo36335i()) {
            return false;
        }
        this.f34568a.mo32546e(dVar.mo36314d());
        return true;
    }
}
