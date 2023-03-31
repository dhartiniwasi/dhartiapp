package com.onesignal;

import org.json.JSONObject;

/* renamed from: com.onesignal.t0 */
/* compiled from: OSEmailSubscriptionState */
public class C8609t0 implements Cloneable {

    /* renamed from: a */
    private C8311b2<Object, C8609t0> f36033a = new C8311b2<>("changed", false);

    /* renamed from: b */
    private String f36034b;

    /* renamed from: c */
    private String f36035c;

    C8609t0(boolean z) {
        if (z) {
            String str = C8500m3.f35731a;
            this.f36034b = C8500m3.m47107f(str, "PREFS_ONESIGNAL_EMAIL_ID_LAST", (String) null);
            this.f36035c = C8500m3.m47107f(str, "PREFS_ONESIGNAL_EMAIL_ADDRESS_LAST", (String) null);
            return;
        }
        this.f36034b = C8338d3.m46521h0();
        this.f36035c = C8592r3.m47616c().mo28027E();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo28208a() {
        boolean z = (this.f36034b == null && this.f36035c == null) ? false : true;
        this.f36034b = null;
        this.f36035c = null;
        if (z) {
            this.f36033a.mo27630c(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo28209b(C8609t0 t0Var) {
        String str = this.f36034b;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        String str3 = t0Var.f36034b;
        if (str3 == null) {
            str3 = str2;
        }
        if (str.equals(str3)) {
            String str4 = this.f36035c;
            if (str4 == null) {
                str4 = str2;
            }
            String str5 = t0Var.f36035c;
            if (str5 != null) {
                str2 = str5;
            }
            return !str4.equals(str2);
        }
    }

    /* renamed from: c */
    public String mo28210c() {
        return this.f36035c;
    }

    /* access modifiers changed from: protected */
    public Object clone() {
        try {
            return super.clone();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: d */
    public String mo28212d() {
        return this.f36034b;
    }

    /* renamed from: e */
    public C8311b2<Object, C8609t0> mo28213e() {
        return this.f36033a;
    }

    /* renamed from: f */
    public boolean mo28214f() {
        return (this.f36034b == null || this.f36035c == null) ? false : true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo28215g() {
        String str = C8500m3.f35731a;
        C8500m3.m47114m(str, "PREFS_ONESIGNAL_EMAIL_ID_LAST", this.f36034b);
        C8500m3.m47114m(str, "PREFS_ONESIGNAL_EMAIL_ADDRESS_LAST", this.f36035c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo28216h(String str) {
        boolean z = !str.equals(this.f36035c);
        this.f36035c = str;
        if (z) {
            this.f36033a.mo27630c(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo28217i(String str) {
        boolean z = true;
        if (str != null ? str.equals(this.f36034b) : this.f36034b == null) {
            z = false;
        }
        this.f36034b = str;
        if (z) {
            this.f36033a.mo27630c(this);
        }
    }

    /* renamed from: j */
    public JSONObject mo28218j() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f36034b;
            if (str != null) {
                jSONObject.put("emailUserId", str);
            } else {
                jSONObject.put("emailUserId", JSONObject.NULL);
            }
            String str2 = this.f36035c;
            if (str2 != null) {
                jSONObject.put("emailAddress", str2);
            } else {
                jSONObject.put("emailAddress", JSONObject.NULL);
            }
            jSONObject.put("isSubscribed", mo28214f());
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        return mo28218j().toString();
    }
}
