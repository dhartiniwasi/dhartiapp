package p092m2;

import p161w3.C5953m0;

/* renamed from: m2.d */
/* compiled from: FixedSampleSizeRechunker */
final class C5014d {

    /* renamed from: m2.d$b */
    /* compiled from: FixedSampleSizeRechunker */
    public static final class C5016b {

        /* renamed from: a */
        public final long[] f26238a;

        /* renamed from: b */
        public final int[] f26239b;

        /* renamed from: c */
        public final int f26240c;

        /* renamed from: d */
        public final long[] f26241d;

        /* renamed from: e */
        public final int[] f26242e;

        /* renamed from: f */
        public final long f26243f;

        private C5016b(long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
            this.f26238a = jArr;
            this.f26239b = iArr;
            this.f26240c = i;
            this.f26241d = jArr2;
            this.f26242e = iArr2;
            this.f26243f = j;
        }
    }

    /* renamed from: a */
    public static C5016b m31607a(int i, long[] jArr, int[] iArr, long j) {
        int[] iArr2 = iArr;
        int i2 = 8192 / i;
        int i3 = 0;
        for (int l : iArr2) {
            i3 += C5953m0.m35142l(l, i2);
        }
        long[] jArr2 = new long[i3];
        int[] iArr3 = new int[i3];
        long[] jArr3 = new long[i3];
        int[] iArr4 = new int[i3];
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < iArr2.length; i7++) {
            int i8 = iArr2[i7];
            long j2 = jArr[i7];
            while (i8 > 0) {
                int min = Math.min(i2, i8);
                jArr2[i5] = j2;
                iArr3[i5] = i * min;
                i6 = Math.max(i6, iArr3[i5]);
                jArr3[i5] = ((long) i4) * j;
                iArr4[i5] = 1;
                j2 += (long) iArr3[i5];
                i4 += min;
                i8 -= min;
                i5++;
            }
        }
        return new C5016b(jArr2, iArr3, i6, jArr3, iArr4, j * ((long) i4));
    }
}
