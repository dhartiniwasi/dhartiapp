package p297mb;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import p264io.flutter.embedding.engine.FlutterJNI;
import p324pb.C12164a;
import p333qb.C12212f;

/* renamed from: mb.a */
/* compiled from: FlutterInjector */
public final class C11877a {

    /* renamed from: e */
    private static C11877a f44609e;

    /* renamed from: f */
    private static boolean f44610f;

    /* renamed from: a */
    private C12212f f44611a;

    /* renamed from: b */
    private C12164a f44612b;

    /* renamed from: c */
    private FlutterJNI.C10684c f44613c;

    /* renamed from: d */
    private ExecutorService f44614d;

    /* renamed from: mb.a$b */
    /* compiled from: FlutterInjector */
    public static final class C11879b {

        /* renamed from: a */
        private C12212f f44615a;

        /* renamed from: b */
        private C12164a f44616b;

        /* renamed from: c */
        private FlutterJNI.C10684c f44617c;

        /* renamed from: d */
        private ExecutorService f44618d;

        /* renamed from: mb.a$b$a */
        /* compiled from: FlutterInjector */
        private class C11880a implements ThreadFactory {

            /* renamed from: a */
            private int f44619a;

            private C11880a() {
                this.f44619a = 0;
            }

            public Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable);
                StringBuilder sb = new StringBuilder();
                sb.append("flutter-worker-");
                int i = this.f44619a;
                this.f44619a = i + 1;
                sb.append(i);
                thread.setName(sb.toString());
                return thread;
            }
        }

        /* renamed from: b */
        private void m57381b() {
            if (this.f44617c == null) {
                this.f44617c = new FlutterJNI.C10684c();
            }
            if (this.f44618d == null) {
                this.f44618d = Executors.newCachedThreadPool(new C11880a());
            }
            if (this.f44615a == null) {
                this.f44615a = new C12212f(this.f44617c.mo34065a(), this.f44618d);
            }
        }

        /* renamed from: a */
        public C11877a mo36136a() {
            m57381b();
            return new C11877a(this.f44615a, this.f44616b, this.f44617c, this.f44618d);
        }
    }

    /* renamed from: e */
    public static C11877a m57376e() {
        f44610f = true;
        if (f44609e == null) {
            f44609e = new C11879b().mo36136a();
        }
        return f44609e;
    }

    /* renamed from: a */
    public C12164a mo36132a() {
        return this.f44612b;
    }

    /* renamed from: b */
    public ExecutorService mo36133b() {
        return this.f44614d;
    }

    /* renamed from: c */
    public C12212f mo36134c() {
        return this.f44611a;
    }

    /* renamed from: d */
    public FlutterJNI.C10684c mo36135d() {
        return this.f44613c;
    }

    private C11877a(C12212f fVar, C12164a aVar, FlutterJNI.C10684c cVar, ExecutorService executorService) {
        this.f44611a = fVar;
        this.f44612b = aVar;
        this.f44613c = cVar;
        this.f44614d = executorService;
    }
}
