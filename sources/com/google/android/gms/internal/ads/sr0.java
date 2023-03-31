package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class sr0 implements d74 {

    /* renamed from: a */
    private final nk4 f17629a = new nk4(true, 65536);

    /* renamed from: b */
    private long f17630b = 15000000;

    /* renamed from: c */
    private long f17631c = 30000000;

    /* renamed from: d */
    private long f17632d = 2500000;

    /* renamed from: e */
    private long f17633e = 5000000;

    /* renamed from: f */
    private int f17634f;

    /* renamed from: g */
    private boolean f17635g;

    sr0() {
    }

    /* renamed from: T */
    public final boolean mo9444T() {
        return false;
    }

    /* renamed from: V */
    public final nk4 mo9445V() {
        return this.f17629a;
    }

    /* renamed from: a */
    public final boolean mo9446a(long j, float f, boolean z, long j2) {
        long j3 = z ? this.f17633e : this.f17632d;
        return j3 <= 0 || j >= j3;
    }

    /* renamed from: b */
    public final void mo9447b() {
        mo14123g(true);
    }

    /* renamed from: c */
    public final boolean mo9448c(long j, long j2, float f) {
        boolean z = true;
        char c = j2 > this.f17631c ? 0 : j2 < this.f17630b ? (char) 2 : 1;
        int a = this.f17629a.mo12648a();
        int i = this.f17634f;
        if (c != 2 && (c != 1 || !this.f17635g || a >= i)) {
            z = false;
        }
        this.f17635g = z;
        return z;
    }

    /* renamed from: d */
    public final void mo9449d() {
        mo14123g(false);
    }

    /* renamed from: e */
    public final void mo9450e() {
        mo14123g(true);
    }

    /* renamed from: f */
    public final void mo9451f(x74[] x74Arr, ki4 ki4, xj4[] xj4Arr) {
        int i = 0;
        this.f17634f = 0;
        while (true) {
            int length = x74Arr.length;
            if (i < 2) {
                if (xj4Arr[i] != null) {
                    this.f17634f += x74Arr[i].mo13072d() != 1 ? 131072000 : 13107200;
                }
                i++;
            } else {
                this.f17629a.mo12653f(this.f17634f);
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo14123g(boolean z) {
        this.f17634f = 0;
        this.f17635g = false;
        if (z) {
            this.f17629a.mo12652e();
        }
    }

    /* renamed from: h */
    public final synchronized void mo14124h(int i) {
        this.f17632d = ((long) i) * 1000;
    }

    /* renamed from: i */
    public final synchronized void mo14125i(int i) {
        this.f17633e = ((long) i) * 1000;
    }

    /* renamed from: j */
    public final synchronized void mo14126j(int i) {
        this.f17631c = ((long) i) * 1000;
    }

    /* renamed from: k */
    public final synchronized void mo14127k(int i) {
        this.f17630b = ((long) i) * 1000;
    }

    public final long zza() {
        return 0;
    }
}
