package com.google.android.gms.internal.p026firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4240a;
import p040e5.C4243c;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.go */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3348go extends C4240a {
    public static final Parcelable.Creator<C3348go> CREATOR = new C3381ho();

    /* renamed from: a */
    private final C3126a0 f22075a;

    public C3348go(C3126a0 a0Var) {
        this.f22075a = a0Var;
    }

    /* renamed from: I1 */
    public final C3126a0 mo16087I1() {
        return this.f22075a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28619p(parcel, 1, this.f22075a, i, false);
        C4243c.m28605b(parcel, a);
    }
}
