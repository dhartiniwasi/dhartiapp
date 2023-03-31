package com.google.android.gms.internal.ads;

import android.os.Binder;
import java.util.concurrent.ExecutionException;
import p053g4.C4409t;
import p073j4.C4751b2;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class q12 {

    /* renamed from: a */
    private final mf3 f16126a;

    /* renamed from: b */
    private final x02 f16127b;

    /* renamed from: c */
    private final v34 f16128c;

    public q12(mf3 mf3, x02 x02, v34 v34) {
        this.f16126a = mf3;
        this.f16127b = x02;
        this.f16128c = v34;
    }

    /* renamed from: g */
    private final lf3 m19017g(yg0 yg0, p12 p12, p12 p122, ie3 ie3) {
        lf3 lf3;
        String str = yg0.f20597d;
        C4409t.m29326r();
        if (C4751b2.m30604V(str)) {
            lf3 = cf3.m10910h(new g12(1));
        } else {
            lf3 = cf3.m10909g(p12.mo11294a(yg0), ExecutionException.class, h12.f10149a, this.f16126a);
        }
        return cf3.m10909g(cf3.m10916n(se3.m20287D(lf3), ie3, this.f16126a), g12.class, new o12(this, p122, yg0, ie3), this.f16126a);
    }

    /* renamed from: a */
    public final lf3 mo13447a(yg0 yg0) {
        return m19017g(yg0, new m12(this.f16127b), new n12(this), new l12(yg0));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ lf3 mo13448b(p12 p12, yg0 yg0, ie3 ie3, g12 g12) throws Exception {
        return cf3.m10916n(p12.mo11294a(yg0), ie3, this.f16126a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ lf3 mo13449c(yg0 yg0) {
        return ((i22) this.f16128c.mo8155d()).mo11000I6(yg0, Binder.getCallingUid());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ lf3 mo13450d(yg0 yg0) {
        String str;
        x02 x02 = this.f16127b;
        if (((Boolean) k10.f11866d.mo13438e()).booleanValue()) {
            str = yg0.f20601h;
        } else {
            str = yg0.f20603r;
        }
        return x02.mo15016c(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ lf3 mo13451e(yg0 yg0) {
        String str;
        i22 i22 = (i22) this.f16128c.mo8155d();
        if (((Boolean) k10.f11866d.mo13438e()).booleanValue()) {
            str = yg0.f20601h;
        } else {
            str = yg0.f20603r;
        }
        return i22.mo11003L6(str);
    }

    /* renamed from: f */
    public final lf3 mo13452f(yg0 yg0) {
        if (C3104zf.m24571g(yg0.f20603r)) {
            return cf3.m10910h(new cz1(2, "Pool key missing from removeUrl call."));
        }
        return m19017g(yg0, new j12(this), new k12(this), i12.f10579a);
    }
}
