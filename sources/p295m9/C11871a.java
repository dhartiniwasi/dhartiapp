package p295m9;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import p212d9.C9918j;
import p212d9.C9924p;
import p248h9.C10476b;
import p248h9.C10481g;
import p248h9.C10483i;
import p258i9.C10566a;
import p258i9.C10567b;

/* renamed from: m9.a */
/* compiled from: Detector */
public final class C11871a {

    /* renamed from: a */
    private final C10476b f44604a;

    /* renamed from: b */
    private final C10567b f44605b;

    /* renamed from: m9.a$b */
    /* compiled from: Detector */
    private static final class C11873b {

        /* renamed from: a */
        private final C9924p f44606a;

        /* renamed from: b */
        private final C9924p f44607b;

        /* renamed from: c */
        private final int f44608c;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C9924p mo36126a() {
            return this.f44606a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C9924p mo36127b() {
            return this.f44607b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public int mo36128c() {
            return this.f44608c;
        }

        public String toString() {
            return this.f44606a + "/" + this.f44607b + '/' + this.f44608c;
        }

        private C11873b(C9924p pVar, C9924p pVar2, int i) {
            this.f44606a = pVar;
            this.f44607b = pVar2;
            this.f44608c = i;
        }
    }

    /* renamed from: m9.a$c */
    /* compiled from: Detector */
    private static final class C11874c implements Serializable, Comparator<C11873b> {
        private C11874c() {
        }

        /* renamed from: a */
        public int compare(C11873b bVar, C11873b bVar2) {
            return bVar.mo36128c() - bVar2.mo36128c();
        }
    }

    public C11871a(C10476b bVar) throws C9918j {
        this.f44604a = bVar;
        this.f44605b = new C10567b(bVar);
    }

    /* renamed from: a */
    private C9924p m57360a(C9924p pVar, C9924p pVar2, C9924p pVar3, C9924p pVar4, int i) {
        float f = (float) i;
        float d = ((float) m57362d(pVar, pVar2)) / f;
        float d2 = (float) m57362d(pVar3, pVar4);
        C9924p pVar5 = new C9924p(pVar4.mo32480c() + (((pVar4.mo32480c() - pVar3.mo32480c()) / d2) * d), pVar4.mo32481d() + (d * ((pVar4.mo32481d() - pVar3.mo32481d()) / d2)));
        float d3 = ((float) m57362d(pVar, pVar3)) / f;
        float d4 = (float) m57362d(pVar2, pVar4);
        C9924p pVar6 = new C9924p(pVar4.mo32480c() + (((pVar4.mo32480c() - pVar2.mo32480c()) / d4) * d3), pVar4.mo32481d() + (d3 * ((pVar4.mo32481d() - pVar2.mo32481d()) / d4)));
        if (m57364f(pVar5)) {
            return (m57364f(pVar6) && Math.abs(m57366h(pVar3, pVar5).mo36128c() - m57366h(pVar2, pVar5).mo36128c()) > Math.abs(m57366h(pVar3, pVar6).mo36128c() - m57366h(pVar2, pVar6).mo36128c())) ? pVar6 : pVar5;
        }
        if (m57364f(pVar6)) {
            return pVar6;
        }
        return null;
    }

    /* renamed from: b */
    private C9924p m57361b(C9924p pVar, C9924p pVar2, C9924p pVar3, C9924p pVar4, int i, int i2) {
        float d = ((float) m57362d(pVar, pVar2)) / ((float) i);
        float d2 = (float) m57362d(pVar3, pVar4);
        C9924p pVar5 = new C9924p(pVar4.mo32480c() + (((pVar4.mo32480c() - pVar3.mo32480c()) / d2) * d), pVar4.mo32481d() + (d * ((pVar4.mo32481d() - pVar3.mo32481d()) / d2)));
        float d3 = ((float) m57362d(pVar, pVar3)) / ((float) i2);
        float d4 = (float) m57362d(pVar2, pVar4);
        C9924p pVar6 = new C9924p(pVar4.mo32480c() + (((pVar4.mo32480c() - pVar2.mo32480c()) / d4) * d3), pVar4.mo32481d() + (d3 * ((pVar4.mo32481d() - pVar2.mo32481d()) / d4)));
        if (m57364f(pVar5)) {
            return (m57364f(pVar6) && Math.abs(i - m57366h(pVar3, pVar5).mo36128c()) + Math.abs(i2 - m57366h(pVar2, pVar5).mo36128c()) > Math.abs(i - m57366h(pVar3, pVar6).mo36128c()) + Math.abs(i2 - m57366h(pVar2, pVar6).mo36128c())) ? pVar6 : pVar5;
        }
        if (m57364f(pVar6)) {
            return pVar6;
        }
        return null;
    }

    /* renamed from: d */
    private static int m57362d(C9924p pVar, C9924p pVar2) {
        return C10566a.m53112c(C9924p.m50876b(pVar, pVar2));
    }

    /* renamed from: e */
    private static void m57363e(Map<C9924p, Integer> map, C9924p pVar) {
        Integer num = map.get(pVar);
        int i = 1;
        if (num != null) {
            i = 1 + num.intValue();
        }
        map.put(pVar, Integer.valueOf(i));
    }

    /* renamed from: f */
    private boolean m57364f(C9924p pVar) {
        return pVar.mo32480c() >= 0.0f && pVar.mo32480c() < ((float) this.f44604a.mo33578j()) && pVar.mo32481d() > 0.0f && pVar.mo32481d() < ((float) this.f44604a.mo33574g());
    }

    /* renamed from: g */
    private static C10476b m57365g(C10476b bVar, C9924p pVar, C9924p pVar2, C9924p pVar3, C9924p pVar4, int i, int i2) throws C9918j {
        float f = ((float) i) - 0.5f;
        float f2 = ((float) i2) - 0.5f;
        return C10483i.m52843b().mo33602c(bVar, i, i2, 0.5f, 0.5f, f, 0.5f, f, f2, 0.5f, f2, pVar.mo32480c(), pVar.mo32481d(), pVar4.mo32480c(), pVar4.mo32481d(), pVar3.mo32480c(), pVar3.mo32481d(), pVar2.mo32480c(), pVar2.mo32481d());
    }

    /* renamed from: h */
    private C11873b m57366h(C9924p pVar, C9924p pVar2) {
        int c = (int) pVar.mo32480c();
        int d = (int) pVar.mo32481d();
        int c2 = (int) pVar2.mo32480c();
        int d2 = (int) pVar2.mo32481d();
        int i = 0;
        int i2 = 1;
        boolean z = Math.abs(d2 - d) > Math.abs(c2 - c);
        if (z) {
            int i3 = d;
            d = c;
            c = i3;
            int i4 = d2;
            d2 = c2;
            c2 = i4;
        }
        int abs = Math.abs(c2 - c);
        int abs2 = Math.abs(d2 - d);
        int i5 = (-abs) / 2;
        int i6 = d < d2 ? 1 : -1;
        if (c >= c2) {
            i2 = -1;
        }
        boolean d3 = this.f44604a.mo33570d(z ? d : c, z ? c : d);
        while (c != c2) {
            boolean d4 = this.f44604a.mo33570d(z ? d : c, z ? c : d);
            if (d4 != d3) {
                i++;
                d3 = d4;
            }
            i5 += abs2;
            if (i5 > 0) {
                if (d == d2) {
                    break;
                }
                d += i6;
                i5 -= abs;
            }
            c += i2;
        }
        return new C11873b(pVar, pVar2, i);
    }

    /* renamed from: c */
    public C10481g mo36125c() throws C9918j {
        C9924p pVar;
        C9924p pVar2;
        C10476b bVar;
        C9924p[] c = this.f44605b.mo33765c();
        C9924p pVar3 = c[0];
        C9924p pVar4 = c[1];
        C9924p pVar5 = c[2];
        C9924p pVar6 = c[3];
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(m57366h(pVar3, pVar4));
        arrayList.add(m57366h(pVar3, pVar5));
        arrayList.add(m57366h(pVar4, pVar6));
        arrayList.add(m57366h(pVar5, pVar6));
        C9924p pVar7 = null;
        Collections.sort(arrayList, new C11874c());
        C11873b bVar2 = (C11873b) arrayList.get(0);
        C11873b bVar3 = (C11873b) arrayList.get(1);
        HashMap hashMap = new HashMap();
        m57363e(hashMap, bVar2.mo36126a());
        m57363e(hashMap, bVar2.mo36127b());
        m57363e(hashMap, bVar3.mo36126a());
        m57363e(hashMap, bVar3.mo36127b());
        C9924p pVar8 = null;
        C9924p pVar9 = null;
        for (Map.Entry entry : hashMap.entrySet()) {
            C9924p pVar10 = (C9924p) entry.getKey();
            if (((Integer) entry.getValue()).intValue() == 2) {
                pVar8 = pVar10;
            } else if (pVar7 == null) {
                pVar7 = pVar10;
            } else {
                pVar9 = pVar10;
            }
        }
        if (pVar7 == null || pVar8 == null || pVar9 == null) {
            throw C9918j.m50862a();
        }
        C9924p[] pVarArr = {pVar7, pVar8, pVar9};
        C9924p.m50877e(pVarArr);
        C9924p pVar11 = pVarArr[0];
        C9924p pVar12 = pVarArr[1];
        C9924p pVar13 = pVarArr[2];
        if (!hashMap.containsKey(pVar3)) {
            pVar = pVar3;
        } else if (!hashMap.containsKey(pVar4)) {
            pVar = pVar4;
        } else {
            pVar = !hashMap.containsKey(pVar5) ? pVar5 : pVar6;
        }
        int c2 = m57366h(pVar13, pVar).mo36128c();
        int c3 = m57366h(pVar11, pVar).mo36128c();
        if ((c2 & 1) == 1) {
            c2++;
        }
        int i = c2 + 2;
        if ((c3 & 1) == 1) {
            c3++;
        }
        int i2 = c3 + 2;
        if (i * 4 >= i2 * 7 || i2 * 4 >= i * 7) {
            pVar2 = pVar13;
            C9924p b = m57361b(pVar12, pVar11, pVar13, pVar, i, i2);
            if (b != null) {
                pVar = b;
            }
            int c4 = m57366h(pVar2, pVar).mo36128c();
            int c5 = m57366h(pVar11, pVar).mo36128c();
            if ((c4 & 1) == 1) {
                c4++;
            }
            int i3 = c4;
            if ((c5 & 1) == 1) {
                c5++;
            }
            bVar = m57365g(this.f44604a, pVar2, pVar12, pVar11, pVar, i3, c5);
        } else {
            C9924p a = m57360a(pVar12, pVar11, pVar13, pVar, Math.min(i2, i));
            if (a != null) {
                pVar = a;
            }
            int max = Math.max(m57366h(pVar13, pVar).mo36128c(), m57366h(pVar11, pVar).mo36128c()) + 1;
            if ((max & 1) == 1) {
                max++;
            }
            int i4 = max;
            bVar = m57365g(this.f44604a, pVar13, pVar12, pVar11, pVar, i4, i4);
            pVar2 = pVar13;
        }
        return new C10481g(bVar, new C9924p[]{pVar2, pVar12, pVar11, pVar});
    }
}
