package com.google.android.gms.internal.p026firebaseauthapi;

import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.np */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3580np implements C3156au {

    /* renamed from: a */
    final /* synthetic */ C3976zt f22423a;

    /* renamed from: b */
    final /* synthetic */ C3781ts f22424b;

    /* renamed from: c */
    final /* synthetic */ C3784tv f22425c;

    /* renamed from: d */
    final /* synthetic */ C3653q f22426d;

    /* renamed from: e */
    final /* synthetic */ C3186br f22427e;

    C3580np(C3186br brVar, C3976zt ztVar, C3781ts tsVar, C3784tv tvVar, C3653q qVar) {
        this.f22427e = brVar;
        this.f22423a = ztVar;
        this.f22424b = tsVar;
        this.f22425c = tvVar;
        this.f22426d = qVar;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo15754c(Object obj) {
        List I1 = ((C3487kv) obj).mo16271I1();
        if (I1 == null || I1.isEmpty()) {
            this.f22423a.mo15755f("No users");
        } else {
            C3186br.m25161v(this.f22427e, this.f22424b, this.f22425c, (C3553mv) I1.get(0), this.f22426d, this.f22423a);
        }
    }

    /* renamed from: f */
    public final void mo15755f(String str) {
        this.f22423a.mo15755f(str);
    }
}
