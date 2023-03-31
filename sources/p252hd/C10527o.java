package p252hd;

import java.util.Collection;
import kotlin.jvm.internal.C11669k;

/* renamed from: hd.o */
/* compiled from: MutableCollections.kt */
class C10527o extends C10526n {
    /* renamed from: j */
    public static <T> boolean m52974j(Collection<? super T> collection, Iterable<? extends T> iterable) {
        C11669k.m56787e(collection, "<this>");
        C11669k.m56787e(iterable, "elements");
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        boolean z = false;
        for (Object add : iterable) {
            if (collection.add(add)) {
                z = true;
            }
        }
        return z;
    }
}
