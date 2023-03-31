package com.google.android.gms.internal.p026firebaseauthapi;

import com.google.firebase.auth.C7806h;
import p033d5.C4141r;
import p218e6.C9977j;
import p293m7.C11823g1;
import p293m7.C11841m1;
import p293m7.C11861v0;
import p293m7.C11863w0;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.nr */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3582nr extends C3848vt {

    /* renamed from: w */
    private final C3126a0 f22429w;

    public C3582nr(C7806h hVar) {
        super(2);
        C4141r.m28222l(hVar, "credential cannot be null");
        this.f22429w = C11863w0.m57342a(hVar, (String) null);
    }

    /* renamed from: a */
    public final void mo15756a(C9977j jVar, C3814us usVar) {
        this.f22842v = new C3815ut(this, jVar);
        usVar.mo16911t(new C3710rn(this.f22824d.mo26249i2(), this.f22429w), this.f22822b);
    }

    /* renamed from: b */
    public final void mo15757b() {
        C11841m1 o = C3682qs.m26612o(this.f22823c, this.f22830j);
        ((C11861v0) this.f22825e).mo26070a(this.f22829i, o);
        mo16970l(new C11823g1(o));
    }

    public final String zza() {
        return "linkFederatedCredential";
    }
}
