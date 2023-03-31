package com.google.android.gms.internal.measurement;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.gb */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
final class C6980gb implements Map.Entry, Comparable {

    /* renamed from: a */
    private final Comparable f31706a;

    /* renamed from: b */
    private Object f31707b;

    /* renamed from: c */
    final /* synthetic */ C7077mb f31708c;

    C6980gb(C7077mb mbVar, Comparable comparable, Object obj) {
        this.f31708c = mbVar;
        this.f31706a = comparable;
        this.f31707b = obj;
    }

    /* renamed from: b */
    private static final boolean m40073b(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* renamed from: a */
    public final Comparable mo23444a() {
        return this.f31706a;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f31706a.compareTo(((C6980gb) obj).f31706a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return m40073b(this.f31706a, entry.getKey()) && m40073b(this.f31707b, entry.getValue());
    }

    public final /* synthetic */ Object getKey() {
        return this.f31706a;
    }

    public final Object getValue() {
        return this.f31707b;
    }

    public final int hashCode() {
        Comparable comparable = this.f31706a;
        int i = 0;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f31707b;
        if (obj != null) {
            i = obj.hashCode();
        }
        return hashCode ^ i;
    }

    public final Object setValue(Object obj) {
        this.f31708c.m40405o();
        Object obj2 = this.f31707b;
        this.f31707b = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f31706a);
        String valueOf2 = String.valueOf(this.f31707b);
        return valueOf + "=" + valueOf2;
    }
}
