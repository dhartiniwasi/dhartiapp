package com.google.android.gms.internal.ads;

import java.util.ListIterator;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class r04 implements ListIterator {

    /* renamed from: a */
    final ListIterator f16772a;

    /* renamed from: b */
    final /* synthetic */ int f16773b;

    /* renamed from: c */
    final /* synthetic */ t04 f16774c;

    r04(t04 t04, int i) {
        this.f16774c = t04;
        this.f16773b = i;
        this.f16772a = t04.f17806a.listIterator(i);
    }

    public final /* synthetic */ void add(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext() {
        return this.f16772a.hasNext();
    }

    public final boolean hasPrevious() {
        return this.f16772a.hasPrevious();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f16772a.next();
    }

    public final int nextIndex() {
        return this.f16772a.nextIndex();
    }

    public final /* bridge */ /* synthetic */ Object previous() {
        return (String) this.f16772a.previous();
    }

    public final int previousIndex() {
        return this.f16772a.previousIndex();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void set(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }
}
