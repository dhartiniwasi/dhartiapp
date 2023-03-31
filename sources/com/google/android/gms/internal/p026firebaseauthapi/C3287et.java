package com.google.android.gms.internal.p026firebaseauthapi;

import java.lang.reflect.Type;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.et */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3287et {
    /* renamed from: a */
    public static Object m25533a(String str, Type type) throws C3219cr {
        if (type == String.class) {
            try {
                C3881wu wuVar = new C3881wu();
                wuVar.mo17013a(str);
                if (wuVar.mo17015c()) {
                    return wuVar.mo17014b();
                }
                throw new C3219cr("No error message: " + str);
            } catch (Exception e) {
                throw new C3219cr("Json conversion failed! ".concat(String.valueOf(e.getMessage())), e);
            }
        } else if (type == Void.class) {
            return null;
        } else {
            try {
                C3353gt gtVar = (C3353gt) ((Class) type).getConstructor(new Class[0]).newInstance(new Object[0]);
                try {
                    gtVar.mo15920f(str);
                    return gtVar;
                } catch (Exception e2) {
                    throw new C3219cr("Json conversion failed! ".concat(String.valueOf(e2.getMessage())), e2);
                }
            } catch (Exception e3) {
                throw new C3219cr("Instantiation of JsonResponse failed! ".concat(type.toString()), e3);
            }
        }
    }
}
