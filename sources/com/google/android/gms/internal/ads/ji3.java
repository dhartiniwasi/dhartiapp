package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class ji3 extends ul3 {
    ji3() {
        super(so3.class, new hi3(dv3.class));
    }

    /* renamed from: l */
    public static final void m14900l(so3 so3) throws GeneralSecurityException {
        lv3.m16239b(so3.mo14111G(), 0);
        lv3.m16238a(so3.mo14113M().mo9361q());
        m14901m(so3.mo14112L());
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static final void m14901m(yo3 yo3) throws GeneralSecurityException {
        if (yo3.mo15479G() < 12 || yo3.mo15479G() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    /* renamed from: a */
    public final tl3 mo9607a() {
        return new ii3(this, vo3.class);
    }

    /* renamed from: b */
    public final /* synthetic */ cz3 mo9608b(jw3 jw3) throws ey3 {
        return so3.m20545K(jw3, ex3.m12308a());
    }

    /* renamed from: c */
    public final String mo9609c() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo9610d(cz3 cz3) throws GeneralSecurityException {
        m14900l((so3) cz3);
    }

    /* renamed from: f */
    public final int mo9611f() {
        return 3;
    }
}
