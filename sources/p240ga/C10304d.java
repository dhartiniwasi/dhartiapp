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

/* renamed from: ga.d */
/* compiled from: OSNotificationTracker.kt */
public final class C10304d extends C10301a {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10304d(C10303c cVar, C8547p1 p1Var, C8642w2 w2Var) {
        super(cVar, p1Var, w2Var);
        C11669k.m56787e(cVar, "dataRepository");
        C11669k.m56787e(p1Var, "logger");
        C11669k.m56787e(w2Var, "timeProvider");
    }

    /* renamed from: a */
    public void mo33100a(JSONObject jSONObject, C10487a aVar) {
        C11669k.m56787e(jSONObject, "jsonObject");
        C11669k.m56787e(aVar, "influence");
        if (aVar.mo33612d().mo33622a()) {
            try {
                jSONObject.put("direct", aVar.mo33612d().mo33623b());
                jSONObject.put("notification_ids", aVar.mo33610b());
            } catch (JSONException e) {
                mo33116o().mo28015c("Generating notification tracker addSessionData JSONObject ", e);
            }
        }
    }

    /* renamed from: b */
    public void mo33101b() {
        C10303c f = mo33106f();
        C10490c k = mo33112k();
        if (k == null) {
            k = C10490c.UNATTRIBUTED;
        }
        f.mo33126b(k);
        mo33106f().mo33127c(mo33107g());
    }

    /* renamed from: c */
    public int mo33102c() {
        return mo33106f().mo33136l();
    }

    /* renamed from: d */
    public C10488b mo33103d() {
        return C10488b.NOTIFICATION;
    }

    /* renamed from: h */
    public String mo33108h() {
        return "notification_id";
    }

    /* renamed from: i */
    public int mo33110i() {
        return mo33106f().mo33135k();
    }

    /* renamed from: l */
    public JSONArray mo33113l() throws JSONException {
        return mo33106f().mo33133i();
    }

    /* renamed from: m */
    public JSONArray mo33114m(String str) {
        try {
            return mo33113l();
        } catch (JSONException e) {
            mo33116o().mo28015c("Generating Notification tracker getLastChannelObjects JSONObject ", e);
            return new JSONArray();
        }
    }

    /* renamed from: p */
    public void mo33117p() {
        C10490c j = mo33106f().mo33134j();
        if (j.mo33625j()) {
            mo33123x(mo33115n());
        } else if (j.mo33623b()) {
            mo33122w(mo33106f().mo33128d());
        }
        C10349s sVar = C10349s.f40964a;
        mo33124y(j);
        C8547p1 o = mo33116o();
        o.mo28016d("OneSignal NotificationTracker initInfluencedTypeFromCache: " + this);
    }

    /* renamed from: u */
    public void mo33120u(JSONArray jSONArray) {
        C11669k.m56787e(jSONArray, "channelObjects");
        mo33106f().mo33142r(jSONArray);
    }
}
