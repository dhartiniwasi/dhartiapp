package com.startapp.sdk.adsbase.remoteconfig;

import android.app.Activity;
import com.startapp.C9226pb;
import com.startapp.C9605vb;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* compiled from: Sta */
public class AnalyticsCategoryFilterConfig implements Serializable {
    private static final long serialVersionUID = -706642555040875333L;
    @C9226pb(type = ArrayList.class)
    private List<String> excludeAppActivity;
    @C9226pb(type = ArrayList.class)
    private List<String> excludeValues;
    @C9226pb(type = ArrayList.class)
    private List<String> fields;
    @C9226pb(type = ArrayList.class)
    private List<String> includeAppActivity;
    @C9226pb(type = ArrayList.class)
    private List<String> includeValues;
    private String interval;

    /* renamed from: a */
    public List<String> mo30931a() {
        return this.excludeAppActivity;
    }

    /* renamed from: b */
    public List<String> mo30932b() {
        return this.excludeValues;
    }

    /* renamed from: c */
    public List<String> mo30933c() {
        return this.fields;
    }

    /* renamed from: d */
    public List<String> mo30934d() {
        return this.includeAppActivity;
    }

    /* renamed from: e */
    public List<String> mo30935e() {
        return this.includeValues;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AnalyticsCategoryFilterConfig analyticsCategoryFilterConfig = (AnalyticsCategoryFilterConfig) obj;
        if (!C9605vb.m50465a(this.includeValues, analyticsCategoryFilterConfig.includeValues) || !C9605vb.m50465a(this.excludeValues, analyticsCategoryFilterConfig.excludeValues) || !C9605vb.m50465a(this.includeAppActivity, analyticsCategoryFilterConfig.includeAppActivity) || !C9605vb.m50465a(this.excludeAppActivity, analyticsCategoryFilterConfig.excludeAppActivity) || !C9605vb.m50465a(this.fields, analyticsCategoryFilterConfig.fields) || !C9605vb.m50465a(this.interval, analyticsCategoryFilterConfig.interval)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public String mo30937f() {
        return this.interval;
    }

    public int hashCode() {
        Object[] objArr = {this.includeValues, this.excludeValues, this.includeAppActivity, this.excludeAppActivity, this.fields, this.interval};
        Map<Activity, Integer> map = C9605vb.f39316a;
        return Arrays.deepHashCode(objArr);
    }
}
