package com.google.android.gms.internal.p026firebaseauthapi;

import com.google.firebase.auth.C7793e;
import p033d5.C4141r;
import p218e6.C9977j;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.xr */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3910xr extends C3848vt {

    /* renamed from: w */
    private final C3150ao f22930w;

    /* renamed from: x */
    private final String f22931x;

    public C3910xr(String str, C7793e eVar, String str2, String str3) {
        super(4);
        C4141r.m28218h(str, "email cannot be null or empty");
        this.f22930w = new C3150ao(str, eVar, str2);
        this.f22931x = str3;
    }

    /* renamed from: a */
    public final void mo15756a(C9977j jVar, C3814us usVar) {
        this.f22842v = new C3815ut(this, jVar);
        usVar.mo16915x(this.f22930w, this.f22822b);
    }

    /* renamed from: b */
    public final void mo15757b() {
        mo16970l((Object) null);
    }

    public final String zza() {
        return this.f22931x;
    }
}
