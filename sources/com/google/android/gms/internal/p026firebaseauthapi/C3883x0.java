package com.google.android.gms.internal.p026firebaseauthapi;

import java.util.Comparator;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.x0 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3883x0 implements Comparator {
    C3883x0() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        C3325g1 g1Var = (C3325g1) obj;
        C3325g1 g1Var2 = (C3325g1) obj2;
        C3851w0 w0Var = new C3851w0(g1Var);
        C3851w0 w0Var2 = new C3851w0(g1Var2);
        while (w0Var.hasNext() && w0Var2.hasNext()) {
            int compareTo = Integer.valueOf(w0Var.zza() & 255).compareTo(Integer.valueOf(w0Var2.zza() & 255));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return Integer.valueOf(g1Var.mo15875f()).compareTo(Integer.valueOf(g1Var2.mo15875f()));
    }
}
