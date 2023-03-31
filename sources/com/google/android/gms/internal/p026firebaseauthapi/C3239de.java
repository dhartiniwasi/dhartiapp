package com.google.android.gms.internal.p026firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.de */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final /* synthetic */ class C3239de implements C3203cb {

    /* renamed from: a */
    public static final /* synthetic */ C3239de f21947a = new C3239de();

    private /* synthetic */ C3239de() {
    }

    /* renamed from: a */
    public final C3132a6 mo15902a(C3501lc lcVar, C3331g7 g7Var) {
        C3864wd wdVar;
        C3896xd xdVar;
        int i = C3272ee.f21999f;
        if (((C3402ic) lcVar).mo16173g().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            try {
                C3441ji D = C3441ji.m25917D(((C3402ic) lcVar).mo16171e(), C3852w1.m27266a());
                if (D.mo16223z() == 0) {
                    C3832vd vdVar = new C3832vd((C3799ud) null);
                    vdVar.mo16942b(D.mo16222F().mo15875f());
                    vdVar.mo16943c(D.mo16221E().mo16553z());
                    int E = D.mo16221E().mo16552E();
                    C3674qk qkVar = C3674qk.UNKNOWN_PREFIX;
                    int i2 = E - 2;
                    if (i2 == 1) {
                        wdVar = C3864wd.f22876b;
                    } else if (i2 == 2) {
                        wdVar = C3864wd.f22879e;
                    } else if (i2 == 3) {
                        wdVar = C3864wd.f22878d;
                    } else if (i2 == 4) {
                        wdVar = C3864wd.f22880f;
                    } else if (i2 == 5) {
                        wdVar = C3864wd.f22877c;
                    } else {
                        throw new GeneralSecurityException("Unable to parse HashType: " + C3342gi.m25670a(E));
                    }
                    vdVar.mo16941a(wdVar);
                    C3674qk d = ((C3402ic) lcVar).mo16170d();
                    int ordinal = d.ordinal();
                    if (ordinal == 1) {
                        xdVar = C3896xd.f22917b;
                    } else if (ordinal == 2) {
                        xdVar = C3896xd.f22919d;
                    } else if (ordinal == 3) {
                        xdVar = C3896xd.f22920e;
                    } else if (ordinal == 4) {
                        xdVar = C3896xd.f22918c;
                    } else {
                        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + d.zza());
                    }
                    vdVar.mo16944d(xdVar);
                    C3960zd e = vdVar.mo16945e();
                    C3601od odVar = new C3601od((C3568nd) null);
                    odVar.mo16502c(e);
                    odVar.mo16501b(C3676qm.m26596b(D.mo16222F().mo16051A(), g7Var));
                    odVar.mo16500a(((C3402ic) lcVar).mo16172f());
                    return odVar.mo16503d();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (C3689r2 | IllegalArgumentException unused) {
                throw new GeneralSecurityException("Parsing HmacKey failed");
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to HmacParameters.parseParameters");
        }
    }
}
