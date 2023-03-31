package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
class i93 extends a93 implements SortedMap {

    /* renamed from: e */
    SortedSet f10701e;

    /* renamed from: f */
    final /* synthetic */ o93 f10702f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    i93(o93 o93, SortedMap sortedMap) {
        super(o93, sortedMap);
        this.f10702f = o93;
    }

    public final Comparator comparator() {
        return mo9839d().comparator();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public SortedMap mo9839d() {
        return (SortedMap) this.f6490c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public SortedSet mo9842e() {
        return new j93(this.f10702f, mo9839d());
    }

    /* renamed from: f */
    public SortedSet keySet() {
        SortedSet sortedSet = this.f10701e;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet e = mo9842e();
        this.f10701e = e;
        return e;
    }

    public final Object firstKey() {
        return mo9839d().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new i93(this.f10702f, mo9839d().headMap(obj));
    }

    public final Object lastKey() {
        return mo9839d().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new i93(this.f10702f, mo9839d().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new i93(this.f10702f, mo9839d().tailMap(obj));
    }
}
