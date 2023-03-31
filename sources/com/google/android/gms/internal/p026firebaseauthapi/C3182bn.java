package com.google.android.gms.internal.p026firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4240a;
import p040e5.C4243c;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.bn */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3182bn extends C4240a {
    public static final Parcelable.Creator<C3182bn> CREATOR = new C3215cn();

    /* renamed from: a */
    private final String f21781a;

    /* renamed from: b */
    private final String f21782b;

    /* renamed from: c */
    private final String f21783c;

    public C3182bn(String str, String str2, String str3) {
        this.f21781a = str;
        this.f21782b = str2;
        this.f21783c = str3;
    }

    /* renamed from: I1 */
    public final String mo15809I1() {
        return this.f21782b;
    }

    /* renamed from: J1 */
    public final String mo15810J1() {
        return this.f21783c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28620q(parcel, 1, this.f21781a, false);
        C4243c.m28620q(parcel, 2, this.f21782b, false);
        C4243c.m28620q(parcel, 3, this.f21783c, false);
        C4243c.m28605b(parcel, a);
    }

    public final String zza() {
        return this.f21781a;
    }
}
