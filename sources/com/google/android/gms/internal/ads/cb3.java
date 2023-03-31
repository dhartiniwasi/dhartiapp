package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class cb3 extends uc3 {

    /* renamed from: a */
    boolean f7676a;

    /* renamed from: b */
    final /* synthetic */ Object f7677b;

    cb3(Object obj) {
        this.f7677b = obj;
    }

    public final boolean hasNext() {
        return !this.f7676a;
    }

    public final Object next() {
        if (!this.f7676a) {
            this.f7676a = true;
            return this.f7677b;
        }
        throw new NoSuchElementException();
    }
}
