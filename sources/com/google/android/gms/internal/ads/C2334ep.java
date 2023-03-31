package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.ep */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public abstract class C2334ep extends C2484ip {

    /* renamed from: b */
    private final SparseArray f8884b = new SparseArray();

    /* renamed from: c */
    private final SparseBooleanArray f8885c = new SparseBooleanArray();

    /* renamed from: d */
    private C2260cp f8886d;

    /* renamed from: a */
    public final C2521jp mo9989a(C3033xi[] xiVarArr, C2891to toVar) throws C2253ci {
        C2297dp dpVar;
        int[] iArr;
        C3033xi[] xiVarArr2 = xiVarArr;
        C2891to toVar2 = toVar;
        int[] iArr2 = new int[3];
        C2854so[][] soVarArr = new C2854so[3][];
        int[][][] iArr3 = new int[3][][];
        for (int i = 0; i < 3; i++) {
            int i2 = toVar2.f18176a;
            soVarArr[i] = new C2854so[i2];
            iArr3[i] = new int[i2][];
        }
        int i3 = 2;
        int[] iArr4 = new int[2];
        for (int i4 = 0; i4 < 2; i4++) {
            xiVarArr2[i4].mo14081a();
            iArr4[i4] = 4;
        }
        int i5 = 0;
        while (i5 < toVar2.f18176a) {
            C2854so b = toVar2.mo14333b(i5);
            int i6 = 0;
            int i7 = 0;
            int i8 = 2;
            while (true) {
                if (i6 >= i3) {
                    i6 = i8;
                    break;
                }
                C3033xi xiVar = xiVarArr2[i6];
                int i9 = 0;
                while (true) {
                    int i10 = b.f17600a;
                    if (i9 > 0) {
                        break;
                    }
                    int b2 = xiVar.mo14082b(b.mo14108b(i9)) & 3;
                    if (b2 > i7) {
                        if (b2 == 3) {
                            break;
                        }
                        i8 = i6;
                        i7 = b2;
                    }
                    i9++;
                }
                i6++;
                i3 = 2;
            }
            if (i6 == 2) {
                int i11 = b.f17600a;
                iArr = new int[1];
            } else {
                C3033xi xiVar2 = xiVarArr2[i6];
                int i12 = b.f17600a;
                int[] iArr5 = new int[1];
                for (int i13 = 0; i13 <= 0; i13++) {
                    iArr5[i13] = xiVar2.mo14082b(b.mo14108b(i13));
                }
                iArr = iArr5;
            }
            int i14 = iArr2[i6];
            soVarArr[i6][i14] = b;
            iArr3[i6][i14] = iArr;
            iArr2[i6] = i14 + 1;
            i5++;
            i3 = 2;
        }
        C2891to[] toVarArr = new C2891to[2];
        int[] iArr6 = new int[2];
        int i15 = 0;
        for (int i16 = 2; i15 < i16; i16 = 2) {
            int i17 = iArr2[i15];
            toVarArr[i15] = new C2891to((C2854so[]) Arrays.copyOf(soVarArr[i15], i17));
            iArr3[i15] = (int[][]) Arrays.copyOf(iArr3[i15], i17);
            iArr6[i15] = xiVarArr2[i15].mo8370e();
            i15++;
        }
        C2891to toVar3 = new C2891to((C2854so[]) Arrays.copyOf(soVarArr[2], iArr2[2]));
        C3039xo[] e = mo9991e(xiVarArr2, toVarArr, iArr3);
        int i18 = 0;
        for (int i19 = 2; i18 < i19; i19 = 2) {
            if (this.f8885c.get(i18)) {
                e[i18] = null;
            } else {
                C2891to toVar4 = toVarArr[i18];
                Map map = (Map) this.f8884b.get(i18);
                if (map == null) {
                    dpVar = null;
                } else {
                    dpVar = (C2297dp) map.get(toVar4);
                }
                if (dpVar != null) {
                    throw null;
                }
            }
            i18++;
        }
        C2260cp cpVar = new C2260cp(iArr6, toVarArr, iArr4, iArr3, toVar3);
        C3070yi[] yiVarArr = new C3070yi[2];
        for (int i20 = 0; i20 < 2; i20++) {
            yiVarArr[i20] = e[i20] != null ? C3070yi.f20623b : null;
        }
        return new C2521jp(toVar2, new C2409gp(e, (byte[]) null), cpVar, yiVarArr);
    }

    /* renamed from: b */
    public final void mo9990b(Object obj) {
        this.f8886d = (C2260cp) obj;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract C3039xo[] mo9991e(C3033xi[] xiVarArr, C2891to[] toVarArr, int[][][] iArr) throws C2253ci;

    /* renamed from: f */
    public final void mo9992f(int i, boolean z) {
        if (this.f8885c.get(i) != z) {
            this.f8885c.put(i, z);
            mo11185d();
        }
    }
}
