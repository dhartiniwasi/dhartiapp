package com.startapp;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;
import com.startapp.sdk.adsbase.remoteconfig.BaseSensorConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.SensorsConfig;
import java.util.HashMap;
import org.json.JSONArray;

/* renamed from: com.startapp.p9 */
/* compiled from: Sta */
public class C9222p9 {

    /* renamed from: a */
    public HashMap<Integer, C9224b> f38073a = null;

    /* renamed from: b */
    public C9197o9 f38074b = new C9197o9();

    /* renamed from: c */
    public SensorManager f38075c;

    /* renamed from: d */
    public C9620w7 f38076d;

    /* renamed from: e */
    public int f38077e;

    /* renamed from: f */
    public SensorEventListener f38078f = new C9223a();

    /* renamed from: com.startapp.p9$a */
    /* compiled from: Sta */
    public class C9223a implements SensorEventListener {
        public C9223a() {
        }

        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        public void onSensorChanged(SensorEvent sensorEvent) {
            int size;
            JSONArray jSONArray;
            C9197o9 o9Var = C9222p9.this.f38074b;
            synchronized (o9Var) {
                int type = sensorEvent.sensor.getType();
                SensorEvent sensorEvent2 = o9Var.f38007a.get(Integer.valueOf(type));
                if (sensorEvent2 == null || sensorEvent2.accuracy <= sensorEvent.accuracy) {
                    o9Var.f38007a.put(Integer.valueOf(type), sensorEvent);
                }
                size = o9Var.f38007a.size();
            }
            C9222p9 p9Var = C9222p9.this;
            if (size == p9Var.f38077e) {
                p9Var.f38075c.unregisterListener(p9Var.f38078f);
                C9222p9 p9Var2 = C9222p9.this;
                C9620w7 w7Var = p9Var2.f38076d;
                if (w7Var != null) {
                    try {
                        jSONArray = p9Var2.f38074b.mo29794a();
                    } catch (Exception unused) {
                        jSONArray = null;
                    }
                    w7Var.mo29232a(jSONArray);
                }
            }
        }
    }

    /* renamed from: com.startapp.p9$b */
    /* compiled from: Sta */
    public class C9224b {

        /* renamed from: a */
        public int f38080a;

        /* renamed from: b */
        public int f38081b;

        public C9224b(C9222p9 p9Var, int i, int i2) {
            this.f38080a = i;
            this.f38081b = i2;
        }
    }

    public C9222p9(Context context, C9620w7 w7Var) {
        this.f38075c = (SensorManager) context.getSystemService("sensor");
        this.f38076d = w7Var;
        this.f38077e = 0;
        mo29823a();
    }

    /* renamed from: a */
    public final void mo29823a() {
        this.f38073a = new HashMap<>();
        SensorsConfig H = MetaData.f38952k.mo30992H();
        mo29824a(13, H.mo31114a());
        mo29824a(9, H.mo31115b());
        mo29824a(5, H.mo31117d());
        mo29824a(10, H.mo31118e());
        mo29824a(2, H.mo31120f());
        mo29824a(6, H.mo31121g());
        mo29824a(12, H.mo31124i());
        mo29824a(11, H.mo31125j());
        mo29824a(16, H.mo31116c());
    }

    /* renamed from: b */
    public void mo29825b() {
        Sensor defaultSensor;
        for (Integer intValue : this.f38073a.keySet()) {
            int intValue2 = intValue.intValue();
            C9224b bVar = this.f38073a.get(Integer.valueOf(intValue2));
            if (Build.VERSION.SDK_INT >= bVar.f38080a && (defaultSensor = this.f38075c.getDefaultSensor(intValue2)) != null) {
                this.f38075c.registerListener(this.f38078f, defaultSensor, bVar.f38081b);
                this.f38077e++;
            }
        }
    }

    /* renamed from: a */
    public final void mo29824a(int i, BaseSensorConfig baseSensorConfig) {
        if (baseSensorConfig.mo30958c()) {
            this.f38073a.put(Integer.valueOf(i), new C9224b(this, baseSensorConfig.mo30957b(), baseSensorConfig.mo30956a()));
        }
    }
}
