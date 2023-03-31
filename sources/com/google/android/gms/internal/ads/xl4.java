package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.Display;
import android.view.Surface;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class xl4 {

    /* renamed from: a */
    private final jl4 f20196a = new jl4();

    /* renamed from: b */
    private final tl4 f20197b;

    /* renamed from: c */
    private final wl4 f20198c;

    /* renamed from: d */
    private boolean f20199d;

    /* renamed from: e */
    private Surface f20200e;

    /* renamed from: f */
    private float f20201f;

    /* renamed from: g */
    private float f20202g;

    /* renamed from: h */
    private float f20203h;

    /* renamed from: i */
    private float f20204i;

    /* renamed from: j */
    private int f20205j;

    /* renamed from: k */
    private long f20206k;

    /* renamed from: l */
    private long f20207l;

    /* renamed from: m */
    private long f20208m;

    /* renamed from: n */
    private long f20209n;

    /* renamed from: o */
    private long f20210o;

    /* renamed from: p */
    private long f20211p;

    /* renamed from: q */
    private long f20212q;

    public xl4(Context context) {
        tl4 tl4;
        wl4 wl4 = null;
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            int i = gb2.f9812a;
            tl4 = vl4.m22304b(applicationContext);
            if (tl4 == null) {
                tl4 = ul4.m21703b(applicationContext);
            }
        } else {
            tl4 = null;
        }
        this.f20197b = tl4;
        this.f20198c = tl4 != null ? wl4.m22856a() : wl4;
        this.f20206k = -9223372036854775807L;
        this.f20207l = -9223372036854775807L;
        this.f20201f = -1.0f;
        this.f20204i = 1.0f;
        this.f20205j = 0;
    }

    /* renamed from: b */
    public static /* synthetic */ void m23368b(xl4 xl4, Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            xl4.f20206k = refreshRate;
            xl4.f20207l = (refreshRate * 80) / 100;
            return;
        }
        ot1.m18060e("VideoFrameReleaseHelper", "Unable to query display refresh rate");
        xl4.f20206k = -9223372036854775807L;
        xl4.f20207l = -9223372036854775807L;
    }

    /* renamed from: k */
    private final void m23369k() {
        Surface surface;
        if (gb2.f9812a >= 30 && (surface = this.f20200e) != null && this.f20205j != Integer.MIN_VALUE && this.f20203h != 0.0f) {
            this.f20203h = 0.0f;
            sl4.m20485a(surface, 0.0f);
        }
    }

    /* renamed from: l */
    private final void m23370l() {
        this.f20208m = 0;
        this.f20211p = -1;
        this.f20209n = -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0055, code lost:
        if (java.lang.Math.abs(r0 - r10.f20202g) >= r2) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0060, code lost:
        if (r10.f20196a.mo11432b() >= 30) goto L_0x0064;
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m23371m() {
        /*
            r10 = this;
            int r0 = com.google.android.gms.internal.ads.gb2.f9812a
            r1 = 30
            if (r0 < r1) goto L_0x006d
            android.view.Surface r0 = r10.f20200e
            if (r0 != 0) goto L_0x000b
            goto L_0x006d
        L_0x000b:
            com.google.android.gms.internal.ads.jl4 r0 = r10.f20196a
            boolean r0 = r0.mo11437g()
            if (r0 == 0) goto L_0x001a
            com.google.android.gms.internal.ads.jl4 r0 = r10.f20196a
            float r0 = r0.mo11431a()
            goto L_0x001c
        L_0x001a:
            float r0 = r10.f20201f
        L_0x001c:
            float r2 = r10.f20202g
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 != 0) goto L_0x0023
            return
        L_0x0023:
            r3 = 1
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            r5 = 0
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0058
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x0058
            com.google.android.gms.internal.ads.jl4 r1 = r10.f20196a
            boolean r1 = r1.mo11437g()
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L_0x004b
            com.google.android.gms.internal.ads.jl4 r1 = r10.f20196a
            long r6 = r1.mo11434d()
            r8 = 5000000000(0x12a05f200, double:2.470328229E-314)
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 < 0) goto L_0x004b
            r2 = 1017370378(0x3ca3d70a, float:0.02)
        L_0x004b:
            float r1 = r10.f20202g
            float r1 = r0 - r1
            float r1 = java.lang.Math.abs(r1)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 < 0) goto L_0x0063
            goto L_0x0064
        L_0x0058:
            if (r6 != 0) goto L_0x0068
            com.google.android.gms.internal.ads.jl4 r2 = r10.f20196a
            int r2 = r2.mo11432b()
            if (r2 < r1) goto L_0x0063
            goto L_0x0064
        L_0x0063:
            r3 = 0
        L_0x0064:
            if (r3 == 0) goto L_0x0067
            goto L_0x0068
        L_0x0067:
            return
        L_0x0068:
            r10.f20202g = r0
            r10.m23372n(r5)
        L_0x006d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.xl4.m23371m():void");
    }

    /* renamed from: n */
    private final void m23372n(boolean z) {
        Surface surface;
        if (gb2.f9812a >= 30 && (surface = this.f20200e) != null && this.f20205j != Integer.MIN_VALUE) {
            float f = 0.0f;
            if (this.f20199d) {
                float f2 = this.f20202g;
                if (f2 != -1.0f) {
                    f = this.f20204i * f2;
                }
            }
            if (z || this.f20203h != f) {
                this.f20203h = f;
                sl4.m20485a(surface, f);
            }
        }
    }

    /* renamed from: a */
    public final long mo15181a(long j) {
        long j2;
        if (this.f20211p != -1 && this.f20196a.mo11437g()) {
            long c = this.f20212q + ((long) (((float) (this.f20196a.mo11433c() * (this.f20208m - this.f20211p))) / this.f20204i));
            if (Math.abs(j - c) <= 20000000) {
                j = c;
            } else {
                m23370l();
            }
        }
        this.f20209n = this.f20208m;
        this.f20210o = j;
        wl4 wl4 = this.f20198c;
        if (wl4 == null || this.f20206k == -9223372036854775807L) {
            return j;
        }
        long j3 = wl4.f19714a;
        if (j3 == -9223372036854775807L) {
            return j;
        }
        long j4 = this.f20206k;
        long j5 = j3 + (((j - j3) / j4) * j4);
        if (j <= j5) {
            j2 = j5 - j4;
        } else {
            long j6 = j5;
            j5 = j4 + j5;
            j2 = j6;
        }
        if (j5 - j >= j - j2) {
            j5 = j2;
        }
        return j5 - this.f20207l;
    }

    /* renamed from: c */
    public final void mo15182c(float f) {
        this.f20201f = f;
        this.f20196a.mo11436f();
        m23371m();
    }

    /* renamed from: d */
    public final void mo15183d(long j) {
        long j2 = this.f20209n;
        if (j2 != -1) {
            this.f20211p = j2;
            this.f20212q = this.f20210o;
        }
        this.f20208m++;
        this.f20196a.mo11435e(j * 1000);
        m23371m();
    }

    /* renamed from: e */
    public final void mo15184e(float f) {
        this.f20204i = f;
        m23370l();
        m23372n(false);
    }

    /* renamed from: f */
    public final void mo15185f() {
        m23370l();
    }

    /* renamed from: g */
    public final void mo15186g() {
        this.f20199d = true;
        m23370l();
        if (this.f20197b != null) {
            wl4 wl4 = this.f20198c;
            Objects.requireNonNull(wl4);
            wl4.mo14949b();
            this.f20197b.mo14324a(new rl4(this));
        }
        m23372n(false);
    }

    /* renamed from: h */
    public final void mo15187h() {
        this.f20199d = false;
        tl4 tl4 = this.f20197b;
        if (tl4 != null) {
            tl4.zza();
            wl4 wl4 = this.f20198c;
            Objects.requireNonNull(wl4);
            wl4.mo14950c();
        }
        m23369k();
    }

    /* renamed from: i */
    public final void mo15188i(Surface surface) {
        if (true == (surface instanceof pl4)) {
            surface = null;
        }
        if (this.f20200e != surface) {
            m23369k();
            this.f20200e = surface;
            m23372n(true);
        }
    }

    /* renamed from: j */
    public final void mo15189j(int i) {
        if (this.f20205j != i) {
            this.f20205j = i;
            m23372n(true);
        }
    }
}
