package p182a7;

import java.util.Locale;
import java.util.logging.Logger;

/* renamed from: a7.m */
/* compiled from: Platform */
final class C6428m {

    /* renamed from: a */
    private static final Logger f30677a = Logger.getLogger(C6428m.class.getName());

    /* renamed from: b */
    private static final C6427l f30678b = m37545b();

    /* renamed from: a7.m$b */
    /* compiled from: Platform */
    private static final class C6430b implements C6427l {
        private C6430b() {
        }
    }

    private C6428m() {
    }

    /* renamed from: a */
    static String m37544a(double d) {
        return String.format(Locale.ROOT, "%.4g", new Object[]{Double.valueOf(d)});
    }

    /* renamed from: b */
    private static C6427l m37545b() {
        return new C6430b();
    }

    /* renamed from: c */
    static boolean m37546c(String str) {
        return str == null || str.isEmpty();
    }

    /* renamed from: d */
    static long m37547d() {
        return System.nanoTime();
    }
}
