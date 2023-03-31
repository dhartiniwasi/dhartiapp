package com.google.android.gms.internal.p026firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.C7806h;
import com.google.firebase.auth.FirebaseAuth;
import p033d5.C4141r;
import p218e6.C9977j;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.ut */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3815ut {

    /* renamed from: a */
    private final C3848vt f22791a;

    /* renamed from: b */
    private final C9977j f22792b;

    public C3815ut(C3848vt vtVar, C9977j jVar) {
        this.f22791a = vtVar;
        this.f22792b = jVar;
    }

    /* renamed from: a */
    public final void mo16918a(Object obj, Status status) {
        C4141r.m28222l(this.f22792b, "completion source cannot be null");
        if (status != null) {
            C3848vt vtVar = this.f22791a;
            if (vtVar.f22838r != null) {
                C9977j jVar = this.f22792b;
                FirebaseAuth instance = FirebaseAuth.getInstance(vtVar.f22823c);
                C3848vt vtVar2 = this.f22791a;
                jVar.mo32543b(C3847vs.m27247c(instance, vtVar2.f22838r, ("reauthenticateWithCredential".equals(vtVar2.zza()) || "reauthenticateWithCredentialWithData".equals(this.f22791a.zza())) ? this.f22791a.f22824d : null));
                return;
            }
            C7806h hVar = vtVar.f22835o;
            if (hVar != null) {
                this.f22792b.mo32543b(C3847vs.m27246b(status, hVar, vtVar.f22836p, vtVar.f22837q));
            } else {
                this.f22792b.mo32543b(C3847vs.m27245a(status));
            }
        } else {
            this.f22792b.mo32544c(obj);
        }
    }
}
