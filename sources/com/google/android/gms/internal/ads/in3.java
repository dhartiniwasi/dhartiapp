package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class in3 extends ul3 {
    public in3() {
        super(jr3.class, new gn3(ih3.class));
    }

    /* renamed from: l */
    public static final void m14449l(jr3 jr3) throws GeneralSecurityException {
        lv3.m16239b(jr3.mo11485G(), 0);
        if (jr3.mo11487M().mo9361q() >= 16) {
            m14451n(jr3.mo11486L());
            return;
        }
        throw new GeneralSecurityException("key too short");
    }

    /* renamed from: m */
    static /* bridge */ /* synthetic */ sl3 m14450m(int i, int i2, int i3, int i4) {
        lr3 H = mr3.m16661H();
        or3 H2 = pr3.m18763H();
        H2.mo13026r(i3);
        H2.mo13025p(i2);
        H.mo12073r((pr3) H2.mo13423m());
        H.mo12072p(i);
        return new sl3((mr3) H.mo13423m(), i4);
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static void m14451n(pr3 pr3) throws GeneralSecurityException {
        if (pr3.mo13351G() >= 10) {
            int L = pr3.mo13352L() - 2;
            if (L != 1) {
                if (L != 2) {
                    if (L != 3) {
                        if (L != 4) {
                            if (L != 5) {
                                throw new GeneralSecurityException("unknown hash type");
                            } else if (pr3.mo13351G() > 28) {
                                throw new GeneralSecurityException("tag size too big");
                            }
                        } else if (pr3.mo13351G() > 64) {
                            throw new GeneralSecurityException("tag size too big");
                        }
                    } else if (pr3.mo13351G() > 32) {
                        throw new GeneralSecurityException("tag size too big");
                    }
                } else if (pr3.mo13351G() > 48) {
                    throw new GeneralSecurityException("tag size too big");
                }
            } else if (pr3.mo13351G() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            throw new GeneralSecurityException("tag size too small");
        }
    }

    /* renamed from: a */
    public final tl3 mo9607a() {
        return new hn3(this, mr3.class);
    }

    /* renamed from: b */
    public final /* synthetic */ cz3 mo9608b(jw3 jw3) throws ey3 {
        return jr3.m15029K(jw3, ex3.m12308a());
    }

    /* renamed from: c */
    public final String mo9609c() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo9610d(cz3 cz3) throws GeneralSecurityException {
        m14449l((jr3) cz3);
    }

    /* renamed from: e */
    public final int mo10546e() {
        return 2;
    }

    /* renamed from: f */
    public final int mo9611f() {
        return 3;
    }
}
