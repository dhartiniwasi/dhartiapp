package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class c93 implements Iterator {

    /* renamed from: a */
    Map.Entry f7659a;

    /* renamed from: b */
    final /* synthetic */ Iterator f7660b;

    /* renamed from: c */
    final /* synthetic */ d93 f7661c;

    c93(d93 d93, Iterator it) {
        this.f7661c = d93;
        this.f7660b = it;
    }

    public final boolean hasNext() {
        return this.f7660b.hasNext();
    }

    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f7660b.next();
        this.f7659a = entry;
        return entry.getKey();
    }

    public final void remove() {
        b83.m10245i(this.f7659a != null, "no calls to next() since the last call to remove()");
        Collection collection = (Collection) this.f7659a.getValue();
        this.f7660b.remove();
        o93.m17640o(this.f7661c.f8148b, collection.size());
        collection.clear();
        this.f7659a = null;
    }
}
