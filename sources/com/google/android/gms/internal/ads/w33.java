package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4240a;
import p040e5.C4243c;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class w33 extends C4240a {
    public static final Parcelable.Creator<w33> CREATOR = new x33();

    /* renamed from: a */
    public final int f19456a;

    /* renamed from: b */
    public final int f19457b;

    /* renamed from: c */
    public final String f19458c;

    /* renamed from: d */
    public final String f19459d;

    /* renamed from: e */
    public final int f19460e;

    w33(int i, int i2, int i3, String str, String str2) {
        this.f19456a = i;
        this.f19457b = i2;
        this.f19458c = str;
        this.f19459d = str2;
        this.f19460e = i3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28614k(parcel, 1, this.f19456a);
        C4243c.m28614k(parcel, 2, this.f19457b);
        C4243c.m28620q(parcel, 3, this.f19458c, false);
        C4243c.m28620q(parcel, 4, this.f19459d, false);
        C4243c.m28614k(parcel, 5, this.f19460e);
        C4243c.m28605b(parcel, a);
    }

    public w33(int i, int i2, String str, String str2) {
        this(1, 1, i2 - 1, str, str2);
    }
}
