package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.measurement.d */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
final class C6917d implements Iterator {

    /* renamed from: a */
    final /* synthetic */ Iterator f31637a;

    /* renamed from: b */
    final /* synthetic */ Iterator f31638b;

    C6917d(C6951f fVar, Iterator it, Iterator it2) {
        this.f31637a = it;
        this.f31638b = it2;
    }

    public final boolean hasNext() {
        if (this.f31637a.hasNext()) {
            return true;
        }
        return this.f31638b.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        if (this.f31637a.hasNext()) {
            return new C7193u(((Integer) this.f31637a.next()).toString());
        }
        if (this.f31638b.hasNext()) {
            return new C7193u((String) this.f31638b.next());
        }
        throw new NoSuchElementException();
    }
}
