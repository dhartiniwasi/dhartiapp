package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import p053g4.C4409t;
import p073j4.C4751b2;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class ek2 implements tj2 {

    /* renamed from: a */
    private final mf3 f8831a;

    /* renamed from: b */
    private final Context f8832b;

    public ek2(mf3 mf3, Context context) {
        this.f8831a = mf3;
        this.f8832b = context;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ ck2 mo9933a() throws Exception {
        int i;
        boolean z;
        int i2;
        TelephonyManager telephonyManager = (TelephonyManager) this.f8832b.getSystemService("phone");
        String networkOperator = telephonyManager.getNetworkOperator();
        int phoneType = telephonyManager.getPhoneType();
        C4409t.m29326r();
        int i3 = -1;
        if (C4751b2.m30603U(this.f8832b, "android.permission.ACCESS_NETWORK_STATE")) {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f8832b.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                int type = activeNetworkInfo.getType();
                int ordinal = activeNetworkInfo.getDetailedState().ordinal();
                i2 = type;
                i3 = ordinal;
            } else {
                i2 = -1;
            }
            z = connectivityManager.isActiveNetworkMetered();
            i = i3;
        } else {
            i2 = -2;
            z = false;
            i = -1;
        }
        return new ck2(networkOperator, i2, C4409t.m29327s().mo18428j(this.f8832b), phoneType, z, i);
    }

    /* renamed from: d */
    public final lf3 mo8340d() {
        return this.f8831a.mo12324a(new dk2(this));
    }

    public final int zza() {
        return 39;
    }
}
