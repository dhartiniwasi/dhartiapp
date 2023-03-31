package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class a11 implements h01 {

    /* renamed from: a */
    private final ey1 f6369a;

    a11(ey1 ey1) {
        this.f6369a = ey1;
    }

    /* renamed from: a */
    public final void mo8169a(Map map) {
        String str = (String) map.get("test_mode_enabled");
        if (!TextUtils.isEmpty(str)) {
            this.f6369a.mo10042m(str.equals("true"));
        }
    }
}
