package com.google.android.gms.internal.p026firebaseauthapi;

import android.text.TextUtils;
import p033d5.C4141r;
import p218e6.C9977j;
import p293m7.C11807b0;
import p293m7.C11861v0;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.lr */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3516lr extends C3848vt {

    /* renamed from: w */
    private final C3512ln f22338w;

    public C3516lr(String str) {
        super(1);
        C4141r.m28218h(str, "refresh token cannot be null");
        this.f22338w = new C3512ln(str);
    }

    /* renamed from: a */
    public final void mo15756a(C9977j jVar, C3814us usVar) {
        this.f22842v = new C3815ut(this, jVar);
        usVar.mo16908q(this.f22338w, this.f22822b);
    }

    /* renamed from: b */
    public final void mo15757b() {
        if (TextUtils.isEmpty(this.f22829i.mo16835K1())) {
            this.f22829i.mo16838N1(this.f22338w.zza());
        }
        ((C11861v0) this.f22825e).mo26070a(this.f22829i, this.f22824d);
        mo16970l(C11807b0.m57198a(this.f22829i.mo16834J1()));
    }

    public final String zza() {
        return "getAccessToken";
    }
}
