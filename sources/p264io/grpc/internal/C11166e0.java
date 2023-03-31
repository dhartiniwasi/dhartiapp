package p264io.grpc.internal;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import p182a7.C6431n;
import p264io.grpc.internal.C11269k;

/* renamed from: io.grpc.internal.e0 */
/* compiled from: ExponentialBackoffPolicy */
public final class C11166e0 implements C11269k {

    /* renamed from: a */
    private Random f43051a = new Random();

    /* renamed from: b */
    private long f43052b = TimeUnit.SECONDS.toNanos(1);

    /* renamed from: c */
    private long f43053c = TimeUnit.MINUTES.toNanos(2);

    /* renamed from: d */
    private double f43054d = 1.6d;

    /* renamed from: e */
    private double f43055e = 0.2d;

    /* renamed from: f */
    private long f43056f = this.f43052b;

    /* renamed from: io.grpc.internal.e0$a */
    /* compiled from: ExponentialBackoffPolicy */
    public static final class C11167a implements C11269k.C11270a {
        public C11269k get() {
            return new C11166e0();
        }
    }

    /* renamed from: b */
    private long m55235b(double d, double d2) {
        C6431n.m37551d(d2 >= d);
        return (long) ((this.f43051a.nextDouble() * (d2 - d)) + d);
    }

    /* renamed from: a */
    public long mo35037a() {
        long j = this.f43056f;
        double d = (double) j;
        this.f43056f = Math.min((long) (this.f43054d * d), this.f43053c);
        double d2 = this.f43055e;
        return j + m55235b((-d2) * d, d2 * d);
    }
}
