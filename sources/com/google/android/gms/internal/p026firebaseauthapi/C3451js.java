package com.google.android.gms.internal.p026firebaseauthapi;

import p033d5.C4141r;
import p218e6.C9977j;
import p293m7.C11861v0;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.js */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3451js extends C3848vt {

    /* renamed from: w */
    private final String f22242w;

    public C3451js(String str) {
        super(2);
        this.f22242w = C4141r.m28218h(str, "email cannot be null or empty");
    }

    /* renamed from: a */
    public final void mo15756a(C9977j jVar, C3814us usVar) {
        this.f22842v = new C3815ut(this, jVar);
        usVar.mo16900i(new C3841vm(this.f22824d.mo26249i2(), this.f22242w), this.f22822b);
    }

    /* renamed from: b */
    public final void mo15757b() {
        ((C11861v0) this.f22825e).mo26070a(this.f22829i, C3682qs.m26612o(this.f22823c, this.f22830j));
        mo16970l((Object) null);
    }

    public final String zza() {
        return "updateEmail";
    }
}
