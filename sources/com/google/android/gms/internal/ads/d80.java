package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4240a;
import p040e5.C4243c;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class d80 extends C4240a {
    public static final Parcelable.Creator<d80> CREATOR = new e80();

    /* renamed from: a */
    public final String f8131a;

    /* renamed from: b */
    public final Bundle f8132b;

    public d80(String str, Bundle bundle) {
        this.f8131a = str;
        this.f8132b = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28620q(parcel, 1, this.f8131a, false);
        C4243c.m28608e(parcel, 2, this.f8132b, false);
        C4243c.m28605b(parcel, a);
    }
}
