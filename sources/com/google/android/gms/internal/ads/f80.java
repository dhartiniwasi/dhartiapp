package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.AdError;
import p040e5.C4240a;
import p040e5.C4243c;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class f80 extends C4240a {
    public static final Parcelable.Creator<f80> CREATOR = new g80();

    /* renamed from: a */
    public final int f9182a;

    /* renamed from: b */
    public final int f9183b;

    /* renamed from: c */
    public final String f9184c;

    /* renamed from: d */
    public final int f9185d;

    public f80(int i, int i2, String str, int i3) {
        this.f9182a = i;
        this.f9183b = i2;
        this.f9184c = str;
        this.f9185d = i3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28614k(parcel, 1, this.f9183b);
        C4243c.m28620q(parcel, 2, this.f9184c, false);
        C4243c.m28614k(parcel, 3, this.f9185d);
        C4243c.m28614k(parcel, AdError.NETWORK_ERROR_CODE, this.f9182a);
        C4243c.m28605b(parcel, a);
    }
}
