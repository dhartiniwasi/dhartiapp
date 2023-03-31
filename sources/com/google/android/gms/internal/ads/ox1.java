package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import p053g4.C4409t;
import p060h4.C4596v;
import p073j4.C4794n1;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class ox1 implements SensorEventListener {

    /* renamed from: a */
    private final SensorManager f15398a;

    /* renamed from: b */
    private final Sensor f15399b;

    /* renamed from: c */
    private float f15400c = 0.0f;

    /* renamed from: d */
    private Float f15401d = Float.valueOf(0.0f);

    /* renamed from: e */
    private long f15402e = C4409t.m29310b().mo18370a();

    /* renamed from: f */
    private int f15403f = 0;

    /* renamed from: g */
    private boolean f15404g = false;

    /* renamed from: h */
    private boolean f15405h = false;

    /* renamed from: i */
    private nx1 f15406i = null;

    /* renamed from: j */
    private boolean f15407j = false;

    ox1(Context context) {
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f15398a = sensorManager;
        if (sensorManager != null) {
            this.f15399b = sensorManager.getDefaultSensor(4);
        } else {
            this.f15399b = null;
        }
    }

    /* renamed from: a */
    public final void mo13059a() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            if (!(!this.f15407j || (sensorManager = this.f15398a) == null || (sensor = this.f15399b) == null)) {
                sensorManager.unregisterListener(this, sensor);
                this.f15407j = false;
                C4794n1.m30693k("Stopped listening for flick gestures.");
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0030, code lost:
        if (r3.f15398a == null) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0034, code lost:
        if (r3.f15399b != null) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0037, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0038, code lost:
        com.google.android.gms.internal.ads.pm0.m18667g("Flick detection failed to initialize. Failed to obtain gyroscope.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003d, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo13060b() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.ez r0 = com.google.android.gms.internal.ads.C2679nz.f14380N7     // Catch:{ all -> 0x003e }
            com.google.android.gms.internal.ads.lz r1 = p060h4.C4596v.m30088c()     // Catch:{ all -> 0x003e }
            java.lang.Object r0 = r1.mo12227b(r0)     // Catch:{ all -> 0x003e }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x003e }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x003e }
            if (r0 != 0) goto L_0x0015
            monitor-exit(r3)     // Catch:{ all -> 0x003e }
            return
        L_0x0015:
            boolean r0 = r3.f15407j     // Catch:{ all -> 0x003e }
            if (r0 != 0) goto L_0x002d
            android.hardware.SensorManager r0 = r3.f15398a     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x002d
            android.hardware.Sensor r1 = r3.f15399b     // Catch:{ all -> 0x003e }
            if (r1 == 0) goto L_0x002d
            r2 = 2
            r0.registerListener(r3, r1, r2)     // Catch:{ all -> 0x003e }
            r0 = 1
            r3.f15407j = r0     // Catch:{ all -> 0x003e }
            java.lang.String r0 = "Listening for flick gestures."
            p073j4.C4794n1.m30693k(r0)     // Catch:{ all -> 0x003e }
        L_0x002d:
            monitor-exit(r3)     // Catch:{ all -> 0x003e }
            android.hardware.SensorManager r0 = r3.f15398a
            if (r0 == 0) goto L_0x0038
            android.hardware.Sensor r0 = r3.f15399b
            if (r0 != 0) goto L_0x0037
            goto L_0x0038
        L_0x0037:
            return
        L_0x0038:
            java.lang.String r0 = "Flick detection failed to initialize. Failed to obtain gyroscope."
            com.google.android.gms.internal.ads.pm0.m18667g(r0)
            return
        L_0x003e:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x003e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ox1.mo13060b():void");
    }

    /* renamed from: c */
    public final void mo13061c(nx1 nx1) {
        this.f15406i = nx1;
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14380N7)).booleanValue()) {
            long a = C4409t.m29310b().mo18370a();
            if (this.f15402e + ((long) ((Integer) C4596v.m30088c().mo12227b(C2679nz.f14400P7)).intValue()) < a) {
                this.f15403f = 0;
                this.f15402e = a;
                this.f15404g = false;
                this.f15405h = false;
                this.f15400c = this.f15401d.floatValue();
            }
            Float valueOf = Float.valueOf(this.f15401d.floatValue() + (sensorEvent.values[1] * 4.0f));
            this.f15401d = valueOf;
            float floatValue = valueOf.floatValue();
            float f = this.f15400c;
            C2344ez ezVar = C2679nz.f14390O7;
            if (floatValue > f + ((Float) C4596v.m30088c().mo12227b(ezVar)).floatValue()) {
                this.f15400c = this.f15401d.floatValue();
                this.f15405h = true;
            } else if (this.f15401d.floatValue() < this.f15400c - ((Float) C4596v.m30088c().mo12227b(ezVar)).floatValue()) {
                this.f15400c = this.f15401d.floatValue();
                this.f15404g = true;
            }
            if (this.f15401d.isInfinite()) {
                this.f15401d = Float.valueOf(0.0f);
                this.f15400c = 0.0f;
            }
            if (this.f15404g && this.f15405h) {
                C4794n1.m30693k("Flick detected.");
                this.f15402e = a;
                int i = this.f15403f + 1;
                this.f15403f = i;
                this.f15404g = false;
                this.f15405h = false;
                nx1 nx1 = this.f15406i;
                if (nx1 != null) {
                    if (i == ((Integer) C4596v.m30088c().mo12227b(C2679nz.f14410Q7)).intValue()) {
                        ey1 ey1 = (ey1) nx1;
                        ey1.mo10037h(new cy1(ey1), dy1.GESTURE);
                    }
                }
            }
        }
    }
}
