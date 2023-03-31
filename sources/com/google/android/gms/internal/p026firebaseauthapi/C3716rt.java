package com.google.android.gms.internal.p026firebaseauthapi;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.C7806h;
import com.google.firebase.auth.C7830n0;
import p033d5.C4141r;
import p293m7.C11836l;
import p293m7.C11852r;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.rt */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3716rt implements C3715rs {

    /* renamed from: a */
    final /* synthetic */ C3848vt f22640a;

    C3716rt(C3848vt vtVar) {
        this.f22640a = vtVar;
    }

    /* renamed from: m */
    private final void m26799m(C3749st stVar) {
        this.f22640a.f22828h.execute(new C3683qt(this, stVar));
    }

    /* renamed from: n */
    private final void m26800n(Status status, C7806h hVar, String str, String str2) {
        C3848vt.m27253j(this.f22640a, status);
        C3848vt vtVar = this.f22640a;
        vtVar.f22835o = hVar;
        vtVar.f22836p = str;
        vtVar.f22837q = str2;
        C11852r rVar = vtVar.f22826f;
        if (rVar != null) {
            rVar.mo26091b(status);
        }
        this.f22640a.mo16969k(status);
    }

    /* renamed from: E */
    public final void mo16678E(String str) throws RemoteException {
        int i = this.f22640a.f22821a;
        boolean z = i == 7;
        C4141r.m28225o(z, "Unexpected response type " + i);
        C3848vt vtVar = this.f22640a;
        vtVar.f22833m = str;
        C3848vt.m27252i(vtVar);
    }

    /* renamed from: X */
    public final void mo16679X() throws RemoteException {
        int i = this.f22640a.f22821a;
        boolean z = i == 6;
        C4141r.m28225o(z, "Unexpected response type " + i);
        C3848vt.m27252i(this.f22640a);
    }

    /* renamed from: a */
    public final void mo16680a(C3945yu yuVar) throws RemoteException {
        int i = this.f22640a.f22821a;
        boolean z = i == 3;
        C4141r.m28225o(z, "Unexpected response type " + i);
        C3848vt vtVar = this.f22640a;
        vtVar.f22831k = yuVar;
        C3848vt.m27252i(vtVar);
    }

    /* renamed from: b */
    public final void mo16681b() throws RemoteException {
        int i = this.f22640a.f22821a;
        boolean z = i == 5;
        C4141r.m28225o(z, "Unexpected response type " + i);
        C3848vt.m27252i(this.f22640a);
    }

    /* renamed from: c */
    public final void mo16682c(C3488l lVar) throws RemoteException {
        int i = this.f22640a.f22821a;
        boolean z = i == 4;
        C4141r.m28225o(z, "Unexpected response type " + i);
        C3848vt vtVar = this.f22640a;
        vtVar.f22832l = lVar;
        C3848vt.m27252i(vtVar);
    }

    /* renamed from: d */
    public final void mo16683d(C7830n0 n0Var) throws RemoteException {
        int i = this.f22640a.f22821a;
        boolean z = i == 8;
        C4141r.m28225o(z, "Unexpected response type " + i);
        this.f22640a.f22839s = true;
        m26799m(new C3584nt(this, n0Var));
    }

    /* renamed from: e */
    public final void mo16684e(C3784tv tvVar, C3553mv mvVar) throws RemoteException {
        int i = this.f22640a.f22821a;
        boolean z = i == 2;
        C4141r.m28225o(z, "Unexpected response type: " + i);
        C3848vt vtVar = this.f22640a;
        vtVar.f22829i = tvVar;
        vtVar.f22830j = mvVar;
        C3848vt.m27252i(vtVar);
    }

    /* renamed from: f */
    public final void mo16685f(String str) throws RemoteException {
        int i = this.f22640a.f22821a;
        boolean z = i == 8;
        C4141r.m28225o(z, "Unexpected response type " + i);
        C3848vt vtVar = this.f22640a;
        vtVar.f22834n = str;
        vtVar.f22839s = true;
        m26799m(new C3617ot(this, str));
    }

    /* renamed from: g */
    public final void mo16686g(Status status) throws RemoteException {
        String K1 = status.mo7951K1();
        if (K1 != null) {
            if (K1.contains("MISSING_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17081);
            } else if (K1.contains("MISSING_MFA_ENROLLMENT_ID")) {
                status = new Status(17082);
            } else if (K1.contains("INVALID_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17083);
            } else if (K1.contains("MFA_ENROLLMENT_NOT_FOUND")) {
                status = new Status(17084);
            } else if (K1.contains("ADMIN_ONLY_OPERATION")) {
                status = new Status(17085);
            } else if (K1.contains("UNVERIFIED_EMAIL")) {
                status = new Status(17086);
            } else if (K1.contains("SECOND_FACTOR_EXISTS")) {
                status = new Status(17087);
            } else if (K1.contains("SECOND_FACTOR_LIMIT_EXCEEDED")) {
                status = new Status(17088);
            } else if (K1.contains("UNSUPPORTED_FIRST_FACTOR")) {
                status = new Status(17089);
            } else if (K1.contains("EMAIL_CHANGE_NEEDS_VERIFICATION")) {
                status = new Status(17090);
            }
        }
        C3848vt vtVar = this.f22640a;
        if (vtVar.f22821a == 8) {
            vtVar.f22839s = true;
            m26799m(new C3650pt(this, status));
            return;
        }
        C3848vt.m27253j(vtVar, status);
        this.f22640a.mo16969k(status);
    }

    /* renamed from: h */
    public final void mo16687h(C3784tv tvVar) throws RemoteException {
        int i = this.f22640a.f22821a;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        C4141r.m28225o(z, "Unexpected response type: " + i);
        C3848vt vtVar = this.f22640a;
        vtVar.f22829i = tvVar;
        C3848vt.m27252i(vtVar);
    }

    /* renamed from: i */
    public final void mo16688i(String str) throws RemoteException {
        int i = this.f22640a.f22821a;
        boolean z = i == 8;
        C4141r.m28225o(z, "Unexpected response type " + i);
        this.f22640a.f22834n = str;
        m26799m(new C3551mt(this, str));
    }

    /* renamed from: j */
    public final void mo16689j(C3382hp hpVar) {
        C3848vt vtVar = this.f22640a;
        vtVar.f22838r = hpVar;
        vtVar.mo16969k(C11836l.m57255a("REQUIRES_SECOND_FACTOR_AUTH"));
    }

    /* renamed from: k */
    public final void mo16690k(Status status, C7830n0 n0Var) throws RemoteException {
        int i = this.f22640a.f22821a;
        boolean z = i == 2;
        C4141r.m28225o(z, "Unexpected response type " + i);
        m26800n(status, n0Var, (String) null, (String) null);
    }

    /* renamed from: l */
    public final void mo16691l(C3316fp fpVar) {
        m26800n(fpVar.mo16035I1(), fpVar.mo16036J1(), fpVar.mo16037K1(), fpVar.mo16038L1());
    }
}
