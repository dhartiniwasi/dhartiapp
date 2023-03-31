package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p053g4.C4409t;
import p060h4.C4596v;
import p073j4.C4794n1;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class kx1 {

    /* renamed from: a */
    private boolean f12323a = false;

    /* renamed from: b */
    private boolean f12324b = false;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f12325c = false;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final long f12326d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final in0 f12327e = new in0();

    /* renamed from: f */
    private final Context f12328f;

    /* renamed from: g */
    private final WeakReference f12329g;

    /* renamed from: h */
    private final zs1 f12330h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final Executor f12331i;

    /* renamed from: j */
    private final Executor f12332j;

    /* renamed from: k */
    private final ScheduledExecutorService f12333k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final pv1 f12334l;

    /* renamed from: m */
    private final vm0 f12335m;

    /* renamed from: n */
    private final Map f12336n = new ConcurrentHashMap();
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final tg1 f12337o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final az2 f12338p;

    /* renamed from: q */
    private boolean f12339q = true;

    public kx1(Executor executor, Context context, WeakReference weakReference, Executor executor2, zs1 zs1, ScheduledExecutorService scheduledExecutorService, pv1 pv1, vm0 vm0, tg1 tg1, az2 az2) {
        this.f12330h = zs1;
        this.f12328f = context;
        this.f12329g = weakReference;
        this.f12331i = executor2;
        this.f12333k = scheduledExecutorService;
        this.f12332j = executor;
        this.f12334l = pv1;
        this.f12335m = vm0;
        this.f12337o = tg1;
        this.f12338p = az2;
        this.f12326d = C4409t.m29310b().mo18371b();
        m15660v("com.google.android.gms.ads.MobileAds", false, "", 0);
    }

    /* renamed from: j */
    static /* bridge */ /* synthetic */ void m15657j(kx1 kx1, String str) {
        kx1 kx12 = kx1;
        int i = 5;
        ny2 a = my2.m16825a(kx12.f12328f, 5);
        a.mo11828T();
        try {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject(str).getJSONObject("initializer_settings").getJSONObject("config");
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                ny2 a2 = my2.m16825a(kx12.f12328f, i);
                a2.mo11828T();
                a2.mo11835x(next);
                Object obj = new Object();
                in0 in0 = new in0();
                lf3 o = cf3.m10917o(in0, ((Long) C4596v.m30088c().mo12227b(C2679nz.f14254B1)).longValue(), TimeUnit.SECONDS, kx12.f12333k);
                kx12.f12334l.mo13398c(next);
                kx12.f12337o.mo14301x(next);
                long b = C4409t.m29310b().mo18371b();
                bx1 bx1 = r1;
                lf3 lf3 = o;
                bx1 bx12 = new bx1(kx1, obj, in0, next, b, a2);
                lf3.mo10135j(bx1, kx12.f12331i);
                arrayList.add(lf3);
                jx1 jx1 = new jx1(kx1, obj, next, b, a2, in0);
                JSONObject optJSONObject = jSONObject.optJSONObject(next);
                ArrayList arrayList2 = new ArrayList();
                if (optJSONObject != null) {
                    try {
                        JSONArray jSONArray = optJSONObject.getJSONArray(JsonStorageKeyNames.DATA_KEY);
                        int i2 = 0;
                        while (i2 < jSONArray.length()) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                            String optString = jSONObject2.optString("format", "");
                            JSONObject optJSONObject2 = jSONObject2.optJSONObject(JsonStorageKeyNames.DATA_KEY);
                            Bundle bundle = new Bundle();
                            if (optJSONObject2 != null) {
                                Iterator<String> keys2 = optJSONObject2.keys();
                                while (keys2.hasNext()) {
                                    String next2 = keys2.next();
                                    bundle.putString(next2, optJSONObject2.optString(next2, ""));
                                    jSONArray = jSONArray;
                                }
                            }
                            JSONArray jSONArray2 = jSONArray;
                            arrayList2.add(new d80(optString, bundle));
                            i2++;
                            jSONArray = jSONArray2;
                        }
                    } catch (JSONException unused) {
                    }
                }
                kx12.m15660v(next, false, "", 0);
                try {
                    kx12.f12332j.execute(new fx1(kx1, kx12.f12330h.mo15657c(next, new JSONObject()), jx1, arrayList2, next));
                } catch (jt2 unused2) {
                    try {
                        jx1.mo11534k("Failed to create Adapter.");
                    } catch (RemoteException e) {
                        pm0.m18665e("", e);
                    }
                }
                i = 5;
            }
            cf3.m10903a(arrayList).mo8777a(new cx1(kx12, a), kx12.f12331i);
        } catch (JSONException e2) {
            C4794n1.m30694l("Malformed CLD response", e2);
            kx12.f12337o.mo14299f("MalformedJson");
            kx12.f12334l.mo13396a("MalformedJson");
            kx12.f12327e.mo11173e(e2);
            C4409t.m29325q().mo15126t(e2, "AdapterInitializer.updateAdapterStatus");
            az2 az2 = kx12.f12338p;
            a.mo11826G(false);
            az2.mo8629b(a.mo11831W());
        }
    }

    /* renamed from: u */
    private final synchronized lf3 m15659u() {
        String c = C4409t.m29325q().mo15117h().mo18486U().mo13843c();
        if (!TextUtils.isEmpty(c)) {
            return cf3.m10911i(c);
        }
        in0 in0 = new in0();
        C4409t.m29325q().mo15117h().mo18503h(new gx1(this, in0));
        return in0;
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public final void m15660v(String str, boolean z, String str2, int i) {
        this.f12336n.put(str, new s70(str, z, i, str2));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ Object mo11801f(ny2 ny2) throws Exception {
        this.f12327e.mo11172d(Boolean.TRUE);
        az2 az2 = this.f12338p;
        ny2.mo11826G(true);
        az2.mo8629b(ny2.mo11831W());
        return null;
    }

    /* renamed from: g */
    public final List mo11802g() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.f12336n.keySet()) {
            s70 s70 = (s70) this.f12336n.get(str);
            arrayList.add(new s70(str, s70.f17286b, s70.f17287c, s70.f17288d));
        }
        return arrayList;
    }

    /* renamed from: l */
    public final void mo11803l() {
        this.f12339q = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final /* synthetic */ void mo11804m() {
        synchronized (this) {
            if (!this.f12325c) {
                m15660v("com.google.android.gms.ads.MobileAds", false, "Timeout.", (int) (C4409t.m29310b().mo18371b() - this.f12326d));
                this.f12334l.mo13397b("com.google.android.gms.ads.MobileAds", "timeout");
                this.f12337o.mo14300k("com.google.android.gms.ads.MobileAds", "timeout");
                this.f12327e.mo11173e(new Exception());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:7|8|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002b, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002c, code lost:
        com.google.android.gms.internal.ads.pm0.m18665e("", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0031, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        r3.mo11534k("Failed to initialize adapter. " + r5 + " does not implement the initialize() method.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002a, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0011 */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void mo11805n(com.google.android.gms.internal.ads.au2 r2, com.google.android.gms.internal.ads.w70 r3, java.util.List r4, java.lang.String r5) {
        /*
            r1 = this;
            java.lang.ref.WeakReference r0 = r1.f12329g     // Catch:{ jt2 -> 0x0011 }
            java.lang.Object r0 = r0.get()     // Catch:{ jt2 -> 0x0011 }
            android.content.Context r0 = (android.content.Context) r0     // Catch:{ jt2 -> 0x0011 }
            if (r0 == 0) goto L_0x000b
            goto L_0x000d
        L_0x000b:
            android.content.Context r0 = r1.f12328f     // Catch:{ jt2 -> 0x0011 }
        L_0x000d:
            r2.mo8548l(r0, r3, r4)     // Catch:{ jt2 -> 0x0011 }
            return
        L_0x0011:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ RemoteException -> 0x002b }
            r2.<init>()     // Catch:{ RemoteException -> 0x002b }
            java.lang.String r4 = "Failed to initialize adapter. "
            r2.append(r4)     // Catch:{ RemoteException -> 0x002b }
            r2.append(r5)     // Catch:{ RemoteException -> 0x002b }
            java.lang.String r4 = " does not implement the initialize() method."
            r2.append(r4)     // Catch:{ RemoteException -> 0x002b }
            java.lang.String r2 = r2.toString()     // Catch:{ RemoteException -> 0x002b }
            r3.mo11534k(r2)     // Catch:{ RemoteException -> 0x002b }
            return
        L_0x002b:
            r2 = move-exception
            java.lang.String r3 = ""
            com.google.android.gms.internal.ads.pm0.m18665e(r3, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.kx1.mo11805n(com.google.android.gms.internal.ads.au2, com.google.android.gms.internal.ads.w70, java.util.List, java.lang.String):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final /* synthetic */ void mo11806o(in0 in0) {
        this.f12331i.execute(new zw1(this, in0));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final /* synthetic */ void mo11807p() {
        this.f12334l.mo13400e();
        this.f12337o.mo14298a();
        this.f12324b = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final /* synthetic */ void mo11808q(Object obj, in0 in0, String str, long j, ny2 ny2) {
        synchronized (obj) {
            if (!in0.isDone()) {
                m15660v(str, false, "Timeout.", (int) (C4409t.m29310b().mo18371b() - j));
                this.f12334l.mo13397b(str, "timeout");
                this.f12337o.mo14300k(str, "timeout");
                az2 az2 = this.f12338p;
                ny2.mo11826G(false);
                az2.mo8629b(ny2.mo11831W());
                in0.mo11172d(Boolean.FALSE);
            }
        }
    }

    /* renamed from: r */
    public final void mo11809r() {
        if (!((Boolean) j10.f11170a.mo13438e()).booleanValue()) {
            if (this.f12335m.f19152c >= ((Integer) C4596v.m30088c().mo12227b(C2679nz.f14244A1)).intValue() && this.f12339q) {
                if (!this.f12323a) {
                    synchronized (this) {
                        if (!this.f12323a) {
                            this.f12334l.mo13401f();
                            this.f12337o.mo14297T();
                            this.f12327e.mo10135j(new ax1(this), this.f12331i);
                            this.f12323a = true;
                            lf3 u = m15659u();
                            this.f12333k.schedule(new dx1(this), ((Long) C4596v.m30088c().mo12227b(C2679nz.f14264C1)).longValue(), TimeUnit.SECONDS);
                            cf3.m10920r(u, new ix1(this), this.f12331i);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
        }
        if (!this.f12323a) {
            m15660v("com.google.android.gms.ads.MobileAds", true, "", 0);
            this.f12327e.mo11172d(Boolean.FALSE);
            this.f12323a = true;
            this.f12324b = true;
        }
    }

    /* renamed from: s */
    public final void mo11810s(z70 z70) {
        this.f12327e.mo10135j(new ex1(this, z70), this.f12332j);
    }

    /* renamed from: t */
    public final boolean mo11811t() {
        return this.f12324b;
    }
}
