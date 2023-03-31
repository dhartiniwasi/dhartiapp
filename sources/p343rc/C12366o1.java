package p343rc;

import java.util.logging.Level;
import java.util.logging.Logger;
import p343rc.C12372r;

/* renamed from: rc.o1 */
/* compiled from: ThreadLocalContextStorage */
final class C12366o1 extends C12372r.C12375c {

    /* renamed from: a */
    private static final Logger f45693a = Logger.getLogger(C12366o1.class.getName());

    /* renamed from: b */
    static final ThreadLocal<C12372r> f45694b = new ThreadLocal<>();

    C12366o1() {
    }

    /* renamed from: b */
    public C12372r mo37077b() {
        C12372r rVar = f45694b.get();
        return rVar == null ? C12372r.f45708d : rVar;
    }

    /* renamed from: c */
    public void mo37078c(C12372r rVar, C12372r rVar2) {
        if (mo37077b() != rVar) {
            f45693a.log(Level.SEVERE, "Context was not attached when detaching", new Throwable().fillInStackTrace());
        }
        if (rVar2 != C12372r.f45708d) {
            f45694b.set(rVar2);
        } else {
            f45694b.set((Object) null);
        }
    }

    /* renamed from: d */
    public C12372r mo37079d(C12372r rVar) {
        C12372r b = mo37077b();
        f45694b.set(rVar);
        return b;
    }
}
