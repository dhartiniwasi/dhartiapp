package p186ac;

import java.nio.ByteBuffer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ac.g */
/* compiled from: JSONMethodCodec */
public final class C6552g implements C6562l {

    /* renamed from: a */
    public static final C6552g f30998a = new C6552g();

    private C6552g() {
    }

    /* renamed from: a */
    public C6555j mo22149a(ByteBuffer byteBuffer) {
        try {
            Object b = C6551f.f30997a.mo22148b(byteBuffer);
            if (b instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) b;
                Object obj = jSONObject.get("method");
                Object g = mo22155g(jSONObject.opt("args"));
                if (obj instanceof String) {
                    return new C6555j((String) obj, g);
                }
            }
            throw new IllegalArgumentException("Invalid method call: " + b);
        } catch (JSONException e) {
            throw new IllegalArgumentException("Invalid JSON", e);
        }
    }

    /* renamed from: b */
    public ByteBuffer mo22150b(Object obj) {
        return C6551f.f30997a.mo22147a(new JSONArray().put(C6553h.m38071a(obj)));
    }

    /* renamed from: c */
    public ByteBuffer mo22151c(String str, String str2, Object obj, String str3) {
        return C6551f.f30997a.mo22147a(new JSONArray().put(str).put(C6553h.m38071a(str2)).put(C6553h.m38071a(obj)).put(C6553h.m38071a(str3)));
    }

    /* renamed from: d */
    public ByteBuffer mo22152d(String str, String str2, Object obj) {
        return C6551f.f30997a.mo22147a(new JSONArray().put(str).put(C6553h.m38071a(str2)).put(C6553h.m38071a(obj)));
    }

    /* renamed from: e */
    public ByteBuffer mo22153e(C6555j jVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("method", jVar.f30999a);
            jSONObject.put("args", C6553h.m38071a(jVar.f31000b));
            return C6551f.f30997a.mo22147a(jSONObject);
        } catch (JSONException e) {
            throw new IllegalArgumentException("Invalid JSON", e);
        }
    }

    /* renamed from: f */
    public Object mo22154f(ByteBuffer byteBuffer) {
        try {
            Object b = C6551f.f30997a.mo22148b(byteBuffer);
            if (b instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) b;
                if (jSONArray.length() == 1) {
                    return mo22155g(jSONArray.opt(0));
                }
                if (jSONArray.length() == 3) {
                    Object obj = jSONArray.get(0);
                    Object g = mo22155g(jSONArray.opt(1));
                    Object g2 = mo22155g(jSONArray.opt(2));
                    if ((obj instanceof String) && (g == null || (g instanceof String))) {
                        throw new C6550e((String) obj, (String) g, g2);
                    }
                }
            }
            throw new IllegalArgumentException("Invalid envelope: " + b);
        } catch (JSONException e) {
            throw new IllegalArgumentException("Invalid JSON", e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public Object mo22155g(Object obj) {
        if (obj == JSONObject.NULL) {
            return null;
        }
        return obj;
    }
}
