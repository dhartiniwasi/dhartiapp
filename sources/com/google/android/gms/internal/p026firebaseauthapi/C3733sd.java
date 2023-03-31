package com.google.android.gms.internal.p026firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.sd */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3733sd extends C3500lb {

    /* renamed from: b */
    final /* synthetic */ C3766td f22679b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C3733sd(C3766td tdVar, Class cls) {
        super(cls);
        this.f22679b = tdVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C3591o3 mo15720a(C3591o3 o3Var) throws GeneralSecurityException {
        C3540mi miVar = (C3540mi) o3Var;
        C3408ii A = C3441ji.m25914A();
        A.mo16182l(0);
        A.mo16181k(miVar.mo16396E());
        A.mo16180j(C3325g1.m25613u(C3478km.m26007a(miVar.mo16397z())));
        return (C3441ji) A.mo16062e();
    }

    /* renamed from: b */
    public final /* synthetic */ C3591o3 mo15721b(C3325g1 g1Var) throws C3689r2 {
        return C3540mi.m26209D(g1Var, C3852w1.m27266a());
    }

    /* renamed from: c */
    public final Map mo15722c() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("HMAC_SHA256_128BITTAG", C3766td.m26999m(32, 16, 5, 1));
        hashMap.put("HMAC_SHA256_128BITTAG_RAW", C3766td.m26999m(32, 16, 5, 3));
        hashMap.put("HMAC_SHA256_256BITTAG", C3766td.m26999m(32, 32, 5, 1));
        hashMap.put("HMAC_SHA256_256BITTAG_RAW", C3766td.m26999m(32, 32, 5, 3));
        hashMap.put("HMAC_SHA512_128BITTAG", C3766td.m26999m(64, 16, 6, 1));
        hashMap.put("HMAC_SHA512_128BITTAG_RAW", C3766td.m26999m(64, 16, 6, 3));
        hashMap.put("HMAC_SHA512_256BITTAG", C3766td.m26999m(64, 32, 6, 1));
        hashMap.put("HMAC_SHA512_256BITTAG_RAW", C3766td.m26999m(64, 32, 6, 3));
        hashMap.put("HMAC_SHA512_512BITTAG", C3766td.m26999m(64, 64, 6, 1));
        hashMap.put("HMAC_SHA512_512BITTAG_RAW", C3766td.m26999m(64, 64, 6, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo15723d(C3591o3 o3Var) throws GeneralSecurityException {
        C3540mi miVar = (C3540mi) o3Var;
        if (miVar.mo16397z() >= 16) {
            C3766td.m27000n(miVar.mo16396E());
            return;
        }
        throw new GeneralSecurityException("key too short");
    }
}
