package com.google.android.gms.internal.p026firebaseauthapi;

import java.security.SecureRandom;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.jm */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3445jm extends ThreadLocal {
    C3445jm() {
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object initialValue() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextLong();
        return secureRandom;
    }
}
