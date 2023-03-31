package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class z83 implements Iterator {

    /* renamed from: a */
    final Iterator f21017a;

    /* renamed from: b */
    Collection f21018b;

    /* renamed from: c */
    final /* synthetic */ a93 f21019c;

    z83(a93 a93) {
        this.f21019c = a93;
        this.f21017a = a93.f6490c.entrySet().iterator();
    }

    public final boolean hasNext() {
        return this.f21017a.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f21017a.next();
        this.f21018b = (Collection) entry.getValue();
        return this.f21019c.mo8269c(entry);
    }

    public final void remove() {
        b83.m10245i(this.f21018b != null, "no calls to next() since the last call to remove()");
        this.f21017a.remove();
        o93.m17640o(this.f21019c.f6491d, this.f21018b.size());
        this.f21018b.clear();
        this.f21018b = null;
    }
}
