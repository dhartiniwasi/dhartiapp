package p410yd;

/* renamed from: yd.g2 */
/* compiled from: EventLoop.common.kt */
public final class C13301g2 {

    /* renamed from: a */
    public static final C13301g2 f47622a = new C13301g2();

    /* renamed from: b */
    private static final ThreadLocal<C13266a1> f47623b = new ThreadLocal<>();

    private C13301g2() {
    }

    /* renamed from: a */
    public final C13266a1 mo38422a() {
        ThreadLocal<C13266a1> threadLocal = f47623b;
        C13266a1 a1Var = threadLocal.get();
        if (a1Var != null) {
            return a1Var;
        }
        C13266a1 a = C13285d1.m62189a();
        threadLocal.set(a);
        return a;
    }

    /* renamed from: b */
    public final void mo38423b() {
        f47623b.set((Object) null);
    }

    /* renamed from: c */
    public final void mo38424c(C13266a1 a1Var) {
        f47623b.set(a1Var);
    }
}
