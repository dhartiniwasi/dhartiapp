package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public class oi1 {

    /* renamed from: a */
    private final uj1 f15153a;

    /* renamed from: b */
    private final vs0 f15154b;

    public oi1(uj1 uj1, vs0 vs0) {
        this.f15153a = uj1;
        this.f15154b = vs0;
    }

    /* renamed from: h */
    public static final jh1 m17878h(ky2 ky2) {
        return new jh1(ky2, dn0.f8330f);
    }

    /* renamed from: i */
    public static final jh1 m17879i(zj1 zj1) {
        return new jh1(zj1, dn0.f8330f);
    }

    /* renamed from: a */
    public final View mo12949a() {
        vs0 vs0 = this.f15154b;
        if (vs0 == null) {
            return null;
        }
        return vs0.mo12086A();
    }

    /* renamed from: b */
    public final View mo12950b() {
        vs0 vs0 = this.f15154b;
        if (vs0 != null) {
            return vs0.mo12086A();
        }
        return null;
    }

    /* renamed from: c */
    public final vs0 mo12951c() {
        return this.f15154b;
    }

    /* renamed from: d */
    public final jh1 mo12952d(Executor executor) {
        return new jh1(new mi1(this.f15154b), executor);
    }

    /* renamed from: e */
    public final uj1 mo12953e() {
        return this.f15153a;
    }

    /* renamed from: f */
    public Set mo8300f(v81 v81) {
        return Collections.singleton(new jh1(v81, dn0.f8330f));
    }

    /* renamed from: g */
    public Set mo8301g(v81 v81) {
        return Collections.singleton(new jh1(v81, dn0.f8330f));
    }
}
