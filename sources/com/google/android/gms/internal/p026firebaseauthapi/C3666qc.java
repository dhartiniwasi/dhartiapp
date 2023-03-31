package com.google.android.gms.internal.p026firebaseauthapi;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.qc */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3666qc {

    /* renamed from: a */
    private final Class f22551a;

    /* renamed from: b */
    private final Class f22552b;

    /* synthetic */ C3666qc(Class cls, Class cls2, C3633pc pcVar) {
        this.f22551a = cls;
        this.f22552b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3666qc)) {
            return false;
        }
        C3666qc qcVar = (C3666qc) obj;
        if (!qcVar.f22551a.equals(this.f22551a) || !qcVar.f22552b.equals(this.f22552b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f22551a, this.f22552b});
    }

    public final String toString() {
        String simpleName = this.f22551a.getSimpleName();
        String simpleName2 = this.f22552b.getSimpleName();
        return simpleName + " with serialization type: " + simpleName2;
    }
}
