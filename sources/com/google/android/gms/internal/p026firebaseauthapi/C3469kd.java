package com.google.android.gms.internal.p026firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.kd */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final /* synthetic */ class C3469kd implements C3203cb {

    /* renamed from: a */
    public static final /* synthetic */ C3469kd f22294a = new C3469kd();

    private /* synthetic */ C3469kd() {
    }

    /* renamed from: a */
    public final C3132a6 mo15902a(C3501lc lcVar, C3331g7 g7Var) {
        C3271ed edVar;
        int i = C3535md.f22366f;
        if (((C3402ic) lcVar).mo16173g().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            try {
                C3141af C = C3141af.m25023C(((C3402ic) lcVar).mo16171e(), C3852w1.m27266a());
                if (C.mo15735z() == 0) {
                    C3238dd ddVar = new C3238dd((C3205cd) null);
                    ddVar.mo15950a(C.mo15733E().mo15875f());
                    ddVar.mo15951b(C.mo15732D().mo16079z());
                    C3674qk d = ((C3402ic) lcVar).mo16170d();
                    C3674qk qkVar = C3674qk.UNKNOWN_PREFIX;
                    int ordinal = d.ordinal();
                    if (ordinal == 1) {
                        edVar = C3271ed.f21989b;
                    } else if (ordinal == 2) {
                        edVar = C3271ed.f21991d;
                    } else if (ordinal == 3) {
                        edVar = C3271ed.f21992e;
                    } else if (ordinal == 4) {
                        edVar = C3271ed.f21990c;
                    } else {
                        int zza = d.zza();
                        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zza);
                    }
                    ddVar.mo15952c(edVar);
                    C3337gd d2 = ddVar.mo15953d();
                    C3863wc wcVar = new C3863wc((C3831vc) null);
                    wcVar.mo16986c(d2);
                    wcVar.mo16984a(C3676qm.m26596b(C.mo15733E().mo16051A(), g7Var));
                    wcVar.mo16985b(((C3402ic) lcVar).mo16172f());
                    return wcVar.mo16987d();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (C3689r2 | IllegalArgumentException unused) {
                throw new GeneralSecurityException("Parsing AesCmacKey failed");
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacParameters.parseParameters");
        }
    }
}
