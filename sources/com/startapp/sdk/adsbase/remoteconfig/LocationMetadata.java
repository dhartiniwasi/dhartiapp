package com.startapp.sdk.adsbase.remoteconfig;

import android.app.Activity;
import com.startapp.C9605vb;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;

/* compiled from: Sta */
public class LocationMetadata implements Serializable {
    private static final long serialVersionUID = 6065806350166123602L;
    private boolean coEnabled;
    private boolean fiEnabled;

    /* renamed from: a */
    public boolean mo30982a() {
        return this.fiEnabled;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LocationMetadata locationMetadata = (LocationMetadata) obj;
        if (this.fiEnabled == locationMetadata.fiEnabled && this.coEnabled == locationMetadata.coEnabled) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        Object[] objArr = {Boolean.valueOf(this.fiEnabled), Boolean.valueOf(this.coEnabled)};
        Map<Activity, Integer> map = C9605vb.f39316a;
        return Arrays.deepHashCode(objArr);
    }
}
