package com.startapp.sdk.adsbase.cache;

import android.app.Activity;
import com.startapp.C9226pb;
import com.startapp.C9605vb;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.utils.UniversalIntParser;
import java.io.Serializable;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: Sta */
public class ACMConfig implements Serializable {
    private static final long serialVersionUID = 5818859951358287830L;
    private long adCacheTTL = 3600;
    @C9226pb(type = EnumSet.class, value = StartAppAd.AdMode.class)
    private Set<StartAppAd.AdMode> autoLoad = EnumSet.of(StartAppAd.AdMode.FULLPAGE);
    @C9226pb(parser = UniversalIntParser.class)
    private int autoLoadEnabled = 1;
    @C9226pb(complex = true)
    private FailuresHandler failuresHandler = new FailuresHandler();
    private boolean localCache = true;
    private int maxCacheSize = 7;
    @C9226pb(type = HashSet.class)
    private Set<String> mediators = new HashSet(Arrays.asList(new String[]{"applovin", "admob", "ironsource"}));
    private long returnAdCacheTTL = 3600;
    private boolean returnAdShouldLoadInBg = true;

    /* renamed from: a */
    public long mo30662a() {
        return TimeUnit.SECONDS.toMillis(this.adCacheTTL);
    }

    /* renamed from: b */
    public Set<StartAppAd.AdMode> mo30664b() {
        return this.autoLoad;
    }

    /* renamed from: c */
    public FailuresHandler mo30665c() {
        return this.failuresHandler;
    }

    /* renamed from: d */
    public int mo30666d() {
        return this.maxCacheSize;
    }

    /* renamed from: e */
    public long mo30667e() {
        return TimeUnit.SECONDS.toMillis(this.returnAdCacheTTL);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ACMConfig aCMConfig = (ACMConfig) obj;
        if (this.adCacheTTL == aCMConfig.adCacheTTL && this.returnAdCacheTTL == aCMConfig.returnAdCacheTTL && this.autoLoadEnabled == aCMConfig.autoLoadEnabled && this.localCache == aCMConfig.localCache && this.returnAdShouldLoadInBg == aCMConfig.returnAdShouldLoadInBg && this.maxCacheSize == aCMConfig.maxCacheSize && C9605vb.m50465a(this.autoLoad, aCMConfig.autoLoad) && C9605vb.m50465a(this.mediators, aCMConfig.mediators) && C9605vb.m50465a(this.failuresHandler, aCMConfig.failuresHandler)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo30669f() {
        return this.localCache;
    }

    /* renamed from: g */
    public boolean mo30670g() {
        return this.returnAdShouldLoadInBg;
    }

    public int hashCode() {
        Object[] objArr = {Long.valueOf(this.adCacheTTL), Long.valueOf(this.returnAdCacheTTL), this.autoLoad, Integer.valueOf(this.autoLoadEnabled), this.mediators, Boolean.valueOf(this.localCache), Boolean.valueOf(this.returnAdShouldLoadInBg), this.failuresHandler, Integer.valueOf(this.maxCacheSize)};
        Map<Activity, Integer> map = C9605vb.f39316a;
        return Arrays.deepHashCode(objArr);
    }

    /* renamed from: a */
    public boolean mo30663a(Map<String, String> map) {
        Set<String> set;
        int i = this.autoLoadEnabled;
        if (i == 2) {
            if (!(map == null || (set = this.mediators) == null)) {
                for (String next : set) {
                    Iterator<String> it = map.keySet().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (it.next().equalsIgnoreCase(next)) {
                                return false;
                            }
                        }
                    }
                }
            }
            return true;
        } else if (i == 1) {
            return true;
        } else {
            return false;
        }
    }
}
