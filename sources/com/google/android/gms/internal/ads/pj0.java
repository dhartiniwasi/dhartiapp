package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import p060h4.C4596v;
import p073j4.C4800p1;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class pj0 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a */
    private final Context f15870a;

    /* renamed from: b */
    private final SharedPreferences f15871b;

    /* renamed from: c */
    private final C4800p1 f15872c;

    /* renamed from: d */
    private final sk0 f15873d;

    /* renamed from: e */
    private String f15874e = "-1";

    /* renamed from: f */
    private int f15875f = -1;

    pj0(Context context, C4800p1 p1Var, sk0 sk0) {
        this.f15871b = PreferenceManager.getDefaultSharedPreferences(context);
        this.f15872c = p1Var;
        this.f15870a = context;
        this.f15873d = sk0;
    }

    /* renamed from: b */
    private final void m18638b(String str, int i) {
        Context context;
        boolean z = false;
        if (!((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14688t0)).booleanValue() ? str.isEmpty() || str.charAt(0) != '1' : i == 0 || str.isEmpty() || (str.charAt(0) != '1' && !str.equals("-1"))) {
            z = true;
        }
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14668r0)).booleanValue()) {
            this.f15872c.mo18509n(z);
            if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14623m5)).booleanValue() && z && (context = this.f15870a) != null) {
                context.deleteDatabase("OfflineUpload.db");
            }
        }
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14618m0)).booleanValue()) {
            this.f15873d.mo14042y();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo13285a() {
        this.f15871b.registerOnSharedPreferenceChangeListener(this);
        onSharedPreferenceChanged(this.f15871b, "gad_has_consent_for_cookies");
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14708v0)).booleanValue()) {
            onSharedPreferenceChanged(this.f15871b, "IABTCF_gdprApplies");
            onSharedPreferenceChanged(this.f15871b, "IABTCF_TCString");
            return;
        }
        onSharedPreferenceChanged(this.f15871b, "IABTCF_PurposeConsents");
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00cc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onSharedPreferenceChanged(android.content.SharedPreferences r9, java.lang.String r10) {
        /*
            r8 = this;
            com.google.android.gms.internal.ads.ez r0 = com.google.android.gms.internal.ads.C2679nz.f14708v0
            com.google.android.gms.internal.ads.lz r1 = p060h4.C4596v.m30088c()
            java.lang.Object r0 = r1.mo12227b(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            java.lang.String r1 = "-1"
            java.lang.String r2 = "IABTCF_PurposeConsents"
            r3 = 1
            r4 = -1
            java.lang.String r5 = "gad_has_consent_for_cookies"
            if (r0 == 0) goto L_0x007d
            boolean r0 = com.google.android.gms.internal.ads.oj0.m17892a(r10, r5)
            if (r0 == 0) goto L_0x004a
            com.google.android.gms.internal.ads.ez r10 = com.google.android.gms.internal.ads.C2679nz.f14688t0
            com.google.android.gms.internal.ads.lz r0 = p060h4.C4596v.m30088c()
            java.lang.Object r10 = r0.mo12227b(r10)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 != 0) goto L_0x0033
            return
        L_0x0033:
            int r9 = r9.getInt(r5, r4)
            j4.p1 r10 = r8.f15872c
            int r10 = r10.mo18497d()
            if (r9 == r10) goto L_0x0044
            j4.p1 r10 = r8.f15872c
            r10.mo18509n(r3)
        L_0x0044:
            j4.p1 r10 = r8.f15872c
            r10.mo18502g(r9)
            return
        L_0x004a:
            java.lang.String r0 = "IABTCF_gdprApplies"
            boolean r0 = com.google.android.gms.internal.ads.oj0.m17892a(r10, r0)
            if (r0 != 0) goto L_0x0060
            java.lang.String r0 = "IABTCF_TCString"
            boolean r0 = com.google.android.gms.internal.ads.oj0.m17892a(r10, r0)
            if (r0 != 0) goto L_0x0060
            boolean r0 = com.google.android.gms.internal.ads.oj0.m17892a(r10, r2)
            if (r0 == 0) goto L_0x00df
        L_0x0060:
            java.lang.String r9 = r9.getString(r10, r1)
            if (r9 == 0) goto L_0x0077
            j4.p1 r0 = r8.f15872c
            java.lang.String r0 = r0.mo18484J(r10)
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x0077
            j4.p1 r0 = r8.f15872c
            r0.mo18509n(r3)
        L_0x0077:
            j4.p1 r0 = r8.f15872c
            r0.mo18519x(r10, r9)
            return
        L_0x007d:
            java.lang.String r0 = r9.getString(r2, r1)
            int r9 = r9.getInt(r5, r4)
            java.lang.String r10 = java.lang.String.valueOf(r10)
            int r6 = r10.hashCode()
            r7 = -2004976699(0xffffffff887e7bc5, float:-7.6580835E-34)
            if (r6 == r7) goto L_0x00a0
            r2 = -527267622(0xffffffffe09288da, float:-8.447143E19)
            if (r6 == r2) goto L_0x0098
            goto L_0x00a8
        L_0x0098:
            boolean r10 = r10.equals(r5)
            if (r10 == 0) goto L_0x00a8
            r10 = 1
            goto L_0x00a9
        L_0x00a0:
            boolean r10 = r10.equals(r2)
            if (r10 == 0) goto L_0x00a8
            r10 = 0
            goto L_0x00a9
        L_0x00a8:
            r10 = -1
        L_0x00a9:
            if (r10 == 0) goto L_0x00cc
            if (r10 == r3) goto L_0x00ae
            return
        L_0x00ae:
            com.google.android.gms.internal.ads.ez r10 = com.google.android.gms.internal.ads.C2679nz.f14688t0
            com.google.android.gms.internal.ads.lz r1 = p060h4.C4596v.m30088c()
            java.lang.Object r10 = r1.mo12227b(r10)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L_0x00df
            if (r9 == r4) goto L_0x00df
            int r10 = r8.f15875f
            if (r10 == r9) goto L_0x00df
            r8.f15875f = r9
            r8.m18638b(r0, r9)
            return
        L_0x00cc:
            boolean r10 = r0.equals(r1)
            if (r10 != 0) goto L_0x00df
            java.lang.String r10 = r8.f15874e
            boolean r10 = r10.equals(r0)
            if (r10 != 0) goto L_0x00df
            r8.f15874e = r0
            r8.m18638b(r0, r9)
        L_0x00df:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.pj0.onSharedPreferenceChanged(android.content.SharedPreferences, java.lang.String):void");
    }
}
