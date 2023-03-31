package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p073j4.C4820w0;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class x40 implements e60 {

    /* renamed from: a */
    private final y40 f19977a;

    public x40(y40 y40) {
        this.f19977a = y40;
    }

    /* renamed from: a */
    public final void mo8220a(Object obj, Map map) {
        if (this.f19977a != null) {
            String str = (String) map.get(MediationMetaData.KEY_NAME);
            if (str == null) {
                pm0.m18666f("Ad metadata with no name parameter.");
                str = "";
            }
            Bundle bundle = null;
            if (map.containsKey("info")) {
                try {
                    bundle = C4820w0.m30811a(new JSONObject((String) map.get("info")));
                } catch (JSONException e) {
                    pm0.m18665e("Failed to convert ad metadata to JSON.", e);
                }
            }
            if (bundle == null) {
                pm0.m18664d("Failed to convert ad metadata to Bundle.");
            } else {
                this.f19977a.mo9273j(str, bundle);
            }
        }
    }
}
