package com.google.firebase.auth;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p026firebaseauthapi.C3784tv;
import p293m7.C11846o0;

/* renamed from: com.google.firebase.auth.y1 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C7868y1 implements C11846o0 {

    /* renamed from: a */
    final /* synthetic */ FirebaseAuth f34229a;

    C7868y1(FirebaseAuth firebaseAuth) {
        this.f34229a = firebaseAuth;
    }

    /* renamed from: a */
    public final void mo26070a(C3784tv tvVar, C7869z zVar) {
        FirebaseAuth.m43238O(this.f34229a, zVar, tvVar, true, true);
    }

    /* renamed from: b */
    public final void mo26091b(Status status) {
        int J1 = status.mo7950J1();
        if (J1 == 17011 || J1 == 17021 || J1 == 17005) {
            this.f34229a.mo25992C();
        }
    }
}
