package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import p040e5.C4240a;
import p040e5.C4243c;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class lg0 extends C4240a {
    public static final Parcelable.Creator<lg0> CREATOR = new mg0();

    /* renamed from: a */
    public final boolean f12788a;

    /* renamed from: b */
    public final List f12789b;

    public lg0(boolean z, List list) {
        this.f12788a = z;
        this.f12789b = list;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28606c(parcel, 2, this.f12788a);
        C4243c.m28622s(parcel, 3, this.f12789b, false);
        C4243c.m28605b(parcel, a);
    }
}
