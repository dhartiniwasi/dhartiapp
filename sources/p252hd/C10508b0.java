package p252hd;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C11669k;
import p243gd.C10340l;

/* renamed from: hd.b0 */
/* compiled from: Maps.kt */
class C10508b0 extends C10506a0 {
    /* renamed from: e */
    public static <K, V> Map<K, V> m52913e() {
        C10533u uVar = C10533u.f41553a;
        C11669k.m56785c(uVar, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return uVar;
    }

    /* renamed from: f */
    public static <K, V> V m52914f(Map<K, ? extends V> map, K k) {
        C11669k.m56787e(map, "<this>");
        return C10538z.m53018a(map, k);
    }

    /* renamed from: g */
    public static <K, V> Map<K, V> m52915g(C10340l<? extends K, ? extends V>... lVarArr) {
        C11669k.m56787e(lVarArr, "pairs");
        return lVarArr.length > 0 ? m52922n(lVarArr, new LinkedHashMap(C10506a0.m52901b(lVarArr.length))) : m52913e();
    }

    /* renamed from: h */
    public static final <K, V> Map<K, V> m52916h(Map<K, ? extends V> map) {
        C11669k.m56787e(map, "<this>");
        int size = map.size();
        if (size == 0) {
            return m52913e();
        }
        if (size != 1) {
            return map;
        }
        return C10506a0.m52903d(map);
    }

    /* renamed from: i */
    public static final <K, V> void m52917i(Map<? super K, ? super V> map, Iterable<? extends C10340l<? extends K, ? extends V>> iterable) {
        C11669k.m56787e(map, "<this>");
        C11669k.m56787e(iterable, "pairs");
        for (C10340l lVar : iterable) {
            map.put(lVar.mo33173a(), lVar.mo33174b());
        }
    }

    /* renamed from: j */
    public static final <K, V> void m52918j(Map<? super K, ? super V> map, C10340l<? extends K, ? extends V>[] lVarArr) {
        C11669k.m56787e(map, "<this>");
        C11669k.m56787e(lVarArr, "pairs");
        for (C10340l<? extends K, ? extends V> lVar : lVarArr) {
            map.put(lVar.mo33173a(), lVar.mo33174b());
        }
    }

    /* renamed from: k */
    public static <K, V> Map<K, V> m52919k(Iterable<? extends C10340l<? extends K, ? extends V>> iterable) {
        C11669k.m56787e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return m52916h(m52920l(iterable, new LinkedHashMap()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return m52913e();
        }
        if (size != 1) {
            return m52920l(iterable, new LinkedHashMap(C10506a0.m52901b(collection.size())));
        }
        return C10506a0.m52902c((C10340l) (iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next()));
    }

    /* renamed from: l */
    public static final <K, V, M extends Map<? super K, ? super V>> M m52920l(Iterable<? extends C10340l<? extends K, ? extends V>> iterable, M m) {
        C11669k.m56787e(iterable, "<this>");
        C11669k.m56787e(m, "destination");
        m52917i(m, iterable);
        return m;
    }

    /* renamed from: m */
    public static <K, V> Map<K, V> m52921m(Map<? extends K, ? extends V> map) {
        C11669k.m56787e(map, "<this>");
        int size = map.size();
        if (size == 0) {
            return m52913e();
        }
        if (size != 1) {
            return m52923o(map);
        }
        return C10506a0.m52903d(map);
    }

    /* renamed from: n */
    public static final <K, V, M extends Map<? super K, ? super V>> M m52922n(C10340l<? extends K, ? extends V>[] lVarArr, M m) {
        C11669k.m56787e(lVarArr, "<this>");
        C11669k.m56787e(m, "destination");
        m52918j(m, lVarArr);
        return m;
    }

    /* renamed from: o */
    public static final <K, V> Map<K, V> m52923o(Map<? extends K, ? extends V> map) {
        C11669k.m56787e(map, "<this>");
        return new LinkedHashMap(map);
    }
}
