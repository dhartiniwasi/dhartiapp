package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class uk3 implements pg3 {

    /* renamed from: a */
    private final yk3 f18591a;

    /* renamed from: b */
    private final wk3 f18592b;

    /* renamed from: c */
    private final sk3 f18593c;

    /* renamed from: d */
    private final rk3 f18594d;

    private uk3(yk3 yk3, wk3 wk3, rk3 rk3, sk3 sk3, int i, byte[] bArr) {
        this.f18591a = yk3;
        this.f18592b = wk3;
        this.f18594d = rk3;
        this.f18593c = sk3;
    }

    /* renamed from: a */
    static uk3 m21688a(as3 as3) throws GeneralSecurityException {
        yk3 yk3;
        if (!as3.mo8527P()) {
            throw new IllegalArgumentException("HpkePrivateKey is missing public_key field.");
        } else if (!as3.mo8525K().mo9688Q()) {
            throw new IllegalArgumentException("HpkePrivateKey.public_key is missing params field.");
        } else if (!as3.mo8526L().mo11529i()) {
            xr3 H = as3.mo8525K().mo9686H();
            wk3 b = zk3.m24647b(H);
            rk3 c = zk3.m24648c(H);
            sk3 a = zk3.m24646a(H);
            int L = H.mo15236L();
            int i = 1;
            if (L - 2 == 1) {
                int L2 = as3.mo8525K().mo9686H().mo15236L() - 2;
                if (L2 == 1) {
                    yk3 = kl3.m15457a(as3.mo8526L().mo11531j());
                } else if (L2 == 2 || L2 == 3 || L2 == 4) {
                    byte[] j = as3.mo8526L().mo11531j();
                    byte[] j2 = as3.mo8525K().mo9687M().mo11531j();
                    int L3 = as3.mo8525K().mo9686H().mo15236L() - 2;
                    if (L3 != 2) {
                        if (L3 == 3) {
                            i = 2;
                        } else if (L3 == 4) {
                            i = 3;
                        } else {
                            throw new GeneralSecurityException("Unrecognized NIST HPKE KEM identifier");
                        }
                    }
                    yk3 = il3.m14393a(j, j2, i);
                } else {
                    throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
                }
                return new uk3(yk3, b, c, a, 32, (byte[]) null);
            }
            throw new IllegalArgumentException("Unable to determine KEM-encoding length for ".concat(rr3.m20011a(L)));
        } else {
            throw new IllegalArgumentException("HpkePrivateKey.private_key is empty.");
        }
    }
}
