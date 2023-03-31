package com.google.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;

/* renamed from: com.google.firebase.auth.v1 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C7858v1 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ FirebaseAuth.C7775a f34211a;

    /* renamed from: b */
    final /* synthetic */ FirebaseAuth f34212b;

    C7858v1(FirebaseAuth firebaseAuth, FirebaseAuth.C7775a aVar) {
        this.f34212b = firebaseAuth;
        this.f34211a = aVar;
    }

    public final void run() {
        this.f34211a.mo26047a(this.f34212b);
    }
}
