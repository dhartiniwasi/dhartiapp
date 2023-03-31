package com.startapp.sdk.adsbase.remoteconfig;

import android.app.Activity;
import com.startapp.C9226pb;
import com.startapp.C9605vb;
import java.io.Serializable;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: Sta */
public class AdDebuggerMetadata implements Serializable {
    private static final long serialVersionUID = 2490385963596560324L;
    @C9226pb(type = LinkedHashSet.class)
    private Set<String> devices;
    @C9226pb(name = "sendInfoEvents")
    private boolean infoEvents;
    private boolean testAds;

    /* renamed from: a */
    public Set<String> mo30912a() {
        return this.devices;
    }

    /* renamed from: b */
    public boolean mo30913b() {
        return this.infoEvents;
    }

    /* renamed from: c */
    public boolean mo30914c() {
        return this.testAds;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AdDebuggerMetadata adDebuggerMetadata = (AdDebuggerMetadata) obj;
        if (this.testAds == adDebuggerMetadata.testAds && this.infoEvents == adDebuggerMetadata.infoEvents && C9605vb.m50465a(this.devices, adDebuggerMetadata.devices)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        Object[] objArr = {this.devices, Boolean.valueOf(this.testAds), Boolean.valueOf(this.infoEvents)};
        Map<Activity, Integer> map = C9605vb.f39316a;
        return Arrays.deepHashCode(objArr);
    }
}
