package com.google.android.gms.internal.p026firebaseauthapi;

import p033d5.C4141r;
import p218e6.C9977j;
import p293m7.C11861v0;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.ks */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3484ks extends C3848vt {

    /* renamed from: w */
    private final String f22307w;

    public C3484ks(String str) {
        super(2);
        this.f22307w = C4141r.m28218h(str, "password cannot be null or empty");
    }

    /* renamed from: a */
    public final void mo15756a(C9977j jVar, C3814us usVar) {
        this.f22842v = new C3815ut(this, jVar);
        usVar.mo16901j(new C3905xm(this.f22824d.mo26249i2(), this.f22307w), this.f22822b);
    }

    /* renamed from: b */
    public final void mo15757b() {
        ((C11861v0) this.f22825e).mo26070a(this.f22829i, C3682qs.m26612o(this.f22823c, this.f22830j));
        mo16970l((Object) null);
    }

    public final String zza() {
        return "updatePassword";
    }
}
