package p322p9;

import java.util.Arrays;
import java.util.Map;
import p212d9.C9911c;
import p212d9.C9912d;
import p212d9.C9913e;
import p212d9.C9914f;
import p212d9.C9918j;
import p212d9.C9920l;
import p212d9.C9922n;
import p212d9.C9923o;
import p212d9.C9924p;
import p248h9.C10475a;

/* renamed from: p9.k */
/* compiled from: OneDReader */
public abstract class C12156k implements C9920l {
    /* JADX WARNING: Removed duplicated region for block: B:40:0x007d A[Catch:{ m -> 0x00c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00c5 A[SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private p212d9.C9922n m58389c(p212d9.C9911c r22, java.util.Map<p212d9.C9913e, ?> r23) throws p212d9.C9918j {
        /*
            r21 = this;
            r0 = r23
            int r1 = r22.mo32454d()
            int r2 = r22.mo32453c()
            h9.a r3 = new h9.a
            r3.<init>(r1)
            int r4 = r2 >> 1
            r5 = 0
            r6 = 1
            if (r0 == 0) goto L_0x001f
            d9.e r7 = p212d9.C9913e.TRY_HARDER
            boolean r7 = r0.containsKey(r7)
            if (r7 == 0) goto L_0x001f
            r7 = 1
            goto L_0x0020
        L_0x001f:
            r7 = 0
        L_0x0020:
            if (r7 == 0) goto L_0x0025
            r8 = 8
            goto L_0x0026
        L_0x0025:
            r8 = 5
        L_0x0026:
            int r8 = r2 >> r8
            int r8 = java.lang.Math.max(r6, r8)
            if (r7 == 0) goto L_0x0030
            r7 = r2
            goto L_0x0032
        L_0x0030:
            r7 = 15
        L_0x0032:
            r9 = 0
        L_0x0033:
            if (r9 >= r7) goto L_0x00e1
            int r10 = r9 + 1
            int r11 = r10 / 2
            r9 = r9 & 1
            if (r9 != 0) goto L_0x003f
            r9 = 1
            goto L_0x0040
        L_0x003f:
            r9 = 0
        L_0x0040:
            if (r9 == 0) goto L_0x0043
            goto L_0x0044
        L_0x0043:
            int r11 = -r11
        L_0x0044:
            int r11 = r11 * r8
            int r11 = r11 + r4
            if (r11 < 0) goto L_0x00e1
            if (r11 >= r2) goto L_0x00e1
            r9 = r22
            h9.a r3 = r9.mo32452b(r11, r3)     // Catch:{ j -> 0x00d5 }
            r12 = 0
        L_0x0052:
            r13 = 2
            if (r12 >= r13) goto L_0x00d5
            if (r12 != r6) goto L_0x0075
            r3.mo33563j()
            if (r0 == 0) goto L_0x0075
            d9.e r13 = p212d9.C9913e.NEED_RESULT_POINT_CALLBACK
            boolean r14 = r0.containsKey(r13)
            if (r14 == 0) goto L_0x0075
            java.util.EnumMap r14 = new java.util.EnumMap
            java.lang.Class<d9.e> r15 = p212d9.C9913e.class
            r14.<init>(r15)
            r14.putAll(r0)
            r14.remove(r13)
            r13 = r21
            r0 = r14
            goto L_0x0077
        L_0x0075:
            r13 = r21
        L_0x0077:
            d9.n r14 = r13.mo36672b(r11, r3, r0)     // Catch:{ m -> 0x00c6 }
            if (r12 != r6) goto L_0x00c5
            d9.o r15 = p212d9.C9923o.ORIENTATION     // Catch:{ m -> 0x00c6 }
            r16 = 180(0xb4, float:2.52E-43)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r16)     // Catch:{ m -> 0x00c6 }
            r14.mo32478h(r15, r6)     // Catch:{ m -> 0x00c6 }
            d9.p[] r6 = r14.mo32475e()     // Catch:{ m -> 0x00c6 }
            if (r6 == 0) goto L_0x00c5
            d9.p r15 = new d9.p     // Catch:{ m -> 0x00c6 }
            r16 = r0
            float r0 = (float) r1
            r18 = r6[r5]     // Catch:{ m -> 0x00c8 }
            float r18 = r18.mo32480c()     // Catch:{ m -> 0x00c8 }
            float r18 = r0 - r18
            r19 = 1065353216(0x3f800000, float:1.0)
            r20 = r1
            float r1 = r18 - r19
            r18 = r6[r5]     // Catch:{ m -> 0x00ca }
            float r5 = r18.mo32481d()     // Catch:{ m -> 0x00ca }
            r15.<init>(r1, r5)     // Catch:{ m -> 0x00ca }
            r1 = 0
            r6[r1] = r15     // Catch:{ m -> 0x00ca }
            d9.p r5 = new d9.p     // Catch:{ m -> 0x00ca }
            r15 = 1
            r17 = r6[r15]     // Catch:{ m -> 0x00cb }
            float r17 = r17.mo32480c()     // Catch:{ m -> 0x00cb }
            float r0 = r0 - r17
            float r0 = r0 - r19
            r17 = r6[r15]     // Catch:{ m -> 0x00cb }
            float r1 = r17.mo32481d()     // Catch:{ m -> 0x00cb }
            r5.<init>(r0, r1)     // Catch:{ m -> 0x00cb }
            r6[r15] = r5     // Catch:{ m -> 0x00cb }
        L_0x00c5:
            return r14
        L_0x00c6:
            r16 = r0
        L_0x00c8:
            r20 = r1
        L_0x00ca:
            r15 = 1
        L_0x00cb:
            int r12 = r12 + 1
            r0 = r16
            r1 = r20
            r5 = 0
            r6 = 1
            goto L_0x0052
        L_0x00d5:
            r13 = r21
            r20 = r1
            r15 = 1
            r9 = r10
            r1 = r20
            r5 = 0
            r6 = 1
            goto L_0x0033
        L_0x00e1:
            r13 = r21
            d9.j r0 = p212d9.C9918j.m50862a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p322p9.C12156k.m58389c(d9.c, java.util.Map):d9.n");
    }

    /* renamed from: d */
    protected static float m58390d(int[] iArr, int[] iArr2, float f) {
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            i += iArr[i3];
            i2 += iArr2[i3];
        }
        if (i < i2) {
            return Float.POSITIVE_INFINITY;
        }
        float f2 = (float) i;
        float f3 = f2 / ((float) i2);
        float f4 = f * f3;
        float f5 = 0.0f;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = iArr[i4];
            float f6 = ((float) iArr2[i4]) * f3;
            float f7 = (float) i5;
            float f8 = f7 > f6 ? f7 - f6 : f6 - f7;
            if (f8 > f4) {
                return Float.POSITIVE_INFINITY;
            }
            f5 += f8;
        }
        return f5 / f2;
    }

    /* renamed from: e */
    protected static void m58391e(C10475a aVar, int i, int[] iArr) throws C9918j {
        int length = iArr.length;
        int i2 = 0;
        Arrays.fill(iArr, 0, length, 0);
        int g = aVar.mo33560g();
        if (i < g) {
            boolean z = !aVar.mo33554c(i);
            while (i < g) {
                if (!(aVar.mo33554c(i) ^ z)) {
                    i2++;
                    if (i2 == length) {
                        break;
                    }
                    iArr[i2] = 1;
                    z = !z;
                } else {
                    iArr[i2] = iArr[i2] + 1;
                }
                i++;
            }
            if (i2 == length) {
                return;
            }
            if (i2 != length - 1 || i != g) {
                throw C9918j.m50862a();
            }
            return;
        }
        throw C9918j.m50862a();
    }

    /* renamed from: f */
    protected static void m58392f(C10475a aVar, int i, int[] iArr) throws C9918j {
        int length = iArr.length;
        boolean c = aVar.mo33554c(i);
        while (i > 0 && length >= 0) {
            i--;
            if (aVar.mo33554c(i) != c) {
                length--;
                c = !c;
            }
        }
        if (length < 0) {
            m58391e(aVar, i + 1, iArr);
            return;
        }
        throw C9918j.m50862a();
    }

    /* renamed from: a */
    public C9922n mo32466a(C9911c cVar, Map<C9913e, ?> map) throws C9918j, C9914f {
        try {
            return m58389c(cVar, map);
        } catch (C9918j e) {
            if (!(map != null && map.containsKey(C9913e.TRY_HARDER)) || !cVar.mo32455e()) {
                throw e;
            }
            C9911c f = cVar.mo32456f();
            C9922n c = m58389c(f, map);
            Map<C9923o, Object> d = c.mo32474d();
            int i = 270;
            if (d != null) {
                C9923o oVar = C9923o.ORIENTATION;
                if (d.containsKey(oVar)) {
                    i = (((Integer) d.get(oVar)).intValue() + 270) % 360;
                }
            }
            c.mo32478h(C9923o.ORIENTATION, Integer.valueOf(i));
            C9924p[] e2 = c.mo32475e();
            if (e2 != null) {
                int c2 = f.mo32453c();
                for (int i2 = 0; i2 < e2.length; i2++) {
                    e2[i2] = new C9924p((((float) c2) - e2[i2].mo32481d()) - 1.0f, e2[i2].mo32480c());
                }
            }
            return c;
        }
    }

    /* renamed from: b */
    public abstract C9922n mo36672b(int i, C10475a aVar, Map<C9913e, ?> map) throws C9918j, C9912d, C9914f;

    public void reset() {
    }
}
