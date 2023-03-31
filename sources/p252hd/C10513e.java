package p252hd;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.C11669k;

/* renamed from: hd.e */
/* compiled from: _ArraysJvm.kt */
class C10513e extends C10511d {
    /* renamed from: a */
    public static <T> List<T> m52924a(T[] tArr) {
        C11669k.m56787e(tArr, "<this>");
        List<T> a = C10517g.m52942a(tArr);
        C11669k.m56786d(a, "asList(this)");
        return a;
    }

    /* renamed from: b */
    public static final <T> T[] m52925b(T[] tArr, T[] tArr2, int i, int i2, int i3) {
        C11669k.m56787e(tArr, "<this>");
        C11669k.m56787e(tArr2, "destination");
        System.arraycopy(tArr, i2, tArr2, i, i3 - i2);
        return tArr2;
    }

    /* renamed from: c */
    public static /* synthetic */ Object[] m52926c(Object[] objArr, Object[] objArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = objArr.length;
        }
        return m52925b(objArr, objArr2, i, i2, i3);
    }

    /* renamed from: d */
    public static <T> void m52927d(T[] tArr, T t, int i, int i2) {
        C11669k.m56787e(tArr, "<this>");
        Arrays.fill(tArr, i, i2, t);
    }

    /* renamed from: e */
    public static /* synthetic */ void m52928e(Object[] objArr, Object obj, int i, int i2, int i3, Object obj2) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = objArr.length;
        }
        m52927d(objArr, obj, i, i2);
    }

    /* renamed from: f */
    public static final <T> void m52929f(T[] tArr, Comparator<? super T> comparator) {
        C11669k.m56787e(tArr, "<this>");
        C11669k.m56787e(comparator, "comparator");
        if (tArr.length > 1) {
            Arrays.sort(tArr, comparator);
        }
    }
}
