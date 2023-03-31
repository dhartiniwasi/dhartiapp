package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class tg2 implements sj2 {

    /* renamed from: a */
    public final String f17989a;

    /* renamed from: b */
    public final boolean f17990b;

    public tg2(String str, boolean z) {
        this.f17989a = str;
        this.f17990b = z;
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo8321e(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("gct", this.f17989a);
        if (this.f17990b) {
            bundle.putString("de", "1");
        }
    }
}
