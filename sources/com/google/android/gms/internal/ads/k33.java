package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4240a;
import p040e5.C4243c;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class k33 extends C4240a {
    public static final Parcelable.Creator<k33> CREATOR = new l33();

    /* renamed from: a */
    public final int f11893a;

    /* renamed from: b */
    public final byte[] f11894b;

    k33(int i, byte[] bArr) {
        this.f11893a = i;
        this.f11894b = bArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28614k(parcel, 1, this.f11893a);
        C4243c.m28609f(parcel, 2, this.f11894b, false);
        C4243c.m28605b(parcel, a);
    }

    public k33(byte[] bArr) {
        this(1, bArr);
    }
}
