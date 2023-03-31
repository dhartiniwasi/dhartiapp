package com.startapp;

import com.startapp.sdk.adsbase.remoteconfig.AdCallbacksConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;

/* renamed from: com.startapp.w2 */
/* compiled from: Sta */
public class C9615w2 {
    /* renamed from: a */
    public static void m50488a(String str, boolean z, String str2, String str3) {
        try {
            AdCallbacksConfig a = MetaData.f38952k.analytics.mo30939a();
            if (a != null) {
                if ((a.mo30908a() || z) && a.mo30909a(str)) {
                    C9023i4 i4Var = new C9023i4(C9043j4.f36993d);
                    i4Var.f36952d = "adCallback";
                    i4Var.f36957i = str;
                    i4Var.f36955g = str2;
                    i4Var.f36953e = str3;
                    i4Var.mo29471a();
                }
            }
        } catch (Throwable unused) {
        }
    }
}
