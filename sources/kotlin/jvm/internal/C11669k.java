package kotlin.jvm.internal;

import java.util.Arrays;
import p243gd.C10348r;

/* renamed from: kotlin.jvm.internal.k */
/* compiled from: Intrinsics */
public class C11669k {
    private C11669k() {
    }

    /* renamed from: a */
    public static boolean m56783a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* renamed from: b */
    public static void m56784b(Object obj) {
        if (obj == null) {
            m56793k();
        }
    }

    /* renamed from: c */
    public static void m56785c(Object obj, String str) {
        if (obj == null) {
            m56794l(str);
        }
    }

    /* renamed from: d */
    public static void m56786d(Object obj, String str) {
        if (obj == null) {
            throw ((NullPointerException) m56790h(new NullPointerException(str + " must not be null")));
        }
    }

    /* renamed from: e */
    public static void m56787e(Object obj, String str) {
        if (obj == null) {
            m56795m(str);
        }
    }

    /* renamed from: f */
    public static int m56788f(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    /* renamed from: g */
    private static String m56789g(String str) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[4];
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        return "Parameter specified as non-null is null: method " + className + "." + methodName + ", parameter " + str;
    }

    /* renamed from: h */
    private static <T extends Throwable> T m56790h(T t) {
        return m56791i(t, C11669k.class.getName());
    }

    /* renamed from: i */
    static <T extends Throwable> T m56791i(T t, String str) {
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        t.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
        return t;
    }

    /* renamed from: j */
    public static String m56792j(String str, Object obj) {
        return str + obj;
    }

    /* renamed from: k */
    public static void m56793k() {
        throw ((NullPointerException) m56790h(new NullPointerException()));
    }

    /* renamed from: l */
    public static void m56794l(String str) {
        throw ((NullPointerException) m56790h(new NullPointerException(str)));
    }

    /* renamed from: m */
    private static void m56795m(String str) {
        throw ((NullPointerException) m56790h(new NullPointerException(m56789g(str))));
    }

    /* renamed from: n */
    public static void m56796n(String str) {
        throw ((C10348r) m56790h(new C10348r(str)));
    }

    /* renamed from: o */
    public static void m56797o(String str) {
        m56796n("lateinit property " + str + " has not been initialized");
    }
}
