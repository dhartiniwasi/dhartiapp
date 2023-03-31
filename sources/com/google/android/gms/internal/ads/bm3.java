package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class bm3 {

    /* renamed from: b */
    private static final bm3 f7367b = new bm3();

    /* renamed from: a */
    private final AtomicReference f7368a = new AtomicReference(new tm3(new nm3(), (sm3) null));

    /* renamed from: a */
    public static bm3 m10489a() {
        return f7367b;
    }

    /* renamed from: b */
    public final synchronized void mo8878b(ol3 ol3) throws GeneralSecurityException {
        nm3 nm3 = new nm3((tm3) this.f7368a.get());
        nm3.mo12663a(ol3);
        this.f7368a.set(new tm3(nm3, (sm3) null));
    }

    /* renamed from: c */
    public final synchronized void mo8879c(rl3 rl3) throws GeneralSecurityException {
        nm3 nm3 = new nm3((tm3) this.f7368a.get());
        nm3.mo12664b(rl3);
        this.f7368a.set(new tm3(nm3, (sm3) null));
    }

    /* renamed from: d */
    public final synchronized void mo8880d(fm3 fm3) throws GeneralSecurityException {
        nm3 nm3 = new nm3((tm3) this.f7368a.get());
        nm3.mo12665c(fm3);
        this.f7368a.set(new tm3(nm3, (sm3) null));
    }

    /* renamed from: e */
    public final synchronized void mo8881e(im3 im3) throws GeneralSecurityException {
        nm3 nm3 = new nm3((tm3) this.f7368a.get());
        nm3.mo12666d(im3);
        this.f7368a.set(new tm3(nm3, (sm3) null));
    }
}
