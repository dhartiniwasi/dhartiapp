package com.google.android.gms.internal.p026firebaseauthapi;

import p033d5.C4141r;
import p218e6.C9977j;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.dr */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3252dr extends C3848vt {

    /* renamed from: w */
    private final C3742sm f21956w;

    public C3252dr(String str, String str2) {
        super(7);
        C4141r.m28218h(str, "code cannot be null or empty");
        this.f21956w = new C3742sm(str, str2);
    }

    /* renamed from: a */
    public final void mo15756a(C9977j jVar, C3814us usVar) {
        this.f22842v = new C3815ut(this, jVar);
        usVar.mo16899h(this.f21956w, this.f22822b);
    }

    /* renamed from: b */
    public final void mo15757b() {
        mo16970l((Object) null);
    }

    public final String zza() {
        return "applyActionCode";
    }
}
