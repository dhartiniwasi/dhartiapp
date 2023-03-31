package com.google.android.gms.internal.ads;

import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import p073j4.C4794n1;
import p073j4.C4820w0;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class tk2 implements sj2 {

    /* renamed from: a */
    private final JSONObject f18029a;

    public tk2(JSONObject jSONObject) {
        this.f18029a = jSONObject;
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo8321e(Object obj) {
        try {
            JSONObject f = C4820w0.m30816f((JSONObject) obj, "content_info");
            JSONObject jSONObject = this.f18029a;
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                f.put(next, jSONObject.get(next));
            }
        } catch (JSONException unused) {
            C4794n1.m30693k("Failed putting app indexing json.");
        }
    }
}
