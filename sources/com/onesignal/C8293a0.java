package com.onesignal;

import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onesignal.a0 */
/* compiled from: JSONUtils */
class C8293a0 {
    /* renamed from: a */
    static boolean m46255a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        if (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) {
            return false;
        }
        int i = 0;
        while (i < jSONArray.length()) {
            try {
                int i2 = 0;
                while (i2 < jSONArray2.length()) {
                    if (m46259e(jSONArray.get(i)).equals(m46259e(jSONArray2.get(i2)))) {
                        i++;
                    } else {
                        i2++;
                    }
                }
                return false;
            } catch (JSONException e) {
                e.printStackTrace();
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    static JSONObject m46256b(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, Set<String> set) {
        JSONObject jSONObject4;
        if (jSONObject == null) {
            return null;
        }
        if (jSONObject2 == null) {
            return jSONObject3;
        }
        Iterator<String> keys = jSONObject2.keys();
        if (jSONObject3 != null) {
            jSONObject4 = jSONObject3;
        } else {
            jSONObject4 = new JSONObject();
        }
        while (keys.hasNext()) {
            try {
                String next = keys.next();
                Object obj = jSONObject2.get(next);
                if (jSONObject.has(next)) {
                    if (obj instanceof JSONObject) {
                        String jSONObject5 = m46256b(jSONObject.getJSONObject(next), (JSONObject) obj, (jSONObject3 == null || !jSONObject3.has(next)) ? null : jSONObject3.getJSONObject(next), set).toString();
                        if (!jSONObject5.equals("{}")) {
                            jSONObject4.put(next, new JSONObject(jSONObject5));
                        }
                    } else if (obj instanceof JSONArray) {
                        m46258d(next, (JSONArray) obj, jSONObject.getJSONArray(next), jSONObject4);
                    } else if (set == null || !set.contains(next)) {
                        Object obj2 = jSONObject.get(next);
                        if (!obj.equals(obj2)) {
                            if (!(obj2 instanceof Number) || !(obj instanceof Number)) {
                                jSONObject4.put(next, obj);
                            } else if (((Number) obj2).doubleValue() != ((Number) obj).doubleValue()) {
                                jSONObject4.put(next, obj);
                            }
                        }
                    } else {
                        jSONObject4.put(next, obj);
                    }
                } else if (obj instanceof JSONObject) {
                    jSONObject4.put(next, new JSONObject(obj.toString()));
                } else if (obj instanceof JSONArray) {
                    m46258d(next, (JSONArray) obj, (JSONArray) null, jSONObject4);
                } else {
                    jSONObject4.put(next, obj);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return jSONObject4;
    }

    /* renamed from: c */
    static JSONObject m46257c(C8645x xVar, String str) {
        if (!xVar.mo28283a(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject e = xVar.mo28287e(str);
        Iterator<String> keys = e.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                Object obj = e.get(next);
                if (!"".equals(obj)) {
                    jSONObject.put(next, obj);
                }
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    /* renamed from: d */
    private static void m46258d(String str, JSONArray jSONArray, JSONArray jSONArray2, JSONObject jSONObject) throws JSONException {
        String str2;
        if (str.endsWith("_a") || str.endsWith("_d")) {
            jSONObject.put(str, jSONArray);
            return;
        }
        String f = m46260f(jSONArray);
        JSONArray jSONArray3 = new JSONArray();
        JSONArray jSONArray4 = new JSONArray();
        if (jSONArray2 == null) {
            str2 = null;
        } else {
            str2 = m46260f(jSONArray2);
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            String str3 = (String) jSONArray.get(i);
            if (jSONArray2 == null || !str2.contains(str3)) {
                jSONArray3.put(str3);
            }
        }
        if (jSONArray2 != null) {
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                String string = jSONArray2.getString(i2);
                if (!f.contains(string)) {
                    jSONArray4.put(string);
                }
            }
        }
        if (!jSONArray3.toString().equals("[]")) {
            jSONObject.put(str + "_a", jSONArray3);
        }
        if (!jSONArray4.toString().equals("[]")) {
            jSONObject.put(str + "_d", jSONArray4);
        }
    }

    /* renamed from: e */
    public static Object m46259e(Object obj) {
        Class<?> cls = obj.getClass();
        if (cls.equals(Integer.class)) {
            return Long.valueOf((long) ((Integer) obj).intValue());
        }
        return cls.equals(Float.class) ? Double.valueOf((double) ((Float) obj).floatValue()) : obj;
    }

    /* renamed from: f */
    static String m46260f(JSONArray jSONArray) {
        int i = 0;
        String str = "[";
        while (i < jSONArray.length()) {
            try {
                str = str + "\"" + jSONArray.getString(i) + "\"";
                i++;
            } catch (JSONException unused) {
            }
        }
        return str + "]";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001c, code lost:
        r1 = r3.group(0);
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.String m46261g(org.json.JSONObject r3) {
        /*
            java.lang.String r0 = r3.toString()
            java.lang.String r1 = "external_user_id"
            boolean r3 = r3.has(r1)
            if (r3 == 0) goto L_0x0033
            java.lang.String r3 = "(?<=\"external_user_id\":\").*?(?=\")"
            java.util.regex.Pattern r3 = java.util.regex.Pattern.compile(r3)
            java.util.regex.Matcher r3 = r3.matcher(r0)
            boolean r1 = r3.find()
            if (r1 == 0) goto L_0x0033
            r1 = 0
            java.lang.String r1 = r3.group(r1)
            if (r1 == 0) goto L_0x0033
            java.lang.String r0 = "\\/"
            java.lang.String r2 = "/"
            java.lang.String r0 = r1.replace(r0, r2)
            java.lang.String r0 = java.util.regex.Matcher.quoteReplacement(r0)
            java.lang.String r0 = r3.replaceAll(r0)
        L_0x0033:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.C8293a0.m46261g(org.json.JSONObject):java.lang.String");
    }
}
