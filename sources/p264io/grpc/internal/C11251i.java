package p264io.grpc.internal;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: io.grpc.internal.i */
/* compiled from: AtomicLongCounter */
final class C11251i implements C11168e1 {

    /* renamed from: a */
    private final AtomicLong f43319a = new AtomicLong();

    C11251i() {
    }

    /* renamed from: a */
    public void mo35039a(long j) {
        this.f43319a.getAndAdd(j);
    }
}
