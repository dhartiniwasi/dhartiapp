package com.google.android.gms.internal.p026firebaseauthapi;

import com.google.firebase.auth.C7814j;
import p033d5.C4141r;
import p218e6.C9977j;
import p293m7.C11823g1;
import p293m7.C11841m1;
import p293m7.C11861v0;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.mr */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3549mr extends C3848vt {

    /* renamed from: w */
    private final C7814j f22381w;

    public C3549mr(C7814j jVar) {
        super(2);
        this.f22381w = (C7814j) C4141r.m28222l(jVar, "credential cannot be null");
        C4141r.m28218h(jVar.mo26118N1(), "email cannot be null");
        C4141r.m28218h(jVar.mo26119O1(), "password cannot be null");
    }

    /* renamed from: a */
    public final void mo15756a(C9977j jVar, C3814us usVar) {
        this.f22842v = new C3815ut(this, jVar);
        usVar.mo16910s(new C3644pn(this.f22381w.mo26118N1(), C4141r.m28217g(this.f22381w.mo26119O1()), this.f22824d.mo26249i2()), this.f22822b);
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
