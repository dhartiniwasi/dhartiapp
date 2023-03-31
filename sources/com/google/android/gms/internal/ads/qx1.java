package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.text.TextUtils;
import com.unity3d.services.core.request.metrics.AdOperationMetric;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p060h4.C4584t;
import p060h4.C4595u4;
import p060h4.C4596v;
import p060h4.C4623z2;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class qx1 implements z91, tc1, pb1 {

    /* renamed from: a */
    private final ey1 f16725a;

    /* renamed from: b */
    private final String f16726b;

    /* renamed from: c */
    private final String f16727c;

    /* renamed from: d */
    private int f16728d = 0;

    /* renamed from: e */
    private px1 f16729e = px1.AD_REQUESTED;

    /* renamed from: f */
    private o91 f16730f;

    /* renamed from: g */
    private C4623z2 f16731g;

    /* renamed from: h */
    private String f16732h;

    /* renamed from: i */
    private String f16733i;

    /* renamed from: r */
    private boolean f16734r;

    /* renamed from: s */
    private boolean f16735s;

    qx1(ey1 ey1, et2 et2, String str) {
        this.f16725a = ey1;
        this.f16727c = str;
        this.f16726b = et2.f8935f;
    }

    /* renamed from: h */
    private static JSONObject m19468h(C4623z2 z2Var) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorDomain", z2Var.f25064c);
        jSONObject.put("errorCode", z2Var.f25062a);
        jSONObject.put("errorDescription", z2Var.f25063b);
        C4623z2 z2Var2 = z2Var.f25065d;
        jSONObject.put("underlyingError", z2Var2 == null ? null : m19468h(z2Var2));
        return jSONObject;
    }

    /* renamed from: i */
    private final JSONObject m19469i(o91 o91) throws JSONException {
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("winningAdapterClassName", o91.mo12867c());
        jSONObject2.put("responseSecsSinceEpoch", o91.mo12868e());
        jSONObject2.put("responseId", o91.mo12862V());
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14460V7)).booleanValue()) {
            String b = o91.mo12866b();
            if (!TextUtils.isEmpty(b)) {
                pm0.m18662b("Bidding data: ".concat(String.valueOf(b)));
                jSONObject2.put("biddingData", new JSONObject(b));
            }
        }
        if (!TextUtils.isEmpty(this.f16732h)) {
            jSONObject2.put("adRequestUrl", this.f16732h);
        }
        if (!TextUtils.isEmpty(this.f16733i)) {
            jSONObject2.put("postBody", this.f16733i);
        }
        JSONArray jSONArray = new JSONArray();
        for (C4595u4 u4Var : o91.mo12863W()) {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("adapterClassName", u4Var.f25033a);
            jSONObject3.put("latencyMillis", u4Var.f25034b);
            if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14469W7)).booleanValue()) {
                jSONObject3.put("credentials", C4584t.m30036b().mo11159j(u4Var.f25036d));
            }
            C4623z2 z2Var = u4Var.f25035c;
            if (z2Var == null) {
                jSONObject = null;
            } else {
                jSONObject = m19468h(z2Var);
            }
            jSONObject3.put("error", jSONObject);
            jSONArray.put(jSONObject3);
        }
        jSONObject2.put("adNetworks", jSONArray);
        return jSONObject2;
    }

    /* renamed from: a */
    public final String mo13618a() {
        return this.f16727c;
    }

    /* renamed from: b */
    public final JSONObject mo13619b() throws JSONException {
        IBinder iBinder;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(AdOperationMetric.INIT_STATE, this.f16729e);
        jSONObject.put("format", is2.m14541a(this.f16728d));
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14506a8)).booleanValue()) {
            jSONObject.put("isOutOfContext", this.f16734r);
            if (this.f16734r) {
                jSONObject.put("shown", this.f16735s);
            }
        }
        o91 o91 = this.f16730f;
        JSONObject jSONObject2 = null;
        if (o91 != null) {
            jSONObject2 = m19469i(o91);
        } else {
            C4623z2 z2Var = this.f16731g;
            if (!(z2Var == null || (iBinder = z2Var.f25066e) == null)) {
                o91 o912 = (o91) iBinder;
                jSONObject2 = m19469i(o912);
                if (o912.mo12863W().isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(m19468h(this.f16731g));
                    jSONObject2.put("errors", jSONArray);
                }
            }
        }
        jSONObject.put("responseInfo", jSONObject2);
        return jSONObject;
    }

    /* renamed from: c */
    public final void mo12566c(v51 v51) {
        this.f16730f = v51.mo14679c();
        this.f16729e = px1.AD_LOADED;
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14506a8)).booleanValue()) {
            this.f16725a.mo10035f(this.f16726b, this);
        }
    }

    /* renamed from: d */
    public final void mo13620d() {
        this.f16734r = true;
    }

    /* renamed from: e */
    public final void mo13621e() {
        this.f16735s = true;
    }

    /* renamed from: f */
    public final boolean mo13622f() {
        return this.f16729e != px1.AD_REQUESTED;
    }

    /* renamed from: g */
    public final void mo9420g(C4623z2 z2Var) {
        this.f16729e = px1.AD_LOAD_FAILED;
        this.f16731g = z2Var;
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14506a8)).booleanValue()) {
            this.f16725a.mo10035f(this.f16726b, this);
        }
    }

    /* renamed from: t */
    public final void mo10020t(us2 us2) {
        if (!us2.f18723b.f18243a.isEmpty()) {
            this.f16728d = ((is2) us2.f18723b.f18243a.get(0)).f10970b;
        }
        if (!TextUtils.isEmpty(us2.f18723b.f18244b.f12939k)) {
            this.f16732h = us2.f18723b.f18244b.f12939k;
        }
        if (!TextUtils.isEmpty(us2.f18723b.f18244b.f12940l)) {
            this.f16733i = us2.f18723b.f18244b.f12940l;
        }
    }

    /* renamed from: v */
    public final void mo10021v(yg0 yg0) {
        if (!((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14506a8)).booleanValue()) {
            this.f16725a.mo10035f(this.f16726b, this);
        }
    }
}
