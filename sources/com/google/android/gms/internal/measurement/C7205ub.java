package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.measurement.ub */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
final class C7205ub implements Iterator {

    /* renamed from: a */
    final Iterator f32134a;

    /* renamed from: b */
    final /* synthetic */ C7221vb f32135b;

    C7205ub(C7221vb vbVar) {
        this.f32135b = vbVar;
        this.f32134a = vbVar.f32152a.iterator();
    }

    public final boolean hasNext() {
        return this.f32134a.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f32134a.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
