package com.google.android.gms.internal.p026firebaseauthapi;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.gd */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3337gd extends C3371he {

    /* renamed from: a */
    private final int f22068a;

    /* renamed from: b */
    private final int f22069b;

    /* renamed from: c */
    private final C3271ed f22070c;

    /* synthetic */ C3337gd(int i, int i2, C3271ed edVar, C3304fd fdVar) {
        this.f22068a = i;
        this.f22069b = i2;
        this.f22070c = edVar;
    }

    /* renamed from: a */
    public final int mo16070a() {
        return this.f22068a;
    }

    /* renamed from: b */
    public final int mo16071b() {
        C3271ed edVar = this.f22070c;
        if (edVar == C3271ed.f21992e) {
            return this.f22069b;
        }
        if (edVar == C3271ed.f21989b || edVar == C3271ed.f21990c || edVar == C3271ed.f21991d) {
            return this.f22069b + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    /* renamed from: c */
    public final C3271ed mo16072c() {
        return this.f22070c;
    }

    /* renamed from: d */
    public final boolean mo16073d() {
        return this.f22070c != C3271ed.f21992e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3337gd)) {
            return false;
        }
        C3337gd gdVar = (C3337gd) obj;
        if (gdVar.f22068a == this.f22068a && gdVar.mo16071b() == mo16071b() && gdVar.f22070c == this.f22070c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f22069b), this.f22070c});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f22070c);
        int i = this.f22069b;
        int i2 = this.f22068a;
        return "AES-CMAC Parameters (variant: " + valueOf + ", " + i + "-byte tags, and " + i2 + "-byte key)";
    }
}
