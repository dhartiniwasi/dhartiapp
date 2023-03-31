package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class c13 {

    /* renamed from: a */
    private static WindowManager f7569a;

    /* renamed from: b */
    private static final String[] f7570b = {"x", "y", "width", "height"};

    /* renamed from: c */
    static float f7571c = Resources.getSystem().getDisplayMetrics().density;

    /* renamed from: a */
    public static JSONObject m10673a(int i, int i2, int i3, int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", (double) (((float) i) / f7571c));
            jSONObject.put("y", (double) (((float) i2) / f7571c));
            jSONObject.put("width", (double) (((float) i3) / f7571c));
            jSONObject.put("height", (double) (((float) i4) / f7571c));
        } catch (JSONException e) {
            d13.m11279a("Error with creating viewStateObject", e);
        }
        return jSONObject;
    }

    /* renamed from: b */
    public static void m10674b(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e) {
            d13.m11279a("Error with setting ad session id", e);
        }
    }

    /* renamed from: c */
    public static void m10675c(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
                jSONObject.put("childViews", optJSONArray);
            }
            optJSONArray.put(jSONObject2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: d */
    public static void m10676d(JSONObject jSONObject, h13 h13) {
        o03 a = h13.mo10713a();
        JSONArray jSONArray = new JSONArray();
        ArrayList b = h13.mo10714b();
        int size = b.size();
        for (int i = 0; i < size; i++) {
            jSONArray.put((String) b.get(i));
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            jSONObject.put("friendlyObstructionClass", a.mo12779d());
            jSONObject.put("friendlyObstructionPurpose", a.mo12776a());
            jSONObject.put("friendlyObstructionReason", a.mo12778c());
        } catch (JSONException e) {
            d13.m11279a("Error with setting friendly obstruction", e);
        }
    }

    /* renamed from: e */
    public static void m10677e(JSONObject jSONObject, Boolean bool) {
        try {
            jSONObject.put("hasWindowFocus", bool);
        } catch (JSONException e) {
            d13.m11279a("Error with setting not visible reason", e);
        }
    }

    /* renamed from: f */
    public static void m10678f(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (JSONException e) {
            d13.m11279a("Error with setting not visible reason", e);
        }
    }

    /* renamed from: g */
    public static void m10679g(Context context) {
        if (context != null) {
            f7571c = context.getResources().getDisplayMetrics().density;
            f7569a = (WindowManager) context.getSystemService("window");
        }
    }

    /* renamed from: h */
    public static void m10680h(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException e) {
            d13.m11279a("JSONException during JSONObject.put for name [" + str + "]", e);
        }
    }

    /* renamed from: i */
    public static void m10681i(JSONObject jSONObject) {
        float f;
        float f2 = 0.0f;
        if (f7569a != null) {
            Point point = new Point(0, 0);
            f7569a.getDefaultDisplay().getRealSize(point);
            float f3 = f7571c;
            f2 = ((float) point.x) / f3;
            f = ((float) point.y) / f3;
        } else {
            f = 0.0f;
        }
        try {
            jSONObject.put("width", (double) f2);
            jSONObject.put("height", (double) f);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: j */
    public static boolean m10682j(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject != null && jSONObject2 != null) {
            String[] strArr = f7570b;
            int i = 0;
            while (true) {
                if (i < 4) {
                    String str = strArr[i];
                    if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                        break;
                    }
                    i++;
                } else if (jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", "")) && Boolean.valueOf(jSONObject.optBoolean("hasWindowFocus")).equals(Boolean.valueOf(jSONObject2.optBoolean("hasWindowFocus")))) {
                    JSONArray optJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
                    JSONArray optJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
                    if (optJSONArray != null || optJSONArray2 != null) {
                        if (m10683k(optJSONArray, optJSONArray2)) {
                            int i2 = 0;
                            while (true) {
                                if (i2 < optJSONArray.length()) {
                                    if (!optJSONArray.optString(i2, "").equals(optJSONArray2.optString(i2, ""))) {
                                        break;
                                    }
                                    i2++;
                                } else {
                                    break;
                                }
                            }
                        }
                    }
                    JSONArray optJSONArray3 = jSONObject.optJSONArray("childViews");
                    JSONArray optJSONArray4 = jSONObject2.optJSONArray("childViews");
                    if (!(optJSONArray3 == null && optJSONArray4 == null)) {
                        if (m10683k(optJSONArray3, optJSONArray4)) {
                            int i3 = 0;
                            while (i3 < optJSONArray3.length()) {
                                if (m10682j(optJSONArray3.optJSONObject(i3), optJSONArray4.optJSONObject(i3))) {
                                    i3++;
                                }
                            }
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: k */
    private static boolean m10683k(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }
}
