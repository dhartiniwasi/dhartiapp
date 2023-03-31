package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class fl3 extends ul3 {
    public fl3() {
        super(ds3.class, new el3(qg3.class));
    }

    /* renamed from: b */
    public final /* synthetic */ cz3 mo9608b(jw3 jw3) throws ey3 {
        return ds3.m11654L(jw3, ex3.m12308a());
    }

    /* renamed from: c */
    public final String mo9609c() {
        return "type.googleapis.com/google.crypto.tink.HpkePublicKey";
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo9610d(cz3 cz3) throws GeneralSecurityException {
        ds3 ds3 = (ds3) cz3;
        lv3.m16239b(ds3.mo9685G(), 0);
        if (ds3.mo9688Q()) {
            gl3.m13379a(ds3.mo9686H());
            return;
        }
        throw new GeneralSecurityException("Missing HPKE key params.");
    }

    /* renamed from: f */
    public final int mo9611f() {
        return 5;
    }
}
