package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
abstract class h73 implements Iterator {

    /* renamed from: a */
    private Object f10234a;

    /* renamed from: b */
    private int f10235b = 2;

    protected h73() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo10750a();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final Object mo10751c() {
        this.f10235b = 3;
        return null;
    }

    public final boolean hasNext() {
        b83.m10244h(this.f10235b != 4);
        int i = this.f10235b;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 == 0) {
            return true;
        } else {
            if (i2 != 2) {
                this.f10235b = 4;
                this.f10234a = mo10750a();
                if (this.f10235b != 3) {
                    this.f10235b = 1;
                    return true;
                }
            }
            return false;
        }
    }

    public final Object next() {
        if (hasNext()) {
            this.f10235b = 2;
            Object obj = this.f10234a;
            this.f10234a = null;
            return obj;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
