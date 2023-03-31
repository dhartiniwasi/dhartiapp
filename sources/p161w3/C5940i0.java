package p161w3;

/* renamed from: w3.i0 */
/* compiled from: TimestampAdjuster */
public final class C5940i0 {

    /* renamed from: a */
    private long f29090a;

    /* renamed from: b */
    private long f29091b;

    /* renamed from: c */
    private long f29092c;

    /* renamed from: d */
    private final ThreadLocal<Long> f29093d = new ThreadLocal<>();

    public C5940i0(long j) {
        mo20626g(j);
    }

    /* renamed from: f */
    public static long m35024f(long j) {
        return (j * 1000000) / 90000;
    }

    /* renamed from: i */
    public static long m35025i(long j) {
        return (j * 90000) / 1000000;
    }

    /* renamed from: j */
    public static long m35026j(long j) {
        return m35025i(j) % 8589934592L;
    }

    /* renamed from: a */
    public synchronized long mo20621a(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.f29091b == -9223372036854775807L) {
            long j2 = this.f29090a;
            if (j2 == 9223372036854775806L) {
                j2 = ((Long) C5917a.m34872e(this.f29093d.get())).longValue();
            }
            this.f29091b = j2 - j;
            notifyAll();
        }
        this.f29092c = j;
        return j + this.f29091b;
    }

    /* renamed from: b */
    public synchronized long mo20622b(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j2 = this.f29092c;
        if (j2 != -9223372036854775807L) {
            long i = m35025i(j2);
            long j3 = (4294967296L + i) / 8589934592L;
            long j4 = ((j3 - 1) * 8589934592L) + j;
            j += j3 * 8589934592L;
            if (Math.abs(j4 - i) < Math.abs(j - i)) {
                j = j4;
            }
        }
        return mo20621a(m35024f(j));
    }

    /* renamed from: c */
    public synchronized long mo20623c() {
        long j;
        j = this.f29090a;
        if (j == Long.MAX_VALUE || j == 9223372036854775806L) {
            j = -9223372036854775807L;
        }
        return j;
    }

    /* renamed from: d */
    public synchronized long mo20624d() {
        long j;
        long j2 = this.f29092c;
        if (j2 != -9223372036854775807L) {
            j = j2 + this.f29091b;
        } else {
            j = mo20623c();
        }
        return j;
    }

    /* renamed from: e */
    public synchronized long mo20625e() {
        return this.f29091b;
    }

    /* renamed from: g */
    public synchronized void mo20626g(long j) {
        this.f29090a = j;
        this.f29091b = j == Long.MAX_VALUE ? 0 : -9223372036854775807L;
        this.f29092c = -9223372036854775807L;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0036, code lost:
        return;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo20627h(boolean r6, long r7) throws java.lang.InterruptedException {
        /*
            r5 = this;
            monitor-enter(r5)
            long r0 = r5.f29090a     // Catch:{ all -> 0x0037 }
            r2 = 9223372036854775806(0x7ffffffffffffffe, double:NaN)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x000e
            r0 = 1
            goto L_0x000f
        L_0x000e:
            r0 = 0
        L_0x000f:
            p161w3.C5917a.m34873f(r0)     // Catch:{ all -> 0x0037 }
            long r0 = r5.f29091b     // Catch:{ all -> 0x0037 }
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x001f
            monitor-exit(r5)
            return
        L_0x001f:
            if (r6 == 0) goto L_0x002b
            java.lang.ThreadLocal<java.lang.Long> r6 = r5.f29093d     // Catch:{ all -> 0x0037 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0037 }
            r6.set(r7)     // Catch:{ all -> 0x0037 }
            goto L_0x0035
        L_0x002b:
            long r6 = r5.f29091b     // Catch:{ all -> 0x0037 }
            int r8 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r8 != 0) goto L_0x0035
            r5.wait()     // Catch:{ all -> 0x0037 }
            goto L_0x002b
        L_0x0035:
            monitor-exit(r5)
            return
        L_0x0037:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p161w3.C5940i0.mo20627h(boolean, long):void");
    }
}
