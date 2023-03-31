package com.onesignal.flutter;

import android.util.Log;
import com.onesignal.C8295a2;
import com.onesignal.C8324c2;
import com.onesignal.C8419f2;
import com.onesignal.C8449g2;
import com.onesignal.C8546p0;
import com.onesignal.C8575q1;
import com.onesignal.C8579q2;
import com.onesignal.C8585r1;
import com.onesignal.C8609t0;
import com.onesignal.C8622u0;
import com.onesignal.C8640w0;
import com.onesignal.C8646x0;
import com.onesignal.C8685z1;
import com.onesignal.OSSubscriptionState;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onesignal.flutter.f */
/* compiled from: OneSignalSerializer */
class C8443f {

    /* renamed from: com.onesignal.flutter.f$a */
    /* compiled from: OneSignalSerializer */
    static /* synthetic */ class C8444a {

        /* renamed from: a */
        static final /* synthetic */ int[] f35644a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.onesignal.r1$a[] r0 = com.onesignal.C8585r1.C8586a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f35644a = r0
                com.onesignal.r1$a r1 = com.onesignal.C8585r1.C8586a.Opened     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f35644a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onesignal.r1$a r1 = com.onesignal.C8585r1.C8586a.ActionTaken     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onesignal.flutter.C8443f.C8444a.<clinit>():void");
        }
    }

    /* renamed from: a */
    private static HashMap<String, Object> m46788a(C8575q1.C8577b bVar) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("image", bVar.mo28150e());
        hashMap.put("bodyTextColor", bVar.mo28149d());
        hashMap.put("titleTextColor", bVar.mo28151f());
        return hashMap;
    }

    /* renamed from: b */
    static HashMap<String, Object> m46789b(C8546p0 p0Var) {
        HashMap<String, Object> hashMap = new HashMap<>();
        if (p0Var == null) {
            return hashMap;
        }
        hashMap.put("hasNotificationPermission", Boolean.valueOf(p0Var.mo28060a()));
        hashMap.put("pushDisabled", Boolean.valueOf(p0Var.mo28068i()));
        hashMap.put("subscribed", Boolean.valueOf(p0Var.mo28070k()));
        hashMap.put("emailSubscribed", Boolean.valueOf(p0Var.mo28067h()));
        hashMap.put("smsSubscribed", Boolean.valueOf(p0Var.mo28069j()));
        hashMap.put("userId", p0Var.mo28066g());
        hashMap.put("pushToken", p0Var.mo28063d());
        hashMap.put("emailUserId", p0Var.mo28062c());
        hashMap.put("emailAddress", p0Var.mo28061b());
        hashMap.put("smsUserId", p0Var.mo28065f());
        hashMap.put("smsNumber", p0Var.mo28064e());
        return hashMap;
    }

    /* renamed from: c */
    static HashMap<String, Object> m46790c(C8622u0 u0Var) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("to", m46791d(u0Var.mo28235b()));
        hashMap.put("from", m46791d(u0Var.mo28234a()));
        return hashMap;
    }

    /* renamed from: d */
    private static HashMap<String, Object> m46791d(C8609t0 t0Var) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("emailUserId", t0Var.mo28212d());
        hashMap.put("emailAddress", t0Var.mo28210c());
        hashMap.put("isSubscribed", Boolean.valueOf(t0Var.mo28214f()));
        return hashMap;
    }

    /* renamed from: e */
    static HashMap<String, Object> m46792e(C8646x0 x0Var) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("click_name", x0Var.mo28293c());
        hashMap.put("click_url", x0Var.mo28294d());
        hashMap.put("first_click", Boolean.valueOf(x0Var.mo28299i()));
        hashMap.put("closes_message", Boolean.valueOf(x0Var.mo28291a()));
        return hashMap;
    }

    /* renamed from: f */
    static HashMap<String, Object> m46793f(C8640w0 w0Var) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("message_id", w0Var.mo28274a());
        return hashMap;
    }

    /* renamed from: g */
    private static List<Object> m46794g(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONArray) {
                obj = m46794g((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = m46795h((JSONObject) obj);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    /* renamed from: h */
    static HashMap<String, Object> m46795h(JSONObject jSONObject) throws JSONException {
        HashMap<String, Object> hashMap = new HashMap<>();
        if (!(jSONObject == null || jSONObject == JSONObject.NULL)) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!jSONObject.isNull(next)) {
                    Object obj = jSONObject.get(next);
                    if (obj instanceof JSONArray) {
                        obj = m46794g((JSONArray) obj);
                    } else if (obj instanceof JSONObject) {
                        obj = m46795h((JSONObject) obj);
                    }
                    hashMap.put(next, obj);
                }
            }
        }
        return hashMap;
    }

    /* renamed from: i */
    private static HashMap<String, Object> m46796i(C8585r1 r1Var) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("id", r1Var.mo28184a());
        int i = C8444a.f35644a[r1Var.mo28185b().ordinal()];
        if (i == 1) {
            hashMap.put("type", 0);
        } else if (i == 2) {
            hashMap.put("type", 1);
        }
        return hashMap;
    }

    /* renamed from: j */
    static HashMap<String, Object> m46797j(C8685z1 z1Var) throws JSONException {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("notification", m46799l(z1Var.mo28360e()));
        hashMap.put("action", m46796i(z1Var.mo28359d()));
        return hashMap;
    }

    /* renamed from: k */
    static HashMap<String, Object> m46798k(C8295a2 a2Var) throws JSONException {
        return m46799l(a2Var.mo27591c());
    }

    /* renamed from: l */
    static HashMap<String, Object> m46799l(C8575q1 q1Var) throws JSONException {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("androidNotificationId", Integer.valueOf(q1Var.mo28119f()));
        if (q1Var.mo28131n() != null && !q1Var.mo28131n().isEmpty()) {
            JSONArray jSONArray = new JSONArray();
            for (C8575q1 j0 : q1Var.mo28131n()) {
                jSONArray.put(j0.mo28127j0());
            }
            hashMap.put("groupedNotifications", jSONArray.toString());
        }
        hashMap.put("notificationId", q1Var.mo28137t());
        hashMap.put("title", q1Var.mo28091C());
        if (q1Var.mo28125i() != null) {
            hashMap.put("body", q1Var.mo28125i());
        }
        if (q1Var.mo28142x() != null) {
            hashMap.put("smallIcon", q1Var.mo28142x());
        }
        if (q1Var.mo28132o() != null) {
            hashMap.put("largeIcon", q1Var.mo28132o());
        }
        if (q1Var.mo28123h() != null) {
            hashMap.put("bigPicture", q1Var.mo28123h());
        }
        if (q1Var.mo28143y() != null) {
            hashMap.put("smallIconAccentColor", q1Var.mo28143y());
        }
        if (q1Var.mo28133p() != null) {
            hashMap.put("launchUrl", q1Var.mo28133p());
        }
        if (q1Var.mo28144z() != null) {
            hashMap.put("sound", q1Var.mo28144z());
        }
        if (q1Var.mo28134q() != null) {
            hashMap.put("ledColor", q1Var.mo28134q());
        }
        hashMap.put("lockScreenVisibility", Integer.valueOf(q1Var.mo28135r()));
        if (q1Var.mo28129l() != null) {
            hashMap.put("groupKey", q1Var.mo28129l());
        }
        if (q1Var.mo28130m() != null) {
            hashMap.put("groupMessage", q1Var.mo28130m());
        }
        if (q1Var.mo28128k() != null) {
            hashMap.put("fromProjectNumber", q1Var.mo28128k());
        }
        if (q1Var.mo28126j() != null) {
            hashMap.put("collapseId", q1Var.mo28126j());
        }
        hashMap.put("priority", Integer.valueOf(q1Var.mo28139u()));
        if (q1Var.mo28117e() != null && q1Var.mo28117e().length() > 0) {
            hashMap.put("additionalData", m46795h(q1Var.mo28117e()));
        }
        if (q1Var.mo28115d() != null && !q1Var.mo28115d().isEmpty()) {
            ArrayList arrayList = new ArrayList();
            List<C8575q1.C8576a> d = q1Var.mo28115d();
            for (int i = 0; i < d.size(); i++) {
                C8575q1.C8576a aVar = d.get(i);
                HashMap hashMap2 = new HashMap();
                hashMap2.put("id", aVar.mo28146e());
                hashMap2.put("text", aVar.mo28147f());
                hashMap2.put("icon", aVar.mo28145d());
                arrayList.add(hashMap2);
            }
            hashMap.put("buttons", arrayList);
        }
        if (q1Var.mo28121g() != null) {
            hashMap.put("backgroundImageLayout", m46788a(q1Var.mo28121g()));
        }
        hashMap.put("rawPayload", q1Var.mo28140v());
        Log.d("onesignal", "Created json raw payload: " + hashMap.toString());
        return hashMap;
    }

    /* renamed from: m */
    static HashMap<String, Object> m46800m(C8324c2 c2Var) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("session", c2Var.mo27660d().toString());
        if (c2Var.mo27659c() == null) {
            hashMap.put("notification_ids", new JSONArray().toString());
        } else {
            hashMap.put("notification_ids", c2Var.mo27659c().toString());
        }
        hashMap.put("id", c2Var.mo27658b());
        hashMap.put("timestamp", Long.valueOf(c2Var.mo27661e()));
        hashMap.put("weight", String.valueOf(c2Var.mo27663f()));
        return hashMap;
    }

    /* renamed from: n */
    static HashMap m46801n(C8449g2 g2Var) {
        HashMap hashMap = new HashMap();
        hashMap.put("to", m46802o(g2Var.mo27809b()));
        hashMap.put("from", m46802o(g2Var.mo27808a()));
        return hashMap;
    }

    /* renamed from: o */
    private static HashMap<String, Object> m46802o(C8419f2 f2Var) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("areNotificationsEnabled", Boolean.valueOf(f2Var.mo27781a()));
        return hashMap;
    }

    /* renamed from: p */
    static HashMap<String, Object> m46803p(C8579q2 q2Var) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("to", m46804q(q2Var.mo28181b()));
        hashMap.put("from", m46804q(q2Var.mo28180a()));
        return hashMap;
    }

    /* renamed from: q */
    private static HashMap<String, Object> m46804q(OSSubscriptionState oSSubscriptionState) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("isSubscribed", Boolean.valueOf(oSSubscriptionState.mo27549f()));
        hashMap.put("isPushDisabled", Boolean.valueOf(oSSubscriptionState.mo27548e()));
        hashMap.put("pushToken", oSSubscriptionState.mo27544c());
        hashMap.put("userId", oSSubscriptionState.mo27547d());
        return hashMap;
    }
}
