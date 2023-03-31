package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class q34 implements Iterator {

    /* renamed from: a */
    int f16168a = 0;

    /* renamed from: b */
    final /* synthetic */ r34 f16169b;

    q34(r34 r34) {
        this.f16169b = r34;
    }

    public final boolean hasNext() {
        return this.f16168a < this.f16169b.f16808a.size() || this.f16169b.f16809b.hasNext();
    }

    public final Object next() {
        if (this.f16168a < this.f16169b.f16808a.size()) {
            List list = this.f16169b.f16808a;
            int i = this.f16168a;
            this.f16168a = i + 1;
            return list.get(i);
        }
        r34 r34 = this.f16169b;
        r34.f16808a.add(r34.f16809b.next());
        return next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
