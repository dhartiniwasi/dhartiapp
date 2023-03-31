package com.google.android.gms.internal.p026firebaseauthapi;

import java.util.Collections;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.ne */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3569ne {

    /* renamed from: a */
    private HashMap f22416a = new HashMap();

    /* renamed from: a */
    public final C3635pe mo16458a() {
        if (this.f22416a != null) {
            C3635pe peVar = new C3635pe(Collections.unmodifiableMap(this.f22416a), (C3602oe) null);
            this.f22416a = null;
            return peVar;
        }
        throw new IllegalStateException("cannot call build() twice");
    }
}
