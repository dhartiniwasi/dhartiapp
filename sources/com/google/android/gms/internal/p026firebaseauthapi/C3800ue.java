package com.google.android.gms.internal.p026firebaseauthapi;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.ue */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3800ue {

    /* renamed from: a */
    private final C3429j6 f22780a;

    /* renamed from: b */
    private final int f22781b;

    /* renamed from: c */
    private final C3726s6 f22782c;

    /* synthetic */ C3800ue(C3429j6 j6Var, int i, C3726s6 s6Var, C3767te teVar) {
        this.f22780a = j6Var;
        this.f22781b = i;
        this.f22782c = s6Var;
    }

    /* renamed from: a */
    public final int mo16872a() {
        return this.f22781b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3800ue)) {
            return false;
        }
        C3800ue ueVar = (C3800ue) obj;
        if (this.f22780a == ueVar.f22780a && this.f22781b == ueVar.f22781b && this.f22782c.equals(ueVar.f22782c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f22780a, Integer.valueOf(this.f22781b), Integer.valueOf(this.f22782c.hashCode())});
    }

    public final String toString() {
        return String.format("(status=%s, keyId=%s, parameters='%s')", new Object[]{this.f22780a, Integer.valueOf(this.f22781b), this.f22782c});
    }
}
