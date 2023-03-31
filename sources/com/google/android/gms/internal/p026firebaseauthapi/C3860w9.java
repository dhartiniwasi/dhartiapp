package com.google.android.gms.internal.p026firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.w9 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3860w9 {
    /* renamed from: a */
    public static void m27274a(C3671qh qhVar) throws GeneralSecurityException {
        C3675ql.m26593l(m27276c(qhVar.mo16600D().mo17116E()));
        m27275b(qhVar.mo16600D().mo17117F());
        if (qhVar.mo16601G() != 2) {
            C3265e7.m25472c(qhVar.mo16602z().mo16220C());
            return;
        }
        throw new GeneralSecurityException("unknown EC point format");
    }

    /* renamed from: b */
    public static String m27275b(int i) throws NoSuchAlgorithmException {
        int i2 = i - 2;
        if (i2 == 1) {
            return "HmacSha1";
        }
        if (i2 == 2) {
            return "HmacSha384";
        }
        if (i2 == 3) {
            return "HmacSha256";
        }
        if (i2 == 4) {
            return "HmacSha512";
        }
        if (i2 == 5) {
            return "HmacSha224";
        }
        throw new NoSuchAlgorithmException("hash unsupported for HMAC: ".concat(Integer.toString(C3342gi.m25670a(i))));
    }

    /* renamed from: c */
    public static int m27276c(int i) throws GeneralSecurityException {
        int i2 = i - 2;
        if (i2 == 2) {
            return 1;
        }
        if (i2 == 3) {
            return 2;
        }
        if (i2 == 4) {
            return 3;
        }
        throw new GeneralSecurityException("unknown curve type: ".concat(Integer.toString(C3177bi.m25124a(i))));
    }

    /* renamed from: d */
    public static int m27277d(int i) throws GeneralSecurityException {
        int i2 = i - 2;
        int i3 = 1;
        if (i2 != 1) {
            i3 = 2;
            if (i2 != 2) {
                if (i2 == 3) {
                    return 3;
                }
                throw new GeneralSecurityException("unknown point format: ".concat(Integer.toString(C3341gh.m25669a(i))));
            }
        }
        return i3;
    }
}
