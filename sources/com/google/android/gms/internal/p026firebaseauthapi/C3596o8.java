package com.google.android.gms.internal.p026firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.o8 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3596o8 extends C3500lb {

    /* renamed from: b */
    final /* synthetic */ C3629p8 f22444b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C3596o8(C3629p8 p8Var, Class cls) {
        super(cls);
        this.f22444b = p8Var;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C3591o3 mo15720a(C3591o3 o3Var) throws GeneralSecurityException {
        C3147al alVar = (C3147al) o3Var;
        C3871wk A = C3903xk.m27391A();
        A.mo17003k(0);
        A.mo17002j(C3325g1.m25613u(C3478km.m26007a(32)));
        return (C3903xk) A.mo16062e();
    }

    /* renamed from: b */
    public final /* synthetic */ C3591o3 mo15721b(C3325g1 g1Var) throws C3689r2 {
        return C3147al.m25041B(g1Var, C3852w1.m27266a());
    }

    /* renamed from: c */
    public final Map mo15722c() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("XCHACHA20_POLY1305", new C3467kb(C3147al.m25040A(), 1));
        hashMap.put("XCHACHA20_POLY1305_RAW", new C3467kb(C3147al.m25040A(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo15723d(C3591o3 o3Var) throws GeneralSecurityException {
        C3147al alVar = (C3147al) o3Var;
    }
}
