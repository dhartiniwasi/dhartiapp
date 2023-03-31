package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p060h4.C4584t;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class r80 {
    /* renamed from: a */
    public static void m19605a(s80 s80, String str, Map map) {
        try {
            s80.mo9084a(str, C4584t.m30036b().mo11160k(map));
        } catch (JSONException unused) {
            pm0.m18667g("Could not convert parameters to JSON.");
        }
    }

    /* renamed from: b */
    public static void m19606b(s80 s80, String str, JSONObject jSONObject) {
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("',");
        sb.append(jSONObject2);
        sb.append(");");
        pm0.m18662b("Dispatching AFMA event: ".concat(sb.toString()));
        s80.mo9087f(sb.toString());
    }

    /* renamed from: c */
    public static void m19607c(s80 s80, String str, String str2) {
        s80.mo9087f(str + "(" + str2 + ");");
    }

    /* renamed from: d */
    public static void m19608d(s80 s80, String str, JSONObject jSONObject) {
        s80.mo9089k(str, jSONObject.toString());
    }
}
