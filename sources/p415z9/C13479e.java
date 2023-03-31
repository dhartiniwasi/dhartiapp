package p415z9;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import p212d9.C9913e;
import p212d9.C9918j;
import p212d9.C9924p;
import p212d9.C9925q;
import p248h9.C10476b;

/* renamed from: z9.e */
/* compiled from: FinderPatternFinder */
public class C13479e {

    /* renamed from: a */
    private final C10476b f47856a;

    /* renamed from: b */
    private final List<C13478d> f47857b = new ArrayList();

    /* renamed from: c */
    private boolean f47858c;

    /* renamed from: d */
    private final int[] f47859d = new int[5];

    /* renamed from: e */
    private final C9925q f47860e;

    /* renamed from: z9.e$b */
    /* compiled from: FinderPatternFinder */
    private static final class C13481b implements Serializable, Comparator<C13478d> {

        /* renamed from: a */
        private final float f47861a;

        /* renamed from: a */
        public int compare(C13478d dVar, C13478d dVar2) {
            if (dVar2.mo38603h() != dVar.mo38603h()) {
                return dVar2.mo38603h() - dVar.mo38603h();
            }
            float abs = Math.abs(dVar2.mo38604i() - this.f47861a);
            float abs2 = Math.abs(dVar.mo38604i() - this.f47861a);
            if (abs < abs2) {
                return 1;
            }
            return abs == abs2 ? 0 : -1;
        }

        private C13481b(float f) {
            this.f47861a = f;
        }
    }

    /* renamed from: z9.e$c */
    /* compiled from: FinderPatternFinder */
    private static final class C13482c implements Serializable, Comparator<C13478d> {

        /* renamed from: a */
        private final float f47862a;

        /* renamed from: a */
        public int compare(C13478d dVar, C13478d dVar2) {
            float abs = Math.abs(dVar2.mo38604i() - this.f47862a);
            float abs2 = Math.abs(dVar.mo38604i() - this.f47862a);
            if (abs < abs2) {
                return -1;
            }
            return abs == abs2 ? 0 : 1;
        }

        private C13482c(float f) {
            this.f47862a = f;
        }
    }

    public C13479e(C10476b bVar, C9925q qVar) {
        this.f47856a = bVar;
        this.f47860e = qVar;
    }

    /* renamed from: a */
    private static float m62581a(int[] iArr, int i) {
        return ((float) ((i - iArr[4]) - iArr[3])) - (((float) iArr[2]) / 2.0f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x00b7 A[LOOP:4: B:41:0x00a2->B:49:0x00b7, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00bf A[ADDED_TO_REGION, EDGE_INSN: B:87:0x00bf->B:50:0x00bf ?: BREAK  
    EDGE_INSN: B:88:0x00bf->B:50:0x00bf ?: BREAK  
    EDGE_INSN: B:89:0x00bf->B:50:0x00bf ?: BREAK  
    EDGE_INSN: B:90:0x00bf->B:50:0x00bf ?: BREAK  ] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00df A[LOOP:5: B:55:0x00ca->B:63:0x00df, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00e7 A[EDGE_INSN: B:91:0x00e7->B:64:0x00e7 ?: BREAK  
    EDGE_INSN: B:92:0x00e7->B:64:0x00e7 ?: BREAK  
    EDGE_INSN: B:93:0x00e7->B:64:0x00e7 ?: BREAK  
    EDGE_INSN: B:94:0x00e7->B:64:0x00e7 ?: BREAK  ] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x010a A[RETURN] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m62582b(int r17, int r18, int r19, int r20) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            int[] r4 = r16.m62587h()
            r5 = 0
            r6 = 0
        L_0x000e:
            r7 = 2
            r8 = 1
            if (r1 < r6) goto L_0x0028
            if (r2 < r6) goto L_0x0028
            h9.b r9 = r0.f47856a
            int r10 = r2 - r6
            int r11 = r1 - r6
            boolean r9 = r9.mo33570d(r10, r11)
            if (r9 == 0) goto L_0x0028
            r9 = r4[r7]
            int r9 = r9 + r8
            r4[r7] = r9
            int r6 = r6 + 1
            goto L_0x000e
        L_0x0028:
            if (r1 < r6) goto L_0x010b
            if (r2 >= r6) goto L_0x002e
            goto L_0x010b
        L_0x002e:
            if (r1 < r6) goto L_0x004a
            if (r2 < r6) goto L_0x004a
            h9.b r9 = r0.f47856a
            int r10 = r2 - r6
            int r11 = r1 - r6
            boolean r9 = r9.mo33570d(r10, r11)
            if (r9 != 0) goto L_0x004a
            r9 = r4[r8]
            if (r9 > r3) goto L_0x004a
            r9 = r4[r8]
            int r9 = r9 + r8
            r4[r8] = r9
            int r6 = r6 + 1
            goto L_0x002e
        L_0x004a:
            if (r1 < r6) goto L_0x010b
            if (r2 < r6) goto L_0x010b
            r9 = r4[r8]
            if (r9 <= r3) goto L_0x0054
            goto L_0x010b
        L_0x0054:
            if (r1 < r6) goto L_0x0070
            if (r2 < r6) goto L_0x0070
            h9.b r9 = r0.f47856a
            int r10 = r2 - r6
            int r11 = r1 - r6
            boolean r9 = r9.mo33570d(r10, r11)
            if (r9 == 0) goto L_0x0070
            r9 = r4[r5]
            if (r9 > r3) goto L_0x0070
            r9 = r4[r5]
            int r9 = r9 + r8
            r4[r5] = r9
            int r6 = r6 + 1
            goto L_0x0054
        L_0x0070:
            r6 = r4[r5]
            if (r6 <= r3) goto L_0x0075
            return r5
        L_0x0075:
            h9.b r6 = r0.f47856a
            int r6 = r6.mo33574g()
            h9.b r9 = r0.f47856a
            int r9 = r9.mo33578j()
            r10 = 1
        L_0x0082:
            int r11 = r1 + r10
            if (r11 >= r6) goto L_0x009a
            int r12 = r2 + r10
            if (r12 >= r9) goto L_0x009a
            h9.b r13 = r0.f47856a
            boolean r12 = r13.mo33570d(r12, r11)
            if (r12 == 0) goto L_0x009a
            r11 = r4[r7]
            int r11 = r11 + r8
            r4[r7] = r11
            int r10 = r10 + 1
            goto L_0x0082
        L_0x009a:
            if (r11 >= r6) goto L_0x010b
            int r11 = r2 + r10
            if (r11 < r9) goto L_0x00a2
            goto L_0x010b
        L_0x00a2:
            int r11 = r1 + r10
            r12 = 3
            if (r11 >= r6) goto L_0x00bf
            int r13 = r2 + r10
            if (r13 >= r9) goto L_0x00bf
            h9.b r14 = r0.f47856a
            boolean r13 = r14.mo33570d(r13, r11)
            if (r13 != 0) goto L_0x00bf
            r13 = r4[r12]
            if (r13 >= r3) goto L_0x00bf
            r11 = r4[r12]
            int r11 = r11 + r8
            r4[r12] = r11
            int r10 = r10 + 1
            goto L_0x00a2
        L_0x00bf:
            if (r11 >= r6) goto L_0x010b
            int r11 = r2 + r10
            if (r11 >= r9) goto L_0x010b
            r11 = r4[r12]
            if (r11 < r3) goto L_0x00ca
            goto L_0x010b
        L_0x00ca:
            int r11 = r1 + r10
            r13 = 4
            if (r11 >= r6) goto L_0x00e7
            int r14 = r2 + r10
            if (r14 >= r9) goto L_0x00e7
            h9.b r15 = r0.f47856a
            boolean r11 = r15.mo33570d(r14, r11)
            if (r11 == 0) goto L_0x00e7
            r11 = r4[r13]
            if (r11 >= r3) goto L_0x00e7
            r11 = r4[r13]
            int r11 = r11 + r8
            r4[r13] = r11
            int r10 = r10 + 1
            goto L_0x00ca
        L_0x00e7:
            r1 = r4[r13]
            if (r1 < r3) goto L_0x00ec
            return r5
        L_0x00ec:
            r1 = r4[r5]
            r2 = r4[r8]
            int r1 = r1 + r2
            r2 = r4[r7]
            int r1 = r1 + r2
            r2 = r4[r12]
            int r1 = r1 + r2
            r2 = r4[r13]
            int r1 = r1 + r2
            int r1 = r1 - r20
            int r1 = java.lang.Math.abs(r1)
            int r2 = r20 * 2
            if (r1 >= r2) goto L_0x010b
            boolean r1 = m62586g(r4)
            if (r1 == 0) goto L_0x010b
            return r8
        L_0x010b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p415z9.C13479e.m62582b(int, int, int, int):boolean");
    }

    /* renamed from: c */
    private float m62583c(int i, int i2, int i3, int i4) {
        C10476b bVar = this.f47856a;
        int j = bVar.mo33578j();
        int[] h = m62587h();
        int i5 = i;
        while (i5 >= 0 && bVar.mo33570d(i5, i2)) {
            h[2] = h[2] + 1;
            i5--;
        }
        if (i5 < 0) {
            return Float.NaN;
        }
        while (i5 >= 0 && !bVar.mo33570d(i5, i2) && h[1] <= i3) {
            h[1] = h[1] + 1;
            i5--;
        }
        if (i5 >= 0 && h[1] <= i3) {
            while (i5 >= 0 && bVar.mo33570d(i5, i2) && h[0] <= i3) {
                h[0] = h[0] + 1;
                i5--;
            }
            if (h[0] > i3) {
                return Float.NaN;
            }
            int i6 = i + 1;
            while (i6 < j && bVar.mo33570d(i6, i2)) {
                h[2] = h[2] + 1;
                i6++;
            }
            if (i6 == j) {
                return Float.NaN;
            }
            while (i6 < j && !bVar.mo33570d(i6, i2) && h[3] < i3) {
                h[3] = h[3] + 1;
                i6++;
            }
            if (i6 != j && h[3] < i3) {
                while (i6 < j && bVar.mo33570d(i6, i2) && h[4] < i3) {
                    h[4] = h[4] + 1;
                    i6++;
                }
                if (h[4] < i3 && Math.abs(((((h[0] + h[1]) + h[2]) + h[3]) + h[4]) - i4) * 5 < i4 && m62586g(h)) {
                    return m62581a(h, i6);
                }
            }
        }
        return Float.NaN;
    }

    /* renamed from: d */
    private float m62584d(int i, int i2, int i3, int i4) {
        C10476b bVar = this.f47856a;
        int g = bVar.mo33574g();
        int[] h = m62587h();
        int i5 = i;
        while (i5 >= 0 && bVar.mo33570d(i2, i5)) {
            h[2] = h[2] + 1;
            i5--;
        }
        if (i5 < 0) {
            return Float.NaN;
        }
        while (i5 >= 0 && !bVar.mo33570d(i2, i5) && h[1] <= i3) {
            h[1] = h[1] + 1;
            i5--;
        }
        if (i5 >= 0 && h[1] <= i3) {
            while (i5 >= 0 && bVar.mo33570d(i2, i5) && h[0] <= i3) {
                h[0] = h[0] + 1;
                i5--;
            }
            if (h[0] > i3) {
                return Float.NaN;
            }
            int i6 = i + 1;
            while (i6 < g && bVar.mo33570d(i2, i6)) {
                h[2] = h[2] + 1;
                i6++;
            }
            if (i6 == g) {
                return Float.NaN;
            }
            while (i6 < g && !bVar.mo33570d(i2, i6) && h[3] < i3) {
                h[3] = h[3] + 1;
                i6++;
            }
            if (i6 != g && h[3] < i3) {
                while (i6 < g && bVar.mo33570d(i2, i6) && h[4] < i3) {
                    h[4] = h[4] + 1;
                    i6++;
                }
                if (h[4] < i3 && Math.abs(((((h[0] + h[1]) + h[2]) + h[3]) + h[4]) - i4) * 5 < i4 * 2 && m62586g(h)) {
                    return m62581a(h, i6);
                }
            }
        }
        return Float.NaN;
    }

    /* renamed from: f */
    private int m62585f() {
        if (this.f47857b.size() <= 1) {
            return 0;
        }
        C13478d dVar = null;
        for (C13478d next : this.f47857b) {
            if (next.mo38603h() >= 2) {
                if (dVar == null) {
                    dVar = next;
                } else {
                    this.f47858c = true;
                    return ((int) (Math.abs(dVar.mo32480c() - next.mo32480c()) - Math.abs(dVar.mo32481d() - next.mo32481d()))) / 2;
                }
            }
        }
        return 0;
    }

    /* renamed from: g */
    protected static boolean m62586g(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 5; i2++) {
            int i3 = iArr[i2];
            if (i3 == 0) {
                return false;
            }
            i += i3;
        }
        if (i < 7) {
            return false;
        }
        float f = ((float) i) / 7.0f;
        float f2 = f / 2.0f;
        if (Math.abs(f - ((float) iArr[0])) >= f2 || Math.abs(f - ((float) iArr[1])) >= f2 || Math.abs((f * 3.0f) - ((float) iArr[2])) >= 3.0f * f2 || Math.abs(f - ((float) iArr[3])) >= f2 || Math.abs(f - ((float) iArr[4])) >= f2) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    private int[] m62587h() {
        int[] iArr = this.f47859d;
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        iArr[4] = 0;
        return iArr;
    }

    /* renamed from: j */
    private boolean m62588j() {
        int size = this.f47857b.size();
        float f = 0.0f;
        int i = 0;
        float f2 = 0.0f;
        for (C13478d next : this.f47857b) {
            if (next.mo38603h() >= 2) {
                i++;
                f2 += next.mo38604i();
            }
        }
        if (i < 3) {
            return false;
        }
        float f3 = f2 / ((float) size);
        for (C13478d i2 : this.f47857b) {
            f += Math.abs(i2.mo38604i() - f3);
        }
        if (f <= f2 * 0.05f) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    private C13478d[] m62589k() throws C9918j {
        int size = this.f47857b.size();
        if (size >= 3) {
            float f = 0.0f;
            if (size > 3) {
                float f2 = 0.0f;
                float f3 = 0.0f;
                for (C13478d i : this.f47857b) {
                    float i2 = i.mo38604i();
                    f2 += i2;
                    f3 += i2 * i2;
                }
                float f4 = (float) size;
                float f5 = f2 / f4;
                float sqrt = (float) Math.sqrt((double) ((f3 / f4) - (f5 * f5)));
                Collections.sort(this.f47857b, new C13482c(f5));
                float max = Math.max(0.2f * f5, sqrt);
                int i3 = 0;
                while (i3 < this.f47857b.size() && this.f47857b.size() > 3) {
                    if (Math.abs(this.f47857b.get(i3).mo38604i() - f5) > max) {
                        this.f47857b.remove(i3);
                        i3--;
                    }
                    i3++;
                }
            }
            if (this.f47857b.size() > 3) {
                for (C13478d i4 : this.f47857b) {
                    f += i4.mo38604i();
                }
                Collections.sort(this.f47857b, new C13481b(f / ((float) this.f47857b.size())));
                List<C13478d> list = this.f47857b;
                list.subList(3, list.size()).clear();
            }
            return new C13478d[]{this.f47857b.get(0), this.f47857b.get(1), this.f47857b.get(2)};
        }
        throw C9918j.m50862a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final C13483f mo38605e(Map<C9913e, ?> map) throws C9918j {
        boolean z = map != null && map.containsKey(C9913e.TRY_HARDER);
        boolean z2 = map != null && map.containsKey(C9913e.PURE_BARCODE);
        int g = this.f47856a.mo33574g();
        int j = this.f47856a.mo33578j();
        int i = (g * 3) / 228;
        if (i < 3 || z) {
            i = 3;
        }
        int[] iArr = new int[5];
        int i2 = i - 1;
        boolean z3 = false;
        while (i2 < g && !z3) {
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            iArr[3] = 0;
            iArr[4] = 0;
            int i3 = 0;
            int i4 = 0;
            while (i3 < j) {
                if (this.f47856a.mo33570d(i3, i2)) {
                    if ((i4 & 1) == 1) {
                        i4++;
                    }
                    iArr[i4] = iArr[i4] + 1;
                } else if ((i4 & 1) != 0) {
                    iArr[i4] = iArr[i4] + 1;
                } else if (i4 == 4) {
                    if (!m62586g(iArr)) {
                        iArr[0] = iArr[2];
                        iArr[1] = iArr[3];
                        iArr[2] = iArr[4];
                        iArr[3] = 1;
                        iArr[4] = 0;
                    } else if (mo38606i(iArr, i2, i3, z2)) {
                        if (this.f47858c) {
                            z3 = m62588j();
                        } else {
                            int f = m62585f();
                            if (f > iArr[2]) {
                                i2 += (f - iArr[2]) - 2;
                                i3 = j - 1;
                            }
                        }
                        iArr[0] = 0;
                        iArr[1] = 0;
                        iArr[2] = 0;
                        iArr[3] = 0;
                        iArr[4] = 0;
                        i = 2;
                        i4 = 0;
                    } else {
                        iArr[0] = iArr[2];
                        iArr[1] = iArr[3];
                        iArr[2] = iArr[4];
                        iArr[3] = 1;
                        iArr[4] = 0;
                    }
                    i4 = 3;
                } else {
                    i4++;
                    iArr[i4] = iArr[i4] + 1;
                }
                i3++;
            }
            if (m62586g(iArr) && mo38606i(iArr, i2, j, z2)) {
                i = iArr[0];
                if (this.f47858c) {
                    z3 = m62588j();
                }
            }
            i2 += i;
        }
        C13478d[] k = m62589k();
        C9924p.m50877e(k);
        return new C13483f(k);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final boolean mo38606i(int[] iArr, int i, int i2, boolean z) {
        boolean z2 = false;
        int i3 = iArr[0] + iArr[1] + iArr[2] + iArr[3] + iArr[4];
        int a = (int) m62581a(iArr, i2);
        float d = m62584d(i, a, iArr[2], i3);
        if (!Float.isNaN(d)) {
            int i4 = (int) d;
            float c = m62583c(a, i4, iArr[2], i3);
            if (!Float.isNaN(c) && (!z || m62582b(i4, (int) c, iArr[2], i3))) {
                float f = ((float) i3) / 7.0f;
                int i5 = 0;
                while (true) {
                    if (i5 >= this.f47857b.size()) {
                        break;
                    }
                    C13478d dVar = this.f47857b.get(i5);
                    if (dVar.mo38601f(f, d, c)) {
                        this.f47857b.set(i5, dVar.mo38602g(d, c, f));
                        z2 = true;
                        break;
                    }
                    i5++;
                }
                if (!z2) {
                    C13478d dVar2 = new C13478d(c, d, f);
                    this.f47857b.add(dVar2);
                    C9925q qVar = this.f47860e;
                    if (qVar != null) {
                        qVar.mo32485a(dVar2);
                    }
                }
                return true;
            }
        }
        return false;
    }
}
