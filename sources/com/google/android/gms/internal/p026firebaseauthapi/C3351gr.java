package com.google.android.gms.internal.p026firebaseauthapi;

import p033d5.C4141r;
import p218e6.C9977j;
import p293m7.C11823g1;
import p293m7.C11841m1;
import p293m7.C11861v0;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.gr */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3351gr extends C3848vt {

    /* renamed from: w */
    final C3248dn f22077w;

    public C3351gr(String str, String str2, String str3) {
        super(2);
        C4141r.m28218h(str, "email cannot be null or empty");
        C4141r.m28218h(str2, "password cannot be null or empty");
        this.f22077w = new C3248dn(str, str2, str3);
    }

    /* renamed from: a */
    public final void mo15756a(C9977j jVar, C3814us usVar) {
        this.f22842v = new C3815ut(this, jVar);
        usVar.mo16904m(this.f22077w, this.f22822b);
    }

    /* renamed from: b */
    public final void mo15757b() {
        C11841m1 o = C3682qs.m26612o(this.f22823c, this.f22830j);
        ((C11861v0) this.f22825e).mo26070a(this.f22829i, o);
        mo16970l(new C11823g1(o));
    }

    public final String zza() {
        return "createUserWithEmailAndPassword";
    }
}
