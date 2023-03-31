package com.google.android.gms.internal.p026firebaseauthapi;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.w3 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3854w3 {

    /* renamed from: c */
    private static final C3854w3 f22857c = new C3854w3();

    /* renamed from: a */
    private final C3163b4 f22858a = new C3327g3();

    /* renamed from: b */
    private final ConcurrentMap f22859b = new ConcurrentHashMap();

    private C3854w3() {
    }

    /* renamed from: a */
    public static C3854w3 m27268a() {
        return f22857c;
    }

    /* renamed from: b */
    public final C3130a4 mo16976b(Class cls) {
        C3623p2.m26442f(cls, "messageType");
        C3130a4 a4Var = (C3130a4) this.f22859b.get(cls);
        if (a4Var == null) {
            a4Var = this.f22858a.mo15770c(cls);
            C3623p2.m26442f(cls, "messageType");
            C3623p2.m26442f(a4Var, "schema");
            C3130a4 a4Var2 = (C3130a4) this.f22859b.putIfAbsent(cls, a4Var);
            return a4Var2 == null ? a4Var : a4Var2;
        }
    }
}
