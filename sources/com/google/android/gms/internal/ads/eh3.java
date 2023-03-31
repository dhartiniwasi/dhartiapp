package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class eh3 {

    /* renamed from: a */
    private final us3 f8808a;

    /* renamed from: b */
    private final rn3 f8809b = rn3.f17027b;

    private eh3(us3 us3) {
        this.f8808a = us3;
    }

    /* renamed from: a */
    static final eh3 m12109a(us3 us3) throws GeneralSecurityException {
        if (us3 != null && us3.mo14620G() > 0) {
            return new eh3(us3);
        }
        throw new GeneralSecurityException("empty keyset");
    }

    /* renamed from: b */
    public static final eh3 m12110b(ch3 ch3) throws GeneralSecurityException {
        fh3 d = fh3.m12616d();
        d.mo10165c(ch3.mo9167a());
        return d.mo10164b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final us3 mo9915c() {
        return this.f8808a;
    }

    /* renamed from: d */
    public final Object mo9916d(Class cls) throws GeneralSecurityException {
        Class e = xh3.m23220e(cls);
        if (e != null) {
            yh3.m24008b(this.f8808a);
            mh3 mh3 = new mh3(e, (lh3) null);
            mh3.mo12354c(this.f8809b);
            for (ts3 ts3 : this.f8808a.mo14622M()) {
                if (ts3.mo14380N() == 3) {
                    Object f = xh3.m23221f(ts3.mo14378H(), e);
                    if (ts3.mo14377G() == this.f8808a.mo14621H()) {
                        mh3.mo12352a(f, ts3);
                    } else {
                        mh3.mo12353b(f, ts3);
                    }
                }
            }
            return xh3.m23225j(mh3.mo12355d(), cls);
        }
        throw new GeneralSecurityException("No wrapper found for ".concat(cls.getName()));
    }

    public final String toString() {
        return yh3.m24007a(this.f8808a).toString();
    }
}
