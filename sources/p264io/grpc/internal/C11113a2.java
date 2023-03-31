package p264io.grpc.internal;

import java.util.Set;
import p182a7.C6419h;
import p182a7.C6425j;
import p190b7.C6694s;
import p343rc.C12335j1;

/* renamed from: io.grpc.internal.a2 */
/* compiled from: RetryPolicy */
final class C11113a2 {

    /* renamed from: a */
    final int f42910a;

    /* renamed from: b */
    final long f42911b;

    /* renamed from: c */
    final long f42912c;

    /* renamed from: d */
    final double f42913d;

    /* renamed from: e */
    final Long f42914e;

    /* renamed from: f */
    final Set<C12335j1.C12337b> f42915f;

    C11113a2(int i, long j, long j2, double d, Long l, Set<C12335j1.C12337b> set) {
        this.f42910a = i;
        this.f42911b = j;
        this.f42912c = j2;
        this.f42913d = d;
        this.f42914e = l;
        this.f42915f = C6694s.m38493r(set);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C11113a2)) {
            return false;
        }
        C11113a2 a2Var = (C11113a2) obj;
        if (this.f42910a == a2Var.f42910a && this.f42911b == a2Var.f42911b && this.f42912c == a2Var.f42912c && Double.compare(this.f42913d, a2Var.f42913d) == 0 && C6425j.m37541a(this.f42914e, a2Var.f42914e) && C6425j.m37541a(this.f42915f, a2Var.f42915f)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C6425j.m37542b(Integer.valueOf(this.f42910a), Long.valueOf(this.f42911b), Long.valueOf(this.f42912c), Double.valueOf(this.f42913d), this.f42914e, this.f42915f);
    }

    public String toString() {
        return C6419h.m37528c(this).mo21840b("maxAttempts", this.f42910a).mo21841c("initialBackoffNanos", this.f42911b).mo21841c("maxBackoffNanos", this.f42912c).mo21839a("backoffMultiplier", this.f42913d).mo21842d("perAttemptRecvTimeoutNanos", this.f42914e).mo21842d("retryableStatusCodes", this.f42915f).toString();
    }
}
