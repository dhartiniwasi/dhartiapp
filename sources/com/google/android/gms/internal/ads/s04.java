package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class s04 implements Iterator {

    /* renamed from: a */
    final Iterator f17176a;

    /* renamed from: b */
    final /* synthetic */ t04 f17177b;

    s04(t04 t04) {
        this.f17177b = t04;
        this.f17176a = t04.f17806a.iterator();
    }

    public final boolean hasNext() {
        return this.f17176a.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f17176a.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
