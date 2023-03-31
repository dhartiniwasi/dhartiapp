package p264io.grpc.internal;

import java.util.IdentityHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p182a7.C6431n;

/* renamed from: io.grpc.internal.f2 */
/* compiled from: SharedResourceHolder */
public final class C11183f2 {

    /* renamed from: d */
    private static final C11183f2 f43081d = new C11183f2(new C11184a());
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final IdentityHashMap<C11187d<?>, C11186c> f43082a = new IdentityHashMap<>();

    /* renamed from: b */
    private final C11188e f43083b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public ScheduledExecutorService f43084c;

    /* renamed from: io.grpc.internal.f2$a */
    /* compiled from: SharedResourceHolder */
    class C11184a implements C11188e {
        C11184a() {
        }

        /* renamed from: a */
        public ScheduledExecutorService mo35065a() {
            return Executors.newSingleThreadScheduledExecutor(C11335r0.m55802i("grpc-shared-destroyer-%d", true));
        }
    }

    /* renamed from: io.grpc.internal.f2$b */
    /* compiled from: SharedResourceHolder */
    class C11185b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C11186c f43085a;

        /* renamed from: b */
        final /* synthetic */ C11187d f43086b;

        /* renamed from: c */
        final /* synthetic */ Object f43087c;

        C11185b(C11186c cVar, C11187d dVar, Object obj) {
            this.f43085a = cVar;
            this.f43086b = dVar;
            this.f43087c = obj;
        }

        /* JADX INFO: finally extract failed */
        public void run() {
            synchronized (C11183f2.this) {
                if (this.f43085a.f43090b == 0) {
                    try {
                        this.f43086b.mo35068b(this.f43087c);
                        C11183f2.this.f43082a.remove(this.f43086b);
                        if (C11183f2.this.f43082a.isEmpty()) {
                            C11183f2.this.f43084c.shutdown();
                            ScheduledExecutorService unused = C11183f2.this.f43084c = null;
                        }
                    } catch (Throwable th) {
                        C11183f2.this.f43082a.remove(this.f43086b);
                        if (C11183f2.this.f43082a.isEmpty()) {
                            C11183f2.this.f43084c.shutdown();
                            ScheduledExecutorService unused2 = C11183f2.this.f43084c = null;
                        }
                        throw th;
                    }
                }
            }
        }
    }

    /* renamed from: io.grpc.internal.f2$c */
    /* compiled from: SharedResourceHolder */
    private static class C11186c {

        /* renamed from: a */
        final Object f43089a;

        /* renamed from: b */
        int f43090b;

        /* renamed from: c */
        ScheduledFuture<?> f43091c;

        C11186c(Object obj) {
            this.f43089a = obj;
        }
    }

    /* renamed from: io.grpc.internal.f2$d */
    /* compiled from: SharedResourceHolder */
    public interface C11187d<T> {
        /* renamed from: a */
        T mo35067a();

        /* renamed from: b */
        void mo35068b(T t);
    }

    /* renamed from: io.grpc.internal.f2$e */
    /* compiled from: SharedResourceHolder */
    interface C11188e {
        /* renamed from: a */
        ScheduledExecutorService mo35065a();
    }

    C11183f2(C11188e eVar) {
        this.f43083b = eVar;
    }

    /* renamed from: d */
    public static <T> T m55283d(C11187d<T> dVar) {
        return f43081d.mo35063e(dVar);
    }

    /* renamed from: f */
    public static <T> T m55284f(C11187d<T> dVar, T t) {
        return f43081d.mo35064g(dVar, t);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public synchronized <T> T mo35063e(C11187d<T> dVar) {
        C11186c cVar;
        cVar = this.f43082a.get(dVar);
        if (cVar == null) {
            cVar = new C11186c(dVar.mo35067a());
            this.f43082a.put(dVar, cVar);
        }
        ScheduledFuture<?> scheduledFuture = cVar.f43091c;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            cVar.f43091c = null;
        }
        cVar.f43090b++;
        return cVar.f43089a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public synchronized <T> T mo35064g(C11187d<T> dVar, T t) {
        C11186c cVar = this.f43082a.get(dVar);
        if (cVar != null) {
            boolean z = false;
            C6431n.m37552e(t == cVar.f43089a, "Releasing the wrong instance");
            C6431n.m37568u(cVar.f43090b > 0, "Refcount has already reached zero");
            int i = cVar.f43090b - 1;
            cVar.f43090b = i;
            if (i == 0) {
                if (cVar.f43091c == null) {
                    z = true;
                }
                C6431n.m37568u(z, "Destroy task already scheduled");
                if (this.f43084c == null) {
                    this.f43084c = this.f43083b.mo35065a();
                }
                cVar.f43091c = this.f43084c.schedule(new C11159d1(new C11185b(cVar, dVar, t)), 1, TimeUnit.SECONDS);
            }
        } else {
            throw new IllegalArgumentException("No cached instance found for " + dVar);
        }
        return null;
    }
}
