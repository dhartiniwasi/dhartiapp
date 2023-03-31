package p264io.grpc.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import p182a7.C6431n;
import p343rc.C12367p;

/* renamed from: io.grpc.internal.w */
/* compiled from: ConnectivityStateManager */
final class C11381w {

    /* renamed from: a */
    private ArrayList<C11382a> f43651a = new ArrayList<>();

    /* renamed from: b */
    private volatile C12367p f43652b = C12367p.IDLE;

    /* renamed from: io.grpc.internal.w$a */
    /* compiled from: ConnectivityStateManager */
    private static final class C11382a {

        /* renamed from: a */
        final Runnable f43653a;

        /* renamed from: b */
        final Executor f43654b;

        C11382a(Runnable runnable, Executor executor) {
            this.f43653a = runnable;
            this.f43654b = executor;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo35374a() {
            this.f43654b.execute(this.f43653a);
        }
    }

    C11381w() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C12367p mo35371a() {
        C12367p pVar = this.f43652b;
        if (pVar != null) {
            return pVar;
        }
        throw new UnsupportedOperationException("Channel state API is not implemented");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo35372b(C12367p pVar) {
        C6431n.m37562o(pVar, "newState");
        if (this.f43652b != pVar && this.f43652b != C12367p.SHUTDOWN) {
            this.f43652b = pVar;
            if (!this.f43651a.isEmpty()) {
                ArrayList<C11382a> arrayList = this.f43651a;
                this.f43651a = new ArrayList<>();
                Iterator<C11382a> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().mo35374a();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo35373c(Runnable runnable, Executor executor, C12367p pVar) {
        C6431n.m37562o(runnable, "callback");
        C6431n.m37562o(executor, "executor");
        C6431n.m37562o(pVar, "source");
        C11382a aVar = new C11382a(runnable, executor);
        if (this.f43652b != pVar) {
            aVar.mo35374a();
        } else {
            this.f43651a.add(aVar);
        }
    }
}
