package kotlinx.coroutines.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C11665g;
import p410yd.C13330n0;

/* renamed from: kotlinx.coroutines.internal.m */
/* compiled from: InlineList.kt */
public final class C11714m<E> {
    /* renamed from: a */
    public static <E> Object m56925a(Object obj) {
        return obj;
    }

    /* renamed from: b */
    public static /* synthetic */ Object m56926b(Object obj, int i, C11665g gVar) {
        if ((i & 1) != 0) {
            obj = null;
        }
        return m56925a(obj);
    }

    /* renamed from: c */
    public static final Object m56927c(Object obj, E e) {
        if (C13330n0.m62281a() && !(!(e instanceof List))) {
            throw new AssertionError();
        } else if (obj == null) {
            return m56925a(e);
        } else {
            if (obj instanceof ArrayList) {
                ((ArrayList) obj).add(e);
                return m56925a(obj);
            }
            ArrayList arrayList = new ArrayList(4);
            arrayList.add(obj);
            arrayList.add(e);
            return m56925a(arrayList);
        }
    }
}
