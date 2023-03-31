package p248h9;

import p212d9.C9918j;

/* renamed from: h9.i */
/* compiled from: GridSampler */
public abstract class C10483i {

    /* renamed from: a */
    private static C10483i f41515a = new C10480f();

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0075  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static void m52842a(p248h9.C10476b r9, float[] r10) throws p212d9.C9918j {
        /*
            int r0 = r9.mo33578j()
            int r9 = r9.mo33574g()
            r1 = 0
            r2 = 1
            r3 = 0
            r4 = 1
        L_0x000c:
            int r5 = r10.length
            r6 = 0
            r7 = -1
            if (r3 >= r5) goto L_0x0048
            if (r4 == 0) goto L_0x0048
            r4 = r10[r3]
            int r4 = (int) r4
            int r5 = r3 + 1
            r8 = r10[r5]
            int r8 = (int) r8
            if (r4 < r7) goto L_0x0043
            if (r4 > r0) goto L_0x0043
            if (r8 < r7) goto L_0x0043
            if (r8 > r9) goto L_0x0043
            if (r4 != r7) goto L_0x0029
            r10[r3] = r6
        L_0x0027:
            r4 = 1
            goto L_0x0032
        L_0x0029:
            if (r4 != r0) goto L_0x0031
            int r4 = r0 + -1
            float r4 = (float) r4
            r10[r3] = r4
            goto L_0x0027
        L_0x0031:
            r4 = 0
        L_0x0032:
            if (r8 != r7) goto L_0x0038
            r10[r5] = r6
        L_0x0036:
            r4 = 1
            goto L_0x0040
        L_0x0038:
            if (r8 != r9) goto L_0x0040
            int r4 = r9 + -1
            float r4 = (float) r4
            r10[r5] = r4
            goto L_0x0036
        L_0x0040:
            int r3 = r3 + 2
            goto L_0x000c
        L_0x0043:
            d9.j r9 = p212d9.C9918j.m50862a()
            throw r9
        L_0x0048:
            int r3 = r10.length
            int r3 = r3 + -2
            r4 = 1
        L_0x004c:
            if (r3 < 0) goto L_0x0085
            if (r4 == 0) goto L_0x0085
            r4 = r10[r3]
            int r4 = (int) r4
            int r5 = r3 + 1
            r8 = r10[r5]
            int r8 = (int) r8
            if (r4 < r7) goto L_0x0080
            if (r4 > r0) goto L_0x0080
            if (r8 < r7) goto L_0x0080
            if (r8 > r9) goto L_0x0080
            if (r4 != r7) goto L_0x0066
            r10[r3] = r6
        L_0x0064:
            r4 = 1
            goto L_0x006f
        L_0x0066:
            if (r4 != r0) goto L_0x006e
            int r4 = r0 + -1
            float r4 = (float) r4
            r10[r3] = r4
            goto L_0x0064
        L_0x006e:
            r4 = 0
        L_0x006f:
            if (r8 != r7) goto L_0x0075
            r10[r5] = r6
        L_0x0073:
            r4 = 1
            goto L_0x007d
        L_0x0075:
            if (r8 != r9) goto L_0x007d
            int r4 = r9 + -1
            float r4 = (float) r4
            r10[r5] = r4
            goto L_0x0073
        L_0x007d:
            int r3 = r3 + -2
            goto L_0x004c
        L_0x0080:
            d9.j r9 = p212d9.C9918j.m50862a()
            throw r9
        L_0x0085:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p248h9.C10483i.m52842a(h9.b, float[]):void");
    }

    /* renamed from: b */
    public static C10483i m52843b() {
        return f41515a;
    }

    /* renamed from: c */
    public abstract C10476b mo33602c(C10476b bVar, int i, int i2, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) throws C9918j;

    /* renamed from: d */
    public abstract C10476b mo33603d(C10476b bVar, int i, int i2, C10485k kVar) throws C9918j;
}
