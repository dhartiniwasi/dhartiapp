package p367u8;

import java.util.Iterator;
import java.util.Set;
import p302n7.C11934c;
import p302n7.C11940e;
import p302n7.C11966r;

/* renamed from: u8.c */
/* compiled from: DefaultUserAgentPublisher */
public class C12702c implements C12709i {

    /* renamed from: a */
    private final String f46473a;

    /* renamed from: b */
    private final C12703d f46474b;

    C12702c(Set<C12705f> set, C12703d dVar) {
        this.f46473a = m60239e(set);
        this.f46474b = dVar;
    }

    /* renamed from: c */
    public static C11934c<C12709i> m60237c() {
        return C11934c.m57617c(C12709i.class).mo36256b(C11966r.m57747m(C12705f.class)).mo36260f(C12701b.f46472a).mo36258d();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ C12709i m60238d(C11940e eVar) {
        return new C12702c(eVar.mo36267e(C12705f.class), C12703d.m60241a());
    }

    /* renamed from: e */
    private static String m60239e(Set<C12705f> set) {
        StringBuilder sb = new StringBuilder();
        Iterator<C12705f> it = set.iterator();
        while (it.hasNext()) {
            C12705f next = it.next();
            sb.append(next.mo37573b());
            sb.append('/');
            sb.append(next.mo37574c());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public String mo37578a() {
        if (this.f46474b.mo37579b().isEmpty()) {
            return this.f46473a;
        }
        return this.f46473a + ' ' + m60239e(this.f46474b.mo37579b());
    }
}
