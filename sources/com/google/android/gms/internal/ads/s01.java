package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.Map;
import p053g4.C4409t;
import p060h4.C4596v;
import p073j4.C4800p1;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class s01 implements h01 {

    /* renamed from: a */
    private final Context f17168a;

    /* renamed from: b */
    private final C4800p1 f17169b = C4409t.m29325q().mo15117h();

    public s01(Context context) {
        this.f17168a = context;
    }

    /* renamed from: a */
    public final void mo8169a(Map map) {
        if (!map.isEmpty()) {
            String str = (String) map.get("gad_idless");
            if (str != null) {
                boolean parseBoolean = Boolean.parseBoolean(str);
                map.remove("gad_idless");
                if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14668r0)).booleanValue()) {
                    this.f17169b.mo18509n(parseBoolean);
                    if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14623m5)).booleanValue() && parseBoolean) {
                        this.f17168a.deleteDatabase("OfflineUpload.db");
                    }
                }
            }
            Bundle bundle = new Bundle();
            for (Map.Entry entry : map.entrySet()) {
                bundle.putString((String) entry.getKey(), (String) entry.getValue());
            }
            if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14618m0)).booleanValue()) {
                C4409t.m29324p().mo14040w(bundle);
            }
        }
    }
}
