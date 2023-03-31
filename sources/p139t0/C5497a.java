package p139t0;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: t0.a */
/* compiled from: Trace */
public final class C5497a {

    /* renamed from: a */
    private static long f27957a;

    /* renamed from: b */
    private static Method f27958b;

    /* renamed from: c */
    private static Method f27959c;

    /* renamed from: d */
    private static Method f27960d;

    /* renamed from: a */
    public static void m33444a(String str, int i) {
        try {
            if (f27959c == null) {
                C5499c.m33455a(str, i);
                return;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        m33445b(str, i);
    }

    /* renamed from: b */
    private static void m33445b(String str, int i) {
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                if (f27959c == null) {
                    f27959c = Trace.class.getMethod("asyncTraceBegin", new Class[]{Long.TYPE, String.class, Integer.TYPE});
                }
                f27959c.invoke((Object) null, new Object[]{Long.valueOf(f27957a), str, Integer.valueOf(i)});
            } catch (Exception e) {
                m33450g("asyncTraceBegin", e);
            }
        }
    }

    /* renamed from: c */
    public static void m33446c(String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            C5498b.m33453a(str);
        }
    }

    /* renamed from: d */
    public static void m33447d(String str, int i) {
        try {
            if (f27960d == null) {
                C5499c.m33456b(str, i);
                return;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        m33448e(str, i);
    }

    /* renamed from: e */
    private static void m33448e(String str, int i) {
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                if (f27960d == null) {
                    f27960d = Trace.class.getMethod("asyncTraceEnd", new Class[]{Long.TYPE, String.class, Integer.TYPE});
                }
                f27960d.invoke((Object) null, new Object[]{Long.valueOf(f27957a), str, Integer.valueOf(i)});
            } catch (Exception e) {
                m33450g("asyncTraceEnd", e);
            }
        }
    }

    /* renamed from: f */
    public static void m33449f() {
        if (Build.VERSION.SDK_INT >= 18) {
            C5498b.m33454b();
        }
    }

    /* renamed from: g */
    private static void m33450g(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    /* renamed from: h */
    public static boolean m33451h() {
        try {
            if (f27958b == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        return m33452i();
    }

    /* renamed from: i */
    private static boolean m33452i() {
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                if (f27958b == null) {
                    f27957a = Trace.class.getField("TRACE_TAG_APP").getLong((Object) null);
                    f27958b = Trace.class.getMethod("isTagEnabled", new Class[]{Long.TYPE});
                }
                return ((Boolean) f27958b.invoke((Object) null, new Object[]{Long.valueOf(f27957a)})).booleanValue();
            } catch (Exception e) {
                m33450g("isTagEnabled", e);
            }
        }
        return false;
    }
}
