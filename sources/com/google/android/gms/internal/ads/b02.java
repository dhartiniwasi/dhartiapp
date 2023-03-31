package com.google.android.gms.internal.ads;

import android.os.Binder;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p053g4.C4409t;
import p060h4.C4596v;
import p073j4.C4751b2;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class b02 {

    /* renamed from: a */
    private final ScheduledExecutorService f7033a;

    /* renamed from: b */
    private final mf3 f7034b;

    /* renamed from: c */
    private final s02 f7035c;

    /* renamed from: d */
    private final v34 f7036d;

    public b02(ScheduledExecutorService scheduledExecutorService, mf3 mf3, s02 s02, v34 v34) {
        this.f7033a = scheduledExecutorService;
        this.f7034b = mf3;
        this.f7035c = s02;
        this.f7036d = v34;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ lf3 mo8640a(yg0 yg0, int i, Throwable th) throws Exception {
        return ((i22) this.f7036d.mo8155d()).mo11002K6(yg0, i);
    }

    /* renamed from: b */
    public final lf3 mo8641b(yg0 yg0) {
        lf3 lf3;
        String str = yg0.f20597d;
        C4409t.m29326r();
        if (C4751b2.m30604V(str)) {
            lf3 = cf3.m10910h(new g12(1));
        } else {
            s02 s02 = this.f7035c;
            synchronized (s02.f16111b) {
                if (s02.f16112c) {
                    lf3 = s02.f16110a;
                } else {
                    s02.f16112c = true;
                    s02.f16114e = yg0;
                    s02.f16115f.mo17355u();
                    s02.f16110a.mo10135j(new r02(s02), dn0.f8330f);
                    lf3 = s02.f16110a;
                }
            }
        }
        int callingUid = Binder.getCallingUid();
        se3 D = se3.m20287D(lf3);
        long intValue = (long) ((Integer) C4596v.m30088c().mo12227b(C2679nz.f14287E4)).intValue();
        return cf3.m10909g((se3) cf3.m10917o(D, intValue, TimeUnit.SECONDS, this.f7033a), Throwable.class, new a02(this, yg0, callingUid), this.f7034b);
    }
}
