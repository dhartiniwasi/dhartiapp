package p247h8;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p218e6.C9977j;

/* renamed from: h8.e */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C10438e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Callable f41376a;

    /* renamed from: b */
    public final /* synthetic */ Executor f41377b;

    /* renamed from: c */
    public final /* synthetic */ C9977j f41378c;

    public /* synthetic */ C10438e(Callable callable, Executor executor, C9977j jVar) {
        this.f41376a = callable;
        this.f41377b = executor;
        this.f41378c = jVar;
    }

    public final void run() {
        C10442g.m52661r(this.f41376a, this.f41377b, this.f41378c);
    }
}
