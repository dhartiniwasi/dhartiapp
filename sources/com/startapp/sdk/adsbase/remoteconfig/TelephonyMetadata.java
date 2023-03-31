package com.startapp.sdk.adsbase.remoteconfig;

import android.app.Activity;
import com.startapp.C9226pb;
import com.startapp.C9605vb;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Sta */
public class TelephonyMetadata implements Serializable {
    private static final long serialVersionUID = -644112324647697192L;
    @C9226pb(type = HashMap.class, value = TelephonyDataConfig.class)
    private Map<String, TelephonyDataConfig> data;
    private boolean enabled;
    private int ief = 0;
    private double iep = 0.0d;
    private boolean rciu;

    /* renamed from: a */
    public int mo31138a() {
        return this.ief;
    }

    /* renamed from: b */
    public double mo31140b() {
        return this.iep;
    }

    /* renamed from: c */
    public boolean mo31141c() {
        return this.enabled;
    }

    /* renamed from: d */
    public boolean mo31142d() {
        return this.rciu;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TelephonyMetadata telephonyMetadata = (TelephonyMetadata) obj;
        if (this.enabled == telephonyMetadata.enabled && this.ief == telephonyMetadata.ief && Double.compare(this.iep, telephonyMetadata.iep) == 0 && this.rciu == telephonyMetadata.rciu && C9605vb.m50465a(this.data, telephonyMetadata.data)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        Object[] objArr = {Boolean.valueOf(this.enabled), Integer.valueOf(this.ief), Double.valueOf(this.iep), Boolean.valueOf(this.rciu), this.data};
        Map<Activity, Integer> map = C9605vb.f39316a;
        return Arrays.deepHashCode(objArr);
    }

    /* renamed from: a */
    public TelephonyDataConfig mo31139a(String str) {
        Map<String, TelephonyDataConfig> map = this.data;
        TelephonyDataConfig telephonyDataConfig = map != null ? map.get(str) : null;
        return telephonyDataConfig != null ? telephonyDataConfig : TelephonyDataConfig.f38988a;
    }
}
