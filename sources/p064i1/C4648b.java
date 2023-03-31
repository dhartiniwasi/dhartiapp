package p064i1;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import p057h1.C4422g;

/* renamed from: i1.b */
/* compiled from: WorkManagerTaskExecutor */
public class C4648b implements C4647a {

    /* renamed from: a */
    private final C4422g f25153a;

    /* renamed from: b */
    private final Handler f25154b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    private final Executor f25155c = new C4649a();

    /* renamed from: i1.b$a */
    /* compiled from: WorkManagerTaskExecutor */
    class C4649a implements Executor {
        C4649a() {
        }

        public void execute(Runnable runnable) {
            C4648b.this.mo18324d(runnable);
        }
    }

    public C4648b(Executor executor) {
        this.f25153a = new C4422g(executor);
    }

    /* renamed from: a */
    public Executor mo18321a() {
        return this.f25155c;
    }

    /* renamed from: b */
    public void mo18322b(Runnable runnable) {
        this.f25153a.execute(runnable);
    }

    /* renamed from: c */
    public C4422g mo18323c() {
        return this.f25153a;
    }

    /* renamed from: d */
    public void mo18324d(Runnable runnable) {
        this.f25154b.post(runnable);
    }
}
