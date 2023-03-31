package com.google.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;

/* renamed from: com.google.firebase.auth.u1 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C7855u1 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ FirebaseAuth.C7776b f34207a;

    /* renamed from: b */
    final /* synthetic */ FirebaseAuth f34208b;

    C7855u1(FirebaseAuth firebaseAuth, FirebaseAuth.C7776b bVar) {
        this.f34208b = firebaseAuth;
        this.f34207a = bVar;
    }

    public final void run() {
        this.f34207a.mo26048a(this.f34208b);
    }
}
