package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;
import p060h4.C4596v;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class d60 {

    /* renamed from: a */
    public static final e60 f8078a = k50.f11908a;

    /* renamed from: b */
    public static final e60 f8079b = l50.f12657a;

    /* renamed from: c */
    public static final e60 f8080c = c50.f7601a;

    /* renamed from: d */
    public static final e60 f8081d = new v50();

    /* renamed from: e */
    public static final e60 f8082e = new w50();

    /* renamed from: f */
    public static final e60 f8083f = i50.f10614a;

    /* renamed from: g */
    public static final e60 f8084g = new x50();

    /* renamed from: h */
    public static final e60 f8085h = new y50();

    /* renamed from: i */
    public static final e60 f8086i = h50.f10193a;

    /* renamed from: j */
    public static final e60 f8087j = new z50();

    /* renamed from: k */
    public static final e60 f8088k = new a60();

    /* renamed from: l */
    public static final e60 f8089l = new tq0();

    /* renamed from: m */
    public static final e60 f8090m = new uq0();

    /* renamed from: n */
    public static final e60 f8091n = new b50();

    /* renamed from: o */
    public static final u60 f8092o = new u60();

    /* renamed from: p */
    public static final e60 f8093p = new b60();

    /* renamed from: q */
    public static final e60 f8094q = new c60();

    /* renamed from: r */
    public static final e60 f8095r = new m50();

    /* renamed from: s */
    public static final e60 f8096s = new n50();

    /* renamed from: t */
    public static final e60 f8097t = new o50();

    /* renamed from: u */
    public static final e60 f8098u = new p50();

    /* renamed from: v */
    public static final e60 f8099v = new q50();

    /* renamed from: w */
    public static final e60 f8100w = new r50();

    /* renamed from: x */
    public static final e60 f8101x = new s50();

    /* renamed from: y */
    public static final e60 f8102y = new t50();

    /* renamed from: a */
    public static e60 m11324a(qh1 qh1) {
        return new g50(qh1);
    }

    /* renamed from: b */
    public static lf3 m11325b(vs0 vs0, String str) {
        Uri parse = Uri.parse(str);
        try {
            C2955ve r = vs0.mo10015r();
            if (r != null && r.mo14740f(parse)) {
                parse = r.mo14735a(parse, vs0.getContext(), vs0.mo10647w(), vs0.mo8461X());
            }
        } catch (C2992we unused) {
            pm0.m18667g("Unable to append parameter to URL: ".concat(str));
        }
        String b = uk0.m21684b(parse, vs0.getContext());
        long longValue = ((Long) d10.f8018e.mo13438e()).longValue();
        if (longValue <= 0 || longValue > 223104600) {
            return cf3.m10911i(b);
        }
        se3 D = se3.m20287D(vs0.mo12135s1());
        d50 d50 = d50.f8062a;
        mf3 mf3 = dn0.f8330f;
        return cf3.m10908f(cf3.m10915m(cf3.m10908f(D, Throwable.class, d50, mf3), new e50(b), mf3), Throwable.class, new f50(b), mf3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00da  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void m11326c(com.google.android.gms.internal.ads.xt0 r16, java.util.Map r17) {
        /*
            java.lang.String r1 = "openableIntents"
            android.content.Context r0 = r16.getContext()
            android.content.pm.PackageManager r2 = r0.getPackageManager()
            java.lang.String r0 = "data"
            r3 = r17
            java.lang.Object r0 = r3.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0107 }
            r3.<init>(r0)     // Catch:{ JSONException -> 0x0107 }
            java.lang.String r0 = "intents"
            org.json.JSONArray r3 = r3.getJSONArray(r0)     // Catch:{ JSONException -> 0x00fa }
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            r5 = 0
            r6 = 0
        L_0x0026:
            int r0 = r3.length()
            if (r6 >= r0) goto L_0x00f2
            org.json.JSONObject r0 = r3.getJSONObject(r6)     // Catch:{ JSONException -> 0x00e7 }
            java.lang.String r7 = "id"
            java.lang.String r7 = r0.optString(r7)
            java.lang.String r8 = "u"
            java.lang.String r8 = r0.optString(r8)
            java.lang.String r9 = "i"
            java.lang.String r9 = r0.optString(r9)
            java.lang.String r10 = "m"
            java.lang.String r10 = r0.optString(r10)
            java.lang.String r11 = "p"
            java.lang.String r11 = r0.optString(r11)
            java.lang.String r12 = "c"
            java.lang.String r12 = r0.optString(r12)
            java.lang.String r13 = "intent_url"
            java.lang.String r13 = r0.optString(r13)
            boolean r0 = android.text.TextUtils.isEmpty(r13)
            r14 = 0
            if (r0 != 0) goto L_0x0075
            android.content.Intent r0 = android.content.Intent.parseUri(r13, r5)     // Catch:{ URISyntaxException -> 0x0066 }
            goto L_0x0076
        L_0x0066:
            r0 = move-exception
            r15 = r0
            java.lang.String r0 = java.lang.String.valueOf(r13)
            java.lang.String r13 = "Error parsing the url: "
            java.lang.String r0 = r13.concat(r0)
            com.google.android.gms.internal.ads.pm0.m18665e(r0, r15)
        L_0x0075:
            r0 = r14
        L_0x0076:
            r13 = 1
            if (r0 != 0) goto L_0x00c2
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            boolean r15 = android.text.TextUtils.isEmpty(r8)
            if (r15 != 0) goto L_0x008b
            android.net.Uri r8 = android.net.Uri.parse(r8)
            r0.setData(r8)
        L_0x008b:
            boolean r8 = android.text.TextUtils.isEmpty(r9)
            if (r8 != 0) goto L_0x0094
            r0.setAction(r9)
        L_0x0094:
            boolean r8 = android.text.TextUtils.isEmpty(r10)
            if (r8 != 0) goto L_0x009d
            r0.setType(r10)
        L_0x009d:
            boolean r8 = android.text.TextUtils.isEmpty(r11)
            if (r8 != 0) goto L_0x00a6
            r0.setPackage(r11)
        L_0x00a6:
            boolean r8 = android.text.TextUtils.isEmpty(r12)
            if (r8 != 0) goto L_0x00c2
            java.lang.String r8 = "/"
            r9 = 2
            java.lang.String[] r8 = r12.split(r8, r9)
            int r10 = r8.length
            if (r10 != r9) goto L_0x00c2
            android.content.ComponentName r9 = new android.content.ComponentName
            r10 = r8[r5]
            r8 = r8[r13]
            r9.<init>(r10, r8)
            r0.setComponent(r9)
        L_0x00c2:
            r8 = r0
            r0 = 65536(0x10000, float:9.18355E-41)
            android.content.pm.ResolveInfo r14 = r2.resolveActivity(r8, r0)     // Catch:{ NullPointerException -> 0x00ca }
            goto L_0x00d7
        L_0x00ca:
            r0 = move-exception
            r9 = r0
            com.google.android.gms.internal.ads.xl0 r0 = p053g4.C4409t.m29325q()
            java.lang.String r8 = r8.toString()
            r0.mo15126t(r9, r8)
        L_0x00d7:
            if (r14 == 0) goto L_0x00da
            goto L_0x00db
        L_0x00da:
            r13 = 0
        L_0x00db:
            r4.put(r7, r13)     // Catch:{ JSONException -> 0x00df }
            goto L_0x00ee
        L_0x00df:
            r0 = move-exception
            r7 = r0
            java.lang.String r0 = "Error constructing openable urls response."
            com.google.android.gms.internal.ads.pm0.m18665e(r0, r7)
            goto L_0x00ee
        L_0x00e7:
            r0 = move-exception
            r7 = r0
            java.lang.String r0 = "Error parsing the intent data."
            com.google.android.gms.internal.ads.pm0.m18665e(r0, r7)
        L_0x00ee:
            int r6 = r6 + 1
            goto L_0x0026
        L_0x00f2:
            r0 = r16
            com.google.android.gms.internal.ads.q80 r0 = (com.google.android.gms.internal.ads.q80) r0
            r0.mo9084a(r1, r4)
            return
        L_0x00fa:
            r0 = r16
            com.google.android.gms.internal.ads.q80 r0 = (com.google.android.gms.internal.ads.q80) r0
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            r0.mo9084a(r1, r2)
            return
        L_0x0107:
            r0 = r16
            com.google.android.gms.internal.ads.q80 r0 = (com.google.android.gms.internal.ads.q80) r0
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            r0.mo9084a(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.d60.m11326c(com.google.android.gms.internal.ads.xt0, java.util.Map):void");
    }

    /* renamed from: d */
    public static void m11327d(Map map, qh1 qh1) {
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14716v8)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals("1") && qh1 != null) {
            qh1.mo9272h();
        }
    }
}
