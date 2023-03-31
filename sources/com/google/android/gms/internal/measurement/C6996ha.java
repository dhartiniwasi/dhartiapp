package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.measurement.ha */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public final class C6996ha extends LinkedHashMap {

    /* renamed from: b */
    private static final C6996ha f31719b;

    /* renamed from: a */
    private boolean f31720a = true;

    static {
        C6996ha haVar = new C6996ha();
        f31719b = haVar;
        haVar.f31720a = false;
    }

    private C6996ha() {
    }

    /* renamed from: b */
    public static C6996ha m40176b() {
        return f31719b;
    }

    /* renamed from: g */
    private static int m40177g(Object obj) {
        if (obj instanceof byte[]) {
            return C7107o9.m40529b((byte[]) obj);
        }
        return obj.hashCode();
    }

    /* renamed from: h */
    private final void m40178h() {
        if (!this.f31720a) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: c */
    public final C6996ha mo23502c() {
        return isEmpty() ? new C6996ha() : new C6996ha(this);
    }

    public final void clear() {
        m40178h();
        super.clear();
    }

    /* renamed from: d */
    public final void mo23504d() {
        this.f31720a = false;
    }

    /* renamed from: e */
    public final void mo23505e(C6996ha haVar) {
        m40178h();
        if (!haVar.isEmpty()) {
            putAll(haVar);
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
    public final boolean mo23508f() {
        return this.f31720a;
    }

    public final int hashCode() {
        int i = 0;
        for (Map.Entry entry : entrySet()) {
            i += m40177g(entry.getValue()) ^ m40177g(entry.getKey());
        }
        return i;
    }

    public final Object put(Object obj, Object obj2) {
        m40178h();
        C7107o9.m40532e(obj);
        C7107o9.m40532e(obj2);
        return super.put(obj, obj2);
    }

    public final void putAll(Map map) {
        m40178h();
        for (Object next : map.keySet()) {
            C7107o9.m40532e(next);
            C7107o9.m40532e(map.get(next));
        }
        super.putAll(map);
    }

    public final Object remove(Object obj) {
        m40178h();
        return super.remove(obj);
    }

    private C6996ha(Map map) {
        super(map);
    }
}
