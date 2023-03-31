package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.m7 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2614m7 implements C3096z7 {

    /* renamed from: a */
    private final C2577l7 f13236a;

    /* renamed from: b */
    private final y22 f13237b = new y22(32);

    /* renamed from: c */
    private int f13238c;

    /* renamed from: d */
    private int f13239d;

    /* renamed from: e */
    private boolean f13240e;

    /* renamed from: f */
    private boolean f13241f;

    public C2614m7(C2577l7 l7Var) {
        this.f13236a = l7Var;
    }

    /* renamed from: a */
    public final void mo9029a(e92 e92, tn4 tn4, C3059y7 y7Var) {
        this.f13236a.mo8684a(e92, tn4, y7Var);
        this.f13241f = true;
    }

    /* renamed from: b */
    public final void mo9030b(y22 y22, int i) {
        int i2 = i & 1;
        int k = i2 != 0 ? y22.mo15298k() + y22.mo15306s() : -1;
        if (this.f13241f) {
            if (i2 != 0) {
                this.f13241f = false;
                y22.mo15293f(k);
                this.f13239d = 0;
            } else {
                return;
            }
        }
        while (y22.mo15296i() > 0) {
            int i3 = this.f13239d;
            if (i3 < 3) {
                if (i3 == 0) {
                    int s = y22.mo15306s();
                    y22.mo15293f(y22.mo15298k() - 1);
                    if (s == 255) {
                        this.f13241f = true;
                        return;
                    }
                }
                int min = Math.min(y22.mo15296i(), 3 - this.f13239d);
                y22.mo15289b(this.f13237b.mo15295h(), this.f13239d, min);
                int i4 = this.f13239d + min;
                this.f13239d = i4;
                if (i4 == 3) {
                    this.f13237b.mo15293f(0);
                    this.f13237b.mo15292e(3);
                    this.f13237b.mo15294g(1);
                    int s2 = this.f13237b.mo15306s();
                    int s3 = this.f13237b.mo15306s();
                    this.f13240e = (s2 & 128) != 0;
                    this.f13238c = (((s2 & 15) << 8) | s3) + 3;
                    int j = this.f13237b.mo15297j();
                    int i5 = this.f13238c;
                    if (j < i5) {
                        int j2 = this.f13237b.mo15297j();
                        this.f13237b.mo15287H(Math.min(4098, Math.max(i5, j2 + j2)));
                    }
                }
            } else {
                int min2 = Math.min(y22.mo15296i(), this.f13238c - i3);
                y22.mo15289b(this.f13237b.mo15295h(), this.f13239d, min2);
                int i6 = this.f13239d + min2;
                this.f13239d = i6;
                int i7 = this.f13238c;
                if (i6 != i7) {
                    continue;
                } else {
                    if (!this.f13240e) {
                        this.f13237b.mo15292e(i7);
                    } else if (gb2.m13147Q(this.f13237b.mo15295h(), 0, i7, -1) != 0) {
                        this.f13241f = true;
                        return;
                    } else {
                        this.f13237b.mo15292e(this.f13238c - 4);
                    }
                    this.f13237b.mo15293f(0);
                    this.f13236a.mo8685b(this.f13237b);
                    this.f13239d = 0;
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo9031e() {
        this.f13241f = true;
    }
}
