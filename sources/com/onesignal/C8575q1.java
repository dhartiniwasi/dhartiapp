package com.onesignal;

import androidx.core.app.C0651l;
import com.onesignal.C8338d3;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onesignal.q1 */
/* compiled from: OSNotification */
public class C8575q1 {

    /* renamed from: A */
    private int f35920A;

    /* renamed from: a */
    private C0651l.C0660f f35921a;

    /* renamed from: b */
    private List<C8575q1> f35922b;

    /* renamed from: c */
    private int f35923c;

    /* renamed from: d */
    private String f35924d;

    /* renamed from: e */
    private String f35925e;

    /* renamed from: f */
    private String f35926f;

    /* renamed from: g */
    private String f35927g;

    /* renamed from: h */
    private String f35928h;

    /* renamed from: i */
    private JSONObject f35929i;

    /* renamed from: j */
    private String f35930j;

    /* renamed from: k */
    private String f35931k;

    /* renamed from: l */
    private String f35932l;

    /* renamed from: m */
    private String f35933m;

    /* renamed from: n */
    private String f35934n;

    /* renamed from: o */
    private String f35935o;

    /* renamed from: p */
    private String f35936p;

    /* renamed from: q */
    private int f35937q;

    /* renamed from: r */
    private String f35938r;

    /* renamed from: s */
    private String f35939s;

    /* renamed from: t */
    private List<C8576a> f35940t;

    /* renamed from: u */
    private String f35941u;

    /* renamed from: v */
    private C8577b f35942v;

    /* renamed from: w */
    private String f35943w;

    /* renamed from: x */
    private int f35944x;

    /* renamed from: y */
    private String f35945y;

    /* renamed from: z */
    private long f35946z;

    /* renamed from: com.onesignal.q1$a */
    /* compiled from: OSNotification */
    public static class C8576a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public String f35947a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public String f35948b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public String f35949c;

        /* renamed from: d */
        public String mo28145d() {
            return this.f35949c;
        }

        /* renamed from: e */
        public String mo28146e() {
            return this.f35947a;
        }

        /* renamed from: f */
        public String mo28147f() {
            return this.f35948b;
        }

        /* renamed from: g */
        public JSONObject mo28148g() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("id", this.f35947a);
                jSONObject.put("text", this.f35948b);
                jSONObject.put("icon", this.f35949c);
            } catch (Throwable th) {
                th.printStackTrace();
            }
            return jSONObject;
        }
    }

    /* renamed from: com.onesignal.q1$b */
    /* compiled from: OSNotification */
    public static class C8577b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public String f35950a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public String f35951b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public String f35952c;

        /* renamed from: d */
        public String mo28149d() {
            return this.f35952c;
        }

        /* renamed from: e */
        public String mo28150e() {
            return this.f35950a;
        }

        /* renamed from: f */
        public String mo28151f() {
            return this.f35951b;
        }
    }

    /* renamed from: com.onesignal.q1$c */
    /* compiled from: OSNotification */
    public static class C8578c {

        /* renamed from: A */
        private int f35953A;

        /* renamed from: a */
        private C0651l.C0660f f35954a;

        /* renamed from: b */
        private List<C8575q1> f35955b;

        /* renamed from: c */
        private int f35956c;

        /* renamed from: d */
        private String f35957d;

        /* renamed from: e */
        private String f35958e;

        /* renamed from: f */
        private String f35959f;

        /* renamed from: g */
        private String f35960g;

        /* renamed from: h */
        private String f35961h;

        /* renamed from: i */
        private JSONObject f35962i;

        /* renamed from: j */
        private String f35963j;

        /* renamed from: k */
        private String f35964k;

        /* renamed from: l */
        private String f35965l;

        /* renamed from: m */
        private String f35966m;

        /* renamed from: n */
        private String f35967n;

        /* renamed from: o */
        private String f35968o;

        /* renamed from: p */
        private String f35969p;

        /* renamed from: q */
        private int f35970q = 1;

        /* renamed from: r */
        private String f35971r;

        /* renamed from: s */
        private String f35972s;

        /* renamed from: t */
        private List<C8576a> f35973t;

        /* renamed from: u */
        private String f35974u;

        /* renamed from: v */
        private C8577b f35975v;

        /* renamed from: w */
        private String f35976w;

        /* renamed from: x */
        private int f35977x;

        /* renamed from: y */
        private String f35978y;

        /* renamed from: z */
        private long f35979z;

        /* renamed from: A */
        public C8578c mo28152A(String str) {
            this.f35958e = str;
            return this;
        }

        /* renamed from: B */
        public C8578c mo28153B(String str) {
            this.f35960g = str;
            return this;
        }

        /* renamed from: a */
        public C8575q1 mo28154a() {
            C8575q1 q1Var = new C8575q1();
            q1Var.mo28109X(this.f35954a);
            q1Var.mo28104S(this.f35955b);
            q1Var.mo28096J(this.f35956c);
            q1Var.mo28110Y(this.f35957d);
            q1Var.mo28122g0(this.f35958e);
            q1Var.mo28120f0(this.f35959f);
            q1Var.mo28124h0(this.f35960g);
            q1Var.mo28099N(this.f35961h);
            q1Var.mo28095I(this.f35962i);
            q1Var.mo28114c0(this.f35963j);
            q1Var.mo28105T(this.f35964k);
            q1Var.mo28098M(this.f35965l);
            q1Var.mo28116d0(this.f35966m);
            q1Var.mo28106U(this.f35967n);
            q1Var.mo28118e0(this.f35968o);
            q1Var.mo28107V(this.f35969p);
            q1Var.mo28108W(this.f35970q);
            q1Var.mo28102Q(this.f35971r);
            q1Var.mo28103R(this.f35972s);
            q1Var.mo28094H(this.f35973t);
            q1Var.mo28101P(this.f35974u);
            q1Var.mo28097K(this.f35975v);
            q1Var.mo28100O(this.f35976w);
            q1Var.mo28111Z(this.f35977x);
            q1Var.mo28112a0(this.f35978y);
            q1Var.m47451b0(this.f35979z);
            q1Var.m47452i0(this.f35953A);
            return q1Var;
        }

        /* renamed from: b */
        public C8578c mo28155b(List<C8576a> list) {
            this.f35973t = list;
            return this;
        }

        /* renamed from: c */
        public C8578c mo28156c(JSONObject jSONObject) {
            this.f35962i = jSONObject;
            return this;
        }

        /* renamed from: d */
        public C8578c mo28157d(int i) {
            this.f35956c = i;
            return this;
        }

        /* renamed from: e */
        public C8578c mo28158e(C8577b bVar) {
            this.f35975v = bVar;
            return this;
        }

        /* renamed from: f */
        public C8578c mo28159f(String str) {
            this.f35965l = str;
            return this;
        }

        /* renamed from: g */
        public C8578c mo28160g(String str) {
            this.f35961h = str;
            return this;
        }

        /* renamed from: h */
        public C8578c mo28161h(String str) {
            this.f35976w = str;
            return this;
        }

        /* renamed from: i */
        public C8578c mo28162i(String str) {
            this.f35974u = str;
            return this;
        }

        /* renamed from: j */
        public C8578c mo28163j(String str) {
            this.f35971r = str;
            return this;
        }

        /* renamed from: k */
        public C8578c mo28164k(String str) {
            this.f35972s = str;
            return this;
        }

        /* renamed from: l */
        public C8578c mo28165l(List<C8575q1> list) {
            this.f35955b = list;
            return this;
        }

        /* renamed from: m */
        public C8578c mo28166m(String str) {
            this.f35964k = str;
            return this;
        }

        /* renamed from: n */
        public C8578c mo28167n(String str) {
            this.f35967n = str;
            return this;
        }

        /* renamed from: o */
        public C8578c mo28168o(String str) {
            this.f35969p = str;
            return this;
        }

        /* renamed from: p */
        public C8578c mo28169p(int i) {
            this.f35970q = i;
            return this;
        }

        /* renamed from: q */
        public C8578c mo28170q(C0651l.C0660f fVar) {
            this.f35954a = fVar;
            return this;
        }

        /* renamed from: r */
        public C8578c mo28171r(String str) {
            this.f35957d = str;
            return this;
        }

        /* renamed from: s */
        public C8578c mo28172s(int i) {
            this.f35977x = i;
            return this;
        }

        /* renamed from: t */
        public C8578c mo28173t(String str) {
            this.f35978y = str;
            return this;
        }

        /* renamed from: u */
        public C8578c mo28174u(long j) {
            this.f35979z = j;
            return this;
        }

        /* renamed from: v */
        public C8578c mo28175v(String str) {
            this.f35963j = str;
            return this;
        }

        /* renamed from: w */
        public C8578c mo28176w(String str) {
            this.f35966m = str;
            return this;
        }

        /* renamed from: x */
        public C8578c mo28177x(String str) {
            this.f35968o = str;
            return this;
        }

        /* renamed from: y */
        public C8578c mo28178y(int i) {
            this.f35953A = i;
            return this;
        }

        /* renamed from: z */
        public C8578c mo28179z(String str) {
            this.f35959f = str;
            return this;
        }
    }

    protected C8575q1() {
        this.f35937q = 1;
    }

    /* renamed from: F */
    private void m47446F(JSONObject jSONObject) {
        try {
            JSONObject b = C8411f0.m46661b(jSONObject);
            long b2 = C8338d3.m46448M0().mo28281b();
            if (jSONObject.has("google.ttl")) {
                this.f35946z = jSONObject.optLong("google.sent_time", b2) / 1000;
                this.f35920A = jSONObject.optInt("google.ttl", 259200);
            } else if (jSONObject.has("hms.ttl")) {
                this.f35946z = jSONObject.optLong("hms.sent_time", b2) / 1000;
                this.f35920A = jSONObject.optInt("hms.ttl", 259200);
            } else {
                this.f35946z = b2 / 1000;
                this.f35920A = 259200;
            }
            this.f35924d = b.optString("i");
            this.f35926f = b.optString("ti");
            this.f35925e = b.optString("tn");
            this.f35945y = jSONObject.toString();
            this.f35929i = b.optJSONObject("a");
            this.f35934n = b.optString("u", (String) null);
            this.f35928h = jSONObject.optString("alert", (String) null);
            this.f35927g = jSONObject.optString("title", (String) null);
            this.f35930j = jSONObject.optString("sicon", (String) null);
            this.f35932l = jSONObject.optString("bicon", (String) null);
            this.f35931k = jSONObject.optString("licon", (String) null);
            this.f35935o = jSONObject.optString("sound", (String) null);
            this.f35938r = jSONObject.optString("grp", (String) null);
            this.f35939s = jSONObject.optString("grp_msg", (String) null);
            this.f35933m = jSONObject.optString("bgac", (String) null);
            this.f35936p = jSONObject.optString("ledc", (String) null);
            String optString = jSONObject.optString("vis", (String) null);
            if (optString != null) {
                this.f35937q = Integer.parseInt(optString);
            }
            this.f35941u = jSONObject.optString("from", (String) null);
            this.f35944x = jSONObject.optInt("pri", 0);
            String optString2 = jSONObject.optString("collapse_key", (String) null);
            if (!"do_not_collapse".equals(optString2)) {
                this.f35943w = optString2;
            }
            try {
                m47447G();
            } catch (Throwable th) {
                C8338d3.m46496b(C8338d3.C8384r0.ERROR, "Error assigning OSNotificationReceivedEvent.actionButtons values!", th);
            }
            try {
                m47448L(jSONObject);
            } catch (Throwable th2) {
                C8338d3.m46496b(C8338d3.C8384r0.ERROR, "Error assigning OSNotificationReceivedEvent.backgroundImageLayout values!", th2);
            }
        } catch (Throwable th3) {
            C8338d3.m46496b(C8338d3.C8384r0.ERROR, "Error assigning OSNotificationReceivedEvent payload values!", th3);
        }
    }

    /* renamed from: G */
    private void m47447G() throws Throwable {
        JSONObject jSONObject = this.f35929i;
        if (jSONObject != null && jSONObject.has("actionButtons")) {
            JSONArray jSONArray = this.f35929i.getJSONArray("actionButtons");
            this.f35940t = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                C8576a aVar = new C8576a();
                String unused = aVar.f35947a = jSONObject2.optString("id", (String) null);
                String unused2 = aVar.f35948b = jSONObject2.optString("text", (String) null);
                String unused3 = aVar.f35949c = jSONObject2.optString("icon", (String) null);
                this.f35940t.add(aVar);
            }
            this.f35929i.remove("actionId");
            this.f35929i.remove("actionButtons");
        }
    }

    /* renamed from: L */
    private void m47448L(JSONObject jSONObject) throws Throwable {
        String optString = jSONObject.optString("bg_img", (String) null);
        if (optString != null) {
            JSONObject jSONObject2 = new JSONObject(optString);
            C8577b bVar = new C8577b();
            this.f35942v = bVar;
            String unused = bVar.f35950a = jSONObject2.optString("img");
            String unused2 = this.f35942v.f35951b = jSONObject2.optString("tc");
            String unused3 = this.f35942v.f35952c = jSONObject2.optString("bc");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b0 */
    public void m47451b0(long j) {
        this.f35946z = j;
    }

    /* access modifiers changed from: private */
    /* renamed from: i0 */
    public void m47452i0(int i) {
        this.f35920A = i;
    }

    /* renamed from: A */
    public String mo28089A() {
        return this.f35926f;
    }

    /* renamed from: B */
    public String mo28090B() {
        return this.f35925e;
    }

    /* renamed from: C */
    public String mo28091C() {
        return this.f35927g;
    }

    /* renamed from: D */
    public int mo28092D() {
        return this.f35920A;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public boolean mo28093E() {
        return this.f35923c != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public void mo28094H(List<C8576a> list) {
        this.f35940t = list;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public void mo28095I(JSONObject jSONObject) {
        this.f35929i = jSONObject;
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public void mo28096J(int i) {
        this.f35923c = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public void mo28097K(C8577b bVar) {
        this.f35942v = bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public void mo28098M(String str) {
        this.f35932l = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public void mo28099N(String str) {
        this.f35928h = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public void mo28100O(String str) {
        this.f35943w = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public void mo28101P(String str) {
        this.f35941u = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public void mo28102Q(String str) {
        this.f35938r = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public void mo28103R(String str) {
        this.f35939s = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public void mo28104S(List<C8575q1> list) {
        this.f35922b = list;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public void mo28105T(String str) {
        this.f35931k = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public void mo28106U(String str) {
        this.f35934n = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public void mo28107V(String str) {
        this.f35936p = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W */
    public void mo28108W(int i) {
        this.f35937q = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: X */
    public void mo28109X(C0651l.C0660f fVar) {
        this.f35921a = fVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y */
    public void mo28110Y(String str) {
        this.f35924d = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z */
    public void mo28111Z(int i) {
        this.f35944x = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a0 */
    public void mo28112a0(String str) {
        this.f35945y = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C8575q1 mo28113c() {
        return new C8578c().mo28170q(this.f35921a).mo28165l(this.f35922b).mo28157d(this.f35923c).mo28171r(this.f35924d).mo28152A(this.f35925e).mo28179z(this.f35926f).mo28153B(this.f35927g).mo28160g(this.f35928h).mo28156c(this.f35929i).mo28175v(this.f35930j).mo28166m(this.f35931k).mo28159f(this.f35932l).mo28176w(this.f35933m).mo28167n(this.f35934n).mo28177x(this.f35935o).mo28168o(this.f35936p).mo28169p(this.f35937q).mo28163j(this.f35938r).mo28164k(this.f35939s).mo28155b(this.f35940t).mo28162i(this.f35941u).mo28158e(this.f35942v).mo28161h(this.f35943w).mo28172s(this.f35944x).mo28173t(this.f35945y).mo28174u(this.f35946z).mo28178y(this.f35920A).mo28154a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c0 */
    public void mo28114c0(String str) {
        this.f35930j = str;
    }

    /* renamed from: d */
    public List<C8576a> mo28115d() {
        return this.f35940t;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d0 */
    public void mo28116d0(String str) {
        this.f35933m = str;
    }

    /* renamed from: e */
    public JSONObject mo28117e() {
        return this.f35929i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e0 */
    public void mo28118e0(String str) {
        this.f35935o = str;
    }

    /* renamed from: f */
    public int mo28119f() {
        return this.f35923c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f0 */
    public void mo28120f0(String str) {
        this.f35926f = str;
    }

    /* renamed from: g */
    public C8577b mo28121g() {
        return this.f35942v;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g0 */
    public void mo28122g0(String str) {
        this.f35925e = str;
    }

    /* renamed from: h */
    public String mo28123h() {
        return this.f35932l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h0 */
    public void mo28124h0(String str) {
        this.f35927g = str;
    }

    /* renamed from: i */
    public String mo28125i() {
        return this.f35928h;
    }

    /* renamed from: j */
    public String mo28126j() {
        return this.f35943w;
    }

    /* renamed from: j0 */
    public JSONObject mo28127j0() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("androidNotificationId", this.f35923c);
            JSONArray jSONArray = new JSONArray();
            List<C8575q1> list = this.f35922b;
            if (list != null) {
                for (C8575q1 j0 : list) {
                    jSONArray.put(j0.mo28127j0());
                }
            }
            jSONObject.put("groupedNotifications", jSONArray);
            jSONObject.put("notificationId", this.f35924d);
            jSONObject.put("templateName", this.f35925e);
            jSONObject.put("templateId", this.f35926f);
            jSONObject.put("title", this.f35927g);
            jSONObject.put("body", this.f35928h);
            jSONObject.put("smallIcon", this.f35930j);
            jSONObject.put("largeIcon", this.f35931k);
            jSONObject.put("bigPicture", this.f35932l);
            jSONObject.put("smallIconAccentColor", this.f35933m);
            jSONObject.put("launchURL", this.f35934n);
            jSONObject.put("sound", this.f35935o);
            jSONObject.put("ledColor", this.f35936p);
            jSONObject.put("lockScreenVisibility", this.f35937q);
            jSONObject.put("groupKey", this.f35938r);
            jSONObject.put("groupMessage", this.f35939s);
            jSONObject.put("fromProjectNumber", this.f35941u);
            jSONObject.put("collapseId", this.f35943w);
            jSONObject.put("priority", this.f35944x);
            JSONObject jSONObject2 = this.f35929i;
            if (jSONObject2 != null) {
                jSONObject.put("additionalData", jSONObject2);
            }
            if (this.f35940t != null) {
                JSONArray jSONArray2 = new JSONArray();
                for (C8576a g : this.f35940t) {
                    jSONArray2.put(g.mo28148g());
                }
                jSONObject.put("actionButtons", jSONArray2);
            }
            jSONObject.put("rawPayload", this.f35945y);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: k */
    public String mo28128k() {
        return this.f35941u;
    }

    /* renamed from: l */
    public String mo28129l() {
        return this.f35938r;
    }

    /* renamed from: m */
    public String mo28130m() {
        return this.f35939s;
    }

    /* renamed from: n */
    public List<C8575q1> mo28131n() {
        return this.f35922b;
    }

    /* renamed from: o */
    public String mo28132o() {
        return this.f35931k;
    }

    /* renamed from: p */
    public String mo28133p() {
        return this.f35934n;
    }

    /* renamed from: q */
    public String mo28134q() {
        return this.f35936p;
    }

    /* renamed from: r */
    public int mo28135r() {
        return this.f35937q;
    }

    /* renamed from: s */
    public C0651l.C0660f mo28136s() {
        return this.f35921a;
    }

    /* renamed from: t */
    public String mo28137t() {
        return this.f35924d;
    }

    public String toString() {
        return "OSNotification{notificationExtender=" + this.f35921a + ", groupedNotifications=" + this.f35922b + ", androidNotificationId=" + this.f35923c + ", notificationId='" + this.f35924d + '\'' + ", templateName='" + this.f35925e + '\'' + ", templateId='" + this.f35926f + '\'' + ", title='" + this.f35927g + '\'' + ", body='" + this.f35928h + '\'' + ", additionalData=" + this.f35929i + ", smallIcon='" + this.f35930j + '\'' + ", largeIcon='" + this.f35931k + '\'' + ", bigPicture='" + this.f35932l + '\'' + ", smallIconAccentColor='" + this.f35933m + '\'' + ", launchURL='" + this.f35934n + '\'' + ", sound='" + this.f35935o + '\'' + ", ledColor='" + this.f35936p + '\'' + ", lockScreenVisibility=" + this.f35937q + ", groupKey='" + this.f35938r + '\'' + ", groupMessage='" + this.f35939s + '\'' + ", actionButtons=" + this.f35940t + ", fromProjectNumber='" + this.f35941u + '\'' + ", backgroundImageLayout=" + this.f35942v + ", collapseId='" + this.f35943w + '\'' + ", priority=" + this.f35944x + ", rawPayload='" + this.f35945y + '\'' + '}';
    }

    /* renamed from: u */
    public int mo28139u() {
        return this.f35944x;
    }

    /* renamed from: v */
    public String mo28140v() {
        return this.f35945y;
    }

    /* renamed from: w */
    public long mo28141w() {
        return this.f35946z;
    }

    /* renamed from: x */
    public String mo28142x() {
        return this.f35930j;
    }

    /* renamed from: y */
    public String mo28143y() {
        return this.f35933m;
    }

    /* renamed from: z */
    public String mo28144z() {
        return this.f35935o;
    }

    C8575q1(JSONObject jSONObject) {
        this((List<C8575q1>) null, jSONObject, 0);
    }

    C8575q1(List<C8575q1> list, JSONObject jSONObject, int i) {
        this.f35937q = 1;
        m47446F(jSONObject);
        this.f35922b = list;
        this.f35923c = i;
    }
}
