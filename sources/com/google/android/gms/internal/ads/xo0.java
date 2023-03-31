package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Display;
import android.view.WindowManager;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class xo0 implements SensorEventListener {

    /* renamed from: a */
    private final SensorManager f20279a;

    /* renamed from: b */
    private final Object f20280b = new Object();

    /* renamed from: c */
    private final Display f20281c;

    /* renamed from: d */
    private final float[] f20282d = new float[9];

    /* renamed from: e */
    private final float[] f20283e = new float[9];

    /* renamed from: f */
    private float[] f20284f;

    /* renamed from: g */
    private Handler f20285g;

    /* renamed from: h */
    private wo0 f20286h;

    xo0(Context context) {
        this.f20279a = (SensorManager) context.getSystemService("sensor");
        this.f20281c = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo15202a(wo0 wo0) {
        this.f20286h = wo0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo15203b() {
        if (this.f20285g == null) {
            Sensor defaultSensor = this.f20279a.getDefaultSensor(11);
            if (defaultSensor == null) {
                pm0.m18664d("No Sensor of TYPE_ROTATION_VECTOR");
                return;
            }
            HandlerThread handlerThread = new HandlerThread("OrientationMonitor");
            handlerThread.start();
            b53 b53 = new b53(handlerThread.getLooper());
            this.f20285g = b53;
            if (!this.f20279a.registerListener(this, defaultSensor, 0, b53)) {
                pm0.m18664d("SensorManager.registerListener failed.");
                mo15204c();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo15204c() {
        if (this.f20285g != null) {
            this.f20279a.unregisterListener(this);
            this.f20285g.post(new vo0(this));
            this.f20285g = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo15205d(float[] fArr) {
        synchronized (this.f20280b) {
            float[] fArr2 = this.f20284f;
            if (fArr2 == null) {
                return false;
            }
            System.arraycopy(fArr2, 0, fArr, 0, 9);
            return true;
        }
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        if (fArr[0] != 0.0f || fArr[1] != 0.0f || fArr[2] != 0.0f) {
            synchronized (this.f20280b) {
                if (this.f20284f == null) {
                    this.f20284f = new float[9];
                }
            }
            SensorManager.getRotationMatrixFromVector(this.f20282d, fArr);
            int rotation = this.f20281c.getRotation();
            if (rotation == 1) {
                SensorManager.remapCoordinateSystem(this.f20282d, 2, 129, this.f20283e);
            } else if (rotation == 2) {
                SensorManager.remapCoordinateSystem(this.f20282d, 129, 130, this.f20283e);
            } else if (rotation != 3) {
                System.arraycopy(this.f20282d, 0, this.f20283e, 0, 9);
            } else {
                SensorManager.remapCoordinateSystem(this.f20282d, 130, 1, this.f20283e);
            }
            float[] fArr2 = this.f20283e;
            float f = fArr2[1];
            fArr2[1] = fArr2[3];
            fArr2[3] = f;
            float f2 = fArr2[2];
            fArr2[2] = fArr2[6];
            fArr2[6] = f2;
            float f3 = fArr2[5];
            fArr2[5] = fArr2[7];
            fArr2[7] = f3;
            synchronized (this.f20280b) {
                System.arraycopy(this.f20283e, 0, this.f20284f, 0, 9);
            }
            wo0 wo0 = this.f20286h;
            if (wo0 != null) {
                wo0.zza();
            }
        }
    }
}
