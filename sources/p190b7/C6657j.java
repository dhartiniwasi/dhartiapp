package p190b7;

import java.io.Serializable;
import java.util.Comparator;
import p182a7.C6431n;

/* renamed from: b7.j */
/* compiled from: ComparatorOrdering */
final class C6657j<T> extends C6653h0<T> implements Serializable {

    /* renamed from: a */
    final Comparator<T> f31135a;

    C6657j(Comparator<T> comparator) {
        this.f31135a = (Comparator) C6431n.m37561n(comparator);
    }

    public int compare(T t, T t2) {
        return this.f31135a.compare(t, t2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6657j) {
            return this.f31135a.equals(((C6657j) obj).f31135a);
        }
        return false;
    }

    public int hashCode() {
        return this.f31135a.hashCode();
    }

    public String toString() {
        return this.f31135a.toString();
    }
}
