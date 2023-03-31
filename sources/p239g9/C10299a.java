package p239g9;

import p212d9.C9918j;
import p212d9.C9924p;
import p221e9.C10021a;
import p248h9.C10476b;
import p248h9.C10483i;
import p258i9.C10566a;
import p258i9.C10567b;
import p268j9.C11501a;
import p268j9.C11503c;
import p268j9.C11504d;

/* renamed from: g9.a */
/* compiled from: Detector */
public final class C10299a {

    /* renamed from: g */
    private static final int[] f40892g = {3808, 476, 2107, 1799};

    /* renamed from: a */
    private final C10476b f40893a;

    /* renamed from: b */
    private boolean f40894b;

    /* renamed from: c */
    private int f40895c;

    /* renamed from: d */
    private int f40896d;

    /* renamed from: e */
    private int f40897e;

    /* renamed from: f */
    private int f40898f;

    /* renamed from: g9.a$a */
    /* compiled from: Detector */
    static final class C10300a {

        /* renamed from: a */
        private final int f40899a;

        /* renamed from: b */
        private final int f40900b;

        C10300a(int i, int i2) {
            this.f40899a = i;
            this.f40900b = i2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo33096a() {
            return this.f40899a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo33097b() {
            return this.f40900b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C9924p mo33098c() {
            return new C9924p((float) mo33096a(), (float) mo33097b());
        }

        public String toString() {
            return "<" + this.f40899a + ' ' + this.f40900b + '>';
        }
    }

    public C10299a(C10476b bVar) {
        this.f40893a = bVar;
    }

    /* renamed from: b */
    private static float m52082b(C9924p pVar, C9924p pVar2) {
        return C10566a.m53110a(pVar.mo32480c(), pVar.mo32481d(), pVar2.mo32480c(), pVar2.mo32481d());
    }

    /* renamed from: c */
    private static float m52083c(C10300a aVar, C10300a aVar2) {
        return C10566a.m53111b(aVar.mo33096a(), aVar.mo33097b(), aVar2.mo33096a(), aVar2.mo33097b());
    }

    /* renamed from: d */
    private static C9924p[] m52084d(C9924p[] pVarArr, float f, float f2) {
        float f3 = f2 / (f * 2.0f);
        float c = pVarArr[0].mo32480c() - pVarArr[2].mo32480c();
        float d = pVarArr[0].mo32481d() - pVarArr[2].mo32481d();
        float c2 = (pVarArr[0].mo32480c() + pVarArr[2].mo32480c()) / 2.0f;
        float d2 = (pVarArr[0].mo32481d() + pVarArr[2].mo32481d()) / 2.0f;
        float f4 = c * f3;
        float f5 = d * f3;
        C9924p pVar = new C9924p(c2 + f4, d2 + f5);
        C9924p pVar2 = new C9924p(c2 - f4, d2 - f5);
        float c3 = pVarArr[1].mo32480c() - pVarArr[3].mo32480c();
        float d3 = pVarArr[1].mo32481d() - pVarArr[3].mo32481d();
        float c4 = (pVarArr[1].mo32480c() + pVarArr[3].mo32480c()) / 2.0f;
        float d4 = (pVarArr[1].mo32481d() + pVarArr[3].mo32481d()) / 2.0f;
        float f6 = c3 * f3;
        float f7 = f3 * d3;
        return new C9924p[]{pVar, new C9924p(c4 + f6, d4 + f7), pVar2, new C9924p(c4 - f6, d4 - f7)};
    }

    /* renamed from: e */
    private void m52085e(C9924p[] pVarArr) throws C9918j {
        long j;
        long j2;
        if (!m52095o(pVarArr[0]) || !m52095o(pVarArr[1]) || !m52095o(pVarArr[2]) || !m52095o(pVarArr[3])) {
            throw C9918j.m50862a();
        }
        int i = this.f40897e * 2;
        int[] iArr = {m52098r(pVarArr[0], pVarArr[1], i), m52098r(pVarArr[1], pVarArr[2], i), m52098r(pVarArr[2], pVarArr[3], i), m52098r(pVarArr[3], pVarArr[0], i)};
        this.f40898f = m52093m(iArr, i);
        long j3 = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = iArr[(this.f40898f + i2) % 4];
            if (this.f40894b) {
                j2 = j3 << 7;
                j = (long) ((i3 >> 1) & 127);
            } else {
                j2 = j3 << 10;
                j = (long) (((i3 >> 2) & 992) + ((i3 >> 1) & 31));
            }
            j3 = j2 + j;
        }
        int h = m52088h(j3, this.f40894b);
        if (this.f40894b) {
            this.f40895c = (h >> 6) + 1;
            this.f40896d = (h & 63) + 1;
            return;
        }
        this.f40895c = (h >> 11) + 1;
        this.f40896d = (h & 2047) + 1;
    }

    /* renamed from: f */
    private C9924p[] m52086f(C10300a aVar) throws C9918j {
        this.f40897e = 1;
        C10300a aVar2 = aVar;
        C10300a aVar3 = aVar2;
        C10300a aVar4 = aVar3;
        C10300a aVar5 = aVar4;
        boolean z = true;
        while (this.f40897e < 9) {
            C10300a j = m52090j(aVar2, z, 1, -1);
            C10300a j2 = m52090j(aVar3, z, 1, 1);
            C10300a j3 = m52090j(aVar4, z, -1, 1);
            C10300a j4 = m52090j(aVar5, z, -1, -1);
            if (this.f40897e > 2) {
                double c = (double) ((m52083c(j4, j) * ((float) this.f40897e)) / (m52083c(aVar5, aVar2) * ((float) (this.f40897e + 2))));
                if (c < 0.75d || c > 1.25d || !m52096p(j, j2, j3, j4)) {
                    break;
                }
            }
            z = !z;
            this.f40897e++;
            aVar5 = j4;
            aVar2 = j;
            aVar3 = j2;
            aVar4 = j3;
        }
        int i = this.f40897e;
        if (i == 5 || i == 7) {
            this.f40894b = i == 5;
            C9924p[] pVarArr = {new C9924p(((float) aVar2.mo33096a()) + 0.5f, ((float) aVar2.mo33097b()) - 0.5f), new C9924p(((float) aVar3.mo33096a()) + 0.5f, ((float) aVar3.mo33097b()) + 0.5f), new C9924p(((float) aVar4.mo33096a()) - 0.5f, ((float) aVar4.mo33097b()) + 0.5f), new C9924p(((float) aVar5.mo33096a()) - 0.5f, ((float) aVar5.mo33097b()) - 0.5f)};
            int i2 = this.f40897e;
            return m52084d(pVarArr, (float) ((i2 * 2) - 3), (float) (i2 * 2));
        }
        throw C9918j.m50862a();
    }

    /* renamed from: g */
    private int m52087g(C10300a aVar, C10300a aVar2) {
        float c = m52083c(aVar, aVar2);
        float a = ((float) (aVar2.mo33096a() - aVar.mo33096a())) / c;
        float b = ((float) (aVar2.mo33097b() - aVar.mo33097b())) / c;
        float a2 = (float) aVar.mo33096a();
        float b2 = (float) aVar.mo33097b();
        boolean d = this.f40893a.mo33570d(aVar.mo33096a(), aVar.mo33097b());
        int ceil = (int) Math.ceil((double) c);
        boolean z = false;
        int i = 0;
        for (int i2 = 0; i2 < ceil; i2++) {
            a2 += a;
            b2 += b;
            if (this.f40893a.mo33570d(C10566a.m53112c(a2), C10566a.m53112c(b2)) != d) {
                i++;
            }
        }
        float f = ((float) i) / c;
        if (f > 0.1f && f < 0.9f) {
            return 0;
        }
        if (f <= 0.1f) {
            z = true;
        }
        return z == d ? 1 : -1;
    }

    /* renamed from: h */
    private static int m52088h(long j, boolean z) throws C9918j {
        int i;
        int i2;
        if (z) {
            i = 7;
            i2 = 2;
        } else {
            i = 10;
            i2 = 4;
        }
        int i3 = i - i2;
        int[] iArr = new int[i];
        for (int i4 = i - 1; i4 >= 0; i4--) {
            iArr[i4] = ((int) j) & 15;
            j >>= 4;
        }
        try {
            new C11503c(C11501a.f43916k).mo35512a(iArr, i3);
            int i5 = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                i5 = (i5 << 4) + iArr[i6];
            }
            return i5;
        } catch (C11504d unused) {
            throw C9918j.m50862a();
        }
    }

    /* renamed from: i */
    private int m52089i() {
        if (this.f40894b) {
            return (this.f40895c * 4) + 11;
        }
        int i = this.f40895c;
        if (i <= 4) {
            return (i * 4) + 15;
        }
        return (i * 4) + ((((i - 4) / 8) + 1) * 2) + 15;
    }

    /* renamed from: j */
    private C10300a m52090j(C10300a aVar, boolean z, int i, int i2) {
        int a = aVar.mo33096a() + i;
        int b = aVar.mo33097b();
        while (true) {
            b += i2;
            if (!m52094n(a, b) || this.f40893a.mo33570d(a, b) != z) {
                int i3 = a - i;
                int i4 = b - i2;
            } else {
                a += i;
            }
        }
        int i32 = a - i;
        int i42 = b - i2;
        while (m52094n(i32, i42) && this.f40893a.mo33570d(i32, i42) == z) {
            i32 += i;
        }
        int i5 = i32 - i;
        while (m52094n(i5, i42) && this.f40893a.mo33570d(i5, i42) == z) {
            i42 += i2;
        }
        return new C10300a(i5, i42 - i2);
    }

    /* renamed from: k */
    private C10300a m52091k() {
        C9924p pVar;
        C9924p pVar2;
        C9924p pVar3;
        C9924p pVar4;
        C9924p pVar5;
        C9924p pVar6;
        C9924p pVar7;
        C9924p pVar8;
        try {
            C9924p[] c = new C10567b(this.f40893a).mo33765c();
            pVar3 = c[0];
            pVar2 = c[1];
            pVar = c[2];
            pVar4 = c[3];
        } catch (C9918j unused) {
            int j = this.f40893a.mo33578j() / 2;
            int g = this.f40893a.mo33574g() / 2;
            int i = j + 7;
            int i2 = g - 7;
            C9924p c2 = m52090j(new C10300a(i, i2), false, 1, -1).mo33098c();
            int i3 = g + 7;
            C9924p c3 = m52090j(new C10300a(i, i3), false, 1, 1).mo33098c();
            int i4 = j - 7;
            C9924p c4 = m52090j(new C10300a(i4, i3), false, -1, 1).mo33098c();
            pVar4 = m52090j(new C10300a(i4, i2), false, -1, -1).mo33098c();
            C9924p pVar9 = c3;
            pVar = c4;
            pVar3 = c2;
            pVar2 = pVar9;
        }
        int c5 = C10566a.m53112c((((pVar3.mo32480c() + pVar4.mo32480c()) + pVar2.mo32480c()) + pVar.mo32480c()) / 4.0f);
        int c6 = C10566a.m53112c((((pVar3.mo32481d() + pVar4.mo32481d()) + pVar2.mo32481d()) + pVar.mo32481d()) / 4.0f);
        try {
            C9924p[] c7 = new C10567b(this.f40893a, 15, c5, c6).mo33765c();
            pVar6 = c7[0];
            pVar5 = c7[1];
            pVar7 = c7[2];
            pVar8 = c7[3];
        } catch (C9918j unused2) {
            int i5 = c5 + 7;
            int i6 = c6 - 7;
            pVar6 = m52090j(new C10300a(i5, i6), false, 1, -1).mo33098c();
            int i7 = c6 + 7;
            pVar5 = m52090j(new C10300a(i5, i7), false, 1, 1).mo33098c();
            int i8 = c5 - 7;
            pVar7 = m52090j(new C10300a(i8, i7), false, -1, 1).mo33098c();
            pVar8 = m52090j(new C10300a(i8, i6), false, -1, -1).mo33098c();
        }
        return new C10300a(C10566a.m53112c((((pVar6.mo32480c() + pVar8.mo32480c()) + pVar5.mo32480c()) + pVar7.mo32480c()) / 4.0f), C10566a.m53112c((((pVar6.mo32481d() + pVar8.mo32481d()) + pVar5.mo32481d()) + pVar7.mo32481d()) / 4.0f));
    }

    /* renamed from: l */
    private C9924p[] m52092l(C9924p[] pVarArr) {
        return m52084d(pVarArr, (float) (this.f40897e * 2), (float) m52089i());
    }

    /* renamed from: m */
    private static int m52093m(int[] iArr, int i) throws C9918j {
        int i2 = 0;
        for (int i3 : iArr) {
            i2 = (i2 << 3) + ((i3 >> (i - 2)) << 1) + (i3 & 1);
        }
        int i4 = ((i2 & 1) << 11) + (i2 >> 1);
        for (int i5 = 0; i5 < 4; i5++) {
            if (Integer.bitCount(f40892g[i5] ^ i4) <= 2) {
                return i5;
            }
        }
        throw C9918j.m50862a();
    }

    /* renamed from: n */
    private boolean m52094n(int i, int i2) {
        return i >= 0 && i < this.f40893a.mo33578j() && i2 > 0 && i2 < this.f40893a.mo33574g();
    }

    /* renamed from: o */
    private boolean m52095o(C9924p pVar) {
        return m52094n(C10566a.m53112c(pVar.mo32480c()), C10566a.m53112c(pVar.mo32481d()));
    }

    /* renamed from: p */
    private boolean m52096p(C10300a aVar, C10300a aVar2, C10300a aVar3, C10300a aVar4) {
        C10300a aVar5 = new C10300a(aVar.mo33096a() - 3, aVar.mo33097b() + 3);
        C10300a aVar6 = new C10300a(aVar2.mo33096a() - 3, aVar2.mo33097b() - 3);
        C10300a aVar7 = new C10300a(aVar3.mo33096a() + 3, aVar3.mo33097b() - 3);
        C10300a aVar8 = new C10300a(aVar4.mo33096a() + 3, aVar4.mo33097b() + 3);
        int g = m52087g(aVar8, aVar5);
        if (g != 0 && m52087g(aVar5, aVar6) == g && m52087g(aVar6, aVar7) == g && m52087g(aVar7, aVar8) == g) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    private C10476b m52097q(C10476b bVar, C9924p pVar, C9924p pVar2, C9924p pVar3, C9924p pVar4) throws C9918j {
        C10483i b = C10483i.m52843b();
        int i = m52089i();
        int i2 = i;
        int i3 = i;
        float f = ((float) i) / 2.0f;
        int i4 = this.f40897e;
        float f2 = f - ((float) i4);
        float f3 = f + ((float) i4);
        return b.mo33602c(bVar, i3, i2, f2, f2, f3, f2, f3, f3, f2, f3, pVar.mo32480c(), pVar.mo32481d(), pVar2.mo32480c(), pVar2.mo32481d(), pVar3.mo32480c(), pVar3.mo32481d(), pVar4.mo32480c(), pVar4.mo32481d());
    }

    /* renamed from: r */
    private int m52098r(C9924p pVar, C9924p pVar2, int i) {
        float b = m52082b(pVar, pVar2);
        float f = b / ((float) i);
        float c = pVar.mo32480c();
        float d = pVar.mo32481d();
        float c2 = ((pVar2.mo32480c() - pVar.mo32480c()) * f) / b;
        float d2 = (f * (pVar2.mo32481d() - pVar.mo32481d())) / b;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            float f2 = (float) i3;
            if (this.f40893a.mo33570d(C10566a.m53112c((f2 * c2) + c), C10566a.m53112c((f2 * d2) + d))) {
                i2 |= 1 << ((i - i3) - 1);
            }
        }
        return i2;
    }

    /* renamed from: a */
    public C10021a mo33095a(boolean z) throws C9918j {
        C9924p[] f = m52086f(m52091k());
        if (z) {
            C9924p pVar = f[0];
            f[0] = f[2];
            f[2] = pVar;
        }
        m52085e(f);
        C10476b bVar = this.f40893a;
        int i = this.f40898f;
        return new C10021a(m52097q(bVar, f[i % 4], f[(i + 1) % 4], f[(i + 2) % 4], f[(i + 3) % 4]), m52092l(f), this.f40894b, this.f40896d, this.f40895c);
    }
}
