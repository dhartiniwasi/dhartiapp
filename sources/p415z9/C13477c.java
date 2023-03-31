package p415z9;

import java.util.Map;
import p212d9.C9913e;
import p212d9.C9914f;
import p212d9.C9918j;
import p212d9.C9924p;
import p212d9.C9925q;
import p248h9.C10476b;
import p248h9.C10481g;
import p248h9.C10483i;
import p248h9.C10485k;
import p258i9.C10566a;
import p406y9.C13239j;

/* renamed from: z9.c */
/* compiled from: Detector */
public class C13477c {

    /* renamed from: a */
    private final C10476b f47852a;

    /* renamed from: b */
    private C9925q f47853b;

    public C13477c(C10476b bVar) {
        this.f47852a = bVar;
    }

    /* renamed from: b */
    private float m62567b(C9924p pVar, C9924p pVar2) {
        float j = m62572j((int) pVar.mo32480c(), (int) pVar.mo32481d(), (int) pVar2.mo32480c(), (int) pVar2.mo32481d());
        float j2 = m62572j((int) pVar2.mo32480c(), (int) pVar2.mo32481d(), (int) pVar.mo32480c(), (int) pVar.mo32481d());
        if (Float.isNaN(j)) {
            return j2 / 7.0f;
        }
        return Float.isNaN(j2) ? j / 7.0f : (j + j2) / 14.0f;
    }

    /* renamed from: c */
    private static int m62568c(C9924p pVar, C9924p pVar2, C9924p pVar3, float f) throws C9918j {
        int c = ((C10566a.m53112c(C9924p.m50876b(pVar, pVar2) / f) + C10566a.m53112c(C9924p.m50876b(pVar, pVar3) / f)) / 2) + 7;
        int i = c & 3;
        if (i == 0) {
            return c + 1;
        }
        if (i == 2) {
            return c - 1;
        }
        if (i != 3) {
            return c;
        }
        throw C9918j.m50862a();
    }

    /* renamed from: d */
    private static C10485k m62569d(C9924p pVar, C9924p pVar2, C9924p pVar3, C9924p pVar4, int i) {
        float f;
        float f2;
        float f3;
        float f4 = ((float) i) - 3.5f;
        if (pVar4 != null) {
            f2 = pVar4.mo32480c();
            f = pVar4.mo32481d();
            f3 = f4 - 3.0f;
        } else {
            f2 = (pVar2.mo32480c() - pVar.mo32480c()) + pVar3.mo32480c();
            f = (pVar2.mo32481d() - pVar.mo32481d()) + pVar3.mo32481d();
            f3 = f4;
        }
        return C10485k.m52852b(3.5f, 3.5f, f4, 3.5f, f3, f3, 3.5f, f4, pVar.mo32480c(), pVar.mo32481d(), pVar2.mo32480c(), pVar2.mo32481d(), f2, f, pVar3.mo32480c(), pVar3.mo32481d());
    }

    /* renamed from: h */
    private static C10476b m62570h(C10476b bVar, C10485k kVar, int i) throws C9918j {
        return C10483i.m52843b().mo33603d(bVar, i, i, kVar);
    }

    /* renamed from: i */
    private float m62571i(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z;
        C13477c cVar;
        boolean z2;
        int i10 = 1;
        boolean z3 = Math.abs(i4 - i2) > Math.abs(i3 - i);
        if (z3) {
            i7 = i;
            i8 = i2;
            i5 = i3;
            i6 = i4;
        } else {
            i8 = i;
            i7 = i2;
            i6 = i3;
            i5 = i4;
        }
        int abs = Math.abs(i6 - i8);
        int abs2 = Math.abs(i5 - i7);
        int i11 = (-abs) / 2;
        int i12 = -1;
        int i13 = i8 < i6 ? 1 : -1;
        if (i7 < i5) {
            i12 = 1;
        }
        int i14 = i6 + i13;
        int i15 = i8;
        int i16 = i7;
        int i17 = 0;
        while (true) {
            if (i15 == i14) {
                i9 = i14;
                break;
            }
            int i18 = z3 ? i16 : i15;
            int i19 = z3 ? i15 : i16;
            if (i17 == i10) {
                cVar = this;
                z = z3;
                i9 = i14;
                z2 = true;
            } else {
                cVar = this;
                z = z3;
                i9 = i14;
                z2 = false;
            }
            if (z2 == cVar.f47852a.mo33570d(i18, i19)) {
                if (i17 == 2) {
                    return C10566a.m53111b(i15, i16, i8, i7);
                }
                i17++;
            }
            i11 += abs2;
            if (i11 > 0) {
                if (i16 == i5) {
                    break;
                }
                i16 += i12;
                i11 -= abs;
            }
            i15 += i13;
            i14 = i9;
            z3 = z;
            i10 = 1;
        }
        if (i17 == 2) {
            return C10566a.m53111b(i9, i5, i8, i7);
        }
        return Float.NaN;
    }

    /* renamed from: j */
    private float m62572j(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float i5 = m62571i(i, i2, i3, i4);
        int i6 = i - (i3 - i);
        int i7 = 0;
        if (i6 < 0) {
            f = ((float) i) / ((float) (i - i6));
            i6 = 0;
        } else if (i6 >= this.f47852a.mo33578j()) {
            f = ((float) ((this.f47852a.mo33578j() - 1) - i)) / ((float) (i6 - i));
            i6 = this.f47852a.mo33578j() - 1;
        } else {
            f = 1.0f;
        }
        float f3 = (float) i2;
        int i8 = (int) (f3 - (((float) (i4 - i2)) * f));
        if (i8 < 0) {
            f2 = f3 / ((float) (i2 - i8));
        } else if (i8 >= this.f47852a.mo33574g()) {
            f2 = ((float) ((this.f47852a.mo33574g() - 1) - i2)) / ((float) (i8 - i2));
            i7 = this.f47852a.mo33574g() - 1;
        } else {
            i7 = i8;
            f2 = 1.0f;
        }
        return (i5 + m62571i(i, i2, (int) (((float) i) + (((float) (i6 - i)) * f2)), i7)) - 1.0f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final float mo38597a(C9924p pVar, C9924p pVar2, C9924p pVar3) {
        return (m62567b(pVar, pVar2) + m62567b(pVar, pVar3)) / 2.0f;
    }

    /* renamed from: e */
    public final C10481g mo38598e(Map<C9913e, ?> map) throws C9918j, C9914f {
        C9925q qVar;
        if (map == null) {
            qVar = null;
        } else {
            qVar = (C9925q) map.get(C9913e.NEED_RESULT_POINT_CALLBACK);
        }
        this.f47853b = qVar;
        return mo38600g(new C13479e(this.f47852a, qVar).mo38605e(map));
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final C13475a mo38599f(float f, int i, int i2, float f2) throws C9918j {
        int i3 = (int) (f2 * f);
        int max = Math.max(0, i - i3);
        int min = Math.min(this.f47852a.mo33578j() - 1, i + i3) - max;
        float f3 = 3.0f * f;
        if (((float) min) >= f3) {
            int max2 = Math.max(0, i2 - i3);
            int min2 = Math.min(this.f47852a.mo33574g() - 1, i2 + i3) - max2;
            if (((float) min2) >= f3) {
                return new C13476b(this.f47852a, max, max2, min, min2, f, this.f47853b).mo38596c();
            }
            throw C9918j.m50862a();
        }
        throw C9918j.m50862a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final C10481g mo38600g(C13483f fVar) throws C9918j, C9914f {
        C9924p[] pVarArr;
        C13478d b = fVar.mo38612b();
        C13478d c = fVar.mo38613c();
        C13478d a = fVar.mo38611a();
        float a2 = mo38597a(b, c, a);
        if (a2 >= 1.0f) {
            int c2 = m62568c(b, c, a, a2);
            C13239j g = C13239j.m62056g(c2);
            int e = g.mo38337e() - 7;
            C13475a aVar = null;
            if (g.mo38336d().length > 0) {
                float c3 = (c.mo32480c() - b.mo32480c()) + a.mo32480c();
                float d = (c.mo32481d() - b.mo32481d()) + a.mo32481d();
                float f = 1.0f - (3.0f / ((float) e));
                int c4 = (int) (b.mo32480c() + ((c3 - b.mo32480c()) * f));
                int d2 = (int) (b.mo32481d() + (f * (d - b.mo32481d())));
                int i = 4;
                while (true) {
                    if (i > 16) {
                        break;
                    }
                    try {
                        aVar = mo38599f(a2, c4, d2, (float) i);
                        break;
                    } catch (C9918j unused) {
                        i <<= 1;
                    }
                }
            }
            C10476b h = m62570h(this.f47852a, m62569d(b, c, a, aVar, c2), c2);
            if (aVar == null) {
                pVarArr = new C9924p[]{a, b, c};
            } else {
                pVarArr = new C9924p[]{a, b, c, aVar};
            }
            return new C10481g(h, pVarArr);
        }
        throw C9918j.m50862a();
    }
}
