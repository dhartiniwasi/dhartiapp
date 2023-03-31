package com.google.android.gms.internal.ads;

import android.util.Log;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.ads.ba */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2208ba {

    /* renamed from: a */
    public static final String f7180a = "Volley";

    /* renamed from: b */
    public static final boolean f7181b = Log.isLoggable(f7180a, 2);

    /* renamed from: c */
    private static final String f7182c = C2208ba.class.getName();

    /* renamed from: a */
    public static void m10257a(String str, Object... objArr) {
        Log.d(f7180a, m10261e(str, objArr));
    }

    /* renamed from: b */
    public static void m10258b(String str, Object... objArr) {
        Log.e(f7180a, m10261e(str, objArr));
    }

    /* renamed from: c */
    public static void m10259c(Throwable th, String str, Object... objArr) {
        Log.e(f7180a, m10261e(str, objArr), th);
    }

    /* renamed from: d */
    public static void m10260d(String str, Object... objArr) {
        if (f7181b) {
            Log.v(f7180a, m10261e(str, objArr));
        }
    }

    /* renamed from: e */
    private static String m10261e(String str, Object... objArr) {
        String str2;
        String format = String.format(Locale.US, str, objArr);
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i = 2;
        while (true) {
            if (i >= stackTrace.length) {
                str2 = "<unknown>";
                break;
            } else if (!stackTrace[i].getClassName().equals(f7182c)) {
                String className = stackTrace[i].getClassName();
                String substring = className.substring(className.lastIndexOf(46) + 1);
                str2 = substring.substring(substring.lastIndexOf(36) + 1) + "." + stackTrace[i].getMethodName();
                break;
            } else {
                i++;
            }
        }
        return String.format(Locale.US, "[%d] %s: %s", new Object[]{Long.valueOf(Thread.currentThread().getId()), str2, format});
    }
}
