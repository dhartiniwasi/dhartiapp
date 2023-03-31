package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class nk3 {
    /* renamed from: a */
    public static void m17162a(sq3 sq3) throws GeneralSecurityException {
        qu3.m19367k(m17164c(sq3.mo14121K().mo8923L()));
        m17163b(sq3.mo14121K().mo8924M());
        if (sq3.mo14122N() != 2) {
            xh3.m23218c(sq3.mo14120G().mo12413J());
            return;
        }
        throw new GeneralSecurityException("unknown EC point format");
    }

    /* renamed from: b */
    public static String m17163b(int i) throws NoSuchAlgorithmException {
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
        throw new NoSuchAlgorithmException("hash unsupported for HMAC: ".concat(Integer.toString(fr3.m12808a(i))));
    }

    /* renamed from: c */
    public static int m17164c(int i) throws GeneralSecurityException {
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
        throw new GeneralSecurityException("unknown curve type: ".concat(Integer.toString(dr3.m11647a(i))));
    }

    /* renamed from: d */
    public static int m17165d(int i) throws GeneralSecurityException {
        int i2 = i - 2;
        int i3 = 1;
        if (i2 != 1) {
            i3 = 2;
            if (i2 != 2) {
                if (i2 == 3) {
                    return 3;
                }
                throw new GeneralSecurityException("unknown point format: ".concat(Integer.toString(jq3.m15017a(i))));
            }
        }
        return i3;
    }
}
