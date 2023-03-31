package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class ld3<V> implements Runnable {

    /* renamed from: a */
    final fd3<V> f12746a;

    /* renamed from: b */
    final lf3<? extends V> f12747b;

    ld3(fd3 fd3, lf3 lf3) {
        this.f12746a = fd3;
        this.f12747b = lf3;
    }

    public final void run() {
        if (this.f12746a.f9233a == this) {
            if (fd3.f9231f.mo10484f(this.f12746a, this, fd3.m12543i(this.f12747b))) {
                fd3.m12539B(this.f12746a);
            }
        }
    }
}
