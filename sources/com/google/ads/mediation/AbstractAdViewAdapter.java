package com.google.ads.mediation;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.internal.ads.im0;
import com.google.android.gms.internal.ads.zzcol;
import java.util.Date;
import java.util.Set;
import p060h4.C4527j2;
import p060h4.C4584t;
import p080k4.C4883a;
import p087l4.C4933e;
import p087l4.C4937i;
import p087l4.C4942n;
import p087l4.C4944p;
import p087l4.C4947s;
import p087l4.C4949u;
import p087l4.C4952x;
import p087l4.C4953y;
import p179z3.C6331f;
import p179z3.C6334g;
import p179z3.C6337h;
import p179z3.C6340j;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class AbstractAdViewAdapter implements MediationBannerAdapter, MediationNativeAdapter, C4949u, zzcol, C4953y {
    public static final String AD_UNIT_ID_PARAMETER = "pubid";
    private C6331f adLoader;
    protected C6340j mAdView;
    protected C4883a mInterstitialAd;

    /* access modifiers changed from: package-private */
    public C6334g buildAdRequest(Context context, C4933e eVar, Bundle bundle, Bundle bundle2) {
        C6334g.C6335a aVar = new C6334g.C6335a();
        Date f = eVar.mo11077f();
        if (f != null) {
            aVar.mo21660j(f);
        }
        int j = eVar.mo11080j();
        if (j != 0) {
            aVar.mo21661k(j);
        }
        Set<String> h = eVar.mo11079h();
        if (h != null) {
            for (String a : h) {
                aVar.mo21653a(a);
            }
        }
        if (eVar.mo11078g()) {
            C4584t.m30036b();
            aVar.mo21659i(im0.m14419z(context));
        }
        if (eVar.mo11075b() != -1) {
            boolean z = true;
            if (eVar.mo11075b() != 1) {
                z = false;
            }
            aVar.mo21663m(z);
        }
        aVar.mo21662l(eVar.mo11076e());
        aVar.mo21654b(AdMobAdapter.class, buildExtrasBundle(bundle, bundle2));
        return aVar.mo230c();
    }

    /* access modifiers changed from: protected */
    public abstract Bundle buildExtrasBundle(Bundle bundle, Bundle bundle2);

    public String getAdUnitId(Bundle bundle) {
        return bundle.getString(AD_UNIT_ID_PARAMETER);
    }

    public View getBannerView() {
        return this.mAdView;
    }

    /* access modifiers changed from: package-private */
    public C4883a getInterstitialAd() {
        return this.mInterstitialAd;
    }

    public Bundle getInterstitialAdapterInfo() {
        C4952x xVar = new C4952x();
        xVar.mo18827b(1);
        return xVar.mo18826a();
    }

    public C4527j2 getVideoController() {
        C6340j jVar = this.mAdView;
        if (jVar != null) {
            return jVar.mo21684e().mo21736b();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public C6331f.C6332a newAdLoader(Context context, String str) {
        return new C6331f.C6332a(context, str);
    }

    public void onDestroy() {
        C6340j jVar = this.mAdView;
        if (jVar != null) {
            jVar.mo21695a();
            this.mAdView = null;
        }
        if (this.mInterstitialAd != null) {
            this.mInterstitialAd = null;
        }
        if (this.adLoader != null) {
            this.adLoader = null;
        }
    }

    public void onImmersiveModeUpdated(boolean z) {
        C4883a aVar = this.mInterstitialAd;
        if (aVar != null) {
            aVar.mo13163d(z);
        }
    }

    public void onPause() {
        C6340j jVar = this.mAdView;
        if (jVar != null) {
            jVar.mo21697c();
        }
    }

    public void onResume() {
        C6340j jVar = this.mAdView;
        if (jVar != null) {
            jVar.mo21698d();
        }
    }

    public void requestBannerAd(Context context, C4937i iVar, Bundle bundle, C6337h hVar, C4933e eVar, Bundle bundle2) {
        C6340j jVar = new C6340j(context);
        this.mAdView = jVar;
        jVar.setAdSize(new C6337h(hVar.mo21668j(), hVar.mo21664c()));
        this.mAdView.setAdUnitId(getAdUnitId(bundle));
        this.mAdView.setAdListener(new C1998b(this, iVar));
        this.mAdView.mo21696b(buildAdRequest(context, eVar, bundle2, bundle));
    }

    public void requestInterstitialAd(Context context, C4942n nVar, Bundle bundle, C4933e eVar, Bundle bundle2) {
        C4883a.m31060b(context, getAdUnitId(bundle), buildAdRequest(context, eVar, bundle2, bundle), new C1999c(this, nVar));
    }

    public void requestNativeAd(Context context, C4944p pVar, Bundle bundle, C4947s sVar, Bundle bundle2) {
        C2001e eVar = new C2001e(this, pVar);
        C6331f.C6332a e = newAdLoader(context, bundle.getString(AD_UNIT_ID_PARAMETER)).mo21650e(eVar);
        e.mo21651f(sVar.mo14280i());
        e.mo21652g(sVar.mo14277a());
        if (sVar.mo14278c()) {
            e.mo21649d(eVar);
        }
        if (sVar.mo14279d()) {
            for (String str : sVar.zza().keySet()) {
                e.mo21647b(str, eVar, true != ((Boolean) sVar.zza().get(str)).booleanValue() ? null : eVar);
            }
        }
        C6331f a = e.mo21646a();
        this.adLoader = a;
        a.mo21644b(buildAdRequest(context, sVar, bundle2, bundle));
    }

    public void showInterstitial() {
        C4883a aVar = this.mInterstitialAd;
        if (aVar != null) {
            aVar.mo13165f((Activity) null);
        }
    }
}
