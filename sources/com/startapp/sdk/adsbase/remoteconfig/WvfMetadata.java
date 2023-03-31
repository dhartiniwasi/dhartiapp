package com.startapp.sdk.adsbase.remoteconfig;

import android.app.Activity;
import android.os.Build;
import com.startapp.C9605vb;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;

/* compiled from: Sta */
public class WvfMetadata implements Serializable {

    /* renamed from: a */
    public static final int f38989a = (Build.VERSION.SDK_INT < 31 ? 1 : 0);
    private static final long serialVersionUID = -7857833539517124082L;
    private int ief;
    private double iep;
    private double useDefaultUserAgent = ((double) f38989a);

    /* renamed from: a */
    public int mo31145a() {
        return this.ief;
    }

    /* renamed from: b */
    public double mo31146b() {
        return this.iep;
    }

    /* renamed from: c */
    public double mo31147c() {
        return this.useDefaultUserAgent;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WvfMetadata wvfMetadata = (WvfMetadata) obj;
        if (this.ief == wvfMetadata.ief && Double.compare(this.iep, wvfMetadata.iep) == 0 && Double.compare(this.useDefaultUserAgent, wvfMetadata.useDefaultUserAgent) == 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        Object[] objArr = {Integer.valueOf(this.ief), Double.valueOf(this.iep), Double.valueOf(this.useDefaultUserAgent)};
        Map<Activity, Integer> map = C9605vb.f39316a;
        return Arrays.deepHashCode(objArr);
    }
}
