package p182a7;

import java.util.Objects;

/* renamed from: a7.n */
/* compiled from: Preconditions */
public final class C6431n {
    /* renamed from: a */
    private static String m37548a(int i, int i2, String str) {
        if (i < 0) {
            return C6443s.m37601b("%s (%s) must not be negative", str, Integer.valueOf(i));
        } else if (i2 >= 0) {
            return C6443s.m37601b("%s (%s) must be less than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            StringBuilder sb = new StringBuilder(26);
            sb.append("negative size: ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: b */
    private static String m37549b(int i, int i2, String str) {
        if (i < 0) {
            return C6443s.m37601b("%s (%s) must not be negative", str, Integer.valueOf(i));
        } else if (i2 >= 0) {
            return C6443s.m37601b("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            StringBuilder sb = new StringBuilder(26);
            sb.append("negative size: ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: c */
    private static String m37550c(int i, int i2, int i3) {
        if (i < 0 || i > i3) {
            return m37549b(i, i3, "start index");
        }
        if (i2 < 0 || i2 > i3) {
            return m37549b(i2, i3, "end index");
        }
        return C6443s.m37601b("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
    }

    /* renamed from: d */
    public static void m37551d(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: e */
    public static void m37552e(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: f */
    public static void m37553f(boolean z, String str, char c) {
        if (!z) {
            throw new IllegalArgumentException(C6443s.m37601b(str, Character.valueOf(c)));
        }
    }

    /* renamed from: g */
    public static void m37554g(boolean z, String str, char c, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(C6443s.m37601b(str, Character.valueOf(c), obj));
        }
    }

    /* renamed from: h */
    public static void m37555h(boolean z, String str, int i) {
        if (!z) {
            throw new IllegalArgumentException(C6443s.m37601b(str, Integer.valueOf(i)));
        }
    }

    /* renamed from: i */
    public static void m37556i(boolean z, String str, long j) {
        if (!z) {
            throw new IllegalArgumentException(C6443s.m37601b(str, Long.valueOf(j)));
        }
    }

    /* renamed from: j */
    public static void m37557j(boolean z, String str, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(C6443s.m37601b(str, obj));
        }
    }

    /* renamed from: k */
    public static void m37558k(boolean z, String str, Object obj, Object obj2) {
        if (!z) {
            throw new IllegalArgumentException(C6443s.m37601b(str, obj, obj2));
        }
    }

    /* renamed from: l */
    public static int m37559l(int i, int i2) {
        return m37560m(i, i2, "index");
    }

    /* renamed from: m */
    public static int m37560m(int i, int i2, String str) {
        if (i >= 0 && i < i2) {
            return i;
        }
        throw new IndexOutOfBoundsException(m37548a(i, i2, str));
    }

    /* renamed from: n */
    public static <T> T m37561n(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    /* renamed from: o */
    public static <T> T m37562o(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: p */
    public static <T> T m37563p(T t, String str, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(C6443s.m37601b(str, obj));
    }

    /* renamed from: q */
    public static int m37564q(int i, int i2) {
        return m37565r(i, i2, "index");
    }

    /* renamed from: r */
    public static int m37565r(int i, int i2, String str) {
        if (i >= 0 && i <= i2) {
            return i;
        }
        throw new IndexOutOfBoundsException(m37549b(i, i2, str));
    }

    /* renamed from: s */
    public static void m37566s(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException(m37550c(i, i2, i3));
        }
    }

    /* renamed from: t */
    public static void m37567t(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: u */
    public static void m37568u(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    /* renamed from: v */
    public static void m37569v(boolean z, String str, int i) {
        if (!z) {
            throw new IllegalStateException(C6443s.m37601b(str, Integer.valueOf(i)));
        }
    }

    /* renamed from: w */
    public static void m37570w(boolean z, String str, Object obj) {
        if (!z) {
            throw new IllegalStateException(C6443s.m37601b(str, obj));
        }
    }
}
