package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class qi4 extends si4 {

    /* renamed from: f */
    private final mk4 f16413f;

    /* renamed from: g */
    private final ua3 f16414g;

    /* renamed from: h */
    private final wa1 f16415h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected qi4(gv0 gv0, int[] iArr, int i, mk4 mk4, long j, long j2, long j3, int i2, int i3, float f, float f2, List list, wa1 wa1) {
        super(gv0, iArr, 0);
        gv0 gv02 = gv0;
        int[] iArr2 = iArr;
        this.f16413f = mk4;
        this.f16414g = ua3.m21506u(list);
        this.f16415h = wa1;
    }

    /* renamed from: b */
    static /* bridge */ /* synthetic */ ua3 m19230b(wj4[] wj4Arr) {
        int i;
        int i2;
        double d;
        ArrayList arrayList = new ArrayList();
        char c = 0;
        int i3 = 0;
        while (true) {
            i = 2;
            i2 = 1;
            if (i3 >= 2) {
                break;
            }
            wj4 wj4 = wj4Arr[i3];
            if (wj4 == null || wj4.f19660b.length <= 1) {
                arrayList.add((Object) null);
            } else {
                ra3 q = ua3.m21502q();
                q.mo13701f(new oi4(0, 0));
                arrayList.add(q);
            }
            i3++;
        }
        long[][] jArr = new long[2][];
        for (int i4 = 0; i4 < 2; i4++) {
            wj4 wj42 = wj4Arr[i4];
            if (wj42 == null) {
                jArr[i4] = new long[0];
            } else {
                jArr[i4] = new long[wj42.f19660b.length];
                int i5 = 0;
                while (true) {
                    int[] iArr = wj42.f19660b;
                    if (i5 >= iArr.length) {
                        break;
                    }
                    jArr[i4][i5] = (long) wj42.f19659a.mo10649b(iArr[i5]).f9669h;
                    i5++;
                }
                Arrays.sort(jArr[i4]);
            }
        }
        int[] iArr2 = new int[2];
        long[] jArr2 = new long[2];
        for (int i6 = 0; i6 < 2; i6++) {
            long[] jArr3 = jArr[i6];
            jArr2[i6] = jArr3.length == 0 ? 0 : jArr3[0];
        }
        m19231c(arrayList, jArr2);
        fb3 c2 = xb3.m23171b(cc3.m10845c()).mo14887b(2).mo14491c();
        int i7 = 0;
        while (i7 < i) {
            int length = jArr[i7].length;
            if (length > i2) {
                double[] dArr = new double[length];
                int i8 = 0;
                while (true) {
                    long[] jArr4 = jArr[i7];
                    double d2 = 0.0d;
                    if (i8 >= jArr4.length) {
                        break;
                    }
                    long j = jArr4[i8];
                    if (j != -1) {
                        d2 = Math.log((double) j);
                    }
                    dArr[i8] = d2;
                    i8++;
                }
                int i9 = length - 1;
                double d3 = dArr[i9] - dArr[c];
                int i10 = 0;
                while (i10 < i9) {
                    int i11 = i10 + 1;
                    double d4 = (dArr[i10] + dArr[i11]) * 0.5d;
                    if (d3 == 0.0d) {
                        d = 1.0d;
                    } else {
                        d = (d4 - dArr[c]) / d3;
                    }
                    c2.mo12870a(Double.valueOf(d), Integer.valueOf(i7));
                    i10 = i11;
                    c = 0;
                }
            }
            i7++;
            c = 0;
            i = 2;
            i2 = 1;
        }
        ua3 u = ua3.m21506u(c2.mo13522g());
        for (int i12 = 0; i12 < u.size(); i12++) {
            int intValue = ((Integer) u.get(i12)).intValue();
            int i13 = iArr2[intValue] + 1;
            iArr2[intValue] = i13;
            jArr2[intValue] = jArr[intValue][i13];
            m19231c(arrayList, jArr2);
        }
        for (int i14 = 0; i14 < 2; i14++) {
            if (arrayList.get(i14) != null) {
                long j2 = jArr2[i14];
                jArr2[i14] = j2 + j2;
            }
        }
        m19231c(arrayList, jArr2);
        ra3 q2 = ua3.m21502q();
        for (int i15 = 0; i15 < arrayList.size(); i15++) {
            ra3 ra3 = (ra3) arrayList.get(i15);
            q2.mo13701f(ra3 == null ? ua3.m21508w() : ra3.mo13703h());
        }
        return q2.mo13703h();
    }

    /* renamed from: c */
    private static void m19231c(List list, long[] jArr) {
        long j = 0;
        for (int i = 0; i < 2; i++) {
            j += jArr[i];
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            ra3 ra3 = (ra3) list.get(i2);
            if (ra3 != null) {
                ra3.mo13701f(new oi4(j, jArr[i2]));
            }
        }
    }
}
