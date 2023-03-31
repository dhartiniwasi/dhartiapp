package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class d04 implements Map.Entry, Comparable {

    /* renamed from: a */
    private final Comparable f8011a;

    /* renamed from: b */
    private Object f8012b;

    /* renamed from: c */
    final /* synthetic */ j04 f8013c;

    d04(j04 j04, Comparable comparable, Object obj) {
        this.f8013c = j04;
        this.f8011a = comparable;
        this.f8012b = obj;
    }

    /* renamed from: b */
    private static final boolean m11274b(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* renamed from: a */
    public final Comparable mo9412a() {
        return this.f8011a;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f8011a.compareTo(((d04) obj).f8011a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return m11274b(this.f8011a, entry.getKey()) && m11274b(this.f8012b, entry.getValue());
    }

    public final /* synthetic */ Object getKey() {
        return this.f8011a;
    }

    public final Object getValue() {
        return this.f8012b;
    }

    public final int hashCode() {
        Comparable comparable = this.f8011a;
        int i = 0;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f8012b;
        if (obj != null) {
            i = obj.hashCode();
        }
        return hashCode ^ i;
    }

    public final Object setValue(Object obj) {
        this.f8013c.m14625o();
        Object obj2 = this.f8012b;
        this.f8012b = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f8011a);
        String valueOf2 = String.valueOf(this.f8012b);
        return valueOf + "=" + valueOf2;
    }
}
