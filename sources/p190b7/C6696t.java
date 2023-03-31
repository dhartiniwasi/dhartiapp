package p190b7;

import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import p182a7.C6431n;
import p182a7.C6432o;

/* renamed from: b7.t */
/* compiled from: Iterables */
public final class C6696t {
    /* renamed from: a */
    public static <T> boolean m38504a(Iterable<T> iterable, C6432o<? super T> oVar) {
        return C6698u.m38513b(iterable.iterator(), oVar);
    }

    /* renamed from: b */
    public static <T> T m38505b(Iterable<? extends T> iterable, T t) {
        return C6698u.m38522k(iterable.iterator(), t);
    }

    /* renamed from: c */
    public static <T> T m38506c(Iterable<T> iterable) {
        if (!(iterable instanceof List)) {
            return C6698u.m38520i(iterable.iterator());
        }
        List list = (List) iterable;
        if (!list.isEmpty()) {
            return m38508e(list);
        }
        throw new NoSuchElementException();
    }

    /* renamed from: d */
    public static <T> T m38507d(Iterable<? extends T> iterable, T t) {
        if (iterable instanceof Collection) {
            if (((Collection) iterable).isEmpty()) {
                return t;
            }
            if (iterable instanceof List) {
                return m38508e(C6703w.m38530a(iterable));
            }
        }
        return C6698u.m38521j(iterable.iterator(), t);
    }

    /* renamed from: e */
    private static <T> T m38508e(List<T> list) {
        return list.get(list.size() - 1);
    }

    /* renamed from: f */
    public static <T> boolean m38509f(Iterable<T> iterable, C6432o<? super T> oVar) {
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            return C6698u.m38526o(iterable.iterator(), oVar);
        }
        return m38510g((List) iterable, (C6432o) C6431n.m37561n(oVar));
    }

    /* renamed from: g */
    private static <T> boolean m38510g(List<T> list, C6432o<? super T> oVar) {
        int i = 0;
        int i2 = 0;
        while (i < list.size()) {
            T t = list.get(i);
            if (!oVar.apply(t)) {
                if (i > i2) {
                    try {
                        list.set(i2, t);
                    } catch (UnsupportedOperationException unused) {
                        m38511h(list, oVar, i2, i);
                        return true;
                    } catch (IllegalArgumentException unused2) {
                        m38511h(list, oVar, i2, i);
                        return true;
                    }
                }
                i2++;
            }
            i++;
        }
        list.subList(i2, list.size()).clear();
        if (i != i2) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    private static <T> void m38511h(List<T> list, C6432o<? super T> oVar, int i, int i2) {
        for (int size = list.size() - 1; size > i2; size--) {
            if (oVar.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            list.remove(i3);
        }
    }
}
