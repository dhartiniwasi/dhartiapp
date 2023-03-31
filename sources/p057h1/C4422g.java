package p057h1;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* renamed from: h1.g */
/* compiled from: SerialExecutor */
public class C4422g implements Executor {

    /* renamed from: a */
    private final ArrayDeque<C4423a> f24594a = new ArrayDeque<>();

    /* renamed from: b */
    private final Executor f24595b;

    /* renamed from: c */
    private final Object f24596c = new Object();

    /* renamed from: d */
    private volatile Runnable f24597d;

    /* renamed from: h1.g$a */
    /* compiled from: SerialExecutor */
    static class C4423a implements Runnable {

        /* renamed from: a */
        final C4422g f24598a;

        /* renamed from: b */
        final Runnable f24599b;

        C4423a(C4422g gVar, Runnable runnable) {
            this.f24598a = gVar;
            this.f24599b = runnable;
        }

        public void run() {
            try {
                this.f24599b.run();
            } finally {
                this.f24598a.mo17952c();
            }
        }
    }

    public C4422g(Executor executor) {
        this.f24595b = executor;
    }

    /* renamed from: b */
    public boolean mo17951b() {
        boolean z;
        synchronized (this.f24596c) {
            z = !this.f24594a.isEmpty();
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo17952c() {
        synchronized (this.f24596c) {
            Runnable poll = this.f24594a.poll();
            this.f24597d = poll;
            if (poll != null) {
                this.f24595b.execute(this.f24597d);
            }
        }
    }

    public void execute(Runnable runnable) {
        synchronized (this.f24596c) {
            this.f24594a.add(new C4423a(this, runnable));
            if (this.f24597d == null) {
                mo17952c();
            }
        }
    }
}
