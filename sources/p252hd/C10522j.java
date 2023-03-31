package p252hd;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C11669k;

/* renamed from: hd.j */
/* compiled from: Collections.kt */
class C10522j extends C10521i {
    /* renamed from: c */
    public static final <T> Collection<T> m52967c(T[] tArr) {
        C11669k.m56787e(tArr, "<this>");
        return new C10505a(tArr, false);
    }

    /* renamed from: d */
    public static <T> List<T> m52968d() {
        return C10532t.f41552a;
    }

    /* renamed from: e */
    public static <T> int m52969e(List<? extends T> list) {
        C11669k.m56787e(list, "<this>");
        return list.size() - 1;
    }

    /* renamed from: f */
    public static <T> List<T> m52970f(T... tArr) {
        C11669k.m56787e(tArr, "elements");
        return tArr.length > 0 ? C10513e.m52924a(tArr) : m52968d();
    }

    /* renamed from: g */
    public static <T> List<T> m52971g(List<? extends T> list) {
        C11669k.m56787e(list, "<this>");
        int size = list.size();
        if (size == 0) {
            return m52968d();
        }
        if (size != 1) {
            return list;
        }
        return C10521i.m52966b(list.get(0));
    }

    /* renamed from: h */
    public static void m52972h() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
