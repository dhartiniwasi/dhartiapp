package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class ib3 extends AbstractSequentialList implements Serializable {

    /* renamed from: a */
    final List f10723a;

    /* renamed from: b */
    final q73 f10724b;

    ib3(List list, q73 q73) {
        this.f10723a = list;
        this.f10724b = q73;
    }

    public final void clear() {
        this.f10723a.clear();
    }

    public final ListIterator listIterator(int i) {
        return new gb3(this, this.f10723a.listIterator(i));
    }

    public final int size() {
        return this.f10723a.size();
    }
}
