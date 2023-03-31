package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p060h4.C4584t;
import p073j4.C4794n1;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class pm2 implements sj2 {

    /* renamed from: a */
    private final Map f15918a;

    public pm2(Map map) {
        this.f15918a = map;
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo8321e(Object obj) {
        try {
            ((JSONObject) obj).put("video_decoders", C4584t.m30036b().mo11160k(this.f15918a));
        } catch (JSONException e) {
            C4794n1.m30693k("Could not encode video decoder properties: ".concat(String.valueOf(e.getMessage())));
        }
    }
}
