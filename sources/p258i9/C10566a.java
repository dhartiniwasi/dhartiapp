package p258i9;

/* renamed from: i9.a */
/* compiled from: MathUtils */
public final class C10566a {
    /* renamed from: a */
    public static float m53110a(float f, float f2, float f3, float f4) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        return (float) Math.sqrt((double) ((f5 * f5) + (f6 * f6)));
    }

    /* renamed from: b */
    public static float m53111b(int i, int i2, int i3, int i4) {
        int i5 = i - i3;
        int i6 = i2 - i4;
        return (float) Math.sqrt((double) ((i5 * i5) + (i6 * i6)));
    }

    /* renamed from: c */
    public static int m53112c(float f) {
        return (int) (f + (f < 0.0f ? -0.5f : 0.5f));
    }

    /* renamed from: d */
    public static int m53113d(int[] iArr) {
        int i = 0;
        for (int i2 : iArr) {
            i += i2;
        }
        return i;
    }
}
