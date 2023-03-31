package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.util.List;
import java.util.Map;
import p053g4.C4409t;
import p060h4.C4596v;
import p067i5.C4695i;
import p073j4.C4751b2;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class cy2 {

    /* renamed from: a */
    private final Context f7978a;

    /* renamed from: b */
    private final String f7979b;

    /* renamed from: c */
    private final String f7980c;

    public cy2(Context context, vm0 vm0) {
        this.f7978a = context;
        this.f7979b = context.getPackageName();
        this.f7980c = vm0.f19150a;
    }

    /* renamed from: a */
    public final void mo9379a(Map map) {
        map.put("s", "gmob_sdk");
        map.put("v", "3");
        map.put("os", Build.VERSION.RELEASE);
        map.put("api_v", Build.VERSION.SDK);
        C4409t.m29326r();
        map.put("device", C4751b2.m30596N());
        map.put("app", this.f7979b);
        C4409t.m29326r();
        String str = "0";
        map.put("is_lite_sdk", true != C4751b2.m30606a(this.f7978a) ? str : "1");
        List b = C2679nz.m17342b();
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14476X5)).booleanValue()) {
            b.addAll(C4409t.m29325q().mo15117h().mo18486U().mo13844d());
        }
        map.put("e", TextUtils.join(",", b));
        map.put("sdkVersion", this.f7980c);
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14411Q8)).booleanValue()) {
            if (true == C4695i.m30393b(this.f7978a)) {
                str = "1";
            }
            map.put("is_bstar", str);
        }
    }
}
