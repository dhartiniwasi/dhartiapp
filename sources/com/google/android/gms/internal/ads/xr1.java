package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class xr1 implements b44 {

    /* renamed from: a */
    private final o44 f20331a;

    public xr1(o44 o44) {
        this.f20331a = o44;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ Object mo8155d() {
        C2378fv fvVar;
        if (((m91) this.f20331a).mo12295a().f8944o.f16514a == 3) {
            fvVar = C2378fv.REWARDED_INTERSTITIAL;
        } else {
            fvVar = C2378fv.REWARD_BASED_VIDEO_AD;
        }
        j44.m14699b(fvVar);
        return fvVar;
    }
}
