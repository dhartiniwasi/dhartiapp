package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.d9 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
final class C6927d9 implements C7060la {

    /* renamed from: a */
    private static final C6927d9 f31645a = new C6927d9();

    private C6927d9() {
    }

    /* renamed from: c */
    public static C6927d9 m39932c() {
        return f31645a;
    }

    /* renamed from: a */
    public final C7044ka mo23333a(Class cls) {
        Class<C6995h9> cls2 = C6995h9.class;
        if (cls2.isAssignableFrom(cls)) {
            try {
                return (C7044ka) C6995h9.m40152A(cls.asSubclass(cls2)).mo23001B(3, (Object) null, (Object) null);
            } catch (Exception e) {
                throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
            }
        } else {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
    }

    /* renamed from: b */
    public final boolean mo23334b(Class cls) {
        return C6995h9.class.isAssignableFrom(cls);
    }
}
