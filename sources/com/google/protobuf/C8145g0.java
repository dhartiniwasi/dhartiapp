package com.google.protobuf;

/* renamed from: com.google.protobuf.g0 */
/* compiled from: JavaType */
public enum C8145g0 {
    VOID(Void.class, Void.class, (Class<?>) null),
    INT(r1, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, Boolean.FALSE),
    STRING(String.class, String.class, ""),
    BYTE_STRING(C8153i.class, C8153i.class, C8153i.f34908b),
    ENUM(r1, Integer.class, (Class<?>) null),
    MESSAGE(Object.class, Object.class, (Class<?>) null);
    

    /* renamed from: a */
    private final Class<?> f34899a;

    /* renamed from: b */
    private final Class<?> f34900b;

    /* renamed from: c */
    private final Object f34901c;

    private C8145g0(Class<?> cls, Class<?> cls2, Object obj) {
        this.f34899a = cls;
        this.f34900b = cls2;
        this.f34901c = obj;
    }

    /* renamed from: a */
    public Class<?> mo26915a() {
        return this.f34900b;
    }
}
