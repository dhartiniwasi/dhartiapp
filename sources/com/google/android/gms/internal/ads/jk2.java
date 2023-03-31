package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;
import p032d4.C4076a;
import p073j4.C4794n1;
import p073j4.C4820w0;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class jk2 implements sj2 {

    /* renamed from: a */
    private final C4076a.C4077a f11678a;

    /* renamed from: b */
    private final String f11679b;

    public jk2(C4076a.C4077a aVar, String str) {
        this.f11678a = aVar;
        this.f11679b = str;
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo8321e(Object obj) {
        try {
            JSONObject f = C4820w0.m30816f((JSONObject) obj, "pii");
            C4076a.C4077a aVar = this.f11678a;
            if (aVar == null || TextUtils.isEmpty(aVar.mo17308a())) {
                f.put("pdid", this.f11679b);
                f.put("pdidtype", "ssaid");
                return;
            }
            f.put("rdid", this.f11678a.mo17308a());
            f.put("is_lat", this.f11678a.mo17309b());
            f.put("idtype", "adid");
        } catch (JSONException e) {
            C4794n1.m30694l("Failed putting Ad ID.", e);
        }
    }
}
