package com.google.android.gms.internal.p026firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4240a;
import p040e5.C4243c;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.ko */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3480ko extends C4240a {
    public static final Parcelable.Creator<C3480ko> CREATOR = new C3513lo();

    /* renamed from: a */
    private final String f22300a;

    /* renamed from: b */
    private final String f22301b;

    /* renamed from: c */
    private final String f22302c;

    public C3480ko(String str, String str2, String str3) {
        this.f22300a = str;
        this.f22301b = str2;
        this.f22302c = str3;
    }

    /* renamed from: I1 */
    public final String mo16266I1() {
        return this.f22301b;
    }

    /* renamed from: J1 */
    public final String mo16267J1() {
        return this.f22302c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28620q(parcel, 1, this.f22300a, false);
        C4243c.m28620q(parcel, 2, this.f22301b, false);
        C4243c.m28620q(parcel, 3, this.f22302c, false);
        C4243c.m28605b(parcel, a);
    }

    public final String zza() {
        return this.f22300a;
    }
}
