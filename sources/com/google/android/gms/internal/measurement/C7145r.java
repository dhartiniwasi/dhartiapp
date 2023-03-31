package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.r */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C7145r implements C7129q {

    /* renamed from: a */
    private final String f31997a;

    /* renamed from: b */
    private final ArrayList f31998b;

    public C7145r(String str, List list) {
        this.f31997a = str;
        ArrayList arrayList = new ArrayList();
        this.f31998b = arrayList;
        arrayList.addAll(list);
    }

    /* renamed from: U */
    public final Double mo23368U() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    /* renamed from: V */
    public final String mo23369V() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    /* renamed from: Z */
    public final Iterator mo23370Z() {
        return null;
    }

    /* renamed from: a */
    public final String mo23802a() {
        return this.f31997a;
    }

    /* renamed from: b */
    public final C7129q mo23371b() {
        return this;
    }

    /* renamed from: c */
    public final Boolean mo23372c() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    /* renamed from: d */
    public final ArrayList mo23803d() {
        return this.f31998b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7145r)) {
            return false;
        }
        C7145r rVar = (C7145r) obj;
        String str = this.f31997a;
        if (str == null ? rVar.f31997a == null : str.equals(rVar.f31997a)) {
            return this.f31998b.equals(rVar.f31998b);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f31997a;
        return ((str != null ? str.hashCode() : 0) * 31) + this.f31998b.hashCode();
    }

    /* renamed from: j */
    public final C7129q mo23019j(String str, C7262y4 y4Var, List list) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }
}
