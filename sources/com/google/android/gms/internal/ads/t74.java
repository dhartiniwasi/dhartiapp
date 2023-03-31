package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class t74 {

    /* renamed from: a */
    private final s74 f17882a;

    /* renamed from: b */
    private final r74 f17883b;

    /* renamed from: c */
    private final wa1 f17884c;

    /* renamed from: d */
    private final gt0 f17885d;

    /* renamed from: e */
    private int f17886e;

    /* renamed from: f */
    private Object f17887f;

    /* renamed from: g */
    private final Looper f17888g;

    /* renamed from: h */
    private final int f17889h;

    /* renamed from: i */
    private boolean f17890i;

    /* renamed from: j */
    private boolean f17891j;

    /* renamed from: k */
    private boolean f17892k;

    public t74(r74 r74, s74 s74, gt0 gt0, int i, wa1 wa1, Looper looper) {
        this.f17883b = r74;
        this.f17882a = s74;
        this.f17885d = gt0;
        this.f17888g = looper;
        this.f17884c = wa1;
        this.f17889h = i;
    }

    /* renamed from: a */
    public final int mo14214a() {
        return this.f17886e;
    }

    /* renamed from: b */
    public final Looper mo14215b() {
        return this.f17888g;
    }

    /* renamed from: c */
    public final s74 mo14216c() {
        return this.f17882a;
    }

    /* renamed from: d */
    public final t74 mo14217d() {
        v91.m22052f(!this.f17890i);
        this.f17890i = true;
        this.f17883b.mo13692b(this);
        return this;
    }

    /* renamed from: e */
    public final t74 mo14218e(Object obj) {
        v91.m22052f(!this.f17890i);
        this.f17887f = obj;
        return this;
    }

    /* renamed from: f */
    public final t74 mo14219f(int i) {
        v91.m22052f(!this.f17890i);
        this.f17886e = i;
        return this;
    }

    /* renamed from: g */
    public final Object mo14220g() {
        return this.f17887f;
    }

    /* renamed from: h */
    public final synchronized void mo14221h(boolean z) {
        this.f17891j = z | this.f17891j;
        this.f17892k = true;
        notifyAll();
    }

    /* renamed from: i */
    public final synchronized boolean mo14222i(long j) throws InterruptedException, TimeoutException {
        v91.m22052f(this.f17890i);
        v91.m22052f(this.f17888g.getThread() != Thread.currentThread());
        long elapsedRealtime = SystemClock.elapsedRealtime() + j;
        while (!this.f17892k) {
            if (j > 0) {
                wait(j);
                j = elapsedRealtime - SystemClock.elapsedRealtime();
            } else {
                throw new TimeoutException("Message delivery timed out.");
            }
        }
        return this.f17891j;
    }

    /* renamed from: j */
    public final synchronized boolean mo14223j() {
        return false;
    }
}
