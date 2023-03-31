package p264io.grpc.internal;

import p182a7.C6425j;
import p182a7.C6431n;
import p343rc.C12292c;
import p343rc.C12376r0;
import p343rc.C12411y0;
import p343rc.C12423z0;

/* renamed from: io.grpc.internal.t1 */
/* compiled from: PickSubchannelArgsImpl */
public final class C11361t1 extends C12376r0.C12383f {

    /* renamed from: a */
    private final C12292c f43616a;

    /* renamed from: b */
    private final C12411y0 f43617b;

    /* renamed from: c */
    private final C12423z0<?, ?> f43618c;

    public C11361t1(C12423z0<?, ?> z0Var, C12411y0 y0Var, C12292c cVar) {
        this.f43618c = (C12423z0) C6431n.m37562o(z0Var, "method");
        this.f43617b = (C12411y0) C6431n.m37562o(y0Var, "headers");
        this.f43616a = (C12292c) C6431n.m37562o(cVar, "callOptions");
    }

    /* renamed from: a */
    public C12292c mo35344a() {
        return this.f43616a;
    }

    /* renamed from: b */
    public C12411y0 mo35345b() {
        return this.f43617b;
    }

    /* renamed from: c */
    public C12423z0<?, ?> mo35346c() {
        return this.f43618c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C11361t1.class != obj.getClass()) {
            return false;
        }
        C11361t1 t1Var = (C11361t1) obj;
        if (!C6425j.m37541a(this.f43616a, t1Var.f43616a) || !C6425j.m37541a(this.f43617b, t1Var.f43617b) || !C6425j.m37541a(this.f43618c, t1Var.f43618c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C6425j.m37542b(this.f43616a, this.f43617b, this.f43618c);
    }

    public final String toString() {
        return "[method=" + this.f43618c + " headers=" + this.f43617b + " callOptions=" + this.f43616a + "]";
    }
}
