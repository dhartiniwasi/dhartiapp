package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class fh2 implements sj2 {

    /* renamed from: a */
    private final String f9281a;

    /* renamed from: b */
    private final boolean f9282b;

    /* renamed from: c */
    private final boolean f9283c;

    public fh2(String str, boolean z, boolean z2) {
        this.f9281a = str;
        this.f9282b = z;
        this.f9283c = z2;
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo8321e(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (!this.f9281a.isEmpty()) {
            bundle.putString("inspector_extras", this.f9281a);
        }
        bundle.putInt("test_mode", this.f9282b ? 1 : 0);
        bundle.putInt("linked_device", this.f9283c ? 1 : 0);
    }
}
