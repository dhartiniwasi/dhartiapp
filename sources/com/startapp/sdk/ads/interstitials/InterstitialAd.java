package com.startapp.sdk.ads.interstitials;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.startapp.C8870c1;
import com.startapp.C8923e2;
import com.startapp.C9023i4;
import com.startapp.C9605vb;
import com.startapp.sdk.ads.splash.SplashAd;
import com.startapp.sdk.adsbase.ActivityExtra;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.AdsConstants;
import com.startapp.sdk.adsbase.C9381Ad;
import com.startapp.sdk.adsbase.C9396a;
import com.startapp.sdk.adsbase.C9440d;
import com.startapp.sdk.adsbase.HtmlAd;
import com.startapp.sdk.adsbase.VideoConfig;
import com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.components.ComponentLocator;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import java.util.Map;

/* compiled from: Sta */
public abstract class InterstitialAd extends HtmlAd implements C9440d {
    private static final long serialVersionUID = -8158520010577551438L;

    public InterstitialAd(Context context, AdPreferences.Placement placement) {
        super(context, placement);
    }

    /* JADX WARNING: type inference failed for: r11v8, types: [java.lang.Boolean[], java.io.Serializable] */
    @Deprecated
    /* renamed from: a */
    public boolean mo30088a(String str) {
        String a = C9396a.m49771a();
        if (!mo30092u() || !AdsCommonMetaData.f38625h.mo30445G().mo30572a().equals(VideoConfig.BackMode.DISABLED) || !a.equals("back")) {
            if (!AdsConstants.f38631f.booleanValue()) {
                setState(C9381Ad.AdState.UN_INITIALIZED);
            }
            if (mo30499j() == null) {
                mo30415a(NotDisplayedReason.INTERNAL_ERROR);
                return false;
            } else if (super.mo30091d()) {
                mo30415a(NotDisplayedReason.AD_EXPIRED);
                return false;
            } else {
                ActivityExtra activityExtra = this.activityExtra;
                boolean z = activityExtra != null && activityExtra.mo30414a();
                Intent intent = new Intent(this.f38612a, OverlayActivity.class);
                intent.putExtra("fileUrl", "exit.html");
                String[] strArr = this.trackingUrls;
                StringBuilder a2 = C8870c1.m48422a("&position=");
                a2.append(C9396a.m49771a());
                String sb = a2.toString();
                for (int i = 0; i < strArr.length; i++) {
                    if (strArr[i] != null && !"".equals(strArr[i])) {
                        strArr[i] = strArr[i] + sb;
                    }
                }
                intent.putExtra("tracking", strArr);
                intent.putExtra("trackingClickUrl", mo30504o());
                intent.putExtra("packageNames", mo30502m());
                intent.putExtra("htmlUuid", mo30500k());
                intent.putExtra("smartRedirect", this.smartRedirect);
                intent.putExtra("browserEnabled", this.inAppBrowserEnabled);
                intent.putExtra("placement", this.placement.mo30901a());
                intent.putExtra("adInfoOverride", getAdInfoOverride());
                intent.putExtra("ad", this);
                intent.putExtra("videoAd", mo30092u());
                intent.putExtra("fullscreen", z);
                intent.putExtra(AdUnitActivity.EXTRA_ORIENTATION, mo30501l() == 0 ? this.f38612a.getResources().getConfiguration().orientation : mo30501l());
                intent.putExtra("adTag", str);
                intent.putExtra("lastLoadTime", super.mo30089b());
                intent.putExtra("adCacheTtl", super.mo30090c());
                intent.putExtra("closingUrl", mo30496g());
                intent.putExtra("rewardDuration", mo30503n());
                intent.putExtra("rewardedHideTimer", mo30508s());
                if (mo30497h() != null) {
                    intent.putExtra("delayImpressionSeconds", mo30497h());
                }
                if (mo30510x() != null) {
                    intent.putExtra("delayCloseInterval", mo30510x());
                }
                intent.putExtra("sendRedirectHops", mo30509t());
                intent.putExtra("mraidAd", mo30507r());
                if (mo30507r()) {
                    intent.putExtra("activityShouldLockOrientation", false);
                }
                Map<Activity, Integer> map = C9605vb.f39316a;
                if (this instanceof SplashAd) {
                    intent.putExtra("isSplash", true);
                }
                intent.putExtra("position", a);
                intent.addFlags(343932928);
                C8923e2 f = ComponentLocator.m50248a(this.f38612a).mo31170f();
                if (f.f36719d) {
                    f.f36718c = intent;
                } else {
                    try {
                        this.f38612a.startActivity(intent);
                    } catch (Throwable th) {
                        C9023i4.m48681a(th);
                        return false;
                    }
                }
                return true;
            }
        } else {
            mo30415a(NotDisplayedReason.VIDEO_BACK);
            return false;
        }
    }

    /* renamed from: b */
    public Long mo30089b() {
        return super.mo30089b();
    }

    /* renamed from: c */
    public Long mo30090c() {
        return super.mo30090c();
    }

    /* renamed from: d */
    public boolean mo30091d() {
        return super.mo30091d();
    }

    /* renamed from: u */
    public boolean mo30092u() {
        return false;
    }

    /* renamed from: a */
    public boolean mo30087a() {
        return super.mo30087a();
    }

    /* renamed from: a */
    public void mo30086a(boolean z) {
        super.mo30086a(z);
    }
}
