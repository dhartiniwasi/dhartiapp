package com.google.android.gms.internal.p026firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.s2 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public enum C3722s2 {
    VOID(Void.class, Void.class, (Class) null),
    INT(r1, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, Boolean.FALSE),
    STRING(String.class, String.class, ""),
    BYTE_STRING(C3325g1.class, C3325g1.class, C3325g1.f22056b),
    ENUM(r1, Integer.class, (Class) null),
    MESSAGE(Object.class, Object.class, (Class) null);
    

    /* renamed from: a */
    private final Class f22662a;

    /* renamed from: b */
    private final Class f22663b;

    /* renamed from: c */
    private final Object f22664c;

    private C3722s2(Class cls, Class cls2, Object obj) {
        this.f22662a = cls;
        this.f22663b = cls2;
        this.f22664c = obj;
    }

    /* renamed from: a */
    public final Class mo16730a() {
        return this.f22663b;
    }
}
