package p290ld;

/* renamed from: ld.c */
/* compiled from: progressionUtil.kt */
public final class C11789c {
    /* renamed from: a */
    private static final int m57137a(int i, int i2, int i3) {
        return m57139c(m57139c(i, i3) - m57139c(i2, i3), i3);
    }

    /* renamed from: b */
    public static final int m57138b(int i, int i2, int i3) {
        if (i3 > 0) {
            if (i >= i2) {
                return i2;
            }
            return i2 - m57137a(i2, i, i3);
        } else if (i3 < 0) {
            return i <= i2 ? i2 : i2 + m57137a(i, i2, -i3);
        } else {
            throw new IllegalArgumentException("Step is zero.");
        }
    }

    /* renamed from: c */
    private static final int m57139c(int i, int i2) {
        int i3 = i % i2;
        return i3 >= 0 ? i3 : i3 + i2;
    }
}
