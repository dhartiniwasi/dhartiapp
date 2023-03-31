package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class kp2 implements up2 {

    /* renamed from: a */
    private final up2 f12211a;

    /* renamed from: b */
    private e91 f12212b;

    public kp2(up2 up2) {
        this.f12211a = up2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ lf3 mo8486a(wp2 wp2, tp2 tp2, Object obj) {
        return mo11757d(wp2, tp2, (e91) null);
    }

    /* renamed from: c */
    public final synchronized e91 mo8487b() {
        return this.f12212b;
    }

    /* renamed from: d */
    public final synchronized lf3 mo11757d(wp2 wp2, tp2 tp2, e91 e91) {
        this.f12212b = e91;
        if (wp2.f19735a != null) {
            a71 d = e91.mo9830d();
            return d.mo8237h(d.mo8239j(cf3.m10911i(wp2.f19735a)));
        }
        return ((jp2) this.f12211a).mo11477d(wp2, tp2, e91);
    }
}
