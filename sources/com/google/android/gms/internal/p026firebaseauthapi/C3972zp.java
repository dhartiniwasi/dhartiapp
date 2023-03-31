package com.google.android.gms.internal.p026firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.C7830n0;
import com.google.firebase.auth.C7840p1;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zp */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3972zp implements C3156au {

    /* renamed from: a */
    final /* synthetic */ C3156au f22992a;

    /* renamed from: b */
    final /* synthetic */ C3152aq f22993b;

    C3972zp(C3152aq aqVar, C3156au auVar) {
        this.f22993b = aqVar;
        this.f22992a = auVar;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo15754c(Object obj) {
        C3456k0 k0Var = (C3456k0) obj;
        if (!TextUtils.isEmpty(k0Var.mo16239e())) {
            this.f22993b.f21760b.mo16827g(new Status(17025), C7830n0.m43449O1(k0Var.mo16237c(), k0Var.mo16239e()));
            return;
        }
        this.f22993b.f21761c.m25154o(new C3784tv(k0Var.mo16238d(), k0Var.mo16236b(), Long.valueOf(k0Var.mo16235a()), "Bearer"), (String) null, "phone", Boolean.valueOf(k0Var.mo16240g()), (C7840p1) null, this.f22993b.f21760b, this.f22992a);
    }

    /* renamed from: f */
    public final void mo15755f(String str) {
        this.f22992a.mo15755f(str);
    }
}
