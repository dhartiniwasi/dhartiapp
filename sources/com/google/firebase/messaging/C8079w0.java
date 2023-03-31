package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.content.C0681a;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.firebase.messaging.w0 */
/* compiled from: Store */
class C8079w0 {

    /* renamed from: a */
    final SharedPreferences f34777a;

    /* renamed from: com.google.firebase.messaging.w0$a */
    /* compiled from: Store */
    static class C8080a {

        /* renamed from: d */
        private static final long f34778d = TimeUnit.DAYS.toMillis(7);

        /* renamed from: a */
        final String f34779a;

        /* renamed from: b */
        final String f34780b;

        /* renamed from: c */
        final long f34781c;

        private C8080a(String str, String str2, long j) {
            this.f34779a = str;
            this.f34780b = str2;
            this.f34781c = j;
        }

        /* renamed from: a */
        static String m44451a(String str, String str2, long j) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("token", str);
                jSONObject.put("appVersion", str2);
                jSONObject.put("timestamp", j);
                return jSONObject.toString();
            } catch (JSONException e) {
                Log.w("FirebaseMessaging", "Failed to encode token: " + e);
                return null;
            }
        }

        /* renamed from: c */
        static C8080a m44452c(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (!str.startsWith("{")) {
                return new C8080a(str, (String) null, 0);
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new C8080a(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
            } catch (JSONException e) {
                Log.w("FirebaseMessaging", "Failed to parse token: " + e);
                return null;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo26746b(String str) {
            return System.currentTimeMillis() > this.f34781c + f34778d || !str.equals(this.f34780b);
        }
    }

    public C8079w0(Context context) {
        this.f34777a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        m44444a(context, "com.google.android.gms.appid-no-backup");
    }

    /* renamed from: a */
    private void m44444a(Context context, String str) {
        File file = new File(C0681a.m3154j(context), str);
        if (!file.exists()) {
            try {
                if (file.createNewFile() && !mo26744f()) {
                    Log.i("FirebaseMessaging", "App restored, clearing state");
                    mo26741c();
                }
            } catch (IOException e) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e.getMessage());
                }
            }
        }
    }

    /* renamed from: b */
    private String m44445b(String str, String str2) {
        return str + "|T|" + str2 + "|" + "*";
    }

    /* renamed from: c */
    public synchronized void mo26741c() {
        this.f34777a.edit().clear().commit();
    }

    /* renamed from: d */
    public synchronized void mo26742d(String str, String str2) {
        String b = m44445b(str, str2);
        SharedPreferences.Editor edit = this.f34777a.edit();
        edit.remove(b);
        edit.commit();
    }

    /* renamed from: e */
    public synchronized C8080a mo26743e(String str, String str2) {
        return C8080a.m44452c(this.f34777a.getString(m44445b(str, str2), (String) null));
    }

    /* renamed from: f */
    public synchronized boolean mo26744f() {
        return this.f34777a.getAll().isEmpty();
    }

    /* renamed from: g */
    public synchronized void mo26745g(String str, String str2, String str3, String str4) {
        String a = C8080a.m44451a(str3, str4, System.currentTimeMillis());
        if (a != null) {
            SharedPreferences.Editor edit = this.f34777a.edit();
            edit.putString(m44445b(str, str2), a);
            edit.commit();
        }
    }
}
