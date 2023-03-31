package com.google.android.gms.internal.ads;

import android.content.Context;
import p060h4.C4596v;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class j31 extends v51 {

    /* renamed from: i */
    private final vs0 f11200i;

    /* renamed from: j */
    private final int f11201j;

    /* renamed from: k */
    private final Context f11202k;

    /* renamed from: l */
    private final r21 f11203l;

    /* renamed from: m */
    private final uj1 f11204m;

    /* renamed from: n */
    private final yg1 f11205n;

    /* renamed from: o */
    private final ja1 f11206o;

    /* renamed from: p */
    private final boolean f11207p;

    /* renamed from: q */
    private boolean f11208q = false;

    j31(u51 u51, Context context, vs0 vs0, int i, r21 r21, uj1 uj1, yg1 yg1, ja1 ja1) {
        super(u51);
        this.f11200i = vs0;
        this.f11202k = context;
        this.f11201j = i;
        this.f11203l = r21;
        this.f11204m = uj1;
        this.f11205n = yg1;
        this.f11206o = ja1;
        this.f11207p = ((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14692t4)).booleanValue();
    }

    /* renamed from: a */
    public final void mo11305a() {
        super.mo11305a();
        vs0 vs0 = this.f11200i;
        if (vs0 != null) {
            vs0.destroy();
        }
    }

    /* renamed from: h */
    public final int mo11306h() {
        return this.f11201j;
    }

    /* renamed from: i */
    public final void mo11307i(C2488it itVar) {
        vs0 vs0 = this.f11200i;
        if (vs0 != null) {
            vs0.mo12125n1(itVar);
        }
    }

    /* JADX WARNING: type inference failed for: r3v11, types: [android.content.Context] */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11308j(android.app.Activity r3, com.google.android.gms.internal.ads.C2970vt r4, boolean r5) throws android.os.RemoteException {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x0004
            android.content.Context r3 = r2.f11202k
        L_0x0004:
            boolean r4 = r2.f11207p
            if (r4 == 0) goto L_0x000d
            com.google.android.gms.internal.ads.yg1 r4 = r2.f11205n
            r4.mo15437d()
        L_0x000d:
            com.google.android.gms.internal.ads.ez r4 = com.google.android.gms.internal.ads.C2679nz.f14738y0
            com.google.android.gms.internal.ads.lz r0 = p060h4.C4596v.m30088c()
            java.lang.Object r4 = r0.mo12227b(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x0061
            p053g4.C4409t.m29326r()
            boolean r4 = p073j4.C4751b2.m30608c(r3)
            if (r4 == 0) goto L_0x0061
            java.lang.String r4 = "Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies"
            com.google.android.gms.internal.ads.pm0.m18667g(r4)
            com.google.android.gms.internal.ads.ja1 r4 = r2.f11206o
            r4.mo8287d()
            com.google.android.gms.internal.ads.ez r4 = com.google.android.gms.internal.ads.C2679nz.f14748z0
            com.google.android.gms.internal.ads.lz r5 = p060h4.C4596v.m30088c()
            java.lang.Object r4 = r5.mo12227b(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x0094
            com.google.android.gms.internal.ads.q23 r4 = new com.google.android.gms.internal.ads.q23
            android.content.Context r3 = r3.getApplicationContext()
            j4.x0 r5 = p053g4.C4409t.m29330v()
            android.os.Looper r5 = r5.mo18569b()
            r4.<init>(r3, r5)
            com.google.android.gms.internal.ads.us2 r3 = r2.f18929a
            com.google.android.gms.internal.ads.ts2 r3 = r3.f18723b
            com.google.android.gms.internal.ads.ls2 r3 = r3.f18244b
            java.lang.String r3 = r3.f12930b
            r4.mo13461a(r3)
            return
        L_0x0061:
            boolean r4 = r2.f11208q
            if (r4 == 0) goto L_0x0076
            java.lang.String r4 = "App open interstitial ad is already visible."
            com.google.android.gms.internal.ads.pm0.m18667g(r4)
            com.google.android.gms.internal.ads.ja1 r4 = r2.f11206o
            r0 = 10
            r1 = 0
            h4.z2 r0 = com.google.android.gms.internal.ads.eu2.m12271d(r0, r1, r1)
            r4.mo8289g(r0)
        L_0x0076:
            boolean r4 = r2.f11208q
            if (r4 != 0) goto L_0x0094
            com.google.android.gms.internal.ads.uj1 r4 = r2.f11204m     // Catch:{ tj1 -> 0x008e }
            com.google.android.gms.internal.ads.ja1 r0 = r2.f11206o     // Catch:{ tj1 -> 0x008e }
            r4.mo10408a(r5, r3, r0)     // Catch:{ tj1 -> 0x008e }
            boolean r3 = r2.f11207p     // Catch:{ tj1 -> 0x008e }
            if (r3 == 0) goto L_0x008a
            com.google.android.gms.internal.ads.yg1 r3 = r2.f11205n     // Catch:{ tj1 -> 0x008e }
            r3.zza()     // Catch:{ tj1 -> 0x008e }
        L_0x008a:
            r3 = 1
            r2.f11208q = r3
            return
        L_0x008e:
            r3 = move-exception
            com.google.android.gms.internal.ads.ja1 r4 = r2.f11206o
            r4.mo8288e0(r3)
        L_0x0094:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.j31.mo11308j(android.app.Activity, com.google.android.gms.internal.ads.vt, boolean):void");
    }

    /* renamed from: k */
    public final void mo11309k(long j, int i) {
        this.f11203l.mo13658a(j, i);
    }
}
