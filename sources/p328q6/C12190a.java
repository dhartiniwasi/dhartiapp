package p328q6;

/* renamed from: q6.a */
/* compiled from: MathUtils */
public final class C12190a {
    /* renamed from: a */
    public static float m58477a(float f, float f2, float f3, float f4) {
        return (float) Math.hypot((double) (f3 - f), (double) (f4 - f2));
    }

    /* renamed from: b */
    public static float m58478b(float f, float f2, float f3, float f4, float f5, float f6) {
        return m58480d(m58477a(f, f2, f3, f4), m58477a(f, f2, f5, f4), m58477a(f, f2, f5, f6), m58477a(f, f2, f3, f6));
    }

    /* renamed from: c */
    public static float m58479c(float f, float f2, float f3) {
        return ((1.0f - f3) * f) + (f3 * f2);
    }

    /* renamed from: d */
    private static float m58480d(float f, float f2, float f3, float f4) {
        return (f <= f2 || f <= f3 || f <= f4) ? (f2 <= f3 || f2 <= f4) ? f3 > f4 ? f3 : f4 : f2 : f;
    }
}
