package com.google.android.gms.internal.ads;

import java.util.AbstractMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class ec3 extends ua3 {

    /* renamed from: c */
    final /* synthetic */ fc3 f8733c;

    ec3(fc3 fc3) {
        this.f8733c = fc3;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        b83.m10237a(i, this.f8733c.f9217e, "index");
        fc3 fc3 = this.f8733c;
        int i2 = i + i;
        Object obj = fc3.f9216d[i2];
        obj.getClass();
        Object obj2 = fc3.f9216d[i2 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    /* renamed from: k */
    public final boolean mo9539k() {
        return true;
    }

    public final int size() {
        return this.f8733c.f9217e;
    }
}
