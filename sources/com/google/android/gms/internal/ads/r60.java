package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import p060h4.C4596v;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class r60 implements e60 {

    /* renamed from: a */
    private final zy1 f16846a;

    public r60(zy1 zy1) {
        this.f16846a = zy1;
    }

    /* renamed from: a */
    public final void mo8220a(Object obj, Map map) {
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14506a8)).booleanValue()) {
            String str = (String) map.get("action");
            String str2 = (String) map.get("adUnitId");
            String str3 = (String) map.get("redirectUrl");
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                String str4 = (String) map.get("format");
                if (str.equals("load") && !TextUtils.isEmpty(str4)) {
                    this.f16846a.mo15681f(str2, str4, str3);
                } else if (str.equals("show")) {
                    this.f16846a.mo15682g(str2, str3);
                }
            }
        }
    }
}
