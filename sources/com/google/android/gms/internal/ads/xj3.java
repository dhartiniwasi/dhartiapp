package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class xj3 extends ul3 {
    xj3() {
        super(xp3.class, new vj3(og3.class));
    }

    /* renamed from: a */
    public final tl3 mo9607a() {
        return new wj3(this, aq3.class);
    }

    /* renamed from: b */
    public final /* synthetic */ cz3 mo9608b(jw3 jw3) throws ey3 {
        return xp3.m23495J(jw3, ex3.m12308a());
    }

    /* renamed from: c */
    public final String mo9609c() {
        return "type.googleapis.com/google.crypto.tink.AesSivKey";
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo9610d(cz3 cz3) throws GeneralSecurityException {
        xp3 xp3 = (xp3) cz3;
        lv3.m16239b(xp3.mo15221G(), 0);
        if (xp3.mo15222K().mo9361q() != 64) {
            int q = xp3.mo15222K().mo9361q();
            throw new InvalidKeyException("invalid key size: " + q + ". Valid keys must have 64 bytes.");
        }
    }

    /* renamed from: f */
    public final int mo9611f() {
        return 3;
    }
}
