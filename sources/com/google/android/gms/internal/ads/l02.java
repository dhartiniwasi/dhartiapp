package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.StringReader;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p053g4.C4409t;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class l02 {

    /* renamed from: a */
    private final su0 f12587a;

    /* renamed from: b */
    private final Context f12588b;

    /* renamed from: c */
    private final vm0 f12589c;

    /* renamed from: d */
    private final et2 f12590d;

    /* renamed from: e */
    private final Executor f12591e;

    /* renamed from: f */
    private final String f12592f;

    /* renamed from: g */
    private final yy2 f12593g;

    /* renamed from: h */
    private final qt2 f12594h;

    /* renamed from: i */
    private final bv1 f12595i;

    public l02(su0 su0, Context context, vm0 vm0, et2 et2, Executor executor, String str, yy2 yy2, bv1 bv1) {
        this.f12587a = su0;
        this.f12588b = context;
        this.f12589c = vm0;
        this.f12590d = et2;
        this.f12591e = executor;
        this.f12592f = str;
        this.f12593g = yy2;
        this.f12594h = su0.mo9732y();
        this.f12595i = bv1;
    }

    /* renamed from: c */
    private final lf3 m15760c(String str, String str2) {
        ny2 a = my2.m16825a(this.f12588b, 11);
        a.mo11828T();
        pa0 a2 = C4409t.m29316h().mo10444a(this.f12588b, this.f12589c, this.f12587a.mo9709B());
        ja0 ja0 = ma0.f13287b;
        lf3 n = cf3.m10916n(cf3.m10916n(cf3.m10916n(cf3.m10911i(""), new i02(this, str, str2), this.f12591e), new j02(a2.mo13200a("google.afma.response.normalize", ja0, ja0)), this.f12591e), new k02(this), this.f12591e);
        xy2.m23609a(n, this.f12593g, a);
        return n;
    }

    /* renamed from: d */
    private final String m15761d(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = jSONObject.getJSONArray("ad_types");
            if (jSONArray != null && "unknown".equals(jSONArray.getString(0))) {
                jSONObject.put("ad_types", new JSONArray().put(this.f12592f));
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            pm0.m18667g("Failed to update the ad types for rendering. ".concat(e.toString()));
            return str;
        }
    }

    /* renamed from: e */
    private static final String m15762e(String str) {
        try {
            return new JSONObject(str).optString("request_id", "");
        } catch (JSONException unused) {
            return "";
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a3  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.lf3 mo11863a() {
        /*
            r10 = this;
            com.google.android.gms.internal.ads.et2 r0 = r10.f12590d
            h4.l4 r0 = r0.f8933d
            java.lang.String r0 = r0.f24888F
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r2 = "true"
            if (r1 != 0) goto L_0x0115
            com.google.android.gms.internal.ads.ez r1 = com.google.android.gms.internal.ads.C2679nz.f14504a6
            com.google.android.gms.internal.ads.lz r3 = p060h4.C4596v.m30088c()
            java.lang.Object r1 = r3.mo12227b(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0115
            java.lang.String r1 = m15762e(r0)
            com.google.android.gms.internal.ads.ez r3 = com.google.android.gms.internal.ads.C2679nz.f14634n6
            com.google.android.gms.internal.ads.lz r4 = p060h4.C4596v.m30088c()
            java.lang.Object r4 = r4.mo12227b(r3)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r5 = -1
            if (r4 == 0) goto L_0x004e
            boolean r4 = r1.isEmpty()
            if (r4 == 0) goto L_0x004e
            java.lang.String r1 = "&request_id="
            int r1 = r0.lastIndexOf(r1)
            if (r1 == r5) goto L_0x004c
            int r1 = r1 + 12
            java.lang.String r1 = r0.substring(r1)
            goto L_0x004e
        L_0x004c:
            java.lang.String r1 = ""
        L_0x004e:
            boolean r4 = android.text.TextUtils.isEmpty(r1)
            if (r4 == 0) goto L_0x0062
            com.google.android.gms.internal.ads.v82 r0 = new com.google.android.gms.internal.ads.v82
            r1 = 15
            java.lang.String r2 = "Invalid ad string."
            r0.<init>(r1, r2)
            com.google.android.gms.internal.ads.lf3 r0 = com.google.android.gms.internal.ads.cf3.m10910h(r0)
            return r0
        L_0x0062:
            com.google.android.gms.internal.ads.su0 r4 = r10.f12587a
            p4.t r4 = r4.mo9724q()
            com.google.android.gms.internal.ads.bv1 r6 = r10.f12595i
            java.lang.String r4 = r4.mo19285b(r1, r6)
            com.google.android.gms.internal.ads.lz r6 = p060h4.C4596v.m30088c()
            java.lang.Object r3 = r6.mo12227b(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x0105
            com.google.android.gms.internal.ads.bv1 r3 = r10.f12595i
            boolean r6 = android.text.TextUtils.isEmpty(r4)
            if (r6 != 0) goto L_0x0105
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ JSONException -> 0x009a }
            r6.<init>(r4)     // Catch:{ JSONException -> 0x009a }
            java.lang.String r7 = "is_gbid"
            java.lang.String r6 = r6.optString(r7)     // Catch:{ JSONException -> 0x009a }
            boolean r6 = r6.equals(r2)     // Catch:{ JSONException -> 0x009a }
            if (r6 == 0) goto L_0x009a
            java.lang.Boolean r6 = java.lang.Boolean.TRUE     // Catch:{ JSONException -> 0x009a }
            goto L_0x009c
        L_0x009a:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
        L_0x009c:
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L_0x00a3
            goto L_0x0105
        L_0x00a3:
            java.lang.String r6 = "&"
            int r6 = r0.lastIndexOf(r6)
            r7 = 0
            if (r6 == r5) goto L_0x00b2
            r5 = 0
            java.lang.String r5 = r0.substring(r5, r6)
            goto L_0x00b3
        L_0x00b2:
            r5 = r7
        L_0x00b3:
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 == 0) goto L_0x00ba
            goto L_0x0105
        L_0x00ba:
            r6 = 11
            byte[] r5 = android.util.Base64.decode(r5, r6)     // Catch:{ UnsupportedEncodingException -> 0x00ee }
            java.lang.String r6 = "UTF-8"
            byte[] r1 = r1.getBytes(r6)     // Catch:{ UnsupportedEncodingException -> 0x00ee }
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00d2 }
            r6.<init>(r4)     // Catch:{ JSONException -> 0x00d2 }
            java.lang.String r8 = "arek"
            java.lang.String r7 = r6.getString(r8)     // Catch:{ JSONException -> 0x00d2 }
            goto L_0x00e9
        L_0x00d2:
            r6 = move-exception
            java.lang.String r8 = "Failed to get key from QueryJSONMap"
            java.lang.String r9 = r6.toString()     // Catch:{ UnsupportedEncodingException -> 0x00ee }
            java.lang.String r8 = r8.concat(r9)     // Catch:{ UnsupportedEncodingException -> 0x00ee }
            p073j4.C4794n1.m30693k(r8)     // Catch:{ UnsupportedEncodingException -> 0x00ee }
            com.google.android.gms.internal.ads.xl0 r8 = p053g4.C4409t.m29325q()     // Catch:{ UnsupportedEncodingException -> 0x00ee }
            java.lang.String r9 = "CryptoUtils.getKeyFromQueryJsonMap"
            r8.mo15126t(r6, r9)     // Catch:{ UnsupportedEncodingException -> 0x00ee }
        L_0x00e9:
            java.lang.String r0 = com.google.android.gms.internal.ads.qt2.m19348b(r5, r1, r7, r3)     // Catch:{ UnsupportedEncodingException -> 0x00ee }
            goto L_0x0105
        L_0x00ee:
            r1 = move-exception
            java.lang.String r3 = r1.toString()
            java.lang.String r5 = "Failed to decode the adResponse. "
            java.lang.String r3 = r5.concat(r3)
            p073j4.C4794n1.m30693k(r3)
            com.google.android.gms.internal.ads.xl0 r3 = p053g4.C4409t.m29325q()
            java.lang.String r5 = "PreloadedLoader.decryptAdResponseIfNecessary"
            r3.mo15126t(r1, r5)
        L_0x0105:
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 == 0) goto L_0x010c
            goto L_0x0115
        L_0x010c:
            java.lang.String r1 = r10.m15761d(r4)
            com.google.android.gms.internal.ads.lf3 r0 = r10.m15760c(r0, r1)
            return r0
        L_0x0115:
            com.google.android.gms.internal.ads.et2 r0 = r10.f12590d
            h4.l4 r0 = r0.f8933d
            h4.y0 r0 = r0.f24883A
            if (r0 == 0) goto L_0x0174
            com.google.android.gms.internal.ads.ez r1 = com.google.android.gms.internal.ads.C2679nz.f14485Y5
            com.google.android.gms.internal.ads.lz r3 = p060h4.C4596v.m30088c()
            java.lang.Object r1 = r3.mo12227b(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L_0x0130
            goto L_0x015c
        L_0x0130:
            java.lang.String r1 = r0.f25056a
            java.lang.String r1 = m15762e(r1)
            java.lang.String r3 = r0.f25057b
            java.lang.String r3 = m15762e(r3)
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L_0x0169
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0169
            com.google.android.gms.internal.ads.su0 r2 = r10.f12587a
            p4.t r2 = r2.mo9724q()
            r2.mo19288f(r1)
            com.google.android.gms.internal.ads.bv1 r2 = r10.f12595i
            java.util.Map r2 = r2.mo8951a()
            java.lang.String r3 = "rid"
            r2.put(r3, r1)
        L_0x015c:
            java.lang.String r1 = r0.f25056a
            java.lang.String r0 = r0.f25057b
            java.lang.String r0 = r10.m15761d(r0)
            com.google.android.gms.internal.ads.lf3 r0 = r10.m15760c(r1, r0)
            return r0
        L_0x0169:
            com.google.android.gms.internal.ads.bv1 r0 = r10.f12595i
            java.util.Map r0 = r0.mo8951a()
            java.lang.String r1 = "ridmm"
            r0.put(r1, r2)
        L_0x0174:
            com.google.android.gms.internal.ads.v82 r0 = new com.google.android.gms.internal.ads.v82
            r1 = 14
            java.lang.String r2 = "Mismatch request IDs."
            r0.<init>(r1, r2)
            com.google.android.gms.internal.ads.lf3 r0 = com.google.android.gms.internal.ads.cf3.m10910h(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.l02.mo11863a():com.google.android.gms.internal.ads.lf3");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ lf3 mo11864b(JSONObject jSONObject) throws Exception {
        return cf3.m10911i(new us2(new rs2(this.f12590d), ts2.m21215a(new StringReader(jSONObject.toString()))));
    }
}
