package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import p060h4.C4596v;
import p073j4.C4794n1;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class l50 implements e60 {

    /* renamed from: a */
    public static final /* synthetic */ l50 f12657a = new l50();

    private /* synthetic */ l50() {
    }

    /* renamed from: a */
    public final void mo8220a(Object obj, Map map) {
        xt0 xt0 = (xt0) obj;
        e60 e60 = d60.f8078a;
        if (!((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14525c7)).booleanValue()) {
            pm0.m18667g("canOpenAppGmsgHandler disabled.");
            return;
        }
        String str = (String) map.get("package_name");
        if (TextUtils.isEmpty(str)) {
            pm0.m18667g("Package name missing in canOpenApp GMSG.");
            return;
        }
        HashMap hashMap = new HashMap();
        Boolean valueOf = Boolean.valueOf(xt0.getContext().getPackageManager().getLaunchIntentForPackage(str) != null);
        hashMap.put(str, valueOf);
        C4794n1.m30693k("/canOpenApp;" + str + ";" + valueOf);
        ((q80) xt0).mo9081R("openableApp", hashMap);
    }
}
