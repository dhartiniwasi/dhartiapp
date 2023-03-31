package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class h50 implements e60 {

    /* renamed from: a */
    public static final /* synthetic */ h50 f10193a = new h50();

    private /* synthetic */ h50() {
    }

    /* renamed from: a */
    public final void mo8220a(Object obj, Map map) {
        eu0 eu0 = (eu0) obj;
        e60 e60 = d60.f8078a;
        String str = (String) map.get("tx");
        String str2 = (String) map.get("ty");
        String str3 = (String) map.get("td");
        try {
            int parseInt = Integer.parseInt(str);
            int parseInt2 = Integer.parseInt(str2);
            int parseInt3 = Integer.parseInt(str3);
            C2955ve r = eu0.mo10015r();
            if (r != null) {
                r.mo14737c().mo12592c(parseInt, parseInt2, parseInt3);
            }
        } catch (NumberFormatException unused) {
            pm0.m18667g("Could not parse touch parameters from gmsg.");
        }
    }
}
