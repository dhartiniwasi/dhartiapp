package com.google.android.gms.internal.p026firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4240a;
import p040e5.C4243c;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.dn */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3248dn extends C4240a {
    public static final Parcelable.Creator<C3248dn> CREATOR = new C3281en();

    /* renamed from: a */
    private final String f21948a;

    /* renamed from: b */
    private final String f21949b;

    /* renamed from: c */
    private final String f21950c;

    public C3248dn(String str, String str2, String str3) {
        this.f21948a = str;
        this.f21949b = str2;
        this.f21950c = str3;
    }

    /* renamed from: I1 */
    public final String mo15962I1() {
        return this.f21949b;
    }

    /* renamed from: J1 */
    public final String mo15963J1() {
        return this.f21950c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28620q(parcel, 1, this.f21948a, false);
        C4243c.m28620q(parcel, 2, this.f21949b, false);
        C4243c.m28620q(parcel, 3, this.f21950c, false);
        C4243c.m28605b(parcel, a);
    }

    public final String zza() {
        return this.f21948a;
    }
}
