package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class aa3 extends AbstractSet {

    /* renamed from: a */
    final /* synthetic */ da3 f6509a;

    aa3(da3 da3) {
        this.f6509a = da3;
    }

    public final void clear() {
        this.f6509a.clear();
    }

    public final boolean contains(Object obj) {
        return this.f6509a.containsKey(obj);
    }

    public final Iterator iterator() {
        da3 da3 = this.f6509a;
        Map o = da3.mo9489o();
        if (o != null) {
            return o.keySet().iterator();
        }
        return new v93(da3);
    }

    public final boolean remove(Object obj) {
        Map o = this.f6509a.mo9489o();
        if (o != null) {
            return o.keySet().remove(obj);
        }
        return this.f6509a.m11378A(obj) != da3.f8158r;
    }

    public final int size() {
        return this.f6509a.size();
    }
}
