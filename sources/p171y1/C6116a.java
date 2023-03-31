package p171y1;

import android.util.SparseArray;
import java.util.HashMap;
import p084l1.C4904d;

/* renamed from: y1.a */
/* compiled from: PriorityMapping */
public final class C6116a {

    /* renamed from: a */
    private static SparseArray<C4904d> f29516a = new SparseArray<>();

    /* renamed from: b */
    private static HashMap<C4904d, Integer> f29517b;

    static {
        HashMap<C4904d, Integer> hashMap = new HashMap<>();
        f29517b = hashMap;
        hashMap.put(C4904d.DEFAULT, 0);
        f29517b.put(C4904d.VERY_LOW, 1);
        f29517b.put(C4904d.HIGHEST, 2);
        for (C4904d next : f29517b.keySet()) {
            f29516a.append(f29517b.get(next).intValue(), next);
        }
    }

    /* renamed from: a */
    public static int m35764a(C4904d dVar) {
        Integer num = f29517b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    /* renamed from: b */
    public static C4904d m35765b(int i) {
        C4904d dVar = f29516a.get(i);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i);
    }
}
