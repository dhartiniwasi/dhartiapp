package p252hd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C11669k;

/* renamed from: hd.f */
/* compiled from: _Arrays.kt */
class C10515f extends C10513e {
    /* renamed from: g */
    public static final <T> boolean m52931g(T[] tArr, T t) {
        C11669k.m56787e(tArr, "<this>");
        return m52934j(tArr, t) >= 0;
    }

    /* renamed from: h */
    public static <T> List<T> m52932h(T[] tArr) {
        C11669k.m56787e(tArr, "<this>");
        return (List) m52933i(tArr, new ArrayList());
    }

    /* renamed from: i */
    public static final <C extends Collection<? super T>, T> C m52933i(T[] tArr, C c) {
        C11669k.m56787e(tArr, "<this>");
        C11669k.m56787e(c, "destination");
        for (T t : tArr) {
            if (t != null) {
                c.add(t);
            }
        }
        return c;
    }

    /* renamed from: j */
    public static final <T> int m52934j(T[] tArr, T t) {
        C11669k.m56787e(tArr, "<this>");
        int i = 0;
        if (t == null) {
            int length = tArr.length;
            while (i < length) {
                if (tArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = tArr.length;
        while (i < length2) {
            if (C11669k.m56783a(t, tArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: k */
    public static char m52935k(char[] cArr) {
        C11669k.m56787e(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        } else if (length == 1) {
            return cArr[0];
        } else {
            throw new IllegalArgumentException("Array has more than one element.");
        }
    }

    /* renamed from: l */
    public static <T> T m52936l(T[] tArr) {
        C11669k.m56787e(tArr, "<this>");
        if (tArr.length == 1) {
            return tArr[0];
        }
        return null;
    }

    /* renamed from: m */
    public static final <T> T[] m52937m(T[] tArr, Comparator<? super T> comparator) {
        C11669k.m56787e(tArr, "<this>");
        C11669k.m56787e(comparator, "comparator");
        if (tArr.length == 0) {
            return tArr;
        }
        T[] copyOf = Arrays.copyOf(tArr, tArr.length);
        C11669k.m56786d(copyOf, "copyOf(this, size)");
        C10513e.m52929f(copyOf, comparator);
        return copyOf;
    }

    /* renamed from: n */
    public static <T> List<T> m52938n(T[] tArr, Comparator<? super T> comparator) {
        C11669k.m56787e(tArr, "<this>");
        C11669k.m56787e(comparator, "comparator");
        return C10513e.m52924a(m52937m(tArr, comparator));
    }

    /* renamed from: o */
    public static <T> List<T> m52939o(T[] tArr) {
        C11669k.m56787e(tArr, "<this>");
        int length = tArr.length;
        if (length == 0) {
            return C10522j.m52968d();
        }
        if (length != 1) {
            return m52940p(tArr);
        }
        return C10521i.m52966b(tArr[0]);
    }

    /* renamed from: p */
    public static final <T> List<T> m52940p(T[] tArr) {
        C11669k.m56787e(tArr, "<this>");
        return new ArrayList(C10522j.m52967c(tArr));
    }
}
