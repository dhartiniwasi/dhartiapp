package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class r34 extends AbstractList {

    /* renamed from: c */
    private static final t34 f16807c = t34.m20792b(r34.class);

    /* renamed from: a */
    final List f16808a;

    /* renamed from: b */
    final Iterator f16809b;

    public r34(List list, Iterator it) {
        this.f16808a = list;
        this.f16809b = it;
    }

    public final Object get(int i) {
        if (this.f16808a.size() > i) {
            return this.f16808a.get(i);
        }
        if (this.f16809b.hasNext()) {
            this.f16808a.add(this.f16809b.next());
            return get(i);
        }
        throw new NoSuchElementException();
    }

    public final Iterator iterator() {
        return new q34(this);
    }

    public final int size() {
        t34 t34 = f16807c;
        t34.mo12523a("potentially expensive size() call");
        t34.mo12523a("blowup running");
        while (this.f16809b.hasNext()) {
            this.f16808a.add(this.f16809b.next());
        }
        return this.f16808a.size();
    }
}
