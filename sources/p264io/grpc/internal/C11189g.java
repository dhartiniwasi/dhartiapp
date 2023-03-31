package p264io.grpc.internal;

import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Queue;
import p182a7.C6431n;
import p264io.grpc.internal.C11274k2;
import p264io.grpc.internal.C11281l1;

/* renamed from: io.grpc.internal.g */
/* compiled from: ApplicationThreadDeframerListener */
final class C11189g implements C11281l1.C11283b {

    /* renamed from: a */
    private final C11193d f43092a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C11281l1.C11283b f43093b;

    /* renamed from: c */
    private final Queue<InputStream> f43094c = new ArrayDeque();

    /* renamed from: io.grpc.internal.g$a */
    /* compiled from: ApplicationThreadDeframerListener */
    class C11190a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f43095a;

        C11190a(int i) {
            this.f43095a = i;
        }

        public void run() {
            C11189g.this.f43093b.mo35069d(this.f43095a);
        }
    }

    /* renamed from: io.grpc.internal.g$b */
    /* compiled from: ApplicationThreadDeframerListener */
    class C11191b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ boolean f43097a;

        C11191b(boolean z) {
            this.f43097a = z;
        }

        public void run() {
            C11189g.this.f43093b.mo34929c(this.f43097a);
        }
    }

    /* renamed from: io.grpc.internal.g$c */
    /* compiled from: ApplicationThreadDeframerListener */
    class C11192c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Throwable f43099a;

        C11192c(Throwable th) {
            this.f43099a = th;
        }

        public void run() {
            C11189g.this.f43093b.mo35070e(this.f43099a);
        }
    }

    /* renamed from: io.grpc.internal.g$d */
    /* compiled from: ApplicationThreadDeframerListener */
    public interface C11193d {
        /* renamed from: f */
        void mo35075f(Runnable runnable);
    }

    public C11189g(C11281l1.C11283b bVar, C11193d dVar) {
        this.f43093b = (C11281l1.C11283b) C6431n.m37562o(bVar, "listener");
        this.f43092a = (C11193d) C6431n.m37562o(dVar, "transportExecutor");
    }

    /* renamed from: a */
    public void mo35014a(C11274k2.C11275a aVar) {
        while (true) {
            InputStream next = aVar.next();
            if (next != null) {
                this.f43094c.add(next);
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    public void mo34929c(boolean z) {
        this.f43092a.mo35075f(new C11191b(z));
    }

    /* renamed from: d */
    public void mo35069d(int i) {
        this.f43092a.mo35075f(new C11190a(i));
    }

    /* renamed from: e */
    public void mo35070e(Throwable th) {
        this.f43092a.mo35075f(new C11192c(th));
    }

    /* renamed from: f */
    public InputStream mo35071f() {
        return this.f43094c.poll();
    }
}
