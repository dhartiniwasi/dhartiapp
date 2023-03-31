package p186ac;

import java.util.Map;
import org.json.JSONObject;

/* renamed from: ac.j */
/* compiled from: MethodCall */
public final class C6555j {

    /* renamed from: a */
    public final String f30999a;

    /* renamed from: b */
    public final Object f31000b;

    public C6555j(String str, Object obj) {
        this.f30999a = str;
        this.f31000b = obj;
    }

    /* renamed from: a */
    public <T> T mo22156a(String str) {
        Object obj = this.f31000b;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Map) {
            return ((Map) obj).get(str);
        }
        if (obj instanceof JSONObject) {
            return ((JSONObject) obj).opt(str);
        }
        throw new ClassCastException();
    }

    /* renamed from: b */
    public <T> T mo22157b() {
        return this.f31000b;
    }

    /* renamed from: c */
    public boolean mo22158c(String str) {
        Object obj = this.f31000b;
        if (obj == null) {
            return false;
        }
        if (obj instanceof Map) {
            return ((Map) obj).containsKey(str);
        }
        if (obj instanceof JSONObject) {
            return ((JSONObject) obj).has(str);
        }
        throw new ClassCastException();
    }
}
