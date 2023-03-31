package com.google.android.gms.internal.p026firebaseauthapi;

import java.util.List;
import p293m7.C11836l;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.eq */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3284eq implements C3156au {

    /* renamed from: a */
    final /* synthetic */ C3156au f22001a;

    /* renamed from: b */
    final /* synthetic */ C3784tv f22002b;

    /* renamed from: c */
    final /* synthetic */ C3317fq f22003c;

    C3284eq(C3317fq fqVar, C3156au auVar, C3784tv tvVar) {
        this.f22003c = fqVar;
        this.f22001a = auVar;
        this.f22002b = tvVar;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo15754c(Object obj) {
        List I1 = ((C3487kv) obj).mo16271I1();
        if (I1 == null || I1.isEmpty()) {
            this.f22001a.mo15755f("No users.");
            return;
        }
        C3653q qVar = new C3653q();
        qVar.mo16576d(this.f22002b.mo16834J1());
        qVar.mo16573a(this.f22003c.f22040a);
        C3317fq fqVar = this.f22003c;
        C3186br.m25161v(fqVar.f22042c, fqVar.f22041b, this.f22002b, (C3553mv) I1.get(0), qVar, this.f22001a);
    }

    /* renamed from: f */
    public final void mo15755f(String str) {
        this.f22003c.f22041b.mo16404h(C11836l.m57255a(str));
    }
}
