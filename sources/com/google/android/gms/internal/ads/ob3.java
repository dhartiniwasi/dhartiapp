package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
abstract class ob3 extends AbstractMap {

    /* renamed from: a */
    private transient Set f15030a;

    /* renamed from: b */
    private transient Collection f15031b;

    ob3() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract Set mo8268b();

    public final Set entrySet() {
        Set set = this.f15030a;
        if (set != null) {
            return set;
        }
        Set b = mo8268b();
        this.f15030a = b;
        return b;
    }

    public final Collection values() {
        Collection collection = this.f15031b;
        if (collection != null) {
            return collection;
        }
        nb3 nb3 = new nb3(this);
        this.f15031b = nb3;
        return nb3;
    }
}
