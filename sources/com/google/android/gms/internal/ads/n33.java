package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4240a;
import p040e5.C4243c;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class n33 extends C4240a {
    public static final Parcelable.Creator<n33> CREATOR = new o33();

    /* renamed from: a */
    public final int f13836a;

    /* renamed from: b */
    public final String f13837b;

    /* renamed from: c */
    public final String f13838c;

    n33(int i, String str, String str2) {
        this.f13836a = i;
        this.f13837b = str;
        this.f13838c = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28614k(parcel, 1, this.f13836a);
        C4243c.m28620q(parcel, 2, this.f13837b, false);
        C4243c.m28620q(parcel, 3, this.f13838c, false);
        C4243c.m28605b(parcel, a);
    }

    public n33(String str, String str2) {
        this(1, str, str2);
    }
}
