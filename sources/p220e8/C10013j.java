package p220e8;

import p211d8.C9907y;
import p246h7.C10428q;
import p247h8.C10432b;
import p405y8.C13088b0;

/* renamed from: e8.j */
/* compiled from: NumericIncrementTransformOperation */
public class C10013j implements C10019p {

    /* renamed from: a */
    private C13088b0 f39976a;

    public C10013j(C13088b0 b0Var) {
        C10432b.m52648d(C9907y.m50798A(b0Var), "NumericIncrementTransformOperation expects a NumberValue operand", new Object[0]);
        this.f39976a = b0Var;
    }

    /* renamed from: e */
    private double m51131e() {
        if (C9907y.m50826u(this.f39976a)) {
            return this.f39976a.mo38115q0();
        }
        if (C9907y.m50827v(this.f39976a)) {
            return (double) this.f39976a.mo38117s0();
        }
        throw C10432b.m52645a("Expected 'operand' to be of Number type, but was " + this.f39976a.getClass().getCanonicalName(), new Object[0]);
    }

    /* renamed from: f */
    private long m51132f() {
        if (C9907y.m50826u(this.f39976a)) {
            return (long) this.f39976a.mo38115q0();
        }
        if (C9907y.m50827v(this.f39976a)) {
            return this.f39976a.mo38117s0();
        }
        throw C10432b.m52645a("Expected 'operand' to be of Number type, but was " + this.f39976a.getClass().getCanonicalName(), new Object[0]);
    }

    /* renamed from: g */
    private long m51133g(long j, long j2) {
        long j3 = j + j2;
        return ((j ^ j3) & (j2 ^ j3)) >= 0 ? j3 : j3 >= 0 ? Long.MIN_VALUE : Long.MAX_VALUE;
    }

    /* renamed from: a */
    public C13088b0 mo32569a(C13088b0 b0Var, C10428q qVar) {
        C13088b0 b = mo32570b(b0Var);
        if (C9907y.m50827v(b) && C9907y.m50827v(this.f39976a)) {
            return (C13088b0) C13088b0.m61490y0().mo38130K(m51133g(b.mo38117s0(), m51132f())).build();
        } else if (C9907y.m50827v(b)) {
            return (C13088b0) C13088b0.m61490y0().mo38128I(((double) b.mo38117s0()) + m51131e()).build();
        } else {
            C10432b.m52648d(C9907y.m50826u(b), "Expected NumberValue to be of type DoubleValue, but was ", b0Var.getClass().getCanonicalName());
            return (C13088b0) C13088b0.m61490y0().mo38128I(b.mo38115q0() + m51131e()).build();
        }
    }

    /* renamed from: b */
    public C13088b0 mo32570b(C13088b0 b0Var) {
        return C9907y.m50798A(b0Var) ? b0Var : (C13088b0) C13088b0.m61490y0().mo38130K(0).build();
    }

    /* renamed from: c */
    public C13088b0 mo32571c(C13088b0 b0Var, C13088b0 b0Var2) {
        return b0Var2;
    }

    /* renamed from: d */
    public C13088b0 mo32624d() {
        return this.f39976a;
    }
}
