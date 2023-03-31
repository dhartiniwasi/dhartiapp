package com.google.android.gms.internal.p026firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.u7 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3793u7 extends C3500lb {

    /* renamed from: b */
    final /* synthetic */ C3826v7 f22771b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C3793u7(C3826v7 v7Var, Class cls) {
        super(cls);
        this.f22771b = v7Var;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C3591o3 mo15720a(C3591o3 o3Var) throws GeneralSecurityException {
        C3208cg cgVar = (C3208cg) o3Var;
        C3930yf A = C3962zf.m27556A();
        A.mo17072j(C3325g1.m25613u(C3478km.m26007a(cgVar.mo15906z())));
        A.mo17073k(cgVar.mo15905D());
        A.mo17074l(0);
        return (C3962zf) A.mo16062e();
    }

    /* renamed from: b */
    public final /* synthetic */ C3591o3 mo15721b(C3325g1 g1Var) throws C3689r2 {
        return C3208cg.m25331C(g1Var, C3852w1.m27266a());
    }

    /* renamed from: c */
    public final Map mo15722c() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_EAX", C3826v7.m27202k(16, 16, 1));
        hashMap.put("AES128_EAX_RAW", C3826v7.m27202k(16, 16, 3));
        hashMap.put("AES256_EAX", C3826v7.m27202k(32, 16, 1));
        hashMap.put("AES256_EAX_RAW", C3826v7.m27202k(32, 16, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo15723d(C3591o3 o3Var) throws GeneralSecurityException {
        C3208cg cgVar = (C3208cg) o3Var;
        C3544mm.m26217b(cgVar.mo15906z());
        if (cgVar.mo15905D().mo16027z() != 12 && cgVar.mo15905D().mo16027z() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}
