package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class yc1 {

    /* renamed from: a */
    private final wa1 f20550a;

    /* renamed from: b */
    private boolean f20551b;

    public yc1(wa1 wa1) {
        this.f20550a = wa1;
    }

    /* renamed from: a */
    public final synchronized void mo15419a() throws InterruptedException {
        while (!this.f20551b) {
            wait();
        }
    }

    /* renamed from: b */
    public final synchronized void mo15420b() {
        boolean z = false;
        while (!this.f20551b) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    /* renamed from: c */
    public final synchronized boolean mo15421c() {
        boolean z;
        z = this.f20551b;
        this.f20551b = false;
        return z;
    }

    /* renamed from: d */
    public final synchronized boolean mo15422d() {
        return this.f20551b;
    }

    /* renamed from: e */
    public final synchronized boolean mo15423e() {
        if (this.f20551b) {
            return false;
        }
        this.f20551b = true;
        notifyAll();
        return true;
    }
}
