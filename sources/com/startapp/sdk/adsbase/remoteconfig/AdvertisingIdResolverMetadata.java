package com.startapp.sdk.adsbase.remoteconfig;

import android.app.Activity;
import com.startapp.C9605vb;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;

/* compiled from: Sta */
public class AdvertisingIdResolverMetadata implements Serializable {
    private static final long serialVersionUID = -1692502027621350736L;
    private boolean enabled = true;
    private int ief = 0;
    private double iep = 0.0d;

    /* renamed from: a */
    public int mo30917a() {
        return this.ief;
    }

    /* renamed from: b */
    public double mo30918b() {
        return this.iep;
    }

    /* renamed from: c */
    public boolean mo30919c() {
        return this.enabled;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AdvertisingIdResolverMetadata advertisingIdResolverMetadata = (AdvertisingIdResolverMetadata) obj;
        if (this.enabled == advertisingIdResolverMetadata.enabled && Double.compare(this.iep, advertisingIdResolverMetadata.iep) == 0 && this.ief == advertisingIdResolverMetadata.ief) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        Object[] objArr = {Boolean.valueOf(this.enabled), Double.valueOf(this.iep), Integer.valueOf(this.ief)};
        Map<Activity, Integer> map = C9605vb.f39316a;
        return Arrays.deepHashCode(objArr);
    }
}
