package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class cj3 extends tl3 {

    /* renamed from: b */
    final /* synthetic */ dj3 f7777b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    cj3(dj3 dj3, Class cls) {
        super(cls);
        this.f7777b = dj3;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ cz3 mo8857a(cz3 cz3) throws GeneralSecurityException {
        ht3 H = it3.m14551H();
        H.mo10948p((mt3) cz3);
        H.mo10949r(0);
        return (it3) H.mo13423m();
    }

    /* renamed from: b */
    public final /* synthetic */ cz3 mo8858b(jw3 jw3) throws ey3 {
        return mt3.m16703J(jw3, ex3.m12308a());
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo8860d(cz3 cz3) throws GeneralSecurityException {
        mt3 mt3 = (mt3) cz3;
        if (mt3.mo12436K().isEmpty() || !mt3.mo12437L()) {
            throw new GeneralSecurityException("invalid key format: missing KEK URI or DEK template");
        }
    }
}
