package p252hd;

import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C11669k;

/* renamed from: hd.z */
/* compiled from: MapWithDefault.kt */
class C10538z {
    /* renamed from: a */
    public static final <K, V> V m53018a(Map<K, ? extends V> map, K k) {
        C11669k.m56787e(map, "<this>");
        if (map instanceof C10536x) {
            return ((C10536x) map).mo33736a(k);
        }
        V v = map.get(k);
        if (v != null || map.containsKey(k)) {
            return v;
        }
        throw new NoSuchElementException("Key " + k + " is missing in the map.");
    }
}
