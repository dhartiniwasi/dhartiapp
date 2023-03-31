package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Random;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class gi4 {

    /* renamed from: a */
    private final Random f9912a;

    /* renamed from: b */
    private final int[] f9913b;

    /* renamed from: c */
    private final int[] f9914c;

    public gi4(int i) {
        this(0, new Random());
    }

    /* renamed from: a */
    public final int mo10547a() {
        int[] iArr = this.f9913b;
        if (iArr.length > 0) {
            return iArr[0];
        }
        return -1;
    }

    /* renamed from: b */
    public final int mo10548b() {
        int[] iArr = this.f9913b;
        int length = iArr.length;
        if (length > 0) {
            return iArr[length - 1];
        }
        return -1;
    }

    /* renamed from: c */
    public final int mo10549c() {
        return this.f9913b.length;
    }

    /* renamed from: d */
    public final int mo10550d(int i) {
        int i2 = this.f9914c[i] + 1;
        int[] iArr = this.f9913b;
        if (i2 < iArr.length) {
            return iArr[i2];
        }
        return -1;
    }

    /* renamed from: e */
    public final int mo10551e(int i) {
        int i2 = this.f9914c[i] - 1;
        if (i2 >= 0) {
            return this.f9913b[i2];
        }
        return -1;
    }

    /* renamed from: f */
    public final gi4 mo10552f() {
        return new gi4(0, new Random(this.f9912a.nextLong()));
    }

    /* renamed from: g */
    public final gi4 mo10553g(int i, int i2) {
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        int i3 = 0;
        int i4 = 0;
        while (i4 < i2) {
            iArr[i4] = this.f9912a.nextInt(this.f9913b.length + 1);
            int i5 = i4 + 1;
            int nextInt = this.f9912a.nextInt(i5);
            iArr2[i4] = iArr2[nextInt];
            iArr2[nextInt] = i4;
            i4 = i5;
        }
        Arrays.sort(iArr);
        int[] iArr3 = new int[(this.f9913b.length + i2)];
        int i6 = 0;
        int i7 = 0;
        while (true) {
            int[] iArr4 = this.f9913b;
            if (i3 >= iArr4.length + i2) {
                return new gi4(iArr3, new Random(this.f9912a.nextLong()));
            }
            if (i6 >= i2 || i7 != iArr[i6]) {
                int i8 = i7 + 1;
                int i9 = iArr4[i7];
                iArr3[i3] = i9;
                if (i9 >= 0) {
                    iArr3[i3] = i9 + i2;
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
    public final gi4 mo10554h(int i, int i2) {
        int[] iArr = new int[(this.f9913b.length - i2)];
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int[] iArr2 = this.f9913b;
            if (i3 >= iArr2.length) {
                return new gi4(iArr, new Random(this.f9912a.nextLong()));
            }
            int i5 = iArr2[i3];
            if (i5 < 0 || i5 >= i2) {
                int i6 = i3 - i4;
                if (i5 >= 0) {
                    i5 -= i2;
                }
                iArr[i6] = i5;
            } else {
                i4++;
            }
            i3++;
        }
    }

    private gi4(int i, Random random) {
        this(new int[0], random);
    }

    private gi4(int[] iArr, Random random) {
        this.f9913b = iArr;
        this.f9912a = random;
        this.f9914c = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            this.f9914c[iArr[i]] = i;
        }
    }
}
