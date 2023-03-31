package com.google.android.gms.internal.p026firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.bl */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3180bl extends ThreadLocal {
    C3180bl() {
    }

    /* renamed from: a */
    protected static final Cipher m25144a() {
        try {
            return (Cipher) C3741sl.f22687e.mo16763a("AES/CTR/NoPadding");
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object initialValue() {
        return m25144a();
    }
}
