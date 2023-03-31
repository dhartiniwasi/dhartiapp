package com.google.android.gms.internal.p026firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4240a;
import p040e5.C4243c;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.eo */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3282eo extends C4240a {
    public static final Parcelable.Creator<C3282eo> CREATOR = new C3315fo();

    /* renamed from: a */
    private final String f22000a;

    public C3282eo(String str) {
        this.f22000a = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28620q(parcel, 1, this.f22000a, false);
        C4243c.m28605b(parcel, a);
    }

    public final String zza() {
        return this.f22000a;
    }
}
