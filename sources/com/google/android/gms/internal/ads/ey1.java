package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p053g4.C4409t;
import p060h4.C4596v;
import p060h4.C4604w1;
import p060h4.C4623z2;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class ey1 implements az1, nx1 {

    /* renamed from: a */
    private final my1 f9008a;

    /* renamed from: b */
    private final bz1 f9009b;

    /* renamed from: c */
    private final ox1 f9010c;

    /* renamed from: d */
    private final zx1 f9011d;

    /* renamed from: e */
    private final mx1 f9012e;

    /* renamed from: f */
    private final zy1 f9013f;

    /* renamed from: g */
    private final String f9014g;

    /* renamed from: h */
    private final String f9015h;

    /* renamed from: i */
    private final Map f9016i = new HashMap();

    /* renamed from: j */
    private final Map f9017j = new HashMap();

    /* renamed from: k */
    private final Map f9018k = new HashMap();

    /* renamed from: l */
    private String f9019l = "{}";

    /* renamed from: m */
    private String f9020m = "";

    /* renamed from: n */
    private long f9021n = Long.MAX_VALUE;

    /* renamed from: o */
    private ay1 f9022o = ay1.NONE;

    /* renamed from: p */
    private boolean f9023p;

    /* renamed from: q */
    private int f9024q;

    /* renamed from: r */
    private boolean f9025r;

    /* renamed from: s */
    private dy1 f9026s = dy1.UNKNOWN;

    ey1(my1 my1, bz1 bz1, ox1 ox1, Context context, vm0 vm0, zx1 zx1, zy1 zy1) {
        this.f9008a = my1;
        this.f9009b = bz1;
        this.f9010c = ox1;
        this.f9012e = new mx1(context);
        this.f9014g = vm0.f19150a;
        this.f9015h = "afma-sdk-a-v21.3.0";
        this.f9011d = zx1;
        this.f9013f = zy1;
        C4409t.m29329u().mo18560g(this);
    }

    /* renamed from: p */
    private final synchronized JSONObject m12312p() throws JSONException {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        for (Map.Entry entry : this.f9016i.entrySet()) {
            JSONArray jSONArray = new JSONArray();
            for (qx1 qx1 : (List) entry.getValue()) {
                if (qx1.mo13622f()) {
                    jSONArray.put(qx1.mo13619b());
                }
            }
            if (jSONArray.length() > 0) {
                jSONObject.put((String) entry.getKey(), jSONArray);
            }
        }
        return jSONObject;
    }

    /* renamed from: q */
    private final void m12313q() {
        this.f9025r = true;
        this.f9011d.mo15673c();
        this.f9008a.mo12468e(this);
        this.f9009b.mo8992c(this);
        this.f9010c.mo13061c(this);
        this.f9013f.mo15679d(this);
        m12319w(C4409t.m29325q().mo15117h().mo18490Y());
    }

    /* renamed from: r */
    private final void m12314r() {
        C4409t.m29325q().mo15117h().mo18483C(mo10033d());
    }

    /* renamed from: s */
    private final synchronized void m12315s(ay1 ay1, boolean z) {
        if (this.f9022o != ay1) {
            if (mo10043n()) {
                m12317u();
            }
            this.f9022o = ay1;
            if (mo10043n()) {
                m12318v();
            }
            if (z) {
                m12314r();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x003b A[DONT_GENERATE] */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void m12316t(boolean r2, boolean r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.f9023p     // Catch:{ all -> 0x003d }
            if (r0 != r2) goto L_0x0007
            monitor-exit(r1)
            return
        L_0x0007:
            r1.f9023p = r2     // Catch:{ all -> 0x003d }
            if (r2 == 0) goto L_0x002b
            com.google.android.gms.internal.ads.ez r2 = com.google.android.gms.internal.ads.C2679nz.f14440T7     // Catch:{ all -> 0x003d }
            com.google.android.gms.internal.ads.lz r0 = p060h4.C4596v.m30088c()     // Catch:{ all -> 0x003d }
            java.lang.Object r2 = r0.mo12227b(r2)     // Catch:{ all -> 0x003d }
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ all -> 0x003d }
            boolean r2 = r2.booleanValue()     // Catch:{ all -> 0x003d }
            if (r2 == 0) goto L_0x0027
            j4.x r2 = p053g4.C4409t.m29329u()     // Catch:{ all -> 0x003d }
            boolean r2 = r2.mo18565l()     // Catch:{ all -> 0x003d }
            if (r2 != 0) goto L_0x002b
        L_0x0027:
            r1.m12318v()     // Catch:{ all -> 0x003d }
            goto L_0x0034
        L_0x002b:
            boolean r2 = r1.mo10043n()     // Catch:{ all -> 0x003d }
            if (r2 != 0) goto L_0x0034
            r1.m12317u()     // Catch:{ all -> 0x003d }
        L_0x0034:
            if (r3 == 0) goto L_0x003b
            r1.m12314r()     // Catch:{ all -> 0x003d }
            monitor-exit(r1)
            return
        L_0x003b:
            monitor-exit(r1)
            return
        L_0x003d:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ey1.m12316t(boolean, boolean):void");
    }

    /* renamed from: u */
    private final synchronized void m12317u() {
        ay1 ay1 = ay1.NONE;
        int ordinal = this.f9022o.ordinal();
        if (ordinal == 1) {
            this.f9009b.mo8990a();
        } else if (ordinal == 2) {
            this.f9010c.mo13059a();
        }
    }

    /* renamed from: v */
    private final synchronized void m12318v() {
        ay1 ay1 = ay1.NONE;
        int ordinal = this.f9022o.ordinal();
        if (ordinal == 1) {
            this.f9009b.mo8991b();
        } else if (ordinal == 2) {
            this.f9010c.mo13060b();
        }
    }

    /* renamed from: w */
    private final synchronized void m12319w(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                m12316t(jSONObject.optBoolean("isTestMode", false), false);
                m12315s(ay1.m10131a(jSONObject.optString("gesture", "NONE")), false);
                this.f9019l = jSONObject.optString("networkExtras", "{}");
                this.f9021n = jSONObject.optLong("networkExtrasExpirationSecs", Long.MAX_VALUE);
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: a */
    public final ay1 mo10030a() {
        return this.f9022o;
    }

    /* renamed from: b */
    public final synchronized lf3 mo10031b(String str) {
        in0 in0;
        in0 = new in0();
        if (this.f9017j.containsKey(str)) {
            in0.mo11172d((qx1) this.f9017j.get(str));
        } else {
            if (!this.f9018k.containsKey(str)) {
                this.f9018k.put(str, new ArrayList());
            }
            ((List) this.f9018k.get(str)).add(in0);
        }
        return in0;
    }

    /* renamed from: c */
    public final synchronized String mo10032c() {
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14290E7)).booleanValue()) {
            if (mo10043n()) {
                if (this.f9021n < C4409t.m29310b().mo18370a() / 1000) {
                    this.f9019l = "{}";
                    this.f9021n = Long.MAX_VALUE;
                    return "";
                } else if (this.f9019l.equals("{}")) {
                    return "";
                } else {
                    return this.f9019l;
                }
            }
        }
        return "";
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:1|2|3|4|5|(1:7)|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0033 */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.lang.String mo10033d() {
        /*
            r7 = this;
            monitor-enter(r7)
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ all -> 0x0039 }
            r0.<init>()     // Catch:{ all -> 0x0039 }
            java.lang.String r1 = "isTestMode"
            boolean r2 = r7.f9023p     // Catch:{ JSONException -> 0x0033 }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x0033 }
            java.lang.String r1 = "gesture"
            com.google.android.gms.internal.ads.ay1 r2 = r7.f9022o     // Catch:{ JSONException -> 0x0033 }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x0033 }
            long r1 = r7.f9021n     // Catch:{ JSONException -> 0x0033 }
            i5.e r3 = p053g4.C4409t.m29310b()     // Catch:{ JSONException -> 0x0033 }
            long r3 = r3.mo18370a()     // Catch:{ JSONException -> 0x0033 }
            r5 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 / r5
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0033
            java.lang.String r1 = "networkExtras"
            java.lang.String r2 = r7.f9019l     // Catch:{ JSONException -> 0x0033 }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x0033 }
            java.lang.String r1 = "networkExtrasExpirationSecs"
            long r2 = r7.f9021n     // Catch:{ JSONException -> 0x0033 }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x0033 }
        L_0x0033:
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0039 }
            monitor-exit(r7)
            return r0
        L_0x0039:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ey1.mo10033d():java.lang.String");
    }

    /* renamed from: e */
    public final synchronized JSONObject mo10034e() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        try {
            jSONObject.put("platform", "ANDROID");
            jSONObject.put("sdkVersion", this.f9015h);
            jSONObject.put("internalSdkVersion", this.f9014g);
            jSONObject.put("osVersion", Build.VERSION.RELEASE);
            jSONObject.put("adapters", this.f9011d.mo15672a());
            if (this.f9021n < C4409t.m29310b().mo18370a() / 1000) {
                this.f9019l = "{}";
            }
            jSONObject.put("networkExtras", this.f9019l);
            jSONObject.put("adSlots", m12312p());
            jSONObject.put("appInfo", this.f9012e.mo12462a());
            String c = C4409t.m29325q().mo15117h().mo18486U().mo13843c();
            if (!TextUtils.isEmpty(c)) {
                jSONObject.put("cld", new JSONObject(c));
            }
            if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14450U7)).booleanValue() && !TextUtils.isEmpty(this.f9020m)) {
                String str = this.f9020m;
                pm0.m18662b("Policy violation data: " + str);
                jSONObject.put("policyViolations", new JSONObject(this.f9020m));
            }
            if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14440T7)).booleanValue()) {
                jSONObject.put("openAction", this.f9026s);
                jSONObject.put("gesture", this.f9022o);
            }
        } catch (JSONException e) {
            C4409t.m29325q().mo15125s(e, "Inspector.toJson");
            pm0.m18668h("Ad inspector encountered an error", e);
        }
        return jSONObject;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a2, code lost:
        return;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo10035f(java.lang.String r4, com.google.android.gms.internal.ads.qx1 r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.ez r0 = com.google.android.gms.internal.ads.C2679nz.f14290E7     // Catch:{ all -> 0x00a3 }
            com.google.android.gms.internal.ads.lz r1 = p060h4.C4596v.m30088c()     // Catch:{ all -> 0x00a3 }
            java.lang.Object r0 = r1.mo12227b(r0)     // Catch:{ all -> 0x00a3 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x00a3 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x00a3 }
            if (r0 == 0) goto L_0x00a1
            boolean r0 = r3.mo10043n()     // Catch:{ all -> 0x00a3 }
            if (r0 != 0) goto L_0x001b
            goto L_0x00a1
        L_0x001b:
            int r0 = r3.f9024q     // Catch:{ all -> 0x00a3 }
            com.google.android.gms.internal.ads.ez r1 = com.google.android.gms.internal.ads.C2679nz.f14310G7     // Catch:{ all -> 0x00a3 }
            com.google.android.gms.internal.ads.lz r2 = p060h4.C4596v.m30088c()     // Catch:{ all -> 0x00a3 }
            java.lang.Object r1 = r2.mo12227b(r1)     // Catch:{ all -> 0x00a3 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x00a3 }
            int r1 = r1.intValue()     // Catch:{ all -> 0x00a3 }
            if (r0 < r1) goto L_0x0036
            java.lang.String r4 = "Maximum number of ad requests stored reached. Dropping the current request."
            com.google.android.gms.internal.ads.pm0.m18667g(r4)     // Catch:{ all -> 0x00a3 }
            monitor-exit(r3)
            return
        L_0x0036:
            java.util.Map r0 = r3.f9016i     // Catch:{ all -> 0x00a3 }
            boolean r0 = r0.containsKey(r4)     // Catch:{ all -> 0x00a3 }
            if (r0 != 0) goto L_0x0048
            java.util.Map r0 = r3.f9016i     // Catch:{ all -> 0x00a3 }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x00a3 }
            r1.<init>()     // Catch:{ all -> 0x00a3 }
            r0.put(r4, r1)     // Catch:{ all -> 0x00a3 }
        L_0x0048:
            int r0 = r3.f9024q     // Catch:{ all -> 0x00a3 }
            int r0 = r0 + 1
            r3.f9024q = r0     // Catch:{ all -> 0x00a3 }
            java.util.Map r0 = r3.f9016i     // Catch:{ all -> 0x00a3 }
            java.lang.Object r4 = r0.get(r4)     // Catch:{ all -> 0x00a3 }
            java.util.List r4 = (java.util.List) r4     // Catch:{ all -> 0x00a3 }
            r4.add(r5)     // Catch:{ all -> 0x00a3 }
            com.google.android.gms.internal.ads.ez r4 = com.google.android.gms.internal.ads.C2679nz.f14506a8     // Catch:{ all -> 0x00a3 }
            com.google.android.gms.internal.ads.lz r0 = p060h4.C4596v.m30088c()     // Catch:{ all -> 0x00a3 }
            java.lang.Object r4 = r0.mo12227b(r4)     // Catch:{ all -> 0x00a3 }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x00a3 }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x00a3 }
            if (r4 != 0) goto L_0x006d
            monitor-exit(r3)
            return
        L_0x006d:
            java.lang.String r4 = r5.mo13618a()     // Catch:{ all -> 0x00a3 }
            java.util.Map r0 = r3.f9017j     // Catch:{ all -> 0x00a3 }
            r0.put(r4, r5)     // Catch:{ all -> 0x00a3 }
            java.util.Map r0 = r3.f9018k     // Catch:{ all -> 0x00a3 }
            boolean r0 = r0.containsKey(r4)     // Catch:{ all -> 0x00a3 }
            if (r0 == 0) goto L_0x009f
            java.util.Map r0 = r3.f9018k     // Catch:{ all -> 0x00a3 }
            java.lang.Object r4 = r0.get(r4)     // Catch:{ all -> 0x00a3 }
            java.util.List r4 = (java.util.List) r4     // Catch:{ all -> 0x00a3 }
            java.util.Iterator r0 = r4.iterator()     // Catch:{ all -> 0x00a3 }
        L_0x008a:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x00a3 }
            if (r1 == 0) goto L_0x009a
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x00a3 }
            com.google.android.gms.internal.ads.in0 r1 = (com.google.android.gms.internal.ads.in0) r1     // Catch:{ all -> 0x00a3 }
            r1.mo11172d(r5)     // Catch:{ all -> 0x00a3 }
            goto L_0x008a
        L_0x009a:
            r4.clear()     // Catch:{ all -> 0x00a3 }
            monitor-exit(r3)
            return
        L_0x009f:
            monitor-exit(r3)
            return
        L_0x00a1:
            monitor-exit(r3)
            return
        L_0x00a3:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ey1.mo10035f(java.lang.String, com.google.android.gms.internal.ads.qx1):void");
    }

    /* renamed from: g */
    public final void mo10036g() {
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14290E7)).booleanValue()) {
            if (!((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14440T7)).booleanValue() || !C4409t.m29325q().mo15117h().mo18504i()) {
                String Y = C4409t.m29325q().mo15117h().mo18490Y();
                if (!TextUtils.isEmpty(Y)) {
                    try {
                        if (new JSONObject(Y).optBoolean("isTestMode", false)) {
                            m12313q();
                        }
                    } catch (JSONException unused) {
                    }
                }
            } else {
                m12313q();
            }
        }
    }

    /* renamed from: h */
    public final synchronized void mo10037h(C4604w1 w1Var, dy1 dy1) {
        if (!mo10043n()) {
            try {
                w1Var.mo8986j4(eu2.m12271d(18, (String) null, (C4623z2) null));
            } catch (RemoteException unused) {
                pm0.m18667g("Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.");
            }
        } else {
            if (!((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14290E7)).booleanValue()) {
                try {
                    w1Var.mo8986j4(eu2.m12271d(1, (String) null, (C4623z2) null));
                } catch (RemoteException unused2) {
                    pm0.m18667g("Ad inspector had an internal error.");
                }
            } else {
                this.f9026s = dy1;
                this.f9008a.mo12470g(w1Var, new f60(this), new r60(this.f9013f));
            }
        }
    }

    /* renamed from: i */
    public final synchronized void mo10038i(String str, long j) {
        this.f9019l = str;
        this.f9021n = j;
        m12314r();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        if (r2 != false) goto L_0x000c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x001b  */
    /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo10039j(boolean r2) {
        /*
            r1 = this;
            boolean r0 = r1.f9025r
            if (r0 != 0) goto L_0x000a
            if (r2 == 0) goto L_0x0015
            r1.m12313q()
            goto L_0x000c
        L_0x000a:
            if (r2 == 0) goto L_0x0015
        L_0x000c:
            boolean r2 = r1.f9023p
            if (r2 == 0) goto L_0x0011
            goto L_0x0015
        L_0x0011:
            r1.m12318v()
            return
        L_0x0015:
            boolean r2 = r1.mo10043n()
            if (r2 != 0) goto L_0x001e
            r1.m12317u()
        L_0x001e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ey1.mo10039j(boolean):void");
    }

    /* renamed from: k */
    public final void mo10040k(ay1 ay1) {
        m12315s(ay1, true);
    }

    /* renamed from: l */
    public final synchronized void mo10041l(String str) {
        this.f9020m = str;
    }

    /* renamed from: m */
    public final void mo10042m(boolean z) {
        if (!this.f9025r && z) {
            m12313q();
        }
        m12316t(z, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
        return r2.f9023p || p053g4.C4409t.m29329u().mo18565l();
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo10043n() {
        /*
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.ez r0 = com.google.android.gms.internal.ads.C2679nz.f14440T7     // Catch:{ all -> 0x002b }
            com.google.android.gms.internal.ads.lz r1 = p060h4.C4596v.m30088c()     // Catch:{ all -> 0x002b }
            java.lang.Object r0 = r1.mo12227b(r0)     // Catch:{ all -> 0x002b }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x002b }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x002b }
            if (r0 == 0) goto L_0x0027
            boolean r0 = r2.f9023p     // Catch:{ all -> 0x002b }
            if (r0 != 0) goto L_0x0025
            j4.x r0 = p053g4.C4409t.m29329u()     // Catch:{ all -> 0x002b }
            boolean r0 = r0.mo18565l()     // Catch:{ all -> 0x002b }
            if (r0 == 0) goto L_0x0022
            goto L_0x0025
        L_0x0022:
            r0 = 0
        L_0x0023:
            monitor-exit(r2)
            return r0
        L_0x0025:
            r0 = 1
            goto L_0x0023
        L_0x0027:
            boolean r0 = r2.f9023p     // Catch:{ all -> 0x002b }
            monitor-exit(r2)
            return r0
        L_0x002b:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ey1.mo10043n():boolean");
    }

    /* renamed from: o */
    public final synchronized boolean mo10044o() {
        return this.f9023p;
    }
}
