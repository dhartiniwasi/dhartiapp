package p075k;

import java.util.concurrent.Executor;

/* renamed from: k.a */
/* compiled from: ArchTaskExecutor */
public class C4834a extends C4839c {

    /* renamed from: c */
    private static volatile C4834a f25574c;

    /* renamed from: d */
    private static final Executor f25575d = new C4835a();

    /* renamed from: e */
    private static final Executor f25576e = new C4836b();

    /* renamed from: a */
    private C4839c f25577a;

    /* renamed from: b */
    private C4839c f25578b;

    /* renamed from: k.a$a */
    /* compiled from: ArchTaskExecutor */
    static class C4835a implements Executor {
        C4835a() {
        }

        public void execute(Runnable runnable) {
            C4834a.m30860e().mo18578c(runnable);
        }
    }

    /* renamed from: k.a$b */
    /* compiled from: ArchTaskExecutor */
    static class C4836b implements Executor {
        C4836b() {
        }

        public void execute(Runnable runnable) {
            C4834a.m30860e().mo18576a(runnable);
        }
    }

    private C4834a() {
        C4837b bVar = new C4837b();
        this.f25578b = bVar;
        this.f25577a = bVar;
    }

    /* renamed from: d */
    public static Executor m30859d() {
        return f25576e;
    }

    /* renamed from: e */
    public static C4834a m30860e() {
        if (f25574c != null) {
            return f25574c;
        }
        synchronized (C4834a.class) {
            if (f25574c == null) {
                f25574c = new C4834a();
            }
        }
        return f25574c;
    }

    /* renamed from: a */
    public void mo18576a(Runnable runnable) {
        this.f25577a.mo18576a(runnable);
    }

    /* renamed from: b */
    public boolean mo18577b() {
        return this.f25577a.mo18577b();
    }

    /* renamed from: c */
    public void mo18578c(Runnable runnable) {
        this.f25577a.mo18578c(runnable);
    }
}
