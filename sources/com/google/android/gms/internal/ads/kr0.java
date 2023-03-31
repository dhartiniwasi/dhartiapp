package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class kr0 extends gr0 {
    public kr0(ap0 ap0) {
        super(ap0);
    }

    /* renamed from: h */
    public final void mo10621h() {
    }

    /* renamed from: t */
    public final boolean mo10631t(String str) {
        String g = im0.m14407g(str);
        ap0 ap0 = (ap0) this.f10046c.get();
        if (!(ap0 == null || g == null)) {
            ap0.mo8451C(g, this);
        }
        pm0.m18667g("VideoStreamNoopCache is doing nothing.");
        mo10622i(str, g, "noop", "Noop cache is a noop.");
        return false;
    }
}
