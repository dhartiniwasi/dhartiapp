package kotlinx.coroutines.internal;

/* renamed from: kotlinx.coroutines.internal.h0 */
/* compiled from: SystemProps.common.kt */
final /* synthetic */ class C11696h0 {
    /* renamed from: a */
    public static final int m56873a(String str, int i, int i2, int i3) {
        return (int) C11692f0.m56855c(str, (long) i, (long) i2, (long) i3);
    }

    /* renamed from: b */
    public static final long m56874b(String str, long j, long j2, long j3) {
        String d = C11692f0.m56856d(str);
        if (d == null) {
            return j;
        }
        Long f = C13009m.m61252f(d);
        if (f != null) {
            long longValue = f.longValue();
            boolean z = false;
            if (j2 <= longValue && longValue <= j3) {
                z = true;
            }
            if (z) {
                return longValue;
            }
            throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + longValue + '\'').toString());
        }
        throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + d + '\'').toString());
    }

    /* renamed from: c */
    public static final boolean m56875c(String str, boolean z) {
        String d = C11692f0.m56856d(str);
        return d == null ? z : Boolean.parseBoolean(d);
    }

    /* renamed from: d */
    public static /* synthetic */ int m56876d(String str, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i2 = 1;
        }
        if ((i4 & 8) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        return C11692f0.m56854b(str, i, i2, i3);
    }

    /* renamed from: e */
    public static /* synthetic */ long m56877e(String str, long j, long j2, long j3, int i, Object obj) {
        if ((i & 4) != 0) {
            j2 = 1;
        }
        long j4 = j2;
        if ((i & 8) != 0) {
            j3 = Long.MAX_VALUE;
        }
        return C11692f0.m56855c(str, j, j4, j3);
    }
}
