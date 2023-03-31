package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class jh2 implements sj2 {

    /* renamed from: a */
    public final Bundle f11609a;

    public jh2(Bundle bundle) {
        this.f11609a = bundle;
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo8321e(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle a = pt2.m18893a(bundle, "device");
        a.putBundle("android_mem_info", this.f11609a);
        bundle.putBundle("device", a);
    }
}
