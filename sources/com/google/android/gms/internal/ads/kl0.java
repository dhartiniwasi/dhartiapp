package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4241b;
import p060h4.C4541l4;
import p060h4.C4571q4;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class kl0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C4241b.m28602y(parcel);
        String str = null;
        String str2 = null;
        C4571q4 q4Var = null;
        C4541l4 l4Var = null;
        while (parcel.dataPosition() < y) {
            int r = C4241b.m28595r(parcel);
            int l = C4241b.m28589l(r);
            if (l == 1) {
                str = C4241b.m28583f(parcel, r);
            } else if (l == 2) {
                str2 = C4241b.m28583f(parcel, r);
            } else if (l == 3) {
                q4Var = (C4571q4) C4241b.m28582e(parcel, r, C4571q4.CREATOR);
            } else if (l != 4) {
                C4241b.m28601x(parcel, r);
            } else {
                l4Var = (C4541l4) C4241b.m28582e(parcel, r, C4541l4.CREATOR);
            }
        }
        C4241b.m28588k(parcel, y);
        return new jl0(str, str2, q4Var, l4Var);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new jl0[i];
    }
}
