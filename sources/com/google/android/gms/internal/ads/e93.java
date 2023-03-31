package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class e93 extends i93 implements NavigableMap {

    /* renamed from: g */
    final /* synthetic */ o93 f8708g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    e93(o93 o93, NavigableMap navigableMap) {
        super(o93, navigableMap);
        this.f8708g = o93;
    }

    public final Map.Entry ceilingEntry(Object obj) {
        Map.Entry ceilingEntry = ((NavigableMap) ((SortedMap) this.f6490c)).ceilingEntry(obj);
        if (ceilingEntry == null) {
            return null;
        }
        return mo8269c(ceilingEntry);
    }

    public final Object ceilingKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f6490c)).ceilingKey(obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ SortedMap mo9839d() {
        return (NavigableMap) ((SortedMap) this.f6490c);
    }

    public final NavigableSet descendingKeySet() {
        return (NavigableSet) super.keySet();
    }

    public final NavigableMap descendingMap() {
        return new e93(this.f8708g, ((NavigableMap) ((SortedMap) this.f6490c)).descendingMap());
    }

    /* renamed from: f */
    public final /* synthetic */ SortedSet mo9843f() {
        return (NavigableSet) super.keySet();
    }

    public final Map.Entry firstEntry() {
        Map.Entry firstEntry = ((NavigableMap) ((SortedMap) this.f6490c)).firstEntry();
        if (firstEntry == null) {
            return null;
        }
        return mo8269c(firstEntry);
    }

    public final Map.Entry floorEntry(Object obj) {
        Map.Entry floorEntry = ((NavigableMap) ((SortedMap) this.f6490c)).floorEntry(obj);
        if (floorEntry == null) {
            return null;
        }
        return mo8269c(floorEntry);
    }

    public final Object floorKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f6490c)).floorKey(obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final Map.Entry mo9847g(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Map.Entry entry = (Map.Entry) it.next();
        Collection h = this.f8708g.mo12874h();
        h.addAll((Collection) entry.getValue());
        it.remove();
        return new qa3(entry.getKey(), this.f8708g.mo12875i(h));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final NavigableSet mo9842e() {
        return new g93(this.f8708g, (NavigableMap) ((SortedMap) this.f6490c));
    }

    public final /* synthetic */ SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    public final Map.Entry higherEntry(Object obj) {
        Map.Entry higherEntry = ((NavigableMap) ((SortedMap) this.f6490c)).higherEntry(obj);
        if (higherEntry == null) {
            return null;
        }
        return mo8269c(higherEntry);
    }

    public final Object higherKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f6490c)).higherKey(obj);
    }

    public final /* synthetic */ Set keySet() {
        return (NavigableSet) super.keySet();
    }

    public final Map.Entry lastEntry() {
        Map.Entry lastEntry = ((NavigableMap) ((SortedMap) this.f6490c)).lastEntry();
        if (lastEntry == null) {
            return null;
        }
        return mo8269c(lastEntry);
    }

    public final Map.Entry lowerEntry(Object obj) {
        Map.Entry lowerEntry = ((NavigableMap) ((SortedMap) this.f6490c)).lowerEntry(obj);
        if (lowerEntry == null) {
            return null;
        }
        return mo8269c(lowerEntry);
    }

    public final Object lowerKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f6490c)).lowerKey(obj);
    }

    public final NavigableSet navigableKeySet() {
        return (NavigableSet) super.keySet();
    }

    public final Map.Entry pollFirstEntry() {
        return mo9847g(entrySet().iterator());
    }

    public final Map.Entry pollLastEntry() {
        return mo9847g(descendingMap().entrySet().iterator());
    }

    public final /* bridge */ /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    public final /* synthetic */ SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    public final NavigableMap headMap(Object obj, boolean z) {
        return new e93(this.f8708g, ((NavigableMap) ((SortedMap) this.f6490c)).headMap(obj, z));
    }

    public final NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
        return new e93(this.f8708g, ((NavigableMap) ((SortedMap) this.f6490c)).subMap(obj, z, obj2, z2));
    }

    public final NavigableMap tailMap(Object obj, boolean z) {
        return new e93(this.f8708g, ((NavigableMap) ((SortedMap) this.f6490c)).tailMap(obj, z));
    }
}
