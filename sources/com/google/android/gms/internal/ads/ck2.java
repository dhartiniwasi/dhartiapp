package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class ck2 implements sj2 {

    /* renamed from: a */
    public final String f7802a;

    /* renamed from: b */
    public final int f7803b;

    /* renamed from: c */
    public final int f7804c;

    /* renamed from: d */
    public final int f7805d;

    /* renamed from: e */
    public final boolean f7806e;

    /* renamed from: f */
    public final int f7807f;

    public ck2(String str, int i, int i2, int i3, boolean z, int i4) {
        this.f7802a = str;
        this.f7803b = i;
        this.f7804c = i2;
        this.f7805d = i3;
        this.f7806e = z;
        this.f7807f = i4;
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo8321e(Object obj) {
        Bundle bundle = (Bundle) obj;
        String str = this.f7802a;
        boolean z = true;
        pt2.m18898f(bundle, "carrier", str, !TextUtils.isEmpty(str));
        int i = this.f7803b;
        if (i == -2) {
            z = false;
        }
        pt2.m18897e(bundle, "cnt", i, z);
        bundle.putInt("gnt", this.f7804c);
        bundle.putInt("pt", this.f7805d);
        Bundle a = pt2.m18893a(bundle, "device");
        bundle.putBundle("device", a);
        Bundle a2 = pt2.m18893a(a, "network");
        a.putBundle("network", a2);
        a2.putInt("active_network_state", this.f7807f);
        a2.putBoolean("active_network_metered", this.f7806e);
    }
}
