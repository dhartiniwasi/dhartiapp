package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.zo */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C3113zo extends C2334ep {

    /* renamed from: e */
    private final AtomicReference f21190e = new AtomicReference(new C3076yo());

    public C3113zo(C2372fp fpVar) {
    }

    /* renamed from: g */
    protected static boolean m24719g(int i, boolean z) {
        int i2 = i & 3;
        return i2 == 3 || (z && i2 == 2);
    }

    /* renamed from: h */
    private static int m24720h(int i, int i2) {
        if (i == -1) {
            return i2 != -1 ? -1 : 0;
        }
        if (i2 == -1) {
            return 1;
        }
        return i - i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final C3039xo[] mo9991e(C3033xi[] xiVarArr, C2891to[] toVarArr, int[][][] iArr) throws C2253ci {
        C2223bp bpVar;
        C2223bp bpVar2;
        int[] iArr2;
        ArrayList arrayList;
        C2854so soVar;
        boolean z;
        boolean z2;
        int i;
        int i2;
        int i3 = 2;
        C3039xo[] xoVarArr = new C3039xo[2];
        C3076yo yoVar = (C3076yo) this.f21190e.get();
        int i4 = 0;
        boolean z3 = false;
        while (true) {
            int i5 = -1;
            int i6 = 1;
            if (i4 >= i3) {
                break;
            }
            if (xiVarArr[i4].mo8370e() == i3) {
                if (!z3) {
                    C3033xi xiVar = xiVarArr[i4];
                    C2891to toVar = toVarArr[i4];
                    int[][] iArr3 = iArr[i4];
                    int i7 = yoVar.f20727d;
                    int i8 = -1;
                    int i9 = 0;
                    C2854so soVar2 = null;
                    int i10 = 0;
                    int i11 = 0;
                    while (i9 < toVar.f18176a) {
                        C2854so b = toVar.mo14333b(i9);
                        int i12 = b.f17600a;
                        ArrayList arrayList2 = new ArrayList(i6);
                        for (int i13 = 0; i13 <= 0; i13++) {
                            arrayList2.add(Integer.valueOf(i13));
                        }
                        int[] iArr4 = iArr3[i9];
                        int i14 = 0;
                        while (i14 <= 0) {
                            C2891to toVar2 = toVar;
                            if (m24719g(iArr4[i14], true)) {
                                C2774qi b2 = b.mo14108b(i14);
                                if (arrayList2.contains(Integer.valueOf(i14))) {
                                    int i15 = b2.f16396r;
                                    soVar = b;
                                    z2 = true;
                                    z = true;
                                } else {
                                    soVar = b;
                                    z2 = true;
                                    z = false;
                                }
                                if (z2 != z) {
                                    arrayList = arrayList2;
                                    i = 1;
                                } else {
                                    arrayList = arrayList2;
                                    i = 2;
                                }
                                iArr2 = iArr4;
                                boolean g = m24719g(iArr4[i14], false);
                                if (g) {
                                    i += AdError.NETWORK_ERROR_CODE;
                                }
                                boolean z4 = i > i11;
                                if (i == i11) {
                                    if (b2.mo13538a() != i8) {
                                        i2 = m24720h(b2.mo13538a(), i8);
                                    } else {
                                        i2 = m24720h(b2.f16388b, i5);
                                    }
                                    z4 = !g || !z ? i2 < 0 : i2 > 0;
                                }
                                if (z4) {
                                    i5 = b2.f16388b;
                                    i8 = b2.mo13538a();
                                    i11 = i;
                                    i10 = i14;
                                    soVar2 = soVar;
                                }
                            } else {
                                soVar = b;
                                iArr2 = iArr4;
                                arrayList = arrayList2;
                            }
                            i14++;
                            toVar = toVar2;
                            b = soVar;
                            arrayList2 = arrayList;
                            iArr4 = iArr2;
                        }
                        C2891to toVar3 = toVar;
                        i9++;
                        i6 = 1;
                    }
                    if (soVar2 == null) {
                        bpVar2 = null;
                    } else {
                        bpVar2 = new C2223bp(soVar2, i10, 0, (Object) null);
                    }
                    xoVarArr[i4] = bpVar2;
                    z3 = bpVar2 != null;
                }
                int i16 = toVarArr[i4].f18176a;
            }
            i4++;
            i3 = 2;
        }
        int i17 = 0;
        boolean z5 = false;
        while (i17 < i3) {
            if (xiVarArr[i17].mo8370e() == 1 && !z5) {
                C2891to toVar4 = toVarArr[i17];
                int[][] iArr5 = iArr[i17];
                String str = yoVar.f20724a;
                int i18 = 0;
                int i19 = 0;
                int i20 = -1;
                int i21 = -1;
                while (i18 < toVar4.f18176a) {
                    C2854so b3 = toVar4.mo14333b(i18);
                    int[] iArr6 = iArr5[i18];
                    int i22 = i21;
                    int i23 = i20;
                    int i24 = i19;
                    int i25 = 0;
                    while (true) {
                        int i26 = b3.f17600a;
                        if (i25 > 0) {
                            break;
                        }
                        if (m24719g(iArr6[i25], true)) {
                            C2774qi b4 = b3.mo14108b(i25);
                            int i27 = iArr6[i25];
                            int i28 = 1 != (b4.f16383F & 1) ? 1 : 2;
                            if (m24719g(i27, false)) {
                                i28 += AdError.NETWORK_ERROR_CODE;
                            }
                            if (i28 > i24) {
                                i23 = i18;
                                i22 = i25;
                                i24 = i28;
                            }
                        }
                        i25++;
                    }
                    i18++;
                    i19 = i24;
                    i20 = i23;
                    i21 = i22;
                }
                if (i20 == -1) {
                    bpVar = null;
                } else {
                    bpVar = new C2223bp(toVar4.mo14333b(i20), i21, 0, (Object) null);
                }
                xoVarArr[i17] = bpVar;
                z5 = bpVar != null;
            }
            i17++;
            i3 = 2;
        }
        return xoVarArr;
    }
}
