package p179z3;

import android.os.IBinder;
import org.json.JSONException;
import org.json.JSONObject;
import p060h4.C4623z2;

/* renamed from: z3.a */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public class C6321a {

    /* renamed from: a */
    private final int f30493a;

    /* renamed from: b */
    private final String f30494b;

    /* renamed from: c */
    private final String f30495c;

    /* renamed from: d */
    private final C6321a f30496d;

    public C6321a(int i, String str, String str2) {
        this(i, str, str2, (C6321a) null);
    }

    public C6321a(int i, String str, String str2, C6321a aVar) {
        this.f30493a = i;
        this.f30494b = str;
        this.f30495c = str2;
        this.f30496d = aVar;
    }

    /* renamed from: a */
    public int mo21633a() {
        return this.f30493a;
    }

    /* renamed from: b */
    public String mo21634b() {
        return this.f30495c;
    }

    /* renamed from: c */
    public String mo21635c() {
        return this.f30494b;
    }

    /* renamed from: d */
    public final C4623z2 mo21636d() {
        C4623z2 z2Var;
        if (this.f30496d == null) {
            z2Var = null;
        } else {
            C6321a aVar = this.f30496d;
            z2Var = new C4623z2(aVar.f30493a, aVar.f30494b, aVar.f30495c, (C4623z2) null, (IBinder) null);
        }
        return new C4623z2(this.f30493a, this.f30494b, this.f30495c, z2Var, (IBinder) null);
    }

    /* renamed from: e */
    public JSONObject mo21637e() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Code", this.f30493a);
        jSONObject.put("Message", this.f30494b);
        jSONObject.put("Domain", this.f30495c);
        C6321a aVar = this.f30496d;
        if (aVar == null) {
            jSONObject.put("Cause", "null");
        } else {
            jSONObject.put("Cause", aVar.mo21637e());
        }
        return jSONObject;
    }

    public String toString() {
        try {
            return mo21637e().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
