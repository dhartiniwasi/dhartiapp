package p015b3;

import java.util.Arrays;
import java.util.Random;

/* renamed from: b3.s0 */
/* compiled from: ShuffleOrder */
public interface C1757s0 {

    /* renamed from: b3.s0$a */
    /* compiled from: ShuffleOrder */
    public static class C1758a implements C1757s0 {

        /* renamed from: a */
        private final Random f5232a;

        /* renamed from: b */
        private final int[] f5233b;

        /* renamed from: c */
        private final int[] f5234c;

        public C1758a(int i) {
            this(i, new Random());
        }

        /* renamed from: a */
        private static int[] m8307a(int i, Random random) {
            int[] iArr = new int[i];
            int i2 = 0;
            while (i2 < i) {
                int i3 = i2 + 1;
                int nextInt = random.nextInt(i3);
                iArr[i2] = iArr[nextInt];
                iArr[nextInt] = i2;
                i2 = i3;
            }
            return iArr;
        }

        /* renamed from: b */
        public int mo6873b() {
            return this.f5233b.length;
        }

        /* renamed from: c */
        public C1757s0 mo6874c(int i, int i2) {
            int i3 = i2 - i;
            int[] iArr = new int[(this.f5233b.length - i3)];
            int i4 = 0;
            int i5 = 0;
            while (true) {
                int[] iArr2 = this.f5233b;
                if (i4 >= iArr2.length) {
                    return new C1758a(iArr, new Random(this.f5232a.nextLong()));
                }
                if (iArr2[i4] < i || iArr2[i4] >= i2) {
                    iArr[i4 - i5] = iArr2[i4] >= i ? iArr2[i4] - i3 : iArr2[i4];
                } else {
                    i5++;
                }
                i4++;
            }
        }

        /* renamed from: d */
        public int mo6875d() {
            int[] iArr = this.f5233b;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        /* renamed from: e */
        public int mo6876e(int i) {
            int i2 = this.f5234c[i] - 1;
            if (i2 >= 0) {
                return this.f5233b[i2];
            }
            return -1;
        }

        /* renamed from: f */
        public int mo6877f(int i) {
            int i2 = this.f5234c[i] + 1;
            int[] iArr = this.f5233b;
            if (i2 < iArr.length) {
                return iArr[i2];
            }
            return -1;
        }

        /* renamed from: g */
        public C1757s0 mo6878g(int i, int i2) {
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int i3 = 0;
            int i4 = 0;
            while (i4 < i2) {
                iArr[i4] = this.f5232a.nextInt(this.f5233b.length + 1);
                int i5 = i4 + 1;
                int nextInt = this.f5232a.nextInt(i5);
                iArr2[i4] = iArr2[nextInt];
                iArr2[nextInt] = i4 + i;
                i4 = i5;
            }
            Arrays.sort(iArr);
            int[] iArr3 = new int[(this.f5233b.length + i2)];
            int i6 = 0;
            int i7 = 0;
            while (true) {
                int[] iArr4 = this.f5233b;
                if (i3 >= iArr4.length + i2) {
                    return new C1758a(iArr3, new Random(this.f5232a.nextLong()));
                }
                if (i6 >= i2 || i7 != iArr[i6]) {
                    int i8 = i7 + 1;
                    iArr3[i3] = iArr4[i7];
                    if (iArr3[i3] >= i) {
                        iArr3[i3] = iArr3[i3] + i2;
                    }
                    i7 = i8;
                } else {
                    iArr3[i3] = iArr2[i6];
                    i6++;
                }
                i3++;
            }
        }

        /* renamed from: h */
        public int mo6879h() {
            int[] iArr = this.f5233b;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        /* renamed from: i */
        public C1757s0 mo6880i() {
            return new C1758a(0, new Random(this.f5232a.nextLong()));
        }

        public C1758a(int[] iArr, long j) {
            this(Arrays.copyOf(iArr, iArr.length), new Random(j));
        }

        private C1758a(int i, Random random) {
            this(m8307a(i, random), random);
        }

        private C1758a(int[] iArr, Random random) {
            this.f5233b = iArr;
            this.f5232a = random;
            this.f5234c = new int[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                this.f5234c[iArr[i]] = i;
            }
        }
    }

    /* renamed from: b */
    int mo6873b();

    /* renamed from: c */
    C1757s0 mo6874c(int i, int i2);

    /* renamed from: d */
    int mo6875d();

    /* renamed from: e */
    int mo6876e(int i);

    /* renamed from: f */
    int mo6877f(int i);

    /* renamed from: g */
    C1757s0 mo6878g(int i, int i2);

    /* renamed from: h */
    int mo6879h();

    /* renamed from: i */
    C1757s0 mo6880i();
}
