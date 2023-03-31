package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zs1 {

    /* renamed from: a */
    private final xt2 f21263a;

    /* renamed from: b */
    private final ws1 f21264b;

    zs1(xt2 xt2, ws1 ws1) {
        this.f21263a = xt2;
        this.f21264b = ws1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final qb0 mo15655a() throws RemoteException {
        qb0 b = this.f21263a.mo15243b();
        if (b != null) {
            return b;
        }
        pm0.m18667g("Unexpected call to adapter creator.");
        throw new RemoteException();
    }

    /* renamed from: b */
    public final kd0 mo15656b(String str) throws RemoteException {
        kd0 x = mo15655a().mo12564x(str);
        this.f21264b.mo14988e(str, x);
        return x;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003a, code lost:
        if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(r6) != false) goto L_0x003c;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.au2 mo15657c(java.lang.String r6, org.json.JSONObject r7) throws com.google.android.gms.internal.ads.jt2 {
        /*
            r5 = this;
            java.lang.String r0 = "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter"
            com.google.android.gms.internal.ads.au2 r1 = new com.google.android.gms.internal.ads.au2     // Catch:{ all -> 0x0070 }
            java.lang.String r2 = "com.google.ads.mediation.admob.AdMobAdapter"
            boolean r2 = r2.equals(r6)     // Catch:{ all -> 0x0070 }
            if (r2 == 0) goto L_0x0017
            com.google.android.gms.internal.ads.pc0 r7 = new com.google.android.gms.internal.ads.pc0     // Catch:{ all -> 0x0070 }
            com.google.ads.mediation.admob.AdMobAdapter r0 = new com.google.ads.mediation.admob.AdMobAdapter     // Catch:{ all -> 0x0070 }
            r0.<init>()     // Catch:{ all -> 0x0070 }
            r7.<init>((p087l4.C4934f) r0)     // Catch:{ all -> 0x0070 }
            goto L_0x0067
        L_0x0017:
            java.lang.String r2 = "com.google.ads.mediation.admob.AdMobCustomTabsAdapter"
            boolean r2 = r2.equals(r6)     // Catch:{ all -> 0x0070 }
            if (r2 == 0) goto L_0x002a
            com.google.android.gms.internal.ads.pc0 r7 = new com.google.android.gms.internal.ads.pc0     // Catch:{ all -> 0x0070 }
            com.google.android.gms.internal.ads.zzbxu r0 = new com.google.android.gms.internal.ads.zzbxu     // Catch:{ all -> 0x0070 }
            r0.<init>()     // Catch:{ all -> 0x0070 }
            r7.<init>((p087l4.C4934f) r0)     // Catch:{ all -> 0x0070 }
            goto L_0x0067
        L_0x002a:
            com.google.android.gms.internal.ads.qb0 r2 = r5.mo15655a()     // Catch:{ all -> 0x0070 }
            boolean r3 = r0.equals(r6)     // Catch:{ all -> 0x0070 }
            java.lang.String r4 = "com.google.ads.mediation.customevent.CustomEventAdapter"
            if (r3 != 0) goto L_0x003c
            boolean r3 = r4.equals(r6)     // Catch:{ all -> 0x0070 }
            if (r3 == 0) goto L_0x0063
        L_0x003c:
            java.lang.String r3 = "class_name"
            java.lang.String r7 = r7.getString(r3)     // Catch:{ JSONException -> 0x005d }
            boolean r3 = r2.mo12563k(r7)     // Catch:{ JSONException -> 0x005d }
            if (r3 == 0) goto L_0x004d
            com.google.android.gms.internal.ads.tb0 r7 = r2.mo12562i(r0)     // Catch:{ JSONException -> 0x005d }
            goto L_0x0067
        L_0x004d:
            boolean r0 = r2.mo12565z(r7)     // Catch:{ JSONException -> 0x005d }
            if (r0 == 0) goto L_0x0058
            com.google.android.gms.internal.ads.tb0 r7 = r2.mo12562i(r7)     // Catch:{ JSONException -> 0x005d }
            goto L_0x0067
        L_0x0058:
            com.google.android.gms.internal.ads.tb0 r7 = r2.mo12562i(r4)     // Catch:{ JSONException -> 0x005d }
            goto L_0x0067
        L_0x005d:
            r7 = move-exception
            java.lang.String r0 = "Invalid custom event."
            com.google.android.gms.internal.ads.pm0.m18665e(r0, r7)     // Catch:{ all -> 0x0070 }
        L_0x0063:
            com.google.android.gms.internal.ads.tb0 r7 = r2.mo12562i(r6)     // Catch:{ all -> 0x0070 }
        L_0x0067:
            r1.<init>(r7)     // Catch:{ all -> 0x0070 }
            com.google.android.gms.internal.ads.ws1 r7 = r5.f21264b
            r7.mo14987d(r6, r1)
            return r1
        L_0x0070:
            r7 = move-exception
            com.google.android.gms.internal.ads.ez r0 = com.google.android.gms.internal.ads.C2679nz.f14496Z7
            com.google.android.gms.internal.ads.lz r1 = p060h4.C4596v.m30088c()
            java.lang.Object r0 = r1.mo12227b(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0089
            com.google.android.gms.internal.ads.ws1 r0 = r5.f21264b
            r1 = 0
            r0.mo14987d(r6, r1)
        L_0x0089:
            com.google.android.gms.internal.ads.jt2 r6 = new com.google.android.gms.internal.ads.jt2
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zs1.mo15657c(java.lang.String, org.json.JSONObject):com.google.android.gms.internal.ads.au2");
    }

    /* renamed from: d */
    public final boolean mo15658d() {
        return this.f21263a.mo15243b() != null;
    }
}
