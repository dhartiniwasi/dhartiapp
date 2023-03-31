package com.google.android.gms.internal.p026firebaseauthapi;

import android.text.TextUtils;
import com.google.firebase.auth.C7840p1;
import p293m7.C11836l;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.gq */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3350gq implements C3156au {

    /* renamed from: a */
    final /* synthetic */ C3383hq f22076a;

    C3350gq(C3383hq hqVar) {
        this.f22076a = hqVar;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo15754c(Object obj) {
        C3522m0 m0Var = (C3522m0) obj;
        if (TextUtils.isEmpty(m0Var.mo16351a()) || TextUtils.isEmpty(m0Var.mo16352b())) {
            this.f22076a.f22106b.mo16404h(C11836l.m57255a("INTERNAL_SUCCESS_SIGN_OUT"));
            return;
        }
        C3784tv tvVar = new C3784tv(m0Var.mo16352b(), m0Var.mo16351a(), Long.valueOf(C3191c.m25215a(m0Var.mo16351a())), "Bearer");
        C3383hq hqVar = this.f22076a;
        hqVar.f22107c.m25154o(tvVar, (String) null, (String) null, Boolean.FALSE, (C7840p1) null, hqVar.f22106b, this);
    }

    /* renamed from: f */
    public final void mo15755f(String str) {
        this.f22076a.f22106b.mo16404h(C11836l.m57255a(str));
    }
}
