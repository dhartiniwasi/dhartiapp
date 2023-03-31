package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.measurement.t */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
final class C7177t implements Iterator {

    /* renamed from: a */
    private int f32099a = 0;

    /* renamed from: b */
    final /* synthetic */ C7193u f32100b;

    C7177t(C7193u uVar) {
        this.f32100b = uVar;
    }

    public final boolean hasNext() {
        return this.f32099a < this.f32100b.f32124a.length();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        int i = this.f32099a;
        C7193u uVar = this.f32100b;
        if (i < uVar.f32124a.length()) {
            String f = uVar.f32124a;
            this.f32099a = i + 1;
            return new C7193u(String.valueOf(f.charAt(i)));
        }
        throw new NoSuchElementException();
    }
}
