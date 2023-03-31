package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class g93 extends j93 implements NavigableSet {

    /* renamed from: d */
    final /* synthetic */ o93 f9784d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    g93(o93 o93, NavigableMap navigableMap) {
        super(o93, navigableMap);
        this.f9784d = o93;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ SortedMap mo10427b() {
        return (NavigableMap) ((SortedMap) this.f13297a);
    }

    public final Object ceiling(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f13297a)).ceilingKey(obj);
    }

    public final Iterator descendingIterator() {
        return descendingSet().iterator();
    }

    public final NavigableSet descendingSet() {
        return new g93(this.f9784d, ((NavigableMap) ((SortedMap) this.f13297a)).descendingMap());
    }

    public final Object floor(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f13297a)).floorKey(obj);
    }

    public final /* synthetic */ SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    public final Object higher(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f13297a)).higherKey(obj);
    }

    public final Object lower(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f13297a)).lowerKey(obj);
    }

    public final Object pollFirst() {
        return eb3.m12008a(iterator());
    }

    public final Object pollLast() {
        return eb3.m12008a(descendingIterator());
    }

    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    public final /* synthetic */ SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    public final NavigableSet headSet(Object obj, boolean z) {
        return new g93(this.f9784d, ((NavigableMap) ((SortedMap) this.f13297a)).headMap(obj, z));
    }

    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        return new g93(this.f9784d, ((NavigableMap) ((SortedMap) this.f13297a)).subMap(obj, z, obj2, z2));
    }

    public final NavigableSet tailSet(Object obj, boolean z) {
        return new g93(this.f9784d, ((NavigableMap) ((SortedMap) this.f13297a)).tailMap(obj, z));
    }
}
