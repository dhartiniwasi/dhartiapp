package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class qf3 extends od3 implements Runnable {

    /* renamed from: h */
    private final Runnable f16360h;

    public qf3(Runnable runnable) {
        Objects.requireNonNull(runnable);
        this.f16360h = runnable;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final String mo8329e() {
        return "task=[" + this.f16360h + "]";
    }

    public final void run() {
        try {
            this.f16360h.run();
        } catch (Error | RuntimeException e) {
            mo9806h(e);
            throw e;
        }
    }
}
