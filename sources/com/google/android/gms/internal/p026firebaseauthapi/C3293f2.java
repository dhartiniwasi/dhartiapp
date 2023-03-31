package com.google.android.gms.internal.p026firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.f2 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3293f2 implements C3525m3 {

    /* renamed from: a */
    private static final C3293f2 f22016a = new C3293f2();

    private C3293f2() {
    }

    /* renamed from: c */
    public static C3293f2 m25544c() {
        return f22016a;
    }

    /* renamed from: a */
    public final C3492l3 mo15979a(Class cls) {
        Class<C3425j2> cls2 = C3425j2.class;
        if (cls2.isAssignableFrom(cls)) {
            try {
                return (C3492l3) C3425j2.m25866u(cls.asSubclass(cls2)).mo15734q(3, (Object) null, (Object) null);
            } catch (Exception e) {
                throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
            }
        } else {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
    }

    /* renamed from: b */
    public final boolean mo15980b(Class cls) {
        return C3425j2.class.isAssignableFrom(cls);
    }
}
