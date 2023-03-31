package p322p9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import p212d9.C9909a;
import p212d9.C9913e;
import p212d9.C9918j;
import p212d9.C9921m;
import p212d9.C9922n;
import p248h9.C10475a;

/* renamed from: p9.j */
/* compiled from: MultiFormatUPCEANReader */
public final class C12155j extends C12156k {

    /* renamed from: a */
    private final C12161p[] f45235a;

    public C12155j(Map<C9913e, ?> map) {
        Collection collection;
        if (map == null) {
            collection = null;
        } else {
            collection = (Collection) map.get(C9913e.POSSIBLE_FORMATS);
        }
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (collection.contains(C9909a.EAN_13)) {
                arrayList.add(new C12150e());
            } else if (collection.contains(C9909a.UPC_A)) {
                arrayList.add(new C12157l());
            }
            if (collection.contains(C9909a.EAN_8)) {
                arrayList.add(new C12151f());
            }
            if (collection.contains(C9909a.UPC_E)) {
                arrayList.add(new C12162q());
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new C12150e());
            arrayList.add(new C12151f());
            arrayList.add(new C12162q());
        }
        this.f45235a = (C12161p[]) arrayList.toArray(new C12161p[arrayList.size()]);
    }

    /* renamed from: b */
    public C9922n mo36672b(int i, C10475a aVar, Map<C9913e, ?> map) throws C9918j {
        Collection collection;
        int[] o = C12161p.m58415o(aVar);
        C12161p[] pVarArr = this.f45235a;
        boolean z = false;
        int i2 = 0;
        while (i2 < pVarArr.length) {
            try {
                C9922n l = pVarArr[i2].mo36676l(i, aVar, o, map);
                boolean z2 = l.mo32472b() == C9909a.EAN_13 && l.mo32476f().charAt(0) == '0';
                if (map == null) {
                    collection = null;
                } else {
                    collection = (Collection) map.get(C9913e.POSSIBLE_FORMATS);
                }
                if (collection == null || collection.contains(C9909a.UPC_A)) {
                    z = true;
                }
                if (!z2 || !z) {
                    return l;
                }
                C9922n nVar = new C9922n(l.mo32476f().substring(1), l.mo32473c(), l.mo32475e(), C9909a.UPC_A);
                nVar.mo32477g(l.mo32474d());
                return nVar;
            } catch (C9921m unused) {
                i2++;
            }
        }
        throw C9918j.m50862a();
    }

    public void reset() {
        for (C12161p reset : this.f45235a) {
            reset.reset();
        }
    }
}
