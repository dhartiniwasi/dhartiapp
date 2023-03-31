package com.google.android.gms.internal.p026firebaseauthapi;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.oc */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3600oc {

    /* renamed from: a */
    private final Class f22460a;

    /* renamed from: b */
    private final C3643pm f22461b;

    /* synthetic */ C3600oc(Class cls, C3643pm pmVar, C3567nc ncVar) {
        this.f22460a = cls;
        this.f22461b = pmVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3600oc)) {
            return false;
        }
        C3600oc ocVar = (C3600oc) obj;
        if (!ocVar.f22460a.equals(this.f22460a) || !ocVar.f22461b.equals(this.f22461b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f22460a, this.f22461b});
    }

    public final String toString() {
        String simpleName = this.f22460a.getSimpleName();
        String valueOf = String.valueOf(this.f22461b);
        return simpleName + ", object identifier: " + valueOf;
    }
}
