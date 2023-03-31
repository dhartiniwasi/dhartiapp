package com.startapp.sdk.adsbase.remoteconfig;

import android.app.Activity;
import com.startapp.C9226pb;
import com.startapp.C9283sb;
import com.startapp.C9605vb;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;

/* compiled from: Sta */
public class ImpressionsTrackingMetadata implements Serializable {
    private static final long serialVersionUID = -8908841983322302421L;
    @C9226pb(parser = C9283sb.class)
    private double enabled = 0.0d;
    private int types = 3;

    /* renamed from: a */
    public double mo30978a() {
        return this.enabled;
    }

    /* renamed from: b */
    public int mo30979b() {
        return this.types;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImpressionsTrackingMetadata impressionsTrackingMetadata = (ImpressionsTrackingMetadata) obj;
        if (Double.compare(this.enabled, impressionsTrackingMetadata.enabled) == 0 && this.types == impressionsTrackingMetadata.types) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        Object[] objArr = {Double.valueOf(this.enabled), Integer.valueOf(this.types)};
        Map<Activity, Integer> map = C9605vb.f39316a;
        return Arrays.deepHashCode(objArr);
    }
}
