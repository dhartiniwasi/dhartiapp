package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
class n93 extends l93 implements List {

    /* renamed from: f */
    final /* synthetic */ o93 f13920f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    n93(o93 o93, Object obj, List list, l93 l93) {
        super(o93, obj, list, l93);
        this.f13920f = o93;
    }

    public final void add(int i, Object obj) {
        mo11947d();
        boolean isEmpty = this.f12696b.isEmpty();
        ((List) this.f12696b).add(i, obj);
        o93.m17637l(this.f13920f);
        if (isEmpty) {
            mo11942b();
        }
    }

    public final boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.f12696b).addAll(i, collection);
        if (!addAll) {
            return addAll;
        }
        o93.m17639n(this.f13920f, this.f12696b.size() - size);
        if (size != 0) {
            return addAll;
        }
        mo11942b();
        return true;
    }

    public final Object get(int i) {
        mo11947d();
        return ((List) this.f12696b).get(i);
    }

    public final int indexOf(Object obj) {
        mo11947d();
        return ((List) this.f12696b).indexOf(obj);
    }

    public final int lastIndexOf(Object obj) {
        mo11947d();
        return ((List) this.f12696b).lastIndexOf(obj);
    }

    public final ListIterator listIterator() {
        mo11947d();
        return new m93(this);
    }

    public final Object remove(int i) {
        mo11947d();
        Object remove = ((List) this.f12696b).remove(i);
        o93.m17638m(this.f13920f);
        mo11943c();
        return remove;
    }

    public final Object set(int i, Object obj) {
        mo11947d();
        return ((List) this.f12696b).set(i, obj);
    }

    public final List subList(int i, int i2) {
        mo11947d();
        o93 o93 = this.f13920f;
        Object obj = this.f12695a;
        List subList = ((List) this.f12696b).subList(i, i2);
        l93 l93 = this.f12697c;
        if (l93 == null) {
            l93 = this;
        }
        return o93.mo12877p(obj, subList, l93);
    }

    public final ListIterator listIterator(int i) {
        mo11947d();
        return new m93(this, i);
    }
}
