package com.google.android.gms.internal.p026firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.el */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3279el extends ThreadLocal {
    C3279el() {
    }

    /* renamed from: a */
    protected static final Cipher m25525a() {
        try {
            return (Cipher) C3741sl.f22687e.mo16763a("AES/CTR/NOPADDING");
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object initialValue() {
        return m25525a();
    }
}
