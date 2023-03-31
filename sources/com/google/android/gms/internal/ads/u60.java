package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
import p053g4.C4409t;
import p073j4.C4794n1;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class u60 implements e60 {

    /* renamed from: a */
    private final Object f18408a = new Object();

    /* renamed from: b */
    private final Map f18409b = new HashMap();

    /* renamed from: a */
    public final void mo8220a(Object obj, Map map) {
        String str;
        String str2 = (String) map.get("id");
        String str3 = (String) map.get("fail");
        String str4 = (String) map.get("fail_reason");
        String str5 = (String) map.get("fail_stack");
        String str6 = (String) map.get("result");
        if (true == TextUtils.isEmpty(str5)) {
            str4 = "Unknown Fail Reason.";
        }
        if (TextUtils.isEmpty(str5)) {
            str = "";
        } else {
            str = "\n".concat(String.valueOf(str5));
        }
        synchronized (this.f18408a) {
            t60 t60 = (t60) this.f18409b.remove(str2);
            if (t60 == null) {
                pm0.m18667g("Received result for unexpected method invocation: " + str2);
            } else if (!TextUtils.isEmpty(str3)) {
                t60.mo8298f(str4 + str);
            } else if (str6 == null) {
                t60.mo8297a((JSONObject) null);
            } else {
                try {
                    JSONObject jSONObject = new JSONObject(str6);
                    if (C4794n1.m30695m()) {
                        String jSONObject2 = jSONObject.toString(2);
                        C4794n1.m30693k("Result GMSG: " + jSONObject2);
                    }
                    t60.mo8297a(jSONObject);
                } catch (JSONException e) {
                    t60.mo8298f(e.getMessage());
                }
            }
        }
    }

    /* renamed from: b */
    public final lf3 mo14452b(e90 e90, String str, JSONObject jSONObject) {
        in0 in0 = new in0();
        C4409t.m29326r();
        String uuid = UUID.randomUUID().toString();
        mo14453c(uuid, new s60(this, in0));
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", uuid);
            jSONObject2.put("args", jSONObject);
            e90.mo9090t0(str, jSONObject2);
        } catch (Exception e) {
            in0.mo11173e(e);
        }
        return in0;
    }

    /* renamed from: c */
    public final void mo14453c(String str, t60 t60) {
        synchronized (this.f18408a) {
            this.f18409b.put(str, t60);
        }
    }
}
