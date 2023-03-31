package com.google.android.gms.measurement.internal;

import com.unity3d.services.core.request.metrics.MetricCommonTags;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.x3 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final /* synthetic */ class C7548x3 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C7331d4 f33175a;

    /* renamed from: b */
    public final /* synthetic */ String f33176b;

    public /* synthetic */ C7548x3(C7331d4 d4Var, String str) {
        this.f33175a = d4Var;
        this.f33176b = str;
    }

    public final Object call() {
        C7331d4 d4Var = this.f33175a;
        String str = this.f33176b;
        C7431m5 R = d4Var.f32873b.mo24112W().mo24474R(str);
        HashMap hashMap = new HashMap();
        hashMap.put("platform", MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID);
        hashMap.put("package_name", str);
        d4Var.f32389a.mo24443z().mo24292p();
        hashMap.put("gmp_version", 74029L);
        if (R != null) {
            String g0 = R.mo24552g0();
            if (g0 != null) {
                hashMap.put("app_version", g0);
            }
            hashMap.put("app_version_int", Long.valueOf(R.mo24524L()));
            hashMap.put("dynamite_version", Long.valueOf(R.mo24533U()));
        }
        return hashMap;
    }
}
