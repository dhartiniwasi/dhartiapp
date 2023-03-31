package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class nt0 implements e60 {

    /* renamed from: a */
    final /* synthetic */ pt0 f14187a;

    nt0(pt0 pt0) {
        this.f14187a = pt0;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo8220a(Object obj, Map map) {
        vs0 vs0 = (vs0) obj;
        if (map != null) {
            String str = (String) map.get("height");
            if (!TextUtils.isEmpty(str)) {
                try {
                    int parseInt = Integer.parseInt(str);
                    synchronized (this.f14187a) {
                        pt0 pt0 = this.f14187a;
                        if (pt0.f16000N != parseInt) {
                            pt0.f16000N = parseInt;
                            this.f14187a.requestLayout();
                        }
                    }
                } catch (Exception e) {
                    pm0.m18668h("Exception occurred while getting webview content height", e);
                }
            }
        }
    }
}
