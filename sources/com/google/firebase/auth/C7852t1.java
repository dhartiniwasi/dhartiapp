package com.google.firebase.auth;

import com.google.android.gms.common.api.Status;
import p293m7.C11850q;

/* renamed from: com.google.firebase.auth.t1 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C7852t1 implements C11850q {

    /* renamed from: a */
    final /* synthetic */ C7869z f34205a;

    /* renamed from: b */
    final /* synthetic */ FirebaseAuth f34206b;

    C7852t1(FirebaseAuth firebaseAuth, C7869z zVar) {
        this.f34206b = firebaseAuth;
        this.f34205a = zVar;
    }

    /* renamed from: b */
    public final void mo26091b(Status status) {
        if (status.mo7950J1() == 17011 || status.mo7950J1() == 17021 || status.mo7950J1() == 17005) {
            this.f34206b.mo25992C();
        }
    }

    public final void zza() {
        FirebaseAuth firebaseAuth = this.f34206b;
        if (firebaseAuth.f34084f != null && firebaseAuth.f34084f.mo26209b().equalsIgnoreCase(this.f34205a.mo26209b())) {
            this.f34206b.mo25997K();
        }
    }
}
