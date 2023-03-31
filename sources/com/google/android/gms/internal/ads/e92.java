package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class e92 {

    /* renamed from: a */
    private long f8704a;

    /* renamed from: b */
    private long f8705b;

    /* renamed from: c */
    private long f8706c;

    /* renamed from: d */
    private final ThreadLocal f8707d = new ThreadLocal();

    public e92(long j) {
        mo9836f(0);
    }

    /* renamed from: a */
    public final synchronized long mo9831a(long j) {
        if (this.f8705b == -9223372036854775807L) {
            long j2 = this.f8704a;
            if (j2 == 9223372036854775806L) {
                Long l = (Long) this.f8707d.get();
                Objects.requireNonNull(l);
                j2 = l.longValue();
            }
            this.f8705b = j2 - j;
            notifyAll();
        }
        this.f8706c = j;
        return j + this.f8705b;
    }

    /* renamed from: b */
    public final synchronized long mo9832b(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j2 = this.f8706c;
        if (j2 != -9223372036854775807L) {
            long j3 = (j2 * 90000) / 1000000;
            long j4 = (4294967296L + j3) / 8589934592L;
            long j5 = ((-1 + j4) * 8589934592L) + j;
            j += j4 * 8589934592L;
            if (Math.abs(j5 - j3) < Math.abs(j - j3)) {
                j = j5;
            }
        }
        return mo9831a((j * 1000000) / 90000);
    }

    /* renamed from: c */
    public final synchronized long mo9833c() {
        long j = this.f8704a;
        if (j == Long.MAX_VALUE || j == 9223372036854775806L) {
            return -9223372036854775807L;
        }
        return j;
    }

    /* renamed from: d */
    public final synchronized long mo9834d() {
        long j;
        j = this.f8706c;
        return j != -9223372036854775807L ? j + this.f8705b : mo9833c();
    }

    /* renamed from: e */
    public final synchronized long mo9835e() {
        return this.f8705b;
    }

    /* renamed from: f */
    public final synchronized void mo9836f(long j) {
        this.f8704a = j;
        this.f8705b = j == Long.MAX_VALUE ? 0 : -9223372036854775807L;
        this.f8706c = -9223372036854775807L;
    }
}
