package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class rj3 extends ThreadLocal {
    rj3() {
    }

    /* renamed from: a */
    protected static final Cipher m19887a() {
        try {
            return (Cipher) su3.f17666e.mo14144a("AES/GCM-SIV/NoPadding");
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object initialValue() {
        return m19887a();
    }
}
