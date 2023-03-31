package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class xg3 implements zg3 {

    /* renamed from: a */
    final /* synthetic */ km3 f20094a;

    /* renamed from: b */
    final /* synthetic */ ul3 f20095b;

    xg3(km3 km3, ul3 ul3) {
        this.f20094a = km3;
        this.f20095b = ul3;
    }

    /* renamed from: a */
    public final Set mo14746a() {
        return this.f20094a.mo14538j();
    }

    /* renamed from: b */
    public final Class mo14747b() {
        return this.f20095b.getClass();
    }

    /* renamed from: c */
    public final sg3 mo14748c(Class cls) throws GeneralSecurityException {
        try {
            return new vh3(this.f20094a, this.f20095b, cls);
        } catch (IllegalArgumentException e) {
            throw new GeneralSecurityException("Primitive type not supported", e);
        }
    }

    /* renamed from: d */
    public final sg3 mo14749d() {
        km3 km3 = this.f20094a;
        return new vh3(km3, this.f20095b, km3.mo14535g());
    }

    /* renamed from: e */
    public final Class mo14750e() {
        return this.f20094a.getClass();
    }
}
