package com.google.android.gms.internal.ads;

import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class fp1 {

    /* renamed from: a */
    private final Executor f9387a;

    /* renamed from: b */
    private final ap1 f9388b;

    public fp1(Executor executor, ap1 ap1) {
        this.f9387a = executor;
        this.f9388b = ap1;
    }

    /* renamed from: a */
    public final lf3 mo10245a(JSONObject jSONObject, String str) {
        lf3 lf3;
        JSONArray optJSONArray = jSONObject.optJSONArray("custom_assets");
        if (optJSONArray == null) {
            return cf3.m10911i(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject == null) {
                lf3 = cf3.m10911i((Object) null);
            } else {
                String optString = optJSONObject.optString(MediationMetaData.KEY_NAME);
                if (optString == null) {
                    lf3 = cf3.m10911i((Object) null);
                } else {
                    String optString2 = optJSONObject.optString("type");
                    if ("string".equals(optString2)) {
                        lf3 = cf3.m10911i(new ep1(optString, optJSONObject.optString("string_value")));
                    } else if ("image".equals(optString2)) {
                        lf3 = cf3.m10915m(this.f9388b.mo8482e(optJSONObject, "image_value"), new cp1(optString), this.f9387a);
                    } else {
                        lf3 = cf3.m10911i((Object) null);
                    }
                }
            }
            arrayList.add(lf3);
        }
        return cf3.m10915m(cf3.m10907e(arrayList), dp1.f8357a, this.f9387a);
    }
}
