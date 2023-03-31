package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class ym3 extends ul3 {
    ym3() {
        super(co3.class, new wm3(ih3.class));
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static void m24099m(jo3 jo3) throws GeneralSecurityException {
        if (jo3.mo11473G() < 10) {
            throw new GeneralSecurityException("tag size too short");
        } else if (jo3.mo11473G() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static void m24100n(int i) throws GeneralSecurityException {
        if (i != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }

    /* renamed from: a */
    public final tl3 mo9607a() {
        return new xm3(this, go3.class);
    }

    /* renamed from: b */
    public final /* synthetic */ cz3 mo9608b(jw3 jw3) throws ey3 {
        return co3.m11034J(jw3, ex3.m12308a());
    }

    /* renamed from: c */
    public final String mo9609c() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo9610d(cz3 cz3) throws GeneralSecurityException {
        co3 co3 = (co3) cz3;
        lv3.m16239b(co3.mo9244G(), 0);
        m24100n(co3.mo9246L().mo9361q());
        m24099m(co3.mo9245K());
    }

    /* renamed from: f */
    public final int mo9611f() {
        return 3;
    }
}
