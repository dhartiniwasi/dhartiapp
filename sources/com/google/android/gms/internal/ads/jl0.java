package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4240a;
import p040e5.C4243c;
import p060h4.C4541l4;
import p060h4.C4571q4;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class jl0 extends C4240a {
    public static final Parcelable.Creator<jl0> CREATOR = new kl0();
    @Deprecated

    /* renamed from: a */
    public final String f11684a;

    /* renamed from: b */
    public final String f11685b;
    @Deprecated

    /* renamed from: c */
    public final C4571q4 f11686c;

    /* renamed from: d */
    public final C4541l4 f11687d;

    public jl0(String str, String str2, C4571q4 q4Var, C4541l4 l4Var) {
        this.f11684a = str;
        this.f11685b = str2;
        this.f11686c = q4Var;
        this.f11687d = l4Var;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28620q(parcel, 1, this.f11684a, false);
        C4243c.m28620q(parcel, 2, this.f11685b, false);
        C4243c.m28619p(parcel, 3, this.f11686c, i, false);
        C4243c.m28619p(parcel, 4, this.f11687d, i, false);
        C4243c.m28605b(parcel, a);
    }
}
