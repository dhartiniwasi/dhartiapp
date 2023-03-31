package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class tf2 implements sj2 {

    /* renamed from: a */
    public final double f17984a;

    /* renamed from: b */
    public final boolean f17985b;

    public tf2(double d, boolean z) {
        this.f17984a = d;
        this.f17985b = z;
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo8321e(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle a = pt2.m18893a(bundle, "device");
        bundle.putBundle("device", a);
        Bundle a2 = pt2.m18893a(a, "battery");
        a.putBundle("battery", a2);
        a2.putBoolean("is_charging", this.f17985b);
        a2.putDouble("battery_level", this.f17984a);
    }
}
