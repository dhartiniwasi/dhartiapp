package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class n32 {

    /* renamed from: a */
    private long f13826a = 0;

    /* renamed from: b */
    private int f13827b = 0;

    /* renamed from: c */
    private long f13828c = 0;

    /* renamed from: d */
    private long f13829d = 0;

    /* renamed from: e */
    private long f13830e = 0;

    /* renamed from: f */
    private final Object f13831f = new Object();

    /* renamed from: g */
    private final Object f13832g = new Object();

    /* renamed from: h */
    private final Object f13833h = new Object();

    /* renamed from: i */
    private final Object f13834i = new Object();

    /* renamed from: j */
    private final Object f13835j = new Object();

    /* renamed from: a */
    public final int mo12512a() {
        int i;
        synchronized (this.f13832g) {
            i = this.f13827b;
        }
        return i;
    }

    /* renamed from: b */
    public final synchronized long mo12513b() {
        long j;
        synchronized (this.f13835j) {
            j = this.f13830e;
        }
        return j;
    }

    /* renamed from: c */
    public final synchronized long mo12514c() {
        long j;
        synchronized (this.f13834i) {
            j = this.f13829d;
        }
        return j;
    }

    /* renamed from: d */
    public final synchronized long mo12515d() {
        long j;
        synchronized (this.f13831f) {
            j = this.f13826a;
        }
        return j;
    }

    /* renamed from: e */
    public final long mo12516e() {
        long j;
        synchronized (this.f13833h) {
            j = this.f13828c;
        }
        return j;
    }

    /* renamed from: f */
    public final synchronized void mo12517f(long j) {
        synchronized (this.f13835j) {
            this.f13830e = j;
        }
    }

    /* renamed from: g */
    public final synchronized void mo12518g(long j) {
        synchronized (this.f13834i) {
            this.f13829d = j;
        }
    }

    /* renamed from: h */
    public final synchronized void mo12519h(long j) {
        synchronized (this.f13831f) {
            this.f13826a = j;
        }
    }

    /* renamed from: i */
    public final void mo12520i(int i) {
        synchronized (this.f13832g) {
            this.f13827b = i;
        }
    }

    /* renamed from: j */
    public final void mo12521j(long j) {
        synchronized (this.f13833h) {
            this.f13828c = j;
        }
    }
}
