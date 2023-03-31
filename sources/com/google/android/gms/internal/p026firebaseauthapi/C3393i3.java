package com.google.android.gms.internal.p026firebaseauthapi;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.i3 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3393i3 extends LinkedHashMap {

    /* renamed from: b */
    private static final C3393i3 f22132b;

    /* renamed from: a */
    private boolean f22133a = true;

    static {
        C3393i3 i3Var = new C3393i3();
        f22132b = i3Var;
        i3Var.f22133a = false;
    }

    private C3393i3() {
    }

    /* renamed from: b */
    public static C3393i3 m25759b() {
        return f22132b;
    }

    /* renamed from: g */
    private static int m25760g(Object obj) {
        if (obj instanceof byte[]) {
            return C3623p2.m26438b((byte[]) obj);
        }
        if (!(obj instanceof C3491l2)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: h */
    private final void m25761h() {
        if (!this.f22133a) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: c */
    public final C3393i3 mo16141c() {
        return isEmpty() ? new C3393i3() : new C3393i3(this);
    }

    public final void clear() {
        m25761h();
        super.clear();
    }

    /* renamed from: d */
    public final void mo16143d() {
        this.f22133a = false;
    }

    /* renamed from: e */
    public final void mo16144e(C3393i3 i3Var) {
        m25761h();
        if (!i3Var.isEmpty()) {
            putAll(i3Var);
        }
    }

    public final Set entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        for (Map.Entry entry : entrySet()) {
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            Object value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(value instanceof byte[]) || !(obj2 instanceof byte[])) {
                z = value.equals(obj2);
                continue;
            } else {
                z = Arrays.equals((byte[]) value, (byte[]) obj2);
                continue;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo16147f() {
        return this.f22133a;
    }

    public final int hashCode() {
        int i = 0;
        for (Map.Entry entry : entrySet()) {
            i += m25760g(entry.getValue()) ^ m25760g(entry.getKey());
        }
        return i;
    }

    public final Object put(Object obj, Object obj2) {
        m25761h();
        C3623p2.m26441e(obj);
        C3623p2.m26441e(obj2);
        return super.put(obj, obj2);
    }

    public final void putAll(Map map) {
        m25761h();
        for (Object next : map.keySet()) {
            C3623p2.m26441e(next);
            C3623p2.m26441e(map.get(next));
        }
        super.putAll(map);
    }

    public final Object remove(Object obj) {
        m25761h();
        return super.remove(obj);
    }

    private C3393i3(Map map) {
        super(map);
    }
}
