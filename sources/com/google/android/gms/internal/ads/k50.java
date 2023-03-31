package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import p073j4.C4794n1;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class k50 implements e60 {

    /* renamed from: a */
    public static final /* synthetic */ k50 f11908a = new k50();

    private /* synthetic */ k50() {
    }

    /* renamed from: a */
    public final void mo8220a(Object obj, Map map) {
        xt0 xt0 = (xt0) obj;
        e60 e60 = d60.f8078a;
        String str = (String) map.get("urls");
        if (TextUtils.isEmpty(str)) {
            pm0.m18667g("URLs missing in canOpenURLs GMSG.");
            return;
        }
        String[] split = str.split(",");
        HashMap hashMap = new HashMap();
        PackageManager packageManager = xt0.getContext().getPackageManager();
        for (String str2 : split) {
            String[] split2 = str2.split(";", 2);
            boolean z = true;
            if (packageManager.resolveActivity(new Intent(split2.length > 1 ? split2[1].trim() : "android.intent.action.VIEW", Uri.parse(split2[0].trim())), 65536) == null) {
                z = false;
            }
            Boolean valueOf = Boolean.valueOf(z);
            hashMap.put(str2, valueOf);
            C4794n1.m30693k("/canOpenURLs;" + str2 + ";" + valueOf);
        }
        ((q80) xt0).mo9081R("openableURLs", hashMap);
    }
}
