package com.onesignal;

import org.json.JSONObject;

/* renamed from: com.onesignal.f2 */
/* compiled from: OSPermissionState */
public class C8419f2 implements Cloneable {

    /* renamed from: a */
    private C8311b2<Object, C8419f2> f35594a = new C8311b2<>("changed", false);

    /* renamed from: b */
    private boolean f35595b;

    C8419f2(boolean z) {
        if (z) {
            this.f35595b = C8500m3.m47103b(C8500m3.f35731a, "ONESIGNAL_ACCEPTED_NOTIFICATION_LAST", false);
        } else {
            mo27786e();
        }
    }

    /* renamed from: f */
    private void m46692f(boolean z) {
        boolean z2 = this.f35595b != z;
        this.f35595b = z;
        if (z2) {
            this.f35594a.mo27630c(this);
        }
    }

    /* renamed from: a */
    public boolean mo27781a() {
        return this.f35595b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo27782b(C8419f2 f2Var) {
        return this.f35595b != f2Var.f35595b;
    }

    /* renamed from: c */
    public C8311b2<Object, C8419f2> mo27783c() {
        return this.f35594a;
    }

    /* access modifiers changed from: protected */
    public Object clone() {
        try {
            return super.clone();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo27785d() {
        C8500m3.m47111j(C8500m3.f35731a, "ONESIGNAL_ACCEPTED_NOTIFICATION_LAST", this.f35595b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo27786e() {
        m46692f(OSUtils.m46194a(C8338d3.f35438f));
    }

    /* renamed from: g */
    public JSONObject mo27787g() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("areNotificationsEnabled", this.f35595b);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        return mo27787g().toString();
    }
}
