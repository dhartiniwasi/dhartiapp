package androidx.room;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* renamed from: androidx.room.l */
/* compiled from: TransactionExecutor */
class C1460l implements Executor {

    /* renamed from: a */
    private final Executor f4181a;

    /* renamed from: b */
    private final ArrayDeque<Runnable> f4182b = new ArrayDeque<>();

    /* renamed from: c */
    private Runnable f4183c;

    /* renamed from: androidx.room.l$a */
    /* compiled from: TransactionExecutor */
    class C1461a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Runnable f4184a;

        C1461a(Runnable runnable) {
            this.f4184a = runnable;
        }

        public void run() {
            try {
                this.f4184a.run();
            } finally {
                C1460l.this.mo5638b();
            }
        }
    }

    C1460l(Executor executor) {
        this.f4181a = executor;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized void mo5638b() {
        Runnable poll = this.f4182b.poll();
        this.f4183c = poll;
        if (poll != null) {
            this.f4181a.execute(poll);
        }
    }

    public synchronized void execute(Runnable runnable) {
        this.f4182b.offer(new C1461a(runnable));
        if (this.f4183c == null) {
            mo5638b();
        }
    }
}
