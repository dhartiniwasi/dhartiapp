package p126r1;

import android.os.Build;
import android.util.Log;

/* renamed from: r1.a */
/* compiled from: Logging */
public final class C5431a {
    /* renamed from: a */
    private static String m33266a(String str, String str2) {
        String str3 = str + str2;
        return str3.length() > 23 ? str3.substring(0, 23) : str3;
    }

    /* renamed from: b */
    public static void m33267b(String str, String str2, Object obj) {
        String e = m33270e(str);
        if (Log.isLoggable(e, 3)) {
            Log.d(e, String.format(str2, new Object[]{obj}));
        }
    }

    /* renamed from: c */
    public static void m33268c(String str, String str2, Object... objArr) {
        String e = m33270e(str);
        if (Log.isLoggable(e, 3)) {
            Log.d(e, String.format(str2, objArr));
        }
    }

    /* renamed from: d */
    public static void m33269d(String str, String str2, Throwable th) {
        String e = m33270e(str);
        if (Log.isLoggable(e, 6)) {
            Log.e(e, str2, th);
        }
    }

    /* renamed from: e */
    private static String m33270e(String str) {
        if (Build.VERSION.SDK_INT < 26) {
            return m33266a("TRuntime.", str);
        }
        return "TRuntime." + str;
    }

    /* renamed from: f */
    public static void m33271f(String str, String str2, Object obj) {
        String e = m33270e(str);
        if (Log.isLoggable(e, 4)) {
            Log.i(e, String.format(str2, new Object[]{obj}));
        }
    }

    /* renamed from: g */
    public static void m33272g(String str, String str2, Object obj) {
        String e = m33270e(str);
        if (Log.isLoggable(e, 5)) {
            Log.w(e, String.format(str2, new Object[]{obj}));
        }
    }
}
