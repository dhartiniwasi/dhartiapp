package com.startapp.sdk.adsbase.remoteconfig;

import android.app.Activity;
import com.startapp.C9605vb;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;

/* compiled from: Sta */
public class NetworkDiagnosticConfig implements Serializable {
    private static final long serialVersionUID = 600844380854621516L;
    private boolean enabled;
    private int ief;
    private int minCountToSend = 10;
    private int sendingIntervalMinutes = 60;
    private int types = 1;

    /* renamed from: a */
    public int mo31080a() {
        return this.ief;
    }

    /* renamed from: b */
    public int mo31081b() {
        return this.minCountToSend;
    }

    /* renamed from: c */
    public int mo31082c() {
        return this.sendingIntervalMinutes;
    }

    /* renamed from: d */
    public int mo31083d() {
        return this.types;
    }

    /* renamed from: e */
    public boolean mo31084e() {
        return this.enabled;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NetworkDiagnosticConfig networkDiagnosticConfig = (NetworkDiagnosticConfig) obj;
        if (this.enabled == networkDiagnosticConfig.enabled && this.sendingIntervalMinutes == networkDiagnosticConfig.sendingIntervalMinutes && this.minCountToSend == networkDiagnosticConfig.minCountToSend && this.types == networkDiagnosticConfig.types && this.ief == networkDiagnosticConfig.ief) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        Object[] objArr = {Boolean.valueOf(this.enabled), Integer.valueOf(this.sendingIntervalMinutes), Integer.valueOf(this.minCountToSend), Integer.valueOf(this.types), Integer.valueOf(this.ief)};
        Map<Activity, Integer> map = C9605vb.f39316a;
        return Arrays.deepHashCode(objArr);
    }
}
