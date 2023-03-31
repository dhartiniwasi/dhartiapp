package com.google.android.gms.internal.p026firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4240a;
import p040e5.C4243c;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.xm */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3905xm extends C4240a {
    public static final Parcelable.Creator<C3905xm> CREATOR = new C3937ym();

    /* renamed from: a */
    private final String f22922a;

    /* renamed from: b */
    private final String f22923b;

    public C3905xm(String str, String str2) {
        this.f22922a = str;
        this.f22923b = str2;
    }

    /* renamed from: I1 */
    public final String mo17054I1() {
        return this.f22923b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28620q(parcel, 1, this.f22922a, false);
        C4243c.m28620q(parcel, 2, this.f22923b, false);
        C4243c.m28605b(parcel, a);
    }

    public final String zza() {
        return this.f22922a;
    }
}
