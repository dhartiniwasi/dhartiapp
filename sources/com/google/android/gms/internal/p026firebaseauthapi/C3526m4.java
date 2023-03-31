package com.google.android.gms.internal.p026firebaseauthapi;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.m4 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3526m4 extends AbstractSet {

    /* renamed from: a */
    final /* synthetic */ C3592o4 f22348a;

    /* synthetic */ C3526m4(C3592o4 o4Var, C3493l4 l4Var) {
        this.f22348a = o4Var;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.f22348a.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    public final void clear() {
        this.f22348a.clear();
    }

    public final boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.f22348a.get(entry.getKey());
        Object value = entry.getValue();
        if (obj2 == value || (obj2 != null && obj2.equals(value))) {
            return true;
        }
        return false;
    }

    public final Iterator iterator() {
        return new C3460k4(this.f22348a, (C3427j4) null);
    }

    public final boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.f22348a.remove(entry.getKey());
        return true;
    }

    public final int size() {
        return this.f22348a.size();
    }
}
