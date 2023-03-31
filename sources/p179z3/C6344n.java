package p179z3;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: z3.n */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class C6344n extends C6321a {

    /* renamed from: e */
    private final C6353v f30543e;

    public C6344n(int i, String str, String str2, C6321a aVar, C6353v vVar) {
        super(i, str, str2, aVar);
        this.f30543e = vVar;
    }

    /* renamed from: e */
    public final JSONObject mo21637e() throws JSONException {
        JSONObject e = super.mo21637e();
        C6353v f = mo21713f();
        if (f == null) {
            e.put("Response Info", "null");
        } else {
            e.put("Response Info", f.mo21732i());
        }
        return e;
    }

    /* renamed from: f */
    public C6353v mo21713f() {
        return this.f30543e;
    }

    public String toString() {
        try {
            return mo21637e().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
