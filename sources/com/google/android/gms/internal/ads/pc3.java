package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
abstract class pc3 extends AbstractSet {
    pc3() {
    }

    public boolean removeAll(Collection collection) {
        return qc3.m19170d(this, collection);
    }

    public boolean retainAll(Collection collection) {
        Objects.requireNonNull(collection);
        return super.retainAll(collection);
    }
}
