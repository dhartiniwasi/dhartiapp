package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class ej2 implements sj2 {

    /* renamed from: a */
    public final String f8814a;

    /* renamed from: b */
    public final String f8815b;

    /* renamed from: c */
    public final String f8816c;

    /* renamed from: d */
    public final String f8817d;

    /* renamed from: e */
    public final Long f8818e;

    public ej2(String str, String str2, String str3, String str4, Long l) {
        this.f8814a = str;
        this.f8815b = str2;
        this.f8816c = str3;
        this.f8817d = str4;
        this.f8818e = l;
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo8321e(Object obj) {
        Bundle bundle = (Bundle) obj;
        pt2.m18895c(bundle, "gmp_app_id", this.f8814a);
        pt2.m18895c(bundle, "fbs_aiid", this.f8815b);
        pt2.m18895c(bundle, "fbs_aeid", this.f8816c);
        pt2.m18895c(bundle, "apm_id_origin", this.f8817d);
        Long l = this.f8818e;
        if (l != null) {
            bundle.putLong("sai_timeout", l.longValue());
        }
    }
}
