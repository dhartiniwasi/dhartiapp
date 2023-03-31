package p182a7;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: a7.u */
/* compiled from: Throwables */
public final class C6445u {

    /* renamed from: a */
    private static final Object f30696a;

    /* renamed from: b */
    private static final Method f30697b;

    /* renamed from: c */
    private static final Method f30698c;

    static {
        Method method;
        Object b = m37604b();
        f30696a = b;
        Method method2 = null;
        if (b == null) {
            method = null;
        } else {
            method = m37603a();
        }
        f30697b = method;
        if (b != null) {
            method2 = m37606d(b);
        }
        f30698c = method2;
    }

    /* renamed from: a */
    private static Method m37603a() {
        return m37605c("getStackTraceElement", Throwable.class, Integer.TYPE);
    }

    /* renamed from: b */
    private static Object m37604b() {
        try {
            return Class.forName("sun.misc.SharedSecrets", false, (ClassLoader) null).getMethod("getJavaLangAccess", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    private static Method m37605c(String str, Class<?>... clsArr) throws ThreadDeath {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, (ClassLoader) null).getMethod(str, clsArr);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: d */
    private static Method m37606d(Object obj) {
        try {
            Method c = m37605c("getStackTraceDepth", Throwable.class);
            if (c == null) {
                return null;
            }
            c.invoke(obj, new Object[]{new Throwable()});
            return c;
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: e */
    public static String m37607e(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    /* renamed from: f */
    public static void m37608f(Throwable th) {
        C6431n.m37561n(th);
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        } else if (th instanceof Error) {
            throw ((Error) th);
        }
    }
}
