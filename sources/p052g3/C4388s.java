package p052g3;

import android.util.SparseArray;
import p161w3.C5940i0;

/* renamed from: g3.s */
/* compiled from: TimestampAdjusterProvider */
public final class C4388s {

    /* renamed from: a */
    private final SparseArray<C5940i0> f24480a = new SparseArray<>();

    /* renamed from: a */
    public C5940i0 mo17894a(int i) {
        C5940i0 i0Var = this.f24480a.get(i);
        if (i0Var != null) {
            return i0Var;
        }
        C5940i0 i0Var2 = new C5940i0(9223372036854775806L);
        this.f24480a.put(i, i0Var2);
        return i0Var2;
    }

    /* renamed from: b */
    public void mo17895b() {
        this.f24480a.clear();
    }
}
