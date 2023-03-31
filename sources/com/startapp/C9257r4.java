package com.startapp;

import com.startapp.sdk.adsbase.SimpleTokenUtils;
import com.startapp.sdk.common.SDKException;
import com.startapp.sdk.common.utils.Pair;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import java.util.Map;

/* renamed from: com.startapp.r4 */
/* compiled from: Sta */
public class C9257r4 extends C9671z0 {

    /* renamed from: h0 */
    public final C9023i4 f38139h0;

    /* renamed from: i0 */
    public String f38140i0;

    /* renamed from: j0 */
    public String f38141j0;

    /* renamed from: k0 */
    public String f38142k0;

    /* renamed from: l0 */
    public String f38143l0;

    /* renamed from: m0 */
    public String f38144m0;

    /* renamed from: n0 */
    public String f38145n0;

    /* renamed from: o0 */
    public String f38146o0;

    /* renamed from: p0 */
    public Map<String, String> f38147p0;

    public C9257r4(C9023i4 i4Var) {
        super(8);
        this.f38139h0 = i4Var;
    }

    /* renamed from: a */
    public void mo29314a(C9152n8 n8Var) throws SDKException {
        super.mo29314a(n8Var);
        C9023i4 i4Var = this.f38139h0;
        Long l = i4Var.f36956h;
        String l2 = l != null ? l.toString() : C8811a.m48222a();
        n8Var.mo29310a(C8811a.f36366b, (Object) l2, true, true);
        n8Var.mo29310a(C8811a.f36367c, (Object) C8811a.m48223a(l2), true, true);
        n8Var.mo29310a("category", (Object) i4Var.f36949a.f37008a, true, true);
        n8Var.mo29310a("value", (Object) i4Var.f36952d, false, true);
        n8Var.mo29310a("d", (Object) i4Var.f36955g, false, true);
        n8Var.mo29310a("appActivity", (Object) i4Var.f36957i, false, true);
        n8Var.mo29310a("details", (Object) i4Var.f36953e, false, true);
        n8Var.mo29310a("details_json", i4Var.f36954f, false, true);
        n8Var.mo29310a("isService", (Object) Boolean.valueOf(i4Var.f36958j), false, true);
        n8Var.mo29310a(AdUnitActivity.EXTRA_ORIENTATION, (Object) this.f38140i0, false, true);
        n8Var.mo29310a("usedRam", (Object) this.f38141j0, false, true);
        n8Var.mo29310a("freeRam", (Object) this.f38142k0, false, true);
        n8Var.mo29310a("sessionTime", (Object) null, false, true);
        n8Var.mo29310a("cellScanRes", (Object) this.f38143l0, false, true);
        n8Var.mo29310a("sens", (Object) this.f38144m0, false, true);
        n8Var.mo29310a("bt", (Object) this.f38145n0, false, true);
        n8Var.mo29310a("packagingType", (Object) this.f38146o0, false, true);
        Pair<String, String> a = SimpleTokenUtils.m49705a();
        Pair<String, String> b = SimpleTokenUtils.m49708b();
        n8Var.mo29310a((String) a.first, (Object) a.second, false, true);
        n8Var.mo29310a((String) b.first, (Object) b.second, false, true);
        Map<String, String> map = this.f38147p0;
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                n8Var.mo29310a((String) next.getKey(), next.getValue(), false, true);
            }
        }
        n8Var.mo29310a("rcd", (Object) null, false, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031 A[Catch:{ all -> 0x0064 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo29867b(android.content.Context r9, com.startapp.sdk.adsbase.model.AdPreferences r10) {
        /*
            r8 = this;
            super.mo29867b(r9, r10)
            android.content.res.Resources r10 = r9.getResources()
            r0 = 1
            if (r10 == 0) goto L_0x001d
            android.content.res.Configuration r10 = r10.getConfiguration()
            if (r10 == 0) goto L_0x001d
            int r10 = r10.orientation
            r1 = 2
            if (r10 != r1) goto L_0x0018
            java.lang.String r10 = "landscape"
            goto L_0x001f
        L_0x0018:
            if (r10 != r0) goto L_0x001d
            java.lang.String r10 = "portrait"
            goto L_0x001f
        L_0x001d:
            java.lang.String r10 = "undefined"
        L_0x001f:
            r8.f38140i0 = r10
            r10 = 0
            java.lang.String[] r1 = new java.lang.String[]{r10, r10}
            r2 = 0
            java.lang.String r3 = "activity"
            java.lang.Object r9 = r9.getSystemService(r3)     // Catch:{ all -> 0x0064 }
            android.app.ActivityManager r9 = (android.app.ActivityManager) r9     // Catch:{ all -> 0x0064 }
            if (r9 == 0) goto L_0x0079
            android.app.ActivityManager$MemoryInfo r3 = new android.app.ActivityManager$MemoryInfo     // Catch:{ all -> 0x0064 }
            r3.<init>()     // Catch:{ all -> 0x0064 }
            r9.getMemoryInfo(r3)     // Catch:{ all -> 0x0064 }
            long r4 = r3.availMem     // Catch:{ all -> 0x0064 }
            r6 = 1048576(0x100000, double:5.180654E-318)
            long r4 = r4 / r6
            java.lang.String r9 = java.lang.Long.toString(r4)     // Catch:{ all -> 0x0064 }
            r1[r2] = r9     // Catch:{ all -> 0x0064 }
            int r9 = com.startapp.C8837b0.f36438a     // Catch:{ all -> 0x0064 }
            int r9 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0064 }
            r4 = 16
            if (r9 < r4) goto L_0x0053
            long r9 = r3.totalMem     // Catch:{ all -> 0x0064 }
            java.lang.Long r10 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x0064 }
        L_0x0053:
            if (r10 == 0) goto L_0x0079
            long r9 = r10.longValue()     // Catch:{ all -> 0x0064 }
            long r3 = r3.availMem     // Catch:{ all -> 0x0064 }
            long r9 = r9 - r3
            long r9 = r9 / r6
            java.lang.String r9 = java.lang.Long.toString(r9)     // Catch:{ all -> 0x0064 }
            r1[r0] = r9     // Catch:{ all -> 0x0064 }
            goto L_0x0079
        L_0x0064:
            r9 = move-exception
            java.lang.Class<java.lang.SecurityException> r10 = java.lang.SecurityException.class
            boolean r10 = com.startapp.C9605vb.m50466a((java.lang.Throwable) r9, (java.lang.Class<? extends java.lang.Throwable>) r10)
            if (r10 != 0) goto L_0x0079
            java.lang.Class<android.os.RemoteException> r10 = android.os.RemoteException.class
            boolean r10 = com.startapp.C9605vb.m50466a((java.lang.Throwable) r9, (java.lang.Class<? extends java.lang.Throwable>) r10)
            if (r10 == 0) goto L_0x0076
            goto L_0x0079
        L_0x0076:
            com.startapp.C9023i4.m48681a((java.lang.Throwable) r9)
        L_0x0079:
            r9 = r1[r2]
            r8.f38142k0 = r9
            r9 = r1[r0]
            r8.f38141j0 = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.C9257r4.mo29867b(android.content.Context, com.startapp.sdk.adsbase.model.AdPreferences):void");
    }

    public String toString() {
        return this.f38139h0.toString();
    }
}
