package p343rc;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import p343rc.C12346l;

/* renamed from: rc.o */
/* compiled from: CompressorRegistry */
public final class C12364o {

    /* renamed from: b */
    private static final C12364o f45689b = new C12364o(new C12346l.C12347a(), C12346l.C12348b.f45659a);

    /* renamed from: a */
    private final ConcurrentMap<String, C12357n> f45690a = new ConcurrentHashMap();

    C12364o(C12357n... nVarArr) {
        for (C12357n nVar : nVarArr) {
            this.f45690a.put(nVar.mo37049a(), nVar);
        }
    }

    /* renamed from: a */
    public static C12364o m59179a() {
        return f45689b;
    }

    /* renamed from: b */
    public C12357n mo37076b(String str) {
        return (C12357n) this.f45690a.get(str);
    }
}
