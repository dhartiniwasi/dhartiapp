package p179z3;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.pm0;
import p060h4.C4493d4;
import p060h4.C4527j2;

/* renamed from: z3.x */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class C6355x {

    /* renamed from: a */
    private final Object f30563a = new Object();

    /* renamed from: b */
    private C4527j2 f30564b;

    /* renamed from: c */
    private C6356a f30565c;

    /* renamed from: z3.x$a */
    /* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
    public static abstract class C6356a {
        /* renamed from: a */
        public void mo11482a() {
        }

        /* renamed from: b */
        public void mo21738b(boolean z) {
        }

        /* renamed from: c */
        public void mo11483c() {
        }

        /* renamed from: d */
        public void mo21739d() {
        }

        /* renamed from: e */
        public void mo11484e() {
        }
    }

    /* renamed from: a */
    public void mo21735a(C6356a aVar) {
        C4493d4 d4Var;
        synchronized (this.f30563a) {
            this.f30565c = aVar;
            C4527j2 j2Var = this.f30564b;
            if (j2Var != null) {
                if (aVar == null) {
                    d4Var = null;
                } else {
                    try {
                        d4Var = new C4493d4(aVar);
                    } catch (RemoteException e) {
                        pm0.m18665e("Unable to call setVideoLifecycleCallbacks on video controller.", e);
                        return;
                    }
                }
                j2Var.mo10794l1(d4Var);
            }
        }
    }

    /* renamed from: b */
    public final C4527j2 mo21736b() {
        C4527j2 j2Var;
        synchronized (this.f30563a) {
            j2Var = this.f30564b;
        }
        return j2Var;
    }

    /* renamed from: c */
    public final void mo21737c(C4527j2 j2Var) {
        synchronized (this.f30563a) {
            this.f30564b = j2Var;
            C6356a aVar = this.f30565c;
            if (aVar != null) {
                mo21735a(aVar);
            }
        }
    }
}
