package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.unity3d.ads.metadata.MediationMetaData;
import org.json.JSONException;
import org.json.JSONObject;
import p060h4.C4596v;
import p060h4.C4623z2;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class mb2 extends md0 {

    /* renamed from: a */
    private final String f13292a;

    /* renamed from: b */
    private final kd0 f13293b;

    /* renamed from: c */
    private final in0 f13294c;

    /* renamed from: d */
    private final JSONObject f13295d;

    /* renamed from: e */
    private boolean f13296e = false;

    public mb2(String str, kd0 kd0, in0 in0) {
        JSONObject jSONObject = new JSONObject();
        this.f13295d = jSONObject;
        this.f13294c = in0;
        this.f13292a = str;
        this.f13293b = kd0;
        try {
            jSONObject.put("adapter_version", kd0.mo11086T().toString());
            jSONObject.put("sdk_version", kd0.mo11089c().toString());
            jSONObject.put(MediationMetaData.KEY_NAME, str);
        } catch (RemoteException | NullPointerException | JSONException unused) {
        }
    }

    /* renamed from: I6 */
    public static synchronized void m16466I6(String str, in0 in0) {
        synchronized (mb2.class) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(MediationMetaData.KEY_NAME, str);
                jSONObject.put("signal_error", "Adapter failed to instantiate");
                if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14689t1)).booleanValue()) {
                    jSONObject.put("signal_error_code", 1);
                }
                in0.mo11172d(jSONObject);
            } catch (JSONException unused) {
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:6|7|(1:9)|10|11|12|13) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0027 */
    /* renamed from: J6 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void m16467J6(java.lang.String r3, int r4) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f13296e     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r2)
            return
        L_0x0007:
            org.json.JSONObject r0 = r2.f13295d     // Catch:{ JSONException -> 0x0027 }
            java.lang.String r1 = "signal_error"
            r0.put(r1, r3)     // Catch:{ JSONException -> 0x0027 }
            com.google.android.gms.internal.ads.ez r3 = com.google.android.gms.internal.ads.C2679nz.f14689t1     // Catch:{ JSONException -> 0x0027 }
            com.google.android.gms.internal.ads.lz r0 = p060h4.C4596v.m30088c()     // Catch:{ JSONException -> 0x0027 }
            java.lang.Object r3 = r0.mo12227b(r3)     // Catch:{ JSONException -> 0x0027 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ JSONException -> 0x0027 }
            boolean r3 = r3.booleanValue()     // Catch:{ JSONException -> 0x0027 }
            if (r3 == 0) goto L_0x0027
            org.json.JSONObject r3 = r2.f13295d     // Catch:{ JSONException -> 0x0027 }
            java.lang.String r0 = "signal_error_code"
            r3.put(r0, r4)     // Catch:{ JSONException -> 0x0027 }
        L_0x0027:
            com.google.android.gms.internal.ads.in0 r3 = r2.f13294c     // Catch:{ all -> 0x0033 }
            org.json.JSONObject r4 = r2.f13295d     // Catch:{ all -> 0x0033 }
            r3.mo11172d(r4)     // Catch:{ all -> 0x0033 }
            r3 = 1
            r2.f13296e = r3     // Catch:{ all -> 0x0033 }
            monitor-exit(r2)
            return
        L_0x0033:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.mb2.m16467J6(java.lang.String, int):void");
    }

    /* renamed from: T2 */
    public final synchronized void mo12303T2(C4623z2 z2Var) throws RemoteException {
        m16467J6(z2Var.f25063b, 2);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:6|7|(1:9)|10|11|12|13) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0021 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo12304b() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f13296e     // Catch:{ all -> 0x002d }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r3)
            return
        L_0x0007:
            com.google.android.gms.internal.ads.ez r0 = com.google.android.gms.internal.ads.C2679nz.f14689t1     // Catch:{ JSONException -> 0x0021 }
            com.google.android.gms.internal.ads.lz r1 = p060h4.C4596v.m30088c()     // Catch:{ JSONException -> 0x0021 }
            java.lang.Object r0 = r1.mo12227b(r0)     // Catch:{ JSONException -> 0x0021 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ JSONException -> 0x0021 }
            boolean r0 = r0.booleanValue()     // Catch:{ JSONException -> 0x0021 }
            if (r0 == 0) goto L_0x0021
            org.json.JSONObject r0 = r3.f13295d     // Catch:{ JSONException -> 0x0021 }
            java.lang.String r1 = "signal_error_code"
            r2 = 0
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x0021 }
        L_0x0021:
            com.google.android.gms.internal.ads.in0 r0 = r3.f13294c     // Catch:{ all -> 0x002d }
            org.json.JSONObject r1 = r3.f13295d     // Catch:{ all -> 0x002d }
            r0.mo11172d(r1)     // Catch:{ all -> 0x002d }
            r0 = 1
            r3.f13296e = r0     // Catch:{ all -> 0x002d }
            monitor-exit(r3)
            return
        L_0x002d:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.mb2.mo12304b():void");
    }

    /* renamed from: e */
    public final synchronized void mo12305e() {
        m16467J6("Signal collection timeout.", 3);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:12|13|(1:15)|16|17|18|19) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0031 */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo12306k(java.lang.String r3) throws android.os.RemoteException {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f13296e     // Catch:{ all -> 0x003d }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r2)
            return
        L_0x0007:
            if (r3 != 0) goto L_0x0010
            java.lang.String r3 = "Adapter returned null signals"
            r2.mo12307v(r3)     // Catch:{ all -> 0x003d }
            monitor-exit(r2)
            return
        L_0x0010:
            org.json.JSONObject r0 = r2.f13295d     // Catch:{ JSONException -> 0x0031 }
            java.lang.String r1 = "signals"
            r0.put(r1, r3)     // Catch:{ JSONException -> 0x0031 }
            com.google.android.gms.internal.ads.ez r3 = com.google.android.gms.internal.ads.C2679nz.f14689t1     // Catch:{ JSONException -> 0x0031 }
            com.google.android.gms.internal.ads.lz r0 = p060h4.C4596v.m30088c()     // Catch:{ JSONException -> 0x0031 }
            java.lang.Object r3 = r0.mo12227b(r3)     // Catch:{ JSONException -> 0x0031 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ JSONException -> 0x0031 }
            boolean r3 = r3.booleanValue()     // Catch:{ JSONException -> 0x0031 }
            if (r3 == 0) goto L_0x0031
            org.json.JSONObject r3 = r2.f13295d     // Catch:{ JSONException -> 0x0031 }
            java.lang.String r0 = "signal_error_code"
            r1 = 0
            r3.put(r0, r1)     // Catch:{ JSONException -> 0x0031 }
        L_0x0031:
            com.google.android.gms.internal.ads.in0 r3 = r2.f13294c     // Catch:{ all -> 0x003d }
            org.json.JSONObject r0 = r2.f13295d     // Catch:{ all -> 0x003d }
            r3.mo11172d(r0)     // Catch:{ all -> 0x003d }
            r3 = 1
            r2.f13296e = r3     // Catch:{ all -> 0x003d }
            monitor-exit(r2)
            return
        L_0x003d:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.mb2.mo12306k(java.lang.String):void");
    }

    /* renamed from: v */
    public final synchronized void mo12307v(String str) throws RemoteException {
        m16467J6(str, 2);
    }
}
