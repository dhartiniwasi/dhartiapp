package com.google.android.gms.internal.p026firebaseauthapi;

import p033d5.C4141r;
import p218e6.C9977j;
import p293m7.C11830j;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.es */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3286es extends C3848vt {

    /* renamed from: w */
    private final C3678qo f22005w;

    public C3286es(C11830j jVar, String str, String str2, long j, boolean z, boolean z2, String str3, String str4, boolean z3) {
        super(8);
        C4141r.m28221k(jVar);
        C4141r.m28217g(str);
        this.f22005w = new C3678qo(C4141r.m28217g(jVar.mo36059K1()), str, str2, j, z, z2, str3, str4, z3);
    }

    /* renamed from: a */
    public final void mo15756a(C9977j jVar, C3814us usVar) {
        this.f22842v = new C3815ut(this, jVar);
        usVar.mo16892F(this.f22005w, this.f22822b);
    }

    /* renamed from: b */
    public final void mo15757b() {
    }

    public final String zza() {
        return "startMfaEnrollmentWithPhoneNumber";
    }
}
