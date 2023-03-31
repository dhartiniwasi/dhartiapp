package com.onesignal;

import com.onesignal.C8338d3;
import com.onesignal.C8524o3;
import com.unity3d.services.core.request.metrics.AdOperationMetric;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import p249ha.C10487a;

/* renamed from: com.onesignal.p */
/* compiled from: FocusTimeController */
class C8540p {

    /* renamed from: a */
    private Long f35847a;

    /* renamed from: b */
    private C8631v0 f35848b;

    /* renamed from: c */
    private C8547p1 f35849c;

    /* renamed from: com.onesignal.p$a */
    /* compiled from: FocusTimeController */
    private enum C8541a {
        BACKGROUND,
        END_SESSION
    }

    /* renamed from: com.onesignal.p$b */
    /* compiled from: FocusTimeController */
    static class C8542b extends C8543c {
        C8542b() {
            this.f35853a = 1;
            this.f35854b = "OS_UNSENT_ATTRIBUTED_ACTIVE_TIME";
        }

        /* access modifiers changed from: protected */
        /* renamed from: h */
        public void mo28054h(JSONObject jSONObject) {
            C8338d3.m46432I0().mo27955b(jSONObject, mo28055j());
        }

        /* access modifiers changed from: protected */
        /* renamed from: j */
        public List<C10487a> mo28055j() {
            ArrayList arrayList = new ArrayList();
            for (String aVar : C8500m3.m47108g(C8500m3.f35731a, "PREFS_OS_ATTRIBUTED_INFLUENCES", new HashSet())) {
                try {
                    arrayList.add(new C10487a(aVar));
                } catch (JSONException e) {
                    C8338d3.C8384r0 r0Var = C8338d3.C8384r0.ERROR;
                    C8338d3.m46492a(r0Var, getClass().getSimpleName() + ": error generation OSInfluence from json object: " + e);
                }
            }
            return arrayList;
        }

        /* access modifiers changed from: protected */
        /* renamed from: m */
        public void mo28056m(List<C10487a> list) {
            HashSet hashSet = new HashSet();
            for (C10487a g : list) {
                try {
                    hashSet.add(g.mo33616g());
                } catch (JSONException e) {
                    C8338d3.C8384r0 r0Var = C8338d3.C8384r0.ERROR;
                    C8338d3.m46492a(r0Var, getClass().getSimpleName() + ": error generation json object OSInfluence: " + e);
                }
            }
            C8500m3.m47115n(C8500m3.f35731a, "PREFS_OS_ATTRIBUTED_INFLUENCES", hashSet);
        }

        /* access modifiers changed from: protected */
        /* renamed from: r */
        public void mo28057r(C8541a aVar) {
            C8338d3.C8384r0 r0Var = C8338d3.C8384r0.DEBUG;
            C8338d3.m46594z1(r0Var, getClass().getSimpleName() + " sendTime with: " + aVar);
            if (aVar.equals(C8541a.END_SESSION)) {
                mo28058u();
            } else {
                C8587r2.m47596q().mo28188s(C8338d3.f35438f);
            }
        }
    }

    /* renamed from: com.onesignal.p$c */
    /* compiled from: FocusTimeController */
    static abstract class C8543c {

        /* renamed from: a */
        protected long f35853a;

        /* renamed from: b */
        protected String f35854b;

        /* renamed from: c */
        private Long f35855c = null;

        /* renamed from: d */
        private final AtomicBoolean f35856d = new AtomicBoolean();

        /* renamed from: com.onesignal.p$c$a */
        /* compiled from: FocusTimeController */
        class C8544a extends C8524o3.C8531g {
            C8544a() {
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public void mo27538a(int i, String str, Throwable th) {
                C8338d3.m46550o1("sending on_focus Failed", i, th, str);
            }

            /* access modifiers changed from: package-private */
            /* renamed from: b */
            public void mo27539b(String str) {
                C8543c.this.m47336o(0);
            }
        }

        C8543c() {
        }

        /* access modifiers changed from: private */
        /* renamed from: g */
        public void m47331g(long j, List<C10487a> list, C8541a aVar) {
            m47335n(j, list);
            m47340t(aVar);
        }

        /* renamed from: i */
        private JSONObject m47332i(long j) throws JSONException {
            JSONObject put = new JSONObject().put("app_id", C8338d3.m46416E0()).put("type", 1).put(AdOperationMetric.INIT_STATE, "ping").put("active_time", j).put("device_type", new OSUtils().mo27559e());
            C8338d3.m46592z(put);
            return put;
        }

        /* renamed from: k */
        private long m47333k() {
            if (this.f35855c == null) {
                this.f35855c = Long.valueOf(C8500m3.m47105d(C8500m3.f35731a, this.f35854b, 0));
            }
            C8338d3.C8384r0 r0Var = C8338d3.C8384r0.DEBUG;
            C8338d3.m46492a(r0Var, getClass().getSimpleName() + ":getUnsentActiveTime: " + this.f35855c);
            return this.f35855c.longValue();
        }

        /* renamed from: l */
        private boolean m47334l() {
            return m47333k() >= this.f35853a;
        }

        /* access modifiers changed from: private */
        /* renamed from: n */
        public void m47335n(long j, List<C10487a> list) {
            C8338d3.C8384r0 r0Var = C8338d3.C8384r0.DEBUG;
            C8338d3.m46492a(r0Var, getClass().getSimpleName() + ":saveUnsentActiveData with lastFocusTimeInfluences: " + list.toString());
            mo28056m(list);
            m47336o(m47333k() + j);
        }

        /* access modifiers changed from: private */
        /* renamed from: o */
        public void m47336o(long j) {
            this.f35855c = Long.valueOf(j);
            C8338d3.C8384r0 r0Var = C8338d3.C8384r0.DEBUG;
            C8338d3.m46492a(r0Var, getClass().getSimpleName() + ":saveUnsentActiveTime: " + this.f35855c);
            C8500m3.m47113l(C8500m3.f35731a, this.f35854b, j);
        }

        /* renamed from: p */
        private void m47337p(long j) {
            try {
                C8338d3.C8384r0 r0Var = C8338d3.C8384r0.DEBUG;
                C8338d3.m46492a(r0Var, getClass().getSimpleName() + ":sendOnFocus with totalTimeActive: " + j);
                JSONObject i = m47332i(j);
                mo28054h(i);
                m47338q(C8338d3.m46463Q0(), i);
                if (C8338d3.m46490Z0()) {
                    m47338q(C8338d3.m46521h0(), m47332i(j));
                }
                if (C8338d3.m46494a1()) {
                    m47338q(C8338d3.m46404B0(), m47332i(j));
                }
                mo28056m(new ArrayList());
            } catch (JSONException e) {
                C8338d3.m46496b(C8338d3.C8384r0.ERROR, "Generating on_focus:JSON Failed.", e);
            }
        }

        /* renamed from: q */
        private void m47338q(String str, JSONObject jSONObject) {
            C8544a aVar = new C8544a();
            C8524o3.m47239k("players/" + str + "/on_focus", jSONObject, aVar);
        }

        /* access modifiers changed from: private */
        /* renamed from: s */
        public void m47339s() {
            List<C10487a> j = mo28055j();
            long k = m47333k();
            C8338d3.C8384r0 r0Var = C8338d3.C8384r0.DEBUG;
            C8338d3.m46492a(r0Var, getClass().getSimpleName() + ":sendUnsentTimeNow with time: " + k + " and influences: " + j.toString());
            m47340t(C8541a.BACKGROUND);
        }

        /* access modifiers changed from: private */
        /* renamed from: t */
        public void m47340t(C8541a aVar) {
            if (!C8338d3.m46498b1()) {
                C8338d3.C8384r0 r0Var = C8338d3.C8384r0.WARN;
                C8338d3.m46492a(r0Var, getClass().getSimpleName() + ":sendUnsentTimeNow not possible due to user id null");
                return;
            }
            mo28057r(aVar);
        }

        /* access modifiers changed from: private */
        /* renamed from: v */
        public void m47341v() {
            if (m47334l()) {
                mo28058u();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: h */
        public void mo28054h(JSONObject jSONObject) {
        }

        /* access modifiers changed from: protected */
        /* renamed from: j */
        public abstract List<C10487a> mo28055j();

        /* access modifiers changed from: protected */
        /* renamed from: m */
        public abstract void mo28056m(List<C10487a> list);

        /* access modifiers changed from: protected */
        /* renamed from: r */
        public abstract void mo28057r(C8541a aVar);

        /* access modifiers changed from: protected */
        /* renamed from: u */
        public void mo28058u() {
            if (!this.f35856d.get()) {
                synchronized (this.f35856d) {
                    this.f35856d.set(true);
                    if (m47334l()) {
                        m47337p(m47333k());
                    }
                    this.f35856d.set(false);
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: w */
        public void mo28059w() {
            if (m47334l()) {
                C8587r2.m47596q().mo28188s(C8338d3.f35438f);
            }
        }
    }

    /* renamed from: com.onesignal.p$d */
    /* compiled from: FocusTimeController */
    static class C8545d extends C8543c {
        C8545d() {
            this.f35853a = 60;
            this.f35854b = "GT_UNSENT_ACTIVE_TIME";
        }

        /* access modifiers changed from: protected */
        /* renamed from: j */
        public List<C10487a> mo28055j() {
            return new ArrayList();
        }

        /* access modifiers changed from: protected */
        /* renamed from: m */
        public void mo28056m(List<C10487a> list) {
        }

        /* access modifiers changed from: protected */
        /* renamed from: r */
        public void mo28057r(C8541a aVar) {
            C8338d3.C8384r0 r0Var = C8338d3.C8384r0.DEBUG;
            C8338d3.m46594z1(r0Var, getClass().getSimpleName() + " sendTime with: " + aVar);
            if (!aVar.equals(C8541a.END_SESSION)) {
                mo28059w();
            }
        }
    }

    C8540p(C8631v0 v0Var, C8547p1 p1Var) {
        this.f35848b = v0Var;
        this.f35849c = p1Var;
    }

    /* renamed from: e */
    private Long m47314e() {
        if (this.f35847a == null) {
            return null;
        }
        long a = (long) ((((double) (C8338d3.m46448M0().mo28280a() - this.f35847a.longValue())) / 1000.0d) + 0.5d);
        if (a < 1 || a > 86400) {
            return null;
        }
        return Long.valueOf(a);
    }

    /* renamed from: f */
    private boolean m47315f(List<C10487a> list, C8541a aVar) {
        Long e = m47314e();
        if (e == null) {
            return false;
        }
        this.f35848b.mo28246c(list).m47331g(e.longValue(), list, aVar);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo28049a() {
        C8547p1 p1Var = this.f35849c;
        p1Var.mo28016d("Application backgrounded focus time: " + this.f35847a);
        this.f35848b.mo28245b().m47339s();
        this.f35847a = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo28050b() {
        this.f35847a = Long.valueOf(C8338d3.m46448M0().mo28280a());
        C8547p1 p1Var = this.f35849c;
        p1Var.mo28016d("Application foregrounded focus time: " + this.f35847a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo28051c() {
        Long e = m47314e();
        C8547p1 p1Var = this.f35849c;
        p1Var.mo28016d("Application stopped focus time: " + this.f35847a + " timeElapsed: " + e);
        if (e != null) {
            List<C10487a> f = C8338d3.m46432I0().mo27958f();
            this.f35848b.mo28246c(f).m47335n(e.longValue(), f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo28052d() {
        if (!C8338d3.m46518g1()) {
            this.f35848b.mo28245b().m47341v();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo28053g(List<C10487a> list) {
        C8541a aVar = C8541a.END_SESSION;
        if (!m47315f(list, aVar)) {
            this.f35848b.mo28246c(list).m47340t(aVar);
        }
    }
}
