package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import p040e5.C4241b;
import p060h4.C4541l4;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class xh0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C4241b.m28602y(parcel);
        C4541l4 l4Var = null;
        String str = null;
        while (parcel.dataPosition() < y) {
            int r = C4241b.m28595r(parcel);
            int l = C4241b.m28589l(r);
            if (l == 2) {
                l4Var = (C4541l4) C4241b.m28582e(parcel, r, C4541l4.CREATOR);
            } else if (l != 3) {
                C4241b.m28601x(parcel, r);
            } else {
                str = C4241b.m28583f(parcel, r);
            }
        }
        C4241b.m28588k(parcel, y);
        return new vh0(l4Var, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new vh0[i];
    }
}
