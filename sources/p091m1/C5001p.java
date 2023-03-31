package p091m1;

import android.util.SparseArray;

/* renamed from: m1.p */
/* compiled from: QosTier */
public enum C5001p {
    DEFAULT(0),
    UNMETERED_ONLY(1),
    UNMETERED_OR_DAILY(2),
    FAST_IF_RADIO_AWAKE(3),
    NEVER(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: h */
    private static final SparseArray<C5001p> f26197h = null;

    /* renamed from: a */
    private final int f26199a;

    static {
        C5001p pVar;
        C5001p pVar2;
        C5001p pVar3;
        C5001p pVar4;
        C5001p pVar5;
        C5001p pVar6;
        SparseArray<C5001p> sparseArray = new SparseArray<>();
        f26197h = sparseArray;
        sparseArray.put(0, pVar);
        sparseArray.put(1, pVar2);
        sparseArray.put(2, pVar3);
        sparseArray.put(3, pVar4);
        sparseArray.put(4, pVar5);
        sparseArray.put(-1, pVar6);
    }

    private C5001p(int i) {
        this.f26199a = i;
    }
}
