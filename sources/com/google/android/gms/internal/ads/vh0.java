package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4240a;
import p040e5.C4243c;
import p060h4.C4541l4;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class vh0 extends C4240a {
    public static final Parcelable.Creator<vh0> CREATOR = new xh0();

    /* renamed from: a */
    public final C4541l4 f19093a;

    /* renamed from: b */
    public final String f19094b;

    public vh0(C4541l4 l4Var, String str) {
        this.f19093a = l4Var;
        this.f19094b = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28619p(parcel, 2, this.f19093a, i, false);
        C4243c.m28620q(parcel, 3, this.f19094b, false);
        C4243c.m28605b(parcel, a);
    }
}
