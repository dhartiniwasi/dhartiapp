package com.google.android.gms.internal.p026firebaseauthapi;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.i4 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3394i4 implements Map.Entry, Comparable {

    /* renamed from: a */
    private final Comparable f22134a;

    /* renamed from: b */
    private Object f22135b;

    /* renamed from: c */
    final /* synthetic */ C3592o4 f22136c;

    C3394i4(C3592o4 o4Var, Comparable comparable, Object obj) {
        this.f22136c = o4Var;
        this.f22134a = comparable;
        this.f22135b = obj;
    }

    /* renamed from: b */
    private static final boolean m25766b(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* renamed from: a */
    public final Comparable mo16152a() {
        return this.f22134a;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f22134a.compareTo(((C3394i4) obj).f22134a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return m25766b(this.f22134a, entry.getKey()) && m25766b(this.f22135b, entry.getValue());
    }

    public final /* synthetic */ Object getKey() {
        return this.f22134a;
    }

    public final Object getValue() {
        return this.f22135b;
    }

    public final int hashCode() {
        Comparable comparable = this.f22134a;
        int i = 0;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f22135b;
        if (obj != null) {
            i = obj.hashCode();
        }
        return hashCode ^ i;
    }

    public final Object setValue(Object obj) {
        this.f22136c.m26339o();
        Object obj2 = this.f22135b;
        this.f22135b = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f22134a);
        String valueOf2 = String.valueOf(this.f22135b);
        return valueOf + "=" + valueOf2;
    }
}
