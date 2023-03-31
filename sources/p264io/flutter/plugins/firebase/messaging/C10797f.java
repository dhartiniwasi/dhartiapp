package p264io.flutter.plugins.firebase.messaging;

import android.content.SharedPreferences;
import com.google.firebase.messaging.C8059o0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p261ic.C10592a;

/* renamed from: io.flutter.plugins.firebase.messaging.f */
/* compiled from: FlutterFirebaseMessagingStore */
public class C10797f {

    /* renamed from: c */
    private static C10797f f42209c;

    /* renamed from: a */
    private final String f42210a = ",";

    /* renamed from: b */
    private SharedPreferences f42211b;

    /* renamed from: b */
    public static C10797f m54004b() {
        if (f42209c == null) {
            f42209c = new C10797f();
        }
        return f42209c;
    }

    /* renamed from: c */
    private SharedPreferences m54005c() {
        if (this.f42211b == null) {
            this.f42211b = C10592a.m53190a().getSharedPreferences("io.flutter.plugins.firebase.messaging", 0);
        }
        return this.f42211b;
    }

    /* renamed from: f */
    private Map<String, Object> m54006f(JSONObject jSONObject) throws JSONException {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONArray) {
                obj = mo34420e((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = m54006f((JSONObject) obj);
            }
            hashMap.put(next, obj);
        }
        return hashMap;
    }

    /* renamed from: a */
    public Map<String, Object> mo34418a(String str) {
        String d = mo34419d(str, (String) null);
        if (d != null) {
            try {
                HashMap hashMap = new HashMap(1);
                Map<String, Object> f = m54006f(new JSONObject(d));
                f.put("to", str);
                hashMap.put("message", f);
                return hashMap;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    /* renamed from: d */
    public String mo34419d(String str, String str2) {
        return m54005c().getString(str, str2);
    }

    /* renamed from: e */
    public List<Object> mo34420e(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONArray) {
                obj = mo34420e((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = m54006f((JSONObject) obj);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    /* renamed from: g */
    public void mo34421g(String str) {
        m54005c().edit().remove(str).apply();
        String d = mo34419d("notification_ids", "");
        if (!d.isEmpty()) {
            mo34422h("notification_ids", d.replace(str + ",", ""));
        }
    }

    /* renamed from: h */
    public void mo34422h(String str, String str2) {
        m54005c().edit().putString(str, str2).apply();
    }

    /* renamed from: i */
    public void mo34423i(C8059o0 o0Var) {
        mo34422h(o0Var.mo26690L1(), new JSONObject(C10798g.m54018f(o0Var)).toString());
        String str = mo34419d("notification_ids", "") + o0Var.mo26690L1() + ",";
        ArrayList arrayList = new ArrayList(Arrays.asList(str.split(",")));
        if (arrayList.size() > 20) {
            String str2 = (String) arrayList.get(0);
            m54005c().edit().remove(str2).apply();
            str = str.replace(str2 + ",", "");
        }
        mo34422h("notification_ids", str);
    }
}
