package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class vg3 implements zg3 {

    /* renamed from: a */
    final /* synthetic */ sg3 f19088a;

    vg3(sg3 sg3) {
        this.f19088a = sg3;
    }

    /* renamed from: a */
    public final Set mo14746a() {
        return Collections.singleton(this.f19088a.mo14000e());
    }

    /* renamed from: b */
    public final Class mo14747b() {
        return null;
    }

    /* renamed from: c */
    public final sg3 mo14748c(Class cls) throws GeneralSecurityException {
        if (this.f19088a.mo14000e().equals(cls)) {
            return this.f19088a;
        }
        throw new InternalError("This should never be called, as we always first check supportedPrimitives.");
    }

    /* renamed from: d */
    public final sg3 mo14749d() {
        return this.f19088a;
    }

    /* renamed from: e */
    public final Class mo14750e() {
        return this.f19088a.getClass();
    }
}
