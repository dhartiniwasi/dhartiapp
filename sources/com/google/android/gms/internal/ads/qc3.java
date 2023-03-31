package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class qc3 {
    /* renamed from: a */
    static int m19167a(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i += next != null ? next.hashCode() : 0;
        }
        return i;
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [java.util.Collection, java.util.Set] */
    /* renamed from: b */
    public static Set m19168b(Set set, c83 c83) {
        if (set instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) set;
            if (sortedSet instanceof nc3) {
                nc3 nc3 = (nc3) sortedSet;
                return new oc3((SortedSet) nc3.f17905a, g83.m13084a(nc3.f17906b, c83));
            }
            Objects.requireNonNull(sortedSet);
            Objects.requireNonNull(c83);
            return new oc3(sortedSet, c83);
        } else if (set instanceof nc3) {
            nc3 nc32 = (nc3) set;
            return new nc3(nc32.f17905a, g83.m13084a(nc32.f17906b, c83));
        } else {
            Objects.requireNonNull(set);
            Objects.requireNonNull(c83);
            return new nc3(set, c83);
        }
    }

    /* renamed from: c */
    static boolean m19169c(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                return set.size() == set2.size() && set.containsAll(set2);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
    }

    /* renamed from: d */
    static boolean m19170d(Set set, Collection collection) {
        Objects.requireNonNull(collection);
        if (collection instanceof zb3) {
            collection = ((zb3) collection).zza();
        }
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            return m19171e(set, collection.iterator());
        }
        Iterator it = set.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    /* renamed from: e */
    static boolean m19171e(Set set, Iterator it) {
        boolean z = false;
        while (it.hasNext()) {
            z |= set.remove(it.next());
        }
        return z;
    }
}
