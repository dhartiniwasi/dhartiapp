package p258i9;

import p212d9.C9918j;
import p212d9.C9924p;
import p248h9.C10476b;

/* renamed from: i9.b */
/* compiled from: WhiteRectangleDetector */
public final class C10567b {

    /* renamed from: a */
    private final C10476b f41602a;

    /* renamed from: b */
    private final int f41603b;

    /* renamed from: c */
    private final int f41604c;

    /* renamed from: d */
    private final int f41605d;

    /* renamed from: e */
    private final int f41606e;

    /* renamed from: f */
    private final int f41607f;

    /* renamed from: g */
    private final int f41608g;

    public C10567b(C10476b bVar) throws C9918j {
        this(bVar, 10, bVar.mo33578j() / 2, bVar.mo33574g() / 2);
    }

    /* renamed from: a */
    private C9924p[] m53114a(C9924p pVar, C9924p pVar2, C9924p pVar3, C9924p pVar4) {
        float c = pVar.mo32480c();
        float d = pVar.mo32481d();
        float c2 = pVar2.mo32480c();
        float d2 = pVar2.mo32481d();
        float c3 = pVar3.mo32480c();
        float d3 = pVar3.mo32481d();
        float c4 = pVar4.mo32480c();
        float d4 = pVar4.mo32481d();
        if (c < ((float) this.f41604c) / 2.0f) {
            return new C9924p[]{new C9924p(c4 - 1.0f, d4 + 1.0f), new C9924p(c2 + 1.0f, d2 + 1.0f), new C9924p(c3 - 1.0f, d3 - 1.0f), new C9924p(c + 1.0f, d - 1.0f)};
        }
        return new C9924p[]{new C9924p(c4 + 1.0f, d4 + 1.0f), new C9924p(c2 + 1.0f, d2 - 1.0f), new C9924p(c3 - 1.0f, d3 + 1.0f), new C9924p(c - 1.0f, d - 1.0f)};
    }

    /* renamed from: b */
    private boolean m53115b(int i, int i2, int i3, boolean z) {
        if (z) {
            while (i <= i2) {
                if (this.f41602a.mo33570d(i, i3)) {
                    return true;
                }
                i++;
            }
            return false;
        }
        while (i <= i2) {
            if (this.f41602a.mo33570d(i3, i)) {
                return true;
            }
            i++;
        }
        return false;
    }

    /* renamed from: d */
    private C9924p m53116d(float f, float f2, float f3, float f4) {
        int c = C10566a.m53112c(C10566a.m53110a(f, f2, f3, f4));
        float f5 = (float) c;
        float f6 = (f3 - f) / f5;
        float f7 = (f4 - f2) / f5;
        for (int i = 0; i < c; i++) {
            float f8 = (float) i;
            int c2 = C10566a.m53112c((f8 * f6) + f);
            int c3 = C10566a.m53112c((f8 * f7) + f2);
            if (this.f41602a.mo33570d(c2, c3)) {
                return new C9924p((float) c2, (float) c3);
            }
        }
        return null;
    }

    /* renamed from: c */
    public C9924p[] mo33765c() throws C9918j {
        int i = this.f41605d;
        int i2 = this.f41606e;
        int i3 = this.f41608g;
        int i4 = this.f41607f;
        boolean z = false;
        int i5 = 1;
        boolean z2 = true;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        while (true) {
            if (!z2) {
                break;
            }
            boolean z8 = true;
            boolean z9 = false;
            while (true) {
                if ((z8 || !z3) && i2 < this.f41604c) {
                    z8 = m53115b(i3, i4, i2, false);
                    if (z8) {
                        i2++;
                        z3 = true;
                        z9 = true;
                    } else if (!z3) {
                        i2++;
                    }
                }
            }
            if (i2 >= this.f41604c) {
                break;
            }
            boolean z10 = true;
            while (true) {
                if ((z10 || !z4) && i4 < this.f41603b) {
                    z10 = m53115b(i, i2, i4, true);
                    if (z10) {
                        i4++;
                        z4 = true;
                        z9 = true;
                    } else if (!z4) {
                        i4++;
                    }
                }
            }
            if (i4 >= this.f41603b) {
                break;
            }
            boolean z11 = true;
            while (true) {
                if ((z11 || !z5) && i >= 0) {
                    z11 = m53115b(i3, i4, i, false);
                    if (z11) {
                        i--;
                        z5 = true;
                        z9 = true;
                    } else if (!z5) {
                        i--;
                    }
                }
            }
            if (i < 0) {
                break;
            }
            z2 = z9;
            boolean z12 = true;
            while (true) {
                if ((z12 || !z7) && i3 >= 0) {
                    z12 = m53115b(i, i2, i3, true);
                    if (z12) {
                        i3--;
                        z2 = true;
                        z7 = true;
                    } else if (!z7) {
                        i3--;
                    }
                }
            }
            if (i3 < 0) {
                break;
            } else if (z2) {
                z6 = true;
            }
        }
        z = true;
        if (z || !z6) {
            throw C9918j.m50862a();
        }
        int i6 = i2 - i;
        C9924p pVar = null;
        C9924p pVar2 = null;
        int i7 = 1;
        while (pVar2 == null && i7 < i6) {
            pVar2 = m53116d((float) i, (float) (i4 - i7), (float) (i + i7), (float) i4);
            i7++;
        }
        if (pVar2 != null) {
            C9924p pVar3 = null;
            int i8 = 1;
            while (pVar3 == null && i8 < i6) {
                pVar3 = m53116d((float) i, (float) (i3 + i8), (float) (i + i8), (float) i3);
                i8++;
            }
            if (pVar3 != null) {
                C9924p pVar4 = null;
                int i9 = 1;
                while (pVar4 == null && i9 < i6) {
                    pVar4 = m53116d((float) i2, (float) (i3 + i9), (float) (i2 - i9), (float) i3);
                    i9++;
                }
                if (pVar4 != null) {
                    while (pVar == null && i5 < i6) {
                        pVar = m53116d((float) i2, (float) (i4 - i5), (float) (i2 - i5), (float) i4);
                        i5++;
                    }
                    if (pVar != null) {
                        return m53114a(pVar, pVar2, pVar4, pVar3);
                    }
                    throw C9918j.m50862a();
                }
                throw C9918j.m50862a();
            }
            throw C9918j.m50862a();
        }
        throw C9918j.m50862a();
    }

    public C10567b(C10476b bVar, int i, int i2, int i3) throws C9918j {
        this.f41602a = bVar;
        int g = bVar.mo33574g();
        this.f41603b = g;
        int j = bVar.mo33578j();
        this.f41604c = j;
        int i4 = i / 2;
        int i5 = i2 - i4;
        this.f41605d = i5;
        int i6 = i2 + i4;
        this.f41606e = i6;
        int i7 = i3 - i4;
        this.f41608g = i7;
        int i8 = i3 + i4;
        this.f41607f = i8;
        if (i7 < 0 || i5 < 0 || i8 >= g || i6 >= j) {
            throw C9918j.m50862a();
        }
    }
}
