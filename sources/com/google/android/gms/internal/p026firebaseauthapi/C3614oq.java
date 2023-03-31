package com.google.android.gms.internal.p026firebaseauthapi;

import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.oq */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3614oq implements C3156au {

    /* renamed from: a */
    final /* synthetic */ C3156au f22476a;

    /* renamed from: b */
    final /* synthetic */ C3784tv f22477b;

    /* renamed from: c */
    final /* synthetic */ C3647pq f22478c;

    C3614oq(C3647pq pqVar, C3156au auVar, C3784tv tvVar) {
        this.f22478c = pqVar;
        this.f22476a = auVar;
        this.f22477b = tvVar;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo15754c(Object obj) {
        List I1 = ((C3487kv) obj).mo16271I1();
        if (I1 == null || I1.isEmpty()) {
            this.f22476a.mo15755f("No users");
        } else {
            this.f22478c.f22521a.mo16828i(this.f22477b, (C3553mv) I1.get(0));
        }
    }

    /* renamed from: f */
    public final void mo15755f(String str) {
        this.f22476a.mo15755f(str);
    }
}
