package p406y9;

import java.util.Map;
import p212d9.C9912d;
import p212d9.C9913e;
import p212d9.C9914f;
import p248h9.C10476b;
import p248h9.C10479e;
import p268j9.C11501a;
import p268j9.C11503c;
import p268j9.C11504d;

/* renamed from: y9.e */
/* compiled from: Decoder */
public final class C13234e {

    /* renamed from: a */
    private final C11503c f47491a = new C11503c(C11501a.f43917l);

    /* renamed from: a */
    private void m62042a(byte[] bArr, int i) throws C9912d {
        int length = bArr.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        try {
            this.f47491a.mo35512a(iArr, bArr.length - i);
            for (int i3 = 0; i3 < i; i3++) {
                bArr[i3] = (byte) iArr[i3];
            }
        } catch (C11504d unused) {
            throw C9912d.m50844a();
        }
    }

    /* renamed from: c */
    private C10479e m62043c(C13222a aVar, Map<C9913e, ?> map) throws C9914f, C9912d {
        C13239j e = aVar.mo38321e();
        C13235f d = aVar.mo38320d().mo38330d();
        C13223b[] b = C13223b.m62021b(aVar.mo38319c(), e, d);
        int i = 0;
        for (C13223b c : b) {
            i += c.mo38325c();
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (C13223b bVar : b) {
            byte[] a = bVar.mo38324a();
            int c2 = bVar.mo38325c();
            m62042a(a, c2);
            int i3 = 0;
            while (i3 < c2) {
                bArr[i2] = a[i3];
                i3++;
                i2++;
            }
        }
        return C13233d.m62034a(bArr, e, d, map);
    }

    /* renamed from: b */
    public C10479e mo38328b(C10476b bVar, Map<C9913e, ?> map) throws C9914f, C9912d {
        C9912d e;
        C13222a aVar = new C13222a(bVar);
        C9914f fVar = null;
        try {
            return m62043c(aVar, map);
        } catch (C9914f e2) {
            C9914f fVar2 = e2;
            e = null;
            fVar = fVar2;
            try {
                aVar.mo38322f();
                aVar.mo38323g(true);
                aVar.mo38321e();
                aVar.mo38320d();
                aVar.mo38318b();
                C10479e c = m62043c(aVar, map);
                c.mo33601m(new C13238i(true));
                return c;
            } catch (C9912d | C9914f e3) {
                if (fVar != null) {
                    throw fVar;
                } else if (e != null) {
                    throw e;
                } else {
                    throw e3;
                }
            }
        } catch (C9912d e4) {
            e = e4;
            aVar.mo38322f();
            aVar.mo38323g(true);
            aVar.mo38321e();
            aVar.mo38320d();
            aVar.mo38318b();
            C10479e c2 = m62043c(aVar, map);
            c2.mo33601m(new C13238i(true));
            return c2;
        }
    }
}
