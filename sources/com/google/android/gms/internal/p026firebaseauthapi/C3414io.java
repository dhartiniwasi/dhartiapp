package com.google.android.gms.internal.p026firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4240a;
import p040e5.C4243c;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.io */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3414io extends C4240a {
    public static final Parcelable.Creator<C3414io> CREATOR = new C3447jo();

    /* renamed from: a */
    private final String f22170a;

    /* renamed from: b */
    private final String f22171b;

    public C3414io(String str, String str2) {
        this.f22170a = str;
        this.f22171b = str2;
    }

    /* renamed from: I1 */
    public final String mo16189I1() {
        return this.f22170a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28620q(parcel, 1, this.f22170a, false);
        C4243c.m28620q(parcel, 2, this.f22171b, false);
        C4243c.m28605b(parcel, a);
    }

    public final String zza() {
        return this.f22171b;
    }
}
