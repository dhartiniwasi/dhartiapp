package com.onesignal;

import org.json.JSONException;
import org.json.JSONObject;

public class OSSubscriptionState implements Cloneable {

    /* renamed from: a */
    private C8311b2<Object, OSSubscriptionState> f35279a = new C8311b2<>("changed", false);

    /* renamed from: b */
    private String f35280b;

    /* renamed from: c */
    private String f35281c;

    /* renamed from: d */
    private boolean f35282d;

    /* renamed from: e */
    private boolean f35283e;

    OSSubscriptionState(boolean z, boolean z2) {
        if (z) {
            String str = C8500m3.f35731a;
            this.f35283e = C8500m3.m47103b(str, "ONESIGNAL_SUBSCRIPTION_LAST", true);
            this.f35280b = C8500m3.m47107f(str, "ONESIGNAL_PLAYER_ID_LAST", (String) null);
            this.f35281c = C8500m3.m47107f(str, "ONESIGNAL_PUSH_TOKEN_LAST", (String) null);
            this.f35282d = C8500m3.m47103b(str, "ONESIGNAL_PERMISSION_ACCEPTED_LAST", false);
            return;
        }
        this.f35283e = !C8592r3.m47624k();
        this.f35280b = C8338d3.m46463Q0();
        this.f35281c = C8592r3.m47619f();
        this.f35282d = z2;
    }

    /* renamed from: h */
    private void m46157h(boolean z) {
        boolean f = mo27549f();
        this.f35282d = z;
        if (f != mo27549f()) {
            this.f35279a.mo27630c(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo27542a(OSSubscriptionState oSSubscriptionState) {
        if (this.f35283e == oSSubscriptionState.f35283e) {
            String str = this.f35280b;
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            String str3 = oSSubscriptionState.f35280b;
            if (str3 == null) {
                str3 = str2;
            }
            if (str.equals(str3)) {
                String str4 = this.f35281c;
                if (str4 == null) {
                    str4 = str2;
                }
                String str5 = oSSubscriptionState.f35281c;
                if (str5 != null) {
                    str2 = str5;
                }
                return !str4.equals(str2) || this.f35282d != oSSubscriptionState.f35282d;
            }
        }
    }

    /* renamed from: b */
    public C8311b2<Object, OSSubscriptionState> mo27543b() {
        return this.f35279a;
    }

    /* renamed from: c */
    public String mo27544c() {
        return this.f35281c;
    }

    /* access modifiers changed from: package-private */
    public void changed(C8419f2 f2Var) {
        m46157h(f2Var.mo27781a());
    }

    /* access modifiers changed from: protected */
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* renamed from: d */
    public String mo27547d() {
        return this.f35280b;
    }

    /* renamed from: e */
    public boolean mo27548e() {
        return this.f35283e;
    }

    /* renamed from: f */
    public boolean mo27549f() {
        return this.f35280b != null && this.f35281c != null && !this.f35283e && this.f35282d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo27550g() {
        String str = C8500m3.f35731a;
        C8500m3.m47111j(str, "ONESIGNAL_SUBSCRIPTION_LAST", this.f35283e);
        C8500m3.m47114m(str, "ONESIGNAL_PLAYER_ID_LAST", this.f35280b);
        C8500m3.m47114m(str, "ONESIGNAL_PUSH_TOKEN_LAST", this.f35281c);
        C8500m3.m47111j(str, "ONESIGNAL_PERMISSION_ACCEPTED_LAST", this.f35282d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo27551i(boolean z) {
        boolean z2 = this.f35283e != z;
        this.f35283e = z;
        if (z2) {
            this.f35279a.mo27630c(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo27552j(String str) {
        if (str != null) {
            boolean z = !str.equals(this.f35281c);
            this.f35281c = str;
            if (z) {
                this.f35279a.mo27630c(this);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo27553k(String str) {
        boolean z = true;
        if (str != null ? str.equals(this.f35280b) : this.f35280b == null) {
            z = false;
        }
        this.f35280b = str;
        if (z) {
            this.f35279a.mo27630c(this);
        }
    }

    /* renamed from: l */
    public JSONObject mo27554l() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f35280b;
            if (str != null) {
                jSONObject.put("userId", str);
            } else {
                jSONObject.put("userId", JSONObject.NULL);
            }
            String str2 = this.f35281c;
            if (str2 != null) {
                jSONObject.put("pushToken", str2);
            } else {
                jSONObject.put("pushToken", JSONObject.NULL);
            }
            jSONObject.put("isPushDisabled", mo27548e());
            jSONObject.put("isSubscribed", mo27549f());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        return mo27554l().toString();
    }
}
