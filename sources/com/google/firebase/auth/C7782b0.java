package com.google.firebase.auth;

import java.util.Map;

/* renamed from: com.google.firebase.auth.b0 */
/* compiled from: com.google.firebase:firebase-auth-interop@@20.0.0 */
public class C7782b0 {

    /* renamed from: a */
    private String f34102a;

    /* renamed from: b */
    private Map<String, Object> f34103b;

    public C7782b0(String str, Map<String, Object> map) {
        this.f34102a = str;
        this.f34103b = map;
    }

    /* renamed from: h */
    private final long m43313h(String str) {
        Integer num = (Integer) this.f34103b.get(str);
        if (num == null) {
            return 0;
        }
        return num.longValue();
    }

    /* renamed from: a */
    public long mo26053a() {
        return m43313h("auth_time");
    }

    /* renamed from: b */
    public Map<String, Object> mo26054b() {
        return this.f34103b;
    }

    /* renamed from: c */
    public long mo26055c() {
        return m43313h("exp");
    }

    /* renamed from: d */
    public long mo26056d() {
        return m43313h("iat");
    }

    /* renamed from: e */
    public String mo26057e() {
        Map map = (Map) this.f34103b.get("firebase");
        if (map != null) {
            return (String) map.get("sign_in_provider");
        }
        return null;
    }

    /* renamed from: f */
    public String mo26058f() {
        Map map = (Map) this.f34103b.get("firebase");
        if (map != null) {
            return (String) map.get("sign_in_second_factor");
        }
        return null;
    }

    /* renamed from: g */
    public String mo26059g() {
        return this.f34102a;
    }
}
