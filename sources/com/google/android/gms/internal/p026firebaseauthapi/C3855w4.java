package com.google.android.gms.internal.p026firebaseauthapi;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.w4 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3855w4 implements Iterator {

    /* renamed from: a */
    final Iterator f22860a;

    /* renamed from: b */
    final /* synthetic */ C3887x4 f22861b;

    C3855w4(C3887x4 x4Var) {
        this.f22861b = x4Var;
        this.f22860a = x4Var.f22904a.iterator();
    }

    public final boolean hasNext() {
        return this.f22860a.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f22860a.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
