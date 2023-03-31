package com.google.android.gms.internal.p026firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.r8 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3695r8 extends ThreadLocal {
    C3695r8() {
    }

    /* renamed from: a */
    protected static final Cipher m26768a() {
        try {
            return (Cipher) C3741sl.f22687e.mo16763a("AES/GCM/NoPadding");
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object initialValue() {
        return m26768a();
    }
}
