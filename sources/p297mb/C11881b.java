package p297mb;

import android.util.Log;

/* renamed from: mb.b */
/* compiled from: Log */
public class C11881b {
    /* renamed from: a */
    public static void m57383a(String str, String str2) {
    }

    /* renamed from: b */
    public static void m57384b(String str, String str2) {
        Log.e(str, str2);
    }

    /* renamed from: c */
    public static void m57385c(String str, String str2, Throwable th) {
        Log.e(str, str2, th);
    }

    /* renamed from: d */
    public static String m57386d(Throwable th) {
        return Log.getStackTraceString(th);
    }

    /* renamed from: e */
    public static void m57387e(String str, String str2) {
    }

    /* renamed from: f */
    public static void m57388f(String str, String str2) {
    }

    /* renamed from: g */
    public static void m57389g(String str, String str2) {
        Log.w(str, str2);
    }

    /* renamed from: h */
    public static void m57390h(String str, String str2, Throwable th) {
        Log.w(str, str2, th);
    }

    /* renamed from: i */
    public static void m57391i(String str, String str2) {
        Log.wtf(str, str2);
    }
}
