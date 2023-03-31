package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public abstract class ka3 extends la3 implements Map {
    protected ka3() {
    }

    public final void clear() {
        mo9376k().clear();
    }

    public boolean containsKey(Object obj) {
        return mo9376k().containsKey(obj);
    }

    public abstract Set entrySet();

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract Map mo9376k();

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final int mo11628n() {
        return qc3.m19167a(entrySet());
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final boolean mo11629o(Object obj) {
        kb3 kb3 = new kb3(entrySet().iterator());
        if (obj == null) {
            while (kb3.hasNext()) {
                if (kb3.next() == null) {
                    return true;
                }
            }
        } else {
            while (kb3.hasNext()) {
                if (obj.equals(kb3.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final boolean mo11630p(Object obj) {
        return pb3.m18451b(this, obj);
    }

    public final Object put(Object obj, Object obj2) {
        return mo9376k().put(obj, obj2);
    }

    public final void putAll(Map map) {
        mo9376k().putAll(map);
    }

    public final Object remove(Object obj) {
        return mo9376k().remove(obj);
    }

    public int size() {
        return mo9376k().size();
    }

    public final Collection values() {
        return mo9376k().values();
    }
}
