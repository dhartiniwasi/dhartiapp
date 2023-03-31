package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class fa3 extends cc3 implements Serializable {

    /* renamed from: a */
    final Comparator f9206a;

    fa3(Comparator comparator) {
        Objects.requireNonNull(comparator);
        this.f9206a = comparator;
    }

    public final int compare(Object obj, Object obj2) {
        return this.f9206a.compare(obj, obj2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fa3) {
            return this.f9206a.equals(((fa3) obj).f9206a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9206a.hashCode();
    }

    public final String toString() {
        return this.f9206a.toString();
    }
}
