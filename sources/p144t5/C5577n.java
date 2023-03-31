package p144t5;

import android.app.Application;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: t5.n */
/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
public final class C5577n {

    /* renamed from: a */
    private final Application f28164a;

    /* renamed from: b */
    private final SharedPreferences f28165b;

    /* renamed from: c */
    private final Set<String> f28166c;

    C5577n(Application application) {
        this.f28164a = application;
        SharedPreferences sharedPreferences = application.getSharedPreferences("__GOOGLE_FUNDING_CHOICE_SDK_INTERNAL__", 0);
        this.f28165b = sharedPreferences;
        this.f28166c = new HashSet(sharedPreferences.getStringSet("written_values", Collections.emptySet()));
    }

    /* renamed from: a */
    public final int mo19879a() {
        return this.f28165b.getInt("consent_status", 0);
    }

    /* renamed from: b */
    public final Map<String, String> mo19880b() {
        String str;
        String str2;
        String str3;
        String str4;
        Application application = this.f28164a;
        Set<String> stringSet = this.f28165b.getStringSet("stored_info", Collections.emptySet());
        HashMap hashMap = new HashMap();
        for (String next : stringSet) {
            C5529a1 a = C5541d1.m33599a(application, next);
            if (a == null) {
                String valueOf = String.valueOf(next);
                if (valueOf.length() != 0) {
                    str4 = "Fetching request info: failed for key: ".concat(valueOf);
                } else {
                    str4 = new String("Fetching request info: failed for key: ");
                }
                Log.d("UserMessagingPlatform", str4);
            } else {
                Object obj = application.getSharedPreferences(a.f28052a, 0).getAll().get(a.f28053b);
                if (obj == null) {
                    String valueOf2 = String.valueOf(next);
                    if (valueOf2.length() != 0) {
                        str3 = "Stored info not exists: ".concat(valueOf2);
                    } else {
                        str3 = new String("Stored info not exists: ");
                    }
                    Log.d("UserMessagingPlatform", str3);
                } else {
                    if (obj instanceof Boolean) {
                        str = true != ((Boolean) obj).booleanValue() ? "0" : "1";
                    } else if (obj instanceof Number) {
                        str = obj.toString();
                    } else if (obj instanceof String) {
                        str = (String) obj;
                    } else {
                        String valueOf3 = String.valueOf(next);
                        if (valueOf3.length() != 0) {
                            str2 = "Failed to fetch stored info: ".concat(valueOf3);
                        } else {
                            str2 = new String("Failed to fetch stored info: ");
                        }
                        Log.d("UserMessagingPlatform", str2);
                    }
                    hashMap.put(next, str);
                }
            }
        }
        return hashMap;
    }

    /* renamed from: c */
    public final Set<String> mo19881c() {
        return this.f28166c;
    }

    /* renamed from: d */
    public final void mo19882d() {
        C5541d1.m33600b(this.f28164a, this.f28166c);
        this.f28166c.clear();
        this.f28165b.edit().remove("stored_info").remove("consent_status").remove("consent_type").apply();
    }

    /* renamed from: e */
    public final void mo19883e() {
        this.f28165b.edit().putStringSet("written_values", this.f28166c).apply();
    }

    /* renamed from: f */
    public final void mo19884f(int i) {
        this.f28165b.edit().putInt("consent_status", i).apply();
    }

    /* renamed from: g */
    public final void mo19885g(Set<String> set) {
        this.f28165b.edit().putStringSet("stored_info", set).apply();
    }
}
