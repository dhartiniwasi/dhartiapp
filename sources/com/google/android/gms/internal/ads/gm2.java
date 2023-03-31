package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;
import p180z4.C6378j;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class gm2 implements sj2 {

    /* renamed from: a */
    public static final /* synthetic */ gm2 f10002a = new gm2();

    private /* synthetic */ gm2() {
    }

    /* renamed from: e */
    public final void mo8321e(Object obj) {
        try {
            ((JSONObject) obj).getJSONObject("sdk_env").put("container_version", C6378j.f30617a);
        } catch (JSONException unused) {
        }
    }
}
