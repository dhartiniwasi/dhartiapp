package com.startapp.sdk.adsbase.remoteconfig;

import android.app.Activity;
import com.startapp.C9605vb;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;

/* compiled from: Sta */
public class StaleDcConfig implements Serializable {
    private static final long serialVersionUID = 6968747702766307828L;
    private int ief = 0;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass() && this.ief == ((StaleDcConfig) obj).ief) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        Object[] objArr = {Integer.valueOf(this.ief)};
        Map<Activity, Integer> map = C9605vb.f39316a;
        return Arrays.deepHashCode(objArr);
    }
}
