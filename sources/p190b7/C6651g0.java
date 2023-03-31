package p190b7;

/* renamed from: b7.g0 */
/* compiled from: ObjectArrays */
public final class C6651g0 {
    /* renamed from: a */
    static Object m38330a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        StringBuilder sb = new StringBuilder(20);
        sb.append("at index ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    /* renamed from: b */
    static Object[] m38331b(Object... objArr) {
        m38332c(objArr, objArr.length);
        return objArr;
    }

    /* renamed from: c */
    static Object[] m38332c(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            m38330a(objArr[i2], i2);
        }
        return objArr;
    }

    /* renamed from: d */
    public static <T> T[] m38333d(T[] tArr, int i) {
        return C6656i0.m38345b(tArr, i);
    }
}
