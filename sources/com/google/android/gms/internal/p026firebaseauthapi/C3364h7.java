package com.google.android.gms.internal.p026firebaseauthapi;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.h7 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3364h7 {

    /* renamed from: a */
    public static final Charset f22087a = Charset.forName("UTF-8");

    /* renamed from: a */
    public static C3212ck m25696a(C3902xj xjVar) {
        C3966zj z = C3212ck.m25340z();
        z.mo17119k(xjVar.mo17048A());
        for (C3870wj wjVar : xjVar.mo17050F()) {
            C3146ak A = C3179bk.m25136A();
            A.mo15743l(wjVar.mo16997A().mo16226E());
            A.mo15744m(wjVar.mo17000J());
            A.mo15742k(wjVar.mo16998D());
            A.mo15741j(wjVar.mo17001z());
            z.mo17118j((C3179bk) A.mo16062e());
        }
        return (C3212ck) z.mo16062e();
    }

    /* renamed from: b */
    public static void m25697b(C3902xj xjVar) throws GeneralSecurityException {
        int A = xjVar.mo17048A();
        int i = 0;
        boolean z = false;
        boolean z2 = true;
        for (C3870wj wjVar : xjVar.mo17050F()) {
            if (wjVar.mo17000J() == 3) {
                if (!wjVar.mo16999H()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", new Object[]{Integer.valueOf(wjVar.mo17001z())}));
                } else if (wjVar.mo16998D() == C3674qk.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", new Object[]{Integer.valueOf(wjVar.mo17001z())}));
                } else if (wjVar.mo17000J() != 2) {
                    if (wjVar.mo17001z() == A) {
                        if (!z) {
                            z = true;
                        } else {
                            throw new GeneralSecurityException("keyset contains multiple primary keys");
                        }
                    }
                    z2 &= wjVar.mo16997A().mo16224A() == C3409ij.ASYMMETRIC_PUBLIC;
                    i++;
                } else {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", new Object[]{Integer.valueOf(wjVar.mo17001z())}));
                }
            }
        }
        if (i == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        } else if (!z && !z2) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
    }
}
