package com.google.android.gms.internal.p026firebaseauthapi;

import com.google.firebase.auth.C7814j;
import p033d5.C4141r;
import p218e6.C9977j;
import p293m7.C11823g1;
import p293m7.C11841m1;
import p293m7.C11861v0;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.pr */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3648pr extends C3848vt {

    /* renamed from: w */
    private final C7814j f22523w;

    public C3648pr(C7814j jVar) {
        super(2);
        this.f22523w = (C7814j) C4141r.m28222l(jVar, "credential cannot be null");
    }

    /* renamed from: a */
    public final void mo15756a(C9977j jVar, C3814us usVar) {
        this.f22842v = new C3815ut(this, jVar);
        C7814j jVar2 = this.f22523w;
        jVar2.mo26116L1(this.f22824d);
        usVar.mo16890D(new C3546mo(jVar2), this.f22822b);
    }

    /* renamed from: b */
    public final void mo15757b() {
        C11841m1 o = C3682qs.m26612o(this.f22823c, this.f22830j);
        ((C11861v0) this.f22825e).mo26070a(this.f22829i, o);
        mo16970l(new C11823g1(o));
    }

    public final String zza() {
        return "linkEmailAuthCredential";
    }
}
