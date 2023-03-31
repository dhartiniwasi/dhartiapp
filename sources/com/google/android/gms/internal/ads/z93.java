package com.google.android.gms.internal.ads;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
abstract class z93 implements Iterator {

    /* renamed from: a */
    int f21030a;

    /* renamed from: b */
    int f21031b;

    /* renamed from: c */
    int f21032c = -1;

    /* renamed from: d */
    final /* synthetic */ da3 f21033d;

    /* synthetic */ z93(da3 da3, v93 v93) {
        this.f21033d = da3;
        this.f21030a = da3.f8163e;
        this.f21031b = da3.mo9485h();
    }

    /* renamed from: c */
    private final void m24495c() {
        if (this.f21033d.f8163e != this.f21030a) {
            throw new ConcurrentModificationException();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract Object mo14699a(int i);

    public final boolean hasNext() {
        return this.f21031b >= 0;
    }

    public final Object next() {
        m24495c();
        if (hasNext()) {
            int i = this.f21031b;
            this.f21032c = i;
            Object a = mo14699a(i);
            this.f21031b = this.f21033d.mo9486i(this.f21031b);
            return a;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        m24495c();
        b83.m10245i(this.f21032c >= 0, "no calls to next() since the last call to remove()");
        this.f21030a += 32;
        da3 da3 = this.f21033d;
        da3.remove(da3.m11387j(da3, this.f21032c));
        this.f21031b--;
        this.f21032c = -1;
    }
}
