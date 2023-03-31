package com.google.android.gms.internal.p026firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4240a;
import p040e5.C4243c;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.wn */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3874wn extends C4240a {
    public static final Parcelable.Creator<C3874wn> CREATOR = new C3906xn();

    /* renamed from: a */
    private final String f22885a;

    public C3874wn(String str) {
        this.f22885a = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28620q(parcel, 1, this.f22885a, false);
        C4243c.m28605b(parcel, a);
    }

    public final String zza() {
        return this.f22885a;
    }
}
