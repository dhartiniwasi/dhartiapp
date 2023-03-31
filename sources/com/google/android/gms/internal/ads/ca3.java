package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class ca3 extends AbstractCollection {

    /* renamed from: a */
    final /* synthetic */ da3 f7671a;

    ca3(da3 da3) {
        this.f7671a = da3;
    }

    public final void clear() {
        this.f7671a.clear();
    }

    public final Iterator iterator() {
        da3 da3 = this.f7671a;
        Map o = da3.mo9489o();
        if (o != null) {
            return o.values().iterator();
        }
        return new x93(da3);
    }

    public final int size() {
        return this.f7671a.size();
    }
}
