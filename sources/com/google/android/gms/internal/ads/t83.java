package com.google.android.gms.internal.ads;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class t83 {

    /* renamed from: a */
    private static final Object f17899a;

    /* renamed from: b */
    private static final Method f17900b;

    /* renamed from: c */
    private static final Method f17901c;

    static {
        Method method;
        Object b = m20836b();
        f17899a = b;
        Method method2 = null;
        if (b == null) {
            method = null;
        } else {
            method = m20837c("getStackTraceElement", Throwable.class, Integer.TYPE);
        }
        f17900b = method;
        if (b != null) {
            method2 = m20838d(b);
        }
        f17901c = method2;
    }

    /* renamed from: a */
    public static String m20835a(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    /* renamed from: b */
    private static Object m20836b() {
        try {
            return Class.forName("sun.misc.SharedSecrets", false, (ClassLoader) null).getMethod("getJavaLangAccess", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    private static Method m20837c(String str, Class... clsArr) throws ThreadDeath {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, (ClassLoader) null).getMethod(str, clsArr);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: d */
    private static Method m20838d(Object obj) {
        try {
            Method c = m20837c("getStackTraceDepth", Throwable.class);
            if (c == null) {
                return null;
            }
            c.invoke(obj, new Object[]{new Throwable()});
            return c;
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
            return null;
        }
    }
}
