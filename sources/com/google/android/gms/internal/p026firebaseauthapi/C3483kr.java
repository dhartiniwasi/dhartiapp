package com.google.android.gms.internal.p026firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.C7842q0;
import com.google.firebase.auth.C7869z;
import p033d5.C4141r;
import p218e6.C9977j;
import p293m7.C11823g1;
import p293m7.C11841m1;
import p293m7.C11861v0;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.kr */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3483kr extends C3848vt {

    /* renamed from: w */
    private final C3446jn f22306w;

    public C3483kr(C7842q0 q0Var, String str) {
        super(2);
        C4141r.m28221k(q0Var);
        C4141r.m28217g(str);
        this.f22306w = new C3446jn(q0Var.mo26180a(), str);
    }

    /* renamed from: a */
    public final void mo15756a(C9977j jVar, C3814us usVar) {
        this.f22842v = new C3815ut(this, jVar);
        usVar.mo16907p(this.f22306w, this.f22822b);
    }

    /* renamed from: b */
    public final void mo15757b() {
        C11841m1 o = C3682qs.m26612o(this.f22823c, this.f22830j);
        C7869z zVar = this.f22824d;
        if (zVar == null || zVar.mo26209b().equalsIgnoreCase(o.mo26209b())) {
            ((C11861v0) this.f22825e).mo26070a(this.f22829i, o);
            mo16970l(new C11823g1(o));
            return;
        }
        mo16969k(new Status(17024));
    }

    public final String zza() {
        return "finalizeMfaSignIn";
    }
}
