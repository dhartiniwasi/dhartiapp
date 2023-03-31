package com.google.android.gms.internal.p026firebaseauthapi;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.d4 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3229d4 extends C3592o4 {
    C3229d4(int i) {
        super(i, (C3559n4) null);
    }

    /* renamed from: b */
    public final void mo15948b() {
        if (!mo16489k()) {
            for (int i = 0; i < mo16479c(); i++) {
                Map.Entry h = mo16487h(i);
                if (((C3128a2) h.getKey()).mo15697e()) {
                    h.setValue(Collections.unmodifiableList((List) h.getValue()));
                }
            }
            for (Map.Entry entry : mo16482d()) {
                if (((C3128a2) entry.getKey()).mo15697e()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.mo15948b();
    }
}
