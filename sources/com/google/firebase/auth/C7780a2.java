package com.google.firebase.auth;

import android.util.Log;
import com.google.firebase.auth.C7837p0;
import p033d5.C4141r;
import p218e6.C9965d;
import p218e6.C9975i;
import p293m7.C11830j;
import p293m7.C11857t0;

/* renamed from: com.google.firebase.auth.a2 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C7780a2 implements C9965d {

    /* renamed from: a */
    final /* synthetic */ C7833o0 f34099a;

    /* renamed from: b */
    final /* synthetic */ FirebaseAuth f34100b;

    C7780a2(FirebaseAuth firebaseAuth, C7833o0 o0Var) {
        this.f34100b = firebaseAuth;
        this.f34099a = o0Var;
    }

    /* renamed from: a */
    public final void mo283a(C9975i iVar) {
        String str;
        String str2;
        if (!iVar.mo26362q()) {
            String str3 = "Error while validating application identity: ";
            if (iVar.mo26357l() != null) {
                str3 = str3.concat(String.valueOf(iVar.mo26357l().getMessage()));
            }
            Log.e("FirebaseAuth", str3);
            Log.e("FirebaseAuth", "Proceeding without any application identifier.");
            str2 = null;
            str = null;
        } else {
            String b = ((C11857t0) iVar.mo26358m()).mo36109b();
            str = ((C11857t0) iVar.mo26358m()).mo36108a();
            str2 = b;
        }
        long longValue = this.f34099a.mo26162g().longValue();
        C7837p0.C7839b m0 = this.f34100b.m43239S(this.f34099a.mo26163h(), this.f34099a.mo26160e());
        C11830j jVar = (C11830j) C4141r.m28221k(this.f34099a.mo26158c());
        if (jVar.mo36061M1()) {
            this.f34100b.f34083e.mo16631e(jVar, (String) C4141r.m28221k(this.f34099a.mo26163h()), this.f34100b.f34087i, longValue, this.f34099a.mo26159d() != null, this.f34099a.mo26165j(), str2, str, this.f34100b.mo26001R(), m0, this.f34099a.mo26164i(), this.f34099a.mo26156a());
        } else {
            this.f34100b.f34083e.mo16632f(jVar, (C7848s0) C4141r.m28221k(this.f34099a.mo26161f()), this.f34100b.f34087i, longValue, this.f34099a.mo26159d() != null, this.f34099a.mo26165j(), str2, str, this.f34100b.mo26001R(), m0, this.f34099a.mo26164i(), this.f34099a.mo26156a());
        }
    }
}
