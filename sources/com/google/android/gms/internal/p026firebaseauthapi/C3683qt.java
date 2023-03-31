package com.google.android.gms.internal.p026firebaseauthapi;

import com.google.firebase.auth.C7837p0;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.qt */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3683qt implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C3749st f22580a;

    /* renamed from: b */
    final /* synthetic */ C3716rt f22581b;

    C3683qt(C3716rt rtVar, C3749st stVar) {
        this.f22581b = rtVar;
        this.f22580a = stVar;
    }

    public final void run() {
        synchronized (this.f22581b.f22640a.f22827g) {
            if (!this.f22581b.f22640a.f22827g.isEmpty()) {
                this.f22580a.mo16402a((C7837p0.C7839b) this.f22581b.f22640a.f22827g.get(0), new Object[0]);
            }
        }
    }
}
