package com.google.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;
import p293m7.C11803a;
import p330q8.C12193b;

/* renamed from: com.google.firebase.auth.w1 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C7861w1 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ FirebaseAuth f34216a;

    /* renamed from: b */
    final /* synthetic */ C12193b f34217b;

    C7861w1(FirebaseAuth firebaseAuth, C12193b bVar) {
        this.f34216a = firebaseAuth;
        this.f34217b = bVar;
    }

    public final void run() {
        for (C11803a a : this.f34216a.f34081c) {
            a.mo36031a(this.f34217b);
        }
        for (FirebaseAuth.C7776b a2 : this.f34216a.f34080b) {
            a2.mo26048a(this.f34216a);
        }
    }
}
