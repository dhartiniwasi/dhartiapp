package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class r24 implements d74 {

    /* renamed from: a */
    private final nk4 f16799a;

    /* renamed from: b */
    private final long f16800b = gb2.m13168f0(50000);

    /* renamed from: c */
    private final long f16801c = gb2.m13168f0(50000);

    /* renamed from: d */
    private final long f16802d = gb2.m13168f0(2500);

    /* renamed from: e */
    private final long f16803e = gb2.m13168f0(5000);

    /* renamed from: f */
    private final long f16804f = gb2.m13168f0(0);

    /* renamed from: g */
    private int f16805g = 13107200;

    /* renamed from: h */
    private boolean f16806h;

    public r24() {
        nk4 nk4 = new nk4(true, 65536);
        m19539g(2500, 0, "bufferForPlaybackMs", "0");
        m19539g(5000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        m19539g(50000, 2500, "minBufferMs", "bufferForPlaybackMs");
        m19539g(50000, 5000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        m19539g(50000, 50000, "maxBufferMs", "minBufferMs");
        m19539g(0, 0, "backBufferDurationMs", "0");
        this.f16799a = nk4;
    }

    /* renamed from: g */
    private static void m19539g(int i, int i2, String str, String str2) {
        boolean z = i >= i2;
        v91.m22051e(z, str + " cannot be less than " + str2);
    }

    /* renamed from: h */
    private final void m19540h(boolean z) {
        this.f16805g = 13107200;
        this.f16806h = false;
        if (z) {
            this.f16799a.mo12652e();
        }
    }

    /* renamed from: T */
    public final boolean mo9444T() {
        return false;
    }

    /* renamed from: V */
    public final nk4 mo9445V() {
        return this.f16799a;
    }

    /* renamed from: a */
    public final boolean mo9446a(long j, float f, boolean z, long j2) {
        long j3;
        long e0 = gb2.m13166e0(j, f);
        if (z) {
            j3 = this.f16803e;
        } else {
            j3 = this.f16802d;
        }
        if (j2 != -9223372036854775807L) {
            j3 = Math.min(j2 / 2, j3);
        }
        return j3 <= 0 || e0 >= j3 || this.f16799a.mo12648a() >= this.f16805g;
    }

    /* renamed from: b */
    public final void mo9447b() {
        m19540h(true);
    }

    /* renamed from: c */
    public final boolean mo9448c(long j, long j2, float f) {
        int a = this.f16799a.mo12648a();
        int i = this.f16805g;
        long j3 = this.f16800b;
        if (f > 1.0f) {
            j3 = Math.min(gb2.m13162c0(j3, f), this.f16801c);
        }
        boolean z = false;
        if (j2 < Math.max(j3, 500000)) {
            if (a < i) {
                z = true;
            }
            this.f16806h = z;
            if (!z && j2 < 500000) {
                ot1.m18060e("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j2 >= this.f16801c || a >= i) {
            this.f16806h = false;
        }
        return this.f16806h;
    }

    /* renamed from: d */
    public final void mo9449d() {
        m19540h(false);
    }

    /* renamed from: e */
    public final void mo9450e() {
        m19540h(true);
    }

    /* renamed from: f */
    public final void mo9451f(x74[] x74Arr, ki4 ki4, xj4[] xj4Arr) {
        int i = 0;
        int i2 = 0;
        while (true) {
            int length = x74Arr.length;
            int i3 = 13107200;
            if (i < 2) {
                if (xj4Arr[i] != null) {
                    if (x74Arr[i].mo13072d() != 1) {
                        i3 = 131072000;
                    }
                    i2 += i3;
                }
                i++;
            } else {
                int max = Math.max(13107200, i2);
                this.f16805g = max;
                this.f16799a.mo12653f(max);
                return;
            }
        }
    }

    public final long zza() {
        return this.f16804f;
    }
}
