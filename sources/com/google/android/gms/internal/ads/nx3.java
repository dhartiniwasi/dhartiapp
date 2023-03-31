package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class nx3 implements az3 {

    /* renamed from: a */
    private static final nx3 f14228a = new nx3();

    private nx3() {
    }

    /* renamed from: c */
    public static nx3 m17325c() {
        return f14228a;
    }

    /* renamed from: a */
    public final zy3 mo8631a(Class cls) {
        Class<sx3> cls2 = sx3.class;
        if (cls2.isAssignableFrom(cls)) {
            try {
                return (zy3) sx3.m20704n(cls.asSubclass(cls2)).mo8196E(3, (Object) null, (Object) null);
            } catch (Exception e) {
                throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
            }
        } else {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
    }

    /* renamed from: b */
    public final boolean mo8632b(Class cls) {
        return sx3.class.isAssignableFrom(cls);
    }
}
