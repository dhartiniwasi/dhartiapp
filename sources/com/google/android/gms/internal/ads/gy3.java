package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public enum gy3 {
    VOID(Void.class, Void.class, (Class) null),
    INT(r1, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, Boolean.FALSE),
    STRING(String.class, String.class, ""),
    BYTE_STRING(jw3.class, jw3.class, jw3.f11808b),
    ENUM(r1, Integer.class, (Class) null),
    MESSAGE(Object.class, Object.class, (Class) null);
    

    /* renamed from: a */
    private final Class f10106a;

    /* renamed from: b */
    private final Class f10107b;

    /* renamed from: c */
    private final Object f10108c;

    private gy3(Class cls, Class cls2, Object obj) {
        this.f10106a = cls;
        this.f10107b = cls2;
        this.f10108c = obj;
    }

    /* renamed from: a */
    public final Class mo10679a() {
        return this.f10107b;
    }
}
