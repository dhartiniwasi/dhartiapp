package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class jh3 {
    @Deprecated
    /* renamed from: a */
    public static final eh3 m14862a(byte[] bArr) throws GeneralSecurityException {
        try {
            us3 L = us3.m21844L(bArr, ex3.m12308a());
            for (ts3 ts3 : L.mo14622M()) {
                if (ts3.mo14378H().mo10636N() == 2 || ts3.mo14378H().mo10636N() == 3 || ts3.mo14378H().mo10636N() == 4) {
                    throw new GeneralSecurityException("keyset contains secret key material");
                }
            }
            return eh3.m12109a(L);
        } catch (ey3 unused) {
            throw new GeneralSecurityException("invalid keyset");
        }
    }
}
