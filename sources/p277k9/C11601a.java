package p277k9;

import java.util.List;
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
import p248h9.C10476b;
import p248h9.C10479e;
import p248h9.C10481g;
import p286l9.C11773d;
import p295m9.C11871a;

/* renamed from: k9.a */
/* compiled from: DataMatrixReader */
public final class C11601a implements C9920l {

    /* renamed from: b */
    private static final C9924p[] f44138b = new C9924p[0];

    /* renamed from: a */
    private final C11773d f44139a = new C11773d();

    /* renamed from: b */
    private static C10476b m56617b(C10476b bVar) throws C9918j {
        int[] i = bVar.mo33577i();
        int[] e = bVar.mo33571e();
        if (i == null || e == null) {
            throw C9918j.m50862a();
        }
        int c = m56618c(i, bVar);
        int i2 = i[1];
        int i3 = e[1];
        int i4 = i[0];
        int i5 = ((e[0] - i4) + 1) / c;
        int i6 = ((i3 - i2) + 1) / c;
        if (i5 <= 0 || i6 <= 0) {
            throw C9918j.m50862a();
        }
        int i7 = c / 2;
        int i8 = i2 + i7;
        int i9 = i4 + i7;
        C10476b bVar2 = new C10476b(i5, i6);
        for (int i10 = 0; i10 < i6; i10++) {
            int i11 = (i10 * c) + i8;
            for (int i12 = 0; i12 < i5; i12++) {
                if (bVar.mo33570d((i12 * c) + i9, i11)) {
                    bVar2.mo33580l(i12, i10);
                }
            }
        }
        return bVar2;
    }

    /* renamed from: c */
    private static int m56618c(int[] iArr, C10476b bVar) throws C9918j {
        int j = bVar.mo33578j();
        int i = iArr[0];
        int i2 = iArr[1];
        while (i < j && bVar.mo33570d(i, i2)) {
            i++;
        }
        if (i != j) {
            int i3 = i - iArr[0];
            if (i3 != 0) {
                return i3;
            }
            throw C9918j.m50862a();
        }
        throw C9918j.m50862a();
    }

    /* renamed from: a */
    public C9922n mo32466a(C9911c cVar, Map<C9913e, ?> map) throws C9918j, C9912d, C9914f {
        C9924p[] pVarArr;
        C10479e eVar;
        if (map == null || !map.containsKey(C9913e.PURE_BARCODE)) {
            C10481g c = new C11871a(cVar.mo32451a()).mo36125c();
            C10479e b = this.f44139a.mo36008b(c.mo33604a());
            pVarArr = c.mo33605b();
            eVar = b;
        } else {
            eVar = this.f44139a.mo36008b(m56617b(cVar.mo32451a()));
            pVarArr = f44138b;
        }
        C9922n nVar = new C9922n(eVar.mo33596h(), eVar.mo33593e(), pVarArr, C9909a.DATA_MATRIX);
        List<byte[]> a = eVar.mo33589a();
        if (a != null) {
            nVar.mo32478h(C9923o.BYTE_SEGMENTS, a);
        }
        String b2 = eVar.mo33590b();
        if (b2 != null) {
            nVar.mo32478h(C9923o.ERROR_CORRECTION_LEVEL, b2);
        }
        return nVar;
    }

    public void reset() {
    }
}
