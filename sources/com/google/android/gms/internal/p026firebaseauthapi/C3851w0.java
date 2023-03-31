package com.google.android.gms.internal.p026firebaseauthapi;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.w0 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3851w0 extends C3915y0 {

    /* renamed from: a */
    private int f22852a = 0;

    /* renamed from: b */
    private final int f22853b;

    /* renamed from: c */
    final /* synthetic */ C3325g1 f22854c;

    C3851w0(C3325g1 g1Var) {
        this.f22854c = g1Var;
        this.f22853b = g1Var.mo15875f();
    }

    public final boolean hasNext() {
        return this.f22852a < this.f22853b;
    }

    public final byte zza() {
        int i = this.f22852a;
        if (i < this.f22853b) {
            this.f22852a = i + 1;
            return this.f22854c.mo15873c(i);
        }
        throw new NoSuchElementException();
    }
}
