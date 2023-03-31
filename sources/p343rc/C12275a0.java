package p343rc;

import java.util.List;

/* renamed from: rc.a0 */
/* compiled from: GlobalInterceptors */
final class C12275a0 {

    /* renamed from: a */
    private static List<C12323h> f45496a;

    /* renamed from: b */
    private static boolean f45497b;

    /* renamed from: a */
    static synchronized List<C12323h> m58940a() {
        List<C12323h> list;
        synchronized (C12275a0.class) {
            f45497b = true;
            list = f45496a;
        }
        return list;
    }
}
