package com.startapp.sdk.adsbase.remoteconfig;

import android.app.Activity;
import androidx.annotation.Keep;
import com.startapp.C9226pb;
import com.startapp.C9565tb;
import com.startapp.C9605vb;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* compiled from: Sta */
public class AnalyticsCategoryConfig implements Serializable {
    private static final long serialVersionUID = 5410570404581113345L;
    private Double enabled;
    @C9226pb(parser = FiltersParser.class, type = ArrayList.class, value = AnalyticsCategoryFilterConfig.class)
    private List<AnalyticsCategoryFilterConfig> filters;
    private String firstDelay;
    private Integer flags;
    private Integer priority;
    private Boolean sendViaDb;
    private String ttl;

    @Keep
    /* compiled from: Sta */
    public static class FiltersParser extends C9565tb<AnalyticsCategoryFilterConfig> {
        public FiltersParser() {
            super(AnalyticsCategoryFilterConfig.class);
        }
    }

    /* renamed from: a */
    public Double mo30922a() {
        return this.enabled;
    }

    /* renamed from: b */
    public List<AnalyticsCategoryFilterConfig> mo30923b() {
        return this.filters;
    }

    /* renamed from: c */
    public String mo30924c() {
        return this.firstDelay;
    }

    /* renamed from: d */
    public Integer mo30925d() {
        return this.flags;
    }

    /* renamed from: e */
    public Integer mo30926e() {
        return this.priority;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AnalyticsCategoryConfig analyticsCategoryConfig = (AnalyticsCategoryConfig) obj;
        if (!C9605vb.m50465a(this.enabled, analyticsCategoryConfig.enabled) || !C9605vb.m50465a(this.flags, analyticsCategoryConfig.flags) || !C9605vb.m50465a(this.priority, analyticsCategoryConfig.priority) || !C9605vb.m50465a(this.sendViaDb, analyticsCategoryConfig.sendViaDb) || !C9605vb.m50465a(this.ttl, analyticsCategoryConfig.ttl) || !C9605vb.m50465a(this.firstDelay, analyticsCategoryConfig.firstDelay) || !C9605vb.m50465a(this.filters, analyticsCategoryConfig.filters)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public Boolean mo30928f() {
        return this.sendViaDb;
    }

    /* renamed from: g */
    public String mo30929g() {
        return this.ttl;
    }

    public int hashCode() {
        Object[] objArr = {this.enabled, this.flags, this.priority, this.sendViaDb, this.ttl, this.firstDelay, this.filters};
        Map<Activity, Integer> map = C9605vb.f39316a;
        return Arrays.deepHashCode(objArr);
    }
}
