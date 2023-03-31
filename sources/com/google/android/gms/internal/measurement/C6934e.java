package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.measurement.e */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
final class C6934e implements Iterator {

    /* renamed from: a */
    private int f31662a = 0;

    /* renamed from: b */
    final /* synthetic */ C6951f f31663b;

    C6934e(C6951f fVar) {
        this.f31663b = fVar;
    }

    public final boolean hasNext() {
        return this.f31662a < this.f31663b.mo23379l();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        if (this.f31662a < this.f31663b.mo23379l()) {
            C6951f fVar = this.f31663b;
            int i = this.f31662a;
            this.f31662a = i + 1;
            return fVar.mo23380o(i);
        }
        int i2 = this.f31662a;
        throw new NoSuchElementException("Out of bounds index: " + i2);
    }
}
