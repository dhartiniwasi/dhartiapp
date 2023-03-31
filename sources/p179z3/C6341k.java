package p179z3;

import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;
import p060h4.C4595u4;
import p060h4.C4623z2;

/* renamed from: z3.k */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class C6341k {

    /* renamed from: a */
    private final C4595u4 f30540a;

    /* renamed from: b */
    private final C6321a f30541b;

    private C6341k(C4595u4 u4Var) {
        this.f30540a = u4Var;
        C4623z2 z2Var = u4Var.f25035c;
        this.f30541b = z2Var == null ? null : z2Var.mo18186I1();
    }

    /* renamed from: i */
    public static C6341k m37327i(C4595u4 u4Var) {
        if (u4Var != null) {
            return new C6341k(u4Var);
        }
        return null;
    }

    /* renamed from: a */
    public C6321a mo21685a() {
        return this.f30541b;
    }

    /* renamed from: b */
    public String mo21686b() {
        return this.f30540a.f25038f;
    }

    /* renamed from: c */
    public String mo21687c() {
        return this.f30540a.f25040h;
    }

    /* renamed from: d */
    public String mo21688d() {
        return this.f30540a.f25039g;
    }

    /* renamed from: e */
    public String mo21689e() {
        return this.f30540a.f25037e;
    }

    /* renamed from: f */
    public String mo21690f() {
        return this.f30540a.f25033a;
    }

    /* renamed from: g */
    public Bundle mo21691g() {
        return this.f30540a.f25036d;
    }

    /* renamed from: h */
    public long mo21692h() {
        return this.f30540a.f25034b;
    }

    /* renamed from: j */
    public final JSONObject mo21693j() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Adapter", this.f30540a.f25033a);
        jSONObject.put("Latency", this.f30540a.f25034b);
        String e = mo21689e();
        if (e == null) {
            jSONObject.put("Ad Source Name", "null");
        } else {
            jSONObject.put("Ad Source Name", e);
        }
        String b = mo21686b();
        if (b == null) {
            jSONObject.put("Ad Source ID", "null");
        } else {
            jSONObject.put("Ad Source ID", b);
        }
        String d = mo21688d();
        if (d == null) {
            jSONObject.put("Ad Source Instance Name", "null");
        } else {
            jSONObject.put("Ad Source Instance Name", d);
        }
        String c = mo21687c();
        if (c == null) {
            jSONObject.put("Ad Source Instance ID", "null");
        } else {
            jSONObject.put("Ad Source Instance ID", c);
        }
        JSONObject jSONObject2 = new JSONObject();
        for (String str : this.f30540a.f25036d.keySet()) {
            jSONObject2.put(str, this.f30540a.f25036d.get(str));
        }
        jSONObject.put("Credentials", jSONObject2);
        C6321a aVar = this.f30541b;
        if (aVar == null) {
            jSONObject.put("Ad Error", "null");
        } else {
            jSONObject.put("Ad Error", aVar.mo21637e());
        }
        return jSONObject;
    }

    public String toString() {
        try {
            return mo21693j().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
