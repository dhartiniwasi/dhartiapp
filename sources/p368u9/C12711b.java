package p368u9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p358t9.C12553a;

/* renamed from: u9.b */
/* compiled from: BarcodeValue */
final class C12711b {

    /* renamed from: a */
    private final Map<Integer, Integer> f46484a = new HashMap();

    C12711b() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int[] mo37585a() {
        ArrayList arrayList = new ArrayList();
        int i = -1;
        for (Map.Entry next : this.f46484a.entrySet()) {
            if (((Integer) next.getValue()).intValue() > i) {
                i = ((Integer) next.getValue()).intValue();
                arrayList.clear();
                arrayList.add(next.getKey());
            } else if (((Integer) next.getValue()).intValue() == i) {
                arrayList.add(next.getKey());
            }
        }
        return C12553a.m59749b(arrayList);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo37586b(int i) {
        Integer num = this.f46484a.get(Integer.valueOf(i));
        if (num == null) {
            num = 0;
        }
        this.f46484a.put(Integer.valueOf(i), Integer.valueOf(num.intValue() + 1));
    }
}
