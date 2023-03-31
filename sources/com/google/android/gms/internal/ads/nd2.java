package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class nd2 implements sj2 {

    /* renamed from: a */
    private final boolean f13964a;

    public nd2(boolean z) {
        this.f13964a = z;
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo8321e(Object obj) {
        ((Bundle) obj).putString("adid_p", true != this.f13964a ? "0" : "1");
    }
}
