package androidx.core.app;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;

/* renamed from: androidx.core.app.e */
/* compiled from: AppOpsManagerCompat */
public final class C0629e {

    /* renamed from: androidx.core.app.e$a */
    /* compiled from: AppOpsManagerCompat */
    static class C0630a {
        /* renamed from: a */
        static <T> T m2953a(Context context, Class<T> cls) {
            return context.getSystemService(cls);
        }

        /* renamed from: b */
        static int m2954b(AppOpsManager appOpsManager, String str, String str2) {
            return appOpsManager.noteProxyOp(str, str2);
        }

        /* renamed from: c */
        static int m2955c(AppOpsManager appOpsManager, String str, String str2) {
            return appOpsManager.noteProxyOpNoThrow(str, str2);
        }

        /* renamed from: d */
        static String m2956d(String str) {
            return AppOpsManager.permissionToOp(str);
        }
    }

    /* renamed from: androidx.core.app.e$b */
    /* compiled from: AppOpsManagerCompat */
    static class C0631b {
        /* renamed from: a */
        static int m2957a(AppOpsManager appOpsManager, String str, int i, String str2) {
            if (appOpsManager == null) {
                return 1;
            }
            return appOpsManager.checkOpNoThrow(str, i, str2);
        }

        /* renamed from: b */
        static String m2958b(Context context) {
            return context.getOpPackageName();
        }

        /* renamed from: c */
        static AppOpsManager m2959c(Context context) {
            return (AppOpsManager) context.getSystemService(AppOpsManager.class);
        }
    }

    /* renamed from: a */
    public static int m2950a(Context context, int i, String str, String str2) {
        if (Build.VERSION.SDK_INT < 29) {
            return m2951b(context, str, str2);
        }
        AppOpsManager c = C0631b.m2959c(context);
        int a = C0631b.m2957a(c, str, Binder.getCallingUid(), str2);
        if (a != 0) {
            return a;
        }
        return C0631b.m2957a(c, str, i, C0631b.m2958b(context));
    }

    /* renamed from: b */
    public static int m2951b(Context context, String str, String str2) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C0630a.m2955c((AppOpsManager) C0630a.m2953a(context, AppOpsManager.class), str, str2);
        }
        return 1;
    }

    /* renamed from: c */
    public static String m2952c(String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C0630a.m2956d(str);
        }
        return null;
    }
}
