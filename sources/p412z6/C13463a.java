package p412z6;

/* renamed from: z6.a */
/* compiled from: NumberComparisonHelper */
public final class C13463a {
    /* renamed from: a */
    public static int m62491a(long j, long j2) {
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        return i > 0 ? 1 : 0;
    }

    /* renamed from: b */
    public static int m62492b(double d, long j) {
        if (Double.isNaN(d) || d < -9.223372036854776E18d) {
            return -1;
        }
        if (d >= 9.223372036854776E18d) {
            return 1;
        }
        int a = m62491a((long) d, j);
        if (a != 0) {
            return a;
        }
        return m62493c(d, (double) j);
    }

    /* renamed from: c */
    public static int m62493c(double d, double d2) {
        if (d < d2) {
            return -1;
        }
        int i = (d > d2 ? 1 : (d == d2 ? 0 : -1));
        if (i > 0) {
            return 1;
        }
        if (i == 0) {
            return 0;
        }
        if (!Double.isNaN(d2)) {
            return -1;
        }
        return !Double.isNaN(d) ? 1 : 0;
    }
}
