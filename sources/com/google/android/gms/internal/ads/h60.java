package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class h60 {

    /* renamed from: a */
    private boolean f10205a = false;

    /* renamed from: b */
    private boolean f10206b = false;

    /* renamed from: c */
    private float f10207c = 0.0f;

    /* renamed from: d */
    private final AtomicBoolean f10208d = new AtomicBoolean(false);

    /* renamed from: a */
    public final synchronized float mo10741a() {
        return this.f10207c;
    }

    /* renamed from: b */
    public final synchronized void mo10742b(boolean z, float f) {
        this.f10206b = z;
        this.f10207c = f;
    }

    /* renamed from: c */
    public final synchronized void mo10743c(boolean z) {
        this.f10205a = z;
        this.f10208d.set(true);
    }

    /* renamed from: d */
    public final synchronized boolean mo10744d() {
        return this.f10206b;
    }

    /* renamed from: e */
    public final synchronized boolean mo10745e(boolean z) {
        if (!this.f10208d.get()) {
            return z;
        }
        return this.f10205a;
    }
}
