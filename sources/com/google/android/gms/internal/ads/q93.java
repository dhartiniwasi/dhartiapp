package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class q93 extends AbstractCollection {

    /* renamed from: a */
    final /* synthetic */ r93 f16308a;

    q93(r93 r93) {
        this.f16308a = r93;
    }

    public final void clear() {
        this.f16308a.mo12873e0();
    }

    public final boolean contains(Object obj) {
        for (Collection contains : this.f16308a.mo13523j().values()) {
            if (contains.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public final Iterator iterator() {
        return this.f16308a.mo12872c();
    }

    public final int size() {
        return this.f16308a.mo12869U();
    }
}
