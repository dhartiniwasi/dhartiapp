package com.google.android.gms.internal.ads;

import java.util.ListIterator;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
abstract class tc3 extends sc3 implements ListIterator {
    tc3(ListIterator listIterator) {
        super(listIterator);
    }

    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean hasPrevious() {
        return ((ListIterator) this.f17346a).hasPrevious();
    }

    public final int nextIndex() {
        return ((ListIterator) this.f17346a).nextIndex();
    }

    public final Object previous() {
        return mo10474a(((ListIterator) this.f17346a).previous());
    }

    public final int previousIndex() {
        return ((ListIterator) this.f17346a).previousIndex();
    }

    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
