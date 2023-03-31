package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class aj2 implements sj2 {

    /* renamed from: a */
    private final String f6598a;

    public aj2(String str) {
        this.f6598a = str;
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo8321e(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (!TextUtils.isEmpty(this.f6598a)) {
            bundle.putString("query_info", this.f6598a);
        }
    }
}
