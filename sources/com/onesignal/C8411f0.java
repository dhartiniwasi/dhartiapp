package com.onesignal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import com.onesignal.C8338d3;
import com.onesignal.C8610t1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onesignal.f0 */
/* compiled from: NotificationBundleProcessor */
class C8411f0 {

    /* renamed from: com.onesignal.f0$a */
    /* compiled from: NotificationBundleProcessor */
    class C8412a implements C8610t1.C8615e {

        /* renamed from: a */
        final /* synthetic */ boolean f35571a;

        /* renamed from: b */
        final /* synthetic */ JSONObject f35572b;

        /* renamed from: c */
        final /* synthetic */ Context f35573c;

        /* renamed from: d */
        final /* synthetic */ int f35574d;

        /* renamed from: e */
        final /* synthetic */ String f35575e;

        /* renamed from: f */
        final /* synthetic */ long f35576f;

        C8412a(boolean z, JSONObject jSONObject, Context context, int i, String str, long j) {
            this.f35571a = z;
            this.f35572b = jSONObject;
            this.f35573c = context;
            this.f35574d = i;
            this.f35575e = str;
            this.f35576f = j;
        }

        /* renamed from: a */
        public void mo27768a(boolean z) {
            if (this.f35571a || !z) {
                OSNotificationWorkManager.m46144b(this.f35573c, C8623u1.m47742b(this.f35572b), this.f35574d, this.f35575e, this.f35576f, this.f35571a, false);
                if (this.f35571a) {
                    OSUtils.m46190W(100);
                }
            }
        }
    }

    /* renamed from: com.onesignal.f0$b */
    /* compiled from: NotificationBundleProcessor */
    class C8413b implements C8415d {

        /* renamed from: a */
        final /* synthetic */ C8417f f35577a;

        /* renamed from: b */
        final /* synthetic */ C8416e f35578b;

        C8413b(C8417f fVar, C8416e eVar) {
            this.f35577a = fVar;
            this.f35578b = eVar;
        }

        /* renamed from: a */
        public void mo27769a(boolean z) {
            if (!z) {
                this.f35577a.mo27773d(true);
            }
            this.f35578b.mo27486a(this.f35577a);
        }
    }

    /* renamed from: com.onesignal.f0$c */
    /* compiled from: NotificationBundleProcessor */
    class C8414c implements C8610t1.C8615e {

        /* renamed from: a */
        final /* synthetic */ boolean f35579a;

        /* renamed from: b */
        final /* synthetic */ Context f35580b;

        /* renamed from: c */
        final /* synthetic */ Bundle f35581c;

        /* renamed from: d */
        final /* synthetic */ C8415d f35582d;

        /* renamed from: e */
        final /* synthetic */ JSONObject f35583e;

        /* renamed from: f */
        final /* synthetic */ long f35584f;

        /* renamed from: g */
        final /* synthetic */ boolean f35585g;

        /* renamed from: h */
        final /* synthetic */ C8417f f35586h;

        C8414c(boolean z, Context context, Bundle bundle, C8415d dVar, JSONObject jSONObject, long j, boolean z2, C8417f fVar) {
            this.f35579a = z;
            this.f35580b = context;
            this.f35581c = bundle;
            this.f35582d = dVar;
            this.f35583e = jSONObject;
            this.f35584f = j;
            this.f35585g = z2;
            this.f35586h = fVar;
        }

        /* renamed from: a */
        public void mo27768a(boolean z) {
            if (this.f35579a || !z) {
                OSNotificationWorkManager.m46144b(this.f35580b, C8623u1.m47742b(this.f35583e), this.f35581c.containsKey("android_notif_id") ? this.f35581c.getInt("android_notif_id") : 0, this.f35583e.toString(), this.f35584f, this.f35579a, this.f35585g);
                this.f35586h.mo27776g(true);
                this.f35582d.mo27769a(true);
                return;
            }
            C8338d3.C8384r0 r0Var = C8338d3.C8384r0.DEBUG;
            C8338d3.m46492a(r0Var, "startNotificationProcessing returning, with context: " + this.f35580b + " and bundle: " + this.f35581c);
            this.f35582d.mo27769a(false);
        }
    }

    /* renamed from: com.onesignal.f0$d */
    /* compiled from: NotificationBundleProcessor */
    interface C8415d {
        /* renamed from: a */
        void mo27769a(boolean z);
    }

    /* renamed from: com.onesignal.f0$e */
    /* compiled from: NotificationBundleProcessor */
    interface C8416e {
        /* renamed from: a */
        void mo27486a(C8417f fVar);
    }

    /* renamed from: com.onesignal.f0$f */
    /* compiled from: NotificationBundleProcessor */
    static class C8417f {

        /* renamed from: a */
        private boolean f35587a;

        /* renamed from: b */
        private boolean f35588b;

        /* renamed from: c */
        private boolean f35589c;

        /* renamed from: d */
        private boolean f35590d;

        C8417f() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo27770a() {
            return this.f35588b;
        }

        /* renamed from: b */
        public boolean mo27771b() {
            return this.f35590d;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo27772c() {
            return !this.f35587a || this.f35588b || this.f35589c || this.f35590d;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo27773d(boolean z) {
            this.f35588b = z;
        }

        /* renamed from: e */
        public void mo27774e(boolean z) {
            this.f35589c = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo27775f(boolean z) {
            this.f35587a = z;
        }

        /* renamed from: g */
        public void mo27776g(boolean z) {
            this.f35590d = z;
        }
    }

    /* renamed from: a */
    static JSONObject m46660a(Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            try {
                jSONObject.put(str, bundle.get(str));
            } catch (JSONException e) {
                C8338d3.C8384r0 r0Var = C8338d3.C8384r0.ERROR;
                C8338d3.m46496b(r0Var, "bundleAsJSONObject error for key: " + str, e);
            }
        }
        return jSONObject;
    }

    /* renamed from: b */
    static JSONObject m46661b(JSONObject jSONObject) throws JSONException {
        return new JSONObject(jSONObject.optString("custom"));
    }

    /* renamed from: c */
    static boolean m46662c(Bundle bundle) {
        return m46663d(bundle, "licon") || m46663d(bundle, "bicon") || bundle.getString("bg_img", (String) null) != null;
    }

    /* renamed from: d */
    private static boolean m46663d(Bundle bundle, String str) {
        String trim = bundle.getString(str, "").trim();
        return trim.startsWith("http://") || trim.startsWith("https://");
    }

    /* renamed from: e */
    static void m46664e(C8632v1 v1Var) {
        if (v1Var.mo28259m()) {
            C8338d3.m46492a(C8338d3.C8384r0.DEBUG, "Marking restored or disabled notifications as dismissed: " + v1Var.toString());
            C8475k3 n = C8475k3.m46963n(v1Var.mo28250d());
            ContentValues contentValues = new ContentValues();
            contentValues.put("dismissed", 1);
            n.mo27883a("notification", contentValues, "android_notification_id = " + v1Var.mo28247a(), (String[]) null);
            C8458i.m46863c(n, v1Var.mo28250d());
        }
    }

    /* renamed from: f */
    private static void m46665f(Bundle bundle) {
        JSONObject jSONObject;
        String str;
        if (bundle.containsKey("o")) {
            try {
                JSONObject jSONObject2 = new JSONObject(bundle.getString("custom"));
                if (jSONObject2.has("a")) {
                    jSONObject = jSONObject2.getJSONObject("a");
                } else {
                    jSONObject = new JSONObject();
                }
                JSONArray jSONArray = new JSONArray(bundle.getString("o"));
                bundle.remove("o");
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                    String string = jSONObject3.getString("n");
                    jSONObject3.remove("n");
                    if (jSONObject3.has("i")) {
                        str = jSONObject3.getString("i");
                        jSONObject3.remove("i");
                    } else {
                        str = string;
                    }
                    jSONObject3.put("id", str);
                    jSONObject3.put("text", string);
                    if (jSONObject3.has("p")) {
                        jSONObject3.put("icon", jSONObject3.getString("p"));
                        jSONObject3.remove("p");
                    }
                }
                jSONObject.put("actionButtons", jSONArray);
                jSONObject.put("actionId", "__DEFAULT__");
                if (!jSONObject2.has("a")) {
                    jSONObject2.put("a", jSONObject);
                }
                bundle.putString("custom", jSONObject2.toString());
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: g */
    static JSONArray m46666g(JSONObject jSONObject) {
        return new JSONArray().put(jSONObject);
    }

    /* renamed from: h */
    static void m46667h(Context context, Bundle bundle, C8416e eVar) {
        C8417f fVar = new C8417f();
        if (!C8623u1.m47744d(bundle)) {
            eVar.mo27486a(fVar);
            return;
        }
        fVar.mo27775f(true);
        m46665f(bundle);
        if (C8454h1.m46856c(context, bundle)) {
            fVar.mo27774e(true);
            eVar.mo27486a(fVar);
            return;
        }
        m46676q(context, bundle, fVar, new C8413b(fVar, eVar));
    }

    /* renamed from: i */
    private static void m46668i(C8632v1 v1Var) {
        if (!v1Var.mo28260n() && v1Var.mo28251e().has("collapse_key") && !"do_not_collapse".equals(v1Var.mo28251e().optString("collapse_key"))) {
            Cursor f = C8475k3.m46963n(v1Var.mo28250d()).mo27885f("notification", new String[]{"android_notification_id"}, "collapse_id = ? AND dismissed = 0 AND opened = 0 ", new String[]{v1Var.mo28251e().optString("collapse_key")}, (String) null, (String) null, (String) null);
            if (f.moveToFirst()) {
                v1Var.mo28252f().mo28096J(f.getInt(f.getColumnIndex("android_notification_id")));
            }
            f.close();
        }
    }

    /* renamed from: j */
    static void m46669j(Context context, C8465j jVar) {
        C8338d3.m46506d1(context);
        try {
            String e = jVar.mo27877e("json_payload");
            if (e == null) {
                C8338d3.C8384r0 r0Var = C8338d3.C8384r0.ERROR;
                C8338d3.m46492a(r0Var, "json_payload key is nonexistent from mBundle passed to ProcessFromFCMIntentService: " + jVar);
                return;
            }
            JSONObject jSONObject = new JSONObject(e);
            C8338d3.m46566s1(context, jSONObject, new C8412a(jVar.getBoolean("is_restoring", false), jSONObject, context, jVar.mo27878f("android_notif_id") ? jVar.mo27876d("android_notif_id").intValue() : 0, e, jVar.mo27874b("timestamp").longValue()));
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: k */
    static int m46670k(C8600s1 s1Var, boolean z) {
        return m46671l(s1Var, false, z);
    }

    /* renamed from: l */
    private static int m46671l(C8600s1 s1Var, boolean z, boolean z2) {
        C8338d3.C8384r0 r0Var = C8338d3.C8384r0.DEBUG;
        C8338d3.m46492a(r0Var, "Starting processJobForDisplay opened: " + z + " fromBackgroundLogic: " + z2);
        C8632v1 b = s1Var.mo28194b();
        m46668i(b);
        int intValue = b.mo28247a().intValue();
        boolean z3 = false;
        if (m46675p(b)) {
            b.mo28262p(true);
            if (!z2 || !C8338d3.m46418E2(b)) {
                z3 = C8581r.m47579n(b);
            } else {
                s1Var.mo28198g(false);
                C8338d3.m46465R(s1Var);
                return intValue;
            }
        }
        if (!b.mo28260n()) {
            m46673n(b, z, z3);
            OSNotificationWorkManager.m46145c(C8623u1.m47742b(s1Var.mo28194b().mo28251e()));
            C8338d3.m46481W0(b);
        }
        return intValue;
    }

    /* renamed from: m */
    static int m46672m(C8632v1 v1Var, boolean z) {
        return m46671l(new C8600s1(v1Var, v1Var.mo28260n(), true), false, z);
    }

    /* renamed from: n */
    static void m46673n(C8632v1 v1Var, boolean z, boolean z2) {
        m46674o(v1Var, z);
        if (!z2) {
            m46664e(v1Var);
            return;
        }
        String b = v1Var.mo28248b();
        OSReceiveReceiptController.m46149c().mo27535a(v1Var.mo28250d(), b);
        C8338d3.m46432I0().mo27964l(b);
    }

    /* renamed from: o */
    private static void m46674o(C8632v1 v1Var, boolean z) {
        C8338d3.C8384r0 r0Var = C8338d3.C8384r0.DEBUG;
        C8338d3.m46492a(r0Var, "Saving Notification job: " + v1Var.toString());
        Context d = v1Var.mo28250d();
        JSONObject e = v1Var.mo28251e();
        try {
            JSONObject b = m46661b(v1Var.mo28251e());
            C8475k3 n = C8475k3.m46963n(v1Var.mo28250d());
            int i = 1;
            if (v1Var.mo28259m()) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("dismissed", 1);
                n.mo27883a("notification", contentValues, "android_notification_id = " + v1Var.mo28247a(), (String[]) null);
                C8458i.m46863c(n, d);
            }
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("notification_id", b.optString("i"));
            if (e.has("grp")) {
                contentValues2.put("group_id", e.optString("grp"));
            }
            if (e.has("collapse_key") && !"do_not_collapse".equals(e.optString("collapse_key"))) {
                contentValues2.put("collapse_id", e.optString("collapse_key"));
            }
            if (!z) {
                i = 0;
            }
            contentValues2.put("opened", Integer.valueOf(i));
            if (!z) {
                contentValues2.put("android_notification_id", v1Var.mo28247a());
            }
            if (v1Var.mo28257k() != null) {
                contentValues2.put("title", v1Var.mo28257k().toString());
            }
            if (v1Var.mo28249c() != null) {
                contentValues2.put("message", v1Var.mo28249c().toString());
            }
            contentValues2.put("expire_time", Long.valueOf((e.optLong("google.sent_time", C8338d3.m46448M0().mo28281b()) / 1000) + ((long) e.optInt("google.ttl", 259200))));
            contentValues2.put("full_data", e.toString());
            n.mo27904t("notification", (String) null, contentValues2);
            C8338d3.m46492a(r0Var, "Notification saved values: " + contentValues2.toString());
            if (!z) {
                C8458i.m46863c(n, d);
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: p */
    private static boolean m46675p(C8632v1 v1Var) {
        return v1Var.mo28258l() || OSUtils.m46176I(v1Var.mo28251e().optString("alert"));
    }

    /* renamed from: q */
    private static void m46676q(Context context, Bundle bundle, C8417f fVar, C8415d dVar) {
        JSONObject a = m46660a(bundle);
        C8338d3.m46566s1(context, a, new C8414c(bundle.getBoolean("is_restoring", false), context, bundle, dVar, a, C8338d3.m46448M0().mo28281b() / 1000, Integer.parseInt(bundle.getString("pri", "0")) > 9, fVar));
    }
}
