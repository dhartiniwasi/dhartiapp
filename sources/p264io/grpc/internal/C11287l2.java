package p264io.grpc.internal;

import java.util.concurrent.TimeUnit;

/* renamed from: io.grpc.internal.l2 */
/* compiled from: TimeProvider */
public interface C11287l2 {

    /* renamed from: a */
    public static final C11287l2 f43399a = new C11288a();

    /* renamed from: io.grpc.internal.l2$a */
    /* compiled from: TimeProvider */
    class C11288a implements C11287l2 {
        C11288a() {
        }

        /* renamed from: a */
        public long mo35246a() {
            return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        }
    }

    /* renamed from: a */
    long mo35246a();
}
