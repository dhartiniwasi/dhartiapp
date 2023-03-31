package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
class k93 implements Iterator {

    /* renamed from: a */
    final Iterator f11977a;

    /* renamed from: b */
    final Collection f11978b;

    /* renamed from: c */
    final /* synthetic */ l93 f11979c;

    k93(l93 l93) {
        Iterator it;
        this.f11979c = l93;
        Collection collection = l93.f12696b;
        this.f11978b = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.f11977a = it;
    }

    k93(l93 l93, Iterator it) {
        this.f11979c = l93;
        this.f11978b = l93.f12696b;
        this.f11977a = it;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo11622a() {
        this.f11979c.mo11947d();
        if (this.f11979c.f12696b != this.f11978b) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean hasNext() {
        mo11622a();
        return this.f11977a.hasNext();
    }

    public final Object next() {
        mo11622a();
        return this.f11977a.next();
    }

    public final void remove() {
        this.f11977a.remove();
        o93.m17638m(this.f11979c.f12699e);
        this.f11979c.mo11943c();
    }
}
