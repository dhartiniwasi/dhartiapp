package com.google.android.gms.internal.p026firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.n6 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3561n6 {

    /* renamed from: a */
    private final C3805uj f22412a;

    private C3561n6(C3805uj ujVar) {
        this.f22412a = ujVar;
    }

    /* renamed from: e */
    public static C3561n6 m26282e() {
        return new C3561n6(C3902xj.m27381B());
    }

    /* renamed from: f */
    public static C3561n6 m26283f(C3528m6 m6Var) {
        return new C3561n6((C3805uj) m6Var.mo16378c().mo16212t());
    }

    /* renamed from: g */
    private final synchronized int m26284g() {
        int a;
        a = C3798uc.m27129a();
        while (m26287j(a)) {
            a = C3798uc.m27129a();
        }
        return a;
    }

    /* renamed from: h */
    private final synchronized C3870wj m26285h(C3442jj jjVar, C3674qk qkVar) throws GeneralSecurityException {
        C3838vj B;
        int g = m26284g();
        if (qkVar != C3674qk.UNKNOWN_PREFIX) {
            B = C3870wj.m27305B();
            B.mo16954j(jjVar);
            B.mo16955k(g);
            B.mo16957m(3);
            B.mo16956l(qkVar);
        } else {
            throw new GeneralSecurityException("unknown output prefix type");
        }
        return (C3870wj) B.mo16062e();
    }

    /* renamed from: i */
    private final synchronized C3870wj m26286i(C3607oj ojVar) throws GeneralSecurityException {
        return m26285h(C3265e7.m25472c(ojVar), ojVar.mo16510C());
    }

    /* renamed from: j */
    private final synchronized boolean m26287j(int i) {
        boolean z;
        Iterator it = this.f22412a.mo16883n().iterator();
        while (true) {
            if (it.hasNext()) {
                if (((C3870wj) it.next()).mo17001z() == i) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        return z;
    }

    @Deprecated
    /* renamed from: a */
    public final synchronized int mo16454a(C3607oj ojVar, boolean z) throws GeneralSecurityException {
        C3870wj i;
        i = m26286i(ojVar);
        this.f22412a.mo16880k(i);
        return i.mo17001z();
    }

    /* renamed from: b */
    public final synchronized C3528m6 mo16455b() throws GeneralSecurityException {
        return C3528m6.m26151a((C3902xj) this.f22412a.mo16062e());
    }

    /* renamed from: c */
    public final synchronized C3561n6 mo16456c(C3462k6 k6Var) throws GeneralSecurityException {
        mo16454a(k6Var.mo16253a(), false);
        return this;
    }

    /* renamed from: d */
    public final synchronized C3561n6 mo16457d(int i) throws GeneralSecurityException {
        int i2 = 0;
        while (i2 < this.f22412a.mo16879j()) {
            C3870wj m = this.f22412a.mo16882m(i2);
            if (m.mo17001z() != i) {
                i2++;
            } else if (m.mo17000J() == 3) {
                this.f22412a.mo16881l(i);
            } else {
                throw new GeneralSecurityException("cannot set key as primary because it's not enabled: " + i);
            }
        }
        throw new GeneralSecurityException("key not found: " + i);
        return this;
    }
}
