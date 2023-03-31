package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.h */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C6985h implements C7129q {

    /* renamed from: a */
    private final C7129q f31714a;

    /* renamed from: b */
    private final String f31715b;

    public C6985h() {
        throw null;
    }

    public C6985h(String str) {
        this.f31714a = C7129q.f31955m;
        this.f31715b = str;
    }

    public C6985h(String str, C7129q qVar) {
        this.f31714a = qVar;
        this.f31715b = str;
    }

    /* renamed from: U */
    public final Double mo23368U() {
        throw new IllegalStateException("Control is not a double");
    }

    /* renamed from: V */
    public final String mo23369V() {
        throw new IllegalStateException("Control is not a String");
    }

    /* renamed from: Z */
    public final Iterator mo23370Z() {
        return null;
    }

    /* renamed from: a */
    public final C7129q mo23457a() {
        return this.f31714a;
    }

    /* renamed from: b */
    public final C7129q mo23371b() {
        return new C6985h(this.f31715b, this.f31714a.mo23371b());
    }

    /* renamed from: c */
    public final Boolean mo23372c() {
        throw new IllegalStateException("Control is not a boolean");
    }

    /* renamed from: d */
    public final String mo23458d() {
        return this.f31715b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6985h)) {
            return false;
        }
        C6985h hVar = (C6985h) obj;
        return this.f31715b.equals(hVar.f31715b) && this.f31714a.equals(hVar.f31714a);
    }

    public final int hashCode() {
        return (this.f31715b.hashCode() * 31) + this.f31714a.hashCode();
    }

    /* renamed from: j */
    public final C7129q mo23019j(String str, C7262y4 y4Var, List list) {
        throw new IllegalStateException("Control does not have functions");
    }
}
