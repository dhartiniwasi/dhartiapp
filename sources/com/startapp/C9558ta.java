package com.startapp;

import android.content.Context;
import android.os.Build;
import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.SignalStrength;
import android.telephony.TelephonyCallback;
import android.telephony.TelephonyManager;
import com.startapp.sdk.adsbase.C9441e;
import com.startapp.sdk.adsbase.remoteconfig.TelephonyDataConfig;
import com.startapp.sdk.adsbase.remoteconfig.TelephonyMetadata;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.startapp.ta */
/* compiled from: Sta */
public class C9558ta {

    /* renamed from: a */
    public final Context f39195a;

    /* renamed from: b */
    public final C9256r3 f39196b;

    /* renamed from: c */
    public final C9441e f39197c;

    /* renamed from: d */
    public final C8923e2 f39198d;

    /* renamed from: e */
    public final C8908d3<TelephonyMetadata> f39199e;

    /* renamed from: f */
    public C9562c f39200f;

    /* renamed from: g */
    public final double f39201g = Math.random();

    /* renamed from: h */
    public volatile String f39202h = "e106";

    /* renamed from: com.startapp.ta$a */
    /* compiled from: Sta */
    public class C9559a implements Runnable {
        public C9559a() {
        }

        public void run() {
            C9558ta taVar = C9558ta.this;
            taVar.getClass();
            try {
                if (taVar.mo31285a() != null) {
                    C9562c a = taVar.mo31286a((Class<?>) SignalStrength.class);
                    if (a != null) {
                        a.mo31292a();
                    }
                }
            } catch (Throwable th) {
                if (taVar.mo31289a(8)) {
                    C9023i4.m48681a(th);
                }
            }
        }
    }

    /* renamed from: com.startapp.ta$b */
    /* compiled from: Sta */
    public class C9560b extends C9562c {

        /* renamed from: d */
        public final TelephonyCallback f39204d = new C9561a();

        /* renamed from: com.startapp.ta$b$a */
        /* compiled from: Sta */
        public class C9561a extends TelephonyCallback implements TelephonyCallback.ServiceStateListener, TelephonyCallback.SignalStrengthsListener {
            public C9561a() {
            }

            public void onServiceStateChanged(ServiceState serviceState) {
                C9560b.this.mo31296a(ServiceState.class, serviceState);
            }

            public void onSignalStrengthsChanged(SignalStrength signalStrength) {
                C9558ta.this.mo31288a(signalStrength);
                C9560b.this.mo31296a(SignalStrength.class, signalStrength);
            }
        }

        public C9560b(TelephonyManager telephonyManager, Class<?> cls) {
            super(telephonyManager, cls);
        }

        /* renamed from: a */
        public void mo31292a() {
            this.f39207a.registerTelephonyCallback(C9558ta.this.f39196b, this.f39204d);
        }

        /* renamed from: b */
        public void mo31293b() {
            this.f39207a.unregisterTelephonyCallback(this.f39204d);
        }
    }

    /* renamed from: com.startapp.ta$c */
    /* compiled from: Sta */
    public abstract class C9562c {

        /* renamed from: a */
        public final TelephonyManager f39207a;

        /* renamed from: b */
        public final Class<?> f39208b;

        public C9562c(TelephonyManager telephonyManager, Class<?> cls) {
            this.f39207a = telephonyManager;
            this.f39208b = cls;
        }

        /* renamed from: a */
        public abstract void mo31292a();

        /* renamed from: a */
        public <T> void mo31296a(Class<T> cls, T t) {
            C9558ta taVar = C9558ta.this;
            taVar.getClass();
            try {
                TelephonyMetadata a = taVar.mo31285a();
                if (a != null) {
                    if (t != null) {
                        long currentTimeMillis = System.currentTimeMillis();
                        String simpleName = cls.getSimpleName();
                        if (a.mo31139a(simpleName).mo31135c()) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("timestamp", currentTimeMillis);
                            jSONObject.put("type", simpleName);
                            jSONObject.put(JsonStorageKeyNames.DATA_KEY, t.toString());
                            String c = C9605vb.m50475c(jSONObject.toString());
                            C9441e.C9442a a2 = taVar.f39197c.edit();
                            a2.mo30812a(simpleName, c);
                            a2.f38873a.putString(simpleName, c);
                            a2.apply();
                        }
                    }
                }
            } catch (Throwable th) {
                if (taVar.mo31289a(2)) {
                    C9023i4.m48681a(th);
                }
            }
            if (cls.equals(this.f39208b)) {
                try {
                    mo31293b();
                } catch (Throwable th2) {
                    if (C9558ta.this.mo31289a(16)) {
                        C9023i4.m48681a(th2);
                    }
                }
            }
        }

        /* renamed from: b */
        public abstract void mo31293b();
    }

    /* renamed from: com.startapp.ta$d */
    /* compiled from: Sta */
    public class C9563d extends C9562c {

        /* renamed from: d */
        public final PhoneStateListener f39210d = new C9564a();

        /* renamed from: com.startapp.ta$d$a */
        /* compiled from: Sta */
        public class C9564a extends PhoneStateListener {
            public C9564a() {
            }

            public void onServiceStateChanged(ServiceState serviceState) {
                C9563d.this.mo31296a(ServiceState.class, serviceState);
            }

            public void onSignalStrengthsChanged(SignalStrength signalStrength) {
                C9558ta.this.mo31288a(signalStrength);
                C9563d.this.mo31296a(SignalStrength.class, signalStrength);
            }
        }

        public C9563d(TelephonyManager telephonyManager, Class<?> cls) {
            super(telephonyManager, cls);
        }

        /* renamed from: a */
        public void mo31292a() {
            this.f39207a.listen(this.f39210d, 257);
        }

        /* renamed from: b */
        public void mo31293b() {
            this.f39207a.listen(this.f39210d, 0);
        }
    }

    public C9558ta(Context context, C9256r3 r3Var, C9441e eVar, C8923e2 e2Var, C8908d3<TelephonyMetadata> d3Var) {
        this.f39195a = context;
        this.f39196b = r3Var;
        this.f39197c = eVar;
        this.f39198d = e2Var;
        this.f39199e = d3Var;
    }

    /* renamed from: a */
    public final C9562c mo31286a(Class<?> cls) {
        TelephonyManager telephonyManager = (TelephonyManager) this.f39195a.getSystemService("phone");
        if (telephonyManager == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT < 31) {
            return new C9563d(telephonyManager, cls);
        }
        return new C9560b(telephonyManager, cls);
    }

    /* renamed from: b */
    public void mo31290b() {
        this.f39196b.execute(new C9559a());
    }

    /* renamed from: a */
    public final TelephonyMetadata mo31285a() {
        TelephonyMetadata call;
        if (!this.f39198d.mo29324c() || (call = this.f39199e.call()) == null || !call.mo31141c()) {
            return null;
        }
        return call;
    }

    /* renamed from: a */
    public boolean mo31289a(int i) {
        TelephonyMetadata a = mo31285a();
        if (a == null || this.f39201g >= a.mo31140b() || (a.mo31138a() & i) != i) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo31288a(SignalStrength signalStrength) {
        if (signalStrength != null) {
            try {
                if (Build.VERSION.SDK_INT >= 23) {
                    this.f39202h = String.valueOf(signalStrength.getLevel());
                } else {
                    this.f39202h = String.valueOf(SignalStrength.class.getMethod("getLevel", new Class[0]).invoke(signalStrength, new Object[0]));
                }
            } catch (NoSuchMethodException unused) {
                this.f39202h = "e104";
            } catch (Throwable unused2) {
                this.f39202h = "e105";
            }
        }
    }

    /* renamed from: a */
    public Map<String, String> mo31287a(C9043j4 j4Var) {
        List<String> a;
        TelephonyMetadata a2 = mo31285a();
        if (a2 == null) {
            return Collections.emptyMap();
        }
        HashMap hashMap = null;
        for (Map.Entry next : this.f39197c.getAll().entrySet()) {
            Object value = next.getValue();
            if (value instanceof String) {
                String str = (String) next.getKey();
                TelephonyDataConfig a3 = a2.mo31139a(str);
                if (a3.mo31135c() && (a = a3.mo31133a()) != null && a.contains(j4Var.f37008a)) {
                    String b = a3.mo31134b();
                    if (b != null) {
                        str = b;
                    }
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    hashMap.put(str, (String) value);
                }
            }
        }
        return hashMap == null ? Collections.emptyMap() : hashMap;
    }
}
