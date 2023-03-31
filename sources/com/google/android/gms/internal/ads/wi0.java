package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4240a;
import p040e5.C4243c;
import p129r4.C5458e;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class wi0 extends C4240a {
    public static final Parcelable.Creator<wi0> CREATOR = new yi0();

    /* renamed from: a */
    public final String f19637a;

    /* renamed from: b */
    public final String f19638b;

    public wi0(C5458e eVar) {
        this(eVar.mo19757b(), eVar.mo19756a());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28620q(parcel, 1, this.f19637a, false);
        C4243c.m28620q(parcel, 2, this.f19638b, false);
        C4243c.m28605b(parcel, a);
    }

    public wi0(String str, String str2) {
        this.f19637a = str;
        this.f19638b = str2;
    }
}
