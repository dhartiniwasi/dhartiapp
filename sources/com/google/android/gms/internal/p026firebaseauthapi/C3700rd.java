package com.google.android.gms.internal.p026firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.rd */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3700rd extends C3336gc {
    C3700rd(Class cls) {
        super(cls);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo15900a(C3591o3 o3Var) throws GeneralSecurityException {
        C3441ji jiVar = (C3441ji) o3Var;
        int E = jiVar.mo16221E().mo16552E();
        SecretKeySpec secretKeySpec = new SecretKeySpec(jiVar.mo16222F().mo16051A(), "HMAC");
        int z = jiVar.mo16221E().mo16553z();
        int i = E - 2;
        if (i == 1) {
            return new C3412im(new C3379hm("HMACSHA1", secretKeySpec), z);
        }
        if (i == 2) {
            return new C3412im(new C3379hm("HMACSHA384", secretKeySpec), z);
        }
        if (i == 3) {
            return new C3412im(new C3379hm("HMACSHA256", secretKeySpec), z);
        }
        if (i == 4) {
            return new C3412im(new C3379hm("HMACSHA512", secretKeySpec), z);
        }
        if (i == 5) {
            return new C3412im(new C3379hm("HMACSHA224", secretKeySpec), z);
        }
        throw new GeneralSecurityException("unknown hash");
    }
}
