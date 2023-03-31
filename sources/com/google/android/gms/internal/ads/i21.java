package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class i21 implements b44 {

    /* renamed from: a */
    private final o44 f10590a;

    public i21(o44 o44) {
        this.f10590a = o44;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ Object mo8155d() {
        try {
            return new JSONObject(((l61) this.f10590a).mo11902a().f10942A);
        } catch (JSONException unused) {
            return null;
        }
    }
}
