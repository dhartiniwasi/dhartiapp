package kotlinx.coroutines.internal;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import p410yd.C13372z1;

/* renamed from: kotlinx.coroutines.internal.v */
/* compiled from: MainDispatchers.kt */
public final class C11730v {

    /* renamed from: a */
    public static final C11730v f44313a;

    /* renamed from: b */
    private static final boolean f44314b = C11692f0.m56857e("kotlinx.coroutines.fast.service.loader", true);

    /* renamed from: c */
    public static final C13372z1 f44315c;

    static {
        C11730v vVar = new C11730v();
        f44313a = vVar;
        f44315c = vVar.m56973a();
    }

    private C11730v() {
    }

    /* renamed from: a */
    private final C13372z1 m56973a() {
        List<C11729u> list;
        T t;
        Class<C11729u> cls = C11729u.class;
        try {
            if (f44314b) {
                list = C11710k.f44282a.mo35917c();
            } else {
                list = C12956h.m61144f(C12953f.m61139a(ServiceLoader.load(cls, cls.getClassLoader()).iterator()));
            }
            Iterator<T> it = list.iterator();
            if (!it.hasNext()) {
                t = null;
            } else {
                t = it.next();
                if (it.hasNext()) {
                    int loadPriority = ((C11729u) t).getLoadPriority();
                    do {
                        T next = it.next();
                        int loadPriority2 = ((C11729u) next).getLoadPriority();
                        if (loadPriority < loadPriority2) {
                            t = next;
                            loadPriority = loadPriority2;
                        }
                    } while (it.hasNext());
                }
            }
            C11729u uVar = (C11729u) t;
            C13372z1 e = uVar == null ? null : C11731w.m56978e(uVar, list);
            if (e == null) {
                return C11731w.m56975b((Throwable) null, (String) null, 3, (Object) null);
            }
            return e;
        } catch (Throwable th) {
            return C11731w.m56975b(th, (String) null, 2, (Object) null);
        }
    }
}
