package p252hd;

import java.util.Collection;
import kotlin.jvm.internal.C11669k;

/* renamed from: hd.k */
/* compiled from: Iterables.kt */
class C10523k extends C10522j {
    /* renamed from: i */
    public static <T> int m52973i(Iterable<? extends T> iterable, int i) {
        C11669k.m56787e(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i;
    }
}
