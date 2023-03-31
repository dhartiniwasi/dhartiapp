package p264io.grpc.internal;

import java.util.Set;
import p182a7.C6419h;
import p182a7.C6425j;
import p190b7.C6694s;
import p343rc.C12335j1;

/* renamed from: io.grpc.internal.t0 */
/* compiled from: HedgingPolicy */
final class C11360t0 {

    /* renamed from: a */
    final int f43613a;

    /* renamed from: b */
    final long f43614b;

    /* renamed from: c */
    final Set<C12335j1.C12337b> f43615c;

    C11360t0(int i, long j, Set<C12335j1.C12337b> set) {
        this.f43613a = i;
        this.f43614b = j;
        this.f43615c = C6694s.m38493r(set);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C11360t0.class != obj.getClass()) {
            return false;
        }
        C11360t0 t0Var = (C11360t0) obj;
        if (this.f43613a == t0Var.f43613a && this.f43614b == t0Var.f43614b && C6425j.m37541a(this.f43615c, t0Var.f43615c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C6425j.m37542b(Integer.valueOf(this.f43613a), Long.valueOf(this.f43614b), this.f43615c);
    }

    public String toString() {
        return C6419h.m37528c(this).mo21840b("maxAttempts", this.f43613a).mo21841c("hedgingDelayNanos", this.f43614b).mo21842d("nonFatalStatusCodes", this.f43615c).toString();
    }
}
