package p371uc;

import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: uc.l */
/* compiled from: Util */
public final class C12748l {

    /* renamed from: a */
    public static final String[] f46697a = new String[0];

    /* renamed from: b */
    public static final Charset f46698b = Charset.forName("UTF-8");

    /* renamed from: a */
    public static <T> List<T> m60428a(T[] tArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) tArr.clone()));
    }

    /* renamed from: b */
    private static <T> List<T> m60429b(T[] tArr, T[] tArr2) {
        ArrayList arrayList = new ArrayList();
        for (T t : tArr) {
            int length = tArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                T t2 = tArr2[i];
                if (t.equals(t2)) {
                    arrayList.add(t2);
                    break;
                }
                i++;
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public static <T> T[] m60430c(Class<T> cls, T[] tArr, T[] tArr2) {
        List b = m60429b(tArr, tArr2);
        return b.toArray((Object[]) Array.newInstance(cls, b.size()));
    }
}
