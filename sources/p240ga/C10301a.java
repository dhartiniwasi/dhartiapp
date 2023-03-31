package p240ga;

import com.onesignal.C8547p1;
import com.onesignal.C8642w2;
import kotlin.jvm.internal.C11669k;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p249ha.C10487a;
import p249ha.C10488b;
import p249ha.C10490c;

/* renamed from: ga.a */
/* compiled from: OSChannelTracker.kt */
public abstract class C10301a {

    /* renamed from: a */
    private C10490c f40901a;

    /* renamed from: b */
    private JSONArray f40902b;

    /* renamed from: c */
    private String f40903c;

    /* renamed from: d */
    private C10303c f40904d;

    /* renamed from: e */
    private C8547p1 f40905e;

    /* renamed from: f */
    private C8642w2 f40906f;

    public C10301a(C10303c cVar, C8547p1 p1Var, C8642w2 w2Var) {
        C11669k.m56787e(cVar, "dataRepository");
        C11669k.m56787e(p1Var, "logger");
        C11669k.m56787e(w2Var, "timeProvider");
        this.f40904d = cVar;
        this.f40905e = p1Var;
        this.f40906f = w2Var;
    }

    /* renamed from: q */
    private final boolean m52103q() {
        return this.f40904d.mo33137m();
    }

    /* renamed from: r */
    private final boolean m52104r() {
        return this.f40904d.mo33138n();
    }

    /* renamed from: s */
    private final boolean m52105s() {
        return this.f40904d.mo33139o();
    }

    /* renamed from: a */
    public abstract void mo33100a(JSONObject jSONObject, C10487a aVar);

    /* renamed from: b */
    public abstract void mo33101b();

    /* renamed from: c */
    public abstract int mo33102c();

    /* renamed from: d */
    public abstract C10488b mo33103d();

    /* renamed from: e */
    public final C10487a mo33104e() {
        C10488b d = mo33103d();
        C10490c cVar = C10490c.DISABLED;
        C10487a aVar = new C10487a(d, cVar, (JSONArray) null);
        if (this.f40901a == null) {
            mo33117p();
        }
        C10490c cVar2 = this.f40901a;
        if (cVar2 != null) {
            cVar = cVar2;
        }
        if (cVar.mo33623b()) {
            if (m52103q()) {
                aVar.mo33613e(new JSONArray().put(this.f40903c));
                aVar.mo33615f(C10490c.DIRECT);
            }
        } else if (cVar.mo33625j()) {
            if (m52104r()) {
                aVar.mo33613e(this.f40902b);
                aVar.mo33615f(C10490c.INDIRECT);
            }
        } else if (m52105s()) {
            aVar.mo33615f(C10490c.UNATTRIBUTED);
        }
        return aVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || (!C11669k.m56783a(getClass(), obj.getClass()))) {
            return false;
        }
        C10301a aVar = (C10301a) obj;
        if (this.f40901a != aVar.f40901a || !C11669k.m56783a(aVar.mo33108h(), mo33108h())) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final C10303c mo33106f() {
        return this.f40904d;
    }

    /* renamed from: g */
    public final String mo33107g() {
        return this.f40903c;
    }

    /* renamed from: h */
    public abstract String mo33108h();

    public int hashCode() {
        C10490c cVar = this.f40901a;
        return ((cVar != null ? cVar.hashCode() : 0) * 31) + mo33108h().hashCode();
    }

    /* renamed from: i */
    public abstract int mo33110i();

    /* renamed from: j */
    public final JSONArray mo33111j() {
        return this.f40902b;
    }

    /* renamed from: k */
    public final C10490c mo33112k() {
        return this.f40901a;
    }

    /* renamed from: l */
    public abstract JSONArray mo33113l() throws JSONException;

    /* renamed from: m */
    public abstract JSONArray mo33114m(String str);

    /* renamed from: n */
    public final JSONArray mo33115n() {
        JSONArray jSONArray = new JSONArray();
        try {
            JSONArray l = mo33113l();
            C8547p1 p1Var = this.f40905e;
            p1Var.mo28016d("OneSignal ChannelTracker getLastReceivedIds lastChannelObjectReceived: " + l);
            long i = ((long) (mo33110i() * 60)) * 1000;
            long b = this.f40906f.mo28281b();
            int length = l.length();
            for (int i2 = 0; i2 < length; i2++) {
                JSONObject jSONObject = l.getJSONObject(i2);
                if (b - jSONObject.getLong("time") <= i) {
                    jSONArray.put(jSONObject.getString(mo33108h()));
                }
            }
        } catch (JSONException e) {
            this.f40905e.mo28015c("Generating tracker getLastReceivedIds JSONObject ", e);
        }
        return jSONArray;
    }

    /* renamed from: o */
    public final C8547p1 mo33116o() {
        return this.f40905e;
    }

    /* renamed from: p */
    public abstract void mo33117p();

    /* renamed from: t */
    public final void mo33118t() {
        this.f40903c = null;
        JSONArray n = mo33115n();
        this.f40902b = n;
        this.f40901a = (n != null ? n.length() : 0) > 0 ? C10490c.INDIRECT : C10490c.UNATTRIBUTED;
        mo33101b();
        C8547p1 p1Var = this.f40905e;
        p1Var.mo28016d("OneSignal OSChannelTracker resetAndInitInfluence: " + mo33108h() + " finish with influenceType: " + this.f40901a);
    }

    public String toString() {
        return "OSChannelTracker{tag=" + mo33108h() + ", influenceType=" + this.f40901a + ", indirectIds=" + this.f40902b + ", directId=" + this.f40903c + '}';
    }

    /* renamed from: u */
    public abstract void mo33120u(JSONArray jSONArray);

    /* renamed from: v */
    public final void mo33121v(String str) {
        C8547p1 p1Var = this.f40905e;
        p1Var.mo28016d("OneSignal OSChannelTracker for: " + mo33108h() + " saveLastId: " + str);
        if (str != null) {
            if (!(str.length() == 0)) {
                JSONArray m = mo33114m(str);
                C8547p1 p1Var2 = this.f40905e;
                p1Var2.mo28016d("OneSignal OSChannelTracker for: " + mo33108h() + " saveLastId with lastChannelObjectsReceived: " + m);
                try {
                    m.put(new JSONObject().put(mo33108h(), str).put("time", this.f40906f.mo28281b()));
                    if (m.length() > mo33102c()) {
                        JSONArray jSONArray = new JSONArray();
                        int length = m.length();
                        for (int length2 = m.length() - mo33102c(); length2 < length; length2++) {
                            try {
                                jSONArray.put(m.get(length2));
                            } catch (JSONException e) {
                                this.f40905e.mo28015c("Generating tracker lastChannelObjectsReceived get JSONObject ", e);
                            }
                        }
                        m = jSONArray;
                    }
                    C8547p1 p1Var3 = this.f40905e;
                    p1Var3.mo28016d("OneSignal OSChannelTracker for: " + mo33108h() + " with channelObjectToSave: " + m);
                    mo33120u(m);
                } catch (JSONException e2) {
                    this.f40905e.mo28015c("Generating tracker newInfluenceId JSONObject ", e2);
                }
            }
        }
    }

    /* renamed from: w */
    public final void mo33122w(String str) {
        this.f40903c = str;
    }

    /* renamed from: x */
    public final void mo33123x(JSONArray jSONArray) {
        this.f40902b = jSONArray;
    }

    /* renamed from: y */
    public final void mo33124y(C10490c cVar) {
        this.f40901a = cVar;
    }
}
