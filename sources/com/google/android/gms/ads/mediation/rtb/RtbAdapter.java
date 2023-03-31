package com.google.android.gms.ads.mediation.rtb;

import p087l4.C4929a;
import p087l4.C4932d;
import p087l4.C4935g;
import p087l4.C4936h;
import p087l4.C4939k;
import p087l4.C4940l;
import p087l4.C4941m;
import p087l4.C4943o;
import p087l4.C4945q;
import p087l4.C4946r;
import p087l4.C4950v;
import p101n4.C5123a;
import p101n4.C5124b;
import p179z3.C6321a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class RtbAdapter extends C4929a {
    public abstract void collectSignals(C5123a aVar, C5124b bVar);

    public void loadRtbBannerAd(C4936h hVar, C4932d<C4935g, Object> dVar) {
        loadBannerAd(hVar, dVar);
    }

    public void loadRtbInterscrollerAd(C4936h hVar, C4932d<C4939k, Object> dVar) {
        dVar.mo11381a(new C6321a(7, getClass().getSimpleName().concat(" does not support interscroller ads."), "com.google.android.gms.ads"));
    }

    public void loadRtbInterstitialAd(C4941m mVar, C4932d<C4940l, Object> dVar) {
        loadInterstitialAd(mVar, dVar);
    }

    public void loadRtbNativeAd(C4943o oVar, C4932d<C4950v, Object> dVar) {
        loadNativeAd(oVar, dVar);
    }

    public void loadRtbRewardedAd(C4946r rVar, C4932d<C4945q, Object> dVar) {
        loadRewardedAd(rVar, dVar);
    }

    public void loadRtbRewardedInterstitialAd(C4946r rVar, C4932d<C4945q, Object> dVar) {
        loadRewardedInterstitialAd(rVar, dVar);
    }
}
