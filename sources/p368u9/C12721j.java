package p368u9;

import java.lang.reflect.Array;
import java.util.ArrayList;
import p212d9.C9912d;
import p212d9.C9914f;
import p212d9.C9918j;
import p212d9.C9924p;
import p248h9.C10476b;
import p248h9.C10479e;
import p358t9.C12553a;
import p378v9.C12855a;

/* renamed from: u9.j */
/* compiled from: PDF417ScanningDecoder */
public final class C12721j {

    /* renamed from: a */
    private static final C12855a f46519a = new C12855a();

    /* renamed from: a */
    private static C12712c m60325a(C12719h hVar) throws C9918j {
        int[] j;
        if (hVar == null || (j = hVar.mo37625j()) == null) {
            return null;
        }
        int p = m60340p(j);
        int i = 0;
        int i2 = 0;
        for (int i3 : j) {
            i2 += p - i3;
            if (i3 > 0) {
                break;
            }
        }
        C12713d[] d = hVar.mo37619d();
        int i4 = 0;
        while (i2 > 0 && d[i4] == null) {
            i2--;
            i4++;
        }
        for (int length = j.length - 1; length >= 0; length--) {
            i += p - j[length];
            if (j[length] > 0) {
                break;
            }
        }
        int length2 = d.length - 1;
        while (i > 0 && d[length2] == null) {
            i--;
            length2--;
        }
        return hVar.mo37616a().mo37587a(i2, i, hVar.mo37626k());
    }

    /* renamed from: b */
    private static void m60326b(C12717f fVar, C12711b[][] bVarArr) throws C9918j {
        int[] a = bVarArr[0][1].mo37585a();
        int j = (fVar.mo37607j() * fVar.mo37609l()) - m60342r(fVar.mo37608k());
        if (a.length == 0) {
            if (j <= 0 || j > 928) {
                throw C9918j.m50862a();
            }
            bVarArr[0][1].mo37586b(j);
        } else if (a[0] != j) {
            bVarArr[0][1].mo37586b(j);
        }
    }

    /* renamed from: c */
    private static int m60327c(C10476b bVar, int i, int i2, boolean z, int i3, int i4) {
        int i5 = z ? -1 : 1;
        int i6 = i3;
        for (int i7 = 0; i7 < 2; i7++) {
            while (true) {
                if (!z) {
                    if (i6 >= i2) {
                        continue;
                        break;
                    }
                } else if (i6 < i) {
                    continue;
                    break;
                }
                if (z != bVar.mo33570d(i6, i4)) {
                    continue;
                    break;
                } else if (Math.abs(i3 - i6) > 2) {
                    return i3;
                } else {
                    i6 += i5;
                }
            }
            i5 = -i5;
            z = !z;
        }
        return i6;
    }

    /* renamed from: d */
    private static boolean m60328d(int i, int i2, int i3) {
        return i2 + -2 <= i && i <= i3 + 2;
    }

    /* renamed from: e */
    private static int m60329e(int[] iArr, int[] iArr2, int i) throws C9912d {
        if ((iArr2 == null || iArr2.length <= (i / 2) + 3) && i >= 0 && i <= 512) {
            return f46519a.mo37844a(iArr, i, iArr2);
        }
        throw C9912d.m50844a();
    }

    /* renamed from: f */
    private static C12711b[][] m60330f(C12717f fVar) {
        int c;
        int l = fVar.mo37609l();
        int[] iArr = new int[2];
        iArr[1] = fVar.mo37607j() + 2;
        iArr[0] = l;
        C12711b[][] bVarArr = (C12711b[][]) Array.newInstance(C12711b.class, iArr);
        for (int i = 0; i < bVarArr.length; i++) {
            for (int i2 = 0; i2 < bVarArr[i].length; i2++) {
                bVarArr[i][i2] = new C12711b();
            }
        }
        int i3 = 0;
        for (C12718g gVar : fVar.mo37612o()) {
            if (gVar != null) {
                for (C12713d dVar : gVar.mo37619d()) {
                    if (dVar != null && (c = dVar.mo37598c()) >= 0 && c < bVarArr.length) {
                        bVarArr[c][i3].mo37586b(dVar.mo37600e());
                    }
                }
            }
            i3++;
        }
        return bVarArr;
    }

    /* renamed from: g */
    private static C10479e m60331g(C12717f fVar) throws C9914f, C9912d, C9918j {
        C12711b[][] f = m60330f(fVar);
        m60326b(fVar, f);
        ArrayList arrayList = new ArrayList();
        int[] iArr = new int[(fVar.mo37609l() * fVar.mo37607j())];
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i = 0; i < fVar.mo37609l(); i++) {
            int i2 = 0;
            while (i2 < fVar.mo37607j()) {
                int i3 = i2 + 1;
                int[] a = f[i][i3].mo37585a();
                int j = (fVar.mo37607j() * i) + i2;
                if (a.length == 0) {
                    arrayList.add(Integer.valueOf(j));
                } else if (a.length == 1) {
                    iArr[j] = a[0];
                } else {
                    arrayList3.add(Integer.valueOf(j));
                    arrayList2.add(a);
                }
                i2 = i3;
            }
        }
        int size = arrayList2.size();
        int[][] iArr2 = new int[size][];
        for (int i4 = 0; i4 < size; i4++) {
            iArr2[i4] = (int[]) arrayList2.get(i4);
        }
        return m60332h(fVar.mo37608k(), iArr, C12553a.m59749b(arrayList), C12553a.m59749b(arrayList3), iArr2);
    }

    /* renamed from: h */
    private static C10479e m60332h(int i, int[] iArr, int[] iArr2, int[] iArr3, int[][] iArr4) throws C9914f, C9912d {
        int length = iArr3.length;
        int[] iArr5 = new int[length];
        int i2 = 100;
        while (true) {
            int i3 = i2 - 1;
            if (i2 > 0) {
                for (int i4 = 0; i4 < length; i4++) {
                    iArr[iArr3[i4]] = iArr4[i4][iArr5[i4]];
                }
                try {
                    return m60334j(iArr, i, iArr2);
                } catch (C9912d unused) {
                    if (length != 0) {
                        int i5 = 0;
                        while (true) {
                            if (i5 >= length) {
                                break;
                            } else if (iArr5[i5] < iArr4[i5].length - 1) {
                                iArr5[i5] = iArr5[i5] + 1;
                                break;
                            } else {
                                iArr5[i5] = 0;
                                if (i5 != length - 1) {
                                    i5++;
                                } else {
                                    throw C9912d.m50844a();
                                }
                            }
                        }
                        i2 = i3;
                    } else {
                        throw C9912d.m50844a();
                    }
                }
            } else {
                throw C9912d.m50844a();
            }
        }
    }

    /* renamed from: i */
    public static C10479e m60333i(C10476b bVar, C9924p pVar, C9924p pVar2, C9924p pVar3, C9924p pVar4, int i, int i2) throws C9918j, C9914f, C9912d {
        C12718g gVar;
        int i3;
        int i4;
        int i5;
        C12719h hVar = null;
        C12719h hVar2 = null;
        C12717f fVar = null;
        C12712c cVar = new C12712c(bVar, pVar, pVar2, pVar3, pVar4);
        int i6 = 0;
        while (true) {
            if (i6 >= 2) {
                break;
            }
            if (pVar != null) {
                hVar = m60343s(bVar, cVar, pVar, true, i, i2);
            }
            if (pVar3 != null) {
                hVar2 = m60343s(bVar, cVar, pVar3, false, i, i2);
            }
            fVar = m60346v(hVar, hVar2);
            if (fVar == null) {
                throw C9918j.m50862a();
            } else if (i6 != 0 || fVar.mo37610m() == null || (fVar.mo37610m().mo37593h() >= cVar.mo37593h() && fVar.mo37610m().mo37591f() <= cVar.mo37591f())) {
                fVar.mo37613p(cVar);
            } else {
                cVar = fVar.mo37610m();
                i6++;
            }
        }
        fVar.mo37613p(cVar);
        int j = fVar.mo37607j() + 1;
        fVar.mo37614q(0, hVar);
        fVar.mo37614q(j, hVar2);
        boolean z = hVar != null;
        int i7 = i;
        int i8 = i2;
        for (int i9 = 1; i9 <= j; i9++) {
            int i10 = z ? i9 : j - i9;
            if (fVar.mo37611n(i10) == null) {
                if (i10 == 0 || i10 == j) {
                    gVar = new C12719h(cVar, i10 == 0);
                } else {
                    gVar = new C12718g(cVar);
                }
                fVar.mo37614q(i10, gVar);
                int i11 = -1;
                int h = cVar.mo37593h();
                int i12 = -1;
                while (h <= cVar.mo37591f()) {
                    int t = m60344t(fVar, i10, h, z);
                    if (t >= 0 && t <= cVar.mo37590e()) {
                        i5 = t;
                    } else if (i12 != i11) {
                        i5 = i12;
                    } else {
                        i4 = i12;
                        i3 = h;
                        i12 = i4;
                        h = i3 + 1;
                        i11 = -1;
                    }
                    i4 = i12;
                    int i13 = h;
                    C12713d k = m60335k(bVar, cVar.mo37592g(), cVar.mo37590e(), z, i5, i13, i7, i8);
                    i3 = i13;
                    if (k != null) {
                        gVar.mo37621f(i3, k);
                        i7 = Math.min(i7, k.mo37601f());
                        i8 = Math.max(i8, k.mo37601f());
                        i12 = i5;
                        h = i3 + 1;
                        i11 = -1;
                    }
                    i12 = i4;
                    h = i3 + 1;
                    i11 = -1;
                }
            }
        }
        return m60331g(fVar);
    }

    /* renamed from: j */
    private static C10479e m60334j(int[] iArr, int i, int[] iArr2) throws C9914f, C9912d {
        if (iArr.length != 0) {
            int i2 = 1 << (i + 1);
            int e = m60329e(iArr, iArr2, i2);
            m60347w(iArr, i2);
            C10479e b = C12714e.m60284b(iArr, String.valueOf(i));
            b.mo33599k(Integer.valueOf(e));
            b.mo33598j(Integer.valueOf(iArr2.length));
            return b;
        }
        throw C9914f.m50845a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
        r7 = p368u9.C12720i.m60323d(r7);
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static p368u9.C12713d m60335k(p248h9.C10476b r7, int r8, int r9, boolean r10, int r11, int r12, int r13, int r14) {
        /*
            int r11 = m60327c(r7, r8, r9, r10, r11, r12)
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            int[] r7 = m60341q(r0, r1, r2, r3, r4, r5)
            r8 = 0
            if (r7 != 0) goto L_0x0012
            return r8
        L_0x0012:
            int r9 = p258i9.C10566a.m53113d(r7)
            if (r10 == 0) goto L_0x001b
            int r10 = r11 + r9
            goto L_0x0039
        L_0x001b:
            r10 = 0
        L_0x001c:
            int r12 = r7.length
            int r12 = r12 / 2
            if (r10 >= r12) goto L_0x0034
            r12 = r7[r10]
            int r0 = r7.length
            int r0 = r0 + -1
            int r0 = r0 - r10
            r0 = r7[r0]
            r7[r10] = r0
            int r0 = r7.length
            int r0 = r0 + -1
            int r0 = r0 - r10
            r7[r0] = r12
            int r10 = r10 + 1
            goto L_0x001c
        L_0x0034:
            int r10 = r11 - r9
            r6 = r11
            r11 = r10
            r10 = r6
        L_0x0039:
            boolean r9 = m60328d(r9, r13, r14)
            if (r9 != 0) goto L_0x0040
            return r8
        L_0x0040:
            int r7 = p368u9.C12720i.m60323d(r7)
            int r9 = p358t9.C12553a.m59748a(r7)
            r12 = -1
            if (r9 != r12) goto L_0x004c
            return r8
        L_0x004c:
            u9.d r8 = new u9.d
            int r7 = m60338n(r7)
            r8.<init>(r11, r10, r7, r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p368u9.C12721j.m60335k(h9.b, int, int, boolean, int, int, int, int):u9.d");
    }

    /* renamed from: l */
    private static C12710a m60336l(C12719h hVar, C12719h hVar2) {
        C12710a i;
        C12710a i2;
        if (hVar == null || (i = hVar.mo37624i()) == null) {
            if (hVar2 == null) {
                return null;
            }
            return hVar2.mo37624i();
        } else if (hVar2 == null || (i2 = hVar2.mo37624i()) == null || i.mo37580a() == i2.mo37580a() || i.mo37581b() == i2.mo37581b() || i.mo37582c() == i2.mo37582c()) {
            return i;
        } else {
            return null;
        }
    }

    /* renamed from: m */
    private static int[] m60337m(int i) {
        int[] iArr = new int[8];
        int i2 = 0;
        int i3 = 7;
        while (true) {
            int i4 = i & 1;
            if (i4 != i2) {
                i3--;
                if (i3 < 0) {
                    return iArr;
                }
                i2 = i4;
            }
            iArr[i3] = iArr[i3] + 1;
            i >>= 1;
        }
    }

    /* renamed from: n */
    private static int m60338n(int i) {
        return m60339o(m60337m(i));
    }

    /* renamed from: o */
    private static int m60339o(int[] iArr) {
        return ((((iArr[0] - iArr[2]) + iArr[4]) - iArr[6]) + 9) % 9;
    }

    /* renamed from: p */
    private static int m60340p(int[] iArr) {
        int i = -1;
        for (int max : iArr) {
            i = Math.max(i, max);
        }
        return i;
    }

    /* renamed from: q */
    private static int[] m60341q(C10476b bVar, int i, int i2, boolean z, int i3, int i4) {
        int[] iArr = new int[8];
        int i5 = z ? 1 : -1;
        int i6 = 0;
        boolean z2 = z;
        while (true) {
            if (!z) {
                if (i3 < i) {
                    break;
                }
            } else if (i3 >= i2) {
                break;
            }
            if (i6 >= 8) {
                break;
            } else if (bVar.mo33570d(i3, i4) == z2) {
                iArr[i6] = iArr[i6] + 1;
                i3 += i5;
            } else {
                i6++;
                z2 = !z2;
            }
        }
        if (i6 != 8) {
            if (z) {
                i = i2;
            }
            if (!(i3 == i && i6 == 7)) {
                return null;
            }
        }
        return iArr;
    }

    /* renamed from: r */
    private static int m60342r(int i) {
        return 2 << i;
    }

    /* renamed from: s */
    private static C12719h m60343s(C10476b bVar, C12712c cVar, C9924p pVar, boolean z, int i, int i2) {
        int i3;
        boolean z2 = z;
        C12719h hVar = new C12719h(cVar, z2);
        int i4 = 0;
        while (i4 < 2) {
            int i5 = i4 == 0 ? 1 : -1;
            int c = (int) pVar.mo32480c();
            int d = (int) pVar.mo32481d();
            while (d <= cVar.mo37591f() && d >= cVar.mo37593h()) {
                C12713d k = m60335k(bVar, 0, bVar.mo33578j(), z, c, d, i, i2);
                if (k != null) {
                    hVar.mo37621f(d, k);
                    if (z2) {
                        i3 = k.mo37599d();
                    } else {
                        i3 = k.mo37597b();
                    }
                    c = i3;
                }
                d += i5;
            }
            i4++;
        }
        return hVar;
    }

    /* renamed from: t */
    private static int m60344t(C12717f fVar, int i, int i2, boolean z) {
        int i3 = z ? 1 : -1;
        C12713d dVar = null;
        int i4 = i - i3;
        if (m60345u(fVar, i4)) {
            dVar = fVar.mo37611n(i4).mo37617b(i2);
        }
        if (dVar != null) {
            return z ? dVar.mo37597b() : dVar.mo37599d();
        }
        C12713d c = fVar.mo37611n(i).mo37618c(i2);
        if (c != null) {
            return z ? c.mo37599d() : c.mo37597b();
        }
        if (m60345u(fVar, i4)) {
            c = fVar.mo37611n(i4).mo37618c(i2);
        }
        if (c != null) {
            return z ? c.mo37597b() : c.mo37599d();
        }
        int i5 = 0;
        while (true) {
            i -= i3;
            if (m60345u(fVar, i)) {
                for (C12713d dVar2 : fVar.mo37611n(i).mo37619d()) {
                    if (dVar2 != null) {
                        return (z ? dVar2.mo37597b() : dVar2.mo37599d()) + (i3 * i5 * (dVar2.mo37597b() - dVar2.mo37599d()));
                    }
                }
                i5++;
            } else {
                C12712c m = fVar.mo37610m();
                return z ? m.mo37592g() : m.mo37590e();
            }
        }
    }

    /* renamed from: u */
    private static boolean m60345u(C12717f fVar, int i) {
        return i >= 0 && i <= fVar.mo37607j() + 1;
    }

    /* renamed from: v */
    private static C12717f m60346v(C12719h hVar, C12719h hVar2) throws C9918j {
        C12710a l;
        if ((hVar == null && hVar2 == null) || (l = m60336l(hVar, hVar2)) == null) {
            return null;
        }
        return new C12717f(l, C12712c.m60263l(m60325a(hVar), m60325a(hVar2)));
    }

    /* renamed from: w */
    private static void m60347w(int[] iArr, int i) throws C9914f {
        if (iArr.length >= 4) {
            int i2 = iArr[0];
            if (i2 > iArr.length) {
                throw C9914f.m50845a();
            } else if (i2 != 0) {
            } else {
                if (i < iArr.length) {
                    iArr[0] = iArr.length - i;
                    return;
                }
                throw C9914f.m50845a();
            }
        } else {
            throw C9914f.m50845a();
        }
    }
}
