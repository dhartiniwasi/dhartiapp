package com.google.android.gms.internal.p026firebaseauthapi;

import java.util.List;
import p033d5.C4141r;
import p218e6.C9977j;
import p293m7.C11839m;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.ir */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3417ir extends C3848vt {

    /* renamed from: w */
    private final C3578nn f22173w;

    public C3417ir(String str, String str2) {
        super(3);
        C4141r.m28218h(str, "email cannot be null or empty");
        this.f22173w = new C3578nn(str, str2);
    }

    /* renamed from: a */
    public final void mo15756a(C9977j jVar, C3814us usVar) {
        this.f22842v = new C3815ut(this, jVar);
        usVar.mo16909r(this.f22173w, this.f22822b);
    }

    /* renamed from: b */
    public final void mo15757b() {
        List list;
        if (this.f22831k.mo17090I1() == null) {
            list = C3626p5.m26448k();
        } else {
            list = (List) C4141r.m28221k(this.f22831k.mo17090I1());
        }
        mo16970l(new C11839m(list));
    }

    public final String zza() {
        return "fetchSignInMethodsForEmail";
    }
}
