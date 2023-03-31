package com.google.android.gms.internal.ads;

import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import p053g4.C4409t;
import p073j4.C4751b2;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class lo1 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ no1 f12864a;

    /* renamed from: b */
    public final /* synthetic */ us2 f12865b;

    /* renamed from: c */
    public final /* synthetic */ is2 f12866c;

    /* renamed from: d */
    public final /* synthetic */ JSONObject f12867d;

    public /* synthetic */ lo1(no1 no1, us2 us2, is2 is2, JSONObject jSONObject) {
        this.f12864a = no1;
        this.f12865b = us2;
        this.f12866c = is2;
        this.f12867d = jSONObject;
    }

    public final Object call() {
        us2 us2 = this.f12865b;
        is2 is2 = this.f12866c;
        JSONObject jSONObject = this.f12867d;
        xl1 xl1 = new xl1();
        xl1.mo15176v(jSONObject.optInt("template_id", -1));
        xl1.mo15163i(jSONObject.optString("custom_template_id"));
        JSONObject optJSONObject = jSONObject.optJSONObject("omid_settings");
        xl1.mo15173s(optJSONObject != null ? optJSONObject.optString("omid_partner_name") : null);
        et2 et2 = us2.f18722a.f17091a;
        if (et2.f8936g.contains(Integer.toString(xl1.mo15132K()))) {
            if (xl1.mo15132K() == 3) {
                if (xl1.mo15160g0() == null) {
                    throw new v82(1, "No custom template id for custom template ad response.");
                } else if (!et2.f8937h.contains(xl1.mo15160g0())) {
                    throw new v82(1, "Unexpected custom template id in the response.");
                }
            }
            xl1.mo15174t(jSONObject.optDouble("rating", -1.0d));
            String optString = jSONObject.optString("headline", (String) null);
            if (is2.f10955N) {
                C4409t.m29326r();
                optString = C4751b2.m30601S() + " : " + optString;
            }
            xl1.mo15175u("headline", optString);
            xl1.mo15175u("body", jSONObject.optString("body", (String) null));
            xl1.mo15175u("call_to_action", jSONObject.optString("call_to_action", (String) null));
            xl1.mo15175u("store", jSONObject.optString("store", (String) null));
            xl1.mo15175u(InAppPurchaseMetaData.KEY_PRICE, jSONObject.optString(InAppPurchaseMetaData.KEY_PRICE, (String) null));
            xl1.mo15175u("advertiser", jSONObject.optString("advertiser", (String) null));
            return xl1;
        }
        throw new v82(1, "Invalid template ID: " + xl1.mo15132K());
    }
}
