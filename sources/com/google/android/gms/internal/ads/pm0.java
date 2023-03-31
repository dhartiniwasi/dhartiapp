package com.google.android.gms.internal.ads;

import android.util.Log;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public class pm0 {

    /* renamed from: a */
    protected static final p83 f15914a = p83.m18399b(4000);

    /* renamed from: a */
    static String m18661a(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length < 4) {
            return str;
        }
        int lineNumber = stackTrace[3].getLineNumber();
        return str + " @" + lineNumber;
    }

    /* renamed from: b */
    public static void m18662b(String str) {
        if (!m18670j(3)) {
            return;
        }
        if (str.length() <= 4000) {
            Log.d("Ads", str);
            return;
        }
        boolean z = true;
        for (String str2 : f15914a.mo13167d(str)) {
            if (z) {
                Log.d("Ads", str2);
            } else {
                Log.d("Ads-cont", str2);
            }
            z = false;
        }
    }

    /* renamed from: c */
    public static void m18663c(String str, Throwable th) {
        if (m18670j(3)) {
            Log.d("Ads", str, th);
        }
    }

    /* renamed from: d */
    public static void m18664d(String str) {
        if (!m18670j(6)) {
            return;
        }
        if (str == null || str.length() <= 4000) {
            Log.e("Ads", str);
            return;
        }
        boolean z = true;
        for (String str2 : f15914a.mo13167d(str)) {
            if (z) {
                Log.e("Ads", str2);
            } else {
                Log.e("Ads-cont", str2);
            }
            z = false;
        }
    }

    /* renamed from: e */
    public static void m18665e(String str, Throwable th) {
        if (m18670j(6)) {
            Log.e("Ads", str, th);
        }
    }

    /* renamed from: f */
    public static void m18666f(String str) {
        if (!m18670j(4)) {
            return;
        }
        if (str == null || str.length() <= 4000) {
            Log.i("Ads", str);
            return;
        }
        boolean z = true;
        for (String str2 : f15914a.mo13167d(str)) {
            if (z) {
                Log.i("Ads", str2);
            } else {
                Log.i("Ads-cont", str2);
            }
            z = false;
        }
    }

    /* renamed from: g */
    public static void m18667g(String str) {
        if (!m18670j(5)) {
            return;
        }
        if (str == null || str.length() <= 4000) {
            Log.w("Ads", str);
            return;
        }
        boolean z = true;
        for (String str2 : f15914a.mo13167d(str)) {
            if (z) {
                Log.w("Ads", str2);
            } else {
                Log.w("Ads-cont", str2);
            }
            z = false;
        }
    }

    /* renamed from: h */
    public static void m18668h(String str, Throwable th) {
        if (m18670j(5)) {
            Log.w("Ads", str, th);
        }
    }

    /* renamed from: i */
    public static void m18669i(String str, Throwable th) {
        if (!m18670j(5)) {
            return;
        }
        if (th != null) {
            m18668h(m18661a(str), th);
        } else {
            m18667g(m18661a(str));
        }
    }

    /* renamed from: j */
    public static boolean m18670j(int i) {
        return i >= 5 || Log.isLoggable("Ads", i);
    }
}
