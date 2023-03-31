package kotlinx.coroutines.internal;

/* renamed from: kotlinx.coroutines.internal.g0 */
/* compiled from: SystemProps.kt */
final /* synthetic */ class C11694g0 {

    /* renamed from: a */
    private static final int f44259a = Runtime.getRuntime().availableProcessors();

    /* renamed from: a */
    public static final int m56861a() {
        return f44259a;
    }

    /* renamed from: b */
    public static final String m56862b(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
