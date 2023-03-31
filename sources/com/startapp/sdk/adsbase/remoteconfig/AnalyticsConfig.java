package com.startapp.sdk.adsbase.remoteconfig;

import android.app.Activity;
import com.startapp.C9226pb;
import com.startapp.C9605vb;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: Sta */
public class AnalyticsConfig implements Serializable {

    /* renamed from: a */
    public static final String f38943a = "https://infoevent.startappservice.com/tracking/infoEvent";
    private static final long serialVersionUID = 4112204971825088167L;
    @C9226pb(complex = true)
    private AdCallbacksConfig adCallbacks = new AdCallbacksConfig();
    @C9226pb(type = ArrayList.class)
    private List<String> admHeaders = Collections.singletonList("Server-Timing");
    private double admPrb = 0.0d;
    @C9226pb(type = HashMap.class, value = AnalyticsCategoryConfig.class)
    private Map<String, AnalyticsCategoryConfig> categories;
    public boolean dns = false;
    private int fuIef;
    public String hostPeriodic;
    public String hostSecured;
    private String noNetworkTimeout;
    private int retryNum = 3;
    private int retryTime = 10;
    @C9226pb(complex = true)
    private ComponentInfoEventConfig scheduledImpressionInfoEvents;
    private boolean sendHopsOnFirstSucceededSmartRedirect = false;
    private boolean sendViewabilityInfo = false;
    private float succeededSmartRedirectInfoProbability = 0.01f;

    public AnalyticsConfig() {
        String str = f38943a;
        this.hostSecured = str;
        this.hostPeriodic = str;
    }

    /* renamed from: a */
    public AdCallbacksConfig mo30939a() {
        return this.adCallbacks;
    }

    /* renamed from: b */
    public List<String> mo30940b() {
        return this.admHeaders;
    }

    /* renamed from: c */
    public double mo30941c() {
        return this.admPrb;
    }

    /* renamed from: d */
    public Map<String, AnalyticsCategoryConfig> mo30942d() {
        return this.categories;
    }

    /* renamed from: e */
    public int mo30943e() {
        return this.fuIef;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AnalyticsConfig analyticsConfig = (AnalyticsConfig) obj;
        if (this.dns == analyticsConfig.dns && this.retryNum == analyticsConfig.retryNum && this.retryTime == analyticsConfig.retryTime && Float.compare(this.succeededSmartRedirectInfoProbability, analyticsConfig.succeededSmartRedirectInfoProbability) == 0 && this.sendHopsOnFirstSucceededSmartRedirect == analyticsConfig.sendHopsOnFirstSucceededSmartRedirect && this.sendViewabilityInfo == analyticsConfig.sendViewabilityInfo && Double.compare(this.admPrb, analyticsConfig.admPrb) == 0 && this.fuIef == analyticsConfig.fuIef && C9605vb.m50465a(this.hostSecured, analyticsConfig.hostSecured) && C9605vb.m50465a(this.hostPeriodic, analyticsConfig.hostPeriodic) && C9605vb.m50465a(this.noNetworkTimeout, analyticsConfig.noNetworkTimeout) && C9605vb.m50465a(this.categories, analyticsConfig.categories) && C9605vb.m50465a(this.adCallbacks, analyticsConfig.adCallbacks) && C9605vb.m50465a(this.admHeaders, analyticsConfig.admHeaders) && C9605vb.m50465a(this.scheduledImpressionInfoEvents, analyticsConfig.scheduledImpressionInfoEvents)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public String mo30945f() {
        return this.noNetworkTimeout;
    }

    /* renamed from: g */
    public int mo30946g() {
        return this.retryNum;
    }

    /* renamed from: h */
    public long mo30947h() {
        return TimeUnit.SECONDS.toMillis((long) this.retryTime);
    }

    public int hashCode() {
        Object[] objArr = {this.hostSecured, this.hostPeriodic, Boolean.valueOf(this.dns), Integer.valueOf(this.retryNum), Integer.valueOf(this.retryTime), Float.valueOf(this.succeededSmartRedirectInfoProbability), Boolean.valueOf(this.sendHopsOnFirstSucceededSmartRedirect), this.noNetworkTimeout, this.categories, this.adCallbacks, Boolean.valueOf(this.sendViewabilityInfo), Double.valueOf(this.admPrb), this.admHeaders, Integer.valueOf(this.fuIef), this.scheduledImpressionInfoEvents};
        Map<Activity, Integer> map = C9605vb.f39316a;
        return Arrays.deepHashCode(objArr);
    }

    /* renamed from: i */
    public float mo30949i() {
        return this.succeededSmartRedirectInfoProbability;
    }

    /* renamed from: j */
    public boolean mo30950j() {
        return this.sendHopsOnFirstSucceededSmartRedirect;
    }

    /* renamed from: k */
    public boolean mo30951k() {
        return this.sendViewabilityInfo;
    }

    /* renamed from: l */
    public ComponentInfoEventConfig mo30952l() {
        return this.scheduledImpressionInfoEvents;
    }
}
