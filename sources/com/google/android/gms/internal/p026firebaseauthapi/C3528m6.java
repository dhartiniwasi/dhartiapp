package com.google.android.gms.internal.p026firebaseauthapi;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.m6 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3528m6 {

    /* renamed from: a */
    private final C3902xj f22350a;

    /* renamed from: b */
    private final C3635pe f22351b = C3635pe.f22506b;

    private C3528m6(C3902xj xjVar) {
        this.f22350a = xjVar;
    }

    /* renamed from: a */
    static final C3528m6 m26151a(C3902xj xjVar) throws GeneralSecurityException {
        m26153i(xjVar);
        return new C3528m6(xjVar);
    }

    /* renamed from: h */
    public static final C3528m6 m26152h(C3957za zaVar, C3758t5 t5Var) throws GeneralSecurityException, IOException {
        byte[] bArr = new byte[0];
        C3276ei a = zaVar.mo17100a();
        if (a == null || a.mo15988C().mo15875f() == 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        try {
            C3902xj E = C3902xj.m27383E(t5Var.mo15791a(a.mo15988C().mo16051A(), bArr), C3852w1.m27266a());
            m26153i(E);
            return new C3528m6(E);
        } catch (C3689r2 unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    /* renamed from: i */
    private static void m26153i(C3902xj xjVar) throws GeneralSecurityException {
        if (xjVar == null || xjVar.mo17051z() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    /* renamed from: b */
    public final C3528m6 mo16377b() throws GeneralSecurityException {
        if (this.f22350a != null) {
            C3805uj B = C3902xj.m27381B();
            for (C3870wj wjVar : this.f22350a.mo17050F()) {
                C3442jj A = wjVar.mo16997A();
                if (A.mo16224A() == C3409ij.ASYMMETRIC_PRIVATE) {
                    String E = A.mo16226E();
                    C3325g1 D = A.mo16225D();
                    C3165b6 a = C3265e7.m25470a(E);
                    if (a instanceof C3166b7) {
                        C3442jj c = ((C3166b7) a).mo15785c(D);
                        C3265e7.m25475f(c);
                        C3838vj vjVar = (C3838vj) wjVar.mo16212t();
                        vjVar.mo16954j(c);
                        B.mo16880k((C3870wj) vjVar.mo16062e());
                    } else {
                        throw new GeneralSecurityException("manager for key type " + E + " is not a PrivateKeyManager");
                    }
                } else {
                    throw new GeneralSecurityException("The keyset contains a non-private key");
                }
            }
            B.mo16881l(this.f22350a.mo17048A());
            return new C3528m6((C3902xj) B.mo16062e());
        }
        throw new GeneralSecurityException("cleartext keyset is not available");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final C3902xj mo16378c() {
        return this.f22350a;
    }

    /* renamed from: d */
    public final C3212ck mo16379d() {
        return C3364h7.m25696a(this.f22350a);
    }

    /* renamed from: e */
    public final Object mo16380e(Class cls) throws GeneralSecurityException {
        Class e = C3265e7.m25474e(cls);
        if (e != null) {
            C3364h7.m25697b(this.f22350a);
            C3792u6 u6Var = new C3792u6(e, (C3759t6) null);
            u6Var.mo16864c(this.f22351b);
            for (C3870wj wjVar : this.f22350a.mo17050F()) {
                if (wjVar.mo17000J() == 3) {
                    Object g = C3265e7.m25476g(wjVar.mo16997A(), e);
                    if (wjVar.mo17001z() == this.f22350a.mo17048A()) {
                        u6Var.mo16862a(g, wjVar);
                    } else {
                        u6Var.mo16863b(g, wjVar);
                    }
                }
            }
            return C3265e7.m25480k(u6Var.mo16865d(), cls);
        }
        throw new GeneralSecurityException("No wrapper found for ".concat(cls.getName()));
    }

    /* renamed from: f */
    public final void mo16381f(C3594o6 o6Var, C3758t5 t5Var) throws GeneralSecurityException, IOException {
        byte[] bArr = new byte[0];
        C3902xj xjVar = this.f22350a;
        byte[] b = t5Var.mo15792b(xjVar.mo16478h(), bArr);
        try {
            if (C3902xj.m27383E(t5Var.mo15791a(b, bArr), C3852w1.m27266a()).equals(xjVar)) {
                C3243di z = C3276ei.m25508z();
                z.mo15956j(C3325g1.m25613u(b));
                z.mo15957k(C3364h7.m25696a(xjVar));
                o6Var.mo15730a((C3276ei) z.mo16062e());
                return;
            }
            throw new GeneralSecurityException("cannot encrypt keyset");
        } catch (C3689r2 unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x0010  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo16382g(com.google.android.gms.internal.p026firebaseauthapi.C3594o6 r5) throws java.security.GeneralSecurityException, java.io.IOException {
        /*
            r4 = this;
            com.google.android.gms.internal.firebase-auth-api.xj r0 = r4.f22350a
            java.util.List r0 = r0.mo17050F()
            java.util.Iterator r0 = r0.iterator()
        L_0x000a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0064
            java.lang.Object r1 = r0.next()
            com.google.android.gms.internal.firebase-auth-api.wj r1 = (com.google.android.gms.internal.p026firebaseauthapi.C3870wj) r1
            com.google.android.gms.internal.firebase-auth-api.jj r2 = r1.mo16997A()
            com.google.android.gms.internal.firebase-auth-api.ij r2 = r2.mo16224A()
            com.google.android.gms.internal.firebase-auth-api.ij r3 = com.google.android.gms.internal.p026firebaseauthapi.C3409ij.UNKNOWN_KEYMATERIAL
            if (r2 == r3) goto L_0x003b
            com.google.android.gms.internal.firebase-auth-api.jj r2 = r1.mo16997A()
            com.google.android.gms.internal.firebase-auth-api.ij r2 = r2.mo16224A()
            com.google.android.gms.internal.firebase-auth-api.ij r3 = com.google.android.gms.internal.p026firebaseauthapi.C3409ij.SYMMETRIC
            if (r2 == r3) goto L_0x003b
            com.google.android.gms.internal.firebase-auth-api.jj r2 = r1.mo16997A()
            com.google.android.gms.internal.firebase-auth-api.ij r2 = r2.mo16224A()
            com.google.android.gms.internal.firebase-auth-api.ij r3 = com.google.android.gms.internal.p026firebaseauthapi.C3409ij.ASYMMETRIC_PRIVATE
            if (r2 == r3) goto L_0x003b
            goto L_0x000a
        L_0x003b:
            java.security.GeneralSecurityException r5 = new java.security.GeneralSecurityException
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r2 = 0
            com.google.android.gms.internal.firebase-auth-api.jj r3 = r1.mo16997A()
            com.google.android.gms.internal.firebase-auth-api.ij r3 = r3.mo16224A()
            java.lang.String r3 = r3.name()
            r0[r2] = r3
            r2 = 1
            com.google.android.gms.internal.firebase-auth-api.jj r1 = r1.mo16997A()
            java.lang.String r1 = r1.mo16226E()
            r0[r2] = r1
            java.lang.String r1 = "keyset contains key material of type %s for type url %s"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r5.<init>(r0)
            throw r5
        L_0x0064:
            com.google.android.gms.internal.firebase-auth-api.xj r0 = r4.f22350a
            r5.mo15731b(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p026firebaseauthapi.C3528m6.mo16382g(com.google.android.gms.internal.firebase-auth-api.o6):void");
    }

    public final String toString() {
        return C3364h7.m25696a(this.f22350a).toString();
    }
}
