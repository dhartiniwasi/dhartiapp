package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.g */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C6968g implements C7129q {

    /* renamed from: a */
    private final boolean f31697a;

    public C6968g(Boolean bool) {
        this.f31697a = bool == null ? false : bool.booleanValue();
    }

    /* renamed from: U */
    public final Double mo23368U() {
        return Double.valueOf(true != this.f31697a ? 0.0d : 1.0d);
    }

    /* renamed from: V */
    public final String mo23369V() {
        return Boolean.toString(this.f31697a);
    }

    /* renamed from: Z */
    public final Iterator mo23370Z() {
        return null;
    }

    /* renamed from: b */
    public final C7129q mo23371b() {
        return new C6968g(Boolean.valueOf(this.f31697a));
    }

    /* renamed from: c */
    public final Boolean mo23372c() {
        return Boolean.valueOf(this.f31697a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6968g) && this.f31697a == ((C6968g) obj).f31697a;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f31697a).hashCode();
    }

    /* renamed from: j */
    public final C7129q mo23019j(String str, C7262y4 y4Var, List list) {
        if ("toString".equals(str)) {
            return new C7193u(Boolean.toString(this.f31697a));
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", new Object[]{Boolean.toString(this.f31697a), str}));
    }

    public final String toString() {
        return String.valueOf(this.f31697a);
    }
}
