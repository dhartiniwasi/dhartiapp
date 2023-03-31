package p264io.grpc.internal;

import p343rc.C12372r;

/* renamed from: io.grpc.internal.x */
/* compiled from: ContextRunnable */
abstract class C11388x implements Runnable {

    /* renamed from: a */
    private final C12372r f43662a;

    protected C11388x(C12372r rVar) {
        this.f43662a = rVar;
    }

    /* renamed from: a */
    public abstract void mo35109a();

    public final void run() {
        C12372r b = this.f43662a.mo37086b();
        try {
            mo35109a();
        } finally {
            this.f43662a.mo37088f(b);
        }
    }
}
