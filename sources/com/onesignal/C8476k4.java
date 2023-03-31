package com.onesignal;

import com.onesignal.C8338d3;
import com.onesignal.C8524o3;
import com.onesignal.C8532o4;
import com.onesignal.C8592r3;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onesignal.k4 */
/* compiled from: UserStatePushSynchronizer */
class C8476k4 extends C8532o4 {
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static boolean f35676m;

    /* renamed from: com.onesignal.k4$a */
    /* compiled from: UserStatePushSynchronizer */
    class C8477a extends C8524o3.C8531g {
        C8477a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo27539b(String str) {
            boolean unused = C8476k4.f35676m = true;
            if (str == null || str.isEmpty()) {
                str = "{}";
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("tags")) {
                    synchronized (C8476k4.this.f35819a) {
                        C8476k4 k4Var = C8476k4.this;
                        JSONObject y = k4Var.mo28044y(k4Var.mo28025A().mo27822l().mo28287e("tags"), C8476k4.this.mo28029G().mo27822l().mo28287e("tags"), (JSONObject) null, (Set<String>) null);
                        C8476k4.this.mo28025A().mo27829t("tags", jSONObject.optJSONObject("tags"));
                        C8476k4.this.mo28025A().mo27826q();
                        C8476k4.this.mo28029G().mo27824o(jSONObject, y);
                        C8476k4.this.mo28029G().mo27826q();
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    C8476k4() {
        super(C8592r3.C8597d.PUSH);
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public String mo27863B() {
        return C8338d3.m46463Q0();
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public C8338d3.C8384r0 mo27905C() {
        return C8338d3.C8384r0.ERROR;
    }

    /* access modifiers changed from: protected */
    /* renamed from: P */
    public C8451g4 mo27864P(String str, boolean z) {
        return new C8470j4(str, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q */
    public void mo27906Q(JSONObject jSONObject) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public void mo27865V(String str) {
        C8338d3.m46503c2(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: W */
    public void mo27907W() {
        mo28026D(0).mo28047c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g0 */
    public void mo27866g0(String str) {
        C8338d3.m46454N2(str);
    }

    /* renamed from: j0 */
    public String mo27908j0() {
        return mo28029G().mo27820i().mo28289g("language", (String) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k0 */
    public C8532o4.C8537e mo27909k0(boolean z) {
        C8532o4.C8537e eVar;
        if (z) {
            String Q0 = C8338d3.m46463Q0();
            String E0 = C8338d3.m46416E0();
            C8524o3.m47234f("players/" + Q0 + "?app_id=" + E0, new C8477a(), "CACHE_KEY_GET_TAGS");
        }
        synchronized (this.f35819a) {
            eVar = new C8532o4.C8537e(f35676m, C8293a0.m46257c(mo28029G().mo27822l(), "tags"));
        }
        return eVar;
    }

    /* renamed from: l0 */
    public boolean mo27910l0() {
        return mo28029G().mo27820i().mo28285c("userSubscribePref", true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m0 */
    public void mo27911m0() {
        try {
            mo28030H().mo27828s("logoutEmail", Boolean.TRUE);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo27912n(JSONObject jSONObject) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n0 */
    public void mo27913n0() {
        C8451g4 G = mo28029G();
        G.mo27831v("sms_auth_hash");
        G.mo27832w("sms_number");
        G.mo27826q();
        C8451g4 A = mo28025A();
        A.mo27831v("sms_auth_hash");
        String f = A.mo27822l().mo28288f("sms_number");
        A.mo27832w("sms_number");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sms_number", f);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C8338d3.C8384r0 r0Var = C8338d3.C8384r0.INFO;
        C8338d3.m46492a(r0Var, "Device successfully logged out of SMS number: " + jSONObject);
        C8338d3.m46487Y0(jSONObject);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o0 */
    public void mo27914o0(String str, String str2) {
        try {
            C8451g4 H = mo28030H();
            H.mo27828s("email_auth_hash", str2);
            H.mo27819h(new JSONObject().put("email", str), (Set<String>) null);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: p0 */
    public void mo27915p0(boolean z) {
        try {
            mo28030H().mo27828s("androidPermission", Boolean.valueOf(z));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q0 */
    public void mo27916q0(String str, String str2) {
        try {
            C8451g4 H = mo28030H();
            H.mo27828s("sms_auth_hash", str2);
            H.mo27819h(new JSONObject().put("sms_number", str), (Set<String>) null);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r0 */
    public void mo27917r0(boolean z) {
        try {
            mo28030H().mo27828s("userSubscribePref", Boolean.valueOf(z));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s0 */
    public void mo27918s0(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt("identifier", jSONObject.optString("identifier", (String) null));
            if (jSONObject.has("device_type")) {
                jSONObject2.put("device_type", jSONObject.optInt("device_type"));
            }
            jSONObject2.putOpt("parent_player_id", jSONObject.optString("parent_player_id", (String) null));
            mo28030H().mo27819h(jSONObject2, (Set<String>) null);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        try {
            JSONObject jSONObject3 = new JSONObject();
            if (jSONObject.has("subscribableStatus")) {
                jSONObject3.put("subscribableStatus", jSONObject.optInt("subscribableStatus"));
            }
            if (jSONObject.has("androidPermission")) {
                jSONObject3.put("androidPermission", jSONObject.optBoolean("androidPermission"));
            }
            mo28030H().mo27818g(jSONObject3, (Set<String>) null);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public void mo27919w(JSONObject jSONObject) {
        if (jSONObject.has("email")) {
            C8338d3.m46459P();
        }
        if (jSONObject.has("sms_number")) {
            C8338d3.m46471T();
        }
    }
}
