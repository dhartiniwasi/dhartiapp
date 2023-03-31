package com.google.android.gms.internal.p026firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4240a;
import p040e5.C4243c;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.fn */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3314fn extends C4240a {
    public static final Parcelable.Creator<C3314fn> CREATOR = new C3347gn();

    /* renamed from: a */
    private final String f22035a;

    public C3314fn(String str) {
        this.f22035a = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28620q(parcel, 1, this.f22035a, false);
        C4243c.m28605b(parcel, a);
    }

    public final String zza() {
        return this.f22035a;
    }
}
