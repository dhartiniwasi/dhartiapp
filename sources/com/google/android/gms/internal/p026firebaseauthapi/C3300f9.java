package com.google.android.gms.internal.p026firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.f9 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3300f9 extends C3500lb {

    /* renamed from: b */
    final /* synthetic */ C3333g9 f22019b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C3300f9(C3333g9 g9Var, Class cls) {
        super(cls);
        this.f22019b = g9Var;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C3591o3 mo15720a(C3591o3 o3Var) throws GeneralSecurityException {
        C3802ug A = C3835vg.m27217A();
        A.mo16876j(C3325g1.m25613u(C3478km.m26007a(((C3931yg) o3Var).mo17075z())));
        A.mo16877k(0);
        return (C3835vg) A.mo16062e();
    }

    /* renamed from: b */
    public final /* synthetic */ C3591o3 mo15721b(C3325g1 g1Var) throws C3689r2 {
        return C3931yg.m27447C(g1Var, C3852w1.m27266a());
    }

    /* renamed from: c */
    public final Map mo15722c() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        C3899xg A = C3931yg.m27445A();
        A.mo17044j(64);
        hashMap.put("AES256_SIV", new C3467kb((C3931yg) A.mo16062e(), 1));
        C3899xg A2 = C3931yg.m27445A();
        A2.mo17044j(64);
        hashMap.put("AES256_SIV_RAW", new C3467kb((C3931yg) A2.mo16062e(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo15723d(C3591o3 o3Var) throws GeneralSecurityException {
        C3931yg ygVar = (C3931yg) o3Var;
        if (ygVar.mo17075z() != 64) {
            int z = ygVar.mo17075z();
            throw new InvalidAlgorithmParameterException("invalid key size: " + z + ". Valid keys must have 64 bytes.");
        }
    }
}
