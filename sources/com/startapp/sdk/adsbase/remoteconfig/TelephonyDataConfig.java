package com.startapp.sdk.adsbase.remoteconfig;

import android.app.Activity;
import com.startapp.C9043j4;
import com.startapp.C9226pb;
import com.startapp.C9605vb;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: Sta */
public class TelephonyDataConfig implements Serializable {

    /* renamed from: a */
    public static final TelephonyDataConfig f38988a = new TelephonyDataConfig();
    private static final long serialVersionUID = -7175662234963204913L;
    @C9226pb(type = ArrayList.class)
    private List<String> categories = Collections.singletonList(C9043j4.f37000k.mo29505a());
    private boolean enabled = true;
    private String param;

    /* renamed from: a */
    public List<String> mo31133a() {
        return this.categories;
    }

    /* renamed from: b */
    public String mo31134b() {
        return this.param;
    }

    /* renamed from: c */
    public boolean mo31135c() {
        return this.enabled;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TelephonyDataConfig telephonyDataConfig = (TelephonyDataConfig) obj;
        if (this.enabled != telephonyDataConfig.enabled || !C9605vb.m50465a(this.categories, telephonyDataConfig.categories) || !C9605vb.m50465a(this.param, telephonyDataConfig.param)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = {Boolean.valueOf(this.enabled), this.categories, this.param};
        Map<Activity, Integer> map = C9605vb.f39316a;
        return Arrays.deepHashCode(objArr);
    }
}
