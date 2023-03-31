package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;
import p053g4.C4409t;
import p060h4.C4596v;
import p067i5.C4695i;
import p073j4.C4751b2;

/* renamed from: com.google.android.gms.internal.ads.qz */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2791qz {

    /* renamed from: a */
    private final String f16746a = ((String) y00.f20407b.mo13438e());

    /* renamed from: b */
    private final Map f16747b;

    /* renamed from: c */
    private final Context f16748c;

    /* renamed from: d */
    private final String f16749d;

    public C2791qz(Context context, String str) {
        String str2;
        this.f16748c = context;
        this.f16749d = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f16747b = linkedHashMap;
        linkedHashMap.put("s", "gmob_sdk");
        linkedHashMap.put("v", "3");
        linkedHashMap.put("os", Build.VERSION.RELEASE);
        linkedHashMap.put("api_v", Build.VERSION.SDK);
        C4409t.m29326r();
        linkedHashMap.put("device", C4751b2.m30596N());
        if (context.getApplicationContext() != null) {
            str2 = context.getApplicationContext().getPackageName();
        } else {
            str2 = context.getPackageName();
        }
        linkedHashMap.put("app", str2);
        C4409t.m29326r();
        String str3 = "0";
        linkedHashMap.put("is_lite_sdk", true != C4751b2.m30606a(context) ? str3 : "1");
        Future b = C4409t.m29323o().mo10514b(context);
        try {
            linkedHashMap.put("network_coarse", Integer.toString(((dh0) b.get()).f8266k));
            linkedHashMap.put("network_fine", Integer.toString(((dh0) b.get()).f8267l));
        } catch (Exception e) {
            C4409t.m29325q().mo15126t(e, "CsiConfiguration.CsiConfiguration");
        }
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14411Q8)).booleanValue()) {
            this.f16747b.put("is_bstar", true == C4695i.m30393b(context) ? "1" : str3);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Context mo13627a() {
        return this.f16748c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final String mo13628b() {
        return this.f16749d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final String mo13629c() {
        return this.f16746a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final Map mo13630d() {
        return this.f16747b;
    }
}
