package com.startapp.sdk.adsbase.remoteconfig;

import android.app.Activity;
import com.startapp.C9605vb;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;

/* compiled from: Sta */
public class BaseSensorConfig implements Serializable {
    private static final long serialVersionUID = 1916033515322302335L;
    private int delay = 3;
    private boolean enabled = true;
    private int minApiLevel = 18;

    public BaseSensorConfig() {
    }

    /* renamed from: a */
    public int mo30956a() {
        return this.delay;
    }

    /* renamed from: b */
    public int mo30957b() {
        return this.minApiLevel;
    }

    /* renamed from: c */
    public boolean mo30958c() {
        return this.enabled;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BaseSensorConfig baseSensorConfig = (BaseSensorConfig) obj;
        if (this.delay == baseSensorConfig.delay && this.minApiLevel == baseSensorConfig.minApiLevel && this.enabled == baseSensorConfig.enabled) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        Object[] objArr = {Integer.valueOf(this.delay), Integer.valueOf(this.minApiLevel), Boolean.valueOf(this.enabled)};
        Map<Activity, Integer> map = C9605vb.f39316a;
        return Arrays.deepHashCode(objArr);
    }

    public BaseSensorConfig(int i) {
        this.minApiLevel = i;
    }
}
