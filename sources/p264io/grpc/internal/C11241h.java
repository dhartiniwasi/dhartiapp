package p264io.grpc.internal;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;
import java.util.logging.Logger;
import p182a7.C6431n;

/* renamed from: io.grpc.internal.h */
/* compiled from: AtomicBackoff */
public final class C11241h {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final Logger f43272c = Logger.getLogger(C11241h.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final String f43273a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final AtomicLong f43274b;

    /* renamed from: io.grpc.internal.h$b */
    /* compiled from: AtomicBackoff */
    public final class C11243b {

        /* renamed from: a */
        private final long f43275a;

        /* renamed from: a */
        public void mo35183a() {
            long j = this.f43275a;
            long max = Math.max(2 * j, j);
            if (C11241h.this.f43274b.compareAndSet(this.f43275a, max)) {
                C11241h.f43272c.log(Level.WARNING, "Increased {0} to {1}", new Object[]{C11241h.this.f43273a, Long.valueOf(max)});
            }
        }

        /* renamed from: b */
        public long mo35184b() {
            return this.f43275a;
        }

        private C11243b(long j) {
            this.f43275a = j;
        }
    }

    public C11241h(String str, long j) {
        AtomicLong atomicLong = new AtomicLong();
        this.f43274b = atomicLong;
        C6431n.m37552e(j > 0, "value must be positive");
        this.f43273a = str;
        atomicLong.set(j);
    }

    /* renamed from: d */
    public C11243b mo35182d() {
        return new C11243b(this.f43274b.get());
    }
}
