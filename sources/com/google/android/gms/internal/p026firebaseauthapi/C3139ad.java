package com.google.android.gms.internal.p026firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.ad */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3139ad extends C3500lb {
    C3139ad(C3172bd bdVar, Class cls) {
        super(cls);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C3591o3 mo15720a(C3591o3 o3Var) throws GeneralSecurityException {
        C3240df dfVar = (C3240df) o3Var;
        C3961ze A = C3141af.m25021A();
        A.mo17111l(0);
        A.mo17109j(C3325g1.m25613u(C3478km.m26007a(dfVar.mo15955z())));
        A.mo17110k(dfVar.mo15954D());
        return (C3141af) A.mo16062e();
    }

    /* renamed from: b */
    public final /* synthetic */ C3591o3 mo15721b(C3325g1 g1Var) throws C3689r2 {
        return C3240df.m25422C(g1Var, C3852w1.m27266a());
    }

    /* renamed from: c */
    public final Map mo15722c() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        C3207cf A = C3240df.m25420A();
        A.mo15903j(32);
        C3306ff A2 = C3339gf.m25663A();
        A2.mo16026j(16);
        A.mo15904k((C3339gf) A2.mo16062e());
        hashMap.put("AES_CMAC", new C3467kb((C3240df) A.mo16062e(), 1));
        C3207cf A3 = C3240df.m25420A();
        A3.mo15903j(32);
        C3306ff A4 = C3339gf.m25663A();
        A4.mo16026j(16);
        A3.mo15904k((C3339gf) A4.mo16062e());
        hashMap.put("AES256_CMAC", new C3467kb((C3240df) A3.mo16062e(), 1));
        C3207cf A5 = C3240df.m25420A();
        A5.mo15903j(32);
        C3306ff A6 = C3339gf.m25663A();
        A6.mo16026j(16);
        A5.mo15904k((C3339gf) A6.mo16062e());
        hashMap.put("AES256_CMAC_RAW", new C3467kb((C3240df) A5.mo16062e(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo15723d(C3591o3 o3Var) throws GeneralSecurityException {
        C3240df dfVar = (C3240df) o3Var;
        C3172bd.m25107m(dfVar.mo15954D());
        C3172bd.m25108n(dfVar.mo15955z());
    }
}
