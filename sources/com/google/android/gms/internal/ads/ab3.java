package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class ab3 {
    /* renamed from: a */
    public static boolean m9674a(Iterable iterable, c83 c83) {
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            Iterator it = iterable.iterator();
            Objects.requireNonNull(c83);
            boolean z = false;
            while (it.hasNext()) {
                if (c83.mo8567b(it.next())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }
        Objects.requireNonNull(c83);
        return m9676c((List) iterable, c83);
    }

    /* renamed from: b */
    private static void m9675b(List list, c83 c83, int i, int i2) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i2) {
                break;
            } else if (c83.mo8567b(list.get(size))) {
                list.remove(size);
            }
        }
        while (true) {
            i2--;
            if (i2 >= i) {
                list.remove(i2);
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    private static boolean m9676c(List list, c83 c83) {
        int i = 0;
        int i2 = 0;
        while (i < list.size()) {
            Object obj = list.get(i);
            if (!c83.mo8567b(obj)) {
                if (i > i2) {
                    try {
                        list.set(i2, obj);
                    } catch (UnsupportedOperationException unused) {
                        m9675b(list, c83, i2, i);
                        return true;
                    } catch (IllegalArgumentException unused2) {
                        m9675b(list, c83, i2, i);
                        return true;
                    }
                }
                i2++;
            }
            i++;
        }
        list.subList(i2, list.size()).clear();
        return i != i2;
    }
}
