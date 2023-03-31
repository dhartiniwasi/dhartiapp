package p372ud;

/* renamed from: ud.f */
/* compiled from: _Ranges.kt */
class C12756f extends C12755e {
    /* renamed from: a */
    public static int m60449a(int i, int i2) {
        return i < i2 ? i2 : i;
    }

    /* renamed from: b */
    public static long m60450b(long j, long j2) {
        return j < j2 ? j2 : j;
    }

    /* renamed from: c */
    public static int m60451c(int i, int i2) {
        return i > i2 ? i2 : i;
    }

    /* renamed from: d */
    public static long m60452d(long j, long j2) {
        return j > j2 ? j2 : j;
    }

    /* renamed from: e */
    public static int m60453e(int i, int i2, int i3) {
        if (i2 > i3) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
        } else if (i < i2) {
            return i2;
        } else {
            return i > i3 ? i3 : i;
        }
    }

    /* renamed from: f */
    public static C12749a m60454f(int i, int i2) {
        return C12749a.f46699d.mo37681a(i, i2, -1);
    }

    /* renamed from: g */
    public static C12752c m60455g(int i, int i2) {
        if (i2 <= Integer.MIN_VALUE) {
            return C12752c.f46707e.mo37686a();
        }
        return new C12752c(i, i2 - 1);
    }
}
