package com.startapp;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Handler;
import com.startapp.sdk.adsbase.C9441e;
import com.startapp.sdk.adsbase.remoteconfig.MotionMetadata;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.startapp.j6 */
/* compiled from: Sta */
public class C9045j6 {

    /* renamed from: j */
    public static final AtomicInteger f37011j = new AtomicInteger();

    /* renamed from: a */
    public final Context f37012a;

    /* renamed from: b */
    public final C9441e f37013b;

    /* renamed from: c */
    public final C8908d3<MotionMetadata> f37014c;

    /* renamed from: d */
    public final Handler f37015d;

    /* renamed from: e */
    public C9113l6 f37016e;

    /* renamed from: f */
    public boolean f37017f;

    /* renamed from: g */
    public int f37018g;

    /* renamed from: h */
    public Sensor f37019h;

    /* renamed from: i */
    public final SensorEventListener f37020i = new C9046a();

    /* renamed from: com.startapp.j6$a */
    /* compiled from: Sta */
    public class C9046a implements SensorEventListener {
        public C9046a() {
        }

        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        public void onSensorChanged(SensorEvent sensorEvent) {
            try {
                C9045j6 j6Var = C9045j6.this;
                C9113l6 l6Var = j6Var.f37016e;
                if (l6Var != null) {
                    if (!(l6Var.f37273a.offer(sensorEvent))) {
                        j6Var.mo29511a(8, (Throwable) null);
                    }
                }
            } catch (OutOfMemoryError unused) {
                C9045j6 j6Var2 = C9045j6.this;
                j6Var2.getClass();
                j6Var2.mo29516e();
            } catch (Throwable th) {
                C9023i4.m48681a(th);
            }
        }
    }

    public C9045j6(Context context, C9441e eVar, C8908d3<MotionMetadata> d3Var, Handler handler) {
        this.f37012a = context;
        this.f37013b = eVar;
        this.f37014c = d3Var;
        this.f37015d = handler;
    }

    /* renamed from: a */
    public final MotionMetadata mo29510a() {
        MotionMetadata call = this.f37014c.call();
        if (call == null || !call.mo31079u()) {
            return null;
        }
        return call;
    }

    /* renamed from: b */
    public double mo29513b() {
        MotionMetadata a = mo29510a();
        if (a == null) {
            return -1.0d;
        }
        C9113l6 l6Var = this.f37016e;
        if (l6Var != null) {
            return Double.longBitsToDouble(l6Var.f37275c.get());
        }
        return ((double) this.f37013b.getFloat("e9142de3c7cc5952", 0.0f)) * C9628x.m50499a(System.currentTimeMillis(), this.f37013b.getLong("7783513af1730383", 0), a.mo31058b(), a.mo31057a(), a.mo31059c(), C9624wb.m50496a(0.0d, a.mo31057a(), a.mo31059c()));
    }

    /* renamed from: c */
    public final void mo29514c() {
        if (this.f37016e != null) {
            C9441e.C9442a a = this.f37013b.edit();
            float longBitsToDouble = (float) Double.longBitsToDouble(this.f37016e.f37276d.get());
            a.mo30812a("e9142de3c7cc5952", Float.valueOf(longBitsToDouble));
            a.f38873a.putFloat("e9142de3c7cc5952", longBitsToDouble);
            long j = this.f37016e.f37277e.get();
            a.mo30812a("7783513af1730383", Long.valueOf(j));
            a.f38873a.putLong("7783513af1730383", j);
            a.apply();
            if (mo29512a(4)) {
                C9023i4 i4Var = new C9023i4(C9043j4.f36993d);
                i4Var.f36952d = "MP.save";
                i4Var.f36953e = String.format(Locale.ENGLISH, "%.6f", new Object[]{Double.valueOf(mo29513b())});
                i4Var.mo29471a();
            }
        }
    }

    /* renamed from: d */
    public final void mo29515d() {
        SensorManager sensorManager;
        MotionMetadata a = mo29510a();
        if (a != null && (sensorManager = (SensorManager) this.f37012a.getSystemService("sensor")) != null && Build.VERSION.SDK_INT >= 9 && this.f37019h == null) {
            Sensor defaultSensor = sensorManager.getDefaultSensor(1);
            int min = Math.min(Math.max(10000, (int) (C9605vb.m50478e(a.mo31076r()) * 1000)), 100000);
            if (defaultSensor != null && sensorManager.registerListener(this.f37020i, defaultSensor, min)) {
                this.f37019h = defaultSensor;
                double d = (double) this.f37013b.getFloat("e9142de3c7cc5952", 0.0f);
                long j = this.f37013b.getLong("7783513af1730383", 0);
                C9113l6 l6Var = this.f37016e;
                if (l6Var != null) {
                    l6Var.interrupt();
                    this.f37016e = null;
                }
                if (this.f37016e == null) {
                    StringBuilder a2 = C8870c1.m48422a("startapp-mp-");
                    a2.append(f37011j.incrementAndGet());
                    C9113l6 l6Var2 = new C9113l6(a2.toString(), this.f37012a, a, a.mo31075q(), d, j);
                    this.f37016e = l6Var2;
                    l6Var2.start();
                }
                if (mo29512a(1)) {
                    C9023i4 i4Var = new C9023i4(C9043j4.f36993d);
                    i4Var.f36952d = "MP.start";
                    i4Var.f36953e = defaultSensor.getName() + "," + defaultSensor.getMinDelay() + "," + defaultSensor.getPower();
                    i4Var.mo29471a();
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo29516e() {
        Sensor sensor;
        SensorManager sensorManager = (SensorManager) this.f37012a.getSystemService("sensor");
        if (sensorManager != null && (sensor = this.f37019h) != null) {
            sensorManager.unregisterListener(this.f37020i, sensor);
            this.f37019h = null;
            mo29514c();
            C9113l6 l6Var = this.f37016e;
            if (l6Var != null) {
                l6Var.interrupt();
                this.f37016e = null;
            }
            if (mo29512a(2)) {
                C9023i4 i4Var = new C9023i4(C9043j4.f36993d);
                i4Var.f36952d = "MP.stop";
                i4Var.mo29471a();
            }
        }
    }

    /* renamed from: a */
    public final boolean mo29512a(int i) {
        MotionMetadata a;
        if (!this.f37017f || (a = mo29510a()) == null || (i & a.mo31068j()) == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo29511a(int i, Throwable th) {
        if (mo29512a(i)) {
            int i2 = this.f37018g;
            if (!((i2 & i) != 0)) {
                this.f37018g = i2 | i;
                if (th != null) {
                    C9023i4.m48681a(th);
                    return;
                }
                C9023i4 i4Var = new C9023i4(C9043j4.f36994e);
                i4Var.f36952d = "MP";
                i4Var.f36953e = String.valueOf(i);
                i4Var.mo29471a();
            }
        }
    }
}
