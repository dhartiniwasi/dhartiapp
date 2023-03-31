package androidx.core.p010os;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;

@Deprecated
/* renamed from: androidx.core.os.m */
/* compiled from: TraceCompat */
public final class C0777m {

    /* renamed from: a */
    private static long f2340a;

    /* renamed from: b */
    private static Method f2341b;

    /* renamed from: c */
    private static Method f2342c;

    /* renamed from: d */
    private static Method f2343d;

    /* renamed from: e */
    private static Method f2344e;

    /* renamed from: androidx.core.os.m$a */
    /* compiled from: TraceCompat */
    static class C0778a {
        /* renamed from: a */
        static void m3537a(String str) {
            Trace.beginSection(str);
        }

        /* renamed from: b */
        static void m3538b() {
            Trace.endSection();
        }
    }

    static {
        Class<String> cls = String.class;
        int i = Build.VERSION.SDK_INT;
        if (i >= 18 && i < 29) {
            try {
                f2340a = Trace.class.getField("TRACE_TAG_APP").getLong((Object) null);
                Class cls2 = Long.TYPE;
                f2341b = Trace.class.getMethod("isTagEnabled", new Class[]{cls2});
                Class cls3 = Integer.TYPE;
                f2342c = Trace.class.getMethod("asyncTraceBegin", new Class[]{cls2, cls, cls3});
                f2343d = Trace.class.getMethod("asyncTraceEnd", new Class[]{cls2, cls, cls3});
                f2344e = Trace.class.getMethod("traceCounter", new Class[]{cls2, cls, cls3});
            } catch (Exception e) {
                Log.i("TraceCompat", "Unable to initialize via reflection.", e);
            }
        }
    }

    /* renamed from: a */
    public static void m3535a(String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            C0778a.m3537a(str);
        }
    }

    /* renamed from: b */
    public static void m3536b() {
        if (Build.VERSION.SDK_INT >= 18) {
            C0778a.m3538b();
        }
    }
}
