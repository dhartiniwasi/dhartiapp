package p190b7;

import java.io.Serializable;
import p182a7.C6417f;
import p182a7.C6425j;
import p182a7.C6431n;

/* renamed from: b7.g */
/* compiled from: ByFunctionOrdering */
final class C6650g<F, T> extends C6653h0<F> implements Serializable {

    /* renamed from: a */
    final C6417f<F, ? extends T> f31131a;

    /* renamed from: b */
    final C6653h0<T> f31132b;

    C6650g(C6417f<F, ? extends T> fVar, C6653h0<T> h0Var) {
        this.f31131a = (C6417f) C6431n.m37561n(fVar);
        this.f31132b = (C6653h0) C6431n.m37561n(h0Var);
    }

    public int compare(F f, F f2) {
        return this.f31132b.compare(this.f31131a.apply(f), this.f31131a.apply(f2));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6650g)) {
            return false;
        }
        C6650g gVar = (C6650g) obj;
        if (!this.f31131a.equals(gVar.f31131a) || !this.f31132b.equals(gVar.f31132b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C6425j.m37542b(this.f31131a, this.f31132b);
    }

    public String toString() {
        String valueOf = String.valueOf(this.f31132b);
        String valueOf2 = String.valueOf(this.f31131a);
        StringBuilder sb = new StringBuilder(valueOf.length() + 13 + valueOf2.length());
        sb.append(valueOf);
        sb.append(".onResultOf(");
        sb.append(valueOf2);
        sb.append(")");
        return sb.toString();
    }
}
