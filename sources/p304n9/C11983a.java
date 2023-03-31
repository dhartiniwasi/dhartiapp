package p304n9;

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
import p313o9.C12046c;

/* renamed from: n9.a */
/* compiled from: MaxiCodeReader */
public final class C11983a implements C9920l {

    /* renamed from: b */
    private static final C9924p[] f44919b = new C9924p[0];

    /* renamed from: a */
    private final C12046c f44920a = new C12046c();

    /* renamed from: b */
    private static C10476b m57822b(C10476b bVar) throws C9918j {
        int[] f = bVar.mo33573f();
        if (f != null) {
            int i = f[0];
            int i2 = f[1];
            int i3 = f[2];
            int i4 = f[3];
            C10476b bVar2 = new C10476b(30, 33);
            for (int i5 = 0; i5 < 33; i5++) {
                int i6 = (((i5 * i4) + (i4 / 2)) / 33) + i2;
                for (int i7 = 0; i7 < 30; i7++) {
                    if (bVar.mo33570d(((((i7 * i3) + (i3 / 2)) + (((i5 & 1) * i3) / 2)) / 30) + i, i6)) {
                        bVar2.mo33580l(i7, i5);
                    }
                }
            }
            return bVar2;
        }
        throw C9918j.m50862a();
    }

    /* renamed from: a */
    public C9922n mo32466a(C9911c cVar, Map<C9913e, ?> map) throws C9918j, C9912d, C9914f {
        if (map == null || !map.containsKey(C9913e.PURE_BARCODE)) {
            throw C9918j.m50862a();
        }
        C10479e b = this.f44920a.mo36417b(m57822b(cVar.mo32451a()), map);
        C9922n nVar = new C9922n(b.mo33596h(), b.mo33593e(), f44919b, C9909a.MAXICODE);
        String b2 = b.mo33590b();
        if (b2 != null) {
            nVar.mo32478h(C9923o.ERROR_CORRECTION_LEVEL, b2);
        }
        return nVar;
    }

    public void reset() {
    }
}
