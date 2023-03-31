package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public abstract class ak4 extends dk4 {

    /* renamed from: c */
    private zj4 f6663c;

    /* renamed from: d */
    public final fk4 mo8423d(y74[] y74Arr, ki4 ki4, mg4 mg4, gt0 gt0) throws u44 {
        boolean z;
        int[] iArr;
        ki4 ki42 = ki4;
        int[] iArr2 = new int[3];
        gv0[][] gv0Arr = new gv0[3][];
        int[][][] iArr3 = new int[3][][];
        for (int i = 0; i < 3; i++) {
            int i2 = ki42.f12116a;
            gv0Arr[i] = new gv0[i2];
            iArr3[i] = new int[i2][];
        }
        int i3 = 2;
        int[] iArr4 = new int[2];
        for (int i4 = 0; i4 < 2; i4++) {
            iArr4[i4] = y74Arr[i4].mo13068a();
        }
        int i5 = 0;
        while (i5 < ki42.f12116a) {
            gv0 b = ki42.mo11711b(i5);
            int i6 = b.f10065c;
            int i7 = 0;
            int i8 = 2;
            int i9 = 0;
            boolean z2 = true;
            while (i7 < i3) {
                y74 y74 = y74Arr[i7];
                int i10 = 0;
                for (int i11 = 0; i11 <= 0; i11++) {
                    i10 = Math.max(i10, y74.mo12631j(b.mo10649b(i11)) & 7);
                }
                boolean z3 = iArr2[i7] == 0;
                if (i10 > i9) {
                    z2 = z3;
                    i8 = i7;
                    i9 = i10;
                } else if (i10 == i9 && i6 == 5 && !z2 && z3) {
                    i8 = i7;
                    i9 = i10;
                    z2 = true;
                }
                i7++;
                i3 = 2;
            }
            if (i8 == i3) {
                iArr = new int[1];
            } else {
                y74 y742 = y74Arr[i8];
                int[] iArr5 = new int[1];
                for (int i12 = 0; i12 <= 0; i12++) {
                    iArr5[i12] = y742.mo12631j(b.mo10649b(i12));
                }
                iArr = iArr5;
            }
            int i13 = iArr2[i8];
            gv0Arr[i8][i13] = b;
            iArr3[i8][i13] = iArr;
            iArr2[i8] = i13 + 1;
            i5++;
            i3 = 2;
        }
        ki4[] ki4Arr = new ki4[i3];
        String[] strArr = new String[i3];
        int[] iArr6 = new int[i3];
        int i14 = 0;
        while (i14 < i3) {
            int i15 = iArr2[i14];
            ki4Arr[i14] = new ki4((gv0[]) gb2.m13136F(gv0Arr[i14], i15));
            iArr3[i14] = (int[][]) gb2.m13136F(iArr3[i14], i15);
            strArr[i14] = y74Arr[i14].mo9158r();
            iArr6[i14] = y74Arr[i14].mo13072d();
            i14++;
            i3 = 2;
        }
        zj4 zj4 = new zj4(strArr, iArr6, ki4Arr, iArr4, iArr3, new ki4((gv0[]) gb2.m13136F(gv0Arr[2], iArr2[2])));
        Pair i16 = mo8425i(zj4, iArr3, iArr4, mg4, gt0);
        bk4[] bk4Arr = (bk4[]) i16.second;
        List[] listArr = new List[bk4Arr.length];
        for (int i17 = 0; i17 < bk4Arr.length; i17++) {
            bk4 bk4 = bk4Arr[i17];
            listArr[i17] = bk4 != null ? ua3.m21509x(bk4) : ua3.m21508w();
        }
        ra3 ra3 = new ra3();
        for (int i18 = 0; i18 < 2; i18++) {
            ki4 d = zj4.mo15605d(i18);
            List list = listArr[i18];
            for (int i19 = 0; i19 < d.f12116a; i19++) {
                gv0 b2 = d.mo11711b(i19);
                boolean z4 = zj4.mo15602a(i18, i19, false) != 0;
                int i20 = b2.f10063a;
                int[] iArr7 = new int[1];
                boolean[] zArr = new boolean[1];
                for (int i21 = 0; i21 <= 0; i21++) {
                    iArr7[i21] = zj4.mo15603b(i18, i19, i21) & 7;
                    int i22 = 0;
                    while (true) {
                        if (i22 >= list.size()) {
                            z = false;
                            break;
                        }
                        bk4 bk42 = (bk4) list.get(i22);
                        if (bk42.mo8851a().equals(b2) && bk42.mo8855s(i21) != -1) {
                            z = true;
                            break;
                        }
                        i22++;
                    }
                    zArr[i21] = z;
                }
                ra3.mo13701f(new o31(b2, z4, iArr7, zArr));
            }
        }
        ki4 e = zj4.mo15606e();
        for (int i23 = 0; i23 < e.f12116a; i23++) {
            gv0 b3 = e.mo11711b(i23);
            int i24 = b3.f10063a;
            int[] iArr8 = new int[1];
            Arrays.fill(iArr8, 0);
            ra3.mo13701f(new o31(b3, false, iArr8, new boolean[1]));
        }
        return new fk4((z74[]) i16.first, (xj4[]) i16.second, new p41(ra3.mo13703h()), zj4);
    }

    /* renamed from: e */
    public final void mo8424e(Object obj) {
        this.f6663c = (zj4) obj;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract Pair mo8425i(zj4 zj4, int[][][] iArr, int[] iArr2, mg4 mg4, gt0 gt0) throws u44;
}
