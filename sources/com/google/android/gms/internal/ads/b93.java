package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
class b93 implements Iterator {

    /* renamed from: a */
    final Iterator f7173a;

    /* renamed from: b */
    Object f7174b = null;

    /* renamed from: c */
    Collection f7175c = null;

    /* renamed from: d */
    Iterator f7176d = db3.INSTANCE;

    /* renamed from: e */
    final /* synthetic */ o93 f7177e;

    b93(o93 o93) {
        this.f7177e = o93;
        this.f7173a = o93.f15008d.entrySet().iterator();
    }

    public final boolean hasNext() {
        return this.f7173a.hasNext() || this.f7176d.hasNext();
    }

    public final Object next() {
        if (!this.f7176d.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f7173a.next();
            this.f7174b = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f7175c = collection;
            this.f7176d = collection.iterator();
        }
        return this.f7176d.next();
    }

    public final void remove() {
        this.f7176d.remove();
        Collection collection = this.f7175c;
        collection.getClass();
        if (collection.isEmpty()) {
            this.f7173a.remove();
        }
        o93.m17638m(this.f7177e);
    }
}
