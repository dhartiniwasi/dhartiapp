package p161w3;

import android.os.Bundle;
import android.os.IBinder;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: w3.b */
/* compiled from: BundleUtil */
public final class C5919b {

    /* renamed from: a */
    private static Method f29050a;

    /* renamed from: a */
    public static IBinder m34919a(Bundle bundle, String str) {
        if (C5953m0.f29110a >= 18) {
            return bundle.getBinder(str);
        }
        return m34920b(bundle, str);
    }

    /* renamed from: b */
    private static IBinder m34920b(Bundle bundle, String str) {
        Method method = f29050a;
        if (method == null) {
            try {
                Method method2 = Bundle.class.getMethod("getIBinder", new Class[]{String.class});
                f29050a = method2;
                method2.setAccessible(true);
                method = f29050a;
            } catch (NoSuchMethodException e) {
                C5961r.m35213g("BundleUtil", "Failed to retrieve getIBinder method", e);
                return null;
            }
        }
        try {
            return (IBinder) method.invoke(bundle, new Object[]{str});
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
            C5961r.m35213g("BundleUtil", "Failed to invoke getIBinder via reflection", e2);
            return null;
        }
    }
}
