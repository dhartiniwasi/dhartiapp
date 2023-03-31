package com.google.android.gms.internal.p026firebaseauthapi;

import p033d5.C4141r;
import p218e6.C9977j;
import p293m7.C11814d1;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.er */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3285er extends C3848vt {

    /* renamed from: w */
    private final C3969zm f22004w;

    public C3285er(String str, String str2) {
        super(4);
        C4141r.m28218h(str, "code cannot be null or empty");
        this.f22004w = new C3969zm(str, str2);
    }

    /* renamed from: a */
    public final void mo15756a(C9977j jVar, C3814us usVar) {
        this.f22842v = new C3815ut(this, jVar);
        usVar.mo16902k(this.f22004w, this.f22822b);
    }

    /* renamed from: b */
    public final void mo15757b() {
        mo16970l(new C11814d1(this.f22832l));
    }

    public final String zza() {
        return "checkActionCode";
    }
}
