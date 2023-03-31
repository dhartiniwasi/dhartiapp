package com.onesignal;

import com.onesignal.C8303b0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onesignal.g4 */
/* compiled from: UserState */
abstract class C8451g4 {

    /* renamed from: d */
    private static final Object f35651d = new Object();

    /* renamed from: e */
    private static final String[] f35652e;

    /* renamed from: f */
    private static final Set<String> f35653f;

    /* renamed from: a */
    private String f35654a;

    /* renamed from: b */
    private JSONObject f35655b;

    /* renamed from: c */
    private JSONObject f35656c;

    static {
        String[] strArr = {"lat", "long", "loc_acc", "loc_type", "loc_bg", "loc_time_stamp"};
        f35652e = strArr;
        f35653f = new HashSet(Arrays.asList(strArr));
    }

    C8451g4(String str, boolean z) {
        this.f35654a = str;
        if (z) {
            m46823n();
            return;
        }
        this.f35655b = new JSONObject();
        this.f35656c = new JSONObject();
    }

    /* renamed from: e */
    private static JSONObject m46821e(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, Set<String> set) {
        JSONObject b;
        synchronized (f35651d) {
            b = C8293a0.m46256b(jSONObject, jSONObject2, jSONObject3, set);
        }
        return b;
    }

    /* renamed from: k */
    private Set<String> m46822k(C8451g4 g4Var) {
        try {
            if (this.f35655b.optLong("loc_time_stamp") == g4Var.f35655b.getLong("loc_time_stamp")) {
                return null;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("loc_bg", g4Var.f35655b.opt("loc_bg"));
            hashMap.put("loc_time_stamp", g4Var.f35655b.opt("loc_time_stamp"));
            m46824u(g4Var.f35656c, hashMap);
            return f35653f;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: n */
    private void m46823n() {
        int i;
        boolean z;
        String str = C8500m3.f35731a;
        String f = C8500m3.m47107f(str, "ONESIGNAL_USERSTATE_DEPENDVALYES_" + this.f35654a, (String) null);
        if (f == null) {
            mo27834y(new JSONObject());
            try {
                int i2 = 1;
                if (this.f35654a.equals("CURRENT_STATE")) {
                    i = C8500m3.m47104c(str, "ONESIGNAL_SUBSCRIPTION", 1);
                } else {
                    i = C8500m3.m47104c(str, "ONESIGNAL_SYNCED_SUBSCRIPTION", 1);
                }
                if (i == -2) {
                    z = false;
                } else {
                    i2 = i;
                    z = true;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("subscribableStatus", Integer.valueOf(i2));
                hashMap.put("userSubscribePref", Boolean.valueOf(z));
                m46824u(this.f35655b, hashMap);
            } catch (JSONException unused) {
            }
        } else {
            try {
                mo27834y(new JSONObject(f));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        String str2 = C8500m3.f35731a;
        String f2 = C8500m3.m47107f(str2, "ONESIGNAL_USERSTATE_SYNCVALYES_" + this.f35654a, (String) null);
        JSONObject jSONObject = new JSONObject();
        if (f2 == null) {
            try {
                jSONObject.put("identifier", C8500m3.m47107f(str2, "GT_REGISTRATION_ID", (String) null));
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        } else {
            jSONObject = new JSONObject(f2);
        }
        mo27812A(jSONObject);
    }

    /* renamed from: u */
    private void m46824u(JSONObject jSONObject, HashMap<String, Object> hashMap) throws JSONException {
        synchronized (f35651d) {
            for (Map.Entry next : hashMap.entrySet()) {
                jSONObject.put((String) next.getKey(), next.getValue());
            }
        }
    }

    /* renamed from: A */
    public void mo27812A(JSONObject jSONObject) {
        synchronized (f35651d) {
            this.f35656c = jSONObject;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo27813a();

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo27814b() {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("lat", (Object) null);
            hashMap.put("long", (Object) null);
            hashMap.put("loc_acc", (Object) null);
            hashMap.put("loc_type", (Object) null);
            hashMap.put("loc_bg", (Object) null);
            hashMap.put("loc_time_stamp", (Object) null);
            m46824u(this.f35656c, hashMap);
            HashMap hashMap2 = new HashMap();
            hashMap2.put("loc_bg", (Object) null);
            hashMap2.put("loc_time_stamp", (Object) null);
            m46824u(this.f35655b, hashMap2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C8451g4 mo27815c(String str) {
        C8451g4 p = mo27825p(str);
        try {
            p.f35655b = mo27821j();
            p.f35656c = mo27823m();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public JSONObject mo27816d(C8451g4 g4Var, boolean z) {
        mo27813a();
        g4Var.mo27813a();
        JSONObject e = m46821e(this.f35656c, g4Var.f35656c, (JSONObject) null, m46822k(g4Var));
        if (!z && e.toString().equals("{}")) {
            return null;
        }
        try {
            if (!e.has("app_id")) {
                e.put("app_id", this.f35656c.optString("app_id"));
            }
            if (this.f35656c.has("email_auth_hash")) {
                e.put("email_auth_hash", this.f35656c.optString("email_auth_hash"));
            }
            if (this.f35656c.has("sms_auth_hash")) {
                e.put("sms_auth_hash", this.f35656c.optString("sms_auth_hash"));
            }
            if (this.f35656c.has("external_user_id_auth_hash") && !e.has("external_user_id_auth_hash")) {
                e.put("external_user_id_auth_hash", this.f35656c.optString("external_user_id_auth_hash"));
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public JSONObject mo27817f(C8451g4 g4Var, Set<String> set) {
        JSONObject b;
        synchronized (f35651d) {
            b = C8293a0.m46256b(this.f35655b, g4Var.f35655b, (JSONObject) null, set);
        }
        return b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public JSONObject mo27818g(JSONObject jSONObject, Set<String> set) {
        JSONObject b;
        synchronized (f35651d) {
            JSONObject jSONObject2 = this.f35655b;
            b = C8293a0.m46256b(jSONObject2, jSONObject, jSONObject2, set);
        }
        return b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public JSONObject mo27819h(JSONObject jSONObject, Set<String> set) {
        JSONObject b;
        synchronized (f35651d) {
            JSONObject jSONObject2 = this.f35656c;
            b = C8293a0.m46256b(jSONObject2, jSONObject, jSONObject2, set);
        }
        return b;
    }

    /* renamed from: i */
    public C8645x mo27820i() {
        try {
            return new C8645x(mo27821j());
        } catch (JSONException e) {
            e.printStackTrace();
            return new C8645x();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public JSONObject mo27821j() throws JSONException {
        JSONObject jSONObject;
        synchronized (f35651d) {
            jSONObject = new JSONObject(this.f35655b.toString());
        }
        return jSONObject;
    }

    /* renamed from: l */
    public C8645x mo27822l() {
        try {
            return new C8645x(mo27823m());
        } catch (JSONException e) {
            e.printStackTrace();
            return new C8645x();
        }
    }

    /* renamed from: m */
    public JSONObject mo27823m() throws JSONException {
        JSONObject jSONObject;
        synchronized (f35651d) {
            jSONObject = new JSONObject(this.f35656c.toString());
        }
        return jSONObject;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:6|7|8|9) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0021 */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo27824o(org.json.JSONObject r6, org.json.JSONObject r7) {
        /*
            r5 = this;
            java.lang.String r0 = "tags"
            boolean r0 = r6.has(r0)
            if (r0 != 0) goto L_0x0009
            return
        L_0x0009:
            org.json.JSONObject r0 = r5.mo27823m()     // Catch:{ JSONException -> 0x0085 }
            java.lang.String r1 = "tags"
            boolean r1 = r0.has(r1)     // Catch:{ JSONException -> 0x0085 }
            if (r1 == 0) goto L_0x0027
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0021 }
            java.lang.String r2 = "tags"
            java.lang.String r0 = r0.optString(r2)     // Catch:{ JSONException -> 0x0021 }
            r1.<init>(r0)     // Catch:{ JSONException -> 0x0021 }
            goto L_0x002c
        L_0x0021:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0085 }
            r1.<init>()     // Catch:{ JSONException -> 0x0085 }
            goto L_0x002c
        L_0x0027:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0085 }
            r1.<init>()     // Catch:{ JSONException -> 0x0085 }
        L_0x002c:
            java.lang.String r0 = "tags"
            org.json.JSONObject r6 = r6.optJSONObject(r0)     // Catch:{ JSONException -> 0x0085 }
            java.util.Iterator r0 = r6.keys()     // Catch:{ JSONException -> 0x0085 }
        L_0x0036:
            boolean r2 = r0.hasNext()     // Catch:{ JSONException -> 0x0085 }
            if (r2 == 0) goto L_0x0062
            java.lang.Object r2 = r0.next()     // Catch:{ JSONException -> 0x0085 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ JSONException -> 0x0085 }
            java.lang.String r3 = ""
            java.lang.String r4 = r6.optString(r2)     // Catch:{ JSONException -> 0x0085 }
            boolean r3 = r3.equals(r4)     // Catch:{ JSONException -> 0x0085 }
            if (r3 == 0) goto L_0x0052
            r1.remove(r2)     // Catch:{ JSONException -> 0x0085 }
            goto L_0x0036
        L_0x0052:
            if (r7 == 0) goto L_0x005a
            boolean r3 = r7.has(r2)     // Catch:{ JSONException -> 0x0085 }
            if (r3 != 0) goto L_0x0036
        L_0x005a:
            java.lang.String r3 = r6.optString(r2)     // Catch:{ JSONException -> 0x0085 }
            r1.put(r2, r3)     // Catch:{ JSONException -> 0x0085 }
            goto L_0x0036
        L_0x0062:
            java.lang.Object r6 = f35651d     // Catch:{ JSONException -> 0x0085 }
            monitor-enter(r6)     // Catch:{ JSONException -> 0x0085 }
            java.lang.String r7 = r1.toString()     // Catch:{ all -> 0x0082 }
            java.lang.String r0 = "{}"
            boolean r7 = r7.equals(r0)     // Catch:{ all -> 0x0082 }
            if (r7 == 0) goto L_0x0079
            org.json.JSONObject r7 = r5.f35656c     // Catch:{ all -> 0x0082 }
            java.lang.String r0 = "tags"
            r7.remove(r0)     // Catch:{ all -> 0x0082 }
            goto L_0x0080
        L_0x0079:
            org.json.JSONObject r7 = r5.f35656c     // Catch:{ all -> 0x0082 }
            java.lang.String r0 = "tags"
            r7.put(r0, r1)     // Catch:{ all -> 0x0082 }
        L_0x0080:
            monitor-exit(r6)     // Catch:{ all -> 0x0082 }
            goto L_0x0089
        L_0x0082:
            r7 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0082 }
            throw r7     // Catch:{ JSONException -> 0x0085 }
        L_0x0085:
            r6 = move-exception
            r6.printStackTrace()
        L_0x0089:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.C8451g4.mo27824o(org.json.JSONObject, org.json.JSONObject):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public abstract C8451g4 mo27825p(String str);

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo27826q() {
        synchronized (f35651d) {
            try {
                if (this.f35656c.has("external_user_id_auth_hash") && ((this.f35656c.has("external_user_id") && this.f35656c.get("external_user_id").toString() == "") || !this.f35656c.has("external_user_id"))) {
                    this.f35656c.remove("external_user_id_auth_hash");
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            String str = C8500m3.f35731a;
            C8500m3.m47114m(str, "ONESIGNAL_USERSTATE_SYNCVALYES_" + this.f35654a, this.f35656c.toString());
            C8500m3.m47114m(str, "ONESIGNAL_USERSTATE_DEPENDVALYES_" + this.f35654a, this.f35655b.toString());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo27827r(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject != null) {
            JSONObject jSONObject3 = this.f35655b;
            m46821e(jSONObject3, jSONObject, jSONObject3, (Set<String>) null);
        }
        if (jSONObject2 != null) {
            JSONObject jSONObject4 = this.f35656c;
            m46821e(jSONObject4, jSONObject2, jSONObject4, (Set<String>) null);
            mo27824o(jSONObject2, (JSONObject) null);
        }
        if (jSONObject != null || jSONObject2 != null) {
            mo27826q();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo27828s(String str, Object obj) throws JSONException {
        synchronized (f35651d) {
            this.f35655b.put(str, obj);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo27829t(String str, Object obj) throws JSONException {
        synchronized (f35651d) {
            this.f35656c.put(str, obj);
        }
    }

    public String toString() {
        return "UserState{persistKey='" + this.f35654a + '\'' + ", dependValues=" + this.f35655b + ", syncValues=" + this.f35656c + '}';
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo27831v(String str) {
        synchronized (f35651d) {
            this.f35655b.remove(str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo27832w(String str) {
        synchronized (f35651d) {
            this.f35656c.remove(str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo27833x(List<String> list) {
        synchronized (f35651d) {
            for (String remove : list) {
                this.f35656c.remove(remove);
            }
        }
    }

    /* renamed from: y */
    public void mo27834y(JSONObject jSONObject) {
        synchronized (f35651d) {
            this.f35655b = jSONObject;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public void mo27835z(C8303b0.C8307d dVar) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("lat", dVar.f35340a);
            hashMap.put("long", dVar.f35341b);
            hashMap.put("loc_acc", dVar.f35342c);
            hashMap.put("loc_type", dVar.f35343d);
            m46824u(this.f35656c, hashMap);
            HashMap hashMap2 = new HashMap();
            hashMap2.put("loc_bg", dVar.f35344e);
            hashMap2.put("loc_time_stamp", dVar.f35345f);
            m46824u(this.f35655b, hashMap2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
