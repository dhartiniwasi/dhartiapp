package com.google.android.gms.internal.p026firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.gm */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3346gm extends ThreadLocal {

    /* renamed from: a */
    final /* synthetic */ C3379hm f22074a;

    C3346gm(C3379hm hmVar) {
        this.f22074a = hmVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Mac initialValue() {
        try {
            Mac mac = (Mac) C3741sl.f22688f.mo16763a(this.f22074a.f22096b);
            mac.init(this.f22074a.f22097c);
            return mac;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
