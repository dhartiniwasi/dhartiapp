package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zj4 {

    /* renamed from: a */
    private final String[] f21123a;

    /* renamed from: b */
    private final int[] f21124b;

    /* renamed from: c */
    private final ki4[] f21125c;

    /* renamed from: d */
    private final int[] f21126d;

    /* renamed from: e */
    private final int[][][] f21127e;

    /* renamed from: f */
    private final ki4 f21128f;

    zj4(String[] strArr, int[] iArr, ki4[] ki4Arr, int[] iArr2, int[][][] iArr3, ki4 ki4) {
        this.f21123a = strArr;
        this.f21124b = iArr;
        this.f21125c = ki4Arr;
        this.f21127e = iArr3;
        this.f21126d = iArr2;
        this.f21128f = ki4;
    }

    /* renamed from: a */
    public final int mo15602a(int i, int i2, boolean z) {
        int i3 = this.f21125c[i].mo11711b(i2).f10063a;
        int[] iArr = new int[1];
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 <= 0; i6++) {
            if ((this.f21127e[i][i2][i6] & 7) == 4) {
                iArr[i5] = i6;
                i5++;
            }
        }
        int[] copyOf = Arrays.copyOf(iArr, i5);
        String str = null;
        boolean z2 = false;
        int i7 = 0;
        int i8 = 16;
        while (i4 < copyOf.length) {
            String str2 = this.f21125c[i].mo11711b(i2).mo10649b(copyOf[i4]).f9673l;
            int i9 = i7 + 1;
            if (i7 != 0) {
                z2 |= !gb2.m13186t(str, str2);
            } else {
                str = str2;
            }
            i8 = Math.min(i8, this.f21127e[i][i2][i4] & 24);
            i4++;
            i7 = i9;
        }
        return z2 ? Math.min(i8, this.f21126d[i]) : i8;
    }

    /* renamed from: b */
    public final int mo15603b(int i, int i2, int i3) {
        return this.f21127e[i][i2][i3];
    }

    /* renamed from: c */
    public final int mo15604c(int i) {
        return this.f21124b[i];
    }

    /* renamed from: d */
    public final ki4 mo15605d(int i) {
        return this.f21125c[i];
    }

    /* renamed from: e */
    public final ki4 mo15606e() {
        return this.f21128f;
    }
}
