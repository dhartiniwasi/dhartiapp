package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class vi3 extends ul3 {
    vi3() {
        super(dq3.class, new ti3(ig3.class));
    }

    /* renamed from: a */
    public final tl3 mo9607a() {
        return new ui3(this, gq3.class);
    }

    /* renamed from: b */
    public final /* synthetic */ cz3 mo9608b(jw3 jw3) throws ey3 {
        return dq3.m11610J(jw3, ex3.m12308a());
    }

    /* renamed from: c */
    public final String mo9609c() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo9610d(cz3 cz3) throws GeneralSecurityException {
        dq3 dq3 = (dq3) cz3;
        lv3.m16239b(dq3.mo9665G(), 0);
        if (dq3.mo9666K().mo9361q() != 32) {
            throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
        }
    }

    /* renamed from: f */
    public final int mo9611f() {
        return 3;
    }
}
