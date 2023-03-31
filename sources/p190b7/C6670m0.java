package p190b7;

import java.io.Serializable;
import p182a7.C6431n;

/* renamed from: b7.m0 */
/* compiled from: ReverseNaturalOrdering */
final class C6670m0 extends C6653h0<Comparable<?>> implements Serializable {

    /* renamed from: a */
    static final C6670m0 f31164a = new C6670m0();

    private C6670m0() {
    }

    /* renamed from: d */
    public <S extends Comparable<?>> C6653h0<S> mo22416d() {
        return C6653h0.m38338b();
    }

    /* renamed from: e */
    public int compare(Comparable<?> comparable, Comparable<?> comparable2) {
        C6431n.m37561n(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public String toString() {
        return "Ordering.natural().reverse()";
    }
}
