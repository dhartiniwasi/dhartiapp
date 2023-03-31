package p252hd;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.C11669k;
import p243gd.C10340l;
import p243gd.C10346p;
import p344rd.C12439l;

/* renamed from: hd.r */
/* compiled from: _Collections.kt */
class C10530r extends C10529q {
    /* renamed from: A */
    public static final <T> List<T> m52975A(Collection<? extends T> collection) {
        C11669k.m56787e(collection, "<this>");
        return new ArrayList(collection);
    }

    /* renamed from: B */
    public static <T> Set<T> m52976B(Iterable<? extends T> iterable) {
        C11669k.m56787e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return C10518g0.m52944c((Set) m52991x(iterable, new LinkedHashSet()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return C10518g0.m52943b();
        }
        if (size != 1) {
            return (Set) m52991x(iterable, new LinkedHashSet(C10506a0.m52901b(collection.size())));
        }
        return C10516f0.m52941a(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    /* renamed from: C */
    public static <T, R> List<C10340l<T, R>> m52977C(Iterable<? extends T> iterable, Iterable<? extends R> iterable2) {
        C11669k.m56787e(iterable, "<this>");
        C11669k.m56787e(iterable2, "other");
        Iterator<? extends T> it = iterable.iterator();
        Iterator<? extends R> it2 = iterable2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(C10523k.m52973i(iterable, 10), C10523k.m52973i(iterable2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(C10346p.m52247a(it.next(), it2.next()));
        }
        return arrayList;
    }

    /* renamed from: k */
    public static <T> List<T> m52978k(Iterable<? extends T> iterable) {
        C11669k.m56787e(iterable, "<this>");
        return (List) m52979l(iterable, new ArrayList());
    }

    /* renamed from: l */
    public static final <C extends Collection<? super T>, T> C m52979l(Iterable<? extends T> iterable, C c) {
        C11669k.m56787e(iterable, "<this>");
        C11669k.m56787e(c, "destination");
        for (Object next : iterable) {
            if (next != null) {
                c.add(next);
            }
        }
        return c;
    }

    /* renamed from: m */
    public static <T> T m52980m(Iterable<? extends T> iterable) {
        C11669k.m56787e(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        return it.next();
    }

    /* renamed from: n */
    public static <T> T m52981n(List<? extends T> list) {
        C11669k.m56787e(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    /* renamed from: o */
    public static final <T, A extends Appendable> A m52982o(Iterable<? extends T> iterable, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C12439l<? super T, ? extends CharSequence> lVar) {
        C11669k.m56787e(iterable, "<this>");
        C11669k.m56787e(a, "buffer");
        C11669k.m56787e(charSequence, "separator");
        C11669k.m56787e(charSequence2, "prefix");
        C11669k.m56787e(charSequence3, "postfix");
        C11669k.m56787e(charSequence4, "truncated");
        a.append(charSequence2);
        int i2 = 0;
        for (Object next : iterable) {
            i2++;
            if (i2 > 1) {
                a.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            C13000f.m61245a(a, next, lVar);
        }
        if (i >= 0 && i2 > i) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    /* renamed from: p */
    public static /* synthetic */ Appendable m52983p(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C12439l lVar, int i2, Object obj) {
        String str = (i2 & 2) != 0 ? ", " : charSequence;
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (i2 & 4) != 0 ? charSequence5 : charSequence2;
        if ((i2 & 8) == 0) {
            charSequence5 = charSequence3;
        }
        return m52982o(iterable, appendable, str, charSequence6, charSequence5, (i2 & 16) != 0 ? -1 : i, (i2 & 32) != 0 ? "..." : charSequence4, (i2 & 64) != 0 ? null : lVar);
    }

    /* renamed from: q */
    public static final <T> String m52984q(Iterable<? extends T> iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C12439l<? super T, ? extends CharSequence> lVar) {
        C11669k.m56787e(iterable, "<this>");
        C11669k.m56787e(charSequence, "separator");
        C11669k.m56787e(charSequence2, "prefix");
        C11669k.m56787e(charSequence3, "postfix");
        C11669k.m56787e(charSequence4, "truncated");
        String sb = ((StringBuilder) m52982o(iterable, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, lVar)).toString();
        C11669k.m56786d(sb, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb;
    }

    /* renamed from: r */
    public static /* synthetic */ String m52985r(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C12439l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (i2 & 2) != 0 ? charSequence5 : charSequence2;
        if ((i2 & 4) == 0) {
            charSequence5 = charSequence3;
        }
        int i3 = (i2 & 8) != 0 ? -1 : i;
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i2 & 32) != 0) {
            lVar = null;
        }
        return m52984q(iterable, charSequence, charSequence6, charSequence5, i3, charSequence7, lVar);
    }

    /* renamed from: s */
    public static <T> T m52986s(List<? extends T> list) {
        C11669k.m56787e(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(C10522j.m52969e(list));
        }
        throw new NoSuchElementException("List is empty.");
    }

    /* renamed from: t */
    public static <T extends Comparable<? super T>> T m52987t(Iterable<? extends T> iterable) {
        C11669k.m56787e(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T t = (Comparable) it.next();
        while (it.hasNext()) {
            T t2 = (Comparable) it.next();
            if (t.compareTo(t2) > 0) {
                t = t2;
            }
        }
        return t;
    }

    /* renamed from: u */
    public static <T> T m52988u(Iterable<? extends T> iterable) {
        C11669k.m56787e(iterable, "<this>");
        if (iterable instanceof List) {
            return m52989v((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            if (!it.hasNext()) {
                return next;
            }
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    /* renamed from: v */
    public static final <T> T m52989v(List<? extends T> list) {
        C11669k.m56787e(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        } else if (size == 1) {
            return list.get(0);
        } else {
            throw new IllegalArgumentException("List has more than one element.");
        }
    }

    /* renamed from: w */
    public static <T> T m52990w(List<? extends T> list) {
        C11669k.m56787e(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    /* renamed from: x */
    public static final <T, C extends Collection<? super T>> C m52991x(Iterable<? extends T> iterable, C c) {
        C11669k.m56787e(iterable, "<this>");
        C11669k.m56787e(c, "destination");
        for (Object add : iterable) {
            c.add(add);
        }
        return c;
    }

    /* renamed from: y */
    public static <T> List<T> m52992y(Iterable<? extends T> iterable) {
        C11669k.m56787e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return C10522j.m52971g(m52993z(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return C10522j.m52968d();
        }
        if (size != 1) {
            return m52975A(collection);
        }
        return C10521i.m52966b(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    /* renamed from: z */
    public static final <T> List<T> m52993z(Iterable<? extends T> iterable) {
        C11669k.m56787e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return m52975A((Collection) iterable);
        }
        return (List) m52991x(iterable, new ArrayList());
    }
}
