package com.google.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;

/* renamed from: com.google.firebase.auth.x1 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C7864x1 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ FirebaseAuth f34219a;

    C7864x1(FirebaseAuth firebaseAuth) {
        this.f34219a = firebaseAuth;
    }

    public final void run() {
        for (FirebaseAuth.C7775a a : this.f34219a.f34082d) {
            a.mo26047a(this.f34219a);
        }
    }
}
