package com.google.android.gms.measurement.internal;

import java.util.Iterator;

/* renamed from: com.google.android.gms.measurement.internal.s */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class C7491s implements Iterator {

    /* renamed from: a */
    final Iterator f32939a;

    /* renamed from: b */
    final /* synthetic */ C7502t f32940b;

    C7491s(C7502t tVar) {
        this.f32940b = tVar;
        this.f32939a = tVar.f32978a.keySet().iterator();
    }

    /* renamed from: a */
    public final String next() {
        return (String) this.f32939a.next();
    }

    public final boolean hasNext() {
        return this.f32939a.hasNext();
    }

    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
