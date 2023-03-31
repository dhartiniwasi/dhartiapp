package p188ae;

import p243gd.C10349s;
import p344rd.C12439l;

/* renamed from: ae.h */
/* compiled from: Channel.kt */
public final class C6590h {
    /* renamed from: a */
    public static final <E> C6587f<E> m38195a(int i, C6586e eVar, C12439l<? super E, C10349s> lVar) {
        int i2 = 1;
        if (i == -2) {
            if (eVar == C6586e.SUSPEND) {
                i2 = C6587f.f31052a.mo22222a();
            }
            return new C6584d(i2, eVar, lVar);
        } else if (i == -1) {
            if (eVar != C6586e.SUSPEND) {
                i2 = 0;
            }
            if (i2 != 0) {
                return new C6598m(lVar);
            }
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
        } else if (i != 0) {
            if (i == Integer.MAX_VALUE) {
                return new C6599n(lVar);
            }
            if (i == 1 && eVar == C6586e.DROP_OLDEST) {
                return new C6598m(lVar);
            }
            return new C6584d(i, eVar, lVar);
        } else if (eVar == C6586e.SUSPEND) {
            return new C6603r(lVar);
        } else {
            return new C6584d(1, eVar, lVar);
        }
    }

    /* renamed from: b */
    public static /* synthetic */ C6587f m38196b(int i, C6586e eVar, C12439l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            eVar = C6586e.SUSPEND;
        }
        if ((i2 & 4) != 0) {
            lVar = null;
        }
        return m38195a(i, eVar, lVar);
    }
}
