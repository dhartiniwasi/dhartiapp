package p247h8;

import java.util.Comparator;
import java.util.Map;

/* renamed from: h8.d0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C10437d0 implements Comparator {

    /* renamed from: a */
    public final /* synthetic */ Comparator f41375a;

    public /* synthetic */ C10437d0(Comparator comparator) {
        this.f41375a = comparator;
    }

    public final int compare(Object obj, Object obj2) {
        return this.f41375a.compare(((Map.Entry) obj).getValue(), ((Map.Entry) obj2).getValue());
    }
}
