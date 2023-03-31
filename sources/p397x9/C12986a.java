package p397x9;

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
import p406y9.C13234e;
import p406y9.C13238i;
import p415z9.C13477c;

/* renamed from: x9.a */
/* compiled from: QRCodeReader */
public class C12986a implements C9920l {

    /* renamed from: b */
    private static final C9924p[] f47245b = new C9924p[0];

    /* renamed from: a */
    private final C13234e f47246a = new C13234e();

    /* renamed from: b */
    private static C10476b m61199b(C10476b bVar) throws C9918j {
        int[] i = bVar.mo33577i();
        int[] e = bVar.mo33571e();
        if (i == null || e == null) {
            throw C9918j.m50862a();
        }
        float c = m61200c(i, bVar);
        int i2 = i[1];
        int i3 = e[1];
        int i4 = i[0];
        int i5 = e[0];
        if (i4 >= i5 || i2 >= i3) {
            throw C9918j.m50862a();
        }
        int i6 = i3 - i2;
        if (i6 == i5 - i4 || (i5 = i4 + i6) < bVar.mo33578j()) {
            int round = Math.round(((float) ((i5 - i4) + 1)) / c);
            int round2 = Math.round(((float) (i6 + 1)) / c);
            if (round <= 0 || round2 <= 0) {
                throw C9918j.m50862a();
            } else if (round2 == round) {
                int i7 = (int) (c / 2.0f);
                int i8 = i2 + i7;
                int i9 = i4 + i7;
                int i10 = (((int) (((float) (round - 1)) * c)) + i9) - i5;
                if (i10 > 0) {
                    if (i10 <= i7) {
                        i9 -= i10;
                    } else {
                        throw C9918j.m50862a();
                    }
                }
                int i11 = (((int) (((float) (round2 - 1)) * c)) + i8) - i3;
                if (i11 > 0) {
                    if (i11 <= i7) {
                        i8 -= i11;
                    } else {
                        throw C9918j.m50862a();
                    }
                }
                C10476b bVar2 = new C10476b(round, round2);
                for (int i12 = 0; i12 < round2; i12++) {
                    int i13 = ((int) (((float) i12) * c)) + i8;
                    for (int i14 = 0; i14 < round; i14++) {
                        if (bVar.mo33570d(((int) (((float) i14) * c)) + i9, i13)) {
                            bVar2.mo33580l(i14, i12);
                        }
                    }
                }
                return bVar2;
            } else {
                throw C9918j.m50862a();
            }
        } else {
            throw C9918j.m50862a();
        }
    }

    /* renamed from: c */
    private static float m61200c(int[] iArr, C10476b bVar) throws C9918j {
        int g = bVar.mo33574g();
        int j = bVar.mo33578j();
        int i = iArr[0];
        boolean z = true;
        int i2 = iArr[1];
        int i3 = 0;
        while (i < j && i2 < g) {
            if (z != bVar.mo33570d(i, i2)) {
                i3++;
                if (i3 == 5) {
                    break;
                }
                z = !z;
            }
            i++;
            i2++;
        }
        if (i != j && i2 != g) {
            return ((float) (i - iArr[0])) / 7.0f;
        }
        throw C9918j.m50862a();
    }

    /* renamed from: a */
    public final C9922n mo32466a(C9911c cVar, Map<C9913e, ?> map) throws C9918j, C9912d, C9914f {
        C9924p[] pVarArr;
        C10479e eVar;
        if (map == null || !map.containsKey(C9913e.PURE_BARCODE)) {
            C10481g e = new C13477c(cVar.mo32451a()).mo38598e(map);
            C10479e b = this.f47246a.mo38328b(e.mo33604a(), map);
            pVarArr = e.mo33605b();
            eVar = b;
        } else {
            eVar = this.f47246a.mo38328b(m61199b(cVar.mo32451a()), map);
            pVarArr = f47245b;
        }
        if (eVar.mo33592d() instanceof C13238i) {
            ((C13238i) eVar.mo33592d()).mo38334a(pVarArr);
        }
        C9922n nVar = new C9922n(eVar.mo33596h(), eVar.mo33593e(), pVarArr, C9909a.QR_CODE);
        List<byte[]> a = eVar.mo33589a();
        if (a != null) {
            nVar.mo32478h(C9923o.BYTE_SEGMENTS, a);
        }
        String b2 = eVar.mo33590b();
        if (b2 != null) {
            nVar.mo32478h(C9923o.ERROR_CORRECTION_LEVEL, b2);
        }
        if (eVar.mo33597i()) {
            nVar.mo32478h(C9923o.STRUCTURED_APPEND_SEQUENCE, Integer.valueOf(eVar.mo33595g()));
            nVar.mo32478h(C9923o.STRUCTURED_APPEND_PARITY, Integer.valueOf(eVar.mo33594f()));
        }
        return nVar;
    }

    public void reset() {
    }
}
