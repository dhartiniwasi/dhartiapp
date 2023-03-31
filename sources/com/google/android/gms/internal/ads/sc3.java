package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
abstract class sc3 implements Iterator {

    /* renamed from: a */
    final Iterator f17346a;

    sc3(Iterator it) {
        Objects.requireNonNull(it);
        this.f17346a = it;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract Object mo10474a(Object obj);

    public final boolean hasNext() {
        return this.f17346a.hasNext();
    }

    public final Object next() {
        return mo10474a(this.f17346a.next());
    }

    public final void remove() {
        this.f17346a.remove();
    }
}
