package com.google.firebase.auth;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p033d5.C4141r;

/* renamed from: com.google.firebase.auth.f */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public class C7798f {

    /* renamed from: g */
    private static final Map f34128g;

    /* renamed from: a */
    private final String f34129a;

    /* renamed from: b */
    private final String f34130b;

    /* renamed from: c */
    private final String f34131c;

    /* renamed from: d */
    private final String f34132d;

    /* renamed from: e */
    private final String f34133e;

    /* renamed from: f */
    private final String f34134f;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("recoverEmail", 2);
        hashMap.put("resetPassword", 0);
        hashMap.put("signIn", 4);
        hashMap.put("verifyEmail", 1);
        hashMap.put("verifyBeforeChangeEmail", 5);
        hashMap.put("revertSecondFactorAddition", 6);
        f34128g = Collections.unmodifiableMap(hashMap);
    }

    private C7798f(String str) {
        String e = m43368e(str, "apiKey");
        String e2 = m43368e(str, "oobCode");
        String e3 = m43368e(str, "mode");
        if (e == null || e2 == null || e3 == null) {
            throw new IllegalArgumentException(String.format("%s, %s and %s are required in a valid action code URL", new Object[]{"apiKey", "oobCode", "mode"}));
        }
        this.f34129a = C4141r.m28217g(e);
        this.f34130b = C4141r.m28217g(e2);
        this.f34131c = C4141r.m28217g(e3);
        this.f34132d = m43368e(str, "continueUrl");
        this.f34133e = m43368e(str, "languageCode");
        this.f34134f = m43368e(str, "tenantId");
    }

    /* renamed from: c */
    public static C7798f m43367c(String str) {
        C4141r.m28217g(str);
        try {
            return new C7798f(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: e */
    private static String m43368e(String str, String str2) {
        Uri parse = Uri.parse(str);
        try {
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            if (queryParameterNames.contains(str2)) {
                return parse.getQueryParameter(str2);
            }
            if (queryParameterNames.contains("link")) {
                return Uri.parse(C4141r.m28217g(parse.getQueryParameter("link"))).getQueryParameter(str2);
            }
            return null;
        } catch (NullPointerException | UnsupportedOperationException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public String mo26092a() {
        return this.f34130b;
    }

    /* renamed from: b */
    public int mo26093b() {
        Map map = f34128g;
        if (map.containsKey(this.f34131c)) {
            return ((Integer) map.get(this.f34131c)).intValue();
        }
        return 3;
    }

    /* renamed from: d */
    public final String mo26094d() {
        return this.f34134f;
    }
}
