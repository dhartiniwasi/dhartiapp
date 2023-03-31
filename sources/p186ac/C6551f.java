package p186ac;

import java.nio.ByteBuffer;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* renamed from: ac.f */
/* compiled from: JSONMessageCodec */
public final class C6551f implements C6554i<Object> {

    /* renamed from: a */
    public static final C6551f f30997a = new C6551f();

    private C6551f() {
    }

    /* renamed from: a */
    public ByteBuffer mo22147a(Object obj) {
        if (obj == null) {
            return null;
        }
        Object a = C6553h.m38071a(obj);
        if (a instanceof String) {
            return C6571t.f31017b.mo22147a(JSONObject.quote((String) a));
        }
        return C6571t.f31017b.mo22147a(a.toString());
    }

    /* renamed from: b */
    public Object mo22148b(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        try {
            JSONTokener jSONTokener = new JSONTokener(C6571t.f31017b.mo22148b(byteBuffer));
            Object nextValue = jSONTokener.nextValue();
            if (!jSONTokener.more()) {
                return nextValue;
            }
            throw new IllegalArgumentException("Invalid JSON");
        } catch (JSONException e) {
            throw new IllegalArgumentException("Invalid JSON", e);
        }
    }
}
