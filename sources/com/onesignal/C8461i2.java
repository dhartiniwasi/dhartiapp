package com.onesignal;

import com.onesignal.C8508n3;
import p240ga.C10306f;

/* renamed from: com.onesignal.i2 */
/* compiled from: OSRemoteParamController */
class C8461i2 {

    /* renamed from: a */
    private C8508n3.C8515f f35663a = null;

    C8461i2() {
    }

    /* renamed from: q */
    private void m46880q(boolean z) {
        C8500m3.m47111j(C8500m3.f35731a, "PREFS_OS_RECEIVE_RECEIPTS_ENABLED", z);
    }

    /* renamed from: s */
    private void m46881s(boolean z) {
        C8500m3.m47111j(C8500m3.f35731a, "OS_RESTORE_TTL_FILTER", this.f35663a.f35766h);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo27842a() {
        this.f35663a = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo27843b() {
        return C8500m3.m47103b(C8500m3.f35731a, "OS_CLEAR_GROUP_SUMMARY_CLICK", true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo27844c() {
        return C8500m3.m47103b(C8500m3.f35731a, "GT_FIREBASE_TRACKING_ENABLED", false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C8508n3.C8515f mo27845d() {
        return this.f35663a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo27846e() {
        return C8500m3.m47103b(C8500m3.f35731a, "ONESIGNAL_USER_PROVIDED_CONSENT", false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo27847f() {
        C8508n3.C8515f fVar = this.f35663a;
        return (fVar == null || fVar.f35771m == null) ? false : true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo27848g() {
        C8508n3.C8515f fVar = this.f35663a;
        return (fVar == null || fVar.f35772n == null) ? false : true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo27849h() {
        return C8500m3.m47103b(C8500m3.f35731a, "PREFS_OS_DISABLE_GMS_MISSING_PROMPT", false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo27850i() {
        return C8500m3.m47103b(C8500m3.f35731a, "PREFS_OS_LOCATION_SHARED", true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean mo27851j() {
        return C8500m3.m47103b(C8500m3.f35731a, "PREFS_OS_REQUIRES_USER_PRIVACY_CONSENT", false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public boolean mo27852k() {
        return C8500m3.m47103b(C8500m3.f35731a, "PREFS_OS_RECEIVE_RECEIPTS_ENABLED", false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public boolean mo27853l() {
        return this.f35663a != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean mo27854m() {
        return C8500m3.m47103b(C8500m3.f35731a, "OS_RESTORE_TTL_FILTER", true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo27855n(boolean z) {
        C8500m3.m47111j(C8500m3.f35731a, "PREFS_OS_DISABLE_GMS_MISSING_PROMPT", z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo27856o(boolean z) {
        C8500m3.m47111j(C8500m3.f35731a, "PREFS_OS_LOCATION_SHARED", z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo27857p(boolean z) {
        C8500m3.m47111j(C8500m3.f35731a, "PREFS_OS_REQUIRES_USER_PRIVACY_CONSENT", z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo27858r(C8508n3.C8515f fVar, C10306f fVar2, C8507n2 n2Var, C8547p1 p1Var) {
        this.f35663a = fVar;
        String str = C8500m3.f35731a;
        C8500m3.m47111j(str, "GT_FIREBASE_TRACKING_ENABLED", fVar.f35765g);
        m46881s(fVar.f35766h);
        C8500m3.m47111j(str, "OS_CLEAR_GROUP_SUMMARY_CLICK", fVar.f35767i);
        C8500m3.m47111j(str, n2Var.mo27983h(), fVar.f35773o.f35758h);
        m46880q(fVar.f35768j);
        p1Var.mo28016d("OneSignal saveInfluenceParams: " + fVar.f35773o.toString());
        fVar2.mo33152j(fVar.f35773o);
        Boolean bool = fVar.f35769k;
        if (bool != null) {
            mo27855n(bool.booleanValue());
        }
        Boolean bool2 = fVar.f35770l;
        if (bool2 != null) {
            mo27859t(bool2.booleanValue());
        }
        Boolean bool3 = fVar.f35771m;
        if (bool3 != null) {
            C8338d3.m46434I2(bool3.booleanValue());
        }
        Boolean bool4 = fVar.f35772n;
        if (bool4 != null) {
            mo27857p(bool4.booleanValue());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo27859t(boolean z) {
        C8500m3.m47111j(C8500m3.f35731a, "PREFS_OS_UNSUBSCRIBE_WHEN_NOTIFICATIONS_DISABLED", z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo27860u(boolean z) {
        C8500m3.m47111j(C8500m3.f35731a, "ONESIGNAL_USER_PROVIDED_CONSENT", z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public boolean mo27861v() {
        return C8500m3.m47103b(C8500m3.f35731a, "PREFS_OS_UNSUBSCRIBE_WHEN_NOTIFICATIONS_DISABLED", true);
    }
}
