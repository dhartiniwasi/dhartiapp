package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class jq1 implements e60 {

    /* renamed from: a */
    private final u30 f11740a;

    /* renamed from: b */
    private final zq1 f11741b;

    /* renamed from: c */
    private final v34 f11742c;

    public jq1(jm1 jm1, xl1 xl1, zq1 zq1, v34 v34) {
        this.f11740a = jm1.mo11441c(xl1.mo15160g0());
        this.f11741b = zq1;
        this.f11742c = v34;
    }

    /* renamed from: a */
    public final void mo8220a(Object obj, Map map) {
        String str = (String) map.get("asset");
        try {
            this.f11740a.mo13938x6((j30) this.f11742c.mo8155d(), str);
        } catch (RemoteException e) {
            pm0.m18668h("Failed to call onCustomClick for asset " + str + ".", e);
        }
    }

    /* renamed from: b */
    public final void mo11478b() {
        if (this.f11740a != null) {
            this.f11741b.mo15647i("/nativeAdCustomClick", this);
        }
    }
}
