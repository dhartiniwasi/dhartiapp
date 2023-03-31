package p293m7;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.p026firebaseauthapi.C3262e4;
import com.google.android.gms.internal.p026firebaseauthapi.C3709rm;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p033d5.C4141r;
import p054g5.C4410a;
import p067i5.C4689c;
import p124r.C5413a;

/* renamed from: m7.c0 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C11810c0 {

    /* renamed from: a */
    private static final C4410a f44479a = new C4410a("JSONParser", new String[0]);

    /* renamed from: a */
    static List m57200a(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONArray) {
                obj = m57200a((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = m57203d((JSONObject) obj);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    /* renamed from: b */
    public static Map m57201b(String str) {
        C4141r.m28217g(str);
        List d = C3262e4.m25464b('.').mo15981d(str);
        if (d.size() < 2) {
            f44479a.mo17930c("Invalid idToken ".concat(String.valueOf(str)), new Object[0]);
            return new HashMap();
        }
        try {
            Map c = m57202c(new String(C4689c.m30370b((String) d.get(1)), "UTF-8"));
            return c == null ? new HashMap() : c;
        } catch (UnsupportedEncodingException e) {
            f44479a.mo17929b("Unable to decode token", e, new Object[0]);
            return new HashMap();
        }
    }

    /* renamed from: c */
    public static Map m57202c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject != JSONObject.NULL) {
                return m57203d(jSONObject);
            }
            return null;
        } catch (Exception e) {
            Log.d("JSONParser", "Failed to parse JSONObject into Map.");
            throw new C3709rm(e);
        }
    }

    /* renamed from: d */
    static Map m57203d(JSONObject jSONObject) throws JSONException {
        C5413a aVar = new C5413a();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONArray) {
                obj = m57200a((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = m57203d((JSONObject) obj);
            }
            aVar.put(next, obj);
        }
        return aVar;
    }
}
