package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class qe2 implements sj2 {

    /* renamed from: a */
    private final Bundle f16354a;

    /* synthetic */ qe2(Bundle bundle, pe2 pe2) {
        this.f16354a = bundle;
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo8321e(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (!this.f16354a.isEmpty()) {
            bundle.putBundle("installed_adapter_data", this.f16354a);
        }
    }
}
