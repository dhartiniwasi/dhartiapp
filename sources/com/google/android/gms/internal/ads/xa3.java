package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public abstract class xa3 implements Map, Serializable {

    /* renamed from: a */
    private transient za3 f20058a;

    /* renamed from: b */
    private transient za3 f20059b;

    /* renamed from: c */
    private transient pa3 f20060c;

    xa3() {
    }

    /* renamed from: d */
    public static xa3 m23154d(Map map) {
        Set entrySet = map.entrySet();
        wa3 wa3 = new wa3(entrySet instanceof Collection ? entrySet.size() : 4);
        wa3.mo14882b(entrySet);
        return wa3.mo14883c();
    }

    /* renamed from: e */
    public static xa3 m23155e() {
        return jc3.f11316g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract pa3 mo11382b();

    /* renamed from: c */
    public final pa3 values() {
        pa3 pa3 = this.f20060c;
        if (pa3 != null) {
            return pa3;
        }
        pa3 b = mo11382b();
        this.f20060c = b;
        return b;
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    public final boolean equals(Object obj) {
        return pb3.m18451b(this, obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public abstract za3 mo11383f();

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public abstract za3 mo11384g();

    public abstract Object get(Object obj);

    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    /* renamed from: h */
    public final za3 entrySet() {
        za3 za3 = this.f20058a;
        if (za3 != null) {
            return za3;
        }
        za3 f = mo11383f();
        this.f20058a = f;
        return f;
    }

    public final int hashCode() {
        return qc3.m19167a(entrySet());
    }

    /* renamed from: i */
    public final za3 keySet() {
        za3 za3 = this.f20059b;
        if (za3 != null) {
            return za3;
        }
        za3 g = mo11384g();
        this.f20059b = g;
        return g;
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        s93.m20211a(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }
}
