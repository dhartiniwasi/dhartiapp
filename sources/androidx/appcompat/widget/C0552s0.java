package androidx.appcompat.widget;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.appcompat.widget.s0 */
/* compiled from: RtlSpacingHelper */
class C0552s0 {

    /* renamed from: a */
    private int f1799a = 0;

    /* renamed from: b */
    private int f1800b = 0;

    /* renamed from: c */
    private int f1801c = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: d */
    private int f1802d = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: e */
    private int f1803e = 0;

    /* renamed from: f */
    private int f1804f = 0;

    /* renamed from: g */
    private boolean f1805g = false;

    /* renamed from: h */
    private boolean f1806h = false;

    C0552s0() {
    }

    /* renamed from: a */
    public int mo2582a() {
        return this.f1805g ? this.f1799a : this.f1800b;
    }

    /* renamed from: b */
    public int mo2583b() {
        return this.f1799a;
    }

    /* renamed from: c */
    public int mo2584c() {
        return this.f1800b;
    }

    /* renamed from: d */
    public int mo2585d() {
        return this.f1805g ? this.f1800b : this.f1799a;
    }

    /* renamed from: e */
    public void mo2586e(int i, int i2) {
        this.f1806h = false;
        if (i != Integer.MIN_VALUE) {
            this.f1803e = i;
            this.f1799a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f1804f = i2;
            this.f1800b = i2;
        }
    }

    /* renamed from: f */
    public void mo2587f(boolean z) {
        if (z != this.f1805g) {
            this.f1805g = z;
            if (!this.f1806h) {
                this.f1799a = this.f1803e;
                this.f1800b = this.f1804f;
            } else if (z) {
                int i = this.f1802d;
                if (i == Integer.MIN_VALUE) {
                    i = this.f1803e;
                }
                this.f1799a = i;
                int i2 = this.f1801c;
                if (i2 == Integer.MIN_VALUE) {
                    i2 = this.f1804f;
                }
                this.f1800b = i2;
            } else {
                int i3 = this.f1801c;
                if (i3 == Integer.MIN_VALUE) {
                    i3 = this.f1803e;
                }
                this.f1799a = i3;
                int i4 = this.f1802d;
                if (i4 == Integer.MIN_VALUE) {
                    i4 = this.f1804f;
                }
                this.f1800b = i4;
            }
        }
    }

    /* renamed from: g */
    public void mo2588g(int i, int i2) {
        this.f1801c = i;
        this.f1802d = i2;
        this.f1806h = true;
        if (this.f1805g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f1799a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f1800b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f1799a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f1800b = i2;
        }
    }
}
