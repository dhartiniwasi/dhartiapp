package com.google.android.gms.internal.p026firebaseauthapi;

import com.google.firebase.auth.C7866y0;
import p033d5.C4141r;
import p218e6.C9977j;
import p293m7.C11861v0;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.ms */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3550ms extends C3848vt {

    /* renamed from: w */
    private final C7866y0 f22382w;

    public C3550ms(C7866y0 y0Var) {
        super(2);
        this.f22382w = (C7866y0) C4141r.m28222l(y0Var, "request cannot be null");
    }

    /* renamed from: a */
    public final void mo15756a(C9977j jVar, C3814us usVar) {
        this.f22842v = new C3815ut(this, jVar);
        usVar.mo16897e(new C3184bp(this.f22382w, this.f22824d.mo26249i2()), this.f22822b);
    }

    /* renamed from: b */
    public final void mo15757b() {
        ((C11861v0) this.f22825e).mo26070a(this.f22829i, C3682qs.m26612o(this.f22823c, this.f22830j));
        mo16970l((Object) null);
    }

    public final String zza() {
        return "updateProfile";
    }
}
