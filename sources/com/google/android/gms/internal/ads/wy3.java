package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class wy3 extends LinkedHashMap {

    /* renamed from: b */
    private static final wy3 f19917b;

    /* renamed from: a */
    private boolean f19918a = true;

    static {
        wy3 wy3 = new wy3();
        f19917b = wy3;
        wy3.f19918a = false;
    }

    private wy3() {
    }

    /* renamed from: b */
    public static wy3 m22957b() {
        return f19917b;
    }

    /* renamed from: g */
    private static int m22958g(Object obj) {
        if (obj instanceof byte[]) {
            return cy3.m11230b((byte[]) obj);
        }
        if (!(obj instanceof ux3)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: h */
    private final void m22959h() {
        if (!this.f19918a) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: c */
    public final wy3 mo15002c() {
        return isEmpty() ? new wy3() : new wy3(this);
    }

    public final void clear() {
        m22959h();
        super.clear();
    }

    /* renamed from: d */
    public final void mo15004d() {
        this.f19918a = false;
    }

    /* renamed from: e */
    public final void mo15005e(wy3 wy3) {
        m22959h();
        if (!wy3.isEmpty()) {
            putAll(wy3);
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
    public final boolean mo15008f() {
        return this.f19918a;
    }

    public final int hashCode() {
        int i = 0;
        for (Map.Entry entry : entrySet()) {
            i += m22958g(entry.getValue()) ^ m22958g(entry.getKey());
        }
        return i;
    }

    public final Object put(Object obj, Object obj2) {
        m22959h();
        cy3.m11233e(obj);
        cy3.m11233e(obj2);
        return super.put(obj, obj2);
    }

    public final void putAll(Map map) {
        m22959h();
        for (Object next : map.keySet()) {
            cy3.m11233e(next);
            cy3.m11233e(map.get(next));
        }
        super.putAll(map);
    }

    public final Object remove(Object obj) {
        m22959h();
        return super.remove(obj);
    }

    private wy3(Map map) {
        super(map);
    }
}
