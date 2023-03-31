package com.onesignal;

import com.facebook.ads.AdError;
import com.onesignal.C8338d3;
import com.onesignal.C8524o3;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onesignal.n3 */
/* compiled from: OneSignalRemoteParams */
public class C8508n3 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static int f35742a;

    /* renamed from: com.onesignal.n3$a */
    /* compiled from: OneSignalRemoteParams */
    class C8509a extends C8524o3.C8531g {

        /* renamed from: a */
        final /* synthetic */ String f35743a;

        /* renamed from: b */
        final /* synthetic */ String f35744b;

        /* renamed from: c */
        final /* synthetic */ C8512c f35745c;

        /* renamed from: com.onesignal.n3$a$a */
        /* compiled from: OneSignalRemoteParams */
        class C8510a implements Runnable {
            C8510a() {
            }

            public void run() {
                int a = (C8508n3.f35742a * 10000) + 30000;
                if (a > 90000) {
                    a = 90000;
                }
                C8338d3.C8384r0 r0Var = C8338d3.C8384r0.INFO;
                C8338d3.m46492a(r0Var, "Failed to get Android parameters, trying again in " + (a / AdError.NETWORK_ERROR_CODE) + " seconds.");
                try {
                    Thread.sleep((long) a);
                    C8508n3.m47149b();
                    C8509a aVar = C8509a.this;
                    C8508n3.m47152e(aVar.f35743a, aVar.f35744b, aVar.f35745c);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        C8509a(String str, String str2, C8512c cVar) {
            this.f35743a = str;
            this.f35744b = str2;
            this.f35745c = cVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo27538a(int i, String str, Throwable th) {
            if (i == 403) {
                C8338d3.m46492a(C8338d3.C8384r0.FATAL, "403 error getting OneSignal params, omitting further retries!");
            } else {
                new Thread(new C8510a(), "OS_PARAMS_REQUEST").start();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo27539b(String str) {
            C8508n3.m47153f(str, this.f35745c);
        }
    }

    /* renamed from: com.onesignal.n3$b */
    /* compiled from: OneSignalRemoteParams */
    class C8511b extends C8515f {

        /* renamed from: q */
        final /* synthetic */ JSONObject f35747q;

        C8511b(JSONObject jSONObject) {
            this.f35747q = jSONObject;
            this.f35760b = jSONObject.optBoolean("enterp", false);
            this.f35762d = jSONObject.optBoolean("require_email_auth", false);
            this.f35763e = jSONObject.optBoolean("require_user_id_auth", false);
            this.f35764f = jSONObject.optJSONArray("chnl_lst");
            this.f35765g = jSONObject.optBoolean("fba", false);
            this.f35766h = jSONObject.optBoolean("restore_ttl_filter", true);
            this.f35759a = jSONObject.optString("android_sender_id", (String) null);
            this.f35767i = jSONObject.optBoolean("clear_group_on_summary_click", true);
            this.f35768j = jSONObject.optBoolean("receive_receipts_enable", false);
            this.f35769k = !jSONObject.has("disable_gms_missing_prompt") ? null : Boolean.valueOf(jSONObject.optBoolean("disable_gms_missing_prompt", false));
            this.f35770l = !jSONObject.has("unsubscribe_on_notifications_disabled") ? null : Boolean.valueOf(jSONObject.optBoolean("unsubscribe_on_notifications_disabled", true));
            this.f35771m = !jSONObject.has("location_shared") ? null : Boolean.valueOf(jSONObject.optBoolean("location_shared", true));
            this.f35772n = !jSONObject.has("requires_user_privacy_consent") ? null : Boolean.valueOf(jSONObject.optBoolean("requires_user_privacy_consent", false));
            this.f35773o = new C8514e();
            if (jSONObject.has("outcomes")) {
                C8508n3.m47154g(jSONObject.optJSONObject("outcomes"), this.f35773o);
            }
            this.f35774p = new C8513d();
            if (jSONObject.has("fcm")) {
                JSONObject optJSONObject = jSONObject.optJSONObject("fcm");
                this.f35774p.f35750c = optJSONObject.optString("api_key", (String) null);
                this.f35774p.f35749b = optJSONObject.optString("app_id", (String) null);
                this.f35774p.f35748a = optJSONObject.optString("project_id", (String) null);
            }
        }
    }

    /* renamed from: com.onesignal.n3$c */
    /* compiled from: OneSignalRemoteParams */
    interface C8512c {
        /* renamed from: a */
        void mo27714a(C8515f fVar);
    }

    /* renamed from: com.onesignal.n3$d */
    /* compiled from: OneSignalRemoteParams */
    static class C8513d {

        /* renamed from: a */
        String f35748a;

        /* renamed from: b */
        String f35749b;

        /* renamed from: c */
        String f35750c;

        C8513d() {
        }
    }

    /* renamed from: com.onesignal.n3$e */
    /* compiled from: OneSignalRemoteParams */
    public static class C8514e {

        /* renamed from: a */
        int f35751a = 1440;

        /* renamed from: b */
        int f35752b = 10;

        /* renamed from: c */
        int f35753c = 1440;

        /* renamed from: d */
        int f35754d = 10;

        /* renamed from: e */
        boolean f35755e = false;

        /* renamed from: f */
        boolean f35756f = false;

        /* renamed from: g */
        boolean f35757g = false;

        /* renamed from: h */
        boolean f35758h = false;

        /* renamed from: a */
        public int mo27987a() {
            return this.f35754d;
        }

        /* renamed from: b */
        public int mo27988b() {
            return this.f35753c;
        }

        /* renamed from: c */
        public int mo27989c() {
            return this.f35751a;
        }

        /* renamed from: d */
        public int mo27990d() {
            return this.f35752b;
        }

        /* renamed from: e */
        public boolean mo27991e() {
            return this.f35755e;
        }

        /* renamed from: f */
        public boolean mo27992f() {
            return this.f35756f;
        }

        /* renamed from: g */
        public boolean mo27993g() {
            return this.f35757g;
        }

        public String toString() {
            return "InfluenceParams{indirectNotificationAttributionWindow=" + this.f35751a + ", notificationLimit=" + this.f35752b + ", indirectIAMAttributionWindow=" + this.f35753c + ", iamLimit=" + this.f35754d + ", directEnabled=" + this.f35755e + ", indirectEnabled=" + this.f35756f + ", unattributedEnabled=" + this.f35757g + '}';
        }
    }

    /* renamed from: com.onesignal.n3$f */
    /* compiled from: OneSignalRemoteParams */
    static class C8515f {

        /* renamed from: a */
        String f35759a;

        /* renamed from: b */
        boolean f35760b;

        /* renamed from: c */
        boolean f35761c;

        /* renamed from: d */
        boolean f35762d;

        /* renamed from: e */
        boolean f35763e;

        /* renamed from: f */
        JSONArray f35764f;

        /* renamed from: g */
        boolean f35765g;

        /* renamed from: h */
        boolean f35766h;

        /* renamed from: i */
        boolean f35767i;

        /* renamed from: j */
        boolean f35768j;

        /* renamed from: k */
        Boolean f35769k;

        /* renamed from: l */
        Boolean f35770l;

        /* renamed from: m */
        Boolean f35771m;

        /* renamed from: n */
        Boolean f35772n;

        /* renamed from: o */
        C8514e f35773o;

        /* renamed from: p */
        C8513d f35774p;

        C8515f() {
        }
    }

    /* renamed from: b */
    static /* synthetic */ int m47149b() {
        int i = f35742a;
        f35742a = i + 1;
        return i;
    }

    /* renamed from: e */
    static void m47152e(String str, String str2, C8512c cVar) {
        C8509a aVar = new C8509a(str, str2, cVar);
        String str3 = "apps/" + str + "/android_params.js";
        if (str2 != null) {
            str3 = str3 + "?player_id=" + str2;
        }
        C8338d3.m46492a(C8338d3.C8384r0.DEBUG, "Starting request to get Android parameters.");
        C8524o3.m47233e(str3, aVar, "CACHE_KEY_REMOTE_PARAMS");
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static void m47153f(String str, C8512c cVar) {
        try {
            cVar.mo27714a(new C8511b(new JSONObject(str)));
        } catch (NullPointerException | JSONException e) {
            C8338d3.C8384r0 r0Var = C8338d3.C8384r0.FATAL;
            C8338d3.m46496b(r0Var, "Error parsing android_params!: ", e);
            C8338d3.m46492a(r0Var, "Response that errored from android_params!: " + str);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static void m47154g(JSONObject jSONObject, C8514e eVar) {
        if (jSONObject.has("v2_enabled")) {
            eVar.f35758h = jSONObject.optBoolean("v2_enabled");
        }
        if (jSONObject.has("direct")) {
            eVar.f35755e = jSONObject.optJSONObject("direct").optBoolean("enabled");
        }
        if (jSONObject.has("indirect")) {
            JSONObject optJSONObject = jSONObject.optJSONObject("indirect");
            eVar.f35756f = optJSONObject.optBoolean("enabled");
            if (optJSONObject.has("notification_attribution")) {
                JSONObject optJSONObject2 = optJSONObject.optJSONObject("notification_attribution");
                eVar.f35751a = optJSONObject2.optInt("minutes_since_displayed", 1440);
                eVar.f35752b = optJSONObject2.optInt("limit", 10);
            }
            if (optJSONObject.has("in_app_message_attribution")) {
                JSONObject optJSONObject3 = optJSONObject.optJSONObject("in_app_message_attribution");
                eVar.f35753c = optJSONObject3.optInt("minutes_since_displayed", 1440);
                eVar.f35754d = optJSONObject3.optInt("limit", 10);
            }
        }
        if (jSONObject.has("unattributed")) {
            eVar.f35757g = jSONObject.optJSONObject("unattributed").optBoolean("enabled");
        }
    }
}
