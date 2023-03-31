package com.startapp.sdk.adsbase.remoteconfig;

import android.app.Activity;
import com.startapp.C9605vb;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;

/* compiled from: Sta */
public class BluetoothConfig implements Serializable {
    private static final long serialVersionUID = 6500835630965723999L;
    private int discoveryIntervalInMinutes = 1440;
    private boolean enabled = false;
    private long refreshInterval = 900000;
    private int timeoutInSec = 20;

    /* renamed from: a */
    public int mo30961a() {
        return this.discoveryIntervalInMinutes;
    }

    /* renamed from: b */
    public long mo30962b() {
        return this.refreshInterval;
    }

    /* renamed from: c */
    public int mo30963c() {
        return this.timeoutInSec;
    }

    /* renamed from: d */
    public boolean mo30964d() {
        return this.enabled;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BluetoothConfig bluetoothConfig = (BluetoothConfig) obj;
        if (this.timeoutInSec == bluetoothConfig.timeoutInSec && this.enabled == bluetoothConfig.enabled && this.discoveryIntervalInMinutes == bluetoothConfig.discoveryIntervalInMinutes && this.refreshInterval == bluetoothConfig.refreshInterval) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        Object[] objArr = {Integer.valueOf(this.timeoutInSec), Boolean.valueOf(this.enabled), Integer.valueOf(this.discoveryIntervalInMinutes), Long.valueOf(this.refreshInterval)};
        Map<Activity, Integer> map = C9605vb.f39316a;
        return Arrays.deepHashCode(objArr);
    }
}
