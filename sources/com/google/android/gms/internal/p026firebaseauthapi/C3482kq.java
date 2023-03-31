package com.google.android.gms.internal.p026firebaseauthapi;

import com.google.firebase.auth.C7840p1;
import p293m7.C11836l;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.kq */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3482kq implements C3156au {

    /* renamed from: a */
    final /* synthetic */ C3515lq f22305a;

    C3482kq(C3515lq lqVar) {
        this.f22305a = lqVar;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo15754c(Object obj) {
        C3289ev evVar = (C3289ev) obj;
        C3784tv tvVar = new C3784tv(evVar.mo16005b(), evVar.mo16004a(), Long.valueOf(C3191c.m25215a(evVar.mo16004a())), "Bearer");
        C3515lq lqVar = this.f22305a;
        lqVar.f22337c.m25154o(tvVar, (String) null, (String) null, Boolean.FALSE, (C7840p1) null, lqVar.f22336b, this);
    }

    /* renamed from: f */
    public final void mo15755f(String str) {
        this.f22305a.f22336b.mo16404h(C11836l.m57255a(str));
    }
}
