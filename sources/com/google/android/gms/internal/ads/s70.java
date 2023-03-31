package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4240a;
import p040e5.C4243c;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class s70 extends C4240a {
    public static final Parcelable.Creator<s70> CREATOR = new t70();

    /* renamed from: a */
    public final String f17285a;

    /* renamed from: b */
    public final boolean f17286b;

    /* renamed from: c */
    public final int f17287c;

    /* renamed from: d */
    public final String f17288d;

    public s70(String str, boolean z, int i, String str2) {
        this.f17285a = str;
        this.f17286b = z;
        this.f17287c = i;
        this.f17288d = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28620q(parcel, 1, this.f17285a, false);
        C4243c.m28606c(parcel, 2, this.f17286b);
        C4243c.m28614k(parcel, 3, this.f17287c);
        C4243c.m28620q(parcel, 4, this.f17288d, false);
        C4243c.m28605b(parcel, a);
    }
}
