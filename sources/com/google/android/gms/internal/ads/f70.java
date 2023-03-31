package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4240a;
import p040e5.C4243c;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class f70 extends C4240a {
    public static final Parcelable.Creator<f70> CREATOR = new g70();

    /* renamed from: a */
    public final String f9149a;

    /* renamed from: b */
    public final String[] f9150b;

    /* renamed from: c */
    public final String[] f9151c;

    f70(String str, String[] strArr, String[] strArr2) {
        this.f9149a = str;
        this.f9150b = strArr;
        this.f9151c = strArr2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28620q(parcel, 1, this.f9149a, false);
        C4243c.m28621r(parcel, 2, this.f9150b, false);
        C4243c.m28621r(parcel, 3, this.f9151c, false);
        C4243c.m28605b(parcel, a);
    }
}
