package com.google.android.gms.internal.p026firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.vd */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3832vd {

    /* renamed from: a */
    private Integer f22811a = null;

    /* renamed from: b */
    private Integer f22812b = null;

    /* renamed from: c */
    private C3864wd f22813c = null;

    /* renamed from: d */
    private C3896xd f22814d = C3896xd.f22920e;

    /* synthetic */ C3832vd(C3799ud udVar) {
    }

    /* renamed from: a */
    public final C3832vd mo16941a(C3864wd wdVar) {
        this.f22813c = wdVar;
        return this;
    }

    /* renamed from: b */
    public final C3832vd mo16942b(int i) throws GeneralSecurityException {
        this.f22811a = Integer.valueOf(i);
        return this;
    }

    /* renamed from: c */
    public final C3832vd mo16943c(int i) throws GeneralSecurityException {
        this.f22812b = Integer.valueOf(i);
        return this;
    }

    /* renamed from: d */
    public final C3832vd mo16944d(C3896xd xdVar) {
        this.f22814d = xdVar;
        return this;
    }

    /* renamed from: e */
    public final C3960zd mo16945e() throws GeneralSecurityException {
        Integer num = this.f22811a;
        if (num == null) {
            throw new GeneralSecurityException("key size is not set");
        } else if (this.f22812b == null) {
            throw new GeneralSecurityException("tag size is not set");
        } else if (this.f22813c == null) {
            throw new GeneralSecurityException("hash type is not set");
        } else if (num.intValue() >= 16) {
            int intValue = this.f22812b.intValue();
            C3864wd wdVar = this.f22813c;
            if (intValue >= 10) {
                if (wdVar == C3864wd.f22876b) {
                    if (intValue > 20) {
                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", new Object[]{Integer.valueOf(intValue)}));
                    }
                } else if (wdVar == C3864wd.f22877c) {
                    if (intValue > 28) {
                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", new Object[]{Integer.valueOf(intValue)}));
                    }
                } else if (wdVar == C3864wd.f22878d) {
                    if (intValue > 32) {
                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", new Object[]{Integer.valueOf(intValue)}));
                    }
                } else if (wdVar == C3864wd.f22879e) {
                    if (intValue > 48) {
                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", new Object[]{Integer.valueOf(intValue)}));
                    }
                } else if (wdVar != C3864wd.f22880f) {
                    throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
                } else if (intValue > 64) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", new Object[]{Integer.valueOf(intValue)}));
                }
                return new C3960zd(this.f22811a.intValue(), this.f22812b.intValue(), this.f22814d, this.f22813c, (C3928yd) null);
            }
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", new Object[]{Integer.valueOf(intValue)}));
        } else {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", new Object[]{this.f22811a}));
        }
    }
}
