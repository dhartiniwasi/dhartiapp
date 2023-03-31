package com.startapp.sdk.adsbase.remoteconfig;

import android.app.Activity;
import com.startapp.C9226pb;
import com.startapp.C9605vb;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;

/* compiled from: Sta */
public class SensorsConfig implements Serializable {
    private static final long serialVersionUID = -4658637722934999907L;
    @C9226pb(complex = true)
    private BaseSensorConfig ambientTemperatureSensor = new BaseSensorConfig(14);
    private boolean enabled = false;
    @C9226pb(complex = true)
    private BaseSensorConfig gravitySensor = new BaseSensorConfig(9);
    @C9226pb(complex = true)
    private BaseSensorConfig gyroscopeUncalibratedSensor = new BaseSensorConfig(18);
    @C9226pb(complex = true)
    private BaseSensorConfig lightSensor = new BaseSensorConfig(3);
    @C9226pb(complex = true)
    private BaseSensorConfig linearAccelerationSensor = new BaseSensorConfig(9);
    @C9226pb(complex = true)
    private BaseSensorConfig magneticFieldSensor = new BaseSensorConfig(3);
    @C9226pb(complex = true)
    private BaseSensorConfig pressureSensor = new BaseSensorConfig(9);
    private long refreshInterval = 900000;
    @C9226pb(complex = true)
    private BaseSensorConfig relativeHumiditySensor = new BaseSensorConfig(14);
    @C9226pb(complex = true)
    private BaseSensorConfig rotationVectorSensor = new BaseSensorConfig(9);
    private int timeoutInSec = 10;

    /* renamed from: a */
    public BaseSensorConfig mo31114a() {
        return this.ambientTemperatureSensor;
    }

    /* renamed from: b */
    public BaseSensorConfig mo31115b() {
        return this.gravitySensor;
    }

    /* renamed from: c */
    public BaseSensorConfig mo31116c() {
        return this.gyroscopeUncalibratedSensor;
    }

    /* renamed from: d */
    public BaseSensorConfig mo31117d() {
        return this.lightSensor;
    }

    /* renamed from: e */
    public BaseSensorConfig mo31118e() {
        return this.linearAccelerationSensor;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SensorsConfig sensorsConfig = (SensorsConfig) obj;
        if (this.timeoutInSec != sensorsConfig.timeoutInSec || this.enabled != sensorsConfig.enabled || this.refreshInterval != sensorsConfig.refreshInterval || !C9605vb.m50465a(this.ambientTemperatureSensor, sensorsConfig.ambientTemperatureSensor) || !C9605vb.m50465a(this.gravitySensor, sensorsConfig.gravitySensor) || !C9605vb.m50465a(this.lightSensor, sensorsConfig.lightSensor) || !C9605vb.m50465a(this.linearAccelerationSensor, sensorsConfig.linearAccelerationSensor) || !C9605vb.m50465a(this.magneticFieldSensor, sensorsConfig.magneticFieldSensor) || !C9605vb.m50465a(this.pressureSensor, sensorsConfig.pressureSensor) || !C9605vb.m50465a(this.relativeHumiditySensor, sensorsConfig.relativeHumiditySensor) || !C9605vb.m50465a(this.rotationVectorSensor, sensorsConfig.rotationVectorSensor) || !C9605vb.m50465a(this.gyroscopeUncalibratedSensor, sensorsConfig.gyroscopeUncalibratedSensor)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public BaseSensorConfig mo31120f() {
        return this.magneticFieldSensor;
    }

    /* renamed from: g */
    public BaseSensorConfig mo31121g() {
        return this.pressureSensor;
    }

    /* renamed from: h */
    public long mo31122h() {
        return this.refreshInterval;
    }

    public int hashCode() {
        Object[] objArr = {Integer.valueOf(this.timeoutInSec), Boolean.valueOf(this.enabled), Long.valueOf(this.refreshInterval), this.ambientTemperatureSensor, this.gravitySensor, this.lightSensor, this.linearAccelerationSensor, this.magneticFieldSensor, this.pressureSensor, this.relativeHumiditySensor, this.rotationVectorSensor, this.gyroscopeUncalibratedSensor};
        Map<Activity, Integer> map = C9605vb.f39316a;
        return Arrays.deepHashCode(objArr);
    }

    /* renamed from: i */
    public BaseSensorConfig mo31124i() {
        return this.relativeHumiditySensor;
    }

    /* renamed from: j */
    public BaseSensorConfig mo31125j() {
        return this.rotationVectorSensor;
    }

    /* renamed from: k */
    public int mo31126k() {
        return this.timeoutInSec;
    }

    /* renamed from: l */
    public boolean mo31127l() {
        return this.enabled;
    }
}
