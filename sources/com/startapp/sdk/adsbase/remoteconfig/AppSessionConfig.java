package com.startapp.sdk.adsbase.remoteconfig;

import android.app.Activity;
import com.startapp.C8834af;
import com.startapp.C9226pb;
import com.startapp.C9605vb;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;

/* compiled from: Sta */
public class AppSessionConfig implements Serializable {
    private static final long serialVersionUID = 2463582211707601660L;
    @C9226pb(name = "backgroundTimeout", parser = C8834af.class)
    private long timeoutMillis = 600000;

    /* renamed from: a */
    public long mo30953a() {
        return this.timeoutMillis;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass() && this.timeoutMillis == ((AppSessionConfig) obj).timeoutMillis) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        Object[] objArr = {Long.valueOf(this.timeoutMillis)};
        Map<Activity, Integer> map = C9605vb.f39316a;
        return Arrays.deepHashCode(objArr);
    }
}
