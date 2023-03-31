package androidx.core.app;

import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.core.app.f */
/* compiled from: BundleCompat */
public final class C0632f {

    /* renamed from: androidx.core.app.f$a */
    /* compiled from: BundleCompat */
    static class C0633a {
        /* renamed from: a */
        static IBinder m2962a(Bundle bundle, String str) {
            return bundle.getBinder(str);
        }

        /* renamed from: b */
        static void m2963b(Bundle bundle, String str, IBinder iBinder) {
            bundle.putBinder(str, iBinder);
        }
    }

    /* renamed from: androidx.core.app.f$b */
    /* compiled from: BundleCompat */
    static class C0634b {

        /* renamed from: a */
        private static Method f2041a;

        /* renamed from: b */
        private static boolean f2042b;

        /* renamed from: c */
        private static Method f2043c;

        /* renamed from: d */
        private static boolean f2044d;

        /* renamed from: a */
        public static IBinder m2964a(Bundle bundle, String str) {
            if (!f2042b) {
                try {
                    Method method = Bundle.class.getMethod("getIBinder", new Class[]{String.class});
                    f2041a = method;
                    method.setAccessible(true);
                } catch (NoSuchMethodException e) {
                    Log.i("BundleCompatBaseImpl", "Failed to retrieve getIBinder method", e);
                }
                f2042b = true;
            }
            Method method2 = f2041a;
            if (method2 != null) {
                try {
                    return (IBinder) method2.invoke(bundle, new Object[]{str});
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
                    Log.i("BundleCompatBaseImpl", "Failed to invoke getIBinder via reflection", e2);
                    f2041a = null;
                }
            }
            return null;
        }

        /* renamed from: b */
        public static void m2965b(Bundle bundle, String str, IBinder iBinder) {
            if (!f2044d) {
                try {
                    Method method = Bundle.class.getMethod("putIBinder", new Class[]{String.class, IBinder.class});
                    f2043c = method;
                    method.setAccessible(true);
                } catch (NoSuchMethodException e) {
                    Log.i("BundleCompatBaseImpl", "Failed to retrieve putIBinder method", e);
                }
                f2044d = true;
            }
            Method method2 = f2043c;
            if (method2 != null) {
                try {
                    method2.invoke(bundle, new Object[]{str, iBinder});
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
                    Log.i("BundleCompatBaseImpl", "Failed to invoke putIBinder via reflection", e2);
                    f2043c = null;
                }
            }
        }
    }

    /* renamed from: a */
    public static IBinder m2960a(Bundle bundle, String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            return C0633a.m2962a(bundle, str);
        }
        return C0634b.m2964a(bundle, str);
    }

    /* renamed from: b */
    public static void m2961b(Bundle bundle, String str, IBinder iBinder) {
        if (Build.VERSION.SDK_INT >= 18) {
            C0633a.m2963b(bundle, str, iBinder);
        } else {
            C0634b.m2965b(bundle, str, iBinder);
        }
    }
}
