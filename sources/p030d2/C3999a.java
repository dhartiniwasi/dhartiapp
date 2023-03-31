package p030d2;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p161w3.C5953m0;
import p161w3.C5961r;

/* renamed from: d2.a */
/* compiled from: ClearKeyUtil */
final class C3999a {
    /* renamed from: a */
    public static byte[] m27636a(byte[] bArr) {
        if (C5953m0.f29110a >= 27) {
            return bArr;
        }
        return C5953m0.m35145m0(m27638c(C5953m0.m35074D(bArr)));
    }

    /* renamed from: b */
    public static byte[] m27637b(byte[] bArr) {
        if (C5953m0.f29110a >= 27) {
            return bArr;
        }
        try {
            JSONObject jSONObject = new JSONObject(C5953m0.m35074D(bArr));
            StringBuilder sb = new StringBuilder("{\"keys\":[");
            JSONArray jSONArray = jSONObject.getJSONArray("keys");
            for (int i = 0; i < jSONArray.length(); i++) {
                if (i != 0) {
                    sb.append(",");
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                sb.append("{\"k\":\"");
                sb.append(m27639d(jSONObject2.getString("k")));
                sb.append("\",\"kid\":\"");
                sb.append(m27639d(jSONObject2.getString("kid")));
                sb.append("\",\"kty\":\"");
                sb.append(jSONObject2.getString("kty"));
                sb.append("\"}");
            }
            sb.append("]}");
            return C5953m0.m35145m0(sb.toString());
        } catch (JSONException e) {
            C5961r.m35210d("ClearKeyUtil", "Failed to adjust response data: " + C5953m0.m35074D(bArr), e);
            return bArr;
        }
    }

    /* renamed from: c */
    private static String m27638c(String str) {
        return str.replace('+', '-').replace('/', '_');
    }

    /* renamed from: d */
    private static String m27639d(String str) {
        return str.replace('-', '+').replace('_', '/');
    }
}
