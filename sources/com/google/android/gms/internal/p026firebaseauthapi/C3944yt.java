package com.google.android.gms.internal.p026firebaseauthapi;

import java.util.concurrent.ExecutorService;
import p218e6.C9975i;
import p218e6.C9977j;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.yt */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public class C3944yt {

    /* renamed from: a */
    C3814us f22966a;

    /* renamed from: b */
    ExecutorService f22967b;

    /* renamed from: a */
    public final C9975i mo17089a(C3912xt xtVar) {
        C9977j jVar = new C9977j();
        this.f22967b.execute(new C3880wt(this, xtVar, jVar));
        return jVar.mo32542a();
    }
}
