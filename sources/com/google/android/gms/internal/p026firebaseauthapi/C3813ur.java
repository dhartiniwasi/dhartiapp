package com.google.android.gms.internal.p026firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.C7830n0;
import p033d5.C4141r;
import p218e6.C9977j;
import p293m7.C11823g1;
import p293m7.C11841m1;
import p293m7.C11861v0;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.ur */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3813ur extends C3848vt {

    /* renamed from: w */
    private final C3612oo f22787w;

    public C3813ur(C7830n0 n0Var, String str) {
        super(2);
        C4141r.m28222l(n0Var, "credential cannot be null");
        n0Var.mo26147P1(false);
        this.f22787w = new C3612oo(n0Var, str);
    }

    /* renamed from: a */
    public final void mo15756a(C9977j jVar, C3814us usVar) {
        this.f22842v = new C3815ut(this, jVar);
        usVar.mo16891E(this.f22787w, this.f22822b);
    }

    /* renamed from: b */
    public final void mo15757b() {
        C11841m1 o = C3682qs.m26612o(this.f22823c, this.f22830j);
        if (this.f22824d.mo26209b().equalsIgnoreCase(o.mo26209b())) {
            ((C11861v0) this.f22825e).mo26070a(this.f22829i, o);
            mo16970l(new C11823g1(o));
            return;
        }
        mo16969k(new Status(17024));
    }

    public final String zza() {
        return "reauthenticateWithPhoneCredentialWithData";
    }
}
