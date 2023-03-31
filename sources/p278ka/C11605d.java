package p278ka;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ka.d */
/* compiled from: OSOutcomeSource.kt */
public final class C11605d {

    /* renamed from: a */
    private C11606e f44146a;

    /* renamed from: b */
    private C11606e f44147b;

    public C11605d(C11606e eVar, C11606e eVar2) {
        this.f44146a = eVar;
        this.f44147b = eVar2;
    }

    /* renamed from: a */
    public final C11606e mo35764a() {
        return this.f44146a;
    }

    /* renamed from: b */
    public final C11606e mo35765b() {
        return this.f44147b;
    }

    /* renamed from: c */
    public final C11605d mo35766c(C11606e eVar) {
        this.f44146a = eVar;
        return this;
    }

    /* renamed from: d */
    public final C11605d mo35767d(C11606e eVar) {
        this.f44147b = eVar;
        return this;
    }

    /* renamed from: e */
    public final JSONObject mo35768e() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        C11606e eVar = this.f44146a;
        if (eVar != null) {
            jSONObject.put("direct", eVar.mo35774e());
        }
        C11606e eVar2 = this.f44147b;
        if (eVar2 != null) {
            jSONObject.put("indirect", eVar2.mo35774e());
        }
        return jSONObject;
    }

    public String toString() {
        return "OSOutcomeSource{directBody=" + this.f44146a + ", indirectBody=" + this.f44147b + '}';
    }
}
