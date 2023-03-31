package com.google.firebase.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.content.C0681a;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import p124r.C5413a;

/* renamed from: com.google.firebase.iid.u */
/* compiled from: com.google.firebase:firebase-iid@@21.1.0 */
class C7990u {

    /* renamed from: a */
    final SharedPreferences f34524a;

    /* renamed from: b */
    final Context f34525b;

    /* renamed from: c */
    private final Map<String, Long> f34526c = new C5413a();

    /* renamed from: com.google.firebase.iid.u$a */
    /* compiled from: com.google.firebase:firebase-iid@@21.1.0 */
    static class C7991a {

        /* renamed from: d */
        private static final long f34527d = TimeUnit.DAYS.toMillis(7);

        /* renamed from: a */
        final String f34528a;

        /* renamed from: b */
        final String f34529b;

        /* renamed from: c */
        final long f34530c;

        private C7991a(String str, String str2, long j) {
            this.f34528a = str;
            this.f34529b = str2;
            this.f34530c = j;
        }

        /* renamed from: a */
        static String m44013a(String str, String str2, long j) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("token", str);
                jSONObject.put("appVersion", str2);
                jSONObject.put("timestamp", j);
                return jSONObject.toString();
            } catch (JSONException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(valueOf.length() + 24);
                sb.append("Failed to encode token: ");
                sb.append(valueOf);
                Log.w("FirebaseInstanceId", sb.toString());
                return null;
            }
        }

        /* renamed from: b */
        static String m44014b(C7991a aVar) {
            if (aVar == null) {
                return null;
            }
            return aVar.f34528a;
        }

        /* renamed from: d */
        static C7991a m44015d(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (!str.startsWith("{")) {
                return new C7991a(str, (String) null, 0);
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new C7991a(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
            } catch (JSONException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(valueOf.length() + 23);
                sb.append("Failed to parse token: ");
                sb.append(valueOf);
                Log.w("FirebaseInstanceId", sb.toString());
                return null;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo26544c(String str) {
            return System.currentTimeMillis() > this.f34530c + f34527d || !str.equals(this.f34529b);
        }
    }

    public C7990u(Context context) {
        this.f34525b = context;
        this.f34524a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        m44002a("com.google.android.gms.appid-no-backup");
    }

    /* renamed from: a */
    private void m44002a(String str) {
        File file = new File(C0681a.m3154j(this.f34525b), "com.google.android.gms.appid-no-backup");
        if (!file.exists()) {
            try {
                if (file.createNewFile() && !mo26541h()) {
                    Log.i("FirebaseInstanceId", "App restored, clearing state");
                    mo26538d();
                }
            } catch (IOException e) {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    String valueOf = String.valueOf(e.getMessage());
                    Log.d("FirebaseInstanceId", valueOf.length() != 0 ? "Error creating file in no backup dir: ".concat(valueOf) : new String("Error creating file in no backup dir: "));
                }
            }
        }
    }

    /* renamed from: b */
    static String m44003b(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 6);
        sb.append(str);
        sb.append("|S|cre");
        return sb.toString();
    }

    /* renamed from: c */
    private String m44004c(String str, String str2, String str3) {
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 4 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append("|T|");
        sb.append(str2);
        sb.append("|");
        sb.append(str3);
        return sb.toString();
    }

    /* renamed from: f */
    private long m44005f(String str) {
        String string = this.f34524a.getString(m44003b(str, "cre"), (String) null);
        if (string == null) {
            return 0;
        }
        try {
            return Long.parseLong(string);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    /* renamed from: k */
    private long m44006k(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f34524a.contains(m44003b(str, "cre"))) {
            return m44005f(str);
        }
        SharedPreferences.Editor edit = this.f34524a.edit();
        edit.putString(m44003b(str, "cre"), String.valueOf(currentTimeMillis));
        edit.commit();
        return currentTimeMillis;
    }

    /* renamed from: d */
    public synchronized void mo26538d() {
        this.f34526c.clear();
        this.f34524a.edit().clear().commit();
    }

    /* renamed from: e */
    public synchronized void mo26539e(String str, String str2, String str3) {
        String c = m44004c(str, str2, str3);
        SharedPreferences.Editor edit = this.f34524a.edit();
        edit.remove(c);
        edit.commit();
    }

    /* renamed from: g */
    public synchronized C7991a mo26540g(String str, String str2, String str3) {
        return C7991a.m44015d(this.f34524a.getString(m44004c(str, str2, str3), (String) null));
    }

    /* renamed from: h */
    public synchronized boolean mo26541h() {
        return this.f34524a.getAll().isEmpty();
    }

    /* renamed from: i */
    public synchronized void mo26542i(String str, String str2, String str3, String str4, String str5) {
        String a = C7991a.m44013a(str4, str5, System.currentTimeMillis());
        if (a != null) {
            SharedPreferences.Editor edit = this.f34524a.edit();
            edit.putString(m44004c(str, str2, str3), a);
            edit.commit();
        }
    }

    /* renamed from: j */
    public synchronized long mo26543j(String str) {
        long k;
        k = m44006k(str);
        this.f34526c.put(str, Long.valueOf(k));
        return k;
    }
}
