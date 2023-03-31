package com.google.firebase.auth;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p026firebaseauthapi.C3784tv;
import p033d5.C4141r;
import p293m7.C11846o0;

/* renamed from: com.google.firebase.auth.e2 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C7797e2 implements C11846o0 {

    /* renamed from: a */
    final /* synthetic */ FirebaseAuth f34127a;

    C7797e2(FirebaseAuth firebaseAuth) {
        this.f34127a = firebaseAuth;
    }

    /* renamed from: a */
    public final void mo26070a(C3784tv tvVar, C7869z zVar) {
        C4141r.m28221k(tvVar);
        C4141r.m28221k(zVar);
        zVar.mo26251k2(tvVar);
        FirebaseAuth.m43238O(this.f34127a, zVar, tvVar, true, true);
    }

    /* renamed from: b */
    public final void mo26091b(Status status) {
        if (status.mo7950J1() == 17011 || status.mo7950J1() == 17021 || status.mo7950J1() == 17005 || status.mo7950J1() == 17091) {
            this.f34127a.mo25992C();
        }
    }
}
