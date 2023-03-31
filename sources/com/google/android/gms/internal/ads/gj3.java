package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class gj3 extends ul3 {
    gj3() {
        super(ut3.class, new ej3(ig3.class));
    }

    /* renamed from: a */
    public final tl3 mo9607a() {
        return new fj3(this, xt3.class);
    }

    /* renamed from: b */
    public final /* synthetic */ cz3 mo9608b(jw3 jw3) throws ey3 {
        return ut3.m21856J(jw3, ex3.m12308a());
    }

    /* renamed from: c */
    public final String mo9609c() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo9610d(cz3 cz3) throws GeneralSecurityException {
        ut3 ut3 = (ut3) cz3;
        lv3.m16239b(ut3.mo14624G(), 0);
        if (ut3.mo14625K().mo9361q() != 32) {
            throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
        }
    }

    /* renamed from: f */
    public final int mo9611f() {
        return 3;
    }
}
