package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.e4 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2313e4 {

    /* renamed from: a */
    public final int f8626a;

    /* renamed from: b */
    public int f8627b;

    /* renamed from: c */
    public int f8628c;

    /* renamed from: d */
    public long f8629d;

    /* renamed from: e */
    private final boolean f8630e;

    /* renamed from: f */
    private final y22 f8631f;

    /* renamed from: g */
    private final y22 f8632g;

    /* renamed from: h */
    private int f8633h;

    /* renamed from: i */
    private int f8634i;

    public C2313e4(y22 y22, y22 y222, boolean z) throws ea0 {
        this.f8632g = y22;
        this.f8631f = y222;
        this.f8630e = z;
        y222.mo15293f(12);
        this.f8626a = y222.mo15309v();
        y22.mo15293f(12);
        this.f8634i = y22.mo15309v();
        un4.m21756b(y22.mo15300m() != 1 ? false : true, "first_chunk must be 1");
        this.f8627b = -1;
    }

    /* renamed from: a */
    public final boolean mo9796a() {
        long j;
        int i = this.f8627b + 1;
        this.f8627b = i;
        if (i == this.f8626a) {
            return false;
        }
        if (this.f8630e) {
            j = this.f8631f.mo15281B();
        } else {
            j = this.f8631f.mo15280A();
        }
        this.f8629d = j;
        if (this.f8627b == this.f8633h) {
            this.f8628c = this.f8632g.mo15309v();
            this.f8632g.mo15294g(4);
            int i2 = -1;
            int i3 = this.f8634i - 1;
            this.f8634i = i3;
            if (i3 > 0) {
                i2 = -1 + this.f8632g.mo15309v();
            }
            this.f8633h = i2;
        }
        return true;
    }
}
