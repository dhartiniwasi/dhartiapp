package com.google.android.gms.internal.ads;

import android.os.Binder;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import p053g4.C4409t;
import p060h4.C4596v;
import p073j4.C4751b2;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class gz1 {

    /* renamed from: a */
    private final mf3 f10122a;

    /* renamed from: b */
    private final mf3 f10123b;

    /* renamed from: c */
    private final o02 f10124c;

    /* renamed from: d */
    private final v34 f10125d;

    public gz1(mf3 mf3, mf3 mf32, o02 o02, v34 v34) {
        this.f10122a = mf3;
        this.f10123b = mf32;
        this.f10124c = o02;
        this.f10125d = v34;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ lf3 mo10700a(yg0 yg0, int i, g12 g12) throws Exception {
        return ((i22) this.f10125d.mo8155d()).mo11001J6(yg0, i);
    }

    /* renamed from: b */
    public final lf3 mo10701b(yg0 yg0) {
        lf3 lf3;
        String str = yg0.f20597d;
        C4409t.m29326r();
        if (C4751b2.m30604V(str)) {
            lf3 = cf3.m10910h(new g12(1));
        } else {
            lf3 = cf3.m10909g(this.f10122a.mo12324a(new dz1(this, yg0)), ExecutionException.class, ez1.f9036a, this.f10123b);
        }
        return cf3.m10909g(lf3, g12.class, new fz1(this, yg0, Binder.getCallingUid()), this.f10123b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ InputStream mo10702c(yg0 yg0) throws Exception {
        in0 in0;
        o02 o02 = this.f10124c;
        synchronized (o02.f16111b) {
            if (o02.f16112c) {
                in0 = o02.f16110a;
            } else {
                o02.f16112c = true;
                o02.f16114e = yg0;
                o02.f16115f.mo17355u();
                o02.f16110a.mo10135j(new n02(o02), dn0.f8330f);
                in0 = o02.f16110a;
            }
        }
        return (InputStream) in0.get((long) ((Integer) C4596v.m30088c().mo12227b(C2679nz.f14287E4)).intValue(), TimeUnit.SECONDS);
    }
}
