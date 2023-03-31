package p247h8;

/* renamed from: h8.b */
/* compiled from: Assert */
public class C10432b {
    /* renamed from: a */
    public static AssertionError m52645a(String str, Object... objArr) {
        throw new AssertionError(m52647c(str, objArr));
    }

    /* renamed from: b */
    public static AssertionError m52646b(Throwable th, String str, Object... objArr) {
        throw C10430a.m52642b(m52647c(str, objArr), th);
    }

    /* renamed from: c */
    private static String m52647c(String str, Object... objArr) {
        return "INTERNAL ASSERTION FAILED: " + String.format(str, objArr);
    }

    /* renamed from: d */
    public static void m52648d(boolean z, String str, Object... objArr) {
        if (!z) {
            throw m52645a(str, objArr);
        }
    }

    /* renamed from: e */
    public static <T> T m52649e(T t, String str, Object... objArr) {
        if (t != null) {
            return t;
        }
        throw m52645a(str, objArr);
    }
}
