package p240ga;

import com.onesignal.C8507n2;
import com.onesignal.C8508n3;
import kotlin.jvm.internal.C11669k;
import org.json.JSONArray;
import org.json.JSONException;
import p249ha.C10490c;

/* renamed from: ga.c */
/* compiled from: OSInfluenceDataRepository.kt */
public final class C10303c {

    /* renamed from: a */
    private final C8507n2 f40907a;

    public C10303c(C8507n2 n2Var) {
        C11669k.m56787e(n2Var, "preferences");
        this.f40907a = n2Var;
    }

    /* renamed from: a */
    public final void mo33125a(C10490c cVar) {
        C11669k.m56787e(cVar, "influenceType");
        C8507n2 n2Var = this.f40907a;
        n2Var.mo27984i(n2Var.mo27981f(), "PREFS_OS_OUTCOMES_CURRENT_IAM_INFLUENCE", cVar.toString());
    }

    /* renamed from: b */
    public final void mo33126b(C10490c cVar) {
        C11669k.m56787e(cVar, "influenceType");
        C8507n2 n2Var = this.f40907a;
        n2Var.mo27984i(n2Var.mo27981f(), "PREFS_OS_OUTCOMES_CURRENT_SESSION", cVar.toString());
    }

    /* renamed from: c */
    public final void mo33127c(String str) {
        C8507n2 n2Var = this.f40907a;
        n2Var.mo27984i(n2Var.mo27981f(), "PREFS_OS_LAST_ATTRIBUTED_NOTIFICATION_OPEN", str);
    }

    /* renamed from: d */
    public final String mo33128d() {
        C8507n2 n2Var = this.f40907a;
        return n2Var.mo27980e(n2Var.mo27981f(), "PREFS_OS_LAST_ATTRIBUTED_NOTIFICATION_OPEN", (String) null);
    }

    /* renamed from: e */
    public final C10490c mo33129e() {
        String str = C10490c.UNATTRIBUTED.toString();
        C8507n2 n2Var = this.f40907a;
        return C10490c.f41541f.mo33627a(n2Var.mo27980e(n2Var.mo27981f(), "PREFS_OS_OUTCOMES_CURRENT_IAM_INFLUENCE", str));
    }

    /* renamed from: f */
    public final int mo33130f() {
        C8507n2 n2Var = this.f40907a;
        return n2Var.mo27979d(n2Var.mo27981f(), "PREFS_OS_IAM_INDIRECT_ATTRIBUTION_WINDOW", 1440);
    }

    /* renamed from: g */
    public final int mo33131g() {
        C8507n2 n2Var = this.f40907a;
        return n2Var.mo27979d(n2Var.mo27981f(), "PREFS_OS_IAM_LIMIT", 10);
    }

    /* renamed from: h */
    public final JSONArray mo33132h() throws JSONException {
        JSONArray jSONArray;
        C8507n2 n2Var = this.f40907a;
        String e = n2Var.mo27980e(n2Var.mo27981f(), "PREFS_OS_LAST_IAMS_RECEIVED", "[]");
        if (e == null) {
            jSONArray = new JSONArray();
        }
        return jSONArray;
    }

    /* renamed from: i */
    public final JSONArray mo33133i() throws JSONException {
        JSONArray jSONArray;
        C8507n2 n2Var = this.f40907a;
        String e = n2Var.mo27980e(n2Var.mo27981f(), "PREFS_OS_LAST_NOTIFICATIONS_RECEIVED", "[]");
        if (e == null) {
            jSONArray = new JSONArray();
        }
        return jSONArray;
    }

    /* renamed from: j */
    public final C10490c mo33134j() {
        C8507n2 n2Var = this.f40907a;
        return C10490c.f41541f.mo33627a(n2Var.mo27980e(n2Var.mo27981f(), "PREFS_OS_OUTCOMES_CURRENT_SESSION", C10490c.UNATTRIBUTED.toString()));
    }

    /* renamed from: k */
    public final int mo33135k() {
        C8507n2 n2Var = this.f40907a;
        return n2Var.mo27979d(n2Var.mo27981f(), "PREFS_OS_INDIRECT_ATTRIBUTION_WINDOW", 1440);
    }

    /* renamed from: l */
    public final int mo33136l() {
        C8507n2 n2Var = this.f40907a;
        return n2Var.mo27979d(n2Var.mo27981f(), "PREFS_OS_NOTIFICATION_LIMIT", 10);
    }

    /* renamed from: m */
    public final boolean mo33137m() {
        C8507n2 n2Var = this.f40907a;
        return n2Var.mo27985j(n2Var.mo27981f(), "PREFS_OS_DIRECT_ENABLED", false);
    }

    /* renamed from: n */
    public final boolean mo33138n() {
        C8507n2 n2Var = this.f40907a;
        return n2Var.mo27985j(n2Var.mo27981f(), "PREFS_OS_INDIRECT_ENABLED", false);
    }

    /* renamed from: o */
    public final boolean mo33139o() {
        C8507n2 n2Var = this.f40907a;
        return n2Var.mo27985j(n2Var.mo27981f(), "PREFS_OS_UNATTRIBUTED_ENABLED", false);
    }

    /* renamed from: p */
    public final void mo33140p(JSONArray jSONArray) {
        C11669k.m56787e(jSONArray, "iams");
        C8507n2 n2Var = this.f40907a;
        n2Var.mo27984i(n2Var.mo27981f(), "PREFS_OS_LAST_IAMS_RECEIVED", jSONArray.toString());
    }

    /* renamed from: q */
    public final void mo33141q(C8508n3.C8514e eVar) {
        C11669k.m56787e(eVar, "influenceParams");
        C8507n2 n2Var = this.f40907a;
        n2Var.mo27977b(n2Var.mo27981f(), "PREFS_OS_DIRECT_ENABLED", eVar.mo27991e());
        C8507n2 n2Var2 = this.f40907a;
        n2Var2.mo27977b(n2Var2.mo27981f(), "PREFS_OS_INDIRECT_ENABLED", eVar.mo27992f());
        C8507n2 n2Var3 = this.f40907a;
        n2Var3.mo27977b(n2Var3.mo27981f(), "PREFS_OS_UNATTRIBUTED_ENABLED", eVar.mo27993g());
        C8507n2 n2Var4 = this.f40907a;
        n2Var4.mo27976a(n2Var4.mo27981f(), "PREFS_OS_NOTIFICATION_LIMIT", eVar.mo27990d());
        C8507n2 n2Var5 = this.f40907a;
        n2Var5.mo27976a(n2Var5.mo27981f(), "PREFS_OS_INDIRECT_ATTRIBUTION_WINDOW", eVar.mo27989c());
        C8507n2 n2Var6 = this.f40907a;
        n2Var6.mo27976a(n2Var6.mo27981f(), "PREFS_OS_IAM_LIMIT", eVar.mo27987a());
        C8507n2 n2Var7 = this.f40907a;
        n2Var7.mo27976a(n2Var7.mo27981f(), "PREFS_OS_IAM_INDIRECT_ATTRIBUTION_WINDOW", eVar.mo27988b());
    }

    /* renamed from: r */
    public final void mo33142r(JSONArray jSONArray) {
        C11669k.m56787e(jSONArray, "notifications");
        C8507n2 n2Var = this.f40907a;
        n2Var.mo27984i(n2Var.mo27981f(), "PREFS_OS_LAST_NOTIFICATIONS_RECEIVED", jSONArray.toString());
    }
}
