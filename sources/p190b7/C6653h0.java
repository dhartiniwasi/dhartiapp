package p190b7;

import java.util.Comparator;
import p182a7.C6417f;

/* renamed from: b7.h0 */
/* compiled from: Ordering */
public abstract class C6653h0<T> implements Comparator<T> {
    protected C6653h0() {
    }

    /* renamed from: a */
    public static <T> C6653h0<T> m38337a(Comparator<T> comparator) {
        if (comparator instanceof C6653h0) {
            return (C6653h0) comparator;
        }
        return new C6657j(comparator);
    }

    /* renamed from: b */
    public static <C extends Comparable> C6653h0<C> m38338b() {
        return C6646e0.f31126a;
    }

    /* renamed from: c */
    public <F> C6653h0<F> mo22430c(C6417f<F, ? extends T> fVar) {
        return new C6650g(fVar, this);
    }

    public abstract int compare(T t, T t2);

    /* renamed from: d */
    public <S extends T> C6653h0<S> mo22416d() {
        return new C6672n0(this);
    }
}
