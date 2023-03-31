package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.measurement.s */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
final class C7161s implements Iterator {

    /* renamed from: a */
    private int f32040a = 0;

    /* renamed from: b */
    final /* synthetic */ C7193u f32041b;

    C7161s(C7193u uVar) {
        this.f32041b = uVar;
    }

    public final boolean hasNext() {
        return this.f32040a < this.f32041b.f32124a.length();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        int i = this.f32040a;
        if (i < this.f32041b.f32124a.length()) {
            this.f32040a = i + 1;
            return new C7193u(String.valueOf(i));
        }
        throw new NoSuchElementException();
    }
}
