package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import p060h4.C4596v;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class q01 implements h01 {

    /* renamed from: a */
    private final ey1 f16109a;

    q01(ey1 ey1) {
        this.f16109a = ey1;
    }

    /* renamed from: a */
    public final void mo8169a(Map map) {
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14450U7)).booleanValue()) {
            String str = (String) map.get("policy_violations");
            if (!TextUtils.isEmpty(str)) {
                this.f16109a.mo10041l(str);
            }
        }
    }
}
