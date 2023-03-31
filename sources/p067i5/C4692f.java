package p067i5;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p124r.C5413a;
import p124r.C5415b;

/* renamed from: i5.f */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class C4692f {
    @Deprecated
    /* renamed from: a */
    public static <T> List<T> m30378a() {
        return Collections.emptyList();
    }

    @Deprecated
    /* renamed from: b */
    public static <T> List<T> m30379b(T t) {
        return Collections.singletonList(t);
    }

    @Deprecated
    /* renamed from: c */
    public static <T> List<T> m30380c(T... tArr) {
        int length = tArr.length;
        if (length == 0) {
            return m30378a();
        }
        if (length != 1) {
            return Collections.unmodifiableList(Arrays.asList(tArr));
        }
        return m30379b(tArr[0]);
    }

    /* renamed from: d */
    public static <K, V> Map<K, V> m30381d(K k, V v, K k2, V v2, K k3, V v3) {
        Map h = m30385h(3, false);
        h.put(k, v);
        h.put(k2, v2);
        h.put(k3, v3);
        return Collections.unmodifiableMap(h);
    }

    /* renamed from: e */
    public static <K, V> Map<K, V> m30382e(K[] kArr, V[] vArr) {
        int length = kArr.length;
        int length2 = vArr.length;
        if (length != length2) {
            throw new IllegalArgumentException("Key and values array lengths not equal: " + length + " != " + length2);
        } else if (length == 0) {
            return Collections.emptyMap();
        } else {
            if (length == 1) {
                return Collections.singletonMap(kArr[0], vArr[0]);
            }
            Map h = m30385h(length, false);
            for (int i = 0; i < kArr.length; i++) {
                h.put(kArr[i], vArr[i]);
            }
            return Collections.unmodifiableMap(h);
        }
    }

    @Deprecated
    /* renamed from: f */
    public static <T> Set<T> m30383f(T t, T t2, T t3) {
        Set i = m30386i(3, false);
        i.add(t);
        i.add(t2);
        i.add(t3);
        return Collections.unmodifiableSet(i);
    }

    @Deprecated
    /* renamed from: g */
    public static <T> Set<T> m30384g(T... tArr) {
        int length = tArr.length;
        if (length == 0) {
            return Collections.emptySet();
        }
        if (length == 1) {
            return Collections.singleton(tArr[0]);
        }
        if (length == 2) {
            T t = tArr[0];
            T t2 = tArr[1];
            Set i = m30386i(2, false);
            i.add(t);
            i.add(t2);
            return Collections.unmodifiableSet(i);
        } else if (length == 3) {
            return m30383f(tArr[0], tArr[1], tArr[2]);
        } else {
            if (length != 4) {
                Set i2 = m30386i(length, false);
                Collections.addAll(i2, tArr);
                return Collections.unmodifiableSet(i2);
            }
            T t3 = tArr[0];
            T t4 = tArr[1];
            T t5 = tArr[2];
            T t6 = tArr[3];
            Set i3 = m30386i(4, false);
            i3.add(t3);
            i3.add(t4);
            i3.add(t5);
            i3.add(t6);
            return Collections.unmodifiableSet(i3);
        }
    }

    /* renamed from: h */
    private static Map m30385h(int i, boolean z) {
        if (i <= 256) {
            return new C5413a(i);
        }
        return new HashMap(i, 1.0f);
    }

    /* renamed from: i */
    private static Set m30386i(int i, boolean z) {
        float f = true != z ? 1.0f : 0.75f;
        if (i <= (true != z ? 256 : 128)) {
            return new C5415b(i);
        }
        return new HashSet(i, f);
    }
}
