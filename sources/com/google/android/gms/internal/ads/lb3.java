package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
abstract class lb3 extends pc3 {
    lb3() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract Map mo11963b();

    public final void clear() {
        mo11963b().clear();
    }

    public abstract boolean contains(Object obj);

    public final boolean isEmpty() {
        return mo11963b().isEmpty();
    }

    public final boolean removeAll(Collection collection) {
        Objects.requireNonNull(collection);
        try {
            return qc3.m19170d(this, collection);
        } catch (UnsupportedOperationException unused) {
            return qc3.m19171e(this, collection.iterator());
        }
    }

    public final boolean retainAll(Collection collection) {
        int i;
        Objects.requireNonNull(collection);
        try {
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            int size = collection.size();
            if (size < 3) {
                s93.m20211a(size, "expectedSize");
                i = size + 1;
            } else {
                i = size < 1073741824 ? (int) Math.ceil(((double) size) / 0.75d) : Integer.MAX_VALUE;
            }
            HashSet hashSet = new HashSet(i);
            for (Object next : collection) {
                if (contains(next) && (next instanceof Map.Entry)) {
                    hashSet.add(((Map.Entry) next).getKey());
                }
            }
            return mo11963b().keySet().retainAll(hashSet);
        }
    }

    public final int size() {
        return mo11963b().size();
    }
}
