package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import p060h4.C4596v;
import p088l5.C4956b;
import p393x5.C12974a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final /* synthetic */ class ib0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ jb0 f10718a;

    /* renamed from: b */
    public final /* synthetic */ Context f10719b;

    /* renamed from: c */
    public final /* synthetic */ String f10720c;

    public /* synthetic */ ib0(jb0 jb0, Context context, String str) {
        this.f10718a = jb0;
        this.f10719b = context;
        this.f10720c = str;
    }

    public final void run() {
        Context context = this.f10719b;
        String str = this.f10720c;
        C2679nz.m17343c(context);
        Bundle bundle = new Bundle();
        bundle.putBoolean("measurementEnabled", ((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14548f0)).booleanValue());
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14618m0)).booleanValue()) {
            bundle.putString("ad_storage", "denied");
            bundle.putString("analytics_storage", "denied");
        }
        try {
            ((ru0) tm0.m21079b(context, "com.google.android.gms.ads.measurement.DynamiteMeasurementManager", hb0.f10267a)).mo13380V4(C4956b.m31385o3(context), new gb0(C12974a.m61151k(context, "FA-Ads", "am", str, bundle)));
        } catch (RemoteException | sm0 | NullPointerException e) {
            pm0.m18669i("#007 Could not call remote method.", e);
        }
    }
}
