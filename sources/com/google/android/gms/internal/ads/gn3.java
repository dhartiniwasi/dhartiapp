package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class gn3 extends jm3 {
    gn3(Class cls) {
        super(cls);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo8432a(cz3 cz3) throws GeneralSecurityException {
        jr3 jr3 = (jr3) cz3;
        int L = jr3.mo11486L().mo13352L();
        SecretKeySpec secretKeySpec = new SecretKeySpec(jr3.mo11487M().mo11531j(), "HMAC");
        int G = jr3.mo11486L().mo13351G();
        int i = L - 2;
        if (i == 1) {
            return new hv3(new gv3("HMACSHA1", secretKeySpec), G);
        }
        if (i == 2) {
            return new hv3(new gv3("HMACSHA384", secretKeySpec), G);
        }
        if (i == 3) {
            return new hv3(new gv3("HMACSHA256", secretKeySpec), G);
        }
        if (i == 4) {
            return new hv3(new gv3("HMACSHA512", secretKeySpec), G);
        }
        if (i == 5) {
            return new hv3(new gv3("HMACSHA224", secretKeySpec), G);
        }
        throw new GeneralSecurityException("unknown hash");
    }
}
