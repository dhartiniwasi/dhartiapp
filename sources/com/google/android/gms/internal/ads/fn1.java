package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class fn1 implements e60 {

    /* renamed from: a */
    public final /* synthetic */ kn1 f9346a;

    public /* synthetic */ fn1(kn1 kn1) {
        this.f9346a = kn1;
    }

    /* renamed from: a */
    public final void mo8220a(Object obj, Map map) {
        vs0 vs0 = (vs0) obj;
        vs0.mo12108f0().mo9283G(new jn1(this.f9346a, map));
        String str = (String) map.get("overlayHtml");
        String str2 = (String) map.get("baseUrl");
        if (TextUtils.isEmpty(str2)) {
            vs0.loadData(str, "text/html", "UTF-8");
        } else {
            vs0.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", (String) null);
        }
    }
}
