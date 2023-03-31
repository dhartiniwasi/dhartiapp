package p190b7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p182a7.C6425j;
import p182a7.C6431n;
import p219e7.C9998d;

/* renamed from: b7.w */
/* compiled from: Lists */
public final class C6703w {
    /* renamed from: a */
    static <T> List<T> m38530a(Iterable<T> iterable) {
        return (List) iterable;
    }

    /* renamed from: b */
    static int m38531b(int i) {
        C6652h.m38335b(i, "arraySize");
        return C9998d.m51075j(((long) i) + 5 + ((long) (i / 10)));
    }

    /* renamed from: c */
    static boolean m38532c(List<?> list, Object obj) {
        if (obj == C6431n.m37561n(list)) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list2 = (List) obj;
        int size = list.size();
        if (size != list2.size()) {
            return false;
        }
        if (!(list instanceof RandomAccess) || !(list2 instanceof RandomAccess)) {
            return C6698u.m38516e(list.iterator(), list2.iterator());
        }
        for (int i = 0; i < size; i++) {
            if (!C6425j.m37541a(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    static int m38533d(List<?> list, Object obj) {
        if (list instanceof RandomAccess) {
            return m38534e(list, obj);
        }
        ListIterator<?> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (C6425j.m37541a(obj, listIterator.next())) {
                return listIterator.previousIndex();
            }
        }
        return -1;
    }

    /* renamed from: e */
    private static int m38534e(List<?> list, Object obj) {
        int size = list.size();
        int i = 0;
        if (obj == null) {
            while (i < size) {
                if (list.get(i) == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        while (i < size) {
            if (obj.equals(list.get(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: f */
    static int m38535f(List<?> list, Object obj) {
        if (list instanceof RandomAccess) {
            return m38536g(list, obj);
        }
        ListIterator<?> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (C6425j.m37541a(obj, listIterator.previous())) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    /* renamed from: g */
    private static int m38536g(List<?> list, Object obj) {
        if (obj == null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                if (list.get(size) == null) {
                    return size;
                }
            }
            return -1;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            if (obj.equals(list.get(size2))) {
                return size2;
            }
        }
        return -1;
    }

    /* renamed from: h */
    public static <E> ArrayList<E> m38537h() {
        return new ArrayList<>();
    }

    /* renamed from: i */
    public static <E> ArrayList<E> m38538i(Iterator<? extends E> it) {
        ArrayList<E> h = m38537h();
        C6698u.m38512a(h, it);
        return h;
    }

    @SafeVarargs
    /* renamed from: j */
    public static <E> ArrayList<E> m38539j(E... eArr) {
        C6431n.m37561n(eArr);
        ArrayList<E> arrayList = new ArrayList<>(m38531b(eArr.length));
        Collections.addAll(arrayList, eArr);
        return arrayList;
    }
}
