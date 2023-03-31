package com.startapp.sdk.adsbase.adrules;

import android.app.Activity;
import com.startapp.C8938f;
import com.startapp.C9226pb;
import com.startapp.C9605vb;
import com.startapp.sdk.adsbase.model.AdPreferences;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: Sta */
public class AdRules implements Serializable {
    private static final long serialVersionUID = 9050956736420299872L;

    /* renamed from: a */
    public transient Set<Class<? extends AdRule>> f38767a = new HashSet();
    private boolean applyOnBannerRefresh = true;
    @C9226pb(innerValue = AdRule.class, key = AdPreferences.Placement.class, type = HashMap.class, value = ArrayList.class)
    private Map<AdPreferences.Placement, List<AdRule>> placements = new HashMap();
    @C9226pb(type = ArrayList.class, value = AdRule.class)
    private List<AdRule> session = new ArrayList();
    @C9226pb(innerValue = AdRule.class, type = HashMap.class, value = ArrayList.class)
    private Map<String, List<AdRule>> tags = new HashMap();

    /* renamed from: a */
    public boolean mo30642a() {
        return this.applyOnBannerRefresh;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AdRules adRules = (AdRules) obj;
        if (this.applyOnBannerRefresh != adRules.applyOnBannerRefresh || !C9605vb.m50465a(this.session, adRules.session) || !C9605vb.m50465a(this.placements, adRules.placements) || !C9605vb.m50465a(this.tags, adRules.tags)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = {this.session, this.placements, this.tags, Boolean.valueOf(this.applyOnBannerRefresh)};
        Map<Activity, Integer> map = C9605vb.f39316a;
        return Arrays.deepHashCode(objArr);
    }

    /* renamed from: a */
    public synchronized AdRulesResult mo30640a(AdPreferences.Placement placement, String str) {
        AdRulesResult a;
        this.f38767a.clear();
        a = mo30641a(this.tags.get(str), C8938f.f36742d.f36745c.get(str), AdRuleLevel.TAG);
        if (a.mo30646b()) {
            AdRuleLevel adRuleLevel = AdRuleLevel.PLACEMENT;
            placement.toString();
            a = mo30641a(this.placements.get(placement), C8938f.f36742d.f36744b.get(placement), adRuleLevel);
            if (a.mo30646b()) {
                a = mo30641a(this.session, C8938f.f36742d.f36743a, AdRuleLevel.SESSION);
            }
        }
        return a;
    }

    /* renamed from: a */
    public final AdRulesResult mo30641a(List list, List list2, AdRuleLevel adRuleLevel) {
        if (list == null) {
            return new AdRulesResult(true, "");
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AdRule adRule = (AdRule) it.next();
            if (adRule.f38762a || !this.f38767a.contains(adRule.getClass())) {
                if (!adRule.mo30639a(list2)) {
                    return new AdRulesResult(false, adRule.getClass().getSimpleName() + "_" + adRuleLevel + "");
                }
                this.f38767a.add(adRule.getClass());
            }
        }
        return new AdRulesResult(true, "");
    }
}
