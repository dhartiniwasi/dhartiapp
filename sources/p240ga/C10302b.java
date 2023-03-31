package p240ga;

import com.onesignal.C8547p1;
import com.onesignal.C8642w2;
import kotlin.jvm.internal.C11669k;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p243gd.C10349s;
import p249ha.C10487a;
import p249ha.C10488b;
import p249ha.C10490c;

/* renamed from: ga.b */
/* compiled from: OSInAppMessageTracker.kt */
public final class C10302b extends C10301a {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10302b(C10303c cVar, C8547p1 p1Var, C8642w2 w2Var) {
        super(cVar, p1Var, w2Var);
        C11669k.m56787e(cVar, "dataRepository");
        C11669k.m56787e(p1Var, "logger");
        C11669k.m56787e(w2Var, "timeProvider");
    }

    /* renamed from: a */
    public void mo33100a(JSONObject jSONObject, C10487a aVar) {
        C11669k.m56787e(jSONObject, "jsonObject");
        C11669k.m56787e(aVar, "influence");
    }

    /* renamed from: b */
    public void mo33101b() {
        C10490c k = mo33112k();
        if (k == null) {
            k = C10490c.UNATTRIBUTED;
        }
        C10303c f = mo33106f();
        if (k == C10490c.DIRECT) {
            k = C10490c.INDIRECT;
        }
        f.mo33125a(k);
    }

    /* renamed from: c */
    public int mo33102c() {
        return mo33106f().mo33131g();
    }

    /* renamed from: d */
    public C10488b mo33103d() {
        return C10488b.IAM;
    }

    /* renamed from: h */
    public String mo33108h() {
        return "iam_id";
    }

    /* renamed from: i */
    public int mo33110i() {
        return mo33106f().mo33130f();
    }

    /* renamed from: l */
    public JSONArray mo33113l() throws JSONException {
        return mo33106f().mo33132h();
    }

    /* renamed from: m */
    public JSONArray mo33114m(String str) {
        try {
            JSONArray l = mo33113l();
            try {
                JSONArray jSONArray = new JSONArray();
                int length = l.length();
                for (int i = 0; i < length; i++) {
                    if (!C11669k.m56783a(str, l.getJSONObject(i).getString(mo33108h()))) {
                        jSONArray.put(l.getJSONObject(i));
                    }
                }
                return jSONArray;
            } catch (JSONException e) {
                mo33116o().mo28015c("Generating tracker lastChannelObjectReceived get JSONObject ", e);
                return l;
            }
        } catch (JSONException e2) {
            mo33116o().mo28015c("Generating IAM tracker getLastChannelObjects JSONObject ", e2);
            return new JSONArray();
        }
    }

    /* renamed from: p */
    public void mo33117p() {
        C10490c e = mo33106f().mo33129e();
        if (e.mo33625j()) {
            mo33123x(mo33115n());
        }
        C10349s sVar = C10349s.f40964a;
        mo33124y(e);
        C8547p1 o = mo33116o();
        o.mo28016d("OneSignal InAppMessageTracker initInfluencedTypeFromCache: " + this);
    }

    /* renamed from: u */
    public void mo33120u(JSONArray jSONArray) {
        C11669k.m56787e(jSONArray, "channelObjects");
        mo33106f().mo33140p(jSONArray);
    }
}
