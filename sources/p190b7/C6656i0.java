package p190b7;

import java.lang.reflect.Array;
import java.util.Arrays;

/* renamed from: b7.i0 */
/* compiled from: Platform */
final class C6656i0 {
    /* renamed from: a */
    static <T> T[] m38344a(Object[] objArr, int i, int i2, T[] tArr) {
        return Arrays.copyOfRange(objArr, i, i2, tArr.getClass());
    }

    /* renamed from: b */
    static <T> T[] m38345b(T[] tArr, int i) {
        return (Object[]) Array.newInstance(tArr.getClass().getComponentType(), i);
    }
}
