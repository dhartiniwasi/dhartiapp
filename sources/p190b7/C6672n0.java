package p190b7;

import java.io.Serializable;
import p182a7.C6431n;

/* renamed from: b7.n0 */
/* compiled from: ReverseOrdering */
final class C6672n0<T> extends C6653h0<T> implements Serializable {

    /* renamed from: a */
    final C6653h0<? super T> f31165a;

    C6672n0(C6653h0<? super T> h0Var) {
        this.f31165a = (C6653h0) C6431n.m37561n(h0Var);
    }

    public int compare(T t, T t2) {
        return this.f31165a.compare(t2, t);
    }

    /* renamed from: d */
    public <S extends T> C6653h0<S> mo22416d() {
        return this.f31165a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6672n0) {
            return this.f31165a.equals(((C6672n0) obj).f31165a);
        }
        return false;
    }

    public int hashCode() {
        return -this.f31165a.hashCode();
    }

    public String toString() {
        String valueOf = String.valueOf(this.f31165a);
        StringBuilder sb = new StringBuilder(valueOf.length() + 10);
        sb.append(valueOf);
        sb.append(".reverse()");
        return sb.toString();
    }
}
