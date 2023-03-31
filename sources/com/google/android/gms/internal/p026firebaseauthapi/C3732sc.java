package com.google.android.gms.internal.p026firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.sc */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3732sc {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Map f22675a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Map f22676b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Map f22677c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Map f22678d;

    /* synthetic */ C3732sc(C3534mc mcVar, C3699rc rcVar) {
        this.f22675a = new HashMap(mcVar.f22357a);
        this.f22676b = new HashMap(mcVar.f22358b);
        this.f22677c = new HashMap(mcVar.f22359c);
        this.f22678d = new HashMap(mcVar.f22360d);
    }

    /* renamed from: a */
    public final C3132a6 mo16752a(C3501lc lcVar, C3331g7 g7Var) throws GeneralSecurityException {
        C3600oc ocVar = new C3600oc(lcVar.getClass(), lcVar.mo16168b(), (C3567nc) null);
        if (this.f22676b.containsKey(ocVar)) {
            return ((C3269eb) this.f22676b.get(ocVar)).mo15796a(lcVar, g7Var);
        }
        String obj = ocVar.toString();
        throw new GeneralSecurityException("No Key Parser for requested key type " + obj + " available");
    }
}
