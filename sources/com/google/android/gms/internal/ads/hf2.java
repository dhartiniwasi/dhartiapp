package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class hf2 implements sj2 {

    /* renamed from: a */
    final String f10314a;

    /* renamed from: b */
    final int f10315b;

    public hf2(String str, int i) {
        this.f10314a = str;
        this.f10315b = i;
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo8321e(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (!TextUtils.isEmpty(this.f10314a) && this.f10315b != -1) {
            Bundle a = pt2.m18893a(bundle, "pii");
            bundle.putBundle("pii", a);
            a.putString("pvid", this.f10314a);
            a.putInt("pvid_s", this.f10315b);
        }
    }
}
