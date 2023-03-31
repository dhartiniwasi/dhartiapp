package com.startapp.sdk.adsbase;

import android.app.Activity;
import android.content.Context;
import com.startapp.C9023i4;
import com.startapp.C9043j4;
import com.startapp.C9226pb;
import com.startapp.C9605vb;
import com.startapp.C9673z2;
import com.startapp.sdk.adsbase.adrules.AdRules;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataStyle;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: Sta */
public class AdsCommonMetaData implements Serializable {

    /* renamed from: a */
    public static transient Object f38618a = new Object();

    /* renamed from: b */
    public static final Integer f38619b = 18;

    /* renamed from: c */
    public static final Integer f38620c = -1;

    /* renamed from: d */
    public static final Set<String> f38621d = new HashSet(Arrays.asList(new String[]{"BOLD"}));

    /* renamed from: e */
    public static final Integer f38622e = -16777216;

    /* renamed from: f */
    public static final Integer f38623f = -14803426;

    /* renamed from: g */
    public static final Integer f38624g = -1;

    /* renamed from: h */
    public static AdsCommonMetaData f38625h = new AdsCommonMetaData();
    private static final long serialVersionUID = -4342481322424952690L;
    private String acMetadataUpdateVersion = "4.10.8";
    @C9226pb(complex = true)
    private AdRules adRules = new AdRules();
    private boolean appPresence = true;
    private boolean autoInterstitialEnabled = true;
    private Integer backgroundGradientBottom = -14606047;
    private Integer backgroundGradientTop = -14606047;
    private int defaultActivitiesBetweenAds = 1;
    private int defaultSecondsBetweenAds = 0;
    private boolean disableInAppStore = false;
    private boolean disableReturnAd = false;
    private boolean disableSplashAd = false;
    private boolean disableTwoClicks = false;
    private boolean enableForceExternalBrowser = false;
    private boolean enableSmartRedirect = true;
    private boolean enforceForeground = false;
    private Long explicitLoadIntervalMillis;
    private int forceExternalBrowserDaysInterval = 7;
    private Integer fullpageOfferWallProbability = 100;
    private Integer fullpageOverlayProbability = 0;
    private Integer homeProbability3D = 80;
    private Integer itemDescriptionTextColor = MetaDataStyle.f38986e;
    @C9226pb(type = HashSet.class)
    private Set<String> itemDescriptionTextDecoration = MetaDataStyle.f38987f;
    private Integer itemDescriptionTextSize = MetaDataStyle.f38985d;
    private Integer itemGradientBottom = -8750199;
    private Integer itemGradientTop = -14014151;
    private Integer itemTitleTextColor = MetaDataStyle.f38983b;
    @C9226pb(type = HashSet.class)
    private Set<String> itemTitleTextDecoration = MetaDataStyle.f38984c;
    private Integer itemTitleTextSize = MetaDataStyle.f38982a;
    private Integer maxAds = 10;
    private Integer poweredByBackgroundColor = f38623f;
    private Integer poweredByTextColor = f38624g;
    private Integer probability3D = 0;
    private long returnAdMinBackgroundTime = 300;
    private long smartRedirectLoadedTimeout = 1000;
    private int smartRedirectTimeout = 5;
    @C9226pb(type = HashMap.class, value = MetaDataStyle.class)
    private HashMap<String, MetaDataStyle> templates = new HashMap<>();
    private Integer titleBackgroundColor = -14803426;
    private String titleContent = "Recommended for you";
    private Integer titleLineColor = f38622e;
    private Integer titleTextColor = f38620c;
    @C9226pb(type = HashSet.class)
    private Set<String> titleTextDecoration = f38621d;
    private Integer titleTextSize = f38619b;
    @C9226pb(complex = true)
    private VideoConfig video = new VideoConfig();

    /* renamed from: a */
    public static void m49634a(Context context) {
        AdsCommonMetaData adsCommonMetaData = (AdsCommonMetaData) C9673z2.m50588a(context, "StartappAdsMetadata", AdsCommonMetaData.class);
        AdsCommonMetaData adsCommonMetaData2 = new AdsCommonMetaData();
        if (adsCommonMetaData != null) {
            boolean b = C9605vb.m50473b(adsCommonMetaData, adsCommonMetaData2);
            if (!(!"4.10.8".equals(adsCommonMetaData.acMetadataUpdateVersion)) && b) {
                C9023i4 i4Var = new C9023i4(C9043j4.f36994e);
                i4Var.f36952d = "metadata_null";
                i4Var.mo29471a();
            }
            AdRules adRules2 = adsCommonMetaData.adRules;
            adRules2.getClass();
            adRules2.f38767a = new HashSet();
            f38625h = adsCommonMetaData;
            return;
        }
        f38625h = adsCommonMetaData2;
    }

    /* renamed from: k */
    public static AdsCommonMetaData m49636k() {
        return f38625h;
    }

    /* renamed from: A */
    public Integer mo30439A() {
        return this.titleBackgroundColor;
    }

    /* renamed from: B */
    public String mo30440B() {
        return this.titleContent;
    }

    /* renamed from: C */
    public Integer mo30441C() {
        return this.titleLineColor;
    }

    /* renamed from: D */
    public Integer mo30442D() {
        return this.titleTextColor;
    }

    /* renamed from: E */
    public Set<String> mo30443E() {
        return this.titleTextDecoration;
    }

    /* renamed from: F */
    public Integer mo30444F() {
        return this.titleTextSize;
    }

    /* renamed from: G */
    public VideoConfig mo30445G() {
        return this.video;
    }

    /* renamed from: H */
    public boolean mo30446H() {
        return this.appPresence;
    }

    /* renamed from: I */
    public boolean mo30447I() {
        return this.autoInterstitialEnabled;
    }

    /* renamed from: J */
    public boolean mo30448J() {
        return this.disableInAppStore;
    }

    /* renamed from: K */
    public boolean mo30449K() {
        return this.disableReturnAd;
    }

    /* renamed from: L */
    public boolean mo30450L() {
        return this.disableSplashAd;
    }

    /* renamed from: M */
    public boolean mo30451M() {
        return this.disableTwoClicks;
    }

    /* renamed from: N */
    public boolean mo30452N() {
        return this.enableSmartRedirect;
    }

    /* renamed from: O */
    public boolean mo30453O() {
        return this.enforceForeground;
    }

    /* renamed from: b */
    public AdRules mo30456b() {
        return this.adRules;
    }

    /* renamed from: c */
    public int mo30457c() {
        return this.backgroundGradientBottom.intValue();
    }

    /* renamed from: d */
    public int mo30458d() {
        return this.backgroundGradientTop.intValue();
    }

    /* renamed from: e */
    public int mo30459e() {
        return this.forceExternalBrowserDaysInterval;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AdsCommonMetaData adsCommonMetaData = (AdsCommonMetaData) obj;
        if (this.returnAdMinBackgroundTime != adsCommonMetaData.returnAdMinBackgroundTime || this.disableReturnAd != adsCommonMetaData.disableReturnAd || this.disableSplashAd != adsCommonMetaData.disableSplashAd || this.smartRedirectTimeout != adsCommonMetaData.smartRedirectTimeout || this.smartRedirectLoadedTimeout != adsCommonMetaData.smartRedirectLoadedTimeout || this.enableSmartRedirect != adsCommonMetaData.enableSmartRedirect || this.autoInterstitialEnabled != adsCommonMetaData.autoInterstitialEnabled || this.defaultActivitiesBetweenAds != adsCommonMetaData.defaultActivitiesBetweenAds || this.defaultSecondsBetweenAds != adsCommonMetaData.defaultSecondsBetweenAds || this.disableTwoClicks != adsCommonMetaData.disableTwoClicks || this.appPresence != adsCommonMetaData.appPresence || this.disableInAppStore != adsCommonMetaData.disableInAppStore || this.forceExternalBrowserDaysInterval != adsCommonMetaData.forceExternalBrowserDaysInterval || this.enableForceExternalBrowser != adsCommonMetaData.enableForceExternalBrowser || this.enforceForeground != adsCommonMetaData.enforceForeground || !C9605vb.m50465a(this.acMetadataUpdateVersion, adsCommonMetaData.acMetadataUpdateVersion) || !C9605vb.m50465a(this.probability3D, adsCommonMetaData.probability3D) || !C9605vb.m50465a(this.homeProbability3D, adsCommonMetaData.homeProbability3D) || !C9605vb.m50465a(this.fullpageOfferWallProbability, adsCommonMetaData.fullpageOfferWallProbability) || !C9605vb.m50465a(this.fullpageOverlayProbability, adsCommonMetaData.fullpageOverlayProbability) || !C9605vb.m50465a(this.backgroundGradientTop, adsCommonMetaData.backgroundGradientTop) || !C9605vb.m50465a(this.backgroundGradientBottom, adsCommonMetaData.backgroundGradientBottom) || !C9605vb.m50465a(this.maxAds, adsCommonMetaData.maxAds) || !C9605vb.m50465a(this.explicitLoadIntervalMillis, adsCommonMetaData.explicitLoadIntervalMillis) || !C9605vb.m50465a(this.titleBackgroundColor, adsCommonMetaData.titleBackgroundColor) || !C9605vb.m50465a(this.titleContent, adsCommonMetaData.titleContent) || !C9605vb.m50465a(this.titleTextSize, adsCommonMetaData.titleTextSize) || !C9605vb.m50465a(this.titleTextColor, adsCommonMetaData.titleTextColor) || !C9605vb.m50465a(this.titleTextDecoration, adsCommonMetaData.titleTextDecoration) || !C9605vb.m50465a(this.titleLineColor, adsCommonMetaData.titleLineColor) || !C9605vb.m50465a(this.itemGradientTop, adsCommonMetaData.itemGradientTop) || !C9605vb.m50465a(this.itemGradientBottom, adsCommonMetaData.itemGradientBottom) || !C9605vb.m50465a(this.itemTitleTextSize, adsCommonMetaData.itemTitleTextSize) || !C9605vb.m50465a(this.itemTitleTextColor, adsCommonMetaData.itemTitleTextColor) || !C9605vb.m50465a(this.itemTitleTextDecoration, adsCommonMetaData.itemTitleTextDecoration) || !C9605vb.m50465a(this.itemDescriptionTextSize, adsCommonMetaData.itemDescriptionTextSize) || !C9605vb.m50465a(this.itemDescriptionTextColor, adsCommonMetaData.itemDescriptionTextColor) || !C9605vb.m50465a(this.itemDescriptionTextDecoration, adsCommonMetaData.itemDescriptionTextDecoration) || !C9605vb.m50465a(this.templates, adsCommonMetaData.templates) || !C9605vb.m50465a(this.adRules, adsCommonMetaData.adRules) || !C9605vb.m50465a(this.poweredByBackgroundColor, adsCommonMetaData.poweredByBackgroundColor) || !C9605vb.m50465a(this.poweredByTextColor, adsCommonMetaData.poweredByTextColor) || !C9605vb.m50465a(this.video, adsCommonMetaData.video)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public int mo30461f() {
        return this.defaultActivitiesBetweenAds;
    }

    /* renamed from: g */
    public int mo30462g() {
        return this.defaultSecondsBetweenAds;
    }

    /* renamed from: h */
    public Long mo30463h() {
        return this.explicitLoadIntervalMillis;
    }

    public int hashCode() {
        Object[] objArr = {this.acMetadataUpdateVersion, this.probability3D, this.homeProbability3D, this.fullpageOfferWallProbability, this.fullpageOverlayProbability, this.backgroundGradientTop, this.backgroundGradientBottom, this.maxAds, this.explicitLoadIntervalMillis, this.titleBackgroundColor, this.titleContent, this.titleTextSize, this.titleTextColor, this.titleTextDecoration, this.titleLineColor, this.itemGradientTop, this.itemGradientBottom, this.itemTitleTextSize, this.itemTitleTextColor, this.itemTitleTextDecoration, this.itemDescriptionTextSize, this.itemDescriptionTextColor, this.itemDescriptionTextDecoration, this.templates, this.adRules, this.poweredByBackgroundColor, this.poweredByTextColor, Long.valueOf(this.returnAdMinBackgroundTime), Boolean.valueOf(this.disableReturnAd), Boolean.valueOf(this.disableSplashAd), Integer.valueOf(this.smartRedirectTimeout), Long.valueOf(this.smartRedirectLoadedTimeout), Boolean.valueOf(this.enableSmartRedirect), Boolean.valueOf(this.autoInterstitialEnabled), Integer.valueOf(this.defaultActivitiesBetweenAds), Integer.valueOf(this.defaultSecondsBetweenAds), Boolean.valueOf(this.disableTwoClicks), Boolean.valueOf(this.appPresence), Boolean.valueOf(this.disableInAppStore), this.video, Integer.valueOf(this.forceExternalBrowserDaysInterval), Boolean.valueOf(this.enableForceExternalBrowser), Boolean.valueOf(this.enforceForeground)};
        Map<Activity, Integer> map = C9605vb.f39316a;
        return Arrays.deepHashCode(objArr);
    }

    /* renamed from: i */
    public int mo30465i() {
        return this.fullpageOfferWallProbability.intValue();
    }

    /* renamed from: j */
    public int mo30466j() {
        return this.fullpageOverlayProbability.intValue();
    }

    /* renamed from: l */
    public Integer mo30467l() {
        return this.itemDescriptionTextColor;
    }

    /* renamed from: m */
    public Set<String> mo30468m() {
        return this.itemDescriptionTextDecoration;
    }

    /* renamed from: n */
    public Integer mo30469n() {
        return this.itemDescriptionTextSize;
    }

    /* renamed from: o */
    public int mo30470o() {
        return this.itemGradientBottom.intValue();
    }

    /* renamed from: p */
    public int mo30471p() {
        return this.itemGradientTop.intValue();
    }

    /* renamed from: q */
    public Integer mo30472q() {
        return this.itemTitleTextColor;
    }

    /* renamed from: r */
    public Set<String> mo30473r() {
        return this.itemTitleTextDecoration;
    }

    /* renamed from: s */
    public Integer mo30474s() {
        return this.itemTitleTextSize;
    }

    /* renamed from: t */
    public int mo30475t() {
        return this.maxAds.intValue();
    }

    /* renamed from: u */
    public Integer mo30476u() {
        return this.poweredByBackgroundColor;
    }

    /* renamed from: v */
    public Integer mo30477v() {
        return this.poweredByTextColor;
    }

    /* renamed from: w */
    public int mo30478w() {
        return this.probability3D.intValue();
    }

    /* renamed from: x */
    public long mo30479x() {
        return TimeUnit.SECONDS.toMillis(this.returnAdMinBackgroundTime);
    }

    /* renamed from: y */
    public long mo30480y() {
        return this.smartRedirectLoadedTimeout;
    }

    /* renamed from: z */
    public long mo30481z() {
        return TimeUnit.SECONDS.toMillis((long) this.smartRedirectTimeout);
    }

    /* renamed from: a */
    public MetaDataStyle mo30454a(String str) {
        return this.templates.get(str);
    }

    /* renamed from: a */
    public boolean mo30455a() {
        return this.enableForceExternalBrowser;
    }

    /* renamed from: a */
    public static void m49635a(Context context, AdsCommonMetaData adsCommonMetaData) {
        synchronized (f38618a) {
            adsCommonMetaData.acMetadataUpdateVersion = "4.10.8";
            f38625h = adsCommonMetaData;
            C9673z2.m50591a(context, "StartappAdsMetadata", (Serializable) adsCommonMetaData);
        }
    }
}
