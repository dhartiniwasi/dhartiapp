package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class sp1 {

    /* renamed from: a */
    private final Executor f17612a;

    /* renamed from: b */
    private final h21 f17613b;

    /* renamed from: c */
    private final lh1 f17614c;

    sp1(Executor executor, h21 h21, lh1 lh1) {
        this.f17612a = executor;
        this.f17614c = lh1;
        this.f17613b = h21;
    }

    /* renamed from: a */
    public final void mo14115a(vs0 vs0) {
        if (vs0 != null) {
            this.f17614c.mo12019p0(vs0.mo10647w());
            this.f17614c.mo11669m0(new op1(vs0), this.f17612a);
            this.f17614c.mo11669m0(new pp1(vs0), this.f17612a);
            this.f17614c.mo11669m0(this.f17613b, this.f17612a);
            this.f17613b.mo10720e(vs0);
            vs0.mo12105d1("/trackActiveViewUnit", new qp1(this));
            vs0.mo12105d1("/untrackActiveViewUnit", new rp1(this));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo14116b(vs0 vs0, Map map) {
        this.f17613b.mo10717b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo14117c(vs0 vs0, Map map) {
        this.f17613b.mo10716a();
    }
}
