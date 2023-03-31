package com.startapp.sdk.adsbase.remoteconfig;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.startapp.C8837b0;
import com.startapp.C8870c1;
import com.startapp.C8922e1;
import com.startapp.C8941f1;
import com.startapp.C8960g1;
import com.startapp.C9023i4;
import com.startapp.C9043j4;
import com.startapp.C9226pb;
import com.startapp.C9605vb;
import com.startapp.C9673z2;
import com.startapp.sdk.adsbase.AdsConstants;
import com.startapp.sdk.adsbase.C9441e;
import com.startapp.sdk.adsbase.consent.ConsentConfig;
import com.startapp.sdk.adsbase.crashreport.ANRRemoteConfig;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest;
import com.startapp.sdk.common.Constants;
import com.startapp.sdk.components.ComponentLocator;
import com.startapp.sdk.insight.NetworkTestsMetaData;
import com.startapp.sdk.triggeredlinks.TriggeredLinksMetadata;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Sta */
public class MetaData implements Serializable {

    /* renamed from: d */
    public static final Object f38945d = new Object();

    /* renamed from: e */
    public static final AtomicBoolean f38946e = new AtomicBoolean();

    /* renamed from: f */
    public static final Set<String> f38947f = new HashSet(Arrays.asList(new String[]{Constants.f39008a}));

    /* renamed from: g */
    public static final List<String> f38948g = Arrays.asList(new String[]{"https://adsmetadata.startappservice.com/adsmetadata/api/v1.0/", "https://adsmetadata.mobileadexchange.net/adsmetadata/api/v1.0/", "https://d26xw8rp6mlgfg.cloudfront.net/adsmetadata/api/v1.0/"});

    /* renamed from: h */
    public static final String f38949h = "https://req.startappservice.com/1.5/";

    /* renamed from: i */
    public static final int[] f38950i = {60, 60, 240};

    /* renamed from: j */
    public static final Set<String> f38951j = new HashSet(Arrays.asList(new String[]{"com.facebook.katana", "com.yandex.browser"}));

    /* renamed from: k */
    public static volatile MetaData f38952k = new MetaData();

    /* renamed from: l */
    public static C9448a f38953l = null;
    private static final long serialVersionUID = 1334388150114613056L;
    private long IABDisplayImpressionDelayInSeconds;
    private long IABVideoImpressionDelayInSeconds;
    @C9226pb(complex = true)
    private SimpleTokenConfig SimpleToken = new SimpleTokenConfig();
    private boolean SupportIABViewability;

    /* renamed from: a */
    public transient boolean f38954a;
    @C9226pb(complex = true, name = "debug")
    private AdDebuggerMetadata adDebugger;
    private String adPlatformBannerHostSecured;
    public String adPlatformHostSecured;
    private String adPlatformNativeHostSecured;
    private String adPlatformOverlayHostSecured;
    private String adPlatformReturnHostSecured;
    private String adPlatformSplashHostSecured;
    @C9226pb(complex = true)
    private AdvertisingIdResolverMetadata air;
    private boolean alwaysSendToken;
    @C9226pb(complex = true)
    public AnalyticsConfig analytics;
    @C9226pb(complex = true)
    private ANRRemoteConfig anrConfig;
    @C9226pb(complex = true)
    private AppSessionConfig appSession;
    private String assetsBaseUrlSecured;

    /* renamed from: b */
    public transient boolean f38955b;
    @C9226pb(complex = true)
    private BluetoothConfig btConfig;

    /* renamed from: c */
    public transient List<C9450c> f38956c;
    private String calcProd;
    private boolean chromeCustomeTabsExternal;
    private boolean chromeCustomeTabsInternal;
    private boolean closeAdAfterClick;
    private boolean compressionEnabled;
    @C9226pb(complex = true)
    private ConnectivityHelperMetadata connectivity;
    @C9226pb(complex = true)
    private ConsentConfig consentDetails;
    private boolean disableSendAdvertisingId;
    private boolean dns;
    private double flh;
    @C9226pb(complex = true)
    private ComponentInfoEventConfig httpClientInfoEvents;
    @C9226pb(complex = true)
    private ImpressionsTrackingMetadata impressionsTracking;
    private boolean inAppBrowser;
    @C9226pb(type = HashSet.class)
    private Set<String> installersList;
    private boolean isToken1Mandatory;
    private String lastVersion;
    @C9226pb(complex = true)
    private LocationMetadata location;
    @C9226pb(type = ArrayList.class)
    public List<String> metaDataHosts = f38948g;
    private String metadataUpdateVersion;
    @C9226pb(complex = true)
    private MotionMetadata motion;
    @C9226pb(complex = true)
    private NetworkDiagnosticConfig netDiag;
    @C9226pb(complex = true)
    private NetworkTestsMetaData networkTests;
    private int notVisibleBannerReloadInterval;
    private boolean omSdkEnabled;
    private int[] periodicEventIntMin;
    private int[] periodicForegroundEventSec;
    private boolean periodicInfoEventEnabled;
    private boolean periodicMetaDataEnabled;
    private int periodicMetaDataIntervalInMinutes;
    @C9226pb(type = HashSet.class)
    private Set<String> preInstalledPackages;
    private String profileId;
    @C9226pb(complex = true)
    private RcdMetadata rcd;
    @C9226pb(complex = true)
    private RscMetadata rsc;
    @C9226pb(complex = true)
    private SensorsConfig sensorsConfig;
    private int sessionMaxBackgroundTime;
    private boolean simpleToken2;
    @C9226pb(complex = true)
    private StaleDcConfig staleDc;
    private int stopAutoLoadAmount;
    private int stopAutoLoadPreCacheAmount;
    @C9226pb(complex = true)
    private TelephonyMetadata telephony;
    public String trackDownloadHost;
    @C9226pb(complex = true)
    private TriggeredLinksMetadata triggeredLinks;
    private boolean trueNetEnabled;
    private String vastRecorderHost;
    @C9226pb(complex = true, name = "wvf")
    private WvfMetadata webViewFactory;
    private boolean webViewSecured;

    /* renamed from: com.startapp.sdk.adsbase.remoteconfig.MetaData$a */
    /* compiled from: Sta */
    public static class C9447a implements C8960g1.C8963b {

        /* renamed from: a */
        public Context f38957a;

        /* renamed from: b */
        public String f38958b;

        public C9447a(Context context, String str) {
            this.f38957a = context;
            this.f38958b = str;
        }

        /* renamed from: a */
        public void mo29358a(Bitmap bitmap, int i) {
            if (bitmap != null) {
                Context context = this.f38957a;
                String str = this.f38958b;
                Map<String, Bitmap> map = C8941f1.f36750a;
                ComponentLocator.m50248a(context).mo31173i().execute(new C8922e1(str, ".png", bitmap, context));
            }
        }
    }

    public MetaData() {
        String str = f38949h;
        this.adPlatformHostSecured = str;
        this.trackDownloadHost = str;
        this.sessionMaxBackgroundTime = 1800;
        this.profileId = null;
        this.installersList = f38947f;
        this.preInstalledPackages = f38951j;
        this.simpleToken2 = true;
        this.alwaysSendToken = true;
        this.isToken1Mandatory = true;
        this.compressionEnabled = false;
        this.periodicMetaDataEnabled = false;
        this.periodicMetaDataIntervalInMinutes = 360;
        this.periodicInfoEventEnabled = false;
        this.periodicEventIntMin = f38950i;
        this.inAppBrowser = true;
        this.SupportIABViewability = true;
        this.IABDisplayImpressionDelayInSeconds = 1;
        this.IABVideoImpressionDelayInSeconds = 2;
        this.sensorsConfig = new SensorsConfig();
        this.btConfig = new BluetoothConfig();
        this.assetsBaseUrlSecured = "";
        this.notVisibleBannerReloadInterval = 3600;
        this.analytics = new AnalyticsConfig();
        this.f38954a = false;
        this.f38955b = false;
        this.f38956c = new ArrayList();
        this.metadataUpdateVersion = "4.10.8";
        this.dns = false;
        this.stopAutoLoadAmount = 3;
        this.stopAutoLoadPreCacheAmount = 3;
        this.trueNetEnabled = false;
        this.webViewSecured = true;
        this.omSdkEnabled = false;
        this.chromeCustomeTabsInternal = true;
        this.chromeCustomeTabsExternal = true;
        this.disableSendAdvertisingId = false;
        this.networkTests = new NetworkTestsMetaData();
        this.staleDc = new StaleDcConfig();
        this.telephony = new TelephonyMetadata();
        this.anrConfig = new ANRRemoteConfig();
        this.impressionsTracking = null;
        this.connectivity = new ConnectivityHelperMetadata();
        this.appSession = new AppSessionConfig();
    }

    /* renamed from: a */
    public static void m50087a(MetaData metaData) {
        synchronized (f38945d) {
            metaData.f38956c.addAll(f38952k.f38956c);
            f38952k = metaData;
        }
    }

    /* renamed from: v */
    public static MetaData m50090v() {
        return f38952k;
    }

    /* renamed from: A */
    public NetworkTestsMetaData mo30985A() {
        return this.networkTests;
    }

    /* renamed from: B */
    public int mo30986B() {
        return this.notVisibleBannerReloadInterval;
    }

    /* renamed from: C */
    public int mo30987C() {
        return this.periodicMetaDataIntervalInMinutes;
    }

    /* renamed from: D */
    public Set<String> mo30988D() {
        Set<String> set = this.preInstalledPackages;
        if (set == null) {
            set = f38951j;
        }
        return Collections.unmodifiableSet(set);
    }

    /* renamed from: E */
    public String mo30989E() {
        return this.profileId;
    }

    /* renamed from: F */
    public RcdMetadata mo30990F() {
        return this.rcd;
    }

    /* renamed from: G */
    public RscMetadata mo30991G() {
        return this.rsc;
    }

    /* renamed from: H */
    public SensorsConfig mo30992H() {
        return this.sensorsConfig;
    }

    /* renamed from: I */
    public long mo30993I() {
        return TimeUnit.SECONDS.toMillis((long) this.sessionMaxBackgroundTime);
    }

    /* renamed from: J */
    public SimpleTokenConfig mo30994J() {
        return this.SimpleToken;
    }

    /* renamed from: K */
    public StaleDcConfig mo30995K() {
        return this.staleDc;
    }

    /* renamed from: L */
    public int mo30996L() {
        return this.stopAutoLoadAmount;
    }

    /* renamed from: M */
    public int mo30997M() {
        return this.stopAutoLoadPreCacheAmount;
    }

    /* renamed from: N */
    public TelephonyMetadata mo30998N() {
        return this.telephony;
    }

    /* renamed from: O */
    public TriggeredLinksMetadata mo30999O() {
        return this.triggeredLinks;
    }

    /* renamed from: P */
    public String mo31000P() {
        return this.vastRecorderHost;
    }

    /* renamed from: Q */
    public WvfMetadata mo31001Q() {
        return this.webViewFactory;
    }

    /* renamed from: R */
    public boolean mo31002R() {
        return this.alwaysSendToken;
    }

    /* renamed from: S */
    public boolean mo31003S() {
        return this.compressionEnabled;
    }

    /* renamed from: T */
    public boolean mo31004T() {
        Map<Activity, Integer> map = C9605vb.f39316a;
        return this.inAppBrowser;
    }

    /* renamed from: U */
    public boolean mo31005U() {
        return this.omSdkEnabled;
    }

    /* renamed from: V */
    public boolean mo31006V() {
        return this.periodicForegroundEventSec != null;
    }

    /* renamed from: W */
    public boolean mo31007W() {
        return this.periodicInfoEventEnabled;
    }

    /* renamed from: X */
    public boolean mo31008X() {
        return this.periodicMetaDataEnabled;
    }

    /* renamed from: Y */
    public boolean mo31009Y() {
        return this.SupportIABViewability;
    }

    /* renamed from: Z */
    public boolean mo31010Z() {
        return this.isToken1Mandatory;
    }

    /* renamed from: a0 */
    public AppSessionConfig mo31017a0() {
        return this.appSession;
    }

    /* renamed from: b */
    public int mo31018b(Context context) {
        return m50084a(context, this.periodicEventIntMin);
    }

    /* renamed from: c */
    public AdDebuggerMetadata mo31020c() {
        return this.adDebugger;
    }

    /* renamed from: d */
    public String mo31021d() {
        String str = this.adPlatformHostSecured;
        return str != null ? str : f38949h;
    }

    /* renamed from: e */
    public AdvertisingIdResolverMetadata mo31022e() {
        return this.air;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MetaData metaData = (MetaData) obj;
        if (this.sessionMaxBackgroundTime != metaData.sessionMaxBackgroundTime || this.simpleToken2 != metaData.simpleToken2 || this.alwaysSendToken != metaData.alwaysSendToken || this.isToken1Mandatory != metaData.isToken1Mandatory || this.compressionEnabled != metaData.compressionEnabled || this.periodicMetaDataEnabled != metaData.periodicMetaDataEnabled || this.periodicMetaDataIntervalInMinutes != metaData.periodicMetaDataIntervalInMinutes || this.periodicInfoEventEnabled != metaData.periodicInfoEventEnabled || this.inAppBrowser != metaData.inAppBrowser || this.SupportIABViewability != metaData.SupportIABViewability || this.IABDisplayImpressionDelayInSeconds != metaData.IABDisplayImpressionDelayInSeconds || this.IABVideoImpressionDelayInSeconds != metaData.IABVideoImpressionDelayInSeconds || this.notVisibleBannerReloadInterval != metaData.notVisibleBannerReloadInterval || this.dns != metaData.dns || this.stopAutoLoadAmount != metaData.stopAutoLoadAmount || this.stopAutoLoadPreCacheAmount != metaData.stopAutoLoadPreCacheAmount || this.trueNetEnabled != metaData.trueNetEnabled || this.webViewSecured != metaData.webViewSecured || this.omSdkEnabled != metaData.omSdkEnabled || this.chromeCustomeTabsInternal != metaData.chromeCustomeTabsInternal || this.chromeCustomeTabsExternal != metaData.chromeCustomeTabsExternal || this.closeAdAfterClick != metaData.closeAdAfterClick || this.disableSendAdvertisingId != metaData.disableSendAdvertisingId || Double.compare(this.flh, metaData.flh) != 0 || !C9605vb.m50465a(this.SimpleToken, metaData.SimpleToken) || !C9605vb.m50465a(this.consentDetails, metaData.consentDetails) || !C9605vb.m50465a(this.calcProd, metaData.calcProd) || !C9605vb.m50465a(this.metaDataHosts, metaData.metaDataHosts) || !C9605vb.m50465a(this.adPlatformHostSecured, metaData.adPlatformHostSecured) || !C9605vb.m50465a(this.trackDownloadHost, metaData.trackDownloadHost) || !C9605vb.m50465a(this.vastRecorderHost, metaData.vastRecorderHost) || !C9605vb.m50465a(this.adPlatformBannerHostSecured, metaData.adPlatformBannerHostSecured) || !C9605vb.m50465a(this.adPlatformSplashHostSecured, metaData.adPlatformSplashHostSecured) || !C9605vb.m50465a(this.adPlatformReturnHostSecured, metaData.adPlatformReturnHostSecured) || !C9605vb.m50465a(this.adPlatformOverlayHostSecured, metaData.adPlatformOverlayHostSecured) || !C9605vb.m50465a(this.adPlatformNativeHostSecured, metaData.adPlatformNativeHostSecured) || !C9605vb.m50465a(this.profileId, metaData.profileId) || !C9605vb.m50465a(this.installersList, metaData.installersList) || !C9605vb.m50465a(this.preInstalledPackages, metaData.preInstalledPackages) || !Arrays.equals(this.periodicEventIntMin, metaData.periodicEventIntMin) || !Arrays.equals(this.periodicForegroundEventSec, metaData.periodicForegroundEventSec) || !C9605vb.m50465a(this.sensorsConfig, metaData.sensorsConfig) || !C9605vb.m50465a(this.btConfig, metaData.btConfig) || !C9605vb.m50465a(this.assetsBaseUrlSecured, metaData.assetsBaseUrlSecured) || !C9605vb.m50465a(this.httpClientInfoEvents, metaData.httpClientInfoEvents) || !C9605vb.m50465a(this.analytics, metaData.analytics) || !C9605vb.m50465a(this.metadataUpdateVersion, metaData.metadataUpdateVersion) || !C9605vb.m50465a(this.networkTests, metaData.networkTests) || !C9605vb.m50465a(this.triggeredLinks, metaData.triggeredLinks) || !C9605vb.m50465a(this.rsc, metaData.rsc) || !C9605vb.m50465a(this.rcd, metaData.rcd) || !C9605vb.m50465a(this.netDiag, metaData.netDiag) || !C9605vb.m50465a(this.staleDc, metaData.staleDc) || !C9605vb.m50465a(this.motion, metaData.motion) || !C9605vb.m50465a(this.air, metaData.air) || !C9605vb.m50465a(this.telephony, metaData.telephony) || !C9605vb.m50465a(this.anrConfig, metaData.anrConfig) || !C9605vb.m50465a(this.location, metaData.location) || !C9605vb.m50465a(this.impressionsTracking, metaData.impressionsTracking) || !C9605vb.m50465a(this.connectivity, metaData.connectivity) || !C9605vb.m50465a(this.adDebugger, metaData.adDebugger) || !C9605vb.m50465a(this.webViewFactory, metaData.webViewFactory) || !C9605vb.m50465a(this.appSession, metaData.appSession) || !C9605vb.m50465a(this.lastVersion, metaData.lastVersion)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public ANRRemoteConfig mo31024f() {
        return this.anrConfig;
    }

    /* renamed from: g */
    public String mo31025g() {
        String str = this.assetsBaseUrlSecured;
        return str != null ? str : "";
    }

    /* renamed from: h */
    public BluetoothConfig mo31026h() {
        return this.btConfig;
    }

    public int hashCode() {
        Object[] objArr = {this.SimpleToken, this.consentDetails, this.calcProd, this.metaDataHosts, this.adPlatformHostSecured, this.trackDownloadHost, this.vastRecorderHost, this.adPlatformBannerHostSecured, this.adPlatformSplashHostSecured, this.adPlatformReturnHostSecured, this.adPlatformOverlayHostSecured, this.adPlatformNativeHostSecured, Integer.valueOf(this.sessionMaxBackgroundTime), this.profileId, this.installersList, this.preInstalledPackages, Boolean.valueOf(this.simpleToken2), Boolean.valueOf(this.alwaysSendToken), Boolean.valueOf(this.isToken1Mandatory), Boolean.valueOf(this.compressionEnabled), Boolean.valueOf(this.periodicMetaDataEnabled), Integer.valueOf(this.periodicMetaDataIntervalInMinutes), Boolean.valueOf(this.periodicInfoEventEnabled), this.periodicEventIntMin, this.periodicForegroundEventSec, Boolean.valueOf(this.inAppBrowser), Boolean.valueOf(this.SupportIABViewability), Long.valueOf(this.IABDisplayImpressionDelayInSeconds), Long.valueOf(this.IABVideoImpressionDelayInSeconds), this.sensorsConfig, this.btConfig, this.assetsBaseUrlSecured, this.httpClientInfoEvents, Integer.valueOf(this.notVisibleBannerReloadInterval), this.analytics, this.metadataUpdateVersion, Boolean.valueOf(this.dns), Integer.valueOf(this.stopAutoLoadAmount), Integer.valueOf(this.stopAutoLoadPreCacheAmount), Boolean.valueOf(this.trueNetEnabled), Boolean.valueOf(this.webViewSecured), Boolean.valueOf(this.omSdkEnabled), Boolean.valueOf(this.chromeCustomeTabsInternal), Boolean.valueOf(this.chromeCustomeTabsExternal), Boolean.valueOf(this.closeAdAfterClick), Boolean.valueOf(this.disableSendAdvertisingId), Double.valueOf(this.flh), this.networkTests, this.triggeredLinks, this.rsc, this.rcd, this.netDiag, this.staleDc, this.motion, this.air, this.telephony, this.anrConfig, this.location, this.impressionsTracking, this.connectivity, this.adDebugger, this.webViewFactory, this.appSession, this.lastVersion};
        Map<Activity, Integer> map = C9605vb.f39316a;
        return Arrays.deepHashCode(objArr);
    }

    /* renamed from: i */
    public String mo31028i() {
        return this.calcProd;
    }

    /* renamed from: j */
    public boolean mo31029j() {
        return this.chromeCustomeTabsExternal;
    }

    /* renamed from: k */
    public boolean mo31030k() {
        return this.chromeCustomeTabsInternal;
    }

    /* renamed from: l */
    public boolean mo31031l() {
        return this.closeAdAfterClick;
    }

    /* renamed from: m */
    public ConnectivityHelperMetadata mo31032m() {
        return this.connectivity;
    }

    /* renamed from: n */
    public ConsentConfig mo31033n() {
        return this.consentDetails;
    }

    /* renamed from: o */
    public boolean mo31034o() {
        return this.disableSendAdvertisingId;
    }

    /* renamed from: p */
    public String mo31035p() {
        int indexOf;
        String d = f38952k.mo31021d();
        String str = (Build.VERSION.SDK_INT > 26 || this.webViewSecured) ? "https" : "http";
        if (d.startsWith(str + "://") || (indexOf = d.indexOf(58)) == -1) {
            return d;
        }
        StringBuilder a = C8870c1.m48422a(str);
        a.append(d.substring(indexOf));
        return a.toString();
    }

    /* renamed from: q */
    public ComponentInfoEventConfig mo31036q() {
        return this.httpClientInfoEvents;
    }

    /* renamed from: r */
    public long mo31037r() {
        return this.IABDisplayImpressionDelayInSeconds;
    }

    /* renamed from: s */
    public long mo31038s() {
        return this.IABVideoImpressionDelayInSeconds;
    }

    /* renamed from: t */
    public ImpressionsTrackingMetadata mo31039t() {
        return this.impressionsTracking;
    }

    /* renamed from: u */
    public Set<String> mo31040u() {
        return this.installersList;
    }

    /* renamed from: w */
    public String mo31041w() {
        return this.lastVersion;
    }

    /* renamed from: x */
    public LocationMetadata mo31042x() {
        return this.location;
    }

    /* renamed from: y */
    public MotionMetadata mo31043y() {
        return this.motion;
    }

    /* renamed from: z */
    public NetworkDiagnosticConfig mo31044z() {
        return this.netDiag;
    }

    /* renamed from: c */
    public static void m50089c(Context context) {
        if (!f38946e.getAndSet(true)) {
            MetaData metaData = (MetaData) C9673z2.m50588a(context, "StartappMetadata", MetaData.class);
            MetaData metaData2 = new MetaData();
            if (metaData != null) {
                boolean b = C9605vb.m50473b(metaData, metaData2);
                if (!(true ^ "4.10.8".equals(metaData.metadataUpdateVersion)) && b) {
                    C9023i4 i4Var = new C9023i4(C9043j4.f36994e);
                    i4Var.f36952d = "metadata_null";
                    i4Var.mo29471a();
                }
                metaData.f38954a = false;
                metaData.f38955b = false;
                metaData.f38956c = new ArrayList();
                m50087a(metaData);
            } else {
                m50087a(metaData2);
            }
            f38952k.mo31014a();
        }
    }

    /* renamed from: b */
    public boolean mo31019b() {
        return !this.dns;
    }

    /* renamed from: a */
    public static void m50085a(Context context, MetaData metaData, MetaDataRequest.RequestReason requestReason, boolean z) {
        ArrayList arrayList;
        boolean z2;
        Handler handler;
        synchronized (f38945d) {
            arrayList = new ArrayList(f38952k.f38956c);
            f38952k.f38956c.clear();
            metaData.f38956c = f38952k.f38956c;
            metaData.mo31014a();
            metaData.metadataUpdateVersion = "4.10.8";
            C9673z2.m50596b(context, "StartappMetadata", metaData);
            z2 = false;
            metaData.f38954a = false;
            metaData.f38955b = true;
            if (!C9605vb.m50465a(f38952k, metaData)) {
                z = true;
            }
            f38952k = metaData;
            if (C9605vb.m50479e(context)) {
                try {
                    C9441e d = ComponentLocator.m50248a(context).mo31168d();
                    int i = d.getInt("totalSessions", 0);
                    C9441e.C9442a a = d.edit();
                    int i2 = i + 1;
                    a.mo30812a("totalSessions", Integer.valueOf(i2));
                    a.f38873a.putInt("totalSessions", i2);
                    a.apply();
                } catch (Throwable th) {
                    C9023i4.m48681a(th);
                }
            }
            handler = null;
            f38953l = null;
        }
        if (Math.random() < f38952k.flh) {
            z2 = true;
        }
        if (z2) {
            handler = new Handler(Looper.getMainLooper());
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C9450c cVar = (C9450c) it.next();
            if (z2) {
                handler.post(new C9449b(cVar, requestReason, z));
            } else {
                cVar.mo29320a(requestReason, z);
            }
        }
    }

    /* renamed from: a */
    public static void m50088a(MetaDataRequest.RequestReason requestReason) {
        ArrayList arrayList;
        synchronized (f38945d) {
            arrayList = new ArrayList(f38952k.f38956c);
            f38952k.f38956c.clear();
            f38952k.f38954a = false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C9450c) it.next()).mo29319a(requestReason);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0015, code lost:
        if (r7 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0017, code lost:
        if (r8 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0019, code lost:
        r8.mo29320a(r6, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0051, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo31015a(android.content.Context r4, com.startapp.sdk.adsbase.model.AdPreferences r5, com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest.RequestReason r6, boolean r7, com.startapp.sdk.adsbase.remoteconfig.C9450c r8, boolean r9) {
        /*
            r3 = this;
            r0 = 0
            if (r7 != 0) goto L_0x0008
            if (r8 == 0) goto L_0x0008
            r8.mo29320a(r6, r0)
        L_0x0008:
            java.lang.Object r1 = f38945d
            monitor-enter(r1)
            com.startapp.sdk.adsbase.remoteconfig.MetaData r2 = f38952k     // Catch:{ all -> 0x0052 }
            boolean r2 = r2.f38955b     // Catch:{ all -> 0x0052 }
            if (r2 == 0) goto L_0x001d
            if (r9 == 0) goto L_0x0014
            goto L_0x001d
        L_0x0014:
            monitor-exit(r1)     // Catch:{ all -> 0x0052 }
            if (r7 == 0) goto L_0x001c
            if (r8 == 0) goto L_0x001c
            r8.mo29320a(r6, r0)
        L_0x001c:
            return
        L_0x001d:
            com.startapp.sdk.adsbase.remoteconfig.MetaData r2 = f38952k     // Catch:{ all -> 0x0052 }
            boolean r2 = r2.f38954a     // Catch:{ all -> 0x0052 }
            if (r2 == 0) goto L_0x0025
            if (r9 == 0) goto L_0x0047
        L_0x0025:
            r9 = 1
            r3.f38954a = r9     // Catch:{ all -> 0x0052 }
            r3.f38955b = r0     // Catch:{ all -> 0x0052 }
            com.startapp.sdk.adsbase.remoteconfig.a r0 = f38953l     // Catch:{ all -> 0x0052 }
            if (r0 == 0) goto L_0x0030
            r0.f38999j = r9     // Catch:{ all -> 0x0052 }
        L_0x0030:
            com.startapp.sdk.adsbase.remoteconfig.a r9 = new com.startapp.sdk.adsbase.remoteconfig.a     // Catch:{ all -> 0x0052 }
            r9.<init>(r4, r5, r6)     // Catch:{ all -> 0x0052 }
            f38953l = r9     // Catch:{ all -> 0x0052 }
            com.startapp.sdk.components.ComponentLocator r4 = com.startapp.sdk.components.ComponentLocator.m50248a((android.content.Context) r4)     // Catch:{ all -> 0x0052 }
            java.util.concurrent.Executor r5 = r4.mo31181q()     // Catch:{ all -> 0x0052 }
            com.startapp.k3 r6 = new com.startapp.k3     // Catch:{ all -> 0x0052 }
            r6.<init>(r9, r4)     // Catch:{ all -> 0x0052 }
            r5.execute(r6)     // Catch:{ all -> 0x0052 }
        L_0x0047:
            if (r7 == 0) goto L_0x0050
            if (r8 == 0) goto L_0x0050
            com.startapp.sdk.adsbase.remoteconfig.MetaData r4 = f38952k     // Catch:{ all -> 0x0052 }
            r4.mo31016a((com.startapp.sdk.adsbase.remoteconfig.C9450c) r8)     // Catch:{ all -> 0x0052 }
        L_0x0050:
            monitor-exit(r1)     // Catch:{ all -> 0x0052 }
            return
        L_0x0052:
            r4 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0052 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.adsbase.remoteconfig.MetaData.mo31015a(android.content.Context, com.startapp.sdk.adsbase.model.AdPreferences, com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest$RequestReason, boolean, com.startapp.sdk.adsbase.remoteconfig.c, boolean):void");
    }

    /* renamed from: a */
    public void mo31016a(C9450c cVar) {
        synchronized (f38945d) {
            this.f38956c.add(cVar);
        }
    }

    /* renamed from: a */
    public int mo31011a(Context context) {
        return m50084a(context, this.periodicForegroundEventSec);
    }

    /* renamed from: a */
    public static int m50084a(Context context, int[] iArr) {
        if (iArr == null || iArr.length < 3) {
            iArr = f38950i;
        }
        if (C8837b0.m48304a(context, "android.permission.ACCESS_FINE_LOCATION")) {
            int i = iArr[0];
            if (i <= 0) {
                return f38950i[0];
            }
            return i;
        } else if (!C8837b0.m48304a(context, "android.permission.ACCESS_COARSE_LOCATION")) {
            return iArr[2];
        } else {
            int i2 = iArr[1];
            if (i2 <= 0) {
                return f38950i[1];
            }
            return i2;
        }
    }

    /* renamed from: a */
    public String mo31012a(AdPreferences.Placement placement) {
        int ordinal = placement.ordinal();
        if (ordinal == 1) {
            String str = this.adPlatformBannerHostSecured;
            return str != null ? str : mo31021d();
        } else if (ordinal == 7) {
            String str2 = this.adPlatformReturnHostSecured;
            return str2 != null ? str2 : mo31021d();
        } else if (ordinal == 3) {
            String str3 = this.adPlatformSplashHostSecured;
            return str3 != null ? str3 : mo31021d();
        } else if (ordinal == 4) {
            String str4 = this.adPlatformOverlayHostSecured;
            return str4 != null ? str4 : mo31021d();
        } else if (ordinal != 5) {
            return mo31021d();
        } else {
            String str5 = this.adPlatformNativeHostSecured;
            return str5 != null ? str5 : mo31021d();
        }
    }

    /* renamed from: a */
    public void mo31014a() {
        ArrayList arrayList;
        this.adPlatformHostSecured = mo31013a(this.adPlatformHostSecured, f38949h);
        List<String> list = this.metaDataHosts;
        if (list != null) {
            arrayList = new ArrayList(list.size());
            for (String a : list) {
                String a2 = mo31013a(a, (String) null);
                if (a2 != null) {
                    arrayList.add(a2);
                }
            }
        } else {
            arrayList = null;
        }
        this.metaDataHosts = arrayList;
        this.adPlatformBannerHostSecured = mo31013a(this.adPlatformBannerHostSecured, (String) null);
        this.adPlatformSplashHostSecured = mo31013a(this.adPlatformSplashHostSecured, (String) null);
        this.adPlatformReturnHostSecured = mo31013a(this.adPlatformReturnHostSecured, (String) null);
        this.adPlatformOverlayHostSecured = mo31013a(this.adPlatformOverlayHostSecured, (String) null);
        this.adPlatformNativeHostSecured = mo31013a(this.adPlatformNativeHostSecured, (String) null);
    }

    /* renamed from: a */
    public final String mo31013a(String str, String str2) {
        return str != null ? str.replace("%AdPlatformProtocol%", "1.5") : str2;
    }

    /* renamed from: a */
    public static void m50086a(Context context, String str) {
        if (str != null && !str.equals("")) {
            if (!C8941f1.m48562a(context, "close_button", ".png")) {
                Map<Activity, Integer> map = C9605vb.f39316a;
                new C8960g1(context, str + "close_button" + ".png", new C9447a(context, "close_button"), 0).mo29368a();
            }
            Map<Activity, Integer> map2 = C9605vb.f39316a;
            for (String str2 : AdsConstants.f38633h) {
                if (!C8941f1.m48562a(context, str2, ".png")) {
                    new C8960g1(context, str + str2 + ".png", new C9447a(context, str2), 0).mo29368a();
                }
            }
            Map<Activity, Integer> map3 = C9605vb.f39316a;
            for (String str3 : AdsConstants.f38634i) {
                if (!C8941f1.m48562a(context, str3, ".png")) {
                    new C8960g1(context, str + str3 + ".png", new C9447a(context, str3), 0).mo29368a();
                }
            }
            if (!C8941f1.m48562a(context, "logo", ".png")) {
                new C8960g1(context, str + "logo" + ".png", new C9447a(context, "logo"), 0).mo29368a();
            }
        }
    }
}
