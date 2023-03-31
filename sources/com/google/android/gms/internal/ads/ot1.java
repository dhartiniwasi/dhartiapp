package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class ot1 {

    /* renamed from: a */
    private static final Object f15350a = new Object();

    /* renamed from: b */
    private static final ns1 f15351b = ns1.f14182a;

    /* renamed from: a */
    public static void m18056a(String str, String str2) {
        synchronized (f15350a) {
            Log.d(str, str2);
        }
    }

    /* renamed from: b */
    public static void m18057b(String str, String str2) {
        synchronized (f15350a) {
            Log.e(str, str2);
        }
    }

    /* renamed from: c */
    public static void m18058c(String str, String str2, Throwable th) {
        m18057b(str, m18062g(str2, th));
    }

    /* renamed from: d */
    public static void m18059d(String str, String str2) {
        synchronized (f15350a) {
            Log.i(str, str2);
        }
    }

    /* renamed from: e */
    public static void m18060e(String str, String str2) {
        synchronized (f15350a) {
            Log.w(str, str2);
        }
    }

    /* renamed from: f */
    public static void m18061f(String str, String str2, Throwable th) {
        m18060e(str, m18062g(str2, th));
    }

    /* renamed from: g */
    private static String m18062g(String str, Throwable th) {
        String str2;
        synchronized (f15350a) {
            if (th != null) {
                Throwable th2 = th;
                while (true) {
                    if (th2 == null) {
                        str2 = Log.getStackTraceString(th).trim().replace("\t", "    ");
                        break;
                    } else if (th2 instanceof UnknownHostException) {
                        str2 = "UnknownHostException (no network)";
                        break;
                    } else {
                        th2 = th2.getCause();
                    }
                }
            } else {
                try {
                    str2 = null;
                } catch (Throwable th3) {
                    while (true) {
                        throw th3;
                    }
                }
            }
        }
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        String replace = str2.replace("\n", "\n  ");
        return str + "\n  " + replace + "\n";
    }
}
