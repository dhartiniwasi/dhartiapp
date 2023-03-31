package com.google.android.gms.internal.p026firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4240a;
import p040e5.C4243c;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zm */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3969zm extends C4240a {
    public static final Parcelable.Creator<C3969zm> CREATOR = new C3149an();

    /* renamed from: a */
    private final String f22988a;

    /* renamed from: b */
    private final String f22989b;

    public C3969zm(String str, String str2) {
        this.f22988a = str;
        this.f22989b = str2;
    }

    /* renamed from: I1 */
    public final String mo17120I1() {
        return this.f22989b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28620q(parcel, 1, this.f22988a, false);
        C4243c.m28620q(parcel, 2, this.f22989b, false);
        C4243c.m28605b(parcel, a);
    }

    public final String zza() {
        return this.f22988a;
    }
}
