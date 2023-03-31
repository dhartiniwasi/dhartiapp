package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
class j93 extends d93 implements SortedSet {

    /* renamed from: c */
    final /* synthetic */ o93 f11280c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    j93(o93 o93, SortedMap sortedMap) {
        super(o93, sortedMap);
        this.f11280c = o93;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public SortedMap mo10427b() {
        return (SortedMap) this.f13297a;
    }

    public final Comparator comparator() {
        return mo10427b().comparator();
    }

    public final Object first() {
        return mo10427b().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new j93(this.f11280c, mo10427b().headMap(obj));
    }

    public final Object last() {
        return mo10427b().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new j93(this.f11280c, mo10427b().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new j93(this.f11280c, mo10427b().tailMap(obj));
    }
}
