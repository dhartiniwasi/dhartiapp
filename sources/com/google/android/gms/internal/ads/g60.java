package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class g60 implements e60 {

    /* renamed from: a */
    private final h60 f9733a;

    public g60(h60 h60, byte[] bArr) {
        this.f9733a = h60;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo8220a(Object obj, Map map) {
        vs0 vs0 = (vs0) obj;
        boolean equals = "1".equals(map.get("transparentBackground"));
        boolean equals2 = "1".equals(map.get("blur"));
        float f = 0.0f;
        try {
            if (map.get("blurRadius") != null) {
                f = Float.parseFloat((String) map.get("blurRadius"));
            }
        } catch (NumberFormatException e) {
            pm0.m18665e("Fail to parse float", e);
        }
        this.f9733a.mo10743c(equals);
        this.f9733a.mo10742b(equals2, f);
        vs0.mo12094T0(equals);
    }
}
