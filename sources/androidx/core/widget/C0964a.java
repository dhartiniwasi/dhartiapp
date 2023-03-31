package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.core.view.C0835a0;

/* renamed from: androidx.core.widget.a */
/* compiled from: AutoScrollHelper */
public abstract class C0964a implements View.OnTouchListener {

    /* renamed from: z */
    private static final int f2661z = ViewConfiguration.getTapTimeout();

    /* renamed from: a */
    final C0965a f2662a = new C0965a();

    /* renamed from: b */
    private final Interpolator f2663b = new AccelerateInterpolator();

    /* renamed from: c */
    final View f2664c;

    /* renamed from: d */
    private Runnable f2665d;

    /* renamed from: e */
    private float[] f2666e = {0.0f, 0.0f};

    /* renamed from: f */
    private float[] f2667f = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: g */
    private int f2668g;

    /* renamed from: h */
    private int f2669h;

    /* renamed from: i */
    private float[] f2670i = {0.0f, 0.0f};

    /* renamed from: r */
    private float[] f2671r = {0.0f, 0.0f};

    /* renamed from: s */
    private float[] f2672s = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: t */
    private boolean f2673t;

    /* renamed from: u */
    boolean f2674u;

    /* renamed from: v */
    boolean f2675v;

    /* renamed from: w */
    boolean f2676w;

    /* renamed from: x */
    private boolean f2677x;

    /* renamed from: y */
    private boolean f2678y;

    /* renamed from: androidx.core.widget.a$a */
    /* compiled from: AutoScrollHelper */
    private static class C0965a {

        /* renamed from: a */
        private int f2679a;

        /* renamed from: b */
        private int f2680b;

        /* renamed from: c */
        private float f2681c;

        /* renamed from: d */
        private float f2682d;

        /* renamed from: e */
        private long f2683e = Long.MIN_VALUE;

        /* renamed from: f */
        private long f2684f = 0;

        /* renamed from: g */
        private int f2685g = 0;

        /* renamed from: h */
        private int f2686h = 0;

        /* renamed from: i */
        private long f2687i = -1;

        /* renamed from: j */
        private float f2688j;

        /* renamed from: k */
        private int f2689k;

        C0965a() {
        }

        /* renamed from: e */
        private float m4392e(long j) {
            long j2 = this.f2683e;
            if (j < j2) {
                return 0.0f;
            }
            long j3 = this.f2687i;
            if (j3 < 0 || j < j3) {
                return C0964a.m4371e(((float) (j - j2)) / ((float) this.f2679a), 0.0f, 1.0f) * 0.5f;
            }
            float f = this.f2688j;
            return (1.0f - f) + (f * C0964a.m4371e(((float) (j - j3)) / ((float) this.f2689k), 0.0f, 1.0f));
        }

        /* renamed from: g */
        private float m4393g(float f) {
            return (-4.0f * f * f) + (f * 4.0f);
        }

        /* renamed from: a */
        public void mo3587a() {
            if (this.f2684f != 0) {
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                float g = m4393g(m4392e(currentAnimationTimeMillis));
                this.f2684f = currentAnimationTimeMillis;
                float f = ((float) (currentAnimationTimeMillis - this.f2684f)) * g;
                this.f2685g = (int) (this.f2681c * f);
                this.f2686h = (int) (f * this.f2682d);
                return;
            }
            throw new RuntimeException("Cannot compute scroll delta before calling start()");
        }

        /* renamed from: b */
        public int mo3588b() {
            return this.f2685g;
        }

        /* renamed from: c */
        public int mo3589c() {
            return this.f2686h;
        }

        /* renamed from: d */
        public int mo3590d() {
            float f = this.f2681c;
            return (int) (f / Math.abs(f));
        }

        /* renamed from: f */
        public int mo3591f() {
            float f = this.f2682d;
            return (int) (f / Math.abs(f));
        }

        /* renamed from: h */
        public boolean mo3592h() {
            return this.f2687i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f2687i + ((long) this.f2689k);
        }

        /* renamed from: i */
        public void mo3593i() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f2689k = C0964a.m4372f((int) (currentAnimationTimeMillis - this.f2683e), 0, this.f2680b);
            this.f2688j = m4392e(currentAnimationTimeMillis);
            this.f2687i = currentAnimationTimeMillis;
        }

        /* renamed from: j */
        public void mo3594j(int i) {
            this.f2680b = i;
        }

        /* renamed from: k */
        public void mo3595k(int i) {
            this.f2679a = i;
        }

        /* renamed from: l */
        public void mo3596l(float f, float f2) {
            this.f2681c = f;
            this.f2682d = f2;
        }

        /* renamed from: m */
        public void mo3597m() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f2683e = currentAnimationTimeMillis;
            this.f2687i = -1;
            this.f2684f = currentAnimationTimeMillis;
            this.f2688j = 0.5f;
            this.f2685g = 0;
            this.f2686h = 0;
        }
    }

    /* renamed from: androidx.core.widget.a$b */
    /* compiled from: AutoScrollHelper */
    private class C0966b implements Runnable {
        C0966b() {
        }

        public void run() {
            C0964a aVar = C0964a.this;
            if (aVar.f2676w) {
                if (aVar.f2674u) {
                    aVar.f2674u = false;
                    aVar.f2662a.mo3597m();
                }
                C0965a aVar2 = C0964a.this.f2662a;
                if (aVar2.mo3592h() || !C0964a.this.mo3586u()) {
                    C0964a.this.f2676w = false;
                    return;
                }
                C0964a aVar3 = C0964a.this;
                if (aVar3.f2675v) {
                    aVar3.f2675v = false;
                    aVar3.mo3573c();
                }
                aVar2.mo3587a();
                C0964a.this.mo3574j(aVar2.mo3588b(), aVar2.mo3589c());
                C0835a0.m3725f0(C0964a.this.f2664c, this);
            }
        }
    }

    public C0964a(View view) {
        this.f2664c = view;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = (float) ((int) ((1575.0f * f) + 0.5f));
        mo3579o(f2, f2);
        float f3 = (float) ((int) ((f * 315.0f) + 0.5f));
        mo3581p(f3, f3);
        mo3576l(1);
        mo3578n(Float.MAX_VALUE, Float.MAX_VALUE);
        mo3584s(0.2f, 0.2f);
        mo3585t(1.0f, 1.0f);
        mo3575k(f2661z);
        mo3583r(500);
        mo3582q(500);
    }

    /* renamed from: d */
    private float m4370d(int i, float f, float f2, float f3) {
        float h = m4374h(this.f2666e[i], f2, this.f2667f[i], f);
        int i2 = (h > 0.0f ? 1 : (h == 0.0f ? 0 : -1));
        if (i2 == 0) {
            return 0.0f;
        }
        float f4 = this.f2670i[i];
        float f5 = this.f2671r[i];
        float f6 = this.f2672s[i];
        float f7 = f4 * f3;
        if (i2 > 0) {
            return m4371e(h * f7, f5, f6);
        }
        return -m4371e((-h) * f7, f5, f6);
    }

    /* renamed from: e */
    static float m4371e(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    /* renamed from: f */
    static int m4372f(int i, int i2, int i3) {
        return i > i3 ? i3 : i < i2 ? i2 : i;
    }

    /* renamed from: g */
    private float m4373g(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        int i = this.f2668g;
        if (i == 0 || i == 1) {
            if (f < f2) {
                if (f >= 0.0f) {
                    return 1.0f - (f / f2);
                }
                return (!this.f2676w || i != 1) ? 0.0f : 1.0f;
            }
        } else if (i == 2 && f < 0.0f) {
            return f / (-f2);
        }
    }

    /* renamed from: h */
    private float m4374h(float f, float f2, float f3, float f4) {
        float f5;
        float e = m4371e(f * f2, 0.0f, f3);
        float g = m4373g(f2 - f4, e) - m4373g(f4, e);
        if (g < 0.0f) {
            f5 = -this.f2663b.getInterpolation(-g);
        } else if (g <= 0.0f) {
            return 0.0f;
        } else {
            f5 = this.f2663b.getInterpolation(g);
        }
        return m4371e(f5, -1.0f, 1.0f);
    }

    /* renamed from: i */
    private void m4375i() {
        if (this.f2674u) {
            this.f2676w = false;
        } else {
            this.f2662a.mo3593i();
        }
    }

    /* renamed from: v */
    private void m4376v() {
        int i;
        if (this.f2665d == null) {
            this.f2665d = new C0966b();
        }
        this.f2676w = true;
        this.f2674u = true;
        if (this.f2673t || (i = this.f2669h) <= 0) {
            this.f2665d.run();
        } else {
            C0835a0.m3727g0(this.f2664c, this.f2665d, (long) i);
        }
        this.f2673t = true;
    }

    /* renamed from: a */
    public abstract boolean mo3571a(int i);

    /* renamed from: b */
    public abstract boolean mo3572b(int i);

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo3573c() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f2664c.onTouchEvent(obtain);
        obtain.recycle();
    }

    /* renamed from: j */
    public abstract void mo3574j(int i, int i2);

    /* renamed from: k */
    public C0964a mo3575k(int i) {
        this.f2669h = i;
        return this;
    }

    /* renamed from: l */
    public C0964a mo3576l(int i) {
        this.f2668g = i;
        return this;
    }

    /* renamed from: m */
    public C0964a mo3577m(boolean z) {
        if (this.f2677x && !z) {
            m4375i();
        }
        this.f2677x = z;
        return this;
    }

    /* renamed from: n */
    public C0964a mo3578n(float f, float f2) {
        float[] fArr = this.f2667f;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    /* renamed from: o */
    public C0964a mo3579o(float f, float f2) {
        float[] fArr = this.f2672s;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r0 != 3) goto L_0x0058;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0060 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.f2677x
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L_0x001a
            if (r0 == r2) goto L_0x0016
            r3 = 2
            if (r0 == r3) goto L_0x001e
            r6 = 3
            if (r0 == r6) goto L_0x0016
            goto L_0x0058
        L_0x0016:
            r5.m4375i()
            goto L_0x0058
        L_0x001a:
            r5.f2675v = r2
            r5.f2673t = r1
        L_0x001e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f2664c
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.m4370d(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f2664c
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.m4370d(r2, r7, r6, r3)
            androidx.core.widget.a$a r7 = r5.f2662a
            r7.mo3596l(r0, r6)
            boolean r6 = r5.f2676w
            if (r6 != 0) goto L_0x0058
            boolean r6 = r5.mo3586u()
            if (r6 == 0) goto L_0x0058
            r5.m4376v()
        L_0x0058:
            boolean r6 = r5.f2678y
            if (r6 == 0) goto L_0x0061
            boolean r6 = r5.f2676w
            if (r6 == 0) goto L_0x0061
            r1 = 1
        L_0x0061:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.C0964a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public C0964a mo3581p(float f, float f2) {
        float[] fArr = this.f2671r;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* renamed from: q */
    public C0964a mo3582q(int i) {
        this.f2662a.mo3594j(i);
        return this;
    }

    /* renamed from: r */
    public C0964a mo3583r(int i) {
        this.f2662a.mo3595k(i);
        return this;
    }

    /* renamed from: s */
    public C0964a mo3584s(float f, float f2) {
        float[] fArr = this.f2666e;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    /* renamed from: t */
    public C0964a mo3585t(float f, float f2) {
        float[] fArr = this.f2670i;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public boolean mo3586u() {
        C0965a aVar = this.f2662a;
        int f = aVar.mo3591f();
        int d = aVar.mo3590d();
        return (f != 0 && mo3572b(f)) || (d != 0 && mo3571a(d));
    }
}
