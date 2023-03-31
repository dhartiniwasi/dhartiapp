package p252hd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.C11669k;

/* renamed from: hd.i */
/* compiled from: CollectionsJVM.kt */
class C10521i {
    /* renamed from: a */
    public static final <T> Object[] m52965a(T[] tArr, boolean z) {
        Class<Object[]> cls = Object[].class;
        C11669k.m56787e(tArr, "<this>");
        if (z && C11669k.m56783a(tArr.getClass(), cls)) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length, cls);
        C11669k.m56786d(copyOf, "copyOf(this, this.size, Array<Any?>::class.java)");
        return copyOf;
    }

    /* renamed from: b */
    public static <T> List<T> m52966b(T t) {
        List<T> singletonList = Collections.singletonList(t);
        C11669k.m56786d(singletonList, "singletonList(element)");
        return singletonList;
    }
}
