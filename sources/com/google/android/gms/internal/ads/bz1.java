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
public final class bz1 implements SensorEventListener {

    /* renamed from: a */
    private final Context f7528a;

    /* renamed from: b */
    private SensorManager f7529b;

    /* renamed from: c */
    private Sensor f7530c;

    /* renamed from: d */
    private long f7531d;

    /* renamed from: e */
    private int f7532e;

    /* renamed from: f */
    private az1 f7533f;

    /* renamed from: g */
    private boolean f7534g;

    bz1(Context context) {
        this.f7528a = context;
    }

    /* renamed from: a */
    public final void mo8990a() {
        synchronized (this) {
            if (this.f7534g) {
                SensorManager sensorManager = this.f7529b;
                if (sensorManager != null) {
                    sensorManager.unregisterListener(this, this.f7530c);
                    C4794n1.m30693k("Stopped listening for shake gestures.");
                }
                this.f7534g = false;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0069, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo8991b() {
        /*
            r6 = this;
            monitor-enter(r6)
            com.google.android.gms.internal.ads.ez r0 = com.google.android.gms.internal.ads.C2679nz.f14330I7     // Catch:{ all -> 0x006a }
            com.google.android.gms.internal.ads.lz r1 = p060h4.C4596v.m30088c()     // Catch:{ all -> 0x006a }
            java.lang.Object r0 = r1.mo12227b(r0)     // Catch:{ all -> 0x006a }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x006a }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x006a }
            if (r0 != 0) goto L_0x0015
            monitor-exit(r6)     // Catch:{ all -> 0x006a }
            return
        L_0x0015:
            android.hardware.SensorManager r0 = r6.f7529b     // Catch:{ all -> 0x006a }
            r1 = 1
            if (r0 != 0) goto L_0x0035
            android.content.Context r0 = r6.f7528a     // Catch:{ all -> 0x006a }
            java.lang.String r2 = "sensor"
            java.lang.Object r0 = r0.getSystemService(r2)     // Catch:{ all -> 0x006a }
            android.hardware.SensorManager r0 = (android.hardware.SensorManager) r0     // Catch:{ all -> 0x006a }
            r6.f7529b = r0     // Catch:{ all -> 0x006a }
            if (r0 != 0) goto L_0x002f
            java.lang.String r0 = "Shake detection failed to initialize. Failed to obtain accelerometer."
            com.google.android.gms.internal.ads.pm0.m18667g(r0)     // Catch:{ all -> 0x006a }
            monitor-exit(r6)     // Catch:{ all -> 0x006a }
            return
        L_0x002f:
            android.hardware.Sensor r0 = r0.getDefaultSensor(r1)     // Catch:{ all -> 0x006a }
            r6.f7530c = r0     // Catch:{ all -> 0x006a }
        L_0x0035:
            boolean r0 = r6.f7534g     // Catch:{ all -> 0x006a }
            if (r0 != 0) goto L_0x0068
            android.hardware.SensorManager r0 = r6.f7529b     // Catch:{ all -> 0x006a }
            if (r0 == 0) goto L_0x0068
            android.hardware.Sensor r2 = r6.f7530c     // Catch:{ all -> 0x006a }
            if (r2 == 0) goto L_0x0068
            r3 = 2
            r0.registerListener(r6, r2, r3)     // Catch:{ all -> 0x006a }
            i5.e r0 = p053g4.C4409t.m29310b()     // Catch:{ all -> 0x006a }
            long r2 = r0.mo18370a()     // Catch:{ all -> 0x006a }
            com.google.android.gms.internal.ads.ez r0 = com.google.android.gms.internal.ads.C2679nz.f14350K7     // Catch:{ all -> 0x006a }
            com.google.android.gms.internal.ads.lz r4 = p060h4.C4596v.m30088c()     // Catch:{ all -> 0x006a }
            java.lang.Object r0 = r4.mo12227b(r0)     // Catch:{ all -> 0x006a }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x006a }
            int r0 = r0.intValue()     // Catch:{ all -> 0x006a }
            long r4 = (long) r0     // Catch:{ all -> 0x006a }
            long r2 = r2 - r4
            r6.f7531d = r2     // Catch:{ all -> 0x006a }
            r6.f7534g = r1     // Catch:{ all -> 0x006a }
            java.lang.String r0 = "Listening for shake gestures."
            p073j4.C4794n1.m30693k(r0)     // Catch:{ all -> 0x006a }
        L_0x0068:
            monitor-exit(r6)     // Catch:{ all -> 0x006a }
            return
        L_0x006a:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x006a }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bz1.mo8991b():void");
    }

    /* renamed from: c */
    public final void mo8992c(az1 az1) {
        this.f7533f = az1;
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14330I7)).booleanValue()) {
            float[] fArr = sensorEvent.values;
            float f = fArr[0] / 9.80665f;
            float f2 = fArr[1] / 9.80665f;
            float f3 = fArr[2] / 9.80665f;
            if (((float) Math.sqrt((double) ((f * f) + (f2 * f2) + (f3 * f3)))) >= ((Float) C4596v.m30088c().mo12227b(C2679nz.f14340J7)).floatValue()) {
                long a = C4409t.m29310b().mo18370a();
                if (this.f7531d + ((long) ((Integer) C4596v.m30088c().mo12227b(C2679nz.f14350K7)).intValue()) <= a) {
                    if (this.f7531d + ((long) ((Integer) C4596v.m30088c().mo12227b(C2679nz.f14360L7)).intValue()) < a) {
                        this.f7532e = 0;
                    }
                    C4794n1.m30693k("Shake detected.");
                    this.f7531d = a;
                    int i = this.f7532e + 1;
                    this.f7532e = i;
                    az1 az1 = this.f7533f;
                    if (az1 != null) {
                        if (i == ((Integer) C4596v.m30088c().mo12227b(C2679nz.f14370M7)).intValue()) {
                            ey1 ey1 = (ey1) az1;
                            ey1.mo10037h(new by1(ey1), dy1.GESTURE);
                        }
                    }
                }
            }
        }
    }
}
