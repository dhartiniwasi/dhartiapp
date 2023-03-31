package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.measurement.wb */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
final class C7237wb implements PrivilegedExceptionAction {
    C7237wb() {
    }

    /* renamed from: a */
    public static final Unsafe m41070a() throws Exception {
        Class<Unsafe> cls = Unsafe.class;
        for (Field field : cls.getDeclaredFields()) {
            field.setAccessible(true);
            Object obj = field.get((Object) null);
            if (cls.isInstance(obj)) {
                return cls.cast(obj);
            }
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ Object run() throws Exception {
        return m41070a();
    }
}
