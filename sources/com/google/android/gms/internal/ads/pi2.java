package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class pi2 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ List f15866a;

    public /* synthetic */ pi2(List list) {
        this.f15866a = list;
    }

    public final Object call() {
        List<lf3> list = this.f15866a;
        JSONArray jSONArray = new JSONArray();
        for (lf3 lf3 : list) {
            if (((JSONObject) lf3.get()) != null) {
                jSONArray.put(lf3.get());
            }
        }
        if (jSONArray.length() == 0) {
            return null;
        }
        return new ti2(jSONArray.toString());
    }
}
