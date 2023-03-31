package com.onesignal;

import com.onesignal.C8303b0;
import com.onesignal.C8338d3;
import com.onesignal.C8524o3;
import com.onesignal.C8532o4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onesignal.r3 */
/* compiled from: OneSignalStateSynchronizer */
class C8592r3 {

    /* renamed from: a */
    private static final Object f36003a = new Object();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static HashMap<C8597d, C8532o4> f36004b = new HashMap<>();

    /* renamed from: com.onesignal.r3$a */
    /* compiled from: OneSignalStateSynchronizer */
    class C8593a implements C8338d3.C8392v0 {

        /* renamed from: a */
        final /* synthetic */ JSONObject f36005a;

        /* renamed from: b */
        final /* synthetic */ C8338d3.C8386s0 f36006b;

        /* renamed from: com.onesignal.r3$a$a */
        /* compiled from: OneSignalStateSynchronizer */
        class C8594a implements Runnable {
            C8594a() {
            }

            public void run() {
                C8593a aVar = C8593a.this;
                C8338d3.C8386s0 s0Var = aVar.f36006b;
                if (s0Var != null) {
                    s0Var.mo27745a(aVar.f36005a);
                }
            }
        }

        C8593a(JSONObject jSONObject, C8338d3.C8386s0 s0Var) {
            this.f36005a = jSONObject;
            this.f36006b = s0Var;
        }

        /* renamed from: a */
        public void mo27750a(String str, boolean z) {
            C8338d3.C8384r0 r0Var = C8338d3.C8384r0.VERBOSE;
            C8338d3.m46594z1(r0Var, "Completed request to update external user id for channel: " + str + " and success: " + z);
            try {
                this.f36005a.put(str, new JSONObject().put("success", z));
            } catch (JSONException e) {
                C8338d3.C8384r0 r0Var2 = C8338d3.C8384r0.ERROR;
                C8338d3.m46594z1(r0Var2, "Error while adding the success status of external id for channel: " + str);
                e.printStackTrace();
            }
            for (C8532o4 o4Var : C8592r3.f36004b.values()) {
                if (o4Var.mo28031K()) {
                    C8338d3.C8384r0 r0Var3 = C8338d3.C8384r0.VERBOSE;
                    C8338d3.m46594z1(r0Var3, "External user id handlers are still being processed for channel: " + o4Var.mo28045z() + " , wait until finished before proceeding");
                    return;
                }
            }
            OSUtils.m46187T(new C8594a());
        }
    }

    /* renamed from: com.onesignal.r3$b */
    /* compiled from: OneSignalStateSynchronizer */
    interface C8595b {
        /* renamed from: a */
        void mo27717a(C8596c cVar);

        /* renamed from: b */
        void mo27718b(String str);
    }

    /* renamed from: com.onesignal.r3$c */
    /* compiled from: OneSignalStateSynchronizer */
    static class C8596c {

        /* renamed from: a */
        public int f36008a;

        /* renamed from: b */
        public String f36009b;

        C8596c(int i, String str) {
            this.f36008a = i;
            this.f36009b = str;
        }
    }

    /* renamed from: com.onesignal.r3$d */
    /* compiled from: OneSignalStateSynchronizer */
    enum C8597d {
        PUSH,
        EMAIL,
        SMS
    }

    /* renamed from: A */
    static void m47609A(boolean z) {
        m47618e().mo27917r0(z);
    }

    /* renamed from: B */
    static void m47610B(boolean z) {
        m47618e().mo28040e0(z);
        m47616c().mo28040e0(z);
        m47620g().mo28040e0(z);
    }

    /* renamed from: C */
    static void m47611C(JSONObject jSONObject, C8595b bVar) {
        m47618e().mo28041f0(jSONObject, bVar);
        m47616c().mo28041f0(jSONObject, bVar);
        m47620g().mo28041f0(jSONObject, bVar);
    }

    /* renamed from: D */
    static void m47612D(C8303b0.C8307d dVar) {
        m47618e().mo28042h0(dVar);
        m47616c().mo28042h0(dVar);
        m47620g().mo28042h0(dVar);
    }

    /* renamed from: E */
    static void m47613E(JSONObject jSONObject) {
        m47618e().mo27918s0(jSONObject);
    }

    /* renamed from: b */
    static void m47615b() {
        m47618e().mo28043o();
        m47616c().mo28043o();
        m47620g().mo28043o();
    }

    /* renamed from: c */
    static C8464i4 m47616c() {
        HashMap<C8597d, C8532o4> hashMap = f36004b;
        C8597d dVar = C8597d.EMAIL;
        if (!hashMap.containsKey(dVar) || f36004b.get(dVar) == null) {
            synchronized (f36003a) {
                if (f36004b.get(dVar) == null) {
                    f36004b.put(dVar, new C8464i4());
                }
            }
        }
        return (C8464i4) f36004b.get(dVar);
    }

    /* renamed from: d */
    static String m47617d() {
        return m47618e().mo27908j0();
    }

    /* renamed from: e */
    static C8476k4 m47618e() {
        HashMap<C8597d, C8532o4> hashMap = f36004b;
        C8597d dVar = C8597d.PUSH;
        if (!hashMap.containsKey(dVar) || f36004b.get(dVar) == null) {
            synchronized (f36003a) {
                if (f36004b.get(dVar) == null) {
                    f36004b.put(dVar, new C8476k4());
                }
            }
        }
        return (C8476k4) f36004b.get(dVar);
    }

    /* renamed from: f */
    static String m47619f() {
        return m47618e().mo28027E();
    }

    /* renamed from: g */
    static C8503m4 m47620g() {
        HashMap<C8597d, C8532o4> hashMap = f36004b;
        C8597d dVar = C8597d.SMS;
        if (!hashMap.containsKey(dVar) || f36004b.get(dVar) == null) {
            synchronized (f36003a) {
                if (f36004b.get(dVar) == null) {
                    f36004b.put(dVar, new C8503m4());
                }
            }
        }
        return (C8503m4) f36004b.get(dVar);
    }

    /* renamed from: h */
    static boolean m47621h() {
        return m47618e().mo28028F() || m47616c().mo28028F() || m47620g().mo28028F();
    }

    /* renamed from: i */
    static C8532o4.C8537e m47622i(boolean z) {
        return m47618e().mo27909k0(z);
    }

    /* renamed from: j */
    static List<C8532o4> m47623j() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(m47618e());
        if (C8338d3.m46490Z0()) {
            arrayList.add(m47616c());
        }
        if (C8338d3.m46494a1()) {
            arrayList.add(m47620g());
        }
        return arrayList;
    }

    /* renamed from: k */
    static boolean m47624k() {
        return m47618e().mo27910l0();
    }

    /* renamed from: l */
    static void m47625l() {
        m47618e().mo28032L();
        m47616c().mo28032L();
        m47620g().mo28032L();
    }

    /* renamed from: m */
    static void m47626m() {
        m47618e().mo27911m0();
        m47616c().mo27872p0();
    }

    /* renamed from: n */
    static void m47627n() {
        m47620g().mo27969p0();
        m47618e().mo27913n0();
    }

    /* renamed from: o */
    static boolean m47628o() {
        boolean R = m47618e().mo28033R();
        boolean R2 = m47616c().mo28033R();
        boolean R3 = m47620g().mo28033R();
        if (R2) {
            R2 = m47616c().mo28027E() != null;
        }
        if (R3) {
            R3 = m47620g().mo28027E() != null;
        }
        if (R || R2 || R3) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    static void m47629p(boolean z) {
        m47618e().mo28034S(z);
        m47616c().mo28034S(z);
        m47620g().mo28034S(z);
    }

    /* renamed from: q */
    static void m47630q() {
        m47616c().mo27995n0();
        m47620g().mo27995n0();
    }

    /* renamed from: r */
    static void m47631r() {
        m47618e().mo28035T();
        m47616c().mo28035T();
        m47620g().mo28035T();
        m47618e().mo27865V((String) null);
        m47616c().mo27865V((String) null);
        m47620g().mo27865V((String) null);
        C8338d3.m46571t2(-3660);
    }

    /* renamed from: s */
    static void m47632s(JSONObject jSONObject, C8524o3.C8531g gVar) {
        for (C8532o4 X : m47623j()) {
            X.mo28036X(jSONObject, gVar);
        }
    }

    /* renamed from: t */
    static void m47633t(JSONObject jSONObject, C8338d3.C8367j0 j0Var) {
        try {
            JSONObject put = new JSONObject().put("tags", jSONObject);
            m47618e().mo28037Y(put, j0Var);
            m47616c().mo28037Y(put, j0Var);
            m47620g().mo28037Y(put, j0Var);
        } catch (JSONException e) {
            if (j0Var != null) {
                j0Var.mo27729i(new C8338d3.C8368j1(-1, "Encountered an error attempting to serialize your tags into JSON: " + e.getMessage() + "\n" + e.getStackTrace()));
            }
            e.printStackTrace();
        }
    }

    /* renamed from: u */
    static void m47634u(String str, String str2) {
        m47618e().mo27914o0(str, str2);
        m47616c().mo27996o0(str, str2);
    }

    /* renamed from: v */
    static void m47635v(String str, String str2, C8338d3.C8386s0 s0Var) throws JSONException {
        C8593a aVar = new C8593a(new JSONObject(), s0Var);
        for (C8532o4 b0 : m47623j()) {
            b0.mo28038b0(str, str2, aVar);
        }
    }

    /* renamed from: w */
    static void m47636w() {
        m47618e().mo28039c0();
        m47616c().mo28039c0();
        m47620g().mo28039c0();
    }

    /* renamed from: x */
    static void m47637x() {
        m47616c().mo28039c0();
    }

    /* renamed from: y */
    static void m47638y(boolean z) {
        m47618e().mo27915p0(z);
    }

    /* renamed from: z */
    static void m47639z(String str, String str2) {
        m47618e().mo27916q0(str, str2);
        m47620g().mo27996o0(str, str2);
    }
}
