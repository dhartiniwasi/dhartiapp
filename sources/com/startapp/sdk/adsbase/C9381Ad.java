package com.startapp.sdk.adsbase;

import android.app.Activity;
import android.content.Context;
import com.startapp.C8870c1;
import com.startapp.C9055k;
import com.startapp.C9584u9;
import com.startapp.C9605vb;
import com.startapp.sdk.adsbase.adinformation.AdInformationOverrides;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason;
import com.startapp.sdk.adsbase.cache.CacheMetaData;
import com.startapp.sdk.adsbase.consent.ConsentData;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.C9450c;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest;
import com.startapp.sdk.components.ComponentLocator;
import java.io.Serializable;
import java.util.Map;

/* renamed from: com.startapp.sdk.adsbase.Ad */
/* compiled from: Sta */
public abstract class C9381Ad implements Serializable {

    /* renamed from: b */
    public static boolean f38611b = false;
    private static final long serialVersionUID = -9152265423662238762L;

    /* renamed from: a */
    public transient Context f38612a;
    public ActivityExtra activityExtra;
    public Long adCacheTtl = null;
    private AdInformationOverrides adInfoOverride;
    public boolean belowMinCPM = false;
    public ConsentData consentData;
    public String errorMessage;
    public Serializable extraData = null;
    private Long lastLoadTime = null;
    private NotDisplayedReason notDisplayedReason;
    public AdPreferences.Placement placement;
    private String requestUrl;
    private AdState state = AdState.UN_INITIALIZED;
    private AdType type;
    private boolean videoCancelCallBack;

    /* renamed from: com.startapp.sdk.adsbase.Ad$AdState */
    /* compiled from: Sta */
    public enum AdState {
        UN_INITIALIZED,
        PROCESSING,
        READY
    }

    /* renamed from: com.startapp.sdk.adsbase.Ad$AdType */
    /* compiled from: Sta */
    public enum AdType {
        INTERSTITIAL,
        RICH_TEXT,
        VIDEO,
        REWARDED_VIDEO,
        NON_VIDEO,
        VIDEO_NO_VAST
    }

    /* renamed from: com.startapp.sdk.adsbase.Ad$a */
    /* compiled from: Sta */
    public class C9382a implements AdEventListener {

        /* renamed from: a */
        public final /* synthetic */ AdEventListener f38613a;

        public C9382a(AdEventListener adEventListener) {
            this.f38613a = adEventListener;
        }

        public void onFailedToReceiveAd(C9381Ad ad) {
            C9055k.m48716a(C9381Ad.this.f38612a, this.f38613a, ad, false);
            String errorMessage = ad != null ? ad.getErrorMessage() : null;
            String str = "";
            if (errorMessage == null) {
                errorMessage = str;
            } else if (errorMessage.contains("204")) {
                errorMessage = "NO FILL";
            }
            Context context = C9381Ad.this.f38612a;
            StringBuilder a = C8870c1.m48422a("Failed to load ");
            if (ad != null) {
                str = C9605vb.m50449a(ad);
            }
            a.append(str);
            a.append(" ad: ");
            a.append(errorMessage);
            C9605vb.m50457a(context, 6, a.toString(), true);
        }

        public void onReceiveAd(C9381Ad ad) {
            C9381Ad.m49622a(C9381Ad.this, Long.valueOf(System.currentTimeMillis()));
            C9055k.m48717b(C9381Ad.this.f38612a, this.f38613a, ad, false);
            ConsentData consentData = ad.getConsentData();
            if (consentData != null) {
                ComponentLocator.m50248a(C9381Ad.this.f38612a).mo31170f().mo29321a(consentData.mo30756f(), consentData.mo30755e(), consentData.mo30745a(), false, true);
            }
            Context context = C9381Ad.this.f38612a;
            StringBuilder a = C8870c1.m48422a("Loaded ");
            a.append(C9605vb.m50449a(ad));
            a.append(" ad with creative ID - ");
            a.append(ad.getAdId());
            C9605vb.m50457a(context, 4, a.toString(), true);
        }
    }

    /* renamed from: com.startapp.sdk.adsbase.Ad$b */
    /* compiled from: Sta */
    public class C9383b implements C9450c {

        /* renamed from: a */
        public final /* synthetic */ AdPreferences f38615a;

        /* renamed from: b */
        public final /* synthetic */ AdEventListener f38616b;

        public C9383b(AdPreferences adPreferences, AdEventListener adEventListener) {
            this.f38615a = adPreferences;
            this.f38616b = adEventListener;
        }

        /* renamed from: a */
        public void mo29320a(MetaDataRequest.RequestReason requestReason, boolean z) {
            C9381Ad.this.mo30023a(this.f38615a, this.f38616b);
        }

        /* renamed from: a */
        public void mo29319a(MetaDataRequest.RequestReason requestReason) {
            C9381Ad.this.mo30023a(this.f38615a, this.f38616b);
        }
    }

    public C9381Ad(Context context, AdPreferences.Placement placement2) {
        this.f38612a = context;
        this.placement = placement2;
        Map<Activity, Integer> map = C9605vb.f39316a;
        this.adInfoOverride = AdInformationOverrides.m49816a();
    }

    /* renamed from: a */
    public void mo30415a(NotDisplayedReason notDisplayedReason2) {
        this.notDisplayedReason = notDisplayedReason2;
    }

    /* renamed from: a */
    public abstract void mo30023a(AdPreferences adPreferences, AdEventListener adEventListener);

    /* renamed from: b */
    public Long mo30089b() {
        return this.lastLoadTime;
    }

    /* renamed from: c */
    public Long mo30090c() {
        long e = mo30105e();
        Long l = this.adCacheTtl;
        if (l != null) {
            e = Math.min(l.longValue(), e);
        }
        return Long.valueOf(e);
    }

    /* renamed from: d */
    public boolean mo30091d() {
        if (this.lastLoadTime != null && System.currentTimeMillis() - this.lastLoadTime.longValue() > mo30090c().longValue()) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public long mo30105e() {
        return CacheMetaData.f38782a.mo30676a().mo30662a();
    }

    /* renamed from: f */
    public AdPreferences.Placement mo30416f() {
        return this.placement;
    }

    public abstract String getAdId();

    public AdInformationOverrides getAdInfoOverride() {
        return this.adInfoOverride;
    }

    public abstract String getBidToken();

    public final ConsentData getConsentData() {
        return this.consentData;
    }

    public Context getContext() {
        return this.f38612a;
    }

    public String getDParam() {
        return null;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public Serializable getExtraData() {
        return this.extraData;
    }

    public NotDisplayedReason getNotDisplayedReason() {
        return this.notDisplayedReason;
    }

    public String getRequestUrl() {
        return this.requestUrl;
    }

    public AdState getState() {
        return this.state;
    }

    public AdType getType() {
        return this.type;
    }

    public boolean isBelowMinCPM() {
        return this.belowMinCPM;
    }

    public boolean isReady() {
        return this.state == AdState.READY && !mo30091d();
    }

    @Deprecated
    public void load() {
        load(new AdPreferences(), (AdEventListener) null);
    }

    public void setActivityExtra(ActivityExtra activityExtra2) {
        this.activityExtra = activityExtra2;
    }

    public void setAdInfoOverride(AdInformationOverrides adInformationOverrides) {
        this.adInfoOverride = adInformationOverrides;
    }

    public void setContext(Context context) {
        this.f38612a = context;
    }

    public void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public void setExtraData(Serializable serializable) {
        this.extraData = serializable;
    }

    public void setRequestUrl(String str) {
        this.requestUrl = str;
    }

    public void setState(AdState adState) {
        this.state = adState;
    }

    /* renamed from: a */
    public static void m49622a(C9381Ad ad, Long l) {
        ad.lastLoadTime = l;
    }

    @Deprecated
    public void load(AdEventListener adEventListener) {
        load(new AdPreferences(), adEventListener);
    }

    /* renamed from: a */
    public boolean mo30087a() {
        return this.videoCancelCallBack;
    }

    @Deprecated
    public void load(AdPreferences adPreferences) {
        load(adPreferences, (AdEventListener) null);
    }

    /* renamed from: a */
    public void mo30086a(boolean z) {
        this.videoCancelCallBack = z;
    }

    @Deprecated
    public void load(AdPreferences adPreferences, AdEventListener adEventListener) {
        load(adPreferences, adEventListener, true);
    }

    public boolean load(AdPreferences adPreferences, AdEventListener adEventListener, boolean z) {
        String str;
        boolean z2;
        C9382a aVar = new C9382a(adEventListener);
        if (!f38611b) {
            SimpleTokenUtils.m49715f(this.f38612a);
            f38611b = true;
        }
        if (this.state != AdState.UN_INITIALIZED) {
            str = "load() was already called.";
            z2 = true;
        } else {
            str = "";
            z2 = false;
        }
        if (!C9605vb.m50482g(this.f38612a)) {
            str = "network not available.";
            z2 = true;
        }
        if (!MetaData.f38952k.mo31019b()) {
            str = "serving ads disabled";
            z2 = true;
        }
        if (z2) {
            setErrorMessage("Ad wasn't loaded: " + str);
            C9055k.m48716a(this.f38612a, aVar, this, false);
            return false;
        }
        setState(AdState.PROCESSING);
        C9383b bVar = new C9383b(adPreferences, aVar);
        if (adPreferences.getType() != null) {
            this.type = adPreferences.getType();
        }
        if (adPreferences.getPlacementId() == null) {
            adPreferences.setPlacementId(C9396a.m49772a(this.f38612a, (Object) this));
        }
        MetaData.f38952k.mo31015a(this.f38612a, adPreferences, C9584u9.f39253d.f39256c, z, bVar, false);
        return true;
    }
}
