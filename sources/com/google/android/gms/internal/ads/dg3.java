package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class dg3 extends re3 implements RunnableFuture {

    /* renamed from: h */
    private volatile kf3 f8252h;

    dg3(he3 he3) {
        this.f8252h = new bg3(this, he3);
    }

    /* renamed from: E */
    static dg3 m11495E(Runnable runnable, Object obj) {
        return new dg3(Executors.callable(runnable, obj));
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final String mo8329e() {
        kf3 kf3 = this.f8252h;
        if (kf3 == null) {
            return super.mo8329e();
        }
        return "task=[" + kf3 + "]";
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo8330f() {
        kf3 kf3;
        if (mo10140x() && (kf3 = this.f8252h) != null) {
            kf3.mo11676g();
        }
        this.f8252h = null;
    }

    public final void run() {
        kf3 kf3 = this.f8252h;
        if (kf3 != null) {
            kf3.run();
        }
        this.f8252h = null;
    }

    dg3(Callable callable) {
        this.f8252h = new cg3(this, callable);
    }
}
