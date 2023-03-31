package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class wg3 implements zg3 {

    /* renamed from: a */
    final /* synthetic */ ul3 f19626a;

    wg3(ul3 ul3) {
        this.f19626a = ul3;
    }

    /* renamed from: a */
    public final Set mo14746a() {
        return this.f19626a.mo14538j();
    }

    /* renamed from: b */
    public final Class mo14747b() {
        return null;
    }

    /* renamed from: c */
    public final sg3 mo14748c(Class cls) throws GeneralSecurityException {
        try {
            return new ug3(this.f19626a, cls);
        } catch (IllegalArgumentException e) {
            throw new GeneralSecurityException("Primitive type not supported", e);
        }
    }

    /* renamed from: d */
    public final sg3 mo14749d() {
        ul3 ul3 = this.f19626a;
        return new ug3(ul3, ul3.mo14535g());
    }

    /* renamed from: e */
    public final Class mo14750e() {
        return this.f19626a.getClass();
    }
}
