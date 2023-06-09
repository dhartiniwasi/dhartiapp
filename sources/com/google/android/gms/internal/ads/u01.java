package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class u01 implements h01 {

    /* renamed from: a */
    private final hs2 f18323a;

    public u01(hs2 hs2) {
        this.f18323a = hs2;
    }

    /* renamed from: a */
    public final void mo8169a(Map map) {
        String str = (String) map.get("render_in_browser");
        if (!TextUtils.isEmpty(str)) {
            try {
                this.f18323a.mo10942b(Boolean.parseBoolean(str));
            } catch (Exception unused) {
                throw new IllegalStateException("Invalid render_in_browser state");
            }
        }
    }
}
