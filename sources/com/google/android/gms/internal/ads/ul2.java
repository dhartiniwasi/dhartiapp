package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p073j4.C4794n1;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class ul2 implements sj2 {

    /* renamed from: a */
    private final List f18606a;

    public ul2(List list) {
        this.f18606a = list;
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo8321e(Object obj) {
        try {
            ((JSONObject) obj).put("eid", TextUtils.join(",", this.f18606a));
        } catch (JSONException unused) {
            C4794n1.m30693k("Failed putting experiment ids.");
        }
    }
}
