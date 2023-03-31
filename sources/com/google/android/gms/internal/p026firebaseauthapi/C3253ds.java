package com.google.android.gms.internal.p026firebaseauthapi;

import com.google.firebase.auth.C7830n0;
import p033d5.C4141r;
import p218e6.C9977j;
import p293m7.C11823g1;
import p293m7.C11841m1;
import p293m7.C11861v0;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.ds */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3253ds extends C3848vt {

    /* renamed from: w */
    private final C3612oo f21957w;

    public C3253ds(C7830n0 n0Var, String str) {
        super(2);
        C4141r.m28221k(n0Var);
        this.f21957w = new C3612oo(n0Var, str);
    }

    /* renamed from: a */
    public final void mo15756a(C9977j jVar, C3814us usVar) {
        this.f22842v = new C3815ut(this, jVar);
        usVar.mo16891E(this.f21957w, this.f22822b);
    }

    /* renamed from: b */
    public final void mo15757b() {
        C11841m1 o = C3682qs.m26612o(this.f22823c, this.f22830j);
        ((C11861v0) this.f22825e).mo26070a(this.f22829i, o);
        mo16970l(new C11823g1(o));
    }

    public final String zza() {
        return "signInWithPhoneNumber";
    }
}
