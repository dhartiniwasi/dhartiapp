package p087l4;

import android.content.Context;
import java.util.List;
import p179z3.C6321a;

/* renamed from: l4.a */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class C4929a {
    public abstract C4951w getSDKVersionInfo();

    public abstract C4951w getVersionInfo();

    public abstract void initialize(Context context, C4930b bVar, List<C4938j> list);

    public void loadBannerAd(C4936h hVar, C4932d<C4935g, Object> dVar) {
        dVar.mo11381a(new C6321a(7, getClass().getSimpleName().concat(" does not support banner ads."), "com.google.android.gms.ads"));
    }

    public void loadInterscrollerAd(C4936h hVar, C4932d<C4939k, Object> dVar) {
        dVar.mo11381a(new C6321a(7, getClass().getSimpleName().concat(" does not support interscroller ads."), "com.google.android.gms.ads"));
    }

    public void loadInterstitialAd(C4941m mVar, C4932d<C4940l, Object> dVar) {
        dVar.mo11381a(new C6321a(7, getClass().getSimpleName().concat(" does not support interstitial ads."), "com.google.android.gms.ads"));
    }

    public void loadNativeAd(C4943o oVar, C4932d<C4950v, Object> dVar) {
        dVar.mo11381a(new C6321a(7, getClass().getSimpleName().concat(" does not support native ads."), "com.google.android.gms.ads"));
    }

    public void loadRewardedAd(C4946r rVar, C4932d<C4945q, Object> dVar) {
        dVar.mo11381a(new C6321a(7, getClass().getSimpleName().concat(" does not support rewarded ads."), "com.google.android.gms.ads"));
    }

    public void loadRewardedInterstitialAd(C4946r rVar, C4932d<C4945q, Object> dVar) {
        dVar.mo11381a(new C6321a(7, getClass().getSimpleName().concat(" does not support rewarded interstitial ads."), "com.google.android.gms.ads"));
    }
}
