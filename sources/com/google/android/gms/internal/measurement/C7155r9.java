package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.r9 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public enum C7155r9 {
    VOID(Void.class, Void.class, (Class) null),
    INT(r1, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, Boolean.FALSE),
    STRING(String.class, String.class, ""),
    BYTE_STRING(C6977g8.class, C6977g8.class, C6977g8.f31702b),
    ENUM(r1, Integer.class, (Class) null),
    MESSAGE(Object.class, Object.class, (Class) null);
    

    /* renamed from: a */
    private final Class f32021a;

    /* renamed from: b */
    private final Class f32022b;

    /* renamed from: c */
    private final Object f32023c;

    private C7155r9(Class cls, Class cls2, Object obj) {
        this.f32021a = cls;
        this.f32022b = cls2;
        this.f32023c = obj;
    }

    /* renamed from: a */
    public final Class mo23818a() {
        return this.f32022b;
    }
}
