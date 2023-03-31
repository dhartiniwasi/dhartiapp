package p406y9;

/* renamed from: y9.g */
/* compiled from: FormatInformation */
final class C13236g {

    /* renamed from: c */
    private static final int[][] f47499c = {new int[]{21522, 0}, new int[]{20773, 1}, new int[]{24188, 2}, new int[]{23371, 3}, new int[]{17913, 4}, new int[]{16590, 5}, new int[]{20375, 6}, new int[]{19104, 7}, new int[]{30660, 8}, new int[]{29427, 9}, new int[]{32170, 10}, new int[]{30877, 11}, new int[]{26159, 12}, new int[]{25368, 13}, new int[]{27713, 14}, new int[]{26998, 15}, new int[]{5769, 16}, new int[]{5054, 17}, new int[]{7399, 18}, new int[]{6608, 19}, new int[]{1890, 20}, new int[]{597, 21}, new int[]{3340, 22}, new int[]{2107, 23}, new int[]{13663, 24}, new int[]{12392, 25}, new int[]{16177, 26}, new int[]{14854, 27}, new int[]{9396, 28}, new int[]{8579, 29}, new int[]{11994, 30}, new int[]{11245, 31}};

    /* renamed from: a */
    private final C13235f f47500a;

    /* renamed from: b */
    private final byte f47501b;

    private C13236g(int i) {
        this.f47500a = C13235f.m62045a((i >> 3) & 3);
        this.f47501b = (byte) (i & 7);
    }

    /* renamed from: a */
    static C13236g m62046a(int i, int i2) {
        C13236g b = m62047b(i, i2);
        if (b != null) {
            return b;
        }
        return m62047b(i ^ 21522, i2 ^ 21522);
    }

    /* renamed from: b */
    private static C13236g m62047b(int i, int i2) {
        int e;
        int i3 = Integer.MAX_VALUE;
        int i4 = 0;
        for (int[] iArr : f47499c) {
            int i5 = iArr[0];
            if (i5 == i || i5 == i2) {
                return new C13236g(iArr[1]);
            }
            int e2 = m62048e(i, i5);
            if (e2 < i3) {
                i4 = iArr[1];
                i3 = e2;
            }
            if (i != i2 && (e = m62048e(i2, i5)) < i3) {
                i4 = iArr[1];
                i3 = e;
            }
        }
        if (i3 <= 3) {
            return new C13236g(i4);
        }
        return null;
    }

    /* renamed from: e */
    static int m62048e(int i, int i2) {
        return Integer.bitCount(i ^ i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public byte mo38329c() {
        return this.f47501b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C13235f mo38330d() {
        return this.f47500a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C13236g)) {
            return false;
        }
        C13236g gVar = (C13236g) obj;
        if (this.f47500a == gVar.f47500a && this.f47501b == gVar.f47501b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f47500a.ordinal() << 3) | this.f47501b;
    }
}
