package p358t9;

import java.util.ArrayList;
import java.util.Map;
import p212d9.C9909a;
import p212d9.C9911c;
import p212d9.C9912d;
import p212d9.C9913e;
import p212d9.C9914f;
import p212d9.C9918j;
import p212d9.C9920l;
import p212d9.C9922n;
import p212d9.C9923o;
import p212d9.C9924p;
import p248h9.C10479e;
import p368u9.C12721j;
import p388w9.C12935a;
import p388w9.C12936b;

/* renamed from: t9.b */
/* compiled from: PDF417Reader */
public final class C12554b implements C9920l {
    /* renamed from: b */
    private static C9922n[] m59750b(C9911c cVar, Map<C9913e, ?> map, boolean z) throws C9918j, C9914f, C9912d {
        ArrayList arrayList = new ArrayList();
        C12936b c = C12935a.m61096c(cVar, map, z);
        for (C9924p[] next : c.mo37977b()) {
            C10479e i = C12721j.m60333i(c.mo37976a(), next[4], next[5], next[6], next[7], m59753e(next), m59751c(next));
            C9922n nVar = new C9922n(i.mo33596h(), i.mo33593e(), next, C9909a.PDF_417);
            nVar.mo32478h(C9923o.ERROR_CORRECTION_LEVEL, i.mo33590b());
            C12555c cVar2 = (C12555c) i.mo33592d();
            if (cVar2 != null) {
                nVar.mo32478h(C9923o.PDF417_EXTRA_METADATA, cVar2);
            }
            arrayList.add(nVar);
        }
        return (C9922n[]) arrayList.toArray(new C9922n[arrayList.size()]);
    }

    /* renamed from: c */
    private static int m59751c(C9924p[] pVarArr) {
        return Math.max(Math.max(m59752d(pVarArr[0], pVarArr[4]), (m59752d(pVarArr[6], pVarArr[2]) * 17) / 18), Math.max(m59752d(pVarArr[1], pVarArr[5]), (m59752d(pVarArr[7], pVarArr[3]) * 17) / 18));
    }

    /* renamed from: d */
    private static int m59752d(C9924p pVar, C9924p pVar2) {
        if (pVar == null || pVar2 == null) {
            return 0;
        }
        return (int) Math.abs(pVar.mo32480c() - pVar2.mo32480c());
    }

    /* renamed from: e */
    private static int m59753e(C9924p[] pVarArr) {
        return Math.min(Math.min(m59754f(pVarArr[0], pVarArr[4]), (m59754f(pVarArr[6], pVarArr[2]) * 17) / 18), Math.min(m59754f(pVarArr[1], pVarArr[5]), (m59754f(pVarArr[7], pVarArr[3]) * 17) / 18));
    }

    /* renamed from: f */
    private static int m59754f(C9924p pVar, C9924p pVar2) {
        if (pVar == null || pVar2 == null) {
            return Integer.MAX_VALUE;
        }
        return (int) Math.abs(pVar.mo32480c() - pVar2.mo32480c());
    }

    /* renamed from: a */
    public C9922n mo32466a(C9911c cVar, Map<C9913e, ?> map) throws C9918j, C9914f, C9912d {
        C9922n[] b = m59750b(cVar, map, false);
        if (b != null && b.length != 0 && b[0] != null) {
            return b[0];
        }
        throw C9918j.m50862a();
    }

    public void reset() {
    }
}
