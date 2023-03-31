package com.startapp.sdk.adsbase.remoteconfig;

import android.app.Activity;
import com.startapp.C9605vb;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;

/* compiled from: Sta */
public final class ComponentInfoEventConfig implements Serializable {

    /* renamed from: a */
    public static final ComponentInfoEventConfig f38944a = new ComponentInfoEventConfig();
    private static final long serialVersionUID = -5359772055016698271L;
    private double chance = 0.0d;
    private long flags = 0;

    /* renamed from: a */
    public boolean mo30968a(long j) {
        if ((this.flags & j) != j || Double.compare(this.chance, 0.0d) <= 0) {
            return false;
        }
        if (Double.compare(this.chance, 1.0d) < 0 && Math.random() >= this.chance) {
            return false;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ComponentInfoEventConfig.class != obj.getClass()) {
            return false;
        }
        ComponentInfoEventConfig componentInfoEventConfig = (ComponentInfoEventConfig) obj;
        if (this.flags == componentInfoEventConfig.flags && Double.compare(this.chance, componentInfoEventConfig.chance) == 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        Object[] objArr = {Long.valueOf(this.flags), Double.valueOf(this.chance)};
        Map<Activity, Integer> map = C9605vb.f39316a;
        return Arrays.deepHashCode(objArr);
    }
}
