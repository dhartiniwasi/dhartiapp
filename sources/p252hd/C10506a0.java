package p252hd;

import java.util.Collections;
import java.util.Map;
import kotlin.jvm.internal.C11669k;
import p243gd.C10340l;

/* renamed from: hd.a0 */
/* compiled from: MapsJVM.kt */
class C10506a0 extends C10538z {
    /* renamed from: b */
    public static int m52901b(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((((float) i) / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: c */
    public static final <K, V> Map<K, V> m52902c(C10340l<? extends K, ? extends V> lVar) {
        C11669k.m56787e(lVar, "pair");
        Map<K, V> singletonMap = Collections.singletonMap(lVar.mo33175c(), lVar.mo33176d());
        C11669k.m56786d(singletonMap, "singletonMap(pair.first, pair.second)");
        return singletonMap;
    }

    /* renamed from: d */
    public static final <K, V> Map<K, V> m52903d(Map<? extends K, ? extends V> map) {
        C11669k.m56787e(map, "<this>");
        Map.Entry next = map.entrySet().iterator().next();
        Map<K, V> singletonMap = Collections.singletonMap(next.getKey(), next.getValue());
        C11669k.m56786d(singletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        return singletonMap;
    }
}
