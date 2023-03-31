package com.google.android.gms.common.api.internal;

import android.app.Activity;
import p017b5.C1787b;
import p017b5.C1793e;
import p033d5.C4141r;
import p124r.C5415b;
import p180z4.C6362b;
import p180z4.C6368e;

/* renamed from: com.google.android.gms.common.api.internal.l */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C2105l extends C2104k1 {

    /* renamed from: f */
    private final C5415b<C1787b<?>> f6236f = new C5415b<>();

    /* renamed from: g */
    private final C2076c f6237g;

    C2105l(C1793e eVar, C2076c cVar, C6368e eVar2) {
        super(eVar, eVar2);
        this.f6237g = cVar;
        this.f6083a.mo6925a("ConnectionlessLifecycleHelper", this);
    }

    /* renamed from: u */
    public static void m9368u(Activity activity, C2076c cVar, C1787b<?> bVar) {
        C1793e c = LifecycleCallback.m9130c(activity);
        C2105l lVar = (C2105l) c.mo6926b("ConnectionlessLifecycleHelper", C2105l.class);
        if (lVar == null) {
            lVar = new C2105l(c, cVar, C6368e.m37415q());
        }
        C4141r.m28222l(bVar, "ApiKey cannot be null");
        lVar.f6236f.add(bVar);
        cVar.mo8041c(lVar);
    }

    /* renamed from: v */
    private final void m9369v() {
        if (!this.f6236f.isEmpty()) {
            this.f6237g.mo8041c(this);
        }
    }

    /* renamed from: h */
    public final void mo8005h() {
        super.mo8005h();
        m9369v();
    }

    /* renamed from: j */
    public final void mo8007j() {
        super.mo8007j();
        m9369v();
    }

    /* renamed from: k */
    public final void mo8008k() {
        super.mo8008k();
        this.f6237g.mo8042d(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo8068m(C6362b bVar, int i) {
        this.f6237g.mo8038G(bVar, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final void mo8069n() {
        this.f6237g.mo8039a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final C5415b<C1787b<?>> mo8089t() {
        return this.f6236f;
    }
}
