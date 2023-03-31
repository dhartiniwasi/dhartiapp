package com.google.android.gms.internal.p026firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.d8 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3233d8 extends C3500lb {

    /* renamed from: b */
    final /* synthetic */ C3266e8 f21935b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C3233d8(C3266e8 e8Var, Class cls) {
        super(cls);
        this.f21935b = e8Var;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C3591o3 mo15720a(C3591o3 o3Var) throws GeneralSecurityException {
        C3275eh ehVar = (C3275eh) o3Var;
        C3143ah A = C3176bh.m25116A();
        A.mo15737k(0);
        A.mo15736j(C3325g1.m25613u(C3478km.m26007a(32)));
        return (C3176bh) A.mo16062e();
    }

    /* renamed from: b */
    public final /* synthetic */ C3591o3 mo15721b(C3325g1 g1Var) throws C3689r2 {
        return C3275eh.m25501B(g1Var, C3852w1.m27266a());
    }

    /* renamed from: c */
    public final Map mo15722c() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("CHACHA20_POLY1305", new C3467kb(C3275eh.m25500A(), 1));
        hashMap.put("CHACHA20_POLY1305_RAW", new C3467kb(C3275eh.m25500A(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo15723d(C3591o3 o3Var) throws GeneralSecurityException {
        C3275eh ehVar = (C3275eh) o3Var;
    }
}
