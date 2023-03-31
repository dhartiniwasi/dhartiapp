package com.google.android.gms.internal.p026firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.C7814j;
import p040e5.C4240a;
import p040e5.C4243c;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.mo */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3546mo extends C4240a {
    public static final Parcelable.Creator<C3546mo> CREATOR = new C3579no();

    /* renamed from: a */
    private final C7814j f22376a;

    public C3546mo(C7814j jVar) {
        this.f22376a = jVar;
    }

    /* renamed from: I1 */
    public final C7814j mo16400I1() {
        return this.f22376a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28619p(parcel, 1, this.f22376a, i, false);
        C4243c.m28605b(parcel, a);
    }
}
