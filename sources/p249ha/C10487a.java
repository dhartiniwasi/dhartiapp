package p249ha;

import kotlin.jvm.internal.C11669k;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ha.a */
/* compiled from: OSInfluence.kt */
public final class C10487a {

    /* renamed from: a */
    private C10490c f41528a;

    /* renamed from: b */
    private C10488b f41529b;

    /* renamed from: c */
    private JSONArray f41530c;

    public C10487a(String str) throws JSONException {
        C11669k.m56787e(str, "jsonString");
        JSONObject jSONObject = new JSONObject(str);
        String string = jSONObject.getString("influence_channel");
        String string2 = jSONObject.getString("influence_type");
        String string3 = jSONObject.getString("influence_ids");
        this.f41529b = C10488b.f41534e.mo33621a(string);
        this.f41528a = C10490c.f41541f.mo33627a(string2);
        C11669k.m56786d(string3, "ids");
        this.f41530c = string3.length() == 0 ? null : new JSONArray(string3);
    }

    /* renamed from: a */
    public final C10487a mo33609a() {
        return new C10487a(this.f41529b, this.f41528a, this.f41530c);
    }

    /* renamed from: b */
    public final JSONArray mo33610b() {
        return this.f41530c;
    }

    /* renamed from: c */
    public final C10488b mo33611c() {
        return this.f41529b;
    }

    /* renamed from: d */
    public final C10490c mo33612d() {
        return this.f41528a;
    }

    /* renamed from: e */
    public final void mo33613e(JSONArray jSONArray) {
        this.f41530c = jSONArray;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || (!C11669k.m56783a(C10487a.class, obj.getClass()))) {
            return false;
        }
        C10487a aVar = (C10487a) obj;
        if (this.f41529b == aVar.f41529b && this.f41528a == aVar.f41528a) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final void mo33615f(C10490c cVar) {
        C11669k.m56787e(cVar, "<set-?>");
        this.f41528a = cVar;
    }

    /* renamed from: g */
    public final String mo33616g() throws JSONException {
        JSONObject put = new JSONObject().put("influence_channel", this.f41529b.toString()).put("influence_type", this.f41528a.toString());
        JSONArray jSONArray = this.f41530c;
        String jSONObject = put.put("influence_ids", jSONArray != null ? String.valueOf(jSONArray) : "").toString();
        C11669k.m56786d(jSONObject, "JSONObject()\n           …)\n            .toString()");
        return jSONObject;
    }

    public int hashCode() {
        return (this.f41529b.hashCode() * 31) + this.f41528a.hashCode();
    }

    public String toString() {
        return "SessionInfluence{influenceChannel=" + this.f41529b + ", influenceType=" + this.f41528a + ", ids=" + this.f41530c + '}';
    }

    public C10487a(C10488b bVar, C10490c cVar, JSONArray jSONArray) {
        C11669k.m56787e(bVar, "influenceChannel");
        C11669k.m56787e(cVar, "influenceType");
        this.f41529b = bVar;
        this.f41528a = cVar;
        this.f41530c = jSONArray;
    }
}
