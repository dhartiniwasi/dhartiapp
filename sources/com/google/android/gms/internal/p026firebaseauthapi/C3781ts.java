package com.google.android.gms.internal.p026firebaseauthapi;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.C7830n0;
import p033d5.C4141r;
import p054g5.C4410a;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.ts */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public class C3781ts {

    /* renamed from: a */
    private final C3715rs f22741a;

    /* renamed from: b */
    private final C4410a f22742b;

    public C3781ts(C3715rs rsVar, C4410a aVar) {
        this.f22741a = (C3715rs) C4141r.m28221k(rsVar);
        this.f22742b = (C4410a) C4141r.m28221k(aVar);
    }

    /* renamed from: a */
    public final void mo16822a(String str) {
        try {
            this.f22741a.mo16685f(str);
        } catch (RemoteException e) {
            this.f22742b.mo17929b("RemoteException when sending auto retrieval timeout response.", e, new Object[0]);
        }
    }

    /* renamed from: b */
    public void mo16403b(String str) {
        try {
            this.f22741a.mo16688i(str);
        } catch (RemoteException e) {
            this.f22742b.mo17929b("RemoteException when sending send verification code response.", e, new Object[0]);
        }
    }

    /* renamed from: c */
    public final void mo16823c(C3945yu yuVar) {
        try {
            this.f22741a.mo16680a(yuVar);
        } catch (RemoteException e) {
            this.f22742b.mo17929b("RemoteException when sending create auth uri response.", e, new Object[0]);
        }
    }

    /* renamed from: d */
    public final void mo16824d() {
        try {
            this.f22741a.mo16681b();
        } catch (RemoteException e) {
            this.f22742b.mo17929b("RemoteException when sending delete account response.", e, new Object[0]);
        }
    }

    /* renamed from: e */
    public final void mo16825e(C3316fp fpVar) {
        try {
            this.f22741a.mo16691l(fpVar);
        } catch (RemoteException e) {
            this.f22742b.mo17929b("RemoteException when sending failure result with credential", e, new Object[0]);
        }
    }

    /* renamed from: f */
    public final void mo16826f(C3382hp hpVar) {
        try {
            this.f22741a.mo16689j(hpVar);
        } catch (RemoteException e) {
            this.f22742b.mo17929b("RemoteException when sending failure result for mfa", e, new Object[0]);
        }
    }

    /* renamed from: g */
    public final void mo16827g(Status status, C7830n0 n0Var) {
        try {
            this.f22741a.mo16690k(status, n0Var);
        } catch (RemoteException e) {
            this.f22742b.mo17929b("RemoteException when sending failure result.", e, new Object[0]);
        }
    }

    /* renamed from: h */
    public void mo16404h(Status status) {
        try {
            this.f22741a.mo16686g(status);
        } catch (RemoteException e) {
            this.f22742b.mo17929b("RemoteException when sending failure result.", e, new Object[0]);
        }
    }

    /* renamed from: i */
    public final void mo16828i(C3784tv tvVar, C3553mv mvVar) {
        try {
            this.f22741a.mo16684e(tvVar, mvVar);
        } catch (RemoteException e) {
            this.f22742b.mo17929b("RemoteException when sending get token and account info user response", e, new Object[0]);
        }
    }

    /* renamed from: j */
    public final void mo16829j(C3488l lVar) {
        try {
            this.f22741a.mo16682c(lVar);
        } catch (RemoteException e) {
            this.f22742b.mo17929b("RemoteException when sending password reset response.", e, new Object[0]);
        }
    }

    /* renamed from: k */
    public final void mo16830k() {
        try {
            this.f22741a.mo16679X();
        } catch (RemoteException e) {
            this.f22742b.mo17929b("RemoteException when sending email verification response.", e, new Object[0]);
        }
    }

    /* renamed from: l */
    public final void mo16831l(String str) {
        try {
            this.f22741a.mo16678E(str);
        } catch (RemoteException e) {
            this.f22742b.mo17929b("RemoteException when sending set account info response.", e, new Object[0]);
        }
    }

    /* renamed from: m */
    public final void mo16832m(C3784tv tvVar) {
        try {
            this.f22741a.mo16687h(tvVar);
        } catch (RemoteException e) {
            this.f22742b.mo17929b("RemoteException when sending token result.", e, new Object[0]);
        }
    }

    /* renamed from: n */
    public final void mo16833n(C7830n0 n0Var) {
        try {
            this.f22741a.mo16683d(n0Var);
        } catch (RemoteException e) {
            this.f22742b.mo17929b("RemoteException when sending verification completed response.", e, new Object[0]);
        }
    }

    public C3781ts(C3781ts tsVar) {
        this(tsVar.f22741a, tsVar.f22742b);
    }
}
