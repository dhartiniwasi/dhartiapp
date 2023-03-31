package p252hd;

import java.util.Set;
import kotlin.jvm.internal.C11669k;

/* renamed from: hd.g0 */
/* compiled from: Sets.kt */
class C10518g0 extends C10516f0 {
    /* renamed from: b */
    public static <T> Set<T> m52943b() {
        return C10534v.f41554a;
    }

    /* renamed from: c */
    public static final <T> Set<T> m52944c(Set<? extends T> set) {
        C11669k.m56787e(set, "<this>");
        int size = set.size();
        if (size == 0) {
            return m52943b();
        }
        if (size != 1) {
            return set;
        }
        return C10516f0.m52941a(set.iterator().next());
    }
}
