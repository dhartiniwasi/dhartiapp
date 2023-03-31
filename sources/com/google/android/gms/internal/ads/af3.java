package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class af3 implements Runnable {

    /* renamed from: a */
    final Future f6539a;

    /* renamed from: b */
    final ye3 f6540b;

    af3(Future future, ye3 ye3) {
        this.f6539a = future;
        this.f6540b = ye3;
    }

    public final void run() {
        Throwable a;
        Future future = this.f6539a;
        if (!(future instanceof gg3) || (a = hg3.m13840a((gg3) future)) == null) {
            try {
                this.f6540b.mo8530c(cf3.m10918p(this.f6539a));
            } catch (ExecutionException e) {
                this.f6540b.mo8529a(e.getCause());
            } catch (Error | RuntimeException e2) {
                this.f6540b.mo8529a(e2);
            }
        } else {
            this.f6540b.mo8529a(a);
        }
    }

    public final String toString() {
        u73 a = v73.m22017a(this);
        a.mo14455a(this.f6540b);
        return a.toString();
    }
}
