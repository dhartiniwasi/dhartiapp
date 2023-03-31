package p322p9;

import java.util.Map;
import p212d9.C9909a;
import p212d9.C9911c;
import p212d9.C9912d;
import p212d9.C9913e;
import p212d9.C9914f;
import p212d9.C9918j;
import p212d9.C9922n;
import p248h9.C10475a;

/* renamed from: p9.l */
/* compiled from: UPCAReader */
public final class C12157l extends C12161p {

    /* renamed from: i */
    private final C12161p f45236i = new C12150e();

    /* renamed from: q */
    private static C9922n m58395q(C9922n nVar) throws C9914f {
        String f = nVar.mo32476f();
        if (f.charAt(0) == '0') {
            return new C9922n(f.substring(1), (byte[]) null, nVar.mo32475e(), C9909a.UPC_A);
        }
        throw C9914f.m50845a();
    }

    /* renamed from: a */
    public C9922n mo32466a(C9911c cVar, Map<C9913e, ?> map) throws C9918j, C9914f {
        return m58395q(this.f45236i.mo32466a(cVar, map));
    }

    /* renamed from: b */
    public C9922n mo36672b(int i, C10475a aVar, Map<C9913e, ?> map) throws C9918j, C9914f, C9912d {
        return m58395q(this.f45236i.mo36672b(i, aVar, map));
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public int mo36673k(C10475a aVar, int[] iArr, StringBuilder sb) throws C9918j {
        return this.f45236i.mo36673k(aVar, iArr, sb);
    }

    /* renamed from: l */
    public C9922n mo36676l(int i, C10475a aVar, int[] iArr, Map<C9913e, ?> map) throws C9918j, C9914f, C9912d {
        return m58395q(this.f45236i.mo36676l(i, aVar, iArr, map));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public C9909a mo36674p() {
        return C9909a.UPC_A;
    }
}
