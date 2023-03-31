package com.google.android.gms.internal.measurement;

import java.util.ListIterator;

/* renamed from: com.google.android.gms.internal.measurement.tb */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
final class C7189tb implements ListIterator {

    /* renamed from: a */
    final ListIterator f32118a;

    /* renamed from: b */
    final /* synthetic */ int f32119b;

    /* renamed from: c */
    final /* synthetic */ C7221vb f32120c;

    C7189tb(C7221vb vbVar, int i) {
        this.f32120c = vbVar;
        this.f32119b = i;
        this.f32118a = vbVar.f32152a.listIterator(i);
    }

    public final /* synthetic */ void add(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext() {
        return this.f32118a.hasNext();
    }

    public final boolean hasPrevious() {
        return this.f32118a.hasPrevious();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f32118a.next();
    }

    public final int nextIndex() {
        return this.f32118a.nextIndex();
    }

    public final /* bridge */ /* synthetic */ Object previous() {
        return (String) this.f32118a.previous();
    }

    public final int previousIndex() {
        return this.f32118a.previousIndex();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void set(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }
}
