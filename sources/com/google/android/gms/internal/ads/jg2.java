package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class jg2 implements sj2 {

    /* renamed from: a */
    private final String f11595a;

    /* renamed from: b */
    private final String f11596b;

    /* renamed from: c */
    private final Bundle f11597c;

    /* synthetic */ jg2(String str, String str2, Bundle bundle, ig2 ig2) {
        this.f11595a = str;
        this.f11596b = str2;
        this.f11597c = bundle;
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo8321e(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("consent_string", this.f11595a);
        bundle.putString("fc_consent", this.f11596b);
        bundle.putBundle("iab_consent_info", this.f11597c);
    }
}
