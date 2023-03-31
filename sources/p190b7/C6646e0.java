package p190b7;

import java.io.Serializable;
import p182a7.C6431n;

/* renamed from: b7.e0 */
/* compiled from: NaturalOrdering */
final class C6646e0 extends C6653h0<Comparable<?>> implements Serializable {

    /* renamed from: a */
    static final C6646e0 f31126a = new C6646e0();

    private C6646e0() {
    }

    /* renamed from: d */
    public <S extends Comparable<?>> C6653h0<S> mo22416d() {
        return C6670m0.f31164a;
    }

    /* renamed from: e */
    public int compare(Comparable<?> comparable, Comparable<?> comparable2) {
        C6431n.m37561n(comparable);
        C6431n.m37561n(comparable2);
        return comparable.compareTo(comparable2);
    }

    public String toString() {
        return "Ordering.natural()";
    }
}
