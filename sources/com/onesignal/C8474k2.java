package com.onesignal;

import org.json.JSONObject;

/* renamed from: com.onesignal.k2 */
/* compiled from: OSSMSSubscriptionState */
public class C8474k2 implements Cloneable {

    /* renamed from: a */
    private C8311b2<Object, C8474k2> f35668a = new C8311b2<>("changed", false);

    /* renamed from: b */
    private String f35669b;

    /* renamed from: c */
    private String f35670c;

    C8474k2(boolean z) {
        if (z) {
            String str = C8500m3.f35731a;
            this.f35669b = C8500m3.m47107f(str, "PREFS_OS_SMS_ID_LAST", (String) null);
            this.f35670c = C8500m3.m47107f(str, "PREFS_OS_SMS_NUMBER_LAST", (String) null);
            return;
        }
        this.f35669b = C8338d3.m46404B0();
        this.f35670c = C8592r3.m47620g().mo28027E();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo27889a() {
        boolean z = (this.f35669b == null && this.f35670c == null) ? false : true;
        this.f35669b = null;
        this.f35670c = null;
        if (z) {
            this.f35668a.mo27630c(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo27890b(C8474k2 k2Var) {
        String str = this.f35669b;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        String str3 = k2Var.f35669b;
        if (str3 == null) {
            str3 = str2;
        }
        if (str.equals(str3)) {
            String str4 = this.f35670c;
            if (str4 == null) {
                str4 = str2;
            }
            String str5 = k2Var.f35670c;
            if (str5 != null) {
                str2 = str5;
            }
            return !str4.equals(str2);
        }
    }

    /* renamed from: c */
    public C8311b2<Object, C8474k2> mo27891c() {
        return this.f35668a;
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
    public String mo27893d() {
        return this.f35670c;
    }

    /* renamed from: e */
    public String mo27894e() {
        return this.f35669b;
    }

    /* renamed from: f */
    public boolean mo27895f() {
        return (this.f35669b == null || this.f35670c == null) ? false : true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo27896g() {
        String str = C8500m3.f35731a;
        C8500m3.m47114m(str, "PREFS_OS_SMS_ID_LAST", this.f35669b);
        C8500m3.m47114m(str, "PREFS_OS_SMS_NUMBER_LAST", this.f35670c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo27897h(String str) {
        boolean z = !str.equals(this.f35670c);
        this.f35670c = str;
        if (z) {
            this.f35668a.mo27630c(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo27898i(String str) {
        boolean z = true;
        if (str != null ? str.equals(this.f35669b) : this.f35669b == null) {
            z = false;
        }
        this.f35669b = str;
        if (z) {
            this.f35668a.mo27630c(this);
        }
    }

    /* renamed from: j */
    public JSONObject mo27899j() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f35669b;
            if (str != null) {
                jSONObject.put("smsUserId", str);
            } else {
                jSONObject.put("smsUserId", JSONObject.NULL);
            }
            String str2 = this.f35670c;
            if (str2 != null) {
                jSONObject.put("smsNumber", str2);
            } else {
                jSONObject.put("smsNumber", JSONObject.NULL);
            }
            jSONObject.put("isSubscribed", mo27895f());
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        return mo27899j().toString();
    }
}
